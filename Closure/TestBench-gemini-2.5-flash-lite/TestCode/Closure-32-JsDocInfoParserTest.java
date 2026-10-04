package com.google.javascript.jscomp.parsing;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
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

public class JsDocInfoParserTest {

    // Helper method to create a basic config
    private Config createConfig() {
        return new Config(
                Sets.<String>newHashSet(),
                Sets.<String>newHashSet(),
                false,
                LanguageMode.ECMASCRIPT3,
                false);
    }

    // Helper method to create a JsDocInfoParser instance
    private JsDocInfoParser createParser(String jsDoc) {
        JsDocTokenStream stream = new JsDocTokenStream(jsDoc);
        Comment commentNode = null; // Not needed for parseTypeString
        Node associatedNode = null; // Not needed for parseTypeString
        Config config = createConfig();
        ErrorReporter errorReporter = NullErrorReporter.forNewRhino();
        return new JsDocInfoParser(stream, commentNode, associatedNode, config, errorReporter);
    }

    // Tests for the static method parseTypeString

    @Test
    public void testParseTypeString_simpleTypeName() {
        String typeString = "string";
        Node result = JsDocInfoParser.parseTypeString(typeString);
        assertNotNull(result);
        assertEquals(Token.STRING, result.getType());
        assertEquals("string", result.getString());
        assertNull(result.getJSDocInfo());
    }

    @Test
    public void testParseTypeString_qualifiedTypeName() {
        String typeString = "namespace.TypeName";
        Node result = JsDocInfoParser.parseTypeString(typeString);
        assertNotNull(result);
        assertEquals(Token.STRING, result.getType());
        assertEquals("namespace.TypeName", result.getString());
    }

    @Test
    public void testParseTypeString_arrayType() {
        String typeString = "Array<string>";
        Node result = JsDocInfoParser.parseTypeString(typeString);
        assertNotNull(result);
        assertEquals(Token.STRING, result.getType());
        // The reference implementation uses '.' for generics, not '.<'
        assertEquals("Array.string", result.getString());
    }

    @Test
    public void testParseTypeString_unionType() {
        String typeString = "string|number";
        Node result = JsDocInfoParser.parseTypeString(typeString);
        assertNotNull(result);
        assertEquals(Token.PIPE, result.getType());
        assertEquals(2, result.getChildCount());
        assertEquals("string", result.getFirstChild().getString());
        assertEquals("number", result.getLastChild().getString());
    }

    @Test
    public void testParseTypeString_nullableType() {
        String typeString = "?string";
        Node result = JsDocInfoParser.parseTypeString(typeString);
        assertNotNull(result);
        assertEquals(Token.QMARK, result.getType());
        assertNotNull(result.getFirstChild());
        assertEquals("string", result.getFirstChild().getString());
    }

    @Test
    public void testParseTypeString_nonNullableType() {
        String typeString = "!string";
        Node result = JsDocInfoParser.parseTypeString(typeString);
        assertNotNull(result);
        assertEquals(Token.BANG, result.getType());
        assertNotNull(result.getFirstChild());
        assertEquals("string", result.getFirstChild().getString());
    }

    @Test
    public void testParseTypeString_functionType() {
        String typeString = "function(string): number";
        Node result = JsDocInfoParser.parseTypeString(typeString);
        assertNotNull(result);
        assertEquals(Token.FUNCTION, result.getType());
        assertEquals(2, result.getChildCount()); // Params and return type
        Node params = result.getChildAtIndex(0);
        assertEquals(Token.PARAM_LIST, params.getType());
        assertEquals(1, params.getChildCount());
        assertEquals("string", params.getFirstChild().getString());
        assertEquals("number", result.getChildAtIndex(1).getString());
    }

    @Test
    public void testParseTypeString_functionTypeWithThisAndNew() {
        // Note: The source code indicates that `this` and `new` are handled but not fully implemented.
        // Testing a basic function type without `this` or `new`.
        String typeString = "function(this:Object, string): number";
        Node result = JsDocInfoParser.parseTypeString(typeString);
        assertNotNull(result);
        assertEquals(Token.FUNCTION, result.getType());
        // Expected children: context, params, return type. The original test expected 2 children which was incorrect.
        assertEquals(3, result.getChildCount());
        Node context = result.getFirstChild();
        assertEquals(Token.THIS, context.getType());
        assertEquals("Object", context.getChildAtIndex(0).getString());
        Node params = context.getNext(); // This is now the second child of FUNCTION node.
        assertEquals(Token.PARAM_LIST, params.getType());
        assertEquals(1, params.getChildCount());
        assertEquals("string", params.getFirstChild().getString());
        assertEquals("number", result.getLastChild().getString());
    }


