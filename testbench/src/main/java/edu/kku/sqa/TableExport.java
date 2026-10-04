package edu.kku.sqa;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/** Plain tables written as CSV (UTF-8 with BOM so Excel reads Thai text) or as a minimal .xlsx workbook. */
public final class TableExport {
    private TableExport() { }

    public static final class Table {
        public final String name;
        public final List<String> headers;
        public final List<List<Object>> rows = new ArrayList<>();
        public Table(String name, List<String> headers) { this.name = name; this.headers = headers; }

        /** Columns are the union of the keys of all maps, in order of first appearance; missing values stay empty. */
        public static Table fromMaps(String name, List<Map<String, Object>> maps) {
            Set<String> keys = new LinkedHashSet<>();
            for (Map<String, Object> map : maps) keys.addAll(map.keySet());
            Table table = new Table(name, new ArrayList<>(keys));
            for (Map<String, Object> map : maps) {
                List<Object> row = new ArrayList<>();
                for (String key : table.headers) row.add(map.get(key));
                table.rows.add(row);
            }
            return table;
        }
    }

    /** A value as shown in a cell: lists are joined, doubles rounded to 4 decimals, null is empty. */
    static String text(Object value) {
        if (value == null) return "";
        if (value instanceof Double || value instanceof Float) {
            double d = ((Number) value).doubleValue();
            if (Double.isNaN(d) || Double.isInfinite(d)) return "";
            return new BigDecimal(d).setScale(4, RoundingMode.HALF_UP).stripTrailingZeros().toPlainString();
        }
        if (value instanceof List) {
            StringBuilder joined = new StringBuilder();
            for (Object item : (List<?>) value) {
                if (joined.length() > 0) joined.append("; ");
                joined.append(item instanceof Map ? mapText((Map<?, ?>) item) : text(item));
            }
            return joined.toString();
        }
        if (value instanceof Map) return mapText((Map<?, ?>) value);
        return String.valueOf(value);
    }

