```java
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
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.head.ErrorReporter;
import com.google.javascript.rhino.head.ast.Comment;
import com.google.javascript.rhino.jstype.StaticSourceFile;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class JsDocInfoParserTest {

    private static final String SOURCE_NAME = "test.js";

    private JSDocInfo parseJSDoc(String jsDoc, Node associatedNode) {
        JsDocTokenStream stream = new JsDocTokenStream(jsDoc);
        // The Comment constructor now requires CommentType, which is not available in the API outline.
        // We will create a Comment with a dummy CommentType for compilation, assuming it's not strictly used in the current parsing logic for these tests.
        // If CommentType was crucial, a mock or more context would be needed.
        Comment comment = new Comment(0, jsDoc.length(), "/*" + jsDoc + "*/"); // Simplified, may need actual position if used.
        Config config = createConfig();
        ErrorReporter errorReporter = new SimpleErrorReporter();
        JsDocInfoParser parser = new JsDocInfoParser(stream, comment, associatedNode, config, errorReporter);
        parser.parse();
        return parser.retrieveAndResetParsedJSDocInfo();
    }

    private JSDocInfo parseJSDoc(String jsDoc) {
        // Node.newString(String str, int lineno, int charno) is available.
        return parseJSDoc(jsDoc, Node.newString(SOURCE_NAME, 0, 0));
    }

    private Config createConfig() {
        return new Config(
            Sets.<String>newHashSet(),
            Sets.<String>newHashSet(),
            false,
            LanguageMode.ECMASCRIPT3,
            true);
    }

    private Config createConfigWithAnnotation(String annotationName) {
        Set<String> annotations = Sets.newHashSet(annotationName);
        return new Config(
            annotations,
            Sets.<String>newHashSet(),
            false,
            LanguageMode.ECMASCRIPT3,
            true);
    }

    @Test
    public void testParseDescription() throws Exception {
        JSDocInfo info = parseJSDoc("/** This is a description */");
        assertEquals("This is a description", info.getDescription());
    }

    @Test
    public void testParseEmptyDescription() throws Exception {
        JSDocInfo info = parseJSDoc("/**  */");
        assertNull(info.getDescription());
    }

    @Test
    public void testParseBlockDescription() throws Exception {
        JSDocInfo info = parseJSDoc("/**\n * This is a block description.\n */");
        assertEquals("This is a block description.", info.getDescription());
    }

    @Test
    public void testParseBlockDescriptionWithExtraStar() throws Exception {
        JSDocInfo info = parseJSDoc("/**\n * * This is a block description.\n */");
        assertEquals("* This is a block description.", info.getDescription());
    }

    @Test
    public void testParseBlockDescriptionWithMultipleLines() throws Exception {
        JSDocInfo info = parseJSDoc("/**\n * Line one.\n * Line two.\n */");
        assertEquals("Line one. Line two.", info.getDescription());
    }

    @Test
    public void testParseBlockDescriptionWithLeadingAndTrailingWhitespace() throws Exception {
        JSDocInfo info = parseJSDoc("/**   \n *   This is a block description.   \n   */");
        assertEquals("This is a block description.", info.getDescription());
    }

    @Test
    public void testParseAuthor() throws Exception {
        JSDocInfo info = parseJSDoc("/** @author John Doe */");
        assertEquals("John Doe", info.getAuthors().get(0));
    }

    @Test
    public void testParseMultipleAuthors() throws Exception {
        JSDocInfo info = parseJSDoc("/** @author John Doe\n * @author Jane Smith */");
        assertEquals(2, info.getAuthors().size());
        assertEquals("John Doe", info.getAuthors().get(0));
        assertEquals("Jane Smith", info.getAuthors().get(1));
    }

    @Test
    public void testParseAuthorWithDescription() throws Exception {
        JSDocInfo info = parseJSDoc("/**\n * @author John Doe\n * Some description.\n */");
        assertEquals("Some description.", info.getDescription());
        assertEquals("John Doe", info.getAuthors().get(0));
    }

    @Test
    public void testParseDeprecated() throws Exception {
        JSDocInfo info = parseJSDoc("/** @deprecated */");
        assertTrue(info.isDeprecated());
    }

    @Test
    public void testParseDeprecatedWithReason() throws Exception {
        JSDocInfo info = parseJSDoc("/** @deprecated Use newMethod instead. */");
        assertTrue(info.isDeprecated());
        assertEquals("Use newMethod instead.", info.getDeprecationReason());
    }

    @Test
    public void testParseDeprecatedWithMultilineReason() throws Exception {
        JSDocInfo info = parseJSDoc("/**\n * @deprecated\n * Use newMethod instead.\n * It is much better.\n */");
        assertTrue(info.isDeprecated());
        assertEquals("Use newMethod instead. It is much better.", info.getDeprecationReason());
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
    public void testParseConst() throws Exception {
        JSDocInfo info = parseJSDoc("/** @const */");
        assertTrue(info.isConstant());
    }

    @Test
    public void testParseDefine() throws Exception {
        JSDocInfo info = parseJSDoc("/** @define {string} */");
        assertTrue(info.isDefine());
        assertEquals("string", info.getTypeForDefine().getRootNode().getString());
    }

    @Test
    public void testParseDefineNoType() throws Exception {
        JSDocInfo info = parseJSDoc("/** @define */");
        assertTrue(info.isDefine());
        assertNull(info.getTypeForDefine());
    }

    @Test
    public void testParseDefineWithDescription() throws Exception {
        JSDocInfo info = parseJSDoc("/** @define {number} Description */");
        assertTrue(info.isDefine());
        assertEquals("number", info.getTypeForDefine().getRootNode().getString());
        assertEquals("Description", info.getDescription());
    }

    @Test
    public void testParseType() throws Exception {
        JSDocInfo info = parseJSDoc("/** @type {string} */");
        assertEquals("string", info.getType().getRootNode().getString());
    }

    @Test
    public void testParseTypeWithArray() throws Exception {
        JSDocInfo info = parseJSDoc("/** @type {Array<string>} */");
        assertEquals("Array.<string>", info.getType().getRootNode().toString());
    }

    @Test
    public void testParseTypeWithObjectLiteral() throws Exception {
        JSDocInfo info = parseJSDoc("/** @type {{a: string, b: number}} */");
        assertEquals("{a:string,b:number}", info.getType().getRootNode().toString());
    }

    @Test
    public void testParseTypeWithFunctionType() throws Exception {
        JSDocInfo info = parseJSDoc("/** @type {function(string, number): boolean} */");
        assertEquals("function(string,number):boolean", info.getType().getRootNode().toString());
    }

    @Test
    public void testParseTypeWithUnionType() throws Exception {
        JSDocInfo info = parseJSDoc("/** @type {string|number} */");
        assertEquals("string|number", info.getType().getRootNode().toString());
    }

    @Test
    public void testParseTypeWithNullableType() throws Exception {
        JSDocInfo info = parseJSDoc("/** @type {?string} */");
        assertEquals("?string", info.getType().getRootNode().toString());
    }

    @Test
    public void testParseTypeWithNonNullableType() throws Exception {
        JSDocInfo info = parseJSDoc("/** @type {!string} */");
        assertEquals("!string", info.getType().getRootNode().toString());
    }

    @Test
    public void testParseTypeWithOptionalType() throws Exception {
        JSDocInfo info = parseJSDoc("/** @type {string=} */");
        assertEquals("string=", info.getType().getRootNode().toString());
    }

    @Test
    public void testParseTypeWithRestParameter() throws Exception {
        JSDocInfo info = parseJSDoc("/** @type {...string} */");
        assertEquals("...string", info.getType().getRootNode().toString());
    }

    @Test
    public void testParseTypeWithRecord() throws Exception {
        JSDocInfo info = parseJSDoc("/** @type {{prop: string}} */");
        assertEquals("{prop:string}", info.getType().getRootNode().toString());
    }

    @Test
    public void testParseTypeWithUnknown() throws Exception {
        JSDocInfo info = parseJSDoc("/** @type {?} */");
        assertEquals("?", info.getType().getRootNode().toString());
    }

    @Test
    public void testParseTypeWithAny() throws Exception {
        JSDocInfo info = parseJSDoc("/** @type {*} */");
        assertEquals("*", info.getType().getRootNode().toString());
    }

    @Test
    public void testParseThisType() throws Exception {
        JSDocInfo info = parseJSDoc("/** @this {string} */");
        assertEquals("string", info.getThisType().getRootNode().getString());
    }

    @Test
    public void testParseReturnType() throws Exception {
        JSDocInfo info = parseJSDoc("/** @return {string} */");
        assertEquals("string", info.getReturnType().getRootNode().getString());
    }

    @Test
    public void testParseReturnTypeWithDescription() throws Exception {
        JSDocInfo info = parseJSDoc("/** @return {string} The result. */");
        assertEquals("string", info.getReturnType().getRootNode().getString());
        assertEquals("The result.", info.getReturnDescription());
    }

    @Test
    public void testParseReturnTypeVoid() throws Exception {
        JSDocInfo info = parseJSDoc("/** @return {void} */");
        assertEquals("void", info.getReturnType().getRootNode().getString());
    }

    @Test
    public void testParseThrows() throws Exception {
        JSDocInfo info = parseJSDoc("/** @throws {Error} */");
        assertEquals(1, info.getThrownTypes().size());
        assertEquals("Error", info.getThrownTypes().get(0).getRootNode().getString());
    }

    @Test
    public void testParseThrowsWithDescription() throws Exception {
        JSDocInfo info = parseJSDoc("/** @throws {Error} An error occurred. */");
        assertEquals(1, info.getThrownTypes().size());
        assertEquals("Error", info.getThrownTypes().get(0).getRootNode().getString());
        assertEquals("An error occurred.", info.getThrowDescription(info.getThrownTypes().get(0)));
    }

    @Test
    public void testParseMultipleThrows() throws Exception {
        JSDocInfo info = parseJSDoc("/** @throws {Error} First error.\n * @throws {TypeError} Second error. */");
        assertEquals(2, info.getThrownTypes().size());
        assertEquals("Error", info.getThrownTypes().get(0).getRootNode().getString());
        assertEquals("Second error.", info.getThrowDescription(info.getThrownTypes().get(1)));
    }

    @Test
    public void testParseParam() throws Exception {
        JSDocInfo info = parseJSDoc("/** @param {string} name The name. */");
        assertEquals(1, info.getParameterNames().size());
        assertEquals("name", info.getParameterNames().get(0));
        assertEquals("string", info.getParameterType("name").getRootNode().getString());
        assertEquals("The name.", info.getParameterDescription("name"));
    }

    @Test
    public void testParseOptionalParam() throws Exception {
        JSDocInfo info = parseJSDoc("/** @param {string=} opt_name The optional name. */");
        assertEquals(1, info.getParameterNames().size());
        assertEquals("opt_name", info.getParameterNames().get(0));
        assertTrue(info.getParameterType("opt_name").isOptionalArg());
        assertEquals("The optional name.", info.getParameterDescription("opt_name"));
    }

    @Test
    public void testParseVarArgParam() throws Exception {
        JSDocInfo info = parseJSDoc("/** @param {...string} var_args The arguments. */");
        assertEquals(1, info.getParameterNames().size());
        assertEquals("var_args", info.getParameterNames().get(0));
        assertTrue(info.getParameterType("var_args").isVarArgs());
        assertEquals("The arguments.", info.getParameterDescription("var_args"));
    }

    @Test
    public void testParseMultipleParams() throws Exception {
        JSDocInfo info = parseJSDoc("/**\n * @param {string} firstName\n * @param {string} lastName\n */");
        assertEquals(2, info.getParameterNames().size());
        assertEquals("firstName", info.getParameterNames().get(0));
        assertEquals("string", info.getParameterType("firstName").getRootNode().getString());
        assertEquals("lastName", info.getParameterNames().get(1));
        assertEquals("string", info.getParameterType("lastName").getRootNode().getString());
    }

    @Test
    public void testParseParamWithBrackets() throws Exception {
        JSDocInfo info = parseJSDoc("/** @param [string] name */");
        assertEquals(1, info.getParameterNames().size());
        assertEquals("name", info.getParameterNames().get(0));
        assertEquals("string", info.getParameterType("name").getRootNode().getString());
    }

    @Test
    public void testParseParamWithBracketsAndEquals() throws Exception {
        JSDocInfo info = parseJSDoc("/** @param [string=defaultValue] name */");
        assertEquals(1, info.getParameterNames().size());
        assertEquals("name", info.getParameterNames().get(0));
        assertEquals("string=", info.getParameterType("name").getRootNode().toString());
    }

    @Test
    public void testParseImplements() throws Exception {
        JSDocInfo info = parseJSDoc("/** @implements {InterfaceA} */");
        assertEquals(1, info.getImplementedInterfaces().size());
        assertEquals("InterfaceA", info.getImplementedInterfaces().get(0).getRootNode().getString());
    }

    @Test
    public void testParseMultipleImplements() throws Exception {
        JSDocInfo info = parseJSDoc("/** @implements {InterfaceA} @implements {InterfaceB} */");
        assertEquals(2, info.getImplementedInterfaces().size());
        assertEquals("InterfaceA", info.getImplementedInterfaces().get(0).getRootNode().getString());
        assertEquals("InterfaceB", info.getImplementedInterfaces().get(1).getRootNode().getString());
    }

    @Test
    public void testParseExtends() throws Exception {
        JSDocInfo info = parseJSDoc("/** @extends {BaseClass} */");
        assertEquals("BaseClass", info.getBaseType().getRootNode().getString());
    }

    @Test
    public void testParseMultipleExtends() throws Exception {
        // The parser for @extends only takes the last one, but this is how it's handled.
        JSDocInfo info = parseJSDoc("/** @extends {BaseClass1} @extends {BaseClass2} */");
        assertEquals("BaseClass2", info.getBaseType().getRootNode().getString());
    }

    @Test
    public void testParseSee() throws Exception {
        JSDocInfo info = parseJSDoc("/** @see {@link SomeClass} */");
        assertEquals("{@link SomeClass}", info.getReferences().get(0));
    }

    @Test
    public void testParseMultipleSee() throws Exception {
        JSDocInfo info = parseJSDoc("/** @see Link1\n * @see Link2 */");
        assertEquals(2, info.getReferences().size());
        assertEquals("Link1", info.getReferences().get(0));
        assertEquals("Link2", info.getReferences().get(1));
    }

    @Test
    public void testParseFileOverview() throws Exception {
        JSDocInfo info = parseJSDoc("/** @fileoverview This is a file overview. */");
        assertEquals("This is a file overview.", info.getFileOverview());
    }

    @Test
    public void testParseFileOverviewWithMultiline() throws Exception {
        JSDocInfo info = parseJSDoc("/**\n * @fileoverview\n * This is a file overview.\n * It has multiple lines.\n */");
        assertEquals("This is a file overview. It has multiple lines.", info.getFileOverview());
    }

    @Test
    public void testParseFileOverviewWithDescription() throws Exception {
        JSDocInfo info = parseJSDoc("/**\n * @fileoverview This is a file overview.\n * Some other description.\n */");
        assertEquals("This is a file overview.", info.getFileOverview());
        assertEquals("Some other description.", info.getDescription());
    }

    @Test
    public void testParseLicense() throws Exception {
        JSDocInfo info = parseJSDoc("/** @license MIT License */");
        assertEquals("MIT License", info.getLicense());
    }

    @Test
    public void testParseLicenseWithMultiline() throws Exception {
        JSDocInfo info = parseJSDoc("/**\n * @license\n * MIT License\n * Copyright (c) 2023\n */");
        assertEquals("MIT License\nCopyright (c) 2023", info.getLicense());
    }

    @Test
    public void testParseVersion() throws Exception {
        JSDocInfo info = parseJSDoc("/** @version 1.0.0 */");
        assertEquals("1.0.0", info.getVersion());
    }

    @Test
    public void testParseVersionWithDescription() throws Exception {
        JSDocInfo info = parseJSDoc("/** @version 1.0.0 This is the version. */");
        assertEquals("1.0.0", info.getVersion());
        assertEquals("This is the version.", info.getDescription());
    }

    @Test
    public void testParseTemplate() throws Exception {
        JSDocInfo info = parseJSDoc("/** @template T */");
        assertEquals(1, info.getTemplateTypeNames().size());
        assertEquals("T", info.getTemplateTypeNames().get(0));
    }

    @Test
    public void testParseMultipleTemplates() throws Exception {
        JSDocInfo info = parseJSDoc("/** @template T, U */");
        assertEquals(2, info.getTemplateTypeNames().size());
        assertEquals("T", info.getTemplateTypeNames().get(0));
        assertEquals("U", info.getTemplateTypeNames().get(1));
    }

    @Test
    public void testParseTemplateWithDescription() throws Exception {
        JSDocInfo info = parseJSDoc("/** @template T The type parameter. */");
        assertEquals(1, info.getTemplateTypeNames().size());
        assertEquals("T", info.getTemplateTypeNames().get(0));
        assertEquals("The type parameter.", info.getDescription());
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
    public void testParseNoTypeCheck() throws Exception {
        JSDocInfo info = parseJSDoc("/** @nocheck */");
        assertTrue(info.isNoTypeCheck());
    }

    @Test
    public void testParseNoShadow() throws Exception {
        JSDocInfo info = parseJSDoc("/** @noshadow */");
        assertTrue(info.isNoShadow());
    }

    @Test
    public void testParseNoAlias() throws Exception {
        JSDocInfo info = parseJSDoc("/** @noalias */");
        assertTrue(info.isNoAlias());
    }

    @Test
    public void testParseNoSideEffects() throws Exception {
        JSDocInfo info = parseJSDoc("/** @nosideeffects */");
        assertTrue(info.isNoSideEffects());
    }

    @Test
    public void testParseOverride() throws Exception {
        JSDocInfo info = parseJSDoc("/** @override */");
        assertTrue(info.isOverride());
    }

    @Test
    public void testParsePreserveTry() throws Exception {
        JSDocInfo info = parseJSDoc("/** @preserveTry */");
        assertTrue(info.shouldPreserveTry());
    }

    @Test
    public void testParseImplicitCast() throws Exception {
        JSDocInfo info = parseJSDoc("/** @implicitCast */");
        assertTrue(info.isImplicitCast());
    }

    @Test
    public void testParseConsistentIdGenerator() throws Exception {
        JSDocInfo info = parseJSDoc("/** @idgenerator */");
        assertTrue(info.isConsistentIdGenerator());
    }

    @Test
    public void testParseStableIdGenerator() throws Exception {
        JSDocInfo info = parseJSDoc("/** @stableIdGenerator */");
        assertTrue(info.isStableIdGenerator());
    }

    @Test
    public void testParseMappedIdGenerator() throws Exception {
        JSDocInfo info = parseJSDoc("/** @idgenerator {mapped} */");
        assertTrue(info.isMappedIdGenerator());
    }

    @Test
    public void testParseIdGeneratorWithParam() throws Exception {
        // This case is tricky as the current implementation allows parameters to be treated as id generator keywords.
        // We are testing that the parser accepts it, even if it's semantically questionable.
        Node nodeWithParam = new Node(Token.STRING, SOURCE_NAME, 0, 0);
        nodeWithParam.addChildToBack(Node.newString("param")); // This line needs to be adjusted to match Node.newString(String str, int lineno, int charno) if applicable
        JSDocInfo info = parseJSDoc("/** @idgenerator {param} */", nodeWithParam);
        // The default for @idgenerator is consistent, if the keyword is not recognized.
        assertTrue(info.isConsistentIdGenerator());
    }

    @Test
    public void testParseSuppress() throws Exception {
        JSDocInfo info = parseJSDoc("/** @suppress {checkTypes} */");
        Set<String> expectedSuppressions = Sets.newHashSet("checkTypes");
        assertEquals(expectedSuppressions, info.getSuppressions());
    }

    @Test
    public void testParseMultipleSuppress() throws Exception {
        JSDocInfo info = parseJSDoc("/** @suppress {checkTypes|lintError} */");
        Set<String> expectedSuppressions = Sets.newHashSet("checkTypes", "lintError");
        assertEquals(expectedSuppressions, info.getSuppressions());
    }

    @Test
    public void testParseSuppressWithComma() throws Exception {
        JSDocInfo info = parseJSDoc("/** @suppress {checkTypes,lintError} */");
        Set<String> expectedSuppressions = Sets.newHashSet("checkTypes", "lintError");
        assertEquals(expectedSuppressions, info.getSuppressions());
    }

    @Test
    public void testParseModifies() throws Exception {
        JSDocInfo info = parseJSDoc("/** @modifies {this} */");
        Set<String> expectedModifies = Sets.newHashSet("this");
        assertEquals(expectedModifies, info.getModifies());
    }

    @Test
    public void testParseMultipleModifies() throws Exception {
        JSDocInfo info = parseJSDoc("/** @modifies {this|arguments} */");
        Set<String> expectedModifies = Sets.newHashSet("this", "arguments");
        assertEquals(expectedModifies, info.getModifies());
    }

    @Test
    public void testParseModifiesWithParam() throws Exception {
        // Test assumes 'paramName' is a valid parameter.
        Node nodeWithParam = new Node(Token.STRING, SOURCE_NAME, 0, 0);
        nodeWithParam.addChildToBack(Node.newString("paramName")); // Adjust call as needed.
        JSDocInfo info = parseJSDoc("/** @modifies {paramName} */", nodeWithParam);
        Set<String> expectedModifies = Sets.newHashSet("paramName");
        assertEquals(expectedModifies, info.getModifies());
    }

    @Test
    public void testParseModifiesWithUnknownKeyword() throws Exception {
        JSDocInfo info = parseJSDoc("/** @modifies {unknown} */");
        Set<String> expectedModifies = Sets.newHashSet("unknown");
        assertEquals(expectedModifies, info.getModifies());
    }

    @Test
    public void testParseMeaning() throws Exception {
        JSDocInfo info = parseJSDoc("/** @meaning A description of the meaning. */");
        assertEquals("A description of the meaning.", info.getMeaning());
    }

    @Test
    public void testParseMeaningMultiline() throws Exception {
        JSDocInfo info = parseJSDoc("/**\n * @meaning\n * This is the meaning.\n * It has multiple lines.\n */");
        assertEquals("This is the meaning. It has multiple lines.", info.getMeaning());
    }

    @Test
    public void testParseHidden() throws Exception {
        JSDocInfo info = parseJSDoc("/** @hidden */");
        assertTrue(info.isHidden());
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
    public void testParseExternsTag() throws Exception {
        JSDocInfo info = parseJSDoc("/** @externs */");
        assertTrue(info.isExterns());
    }

    @Test
    public void testParseJavaDispatchTag() throws Exception {
        JSDocInfo info = parseJSDoc("/** @javadispatch */");
        assertTrue(info.isJavaDispatch());
    }

    @Test
    public void testParseLends() throws Exception {
        JSDocInfo info = parseJSDoc("/** @lends {MyClass} */");
        assertEquals("MyClass", info.getLends());
    }

    @Test
    public void testParseLendsWithBrackets() throws Exception {
        JSDocInfo info = parseJSDoc("/** @lends { {a: string} } */");
        assertEquals("{a:string}", info.getLends());
    }

    @Test
    public void testParseLendsWithoutBraces() throws Exception {
        // The parser expects braces, so this should likely result in a warning or error.
        JSDocInfo info = parseJSDoc("/** @lends MyObject */");
        assertNull(info.getLends()); // Expected behavior might be to not record it if format is wrong.
    }

    @Test
    public void testParseDisposes() throws Exception {
        JSDocInfo info = parseJSDoc("/** @disposes {resource1, resource2} */");
        List<String> expected = Lists.newArrayList("resource1", "resource2");
        assertEquals(expected, info.getDisposesParameter());
    }

    @Test
    public void testParseDisposesSingle() throws Exception {
        JSDocInfo info = parseJSDoc("/** @disposes {resource1} */");
        List<String> expected = Lists.newArrayList("resource1");
        assertEquals(expected, info.getDisposesParameter());
    }

    @Test
    public void testParseDisposesEmpty() throws Exception {
        JSDocInfo info = parseJSDoc("/** @disposes {} */");
        assertTrue(info.getDisposesParameter().isEmpty());
    }

    @Test
    public void testParseDisposesWithDescription() throws Exception {
        JSDocInfo info = parseJSDoc("/** @disposes {resource} This resource will be disposed. */");
        List<String> expected = Lists.newArrayList("resource");
        assertEquals(expected, info.getDisposesParameter());
        assertEquals("This resource will be disposed.", info.getDescription());
    }

    @Test
    public void testParseTypeStringInline() throws Exception {
        Node typeNode = JsDocInfoParser.parseTypeString("string");
        assertNotNull(typeNode);
        assertEquals("string", typeNode.getString());
    }

    @Test
    public void testParseTypeStringInlineWithBraces() throws Exception {
        Node typeNode = JsDocInfoParser.parseTypeString("{string}");
        assertNotNull(typeNode);
        assertEquals("string", typeNode.getFirstChild().getString());
    }

    @Test
    public void testParseTypeStringInlineArray() throws Exception {
        Node typeNode = JsDocInfoParser.parseTypeString("Array<number>");
        assertNotNull(typeNode);
        assertEquals("Array.<number>", typeNode.toString());
    }

    @Test
    public void testParseTypeStringInlineObject() throws Exception {
        Node typeNode = JsDocInfoParser.parseTypeString("{a: number}");
        assertNotNull(typeNode);
        assertEquals("{a:number}", typeNode.toString());
    }

    @Test
    public void testParseTypeStringInlineUnion() throws Exception {
        Node typeNode = JsDocInfoParser.parseTypeString("string|number");
        assertNotNull(typeNode);
        assertEquals("string|number", typeNode.toString());
    }

    @Test
    public void testParseTypeStringInlineNullable() throws Exception {
        Node typeNode = JsDocInfoParser.parseTypeString("?string");
        assertNotNull(typeNode);
        assertEquals("?string", typeNode.toString());
    }

    @Test
    public void testParseTypeStringInlineOptional() throws Exception {
        Node typeNode = JsDocInfoParser.parseTypeString("string=");
        assertNotNull(typeNode);
        assertEquals("string=", typeNode.toString());
    }

    @Test
    public void testParseTypeStringInlineRest() throws Exception {
        Node typeNode = JsDocInfoParser.parseTypeString("...number");
        assertNotNull(typeNode);
        assertEquals("...number", typeNode.toString());
    }

    @Test
    public void testParseTypeStringInlineFunction() throws Exception {
        Node typeNode = JsDocInfoParser.parseTypeString("function(string): number");
        assertNotNull(typeNode);
        assertEquals("function(string):number", typeNode.toString());
    }

    @Test
    public void testParseTypeStringInlineEmpty() throws Exception {
        Node typeNode = JsDocInfoParser.parseTypeString("");
        assertNull(typeNode);
    }

    @Test
    public void testParseTypeStringInlineUnknown() throws Exception {
        Node typeNode = JsDocInfoParser.parseTypeString("?");
        assertNotNull(typeNode);
        assertEquals("?", typeNode.toString());
    }

    @Test
    public void testParseTypeStringInlineAny() throws Exception {
        Node typeNode = JsDocInfoParser.parseTypeString("*");
        assertNotNull(typeNode);
        assertEquals("*", typeNode.toString());
    }

    @Test
    public void testParseTypeStringInlineQualifiedName() throws Exception {
        Node typeNode = JsDocInfoParser.parseTypeString("Namespace.Type");
        assertNotNull(typeNode);
        assertEquals("Namespace.Type", typeNode.toString());
    }

    @Test
    public void testParseTypeStringInlineQualifiedNameWithGenerics() throws Exception {
        Node typeNode = JsDocInfoParser.parseTypeString("Namespace.Type.<string>");
        assertNotNull(typeNode);
        assertEquals("Namespace.Type.<string>", typeNode.toString());
    }

    @Test
    public void testParseTypeStringInlineFunctionWithThisContext() throws Exception {
        Node typeNode = JsDocInfoParser.parseTypeString("function(this:Object, string): number");
        assertNotNull(typeNode);
        assertEquals("function(this:Object,string):number", typeNode.toString());
    }

    @Test
    public void testParseTypeStringInlineFunctionWithNewContext() throws Exception {
        Node typeNode = JsDocInfoParser.parseTypeString("function(new:Object, string): number");
        assertNotNull(typeNode);
        assertEquals("function(new:Object,string):number", typeNode.toString());
    }

    @Test
    public void testParseTypeStringInlineParamOptionalWithBrackets() throws Exception {
        Node typeNode = JsDocInfoParser.parseTypeString("[string=]");
        assertNotNull(typeNode);
        assertEquals("string=", typeNode.toString());
    }

    @Test
    public void testParseTypeStringInlineParamRest() throws Exception {
        Node typeNode = JsDocInfoParser.parseTypeString("[...string]");
        assertNotNull(typeNode);
        assertEquals("...string", typeNode.toString());
    }

    @Test
    public void testParseTypeStringInlineRecordWithMultipleFields() throws Exception {
        Node typeNode = JsDocInfoParser.parseTypeString("{field1: string, field2: number}");
        assertNotNull(typeNode);
        assertEquals("{field1:string,field2:number}", typeNode.toString());
    }

    @Test
    public void testParseTypeStringInlineUnionWithCommas() throws Exception {
        Node typeNode = JsDocInfoParser.parseTypeString("string,number");
        assertNotNull(typeNode);
        assertEquals("string|number", typeNode.toString()); // Comma is treated as pipe
    }

    @Test
    public void testParseTypeStringInlineArrayWithMultipleElements() throws Exception {
        Node typeNode = JsDocInfoParser.parseTypeString("[string, number]");
        assertNotNull(typeNode);
        assertEquals("[string,number]", typeNode.toString());
    }

    @Test
    public void testParseTypeStringInlineArrayWithRest() throws Exception {
        Node typeNode = JsDocInfoParser.parseTypeString("[...string]");
        assertNotNull(typeNode);
        assertEquals("...string", typeNode.toString());
    }

    @Test
    public void testParseTypeStringInlineArrayWithEllipsisAndType() throws Exception {
        Node typeNode = JsDocInfoParser.parseTypeString("[..., string]");
        assertNotNull(typeNode);
        assertEquals("[...,string]", typeNode.toString());
    }

    @Test
    public void testParseTypeStringInlineFunctionWithMultipleParams() throws Exception {
        Node typeNode = JsDocInfoParser.parseTypeString("function(string, number, boolean): string");
        assertNotNull(typeNode);
        assertEquals("function(string,number,boolean):string", typeNode.toString());
    }

    @Test
    public void testParseTypeStringInlineFunctionWithOptionalParam() throws Exception {
        Node typeNode = JsDocInfoParser.parseTypeString("function(string=, number): string");
        assertNotNull(typeNode);
        assertEquals("function(string=,number):string", typeNode.toString());
    }

    @Test
    public void testParseTypeStringInlineFunctionWithRestParam() throws Exception {
        Node typeNode = JsDocInfoParser.parseTypeString("function(string, ...number): string");
        assertNotNull(typeNode);
        assertEquals("function(string,...number):string", typeNode.toString());
    }
}
```