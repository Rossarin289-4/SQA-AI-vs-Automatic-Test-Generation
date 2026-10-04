package com.fasterxml.jackson.core.util;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter;

public class DefaultPrettyPrinterTest {

    // Helper to create a dummy JsonGenerator for testing output.
    // Removed abstract methods and added BigDecimal/BigInteger support.
    private static abstract class BaseTestJsonGenerator extends JsonGenerator {
        public StringBuilder output = new StringBuilder();
        public int indentLevel = 0;

        @Override
        public abstract JsonStreamContext getParsingContext();

        @Override
        public void writeRaw(String text) throws IOException {
            output.append(text);
        }

        @Override
        public void writeRaw(char c) throws IOException {
            output.append(c);
        }

        @Override
        public void writeRaw(char[] c, int offset, int len) throws IOException {
            output.append(c, offset, len);
        }

        @Override
        public void writeStartObject() throws IOException {
            output.append("{");
        }

        @Override
        public void writeEndObject() throws IOException {
            output.append("}");
        }

        @Override
        public void writeStartArray() throws IOException {
            output.append("[");
        }

        @Override
        public void writeEndArray() throws IOException {
            output.append("]");
        }

        @Override
        public void writeFieldName(String name) throws IOException {
            output.append("\"").append(name).append("\":");
        }

        @Override
        public void writeString(String text) throws IOException {
            output.append("\"").append(text).append("\"");
        }

        @Override
        public void writeNumber(String encodedNumber) throws IOException {
            output.append(encodedNumber);
        }

        @Override
        public void writeNumber(int i) throws IOException {
            output.append(i);
        }

        @Override
        public void writeNumber(long l) throws IOException {
            output.append(l);
        }

        @Override
        public void writeNumber(double d) throws IOException {
            output.append(d);
        }

        @Override
        public void writeNumber(float f) throws IOException {
            output.append(f);
        }

        @Override
        public void writeBoolean(boolean b) throws IOException {
            output.append(b);
        }

        @Override
        public void writeNull() throws IOException {
            output.append("null");
        }

        @Override
        public void flush() throws IOException {
        }

        @Override
        public void close() throws IOException {
        }

        @Override
        public JsonGenerator setPrettyPrinter(PrettyPrinter pp) {
            return this;
        }

        @Override
        public PrettyPrinter getPrettyPrinter() {
            return null;
        }

        @Override
        public void writeStartObject(Object forValue) throws IOException {
            writeStartObject();
        }

        @Override
        public void writeStartArray(Object forValue) throws IOException {
            writeStartArray();
        }

        @Override
        public void writeObjectRef(String name) throws IOException {
            output.append("<<REF: ").append(name).append(">>");
        }

        @Override
        public void writeTypeId(String typeId) throws IOException {
            output.append("<<TYPE: ").append(typeId).append(">>");
        }

        @Override
        public void writeRawValue(String text) throws IOException {
            writeRaw(text);
        }

        @Override
        public void writeRawValue(char[] c, int offset, int len) throws IOException {
            writeRaw(c, offset, len);
        }

        @Override
        public void writeNumber(short v) throws IOException {
            output.append(v);
        }

        @Override
        public void writeNumber(byte v) throws IOException {
            output.append(v);
        }

        @Override
        public void writeNumber(BigDecimal v) throws IOException {
            output.append(v.toPlainString());
        }

        @Override
        public void writeNumber(BigInteger v) throws IOException {
            output.append(v.toString());
        }

        @Override
        public void writeString(char[] text, int offset, int len) throws IOException {
            output.append('"');
            output.append(text, offset, len);
            output.append('"');
        }

        @Override
        public void writeString(char[] text) throws IOException {
            output.append('"');
            output.append(text);
            output.append('"');
        }

        @Override
        public void writeBinary(byte[] data) throws IOException {
            output.append("[BINARY]");
        }

        @Override
        public void writeBinary(Base64Variant b64variant, byte[] data, int offset, int len) throws IOException {
            output.append("[BINARY]");
        }

