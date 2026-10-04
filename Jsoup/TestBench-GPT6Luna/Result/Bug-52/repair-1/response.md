```java
package org.jsoup.helper;

import org.junit.Test;
import static org.junit.Assert.*;
import org.jsoup.nodes.XmlDeclaration;
import org.jsoup.parser.XmlTreeBuilder;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.util.Locale;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jsoup.helper.Validate;
import org.jsoup.Jsoup;
import org.jsoup.nodes.*;
import java.util.List;

public class DataUtilTest {
    @Test
    public void testXmlDeclarationNodeName() throws Exception {
        XmlDeclaration declaration = new XmlDeclaration("xml", "", false);
        assertEquals("#declaration", declaration.nodeName());
    }

    @Test
    public void testDeclarationName() throws Exception {
        XmlDeclaration declaration = new XmlDeclaration("xml", "", false);
        assertEquals("xml", declaration.name());
    }

    @Test
    public void testDeclarationNamePreservesCase() throws Exception {
        XmlDeclaration declaration = new XmlDeclaration("MiXeD", "", false);
        assertEquals("MiXeD", declaration.name());
    }

    @Test
    public void testEmptyDeclarationContents() throws Exception {
        XmlDeclaration declaration = new XmlDeclaration("xml", "", false);
        assertEquals("", declaration.getWholeDeclaration());
    }

    @Test
    public void testDeclarationAttributeContents() throws Exception {
        XmlDeclaration declaration = new XmlDeclaration("xml", "", false);
        declaration.attr("encoding", "UTF-8");
        assertEquals(" encoding=\"UTF-8\"", declaration.getWholeDeclaration());
    }

    @Test
    public void testDeclarationMultipleAttributes() throws Exception {
        XmlDeclaration declaration = new XmlDeclaration("xml", "", false);
        declaration.attr("version", "1.0");
        declaration.attr("encoding", "UTF-8");
        assertEquals(" version=\"1.0\" encoding=\"UTF-8\"", declaration.getWholeDeclaration());
    }

    @Test
    public void testDeclarationProcessingInstructionString() throws Exception {
        XmlDeclaration declaration = new XmlDeclaration("xml", "", false);
        assertEquals("<?xml?>", declaration.toString());
    }

    @Test
    public void testDeclarationInstructionWithAttributesString() throws Exception {
        XmlDeclaration declaration = new XmlDeclaration("xml", "", false);
        declaration.attr("encoding", "UTF-8");
        assertEquals("<?xml encoding=\"UTF-8\"?>", declaration.toString());
    }

    @Test
    public void testProcessingInstructionFlagChangesDelimiters() throws Exception {
        XmlDeclaration declaration = new XmlDeclaration("note", "", true);
        assertEquals("<!note!>", declaration.toString());
    }

    @Test
    public void testWholeDeclarationEscapesAttributeValue() throws Exception {
        XmlDeclaration declaration = new XmlDeclaration("xml", "", false);
        declaration.attr("value", "a&b");
        assertEquals(" value=\"a&amp;b\"", declaration.getWholeDeclaration());
    }

    @Test
    public void testWholeDeclarationTrimsAttributeHtml() throws Exception {
        XmlDeclaration declaration = new XmlDeclaration("xml", "", false);
        declaration.attr("a", "1");
        assertEquals(" a=\"1\"", declaration.getWholeDeclaration());
    }

    @Test
    public void testToStringUsesDeclarationName() throws Exception {
        XmlDeclaration declaration = new XmlDeclaration("target", "", false);
        assertEquals("<?target?>", declaration.toString());
    }
}
```