package com.google.javascript.jscomp.parsing;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.javascript.jscomp.mozilla.rhino.ErrorReporter;
import com.google.javascript.jscomp.mozilla.rhino.ast.Comment;
import com.google.javascript.jscomp.parsing.Config.LanguageMode;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.JSDocInfoBuilder;
import com.google.javascript.rhino.JSTypeExpression;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.ScriptRuntime;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.JSDocInfo.Visibility;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.List;

public class JsDocInfoParserTest {

    private static final String SOURCE_NAME = "test.js";

    private Node parseTypeString(String typeString) {
        return JsDocInfoParser.parseTypeString(typeString);
    }

    @Test
    public void testParseTypeStringSimple() {
        Node result = parseTypeString("number");
        assertEquals(Token.STRING, result.getType());
        assertEquals("number", result.getString());
    }

    @Test
    public void testParseTypeStringNullable() {
        Node result = parseTypeString("?number");
        assertEquals(Token.QMARK, result.getType());
        assertEquals(Token.STRING, result.getFirstChild().getType());
        assertEquals("number", result.getFirstChild().getString());
    }

    @Test
    public void testParseTypeStringArray() {
        Node result = parseTypeString("number[]");
        assertEquals(Token.BANG, result.getType()); // Array type is represented as BANG applied to element type
        assertEquals(Token.STRING, result.getFirstChild().getType());
        assertEquals("number", result.getFirstChild().getString());
    }
    
    @Test
    public void testParseTypeStringArrayWithBrackets() {
        Node result = parseTypeString("{number[]}");
        assertEquals(Token.BANG, result.getType()); // Array type is represented as BANG applied to element type
        assertEquals(Token.STRING, result.getFirstChild().getType());
        assertEquals("number", result.getFirstChild().getString());
    }

    @Test
    public void testParseTypeStringFunctionSimple() {
        Node result = parseTypeString("function()");
        assertEquals(Token.FUNCTION, result.getType());
        assertFalse(result.hasChildren()); // No parameters or return type specified
    }

    @Test
    public void testParseTypeStringFunctionWithReturn() {
        Node result = parseTypeString("function(): number");
        assertEquals(Token.FUNCTION, result.getType());
        assertEquals(1, result.getChildCount()); // Should have one child for return type
        assertEquals(Token.COLON, result.getLastChild().getType()); // Return type is prefixed with COLON
        assertEquals(Token.STRING, result.getLastChild().getFirstChild().getType());
        assertEquals("number", result.getLastChild().getFirstChild().getString());
    }

    @Test
    public void testParseTypeStringFunctionWithParams() {
        Node result = parseTypeString("function(number, string)");
        assertEquals(Token.FUNCTION, result.getType());
        assertEquals(1, result.getChildCount()); // Should have one child for parameters
        assertEquals(Token.LP, result.getFirstChild().getType()); // Parameters are enclosed in LP
        assertEquals(2, result.getFirstChild().getChildCount()); // Two parameters
        assertEquals("number", result.getFirstChild().getChildAtIndex(0).getString());
        assertEquals("string", result.getFirstChild().getChildAtIndex(1).getString());
    }
    
    @Test
    public void testParseTypeStringFunctionWithOptionalParam() {
        Node result = parseTypeString("function(number=)");
        assertEquals(Token.FUNCTION, result.getType());
        assertEquals(1, result.getChildCount());
        assertEquals(Token.LP, result.getFirstChild().getType());
        assertEquals(1, result.getFirstChild().getChildCount());
        assertEquals(Token.EQUALS, result.getFirstChild().getFirstChild().getType()); // Optional parameter indicated by EQUALS
        assertEquals("number", result.getFirstChild().getFirstChild().getFirstChild().getString());
    }

    @Test
    public void testParseTypeStringFunctionWithRestParam() {
        Node result = parseTypeString("function(...number)");
        assertEquals(Token.FUNCTION, result.getType());
        assertEquals(1, result.getChildCount());
        assertEquals(Token.LP, result.getFirstChild().getType());
        assertEquals(1, result.getFirstChild().getChildCount());
        assertEquals(Token.ELLIPSIS, result.getFirstChild().getFirstChild().getType()); // Rest parameter indicated by ELLIPSIS
        assertEquals("number", result.getFirstChild().getFirstChild().getLastChild().getString());
    }

    @Test
    public void testParseTypeStringUnionSimple() {
        Node result = parseTypeString("number|string");
        assertEquals(Token.PIPE, result.getType());
        assertEquals(2, result.getChildCount());
        assertEquals("number", result.getChildAtIndex(0).getString());
        assertEquals("string", result.getChildAtIndex(1).getString());
    }