    @Test
    public void testParseTypeString_recordType() {
        String typeString = "{a: string, b: number}";
        Node result = JsDocInfoParser.parseTypeString(typeString);
        assertNotNull(result);
        // The outer token for a record type is LC (Token.LC), not the field list Token.LB
        assertEquals(Token.LC, result.getType());
        assertNotNull(result.getFirstChild());
        assertEquals(Token.LB, result.getFirstChild().getType()); // Represents the field list
        assertEquals(2, result.getFirstChild().getChildCount());
        assertEquals("a", result.getFirstChild().getChildAtIndex(0).getFirstChild().getString()); // Field name 'a'
        assertEquals("string", result.getFirstChild().getChildAtIndex(0).getLastChild().getString()); // Field type 'string'
        assertEquals("b", result.getFirstChild().getChildAtIndex(1).getFirstChild().getString()); // Field name 'b'
        assertEquals("number", result.getFirstChild().getChildAtIndex(1).getLastChild().getString()); // Field type 'number'
    }

    @Test
    public void testParseTypeString_emptyRecordType() {
        String typeString = "{}";
        Node result = JsDocInfoParser.parseTypeString(typeString);
        assertNotNull(result);
        assertEquals(Token.LC, result.getType());
        assertNotNull(result.getFirstChild());
        assertEquals(Token.LB, result.getFirstChild().getType()); // Represents the field list
        assertEquals(0, result.getFirstChild().getChildCount());
    }


    @Test
    public void testParseTypeString_stringLiteral() {
        String typeString = "\"hello\"";
        Node result = JsDocInfoParser.parseTypeString(typeString);
        assertNotNull(result);
        assertEquals(Token.STRING, result.getType());
        assertEquals("\"hello\"", result.getString());
    }

    @Test
    public void testParseTypeString_numberLiteral() {
        String typeString = "123";
        Node result = JsDocInfoParser.parseTypeString(typeString);
        assertNotNull(result);
        // Reference code parses numbers as Token.NUMBER
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(123.0, result.getDouble(), 0);
    }

    @Test
    public void testParseTypeString_booleanLiteralTrue() {
        String typeString = "true";
        Node result = JsDocInfoParser.parseTypeString(typeString);
        assertNotNull(result);
        // Reference code parses 'true' as Token.TRUE (44)
        assertEquals(Token.TRUE, result.getType());
    }

    @Test
    public void testParseTypeString_booleanLiteralFalse() {
        String typeString = "false";
        Node result = JsDocInfoParser.parseTypeString(typeString);
        assertNotNull(result);
        // Reference code parses 'false' as Token.FALSE (43)
        assertEquals(Token.FALSE, result.getType());
    }

    @Test
    public void testParseTypeString_nullLiteral() {
        String typeString = "null";
        Node result = JsDocInfoParser.parseTypeString(typeString);
        assertNotNull(result);
        // Reference code parses 'null' as Token.NULL (41)
        assertEquals(Token.NULL, result.getType());
    }

    @Test
    public void testParseTypeString_undefinedLiteral() {
        String typeString = "undefined";
        Node result = JsDocInfoParser.parseTypeString(typeString);
        assertNotNull(result);
        // Reference code parses undefined as Token.STRING with value "undefined"
        assertEquals(Token.STRING, result.getType());
        assertEquals("undefined", result.getString()); // Rhino represents undefined as a string node
    }

    @Test
    public void testParseTypeString_starWildcard() {
        String typeString = "*";
        Node result = JsDocInfoParser.parseTypeString(typeString);
        assertNotNull(result);
        assertEquals(Token.STAR, result.getType());
    }

    @Test
    public void testParseTypeString_typeWithGenericArray() {
        String typeString = "Array<Array<string>>";
        Node result = JsDocInfoParser.parseTypeString(typeString);
        assertNotNull(result);
        assertEquals(Token.STRING, result.getType());
        // The reference implementation uses '.' for generics
        assertEquals("Array.Array.string", result.getString());
    }

    @Test
    public void testParseTypeString_typeWithOptionalParamInFunction() {
        String typeString = "function(string=): number";
        Node result = JsDocInfoParser.parseTypeString(typeString);
        assertNotNull(result);
        assertEquals(Token.FUNCTION, result.getType());
        Node params = result.getChildAtIndex(0);
        assertEquals(Token.PARAM_LIST, params.getType());
        assertEquals(1, params.getChildCount());
        Node optionalParam = params.getFirstChild();
        assertEquals(Token.EQUALS, optionalParam.getType()); // Optional parameter is marked with EQUALS
        assertEquals("string", optionalParam.getFirstChild().getString());
        assertEquals("number", result.getChildAtIndex(1).getString());
    }

    @Test
    public void testParseTypeString_typeWithRestParamInFunction() {
        String typeString = "function(...string): number";
        Node result = JsDocInfoParser.parseTypeString(typeString);
        assertNotNull(result);
        assertEquals(Token.FUNCTION, result.getType());
        Node params = result.getChildAtIndex(0);
        assertEquals(Token.PARAM_LIST, params.getType());
        assertEquals(1, params.getChildCount());
        Node restParam = params.getFirstChild();
        assertEquals(Token.ELLIPSIS, restParam.getType()); // Rest parameter is marked with ELLIPSIS
        assertEquals("string", restParam.getFirstChild().getString());
        assertEquals("number", result.getChildAtIndex(1).getString());
    }

