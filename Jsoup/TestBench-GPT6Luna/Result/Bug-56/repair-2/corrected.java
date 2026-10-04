package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import org.jsoup.parser.XmlTreeBuilder;
import java.io.IOException;
import org.jsoup.helper.StringUtil;
import org.jsoup.nodes.Document.OutputSettings.*;
import org.jsoup.nodes.*;
import java.util.ArrayList;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.BooleanAttribute;
import org.jsoup.nodes.DocumentType;
import java.util.Arrays;
import org.jsoup.Jsoup;
import java.util.List;
import org.jsoup.parser.Tokeniser;
import org.jsoup.parser.CharacterReader;
import org.jsoup.parser.HtmlTreeBuilder;
import org.jsoup.parser.Tag;

public class DocumentTypeTest {
    @Test
    public void testNodeName() throws Exception {
        DocumentType type = new DocumentType("html", "", "", "");
        assertEquals("#doctype", type.nodeName());
    }

    @Test
    public void testStringFormWithoutIdentifiers() throws Exception {
        DocumentType type = new DocumentType("html", "", "", "");
        assertEquals("<!doctype html>", type.toString());
    }

    @Test
    public void testStringFormWithPublicAndSystemIdentifiers() throws Exception {
        DocumentType type = new DocumentType("html", "public-id", "system-id", "");
        assertEquals("<!DOCTYPE html PUBLIC \"public-id\" \"system-id\">", type.toString());
    }

    @Test
    public void testStringFormWithExplicitSystemKey() throws Exception {
        DocumentType type = new DocumentType("html", "SYSTEM", "", "system-id", "");
        assertEquals("<!DOCTYPE html SYSTEM \"system-id\">", type.toString());
    }

    @Test
    public void testWhitespaceIdentifiersUseHtmlDoctypeForm() throws Exception {
        DocumentType type = new DocumentType("html", " ", "\t", "");
        assertEquals("<!doctype html>", type.toString());
    }

    @Test
    public void testEmptyNameOmitsNameInStringForm() throws Exception {
        DocumentType type = new DocumentType("", "", "", "");
        assertEquals("<!doctype>", type.toString());
    }

    @Test
    public void testPublicIdentifierOnly() throws Exception {
        DocumentType type = new DocumentType("html", "public-id", "", "");
        assertEquals("<!DOCTYPE html PUBLIC \"public-id\">", type.toString());
    }

    @Test
    public void testSystemIdentifierOnly() throws Exception {
        DocumentType type = new DocumentType("html", "", "system-id", "");
        assertEquals("<!DOCTYPE html \"system-id\">", type.toString());
    }

    @Test
    public void testExplicitPublicKeyWithEmptyIdentifiers() throws Exception {
        DocumentType type = new DocumentType("html", "PUBLIC", "", "", "");
        assertEquals("<!DOCTYPE html PUBLIC>", type.toString());
    }

    @Test
    public void testExplicitKeyAndBothIdentifiers() throws Exception {
        DocumentType type = new DocumentType("html", "SYSTEM", "pub-id", "sys-id", "");
        assertEquals("<!DOCTYPE html SYSTEM \"pub-id\" \"sys-id\">", type.toString());
    }

    @Test
    public void testPublicConstructorSetsPublicKey() throws Exception {
        DocumentType type = new DocumentType("html", "pub-id", "", "");
        assertEquals("<!DOCTYPE html PUBLIC \"pub-id\">", type.toString());
    }

    @Test
    public void testAttributeChangeAppearsInSerialization() throws Exception {
        DocumentType type = new DocumentType("html", "", "old-id", "");
        type.attr("systemId", "new-id");
        assertEquals("<!DOCTYPE html \"new-id\">", type.toString());
    }

    @Test
    public void testBlankNameIsOmitted() throws Exception {
        DocumentType type = new DocumentType(" ", "", "", "");
        assertEquals("<!doctype>", type.toString());
    }

    @Test
    public void testSystemIdentifierWithWhitespaceIsOmittedInHtmlSyntax() throws Exception {
        DocumentType type = new DocumentType("html", "", " \t", "");
        assertEquals("<!doctype html>", type.toString());
    }
}