        @Override
        public void writeEmbeddedObject(Object obj) throws IOException {
            output.append("<<EMBEDDED: ").append(obj.getClass().getName()).append(">>");
        }

        @Override
        public void writeOmittedFields() throws IOException {
            output.append("<<OMITTED>>");
        }

        @Override
        public void writeArrayStart() throws IOException {
            writeStartArray();
        }

        @Override
        public void writeObjectEntrySeparator() throws IOException {
            output.append(",");
        }

        @Override
        public void writeArrayValueSeparator() throws IOException {
            output.append(",");
        }

        @Override
        public void writeObjectFieldValueSeparator() throws IOException {
            output.append(":");
        }
        
        @Override
        public void copyEvent(JsonGenerator to) throws IOException {
            // no-op
        }

        @Override
        public void writeTypeId(Object value) throws IOException {
            // no-op
        }
        
        // This method is required by JsonGenerator but not always used in tests
        @Override
        public boolean isClosed() {
            return false;
        }

        // This method is required by JsonGenerator but not always used in tests
        @Override
        public JsonStreamContext getOutputContext() {
             return null;
        }
    }

    // Concrete implementation for testing
    private static class TestJsonGenerator extends BaseTestJsonGenerator {
        @Override
        public JsonStreamContext getParsingContext() {
            return null; // Not used in these tests
        }
    }

    // Test for default constructor and root separator
    @Test
    public void testDefaultConstructor() throws Exception {
        DefaultPrettyPrinter printer = new DefaultPrettyPrinter();
        TestJsonGenerator g = new TestJsonGenerator();
        printer.writeRootValueSeparator(g);
        assertEquals(" ", g.output.toString());
    }

    // Test for constructor with null root separator
    @Test
    public void testConstructorWithNullRootSeparator() throws Exception {
        DefaultPrettyPrinter printer = new DefaultPrettyPrinter((String) null);
        TestJsonGenerator g = new TestJsonGenerator();
        printer.writeRootValueSeparator(g);
        assertEquals("", g.output.toString());
    }

    // Test for constructor with empty string root separator
    @Test
    public void testConstructorWithEmptyStringRootSeparator() throws Exception {
        DefaultPrettyPrinter printer = new DefaultPrettyPrinter("");
        TestJsonGenerator g = new TestJsonGenerator();
        printer.writeRootValueSeparator(g);
        assertEquals("", g.output.toString());
    }

    // Test for constructor with custom string root separator
    @Test
    public void testConstructorWithCustomStringRootSeparator() throws Exception {
        DefaultPrettyPrinter printer = new DefaultPrettyPrinter("|||");
        TestJsonGenerator g = new TestJsonGenerator();
        printer.writeRootValueSeparator(g);
        assertEquals("|||", g.output.toString());
    }

    // Test for constructor with SerializableString root separator
    @Test
    public void testConstructorWithSerializableStringRootSeparator() throws Exception {
        SerializedString ss = new SerializedString("---");
        DefaultPrettyPrinter printer = new DefaultPrettyPrinter(ss);
        TestJsonGenerator g = new TestJsonGenerator();
        printer.writeRootValueSeparator(g);
        assertEquals("---", g.output.toString());
    }

    // Test withRootSeparator(SerializableString) for null
    @Test
    public void testWithRootSeparatorSerializableNull() throws Exception {
        DefaultPrettyPrinter printer = new DefaultPrettyPrinter();
        DefaultPrettyPrinter newPrinter = printer.withRootSeparator((SerializableString) null);
        TestJsonGenerator g = new TestJsonGenerator();
        newPrinter.writeRootValueSeparator(g);
        assertEquals("", g.output.toString());
    }

    // Test withRootSeparator(SerializableString) for same value
    @Test
    public void testWithRootSeparatorSerializableSame() throws Exception {
        DefaultPrettyPrinter printer = new DefaultPrettyPrinter("ABC");
        DefaultPrettyPrinter newPrinter = printer.withRootSeparator(new SerializedString("ABC"));
        assertSame(printer, newPrinter); // Should return the same instance if value is same
    }

