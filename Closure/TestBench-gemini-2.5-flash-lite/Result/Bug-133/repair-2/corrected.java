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

    private JsDocInfoParser createParser(String jsdoc) {
        return createParser(jsdoc, null);
    }

    private JsDocInfoParser createParser(String jsdoc, Node associatedNode) {
        Comment comment = null;
        if (jsdoc != null) {
            // Comment constructor signature in JSDocInfoParser is:
            // JsDocInfoParser(JsDocTokenStream stream, Comment commentNode, ...)
            // The Comment constructor in rhino/ast/Comment.java is:
            // public Comment(int type, int start, int end, String value)
            // We are using a string, so it's likely type=0, start=0, end=0.
            comment = new Comment(0, 0, 0, jsdoc);
        }
        Config config = new Config(
                Sets.<String>newHashSet(),
                Sets.<String>newHashSet(),
                false,
                LanguageMode.ECMASCRIPT3,
                true); // Parse documentation
        JsDocTokenStream stream = new JsDocTokenStream(jsdoc == null ? "" : jsdoc);
        ErrorReporter errorReporter = NullErrorReporter.forNewRhino();

        return new JsDocInfoParser(stream, comment, associatedNode, config, errorReporter);
    }

    private JSDocInfo parseJSDoc(String jsdoc) {
        JsDocInfoParser parser = createParser(jsdoc);
        parser.parse();
        return parser.retrieveAndResetParsedJSDocInfo();
    }

    private JSDocInfo parseJSDoc(String jsdoc, Node associatedNode) {
        JsDocInfoParser parser = createParser(jsdoc, associatedNode);
        parser.parse();
        return parser.retrieveAndResetParsedJSDocInfo();
    }

    @Test
    public void testParseSimpleDescription() throws Exception {
        JSDocInfo info = parseJSDoc("/** Simple description */");
        assertEquals("Simple description", info.getDescription());
    }

    @Test
    public void testParseDescriptionWithAsterisk() throws Exception {
        JSDocInfo info = parseJSDoc("/**\n * Description with asterisk\n */");
        assertEquals("Description with asterisk", info.getDescription());
    }

    @Test
    public void testParseMultilineDescription() throws Exception {
        JSDocInfo info = parseJSDoc("/**\n * Line one\n * Line two\n */");
        assertEquals("Line one\nLine two", info.getDescription());
    }

    @Test
    public void testParseDescriptionAndTag() throws Exception {
        JSDocInfo info = parseJSDoc("/** Description\n * @param {string} name\n */");
        assertEquals("Description", info.getDescription());
        assertEquals("name", info.getParameterNames().iterator().next());
    }

    @Test
    public void testParseTagWithoutDescription() throws Exception {
        JSDocInfo info = parseJSDoc("/** @return {number} */");
        assertNotNull(info.getReturnType());
        assertEquals("number", info.getReturnType().getRoot().getString());
    }

    @Test
    public void testParseMultipleTags() throws Exception {
        JSDocInfo info = parseJSDoc("/**\n * @param {string} name\n * @return {number}\n */");
        assertEquals(1, info.getParameterNames().size());
        assertEquals("name", info.getParameterNames().iterator().next());
        assertNotNull(info.getReturnType());
        assertEquals("number", info.getReturnType().getRoot().getString());
    }

    @Test
    public void testParseDeprecated() throws Exception {
        JSDocInfo info = parseJSDoc("/** @deprecated */");
        assertTrue(info.isDeprecated());
    }

    @Test
    public void testParseDeprecatedWithReason() throws Exception {
        JSDocInfo info = parseJSDoc("/** @deprecated Use newApi instead */");
        assertTrue(info.isDeprecated());
        assertEquals("Use newApi instead", info.getDeprecationReason());
    }

    @Test
    public void testParseAuthor() throws Exception {
        JSDocInfo info = parseJSDoc("/** @author John Doe */");
        // getAuthorList() returns a Set, convert to List for easy assertion
        List<String> authors = Lists.newArrayList(info.getAuthorList());
        assertEquals(1, authors.size());
        assertEquals("John Doe", authors.get(0));
    }

    @Test
    public void testParseAuthorMultiple() throws Exception {
        JSDocInfo info = parseJSDoc("/** @author John Doe\n * @author Jane Smith */");
        assertEquals(2, info.getAuthorList().size());
        assertTrue(info.getAuthorList().contains("John Doe"));
        assertTrue(info.getAuthorList().contains("Jane Smith"));
    }

    @Test
    public void testParseFileOverview() throws Exception {
        JSDocInfo info = parseJSDoc("/**\n * @fileoverview This is a file overview.\n */");
        assertEquals("This is a file overview.", info.getFileOverview());
    }

    @Test
    public void testParseFileOverviewWithDescription() throws Exception {
        JSDocInfo info = parseJSDoc("/**\n * Some description.\n * @fileoverview This is a file overview.\n */");
        assertEquals("Some description.", info.getDescription());
        assertEquals("This is a file overview.", info.getFileOverview());
    }

    @Test
    public void testParseLicense() throws Exception {
        JSDocInfo info = parseJSDoc("/**\n * @license\n * Copyright 2023\n * Apache License 2.0\n */");
        // The license content is appended to the main description when parseDocumentation is true.
        assertTrue(info.getDescription().contains("Copyright 2023"));
        assertTrue(info.getDescription().contains("Apache License 2.0"));
    }

    @Test
    public void testParseLicensePreserveWhitespace() throws Exception {
        JSDocInfo info = parseJSDoc("/**\n * @license\n *   Indented line\n *     Another line\n */");
        // The license content is appended to the main description when parseDocumentation is true.
        assertTrue(info.getDescription().contains("  Indented line"));
        assertTrue(info.getDescription().contains("    Another line"));
    }

    @Test
    public void testParseTypeAlias() throws Exception {
        JSDocInfo info = parseJSDoc("/** @typedef {string} MyString */");
        assertNotNull(info.getTypedefType());
        assertEquals("string", info.getTypedefType().getRoot().getString());
    }

    @Test
    public void testParseTypeDefWithObject() throws Exception {
        JSDocInfo info = parseJSDoc("/** @typedef {{a: number, b: string}} MyObject */");
        assertNotNull(info.getTypedefType());
        Node root = info.getTypedefType().getRoot();
        assertEquals(Token.LC, root.getType()); // Object literal start
        assertEquals(2, root.getChildCount());
        Node firstField = root.getFirstChild();
        assertEquals("a", firstField.getFirstChild().getString());
        assertEquals("number", firstField.getLastChild().getString());
        Node secondField = firstField.getNext();
        assertEquals("b", secondField.getFirstChild().getString());
        assertEquals("string", secondField.getLastChild().getString());
    }

    @Test
    public void testParseParamType() throws Exception {
        JSDocInfo info = parseJSDoc("/** @param {string} name */");
        assertEquals("name", info.getParameterNames().iterator().next());
        JSTypeExpression type = info.getParameterType("name");
        assertNotNull(type);
        assertEquals("string", type.getRoot().getString());
    }

    @Test
    public void testParseParamOptionalType() throws Exception {
        JSDocInfo info = parseJSDoc("/** @param {string=} name */");
        assertEquals("name", info.getParameterNames().iterator().next());
        JSTypeExpression type = info.getParameterType("name");
        assertNotNull(type);
        assertTrue(type.isOptionalArg());
        assertEquals("string", type.getRoot().getString());
    }

    @Test
    public void testParseParamRestType() throws Exception {
        JSDocInfo info = parseJSDoc("/** @param {...string} var_args */");
        assertEquals("var_args", info.getParameterNames().iterator().next());
        JSTypeExpression type = info.getParameterType("var_args");
        assertNotNull(type);
        assertEquals(Token.ELLIPSIS, type.getRoot().getType());
        assertEquals("string", type.getRoot().getFirstChild().getString());
    }

    @Test
    public void testParseParamDescription() throws Exception {
        JSDocInfo info = parseJSDoc("/** @param {string} name Description for name */");
        assertEquals("Description for name", info.getParameterDescription("name"));
    }

    @Test
    public void testParseReturnType() throws Exception {
        JSDocInfo info = parseJSDoc("/** @return {number} */");
        assertNotNull(info.getReturnType());
        assertEquals("number", info.getReturnType().getRoot().getString());
    }

    @Test
    public void testParseReturnTypeWithDescription() throws Exception {
        JSDocInfo info = parseJSDoc("/** @return {number} The result */");
        assertNotNull(info.getReturnType());
        assertEquals("number", info.getReturnType().getRoot().getString());
        assertEquals("The result", info.getReturnDescription());
    }

    @Test
    public void testParseThrows() throws Exception {
        JSDocInfo info = parseJSDoc("/** @throws {Error} */");
        assertNotNull(info.getThrownTypes());
        assertEquals(1, info.getThrownTypes().size());
        assertEquals("Error", info.getThrownTypes().get(0).getRoot().getString());
    }

    @Test
    public void testParseThrowsWithDescription() throws Exception {
        JSDocInfo info = parseJSDoc("/** @throws {Error} An error occurred */");
        assertNotNull(info.getThrownTypes());
        assertEquals(1, info.getThrownTypes().size());
        assertEquals("Error", info.getThrownTypes().get(0).getRoot().getString());
        // getThrowDescription takes the JSTypeExpression as argument
        assertEquals("An error occurred", info.getThrowDescription(info.getThrownTypes().get(0)));
    }

    @Test
    public void testParseSee() throws Exception {
        JSDocInfo info = parseJSDoc("/** @see SomeClass */");
        assertEquals("SomeClass", info.getReferences().iterator().next());
    }

    @Test
    public void testParseSeeMultiple() throws Exception {
        JSDocInfo info = parseJSDoc("/** @see ClassA @see ClassB */");
        assertEquals(2, info.getReferences().size());
        assertTrue(info.getReferences().contains("ClassA"));
        assertTrue(info.getReferences().contains("ClassB"));
    }

    @Test
    public void testParseTemplate() throws Exception {
        JSDocInfo info = parseJSDoc("/** @template T */");
        assertEquals(1, info.getTemplateTypeNames().size());
        assertEquals("T", info.getTemplateTypeNames().get(0));
    }

    @Test
    public void testParseTemplateMultiple() throws Exception {
        JSDocInfo info = parseJSDoc("/** @template T, U */");
        assertEquals(2, info.getTemplateTypeNames().size());
        assertTrue(info.getTemplateTypeNames().contains("T"));
        assertTrue(info.getTemplateTypeNames().contains("U"));
    }

    @Test
    public void testParseClassTemplate() throws Exception {
        JSDocInfo info = parseJSDoc("/** @template {MyClass} T */");
        assertEquals(1, info.getClassTemplateTypeNames().size());
        assertEquals("T", info.getClassTemplateTypeNames().get(0));
    }

    @Test
    public void testParseClassTemplateMultiple() throws Exception {
        JSDocInfo info = parseJSDoc("/** @template {MyClass} T, {OtherClass} U */");
        assertEquals(2, info.getClassTemplateTypeNames().size());
        assertTrue(info.getClassTemplateTypeNames().contains("T"));
        assertTrue(info.getClassTemplateTypeNames().contains("U"));
    }

    @Test
    public void testParseType() throws Exception {
        JSDocInfo info = parseJSDoc("/** @type {string} */");
        assertNotNull(info.getType());
        assertEquals("string", info.getType().getRoot().getString());
    }

    @Test
    public void testParseTypeWithBrackets() throws Exception {
        JSDocInfo info = parseJSDoc("/** @type {[string]} */");
        assertNotNull(info.getType());
        assertEquals(Token.LB, info.getType().getRoot().getType()); // Array start
        assertEquals("string", info.getType().getRoot().getFirstChild().getString());
    }

    @Test
    public void testParseTypeWithObjectLiteral() throws Exception {
        JSDocInfo info = parseJSDoc("/** @type {{a: number}} */");
        assertNotNull(info.getType());
        assertEquals(Token.LC, info.getType().getRoot().getType()); // Object literal start
        Node field = info.getType().getRoot().getFirstChild();
        assertEquals("a", field.getFirstChild().getString());
        assertEquals("number", field.getLastChild().getString());
    }

    @Test
    public void testParseTypeWithUnion() throws Exception {
        JSDocInfo info = parseJSDoc("/** @type {string|number} */");
        assertNotNull(info.getType());
        assertEquals(Token.PIPE, info.getType().getRoot().getType()); // Union start
        assertEquals("string", info.getType().getRoot().getFirstChild().getString());
        assertEquals("number", info.getType().getRoot().getLastChild().getString());
    }

    @Test
    public void testParseTypeWithFunction() throws Exception {
        JSDocInfo info = parseJSDoc("/** @type {function(string): number} */");
        assertNotNull(info.getType());
        assertEquals(Token.FUNCTION, info.getType().getRoot().getType());
        Node params = info.getType().getRoot().getChildAtIndex(0);
        assertEquals("string", params.getFirstChild().getString());
        Node result = info.getType().getRoot().getChildAtIndex(1);
        assertEquals("number", result.getString());
    }

    @Test
    public void testParseTypeWithOptionalParamInFunction() throws Exception {
        JSDocInfo info = parseJSDoc("/** @type {function(string=): number} */");
        assertNotNull(info.getType());
        assertEquals(Token.FUNCTION, info.getType().getRoot().getType());
        Node params = info.getType().getRoot().getChildAtIndex(0);
        Node param = params.getFirstChild();
        assertTrue(param.isOptionalArg()); // This seems to be the correct check for optional
        // param.getRoot() is the type node which is wrapped by Node.EQUALS
        assertEquals("string", param.getRoot().getFirstChild().getString());
        Node result = info.getType().getRoot().getChildAtIndex(1);
        assertEquals("number", result.getString());
    }

    @Test
    public void testParseTypeWithRestParamInFunction() throws Exception {
        JSDocInfo info = parseJSDoc("/** @type {function(...string): number} */");
        assertNotNull(info.getType());
        assertEquals(Token.FUNCTION, info.getType().getRoot().getType());
        Node params = info.getType().getRoot().getChildAtIndex(0);
        Node param = params.getFirstChild();
        assertEquals(Token.ELLIPSIS, param.getType());
        assertEquals("string", param.getFirstChild().getString());
        Node result = info.getType().getRoot().getChildAtIndex(1);
        assertEquals("number", result.getString());
    }

    @Test
    public void testParseConst() throws Exception {
        JSDocInfo info = parseJSDoc("/** @const */");
        assertTrue(info.isConstant());
    }

    @Test
    public void testParseDefine() throws Exception {
        JSDocInfo info = parseJSDoc("/** @define {string} */");
        assertTrue(info.isDefine());
        assertNotNull(info.getType());
        assertEquals("string", info.getType().getRoot().getString());
    }

    @Test
    public void testParseInterface() throws Exception {
        JSDocInfo info = parseJSDoc("/** @interface */");
        assertTrue(info.isInterface());
    }

    @Test
    public void testParseConstructor() throws Exception {
        JSDocInfo info = parseJSDoc("/** @constructor */");
        assertTrue(info.isConstructor());
    }

    @Test
    public void testParseStruct() throws Exception {
        JSDocInfo info = parseJSDoc("/** @struct */");
        assertTrue(info.makesStructs());
    }

    @Test
    public void testParseDict() throws Exception {
        JSDocInfo info = parseJSDoc("/** @dict */");
        assertTrue(info.makesDicts());
    }

    @Test
    public void testParsePrivate() throws Exception {
        JSDocInfo info = parseJSDoc("/** @private */");
        assertEquals(Visibility.PRIVATE, info.getVisibility());
    }

    @Test
    public void testParseProtected() throws Exception {
        JSDocInfo info = parseJSDoc("/** @protected */");
        assertEquals(Visibility.PROTECTED, info.getVisibility());
    }

    @Test
    public void testParsePublic() throws Exception {
        JSDocInfo info = parseJSDoc("/** @public */");
        assertEquals(Visibility.PUBLIC, info.getVisibility());
    }

    @Test
    public void testParseHidden() throws Exception {
        JSDocInfo info = parseJSDoc("/** @hidden */");
        assertTrue(info.isHidden());
    }

    @Test
    public void testParseNoTypeCheck() throws Exception {
        JSDocInfo info = parseJSDoc("/** @nocheck */");
        assertTrue(info.isNoTypeCheck());
    }

    @Test
    public void testParsePreserveTry() throws Exception {
        JSDocInfo info = parseJSDoc("/** @preserveTry */");
        assertTrue(info.shouldPreserveTry());
    }

    @Test
    public void testParseOverride() throws Exception {
        JSDocInfo info = parseJSDoc("/** @override */");
        assertTrue(info.isOverride());
    }

    @Test
    public void testParseNoAlias() throws Exception {
        JSDocInfo info = parseJSDoc("/** @noalias */");
        assertTrue(info.isNoAlias());
    }

    @Test
    public void testParseNoShadow() throws Exception {
        JSDocInfo info = parseJSDoc("/** @noshadow */");
        assertTrue(info.isNoShadow());
    }

    @Test
    public void testParseIdGenerator() throws Exception {
        JSDocInfo info = parseJSDoc("/** @idGenerator */");
        assertTrue(info.isIdGenerator());
    }

    @Test
    public void testParseImplicitCast() throws Exception {
        JSDocInfo info = parseJSDoc("/** @implicitCast */");
        assertTrue(info.isImplicitCast());
    }

    @Test
    public void testParseNoSideEffects() throws Exception {
        JSDocInfo info = parseJSDoc("/** @nosideeffects */");
        assertTrue(info.isNoSideEffects());
    }

    @Test
    public void testParseExterns() throws Exception {
        JSDocInfo info = parseJSDoc("/** @externs */");
        assertTrue(info.isExterns());
    }

    @Test
    public void testParseJavaDispatch() throws Exception {
        JSDocInfo info = parseJSDoc("/** @javadispatch */");
        assertTrue(info.isJavaDispatch());
    }

    @Test
    public void testParseNoCompile() throws Exception {
        JSDocInfo info = parseJSDoc("/** @nocompile */");
        assertTrue(info.isNoCompile());
    }

    @Test
    public void testParseSuppress() throws Exception {
        // Need to configure suppressionNames for this to be meaningful
        // For now, just checking if the parser doesn't crash.
        JSDocInfo info = parseJSDoc("/** @suppress {checkTypes} */");
        assertTrue(info.getSuppressions().contains("checkTypes"));
    }

    @Test
    public void testParseModifies() throws Exception {
        // Need to configure modifiesAnnotationKeywords for this to be meaningful
        // For now, just checking if the parser doesn't crash.
        JSDocInfo info = parseJSDoc("/** @modifies {this} */");
        assertTrue(info.getModifies().contains("this"));
    }

    @Test
    public void testParseLends() throws Exception {
        JSDocInfo info = parseJSDoc("/** @lends MyClass#method */");
        assertEquals("MyClass#method", info.getLendsExpression());
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
    public void testParseInlineTypeDoc() throws Exception {
        // The original code called parseJSDoc with an associatedNode.
        // The JSDocInfoParser constructor takes an associatedNode.
        // We need to create a dummy Node for this.
        Node associatedNode = IR.string("dummy");
        associatedNode.setStaticSourceFile(new StaticSourceFile() {
            @Override
            public String getName() {
                return TEST_SOURCE_FILE;
            }

            @Override
            public CharSequence getCode() {
                return null;
            }

            @Override
            public URL getURL() {
                return null;
            }

            // Added missing methods for StaticSourceFile
            @Override
            public int getLineOffset(int line) { return 0; }
            @Override
            public int getColumnOffset(int line, int column) { return 0; }
        });
        JSDocInfo info = parseJSDoc("/** @type {string} */", associatedNode);
        assertNotNull(info);
        assertNotNull(info.getType());
        assertEquals("string", info.getType().getRoot().getString());
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