    @Test
    public void testParseTypeString_typeWithEmptyArray() {
        String typeString = "[]";
        Node result = JsDocInfoParser.parseTypeString(typeString);
        assertNotNull(result);
        // The outer token for an array type is LB (Token.LB), not the element list Token.LB
        assertEquals(Token.LB, result.getType());
        assertNotNull(result.getFirstChild());
        // The inner node should represent the element list. In this case, it's empty.
        assertEquals(Token.LB, result.getFirstChild().getType());
        assertEquals(0, result.getFirstChild().getChildCount());
    }

    @Test
    public void testParseTypeString_typeWithArrayOfOptionalParams() {
        String typeString = "[string=]";
        Node result = JsDocInfoParser.parseTypeString(typeString);
        assertNotNull(result);
        assertEquals(Token.LB, result.getType()); // Array start
        assertNotNull(result.getFirstChild());
        assertEquals(Token.LB, result.getFirstChild().getType()); // Element list
        assertEquals(1, result.getFirstChild().getChildCount());
        Node optionalParamInArray = result.getFirstChild().getFirstChild();
        assertEquals(Token.EQUALS, optionalParamInArray.getType()); // Optional marker
        assertEquals("string", optionalParamInArray.getFirstChild().getString());
    }

    @Test
    public void testParseTypeString_typeWithArrayOfRestParams() {
        String typeString = "[...string]";
        Node result = JsDocInfoParser.parseTypeString(typeString);
        assertNotNull(result);
        assertEquals(Token.LB, result.getType()); // Array start
        assertNotNull(result.getFirstChild());
        assertEquals(Token.LB, result.getFirstChild().getType()); // Element list
        assertEquals(1, result.getFirstChild().getChildCount());
        Node restParamInArray = result.getFirstChild().getFirstChild();
        assertEquals(Token.ELLIPSIS, restParamInArray.getType()); // Rest marker
        assertEquals("string", restParamInArray.getFirstChild().getString());
    }

    @Test
    public void testParseTypeString_typeWithCommaSeparatedFieldsInRecord() {
        String typeString = "{a: string, b: number, c: boolean}";
        Node result = JsDocInfoParser.parseTypeString(typeString);
        assertNotNull(result);
        assertEquals(Token.LC, result.getType());
        assertEquals(1, result.getChildCount());
        Node fieldList = result.getFirstChild();
        assertEquals(Token.LB, fieldList.getType());
        assertEquals(3, fieldList.getChildCount());
        assertEquals("a", fieldList.getChildAtIndex(0).getFirstChild().getString());
        assertEquals("string", fieldList.getChildAtIndex(0).getLastChild().getString());
        assertEquals("b", fieldList.getChildAtIndex(1).getFirstChild().getString());
        assertEquals("number", fieldList.getChildAtIndex(1).getLastChild().getString());
        assertEquals("c", fieldList.getChildAtIndex(2).getFirstChild().getString());
        assertEquals("boolean", fieldList.getChildAtIndex(2).getLastChild().getString());
    }

    @Test
    public void testParseTypeString_typeWithDoublePipeUnion() {
        String typeString = "string||number"; // Double pipe for union
        Node result = JsDocInfoParser.parseTypeString(typeString);
        assertNotNull(result);
        assertEquals(Token.PIPE, result.getType());
        assertEquals(2, result.getChildCount());
        assertEquals("string", result.getFirstChild().getString());
        assertEquals("number", result.getLastChild().getString());
    }

    @Test
    public void testParseTypeString_complexUnionWithGenerics() {
        String typeString = "Array<string>|{a: number}";
        Node result = JsDocInfoParser.parseTypeString(typeString);
        assertNotNull(result);
        assertEquals(Token.PIPE, result.getType());
        assertEquals(2, result.getChildCount());
        // Corrected expected values based on reference implementation's handling of generics and records
        assertEquals("Array.string", result.getFirstChild().getString());
        assertEquals(Token.LC, result.getLastChild().getType()); // Start of record
    }

    @Test
    public void testParseTypeString_stringWithLeadingAndTrailingWhitespace() {
        String typeString = "  string  ";
        Node result = JsDocInfoParser.parseTypeString(typeString);
        assertNotNull(result);
        assertEquals(Token.STRING, result.getType());
        assertEquals("string", result.getString()); // Whitespace should be trimmed
    }

    @Test
    public void testParseTypeString_emptyString() {
        String typeString = "";
        Node result = JsDocInfoParser.parseTypeString(typeString);
        assertNull(result); // Empty string should result in null
    }

    @Test
    public void testParseTypeString_malformedType() {
        String typeString = "{a: string"; // Missing closing brace
        Node result = JsDocInfoParser.parseTypeString(typeString);
        assertNull(result); // Malformed type should result in null
    }

    @Test
    public void testParseTypeString_malformedFunctionTypeMissingParen() {
        String typeString = "function string): number";
        Node result = JsDocInfoParser.parseTypeString(typeString);
        assertNull(result);
    }

    @Test
    public void testParseTypeString_malformedArrayType() {
        String typeString = "[string"; // Missing closing bracket
        Node result = JsDocInfoParser.parseTypeString(typeString);
        assertNull(result);
    }
}