    // Test withRootSeparator(SerializableString) for different value
    @Test
    public void testWithRootSeparatorSerializableDifferent() throws Exception {
        DefaultPrettyPrinter printer = new DefaultPrettyPrinter("ABC");
        DefaultPrettyPrinter newPrinter = printer.withRootSeparator(new SerializedString("DEF"));
        TestJsonGenerator g = new TestJsonGenerator();
        newPrinter.writeRootValueSeparator(g);
        assertEquals("DEF", g.output.toString());
    }

    // Test withRootSeparator(String) for null
    @Test
    public void testWithRootSeparatorStringNull() throws Exception {
        DefaultPrettyPrinter printer = new DefaultPrettyPrinter("ABC");
        DefaultPrettyPrinter newPrinter = printer.withRootSeparator((String) null);
        TestJsonGenerator g = new TestJsonGenerator();
        newPrinter.writeRootValueSeparator(g);
        assertEquals("", g.output.toString());
    }

    // Test withRootSeparator(String) for empty string
    @Test
    public void testWithRootSeparatorStringEmpty() throws Exception {
        DefaultPrettyPrinter printer = new DefaultPrettyPrinter("ABC");
        DefaultPrettyPrinter newPrinter = printer.withRootSeparator("");
        TestJsonGenerator g = new TestJsonGenerator();
        newPrinter.writeRootValueSeparator(g);
        assertEquals("", g.output.toString());
    }

    // Test withRootSeparator(String) for custom string
    @Test
    public void testWithRootSeparatorStringCustom() throws Exception {
        DefaultPrettyPrinter printer = new DefaultPrettyPrinter("ABC");
        DefaultPrettyPrinter newPrinter = printer.withRootSeparator("XYZ");
        TestJsonGenerator g = new TestJsonGenerator();
        newPrinter.writeRootValueSeparator(g);
        assertEquals("XYZ", g.output.toString());
    }

    // Test indentArraysWith and beforeArrayValues (default behavior)
    @Test
    public void testDefaultArrayIndenter() throws Exception {
        DefaultPrettyPrinter printer = new DefaultPrettyPrinter();
        TestJsonGenerator g = new TestJsonGenerator();
        printer.writeStartArray(g); // [
        printer.beforeArrayValues(g);
        // Default FixedSpaceIndenter adds a space
        assertEquals("[ ", g.output.toString());
        printer.writeArrayValueSeparator(g);
        // Default FixedSpaceIndenter adds a space after comma
        assertEquals("[ , ", g.output.toString());
        printer.writeEndArray(g, 1);
        assertEquals("[ ,  ]", g.output.toString());
    }

    // Test indentArraysWith and beforeArrayValues with NopIndenter
    @Test
    public void testNopIndenterForArrays() throws Exception {
        DefaultPrettyPrinter printer = new DefaultPrettyPrinter();
        printer.indentArraysWith(DefaultPrettyPrinter.NopIndenter.instance);
        TestJsonGenerator g = new TestJsonGenerator();
        printer.writeStartArray(g); // [
        printer.beforeArrayValues(g);
        assertEquals("[", g.output.toString());
        printer.writeArrayValueSeparator(g);
        assertEquals("[," , g.output.toString());
        printer.writeEndArray(g, 1);
        assertEquals("[,]", g.output.toString());
    }

    // Test indentObjectsWith and beforeObjectEntries (default behavior)
    @Test
    public void testDefaultObjectIndenter() throws Exception {
        DefaultPrettyPrinter printer = new DefaultPrettyPrinter();
        TestJsonGenerator g = new TestJsonGenerator();
        printer.writeStartObject(g); // {
        printer.beforeObjectEntries(g);
        // Default Indenter adds indentation and newline
        // DefaultIndenter.SYSTEM_LINEFEED_INSTANCE uses 2 spaces and system linefeed
        String lineFeed = System.getProperty("line.separator");
        assertEquals("{  " + lineFeed, g.output.toString());

        printer.writeObjectEntrySeparator(g);
        // Should include separator and indentation
        assertEquals("{  " + lineFeed + "," + "  " + lineFeed, g.output.toString());

        printer.writeEndObject(g, 1);
        assertEquals("{  " + lineFeed + "," + "  " + lineFeed + "}", g.output.toString());
    }