    private static String mapText(Map<?, ?> map) {
        StringBuilder out = new StringBuilder();
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            if (entry.getValue() == null || String.valueOf(entry.getValue()).isEmpty()) continue;
            if (out.length() > 0) out.append(" · ");
            out.append(text(entry.getValue()));
        }
        return out.toString();
    }

    private static boolean isNumber(Object value) {
        if (!(value instanceof Number)) return false;
        double d = ((Number) value).doubleValue();
        return !Double.isNaN(d) && !Double.isInfinite(d);
    }

    public static byte[] csv(Table table) {
        StringBuilder out = new StringBuilder("﻿");
        appendCsvRow(out, new ArrayList<Object>(table.headers));
        for (List<Object> row : table.rows) appendCsvRow(out, row);
        return out.toString().getBytes(StandardCharsets.UTF_8);
    }

    private static void appendCsvRow(StringBuilder out, List<Object> row) {
        for (int i = 0; i < row.size(); i++) {
            if (i > 0) out.append(',');
            String cell = text(row.get(i));
            if (cell.contains(",") || cell.contains("\"") || cell.contains("\n") || cell.contains("\r"))
                cell = "\"" + cell.replace("\"", "\"\"") + "\"";
            out.append(cell);
        }
        out.append("\r\n");
    }

    public static byte[] xlsx(List<Table> tables) throws IOException {
        ByteArrayOutputStream bytes = new ByteArrayOutputStream();
        try (ZipOutputStream zip = new ZipOutputStream(bytes, StandardCharsets.UTF_8)) {
            StringBuilder types = new StringBuilder("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>"
                    + "<Types xmlns=\"http://schemas.openxmlformats.org/package/2006/content-types\">"
                    + "<Default Extension=\"rels\" ContentType=\"application/vnd.openxmlformats-package.relationships+xml\"/>"
                    + "<Default Extension=\"xml\" ContentType=\"application/xml\"/>"
                    + "<Override PartName=\"/xl/workbook.xml\" ContentType=\"application/vnd.openxmlformats-officedocument.spreadsheetml.sheet.main+xml\"/>");
            StringBuilder sheets = new StringBuilder(), relations = new StringBuilder();
            for (int i = 0; i < tables.size(); i++) {
                int n = i + 1;
                types.append("<Override PartName=\"/xl/worksheets/sheet").append(n)
                        .append(".xml\" ContentType=\"application/vnd.openxmlformats-officedocument.spreadsheetml.worksheet+xml\"/>");
                sheets.append("<sheet name=\"").append(xml(sheetName(tables.get(i).name))).append("\" sheetId=\"").append(n)
                        .append("\" r:id=\"rId").append(n).append("\"/>");
                relations.append("<Relationship Id=\"rId").append(n)
                        .append("\" Type=\"http://schemas.openxmlformats.org/officeDocument/2006/relationships/worksheet\" Target=\"worksheets/sheet")
                        .append(n).append(".xml\"/>");
            }
            types.append("</Types>");
            put(zip, "[Content_Types].xml", types.toString());
            put(zip, "_rels/.rels", "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>"
                    + "<Relationships xmlns=\"http://schemas.openxmlformats.org/package/2006/relationships\">"
                    + "<Relationship Id=\"rId1\" Type=\"http://schemas.openxmlformats.org/officeDocument/2006/relationships/officeDocument\" Target=\"xl/workbook.xml\"/></Relationships>");
            put(zip, "xl/workbook.xml", "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>"
                    + "<workbook xmlns=\"http://schemas.openxmlformats.org/spreadsheetml/2006/main\" "
                    + "xmlns:r=\"http://schemas.openxmlformats.org/officeDocument/2006/relationships\"><sheets>" + sheets + "</sheets></workbook>");
            put(zip, "xl/_rels/workbook.xml.rels", "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>"
                    + "<Relationships xmlns=\"http://schemas.openxmlformats.org/package/2006/relationships\">" + relations + "</Relationships>");
            for (int i = 0; i < tables.size(); i++) put(zip, "xl/worksheets/sheet" + (i + 1) + ".xml", sheet(tables.get(i)));
        }
        return bytes.toByteArray();
    }

    private static String sheet(Table table) {
        StringBuilder out = new StringBuilder("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>"
                + "<worksheet xmlns=\"http://schemas.openxmlformats.org/spreadsheetml/2006/main\"><sheetData>");
        List<Object> header = new ArrayList<Object>(table.headers);
        appendRow(out, 1, header);
        int rowNumber = 2;
        for (List<Object> row : table.rows) appendRow(out, rowNumber++, row);
        return out.append("</sheetData></worksheet>").toString();
    }

    private static void appendRow(StringBuilder out, int rowNumber, List<Object> row) {
        out.append("<row r=\"").append(rowNumber).append("\">");
        for (int i = 0; i < row.size(); i++) {
            String reference = column(i) + rowNumber;
            Object value = row.get(i);
            if (value == null || (value instanceof String && ((String) value).isEmpty())) continue;
            if (isNumber(value)) {
                out.append("<c r=\"").append(reference).append("\"><v>").append(text(value)).append("</v></c>");
            } else {
                out.append("<c r=\"").append(reference).append("\" t=\"inlineStr\"><is><t xml:space=\"preserve\">")
                        .append(xml(text(value))).append("</t></is></c>");
            }
        }
        out.append("</row>");
    }

    /** 0 -> A, 25 -> Z, 26 -> AA ... */
    static String column(int index) {
        StringBuilder name = new StringBuilder();
        for (int n = index; n >= 0; n = n / 26 - 1) name.insert(0, (char) ('A' + n % 26));
        return name.toString();
    }

    private static String sheetName(String name) {
        String clean = name.replaceAll("[\\\\/?*\\[\\]:]", "-");
        return clean.length() > 31 ? clean.substring(0, 31) : clean;
    }

    /** Escapes XML and drops characters XML 1.0 cannot carry. */
    private static String xml(String value) {
        StringBuilder out = new StringBuilder();
        for (int i = 0; i < value.length(); i++) {
            char c = value.charAt(i);
            if (c == 0x9 || c == 0xA || c == 0xD || (c >= 0x20 && c <= 0xD7FF) || (c >= 0xE000 && c <= 0xFFFD)) {
                switch (c) {
                    case '&': out.append("&amp;"); break;
                    case '<': out.append("&lt;"); break;
                    case '>': out.append("&gt;"); break;
                    case '"': out.append("&quot;"); break;
                    default: out.append(c);
                }
            } else if (Character.isHighSurrogate(c) && i + 1 < value.length() && Character.isLowSurrogate(value.charAt(i + 1))) {
                out.append(c).append(value.charAt(++i));
            }
        }
        return out.toString();
    }

    private static void put(ZipOutputStream zip, String name, String content) throws IOException {
        zip.putNextEntry(new ZipEntry(name));
        zip.write(content.getBytes(StandardCharsets.UTF_8));
        zip.closeEntry();
    }
}
