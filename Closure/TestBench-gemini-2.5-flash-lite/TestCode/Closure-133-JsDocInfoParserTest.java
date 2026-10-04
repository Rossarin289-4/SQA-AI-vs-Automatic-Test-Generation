package com.google.javascript.jscomp.parsing;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import com.google.common.base.Splitter;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.javascript.jscomp.parsing.Config.LanguageMode;
import com.google.javascript.rhino.IR;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.JSDocInfo.Visibility;
import com.google.javascript.rhino.JSDocInfoBuilder;
import com.google.javascript.rhino.JSTypeExpression;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.ScriptRuntime;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.head.ErrorReporter;
import com.google.javascript.rhino.head.ast.Comment;
import com.google.javascript.rhino.jstype.StaticSourceFile;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.net.URL; // Added import for URL

public class JsDocInfoParserTest {

    private static final String TEST_SOURCE_FILE = "test.js";
































































    @Test
    public void testParseModifies() throws Exception {
        // Need to configure modifiesAnnotationKeywords for this to be meaningful
        // For now, just checking if the parser doesn't crash.
        JSDocInfo info = parseJSDoc("/** @modifies {this} */");
        assertTrue(info.getModifies().contains("this"));
    }


    @Test
    public void testParseExtend() throws Exception {
        JSDocInfo info = parseJSDoc("/** @extends {BaseClass} */");
        assertNotNull(info.getBaseType());
        assertEquals("BaseClass", info.getBaseType().getRoot().getString());
    }

    @Test
    public void testParseImplements() throws Exception {
        JSDocInfo info = parseJSDoc("/** @implements {Interface1} */");
        assertEquals(1, info.getImplementedInterfaces().size());
        assertEquals("Interface1", info.getImplementedInterfaces().get(0).getRoot().getString());
    }

    @Test
    public void testParseImplementsMultiple() throws Exception {
        JSDocInfo info = parseJSDoc("/** @implements {Interface1} @implements {Interface2} */");
        assertEquals(2, info.getImplementedInterfaces().size());
        assertTrue(info.getImplementedInterfaces().stream().anyMatch(i -> i.getRoot().getString().equals("Interface1")));
        assertTrue(info.getImplementedInterfaces().stream().anyMatch(i -> i.getRoot().getString().equals("Interface2")));
    }

    @Test
    public void testParseMeaning() throws Exception {
        JSDocInfo info = parseJSDoc("/** @meaning The meaning of life */");
        assertEquals("The meaning of life", info.getMeaning());
    }

    @Test
    public void testParseConsistentIdGenerator() throws Exception {
        JSDocInfo info = parseJSDoc("/** @consistentIdGenerator */");
        assertTrue(info.isConsistentIdGenerator());
    }

    @Test
    public void testParseStableIdGenerator() throws Exception {
        JSDocInfo info = parseJSDoc("/** @stableIdGenerator */");
        assertTrue(info.isStableIdGenerator());
    }

    @Test
    public void testParseExport() throws Exception {
        JSDocInfo info = parseJSDoc("/** @export */");
        assertTrue(info.isExport());
    }

    @Test
    public void testParseExpose() throws Exception {
        JSDocInfo info = parseJSDoc("/** @expose */");
        assertTrue(info.isExpose());
    }

    @Test
    public void testParseTypeWithQualifiedName() throws Exception {
        JSDocInfo info = parseJSDoc("/** @type {Namespace.Type} */");
        assertNotNull(info.getType());
        Node root = info.getType().getRoot();
        assertEquals(Token.NAME, root.getType());
        assertEquals("Namespace.Type", root.getString());
    }

    @Test
    public void testParseTypeWithArrayOfFunction() throws Exception {
        JSDocInfo info = parseJSDoc("/** @type {Array<function(): void>} */");
        assertNotNull(info.getType());
        Node root = info.getType().getRoot();
        assertEquals(Token.NAME, root.getType()); // Array
        assertEquals("Array", root.getString());
        Node memberType = root.getFirstChild();
        assertEquals(Token.FUNCTION, memberType.getType());
        assertEquals(Token.VOID, memberType.getLastChild().getString()); // result type
    }