    // Test indentObjectsWith and beforeObjectEntries with NopIndenter
    @Test
    public void testNopIndenterForObjects() throws Exception {
        DefaultPrettyPrinter printer = new DefaultPrettyPrinter();
        printer.indentObjectsWith(DefaultPrettyPrinter.NopIndenter.instance);
        TestJsonGenerator g = new TestJsonGenerator();
        printer.writeStartObject(g); // {
        printer.beforeObjectEntries(g);
        assertEquals("{", g.output.toString());

        printer.writeObjectEntrySeparator(g);
        assertEquals("{,", g.output.toString());

        printer.writeEndObject(g, 1);
        assertEquals("{,}", g.output.toString());
    }

    // Test writeObjectFieldValueSeparator with spaces
    @Test
    public void testObjectFieldValueSeparatorWithSpaces() throws Exception {
        DefaultPrettyPrinter printer = new DefaultPrettyPrinter();
        // Default _spacesInObjectEntries is true
        TestJsonGenerator g = new TestJsonGenerator();
        printer.writeObjectFieldValueSeparator(g);
        // Default Separators.DEFAULT_SEPARATORS has ':' as objectFieldValueSeparator
        // _objectFieldValueSeparatorWithSpaces is " : "
        assertEquals(" : ", g.output.toString());
    }

    // Test writeObjectFieldValueSeparator without spaces
    @Test
    public void testObjectFieldValueSeparatorWithoutSpaces() throws Exception {
        DefaultPrettyPrinter printer = new DefaultPrettyPrinter();
        DefaultPrettyPrinter newPrinter = printer.withoutSpacesInObjectEntries();
        TestJsonGenerator g = new TestJsonGenerator();
        newPrinter.writeObjectFieldValueSeparator(g);
        // Default Separators.DEFAULT_SEPARATORS has ':' as objectFieldValueSeparator
        assertEquals(":", g.output.toString());
    }

    // Test writeObjectEntrySeparator (default)
    @Test
    public void testObjectEntrySeparatorDefault() throws Exception {
        DefaultPrettyPrinter printer = new DefaultPrettyPrinter();
        TestJsonGenerator g = new TestJsonGenerator();
        String lineFeed = System.getProperty("line.separator");
        printer.writeObjectEntrySeparator(g);
        // Default Separators.DEFAULT_SEPARATORS has ',' as objectEntrySeparator
        // Default Indenter adds 2 spaces and linefeed
        assertEquals("," + "  " + lineFeed, g.output.toString());
    }

    // Test writeEndObject with entries
    @Test
    public void testWriteEndObjectWithEntries() throws Exception {
        DefaultPrettyPrinter printer = new DefaultPrettyPrinter();
        TestJsonGenerator g = new TestJsonGenerator();
        String lineFeed = System.getProperty("line.separator");
        printer.writeEndObject(g, 1);
        // Default Indenter expects indentation before closing brace if entries exist
        assertEquals("}", g.output.toString());
    }

    // Test writeEndObject with zero entries
    @Test
    public void testWriteEndObjectZeroEntries() throws Exception {
        DefaultPrettyPrinter printer = new DefaultPrettyPrinter();
        TestJsonGenerator g = new TestJsonGenerator();
        printer.writeEndObject(g, 0);
        // Default Indenter adds a space before closing brace if no entries
        assertEquals(" }", g.output.toString());
    }

    // Test writeStartArray default behavior
    @Test
    public void testWriteStartArrayDefault() throws Exception {
        DefaultPrettyPrinter printer = new DefaultPrettyPrinter();
        TestJsonGenerator g = new TestJsonGenerator();
        printer.writeStartArray(g);
        assertEquals("[", g.output.toString());
        assertFalse(printer._arrayIndenter.isInline()); // FixedSpaceIndenter is inline
        assertEquals(0, printer._nesting); // FixedSpaceIndenter is inline, nesting should not change
    }

