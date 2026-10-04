```java
package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import com.google.common.collect.Sets;
import com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback;
import com.google.javascript.rhino.IR;
import com.google.javascript.rhino.Node;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class ProcessCommonJSModulesTest {
    // Dummy compiler for testing purposes.
    private static class MockCompiler extends AbstractCompiler {
        private Node root = IR.root();
        private List<CompilerInput> inputsInOrder = new ArrayList<>();
        private JSModuleGraph moduleGraph = new JSModuleGraph(new JSModule[0]);
        private ErrorManager errorManager = new BasicErrorManager() {
            @Override
            protected void format(JSError error) {}
            @Override
            public void println(CheckLevel level, CharSequence msg) {}
        };
        private CodingConvention codingConvention = new ClosureCodingConvention();
        private TypeValidator typeValidator = new TypeValidator(this);
        private JSTypeRegistry typeRegistry = new JSTypeRegistry(getDefaultErrorReporter());
        private Scope topScope = new Scope.Builder(IR.root()).build();
        private LifeCycleStage lifeCycleStage = LifeCycleStage.NORMALIZED;
        private Config parserConfig = new Config.Builder().build();
        private CssRenamingMap cssRenamingMap = null;
        private boolean haltingErrors = false;
        private boolean ideMode = false;
        private boolean acceptEcmaScript5 = true;
        private boolean acceptConstKeyword = true;
        private boolean typeCheckingEnabled = false;
        private boolean hasRegExpGlobalReferences = false;

        @Override
        public boolean shouldRunPass(String name) {
            return true;
        }

        @Override
        public void report(JSError error) {
            // no-op
        }

        @Override
        public void reportCodeChange() {
            // no-op
        }

        @Override
        public ErrorManager getErrorManager() {
            return errorManager;
        }

        @Override
        public CodingConvention getCodingConvention() {
            return codingConvention;
        }

        @Override
        public void process(CompilerPass pass) {
            pass.process(null, this.root);
        }

        @Override
        public void process(Node externs, Node root, JSModule module, String filename) {
             // Default implementation for testing.
        }

        @Override
        public Node getNodeForCodeInsertion(JSModule module) {
            return IR.root();
        }

        @Override
        public void throwInternalError(String msg, Exception cause) {
            throw new RuntimeException(msg, cause);
        }

        @Override
        public TypeValidator getTypeValidator() {
            return typeValidator;
        }

        @Override
        public ReverseAbstractInterpreter getReverseAbstractInterpreter() {
            return new NullIsUndefined(this);
        }

        @Override
        public JSTypeRegistry getTypeRegistry() {
            return typeRegistry;
        }

        @Override
        public JSModuleGraph getModuleGraph() {
            return moduleGraph;
        }

        @Override
        public List<CompilerInput> getInputsInOrder() {
            return inputsInOrder;
        }

        @Override
        public Scope getTopScope() {
            return topScope;
        }

        @Override
        public Node getRoot() {
            return this.root;
        }

        @Override
        public SourceFile getSourceFileByName(String sourceName) {
            return null;
        }

        @Override
        public CompilerInput getInput(InputId inputId) {
            return null;
        }

        @Override
        public CompilerInput newExternInput(String name) {
            return new CompilerInput(SourceFile.fromCode(name, ""));
        }

        @Override
        public Node parseSyntheticCode(String code) {
            return IR.root();
        }

        @Override
        public Node parseSyntheticCode(String filename, String code) {
            return IR.root();
        }

        @Override
        public Node parseTestCode(String code) {
            return IR.root();
        }

        @Override
        public String toSource(Node root) {
            return "";
        }

        @Override
        public ErrorReporter getDefaultErrorReporter() {
            return new ErrorReporter() {
                @Override
                public void report(CheckLevel level, JSError error) {}
                @Override
                public void generateReport() {}
            };
        }

        @Override
        public LifeCycleStage getLifeCycleStage() {
            return lifeCycleStage;
        }

        @Override
        public Supplier<String> getUniqueNameIdSupplier() {
            return () -> "unique";
        }

        @Override
        public boolean hasHaltingErrors() {
            return haltingErrors;
        }

        @Override
        public void addChangeHandler(CodeChangeHandler handler) {}

        @Override
        public void removeChangeHandler(CodeChangeHandler handler) {}

        @Override
        public boolean isIdeMode() {
            return ideMode;
        }

        @Override
        public boolean acceptEcmaScript5() {
            return acceptEcmaScript5;
        }

        @Override
        public boolean acceptConstKeyword() {
            return acceptConstKeyword;
        }

        @Override
        public Config getParserConfig() {
            return parserConfig;
        }

        @Override
        public boolean isTypeCheckingEnabled() {
            return typeCheckingEnabled;
        }

        @Override
        public void prepareAst(Node root) {}

        @Override
        public void setLifeCycleStage(LifeCycleStage stage) {
            this.lifeCycleStage = stage;
        }

        @Override
        public boolean areNodesEqualForInlining(Node n1, Node n2) {
            return false;
        }

        @Override
        public void setHasRegExpGlobalReferences(boolean references) {
            this.hasRegExpGlobalReferences = references;
        }

        @Override
        public boolean hasRegExpGlobalReferences() {
            return hasRegExpGlobalReferences;
        }

        @Override
        public CheckLevel getErrorLevel(JSError error) {
            return CheckLevel.ERROR;
        }

        @Override
        public void setCssRenamingMap(CssRenamingMap map) {
            this.cssRenamingMap = map;
        }

        @Override
        public CssRenamingMap getCssRenamingMap() {
            return cssRenamingMap;
        }

        @Override
        public Node parse(SourceFile file) {
            return IR.root();
        }
        
        // EnsureLibraryInjected is not implemented by default in AbstractCompiler, 
        // but is abstract in some contexts. Here it's not needed for these tests.
        @Override
        public void ensureLibraryInjected(String name) {}
    }

    private static class MockCompilerInput extends CompilerInput {
        private String name;
        private JSModule module;

        MockCompilerInput(String name, String code) {
            super(SourceFile.fromCode(name, code), name);
            this.name = name;
        }

        @Override
        public String getName() {
            return name;
        }
        @Override
        public JSModule getModule() {
            return module;
        }
        @Override
        public void setModule(JSModule module) {
            this.module = module;
        }

        public void addProvide(String provide) {}
        public void addRequire(String require) {}
    }

    private ProcessCommonJSModules createProcessor(String filenamePrefix, boolean reportDependencies) {
        return new ProcessCommonJSModules(new MockCompiler(), filenamePrefix, reportDependencies);
    }

    private NodeTraversal createTraversal(Node node, String sourceName) {
        NodeTraversal traversal = new NodeTraversal(new MockCompiler(), null);
        // Manually set source name and node for testing purposes.
        try {
            java.lang.reflect.Field field = NodeTraversal.class.getDeclaredField("current");
            field.setAccessible(true);
            field.set(traversal, node);

            field = NodeTraversal.class.getDeclaredField("currentTraversal");
            field.setAccessible(true);
            field.set(traversal, new NodeTraversal.Path(node, null));

            field = NodeTraversal.class.getDeclaredField("sourceName");
            field.setAccessible(true);
            field.set(traversal, sourceName);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return traversal;
    }

    @Test
    public void testToModuleNameBasic() {
        assertEquals("module$foo_bar", ProcessCommonJSModules.toModuleName("foo/bar"));
    }

    @Test
    public void testToModuleNameWithDotSlash() {
        assertEquals("module$foo_bar", ProcessCommonJSModules.toModuleName("./foo/bar"));
    }

    @Test
    public void testToModuleNameWithDotDotSlash() {
        assertEquals("module$bar", ProcessCommonJSModules.toModuleName("../bar"));
    }

    @Test
    public void testToModuleNameWithJsExtension() {
        assertEquals("module$foo_bar", ProcessCommonJSModules.toModuleName("foo/bar.js"));
    }

    @Test
    public void testToModuleNameWithDash() {
        assertEquals("module$foo_bar", ProcessCommonJSModules.toModuleName("foo-bar"));
    }

    @Test
    public void testToModuleNameComplex() {
        assertEquals("module$my_lib_utils_index", ProcessCommonJSModules.toModuleName("my-lib/utils/index.js"));
    }

    @Test
    public void testToModuleNameRelativeBasic() {
        assertEquals("module$bar", ProcessCommonJSModules.toModuleName("bar", "foo"));
    }

    @Test
    public void testToModuleNameRelativeWithDotSlash() {
        assertEquals("module$bar", ProcessCommonJSModules.toModuleName("./bar", "foo"));
    }

    @Test
    public void testToModuleNameRelativeWithDotDotSlash() {
        assertEquals("module$bar", ProcessCommonJSModules.toModuleName("../bar", "foo/baz"));
    }

    @Test
    public void testToModuleNameRelativeComplex() {
        assertEquals("module$my_lib_utils", ProcessCommonJSModules.toModuleName("my-lib/utils", "my-lib/foo"));
    }

    @Test
    public void testToModuleNameRelativeSameDir() {
        assertEquals("module$foo", ProcessCommonJSModules.toModuleName("foo", "bar"));
    }

    @Test
    public void testToModuleNameRelativeParentDir() {
        assertEquals("module$foo", ProcessCommonJSModules.toModuleName("foo", "bar/baz"));
    }

    @Test
    public void testNormalizeSourceNameBasic() {
        ProcessCommonJSModules processor = createProcessor("./", true);
        assertEquals("foo/bar", processor.normalizeSourceName("foo/bar"));
    }

    @Test
    public void testNormalizeSourceNameWithPrefix() {
        ProcessCommonJSModules processor = createProcessor("src/", true);
        assertEquals("foo/bar", processor.normalizeSourceName("src/foo/bar"));
    }

    @Test
    public void testNormalizeSourceNameWithTrailingSlash() {
        ProcessCommonJSModules processor = createProcessor("src/", true);
        assertEquals("foo/bar", processor.normalizeSourceName("src/foo/bar"));
    }

    @Test
    public void testNormalizeSourceNameWithBackslash() {
        ProcessCommonJSModules processor = createProcessor("src/", true);
        assertEquals("foo/bar", processor.normalizeSourceName("src\\foo\\bar"));
    }

    @Test
    public void testNormalizeSourceNameEmpty() {
        ProcessCommonJSModules processor = createProcessor("", true);
        assertEquals("", processor.normalizeSourceName(""));
    }

    @Test
    public void testProcessWithRequire() {
        Node root = IR.root();
        Node script = IR.script(
            IR.exprResult(IR.call(IR.name("require"), IR.string("foo")))
        );
        root.addChildToBack(script);
        script.setSourceFileName("test.js");

        ProcessCommonJSModules processor = createProcessor("", true);
        processor.process(null, root);

        // The original require call is replaced by a name node.
        assertEquals("module$foo", script.getChildAtIndex(0).getFirstChild().getString());
        // goog.require is added to the front of the script node.
        Node googRequire = script.getFirstChild();
        assertEquals("EXPR_RESULT", googRequire.getType());
        assertEquals("goog.require", googRequire.getFirstChild().getQualifiedName());
        assertEquals("module$foo", googRequire.getFirstChild().getLastChild().getString());
    }

    @Test
    public void testProcessWithModuleExports() {
        Node root = IR.root();
        Node script = IR.script(
            IR.exprResult(IR.assign(IR.getprop(IR.name("module"), IR.string("exports")), IR.string("foo")))
        );
        root.addChildToBack(script);
        script.setSourceFileName("test.js");

        ProcessCommonJSModules processor = createProcessor("", true);
        processor.process(null, root);

        Node assignNode = script.getFirstChild(); // The assignment node
        assertEquals("ASSIGN", assignNode.getType());
        Node left = assignNode.getFirstChild();
        assertEquals("GETPROP", left.getType());
        assertEquals("module$test", left.getFirstChild().getString());
        assertEquals("module$exports", left.getLastChild().getString());
        assertEquals("foo", assignNode.getLastChild().getString());
    }

    @Test
    public void testProcessWithGlobalVariableSuffixing() {
        Node root = IR.root();
        Node script = IR.script(
            IR.var(IR.name("foo"), IR.string("bar"))
        );
        root.addChildToBack(script);
        script.setSourceFileName("test.js");

        ProcessCommonJSModules processor = createProcessor("", true);
        processor.process(null, root);

        Node varNode = script.getFirstChild();
        assertEquals("VAR", varNode.getType());
        Node nameNode = varNode.getFirstChild();
        assertEquals("foo$$module$test", nameNode.getString());
    }

    @Test
    public void testProcessWithExportsInModuleExports() {
        Node root = IR.root();
        Node script = IR.script(
            IR.exprResult(IR.assign(IR.getprop(IR.name("module"), IR.string("exports")), IR.objectlit(IR.propdef(IR.string("a"), IR.string("1")))))
        );
        root.addChildToBack(script);
        script.setSourceFileName("test.js");

        ProcessCommonJSModules processor = createProcessor("", true);
        processor.process(null, root);

        Node topLevelNode = script.getFirstChild(); // This should be the IF node
        assertTrue(topLevelNode.isIf());
        Node condition = topLevelNode.getChildAtIndex(0);
        assertEquals("GETPROP", condition.getType());
        assertEquals("module$test", condition.getFirstChild().getString());
        assertEquals("module$exports", condition.getLastChild().getString());

        Node thenBranch = topLevelNode.getChildAtIndex(1); // This should be the BLOCK node
        assertTrue(thenBranch.isBlock());
        Node assignment = thenBranch.getFirstChild(); // This should be the EXPR_RESULT node
        assertTrue(assignment.isExprResult());
        Node assignedTo = assignment.getFirstChild().getFirstChild(); // The left side of assignment
        assertEquals("module$test", assignedTo.getFirstChild().getString());
        assertEquals("module$exports", assignedTo.getLastChild().getString());
    }

    @Test
    public void testProcessWithRequireAndModuleExports() {
        Node root = IR.root();
        Node script = IR.script(
            IR.exprResult(IR.call(IR.name("require"), IR.string("foo"))),
            IR.exprResult(IR.assign(IR.getprop(IR.name("module"), IR.string("exports")), IR.string("bar")))
        );
        root.addChildToBack(script);
        script.setSourceFileName("test.js");

        ProcessCommonJSModules processor = createProcessor("", true);
        processor.process(null, root);

        // Check goog.require is added as the first statement
        Node firstStmt = script.getFirstChild();
        assertEquals("EXPR_RESULT", firstStmt.getType());
        assertEquals("goog.require", firstStmt.getFirstChild().getQualifiedName());
        assertEquals("module$foo", firstStmt.getFirstChild().getLastChild().getString());

        // Check require call is rewritten as the second statement
        Node secondStmt = script.getChildAtIndex(1);
        assertEquals("EXPR_RESULT", secondStmt.getType());
        assertEquals("module$foo", secondStmt.getFirstChild().getString());

        // Check module.exports is rewritten as the third statement
        Node thirdStmt = script.getChildAtIndex(2);
        assertEquals("EXPR_RESULT", thirdStmt.getType());
        Node assignNode = thirdStmt.getFirstChild();
        assertEquals("ASSIGN", assignNode.getType());
        Node target = assignNode.getFirstChild();
        assertEquals("GETPROP", target.getType());
        assertEquals("module$test", target.getFirstChild().getString());
        assertEquals("module$exports", target.getLastChild().getString());
        assertEquals("bar", assignNode.getLastChild().getString());
    }

    @Test
    public void testProcessNoDependenciesReported() {
        Node root = IR.root();
        Node script = IR.script(
            IR.exprResult(IR.call(IR.name("require"), IR.string("foo")))
        );
        root.addChildToBack(script);
        script.setSourceFileName("test.js");

        ProcessCommonJSModules processor = createProcessor("", false); // reportDependencies = false
        processor.process(null, root);

        // Ensure no goog.require is added. The script should contain:
        // goog.provide("module$test");
        // var module$test = {};
        // module$foo; (the rewritten require call)
        assertEquals(3, script.getChildCount());
        Node provide = script.getChildAtIndex(0);
        assertEquals("EXPR_RESULT", provide.getType());
        assertEquals("goog.provide", provide.getFirstChild().getQualifiedName());

        Node varDecl = script.getChildAtIndex(1);
        assertEquals("VAR", varDecl.getType());
        assertEquals("module$test", varDecl.getFirstChild().getString());

        Node rewrittenRequire = script.getChildAtIndex(2);
        assertEquals("EXPR_RESULT", rewrittenRequire.getType());
        assertEquals("module$foo", rewrittenRequire.getFirstChild().getString());
    }

    @Test
    public void testProcessWithMultipleRequires() {
        Node root = IR.root();
        Node script = IR.script(
            IR.exprResult(IR.call(IR.name("require"), IR.string("foo"))),
            IR.exprResult(IR.call(IR.name("require"), IR.string("bar")))
        );
        root.addChildToBack(script);
        script.setSourceFileName("test.js");

        ProcessCommonJSModules processor = createProcessor("", true);
        processor.process(null, root);

        // The order of statements after processing should be:
        // goog.provide("module$test");
        // var module$test = {};
        // goog.require("module$foo");
        // module$foo;
        // goog.require("module$bar");
        // module$bar;

        assertEquals(6, script.getChildCount());
        // goog.provide
        assertEquals("EXPR_RESULT", script.getChildAtIndex(0).getType());
        assertEquals("goog.provide", script.getChildAtIndex(0).getFirstChild().getQualifiedName());
        // var module$test
        assertEquals("VAR", script.getChildAtIndex(1).getType());
        assertEquals("module$test", script.getChildAtIndex(1).getFirstChild().getString());
        // goog.require("module$foo")
        assertEquals("EXPR_RESULT", script.getChildAtIndex(2).getType());
        assertEquals("goog.require", script.getChildAtIndex(2).getFirstChild().getQualifiedName());
        assertEquals("module$foo", script.getChildAtIndex(2).getFirstChild().getLastChild().getString());
        // module$foo;
        assertEquals("EXPR_RESULT", script.getChildAtIndex(3).getType());
        assertEquals("module$foo", script.getChildAtIndex(3).getFirstChild().getString());
        // goog.require("module$bar")
        assertEquals("EXPR_RESULT", script.getChildAtIndex(4).getType());
        assertEquals("goog.require", script.getChildAtIndex(4).getFirstChild().getQualifiedName());
        assertEquals("module$bar", script.getChildAtIndex(4).getFirstChild().getLastChild().getString());
        // module$bar;
        assertEquals("EXPR_RESULT", script.getChildAtIndex(5).getType());
        assertEquals("module$bar", script.getChildAtIndex(5).getFirstChild().getString());
    }

    @Test
    public void testProcessWithExportsInModuleExportsIf() {
        Node root = IR.root();
        Node script = IR.script(
            IR.exprResult(IR.assign(IR.getprop(IR.name("module"), IR.string("exports")), IR.objectlit()))
        );
        root.addChildToBack(script);
        script.setSourceFileName("test.js");

        ProcessCommonJSModules processor = createProcessor("", true);
        processor.process(null, root);

        Node topLevelNode = script.getChildAtIndex(1); // The second statement after goog.provide and var.
        assertTrue(topLevelNode.isIf());
        Node condition = topLevelNode.getChildAtIndex(0);
        assertEquals("GETPROP", condition.getType());
        assertEquals("module$test", condition.getFirstChild().getString());
        assertEquals("module$exports", condition.getLastChild().getString());
    }

    @Test
    public void testProcessWithModuleExportsAndVariableDeclaration() {
        Node root = IR.root();
        Node script = IR.script(
            IR.var(IR.name("x"), IR.string("y")),
            IR.exprResult(IR.assign(IR.getprop(IR.name("module"), IR.string("exports")), IR.string("foo")))
        );
        root.addChildToBack(script);
        script.setSourceFileName("test.js");

        ProcessCommonJSModules processor = createProcessor("", true);
        processor.process(null, root);

        // The order of statements after processing should be:
        // goog.provide("module$test");
        // var module$test = {};
        // x$$module$test = "y"; (original var declaration)
        // goog.require("module$test"); // This might be added if there was a require call before.
        // module$test.module$exports = "foo"; (the module.exports assignment)

        // For this test, we only have a var and module.exports.
        // The var statement should be renamed.
        Node originalVar = script.getChildAtIndex(2); // After goog.provide and var module$test
        assertEquals("VAR", originalVar.getType());
        assertEquals("x$$module$test", originalVar.getFirstChild().getString());

        // The module.exports assignment should be processed correctly.
        Node moduleExportsAssign = script.getChildAtIndex(3); // After the renamed var.
        assertEquals("EXPR_RESULT", moduleExportsAssign.getType());
        Node assignNode = moduleExportsAssign.getFirstChild();
        assertEquals("ASSIGN", assignNode.getType());
        Node target = assignNode.getFirstChild();
        assertEquals("GETPROP", target.getType());
        assertEquals("module$test", target.getFirstChild().getString());
        assertEquals("module$exports", target.getLastChild().getString());
        assertEquals("foo", assignNode.getLastChild().getString());
    }

    @Test
    public void testToModuleNameWithEmptyString() {
        assertEquals("module$", ProcessCommonJSModules.toModuleName(""));
    }

    @Test
    public void testToModuleNameWithOnlyDotSlash() {
        assertEquals("module$", ProcessCommonJSModules.toModuleName("./"));
    }

    @Test
    public void testToModuleNameWithOnlyDotDotSlash() {
        assertEquals("module$", ProcessCommonJSModules.toModuleName("../"));
    }

    @Test
    public void testProcessWithRequireAndDirectModuleExportsAssignment() {
        Node root = IR.root();
        Node script = IR.script(
            IR.exprResult(IR.call(IR.name("require"), IR.string("util"))),
            IR.exprResult(IR.assign(IR.getprop(IR.name("module"), IR.string("exports")), IR.string("utils")))
        );
        root.addChildToBack(script);
        script.setSourceFileName("my_module.js");

        ProcessCommonJSModules processor = createProcessor("./", true);
        processor.process(null, root);

        // Order of statements in script node:
        // 1. goog.provide("module$my_module");
        // 2. var module$my_module = {};
        // 3. goog.require("module$util");
        // 4. module$util; (rewritten require call)
        // 5. module$my_module.module$exports = "utils"; (module.exports assignment)

        assertEquals(5, script.getChildCount());
        
        // Check goog.require("module$util");
        assertEquals("EXPR_RESULT", script.getChildAtIndex(2).getType());
        assertEquals("goog.require", script.getChildAtIndex(2).getFirstChild().getQualifiedName());
        assertEquals("module$util", script.getChildAtIndex(2).getFirstChild().getLastChild().getString());

        // Check require call is rewritten to module$util;
        assertEquals("EXPR_RESULT", script.getChildAtIndex(3).getType());
        assertEquals("module$util", script.getChildAtIndex(3).getFirstChild().getString());

        // Check module.exports is rewritten
        assertEquals("EXPR_RESULT", script.getChildAtIndex(4).getType());
        Node assignNode = script.getChildAtIndex(4).getFirstChild();
        Node target = assignNode.getFirstChild();
        assertEquals("GETPROP", target.getType());
        assertEquals("module$my_module", target.getFirstChild().getString());
        assertEquals("module$exports", target.getLastChild().getString());
        assertEquals("utils", assignNode.getLastChild().getString());
    }

    @Test
    public void testSuffixVarsCallback() throws Exception {
        ProcessCommonJSModules processor = createProcessor("my_prefix/", true);
        Node script = IR.script();
        NodeTraversal traversal = createTraversal(script, "test.js");
        ProcessCommonJSModules.SuffixVarsCallback callback = processor.new SuffixVarsCallback("module$test");

        // Test global variable renaming
        Node globalVar = IR.name("globalVar");
        globalVar.putBooleanProp(Node.IS_GLOBAL, true); // Mark as global
        Node nameNode = IR.name("globalVar");
        nameNode.putBooleanProp(Node.IS_GLOBAL, true);
        callback.visit(traversal, nameNode, null);
        assertEquals("globalVar$$module$test", nameNode.getString());

        // Test 'exports' renaming
        Node exportsName = IR.name("exports");
        callback.visit(traversal, exportsName, null);
        assertEquals("module$test", exportsName.getString());
        assertEquals("exports", exportsName.getProp(Node.ORIGINALNAME_PROP));

        // Test module name itself is not renamed
        Node moduleName = IR.name("module$test");
        callback.visit(traversal, moduleName, null);
        assertEquals("module$test", moduleName.getString());
    }
}
```