    @Test
    public void testParseTypeStringUnionWithParens() {
        Node result = parseTypeString("(number|string)");
        assertEquals(Token.PIPE, result.getType());
        assertEquals(2, result.getChildCount());
        assertEquals("number", result.getChildAtIndex(0).getString());
        assertEquals("string", result.getChildAtIndex(1).getString());
    }

    @Test
    public void testParseTypeStringUnionWithMoreTypes() {
        Node result = parseTypeString("number|string|boolean");
        assertEquals(Token.PIPE, result.getType());
        assertEquals(3, result.getChildCount());
        assertEquals("number", result.getChildAtIndex(0).getString());
        assertEquals("string", result.getChildAtIndex(1).getString());
        assertEquals("boolean", result.getChildAtIndex(2).getString());
    }

    @Test
    public void testParseTypeStringRecordSimple() {
        Node result = parseTypeString("{a: number}");
        assertEquals(Token.LC, result.getType());
        assertEquals(1, result.getChildCount());
        assertEquals(Token.COLON, result.getFirstChild().getType());
        assertEquals("a", result.getFirstChild().getChildAtIndex(0).getString());
        assertEquals("number", result.getFirstChild().getChildAtIndex(1).getString());
    }

    @Test
    public void testParseTypeStringRecordMultipleFields() {
        Node result = parseTypeString("{a: number, b: string}");
        assertEquals(Token.LC, result.getType());
        assertEquals(2, result.getChildCount());
        assertEquals(Token.COLON, result.getChildAtIndex(0).getType());
        assertEquals("a", result.getChildAtIndex(0).getChildAtIndex(0).getString());
        assertEquals("number", result.getChildAtIndex(0).getChildAtIndex(1).getString());
        assertEquals(Token.COLON, result.getChildAtIndex(1).getType());
        assertEquals("b", result.getChildAtIndex(1).getChildAtIndex(0).getString());
        assertEquals("string", result.getChildAtIndex(1).getChildAtIndex(1).getString());
    }

    @Test
    public void testParseTypeStringQualifiedName() {
        Node result = parseTypeString("a.b.c");
        assertEquals(Token.STRING, result.getType());
        assertEquals("a.b.c", result.getString());
    }

    @Test
    public void testParseTypeStringQualifiedNameWithGenerics() {
        Node result = parseTypeString("a.b.<number>");
        assertEquals(Token.STRING, result.getType());
        assertEquals("a.b.<number>", result.getString());
    }

    @Test
    public void testParseTypeStringQualifiedNameWithGenericsParsed() {
        Node result = parseTypeString("a.b.<number, string>");
        assertEquals(Token.STRING, result.getType());
        assertEquals("a.b.<number, string>", result.getString());
    }
    
    @Test
    public void testParseTypeStringComplexFunctionType() {
        Node result = parseTypeString("function(this:Object, number):string");
        assertEquals(Token.FUNCTION, result.getType());
        assertEquals(2, result.getChildCount()); 
        
        Node thisContext = result.getFirstChild();
        assertEquals(Token.THIS, thisContext.getType());
        assertEquals("Object", thisContext.getFirstChild().getString());

        Node returnType = result.getLastChild();
        assertEquals(Token.COLON, returnType.getType());
        assertEquals("string", returnType.getFirstChild().getString());
    }
    
    @Test
    public void testParseTypeStringEmptyRecord() {
        Node result = parseTypeString("{}");
        assertEquals(Token.LC, result.getType());
        assertEquals(0, result.getChildCount()); // Empty record
    }

    @Test
    public void testParseTypeStringUnknownType() {
        Node result = parseTypeString("?");
        assertEquals(Token.QMARK, result.getType());
        assertNull(result.getFirstChild()); // Unknown type is just QMARK
    }

    @Test
    public void testParseTypeStringNullLiteral() {
        Node result = parseTypeString("null");
        assertEquals(Token.STRING, result.getType());
        assertEquals("null", result.getString());
    }

    @Test
    public void testParseTypeStringUndefinedLiteral() {
        Node result = parseTypeString("undefined");
        assertEquals(Token.STRING, result.getType());
        assertEquals("undefined", result.getString());
    }
    
    @Test
    public void testParseTypeStringBangQualifiedName() {
        Node result = parseTypeString("!number");
        assertEquals(Token.BANG, result.getType());
        assertEquals(Token.STRING, result.getFirstChild().getType());
        assertEquals("number", result.getFirstChild().getString());
    }