    // Test writeStartArray with NopIndenter (inline)
    @Test
    public void testWriteStartArrayNopIndenter() throws Exception {
        DefaultPrettyPrinter printer = new DefaultPrettyPrinter();
        printer.indentArraysWith(DefaultPrettyPrinter.NopIndenter.instance);
        TestJsonGenerator g = new TestJsonGenerator();
        printer.writeStartArray(g);
        assertEquals("[", g.output.toString());
        assertTrue(printer._arrayIndenter.isInline());
        assertEquals(0, printer._nesting); // NopIndenter is inline
    }

    // Test writeEndArray with entries
    @Test
    public void testWriteEndArrayWithEntries() throws Exception {
        DefaultPrettyPrinter printer = new DefaultPrettyPrinter();
        TestJsonGenerator g = new TestJsonGenerator();
        printer.writeEndArray(g, 1);
        // Default FixedSpaceIndenter adds a space before closing bracket if entries exist
        assertEquals(" ]", g.output.toString());
    }

    // Test writeEndArray with zero entries
    @Test
    public void testWriteEndArrayZeroEntries() throws Exception {
        DefaultPrettyPrinter printer = new DefaultPrettyPrinter();
        TestJsonGenerator g = new TestJsonGenerator();
        printer.writeEndArray(g, 0);
        // Default FixedSpaceIndenter adds a space before closing bracket if no entries
        assertEquals(" ]", g.output.toString());
    }

    // Test createInstance() for DefaultPrettyPrinter
    @Test
    public void testCreateInstanceDefault() throws Exception {
        DefaultPrettyPrinter printer = new DefaultPrettyPrinter();
        DefaultPrettyPrinter newInstance = printer.createInstance();
        assertNotSame(printer, newInstance);
        assertEquals(printer._arrayIndenter, newInstance._arrayIndenter);
        assertEquals(printer._objectIndenter, newInstance._objectIndenter);
        assertEquals(printer._rootSeparator, newInstance._rootSeparator);
        assertEquals(printer._spacesInObjectEntries, newInstance._spacesInObjectEntries);
    }

    // Test createInstance() for a subclass (should throw exception)
    @Test(expected = IllegalStateException.class)
    public void testCreateInstanceSubclass() throws Exception {
        // Create a dummy subclass to test the check
        class MyPrettyPrinter extends DefaultPrettyPrinter {
            public MyPrettyPrinter() { super(); }
            public MyPrettyPrinter(DefaultPrettyPrinter base) { super(base); }
            // No override of createInstance
        }
        MyPrettyPrinter printer = new MyPrettyPrinter();
        printer.createInstance(); // This should throw
    }

    // Test withArrayIndenter with null
    @Test
    public void testWithArrayIndenterNull() throws Exception {
        DefaultPrettyPrinter printer = new DefaultPrettyPrinter();
        DefaultPrettyPrinter newPrinter = printer.withArrayIndenter(null);
        assertEquals(DefaultPrettyPrinter.NopIndenter.instance, newPrinter._arrayIndenter);
    }

    // Test withArrayIndenter with FixedSpaceIndenter
    @Test
    public void testWithArrayIndenterFixedSpace() throws Exception {
        DefaultPrettyPrinter printer = new DefaultPrettyPrinter();
        DefaultPrettyPrinter newPrinter = printer.withArrayIndenter(DefaultPrettyPrinter.FixedSpaceIndenter.instance);
        assertEquals(DefaultPrettyPrinter.FixedSpaceIndenter.instance, newPrinter._arrayIndenter);
    }

    // Test withObjectIndenter with null
    @Test
    public void testWithObjectIndenterNull() throws Exception {
        DefaultPrettyPrinter printer = new DefaultPrettyPrinter();
        DefaultPrettyPrinter newPrinter = printer.withObjectIndenter(null);
        assertEquals(DefaultPrettyPrinter.NopIndenter.instance, newPrinter._objectIndenter);
    }