    @Test
    public void testParseTypeWithNullableBoolean() throws Exception {
        JSDocInfo info = parseJSDoc("/** @type {?boolean} */");
        assertNotNull(info.getType());
        Node root = info.getType().getRoot();
        assertEquals(Token.QMARK, root.getType());
        assertEquals("boolean", root.getFirstChild().getString());
    }

    @Test
    public void testParseTypeWithOptionalNumber() throws Exception {
        JSDocInfo info = parseJSDoc("/** @type {number=} */");
        assertNotNull(info.getType());
        Node root = info.getType().getRoot();
        assertEquals(Token.EQUALS, root.getType());
        assertEquals("number", root.getFirstChild().getString());
    }

    @Test
    public void testParseTypeWithRestArgsInFunction() throws Exception {
        JSDocInfo info = parseJSDoc("/** @type {function(string, ...number): void} */");
        assertNotNull(info.getType());
        Node root = info.getType().getRoot();
        assertEquals(Token.FUNCTION, root.getType());
        Node params = root.getChildAtIndex(0);
        assertEquals(2, params.getChildCount());
        Node firstParam = params.getFirstChild();
        assertEquals("string", firstParam.getString());
        Node secondParam = firstParam.getNext();
        assertEquals(Token.ELLIPSIS, secondParam.getType());
        assertEquals("number", secondParam.getFirstChild().getString());
    }

    @Test
    public void testParseTypeWithThisContextInFunction() throws Exception {
        JSDocInfo info = parseJSDoc("/** @type {function(this:string, number): void} */");
        assertNotNull(info.getType());
        Node root = info.getType().getRoot();
        assertEquals(Token.FUNCTION, root.getType());
        Node thisContext = root.getFirstChild();
        assertEquals(Token.THIS, thisContext.getType());
        assertEquals("string", thisContext.getString());
        Node params = root.getChildAtIndex(1);
        assertEquals("number", params.getFirstChild().getString());
        Node result = root.getChildAtIndex(2);
        assertEquals("void", result.getString());
    }

    @Test
    public void testParseTypeWithNewContextInFunction() throws Exception {
        JSDocInfo info = parseJSDoc("/** @type {function(new:string, number): void} */");
        assertNotNull(info.getType());
        Node root = info.getType().getRoot();
        assertEquals(Token.FUNCTION, root.getType());
        Node newContext = root.getFirstChild();
        assertEquals(Token.NEW, newContext.getType());
        assertEquals("string", newContext.getString());
        Node params = root.getChildAtIndex(1);
        assertEquals("number", params.getFirstChild().getString());
        Node result = root.getChildAtIndex(2);
        assertEquals("void", result.getString());
    }


    @Test
    public void testParseTypeStringBasic() throws Exception {
        Node typeNode = JsDocInfoParser.parseTypeString("string");
        assertNotNull(typeNode);
        assertEquals("string", typeNode.getString());
    }

    @Test
    public void testParseTypeStringComplex() throws Exception {
        Node typeNode = JsDocInfoParser.parseTypeString("{Array<number>}");
        assertNotNull(typeNode);
        // parseTypeString returns a Node representing the type expression directly.
        // If it's enclosed in {}, the outer LC/RC will be handled within the parser.
        // Here, it's parsed as a Name node with a child member type.
        assertEquals(Token.NAME, typeNode.getType());
        assertEquals("Array", typeNode.getString());
        assertEquals("number", typeNode.getFirstChild().getString());
    }

    @Test
    public void testParseTypeStringUnion() throws Exception {
        Node typeNode = JsDocInfoParser.parseTypeString("string|number");
        assertNotNull(typeNode);
        assertEquals(Token.PIPE, typeNode.getType());
        assertEquals("string", typeNode.getFirstChild().getString());
        assertEquals("number", typeNode.getLastChild().getString());
    }

    @Test
    public void testParseTypeStringNullable() throws Exception {
        Node typeNode = JsDocInfoParser.parseTypeString("?string");
        assertNotNull(typeNode);
        assertEquals(Token.QMARK, typeNode.getType());
        assertEquals("string", typeNode.getFirstChild().getString());
    }

    @Test
    public void testParseTypeStringOptional() throws Exception {
        Node typeNode = JsDocInfoParser.parseTypeString("string=");
        assertNotNull(typeNode);
        assertEquals(Token.EQUALS, typeNode.getType());
        assertEquals("string", typeNode.getFirstChild().getString());
    }
}