    @Test
    public void testParseTypeStringNumericLiteralAsType() {
        Node result = parseTypeString("123");
        assertEquals(Token.STRING, result.getType());
        assertEquals("123", result.getString());
    }
    
    @Test
    public void testParseTypeStringBooleanLiteralAsType() {
        Node result = parseTypeString("true");
        assertEquals(Token.STRING, result.getType());
        assertEquals("true", result.getString());
    }

    @Test
    public void testParseTypeStringComplexUnion() {
        Node result = parseTypeString("(number|{a: string}|function():boolean)");
        assertEquals(Token.PIPE, result.getType());
        assertEquals(3, result.getChildCount());
        
        assertEquals("number", result.getChildAtIndex(0).getString());
        
        Node recordType = result.getChildAtIndex(1);
        assertEquals(Token.LC, recordType.getType());
        assertEquals(1, recordType.getChildCount());
        assertEquals(Token.COLON, recordType.getFirstChild().getType());
        assertEquals("a", recordType.getFirstChild().getChildAtIndex(0).getString());
        assertEquals("string", recordType.getFirstChild().getChildAtIndex(1).getString());

        Node functionType = result.getChildAtIndex(2);
        assertEquals(Token.FUNCTION, functionType.getType());
        assertEquals(1, functionType.getChildCount());
        assertEquals(Token.COLON, functionType.getLastChild().getType());
        assertEquals("boolean", functionType.getLastChild().getFirstChild().getString());
    }

    @Test
    public void testParseTypeStringOptionalTypeWithBraces() {
        Node result = parseTypeString("{number=}");
        assertEquals(Token.EQUALS, result.getType());
        assertEquals(Token.STRING, result.getFirstChild().getType());
        assertEquals("number", result.getFirstChild().getString());
    }
    
    @Test
    public void testParseTypeStringArrayOfArrays() {
        Node result = parseTypeString("number[][]");
        assertEquals(Token.BANG, result.getType()); // Outer array
        Node innerArray = result.getFirstChild();
        assertEquals(Token.BANG, innerArray.getType()); // Inner array
        assertEquals(Token.STRING, innerArray.getFirstChild().getType());
        assertEquals("number", innerArray.getFirstChild().getString());
    }

    @Test
    public void testParseTypeStringArrayOfArraysWithBraces() {
        Node result = parseTypeString("{number[][]}");
        assertEquals(Token.BANG, result.getType()); // Outer array
        Node innerArray = result.getFirstChild();
        assertEquals(Token.BANG, innerArray.getType()); // Inner array
        assertEquals(Token.STRING, innerArray.getFirstChild().getType());
        assertEquals("number", innerArray.getFirstChild().getString());
    }

    @Test
    public void testParseTypeStringEmptyString() {
        Node result = parseTypeString("");
        assertNull(result);
    }

    @Test
    public void testParseTypeStringWithLeadingWhitespace() {
        Node result = parseTypeString("  number");
        assertEquals(Token.STRING, result.getType());
        assertEquals("number", result.getString());
    }
    
    @Test
    public void testParseTypeStringWithTrailingWhitespace() {
        Node result = parseTypeString("number  ");
        assertEquals(Token.STRING, result.getType());
        assertEquals("number", result.getString());
    }

    @Test
    public void testParseTypeStringWithInternalWhitespace() {
        Node result = parseTypeString("number | string");
        assertEquals(Token.PIPE, result.getType());
        assertEquals(2, result.getChildCount());
        assertEquals("number", result.getChildAtIndex(0).getString());
        assertEquals("string", result.getChildAtIndex(1).getString());
    }

    @Test
    public void testParseTypeStringUnterminatedStringLiteral() {
        Node result = parseTypeString("new String"); 
        assertEquals(Token.STRING, result.getType());
        assertEquals("new String", result.getString());
    }
    
    @Test
    public void testParseTypeStringUnterminatedFunction() {
        Node result = parseTypeString("function(");
        assertNull(result); 
    }

    @Test
    public void testParseTypeStringUnterminatedRecord() {
        Node result = parseTypeString("{a: number");
        assertNull(result); 
    }

    @Test
    public void testParseTypeStringUnterminatedArray() {
        Node result = parseTypeString("[number");
        assertNull(result); 
    }
    
    @Test
    public void testParseTypeStringDoublePipeUnion() {
        Node result = parseTypeString("number||string");
        assertEquals(Token.PIPE, result.getType());
        assertEquals(2, result.getChildCount());
        assertEquals("number", result.getChildAtIndex(0).getString());
        assertEquals("string", result.getChildAtIndex(1).getString());
    }
}