    // Test withObjectIndenter with DefaultIndenter
    @Test
    public void testWithObjectIndenterDefault() throws Exception {
        DefaultPrettyPrinter printer = new DefaultPrettyPrinter();
        DefaultPrettyPrinter newPrinter = printer.withObjectIndenter(DefaultIndenter.SYSTEM_LINEFEED_INSTANCE);
        assertEquals(DefaultIndenter.SYSTEM_LINEFEED_INSTANCE, newPrinter._objectIndenter);
    }

    // Test withSpacesInObjectEntries() when already set
    @Test
    public void testWithSpacesInObjectEntriesAlreadySet() throws Exception {
        DefaultPrettyPrinter printer = new DefaultPrettyPrinter();
        assertTrue(printer._spacesInObjectEntries); // Default is true
        DefaultPrettyPrinter newPrinter = printer.withSpacesInObjectEntries();
        assertSame(printer, newPrinter); // Should return same instance
    }

    // Test withSpacesInObjectEntries() when not set
    @Test
    public void testWithSpacesInObjectEntriesNotSet() throws Exception {
        DefaultPrettyPrinter printer = new DefaultPrettyPrinter();
        printer._spacesInObjectEntries = false; // Manually set to false
        DefaultPrettyPrinter newPrinter = printer.withSpacesInObjectEntries();
        assertFalse(newPrinter._spacesInObjectEntries);
    }

    // Test withoutSpacesInObjectEntries() when already set
    @Test
    public void testWithoutSpacesInObjectEntriesAlreadySet() throws Exception {
        DefaultPrettyPrinter printer = new DefaultPrettyPrinter();
        printer._spacesInObjectEntries = false; // Manually set to false
        DefaultPrettyPrinter newPrinter = printer.withoutSpacesInObjectEntries();
        assertSame(printer, newPrinter); // Should return same instance
    }

    // Test withoutSpacesInObjectEntries() when not set
    @Test
    public void testWithoutSpacesInObjectEntriesNotSet() throws Exception {
        DefaultPrettyPrinter printer = new DefaultPrettyPrinter();
        assertTrue(printer._spacesInObjectEntries); // Default is true
        DefaultPrettyPrinter newPrinter = printer.withoutSpacesInObjectEntries();
        assertFalse(newPrinter._spacesInObjectEntries);
    }

    // Test withSeparators with default separators
    @Test
    public void testWithSeparatorsDefault() throws Exception {
        DefaultPrettyPrinter printer = new DefaultPrettyPrinter();
        Separators defaultSeparators = Separators.createDefaultInstance();
        DefaultPrettyPrinter newPrinter = printer.withSeparators(defaultSeparators);
        assertEquals(defaultSeparators, newPrinter._separators);
        assertEquals(" : ", newPrinter._objectFieldValueSeparatorWithSpaces);
    }

    // Test withSeparators with custom separators
    @Test
    public void testWithSeparatorsCustom() throws Exception {
        DefaultPrettyPrinter printer = new DefaultPrettyPrinter();
        Separators customSeparators = new Separators('|', ';', '-');
        DefaultPrettyPrinter newPrinter = printer.withSeparators(customSeparators);
        assertEquals(customSeparators, newPrinter._separators);
        assertEquals(" | ", newPrinter._objectFieldValueSeparatorWithSpaces); // objectFieldValueSeparator is '|', spaces are added
    }

    // Test writeObjectEntrySeparator when spaces are disabled and custom separators are used
    @Test
    public void testObjectEntrySeparatorNoSpacesCustomSeparators() throws Exception {
        DefaultPrettyPrinter printer = new DefaultPrettyPrinter();
        printer = printer.withoutSpacesInObjectEntries();
        Separators customSeparators = new Separators('|', ';', '-');
        printer = printer.withSeparators(customSeparators);
        TestJsonGenerator g = new TestJsonGenerator();
        String lineFeed = System.getProperty("line.separator");
        printer.writeObjectEntrySeparator(g);
        // Should be custom separator and indentation
        assertEquals(";" + "  " + lineFeed, g.output.toString());
    }

    // Test writeStartObject behavior
    @Test
    public void testWriteStartObject() throws Exception {
        DefaultPrettyPrinter printer = new DefaultPrettyPrinter();
        TestJsonGenerator g = new TestJsonGenerator();
        printer.writeStartObject(g);
        assertEquals("{", g.output.toString());
        assertFalse(printer._objectIndenter.isInline()); // Default Indenter is not inline
        assertEquals(1, printer._nesting); // nesting should increment if not inline
    }

    // Test writeStartObject with NopIndenter
    @Test
    public void testWriteStartObjectNopIndenter() throws Exception {
        DefaultPrettyPrinter printer = new DefaultPrettyPrinter();
        printer.indentObjectsWith(DefaultPrettyPrinter.NopIndenter.instance);
        TestJsonGenerator g = new TestJsonGenerator();
        printer.writeStartObject(g);
        assertEquals("{", g.output.toString());
        assertTrue(printer._objectIndenter.isInline());
        assertEquals(0, printer._nesting); // nesting should not increment if inline
    }

    // Test writeEndObject behavior with zero entries and inline array indenter
    @Test
    public void testWriteEndObjectZeroEntriesInlineArray() throws Exception {
        DefaultPrettyPrinter printer = new DefaultPrettyPrinter();
        printer.indentArraysWith(DefaultPrettyPrinter.FixedSpaceIndenter.instance); // FixedSpaceIndenter is inline
        TestJsonGenerator g = new TestJsonGenerator();
        printer.writeEndObject(g, 0);
        // Default behavior for 0 entries is " }"
        assertEquals(" }", g.output.toString());
    }

    // Test writeEndObject behavior with entries and inline array indenter
    @Test
    public void testWriteEndObjectWithEntriesInlineArray() throws Exception {
        DefaultPrettyPrinter printer = new DefaultPrettyPrinter();
        printer.indentArraysWith(DefaultPrettyPrinter.FixedSpaceIndenter.instance); // FixedSpaceIndenter is inline
        TestJsonGenerator g = new TestJsonGenerator();
        printer.writeEndObject(g, 1);
        // Default behavior for entries is "}" (no extra space before if indenter is inline)
        assertEquals("}", g.output.toString());
    }

    // Test writeEndArray behavior with zero entries and inline array indenter
    @Test
    public void testWriteEndArrayZeroEntriesInlineArray() throws Exception {
        DefaultPrettyPrinter printer = new DefaultPrettyPrinter();
        printer.indentArraysWith(DefaultPrettyPrinter.FixedSpaceIndenter.instance); // FixedSpaceIndenter is inline
        TestJsonGenerator g = new TestJsonGenerator();
        printer.writeEndArray(g, 0);
        // Default behavior for 0 entries is " ]"
        assertEquals(" ]", g.output.toString());
    }

    // Test writeEndArray behavior with entries and inline array indenter
    @Test
    public void testWriteEndArrayWithEntriesInlineArray() throws Exception {
        DefaultPrettyPrinter printer = new DefaultPrettyPrinter();
        printer.indentArraysWith(DefaultPrettyPrinter.FixedSpaceIndenter.instance); // FixedSpaceIndenter is inline
        TestJsonGenerator g = new TestJsonGenerator();
        printer.writeEndArray(g, 1);
        // Default behavior for entries is " ]"
        assertEquals(" ]", g.output.toString());
    }

    // Test writeStartObject with _objectIndenter.isInline() == true
    @Test
    public void testWriteStartObjectInlineIndenter() throws Exception {
        DefaultPrettyPrinter printer = new DefaultPrettyPrinter();
        printer.indentObjectsWith(new DefaultPrettyPrinter.FixedSpaceIndenter()); // isInline() returns true
        TestJsonGenerator g = new TestJsonGenerator();
        printer.writeStartObject(g);
        assertEquals("{", g.output.toString());
        assertTrue(printer._objectIndenter.isInline());
        assertEquals(0, printer._nesting); // nesting should not increment
    }

    // Test writeEndObject with _objectIndenter.isInline() == true
    @Test
    public void testWriteEndObjectInlineIndenter() throws Exception {
        DefaultPrettyPrinter printer = new DefaultPrettyPrinter();
        printer.indentObjectsWith(new DefaultPrettyPrinter.FixedSpaceIndenter()); // isInline() returns true
        TestJsonGenerator g = new TestJsonGenerator();
        printer.writeEndObject(g, 1);
        assertEquals("}", g.output.toString()); // no indentation before closing brace
    }

    // Test writeStartArray with _arrayIndenter.isInline() == true
    @Test
    public void testWriteStartArrayInlineIndenter() throws Exception {
        DefaultPrettyPrinter printer = new DefaultPrettyPrinter();
        printer.indentArraysWith(new DefaultPrettyPrinter.FixedSpaceIndenter()); // isInline() returns true
        TestJsonGenerator g = new TestJsonGenerator();
        printer.writeStartArray(g);
        assertEquals("[", g.output.toString());
        assertTrue(printer._arrayIndenter.isInline());
        assertEquals(0, printer._nesting); // nesting should not increment
    }

    // Test writeEndArray with _arrayIndenter.isInline() == true
    @Test
    public void testWriteEndArrayInlineIndenter() throws Exception {
        DefaultPrettyPrinter printer = new DefaultPrettyPrinter();
        printer.indentArraysWith(new DefaultPrettyPrinter.FixedSpaceIndenter()); // isInline() returns true
        TestJsonGenerator g = new TestJsonGenerator();
        printer.writeEndArray(g, 1);
        assertEquals("]", g.output.toString()); // no indentation before closing bracket
    }
    
    // Test withSeparators and writeObjectEntrySeparator when _spacesInObjectEntries is false
    @Test
    public void testSeparatorsNoSpaces() throws Exception {
        DefaultPrettyPrinter printer = new DefaultPrettyPrinter();
        printer = printer.withoutSpacesInObjectEntries();
        Separators customSeparators = new Separators(':', ';', ','); // Field sep, Entry sep, Array sep
        printer = printer.withSeparators(customSeparators);
        
        TestJsonGenerator g = new TestJsonGenerator();
        String lineFeed = System.getProperty("line.separator");
        
        printer.writeStartObject(g); // {
        printer.beforeObjectEntries(g); // Indentation
        assertEquals("{  " + lineFeed, g.output.toString());
        
        printer.writeObjectFieldValueSeparator(g); // Field separator
        assertEquals("{  " + lineFeed + ":", g.output.toString());
        
        printer.writeObjectEntrySeparator(g); // Entry separator and indentation
        assertEquals("{  " + lineFeed + ":" + ";" + "  " + lineFeed, g.output.toString());
        
        printer.writeEndObject(g, 1);
        assertEquals("{  " + lineFeed + ":" + ";" + "  " + lineFeed + "}", g.output.toString());
    }

    // Test withSeparators and writeArrayValueSeparator
    @Test
    public void testSeparatorsArrayValueSeparator() throws Exception {
        DefaultPrettyPrinter printer = new DefaultPrettyPrinter();
        Separators customSeparators = new Separators(':', ';', '-'); // Field sep, Entry sep, Array sep
        printer = printer.withSeparators(customSeparators);
        
        TestJsonGenerator g = new TestJsonGenerator();
        printer.writeStartArray(g); // [
        printer.beforeArrayValues(g); // Indentation (FixedSpaceIndenter adds space)
        assertEquals("[ ", g.output.toString());
        
        printer.writeArrayValueSeparator(g); // Array value separator and indentation
        assertEquals("[ -" + " ", g.output.toString()); // Custom array sep is '-', fixed space indenter adds space
        
        printer.writeEndArray(g, 1);
        assertEquals("[ -" + " ]", g.output.toString()); // Fixed space indenter adds space before closing bracket
    }
}
