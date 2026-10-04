```java
package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.javascript.jscomp.CodingConvention.DelegateRelationship;
import com.google.javascript.jscomp.CodingConvention.ObjectLiteralCast;
import com.google.javascript.jscomp.CodingConvention.SubclassRelationship;
import com.google.javascript.jscomp.CodingConvention.SubclassType;
import com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents;
import com.google.javascript.jscomp.NodeTraversal.AbstractScopedCallback;
import com.google.javascript.jscomp.NodeTraversal.AbstractShallowStatementCallback;
import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.InputId;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.EnumType;
import com.google.javascript.rhino.jstype.FunctionParamBuilder;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

// Mock compiler and related classes for testing TypedScopeCreator
class MockCompiler implements AbstractCompiler {
    private final CodingConvention convention;
    private final JSTypeRegistry registry;
    private final Map<String, ?> messages = Maps.newHashMap();

    MockCompiler(CodingConvention convention, JSTypeRegistry registry) {
        this.convention = convention;
        this.registry = registry;
    }

    @Override
    public Node parse(String code) {
        // Simplified parsing for testing. A real parser would be complex.
        // For now, we'll assume a simple structure can be created.
        // This mock assumes the input is a simple script or expression.
        // A full implementation would involve Rhinoceros's parser.
        // For this specific test, we'll just create a basic NODE.
        Node node = new Node(Token.SCRIPT);
        // Mock parsing: This is a very basic mock and won't handle complex JS.
        // For the purpose of testing TypedScopeCreator, we need a Node that can be traversed.
        // A more robust mock would integrate with a real JS parser.
        // Example: If code is "var a = 1;", we might want a VAR node with a NAME 'a' and a NUMBER '1'.
        // For simplicity, we'll create a placeholder.
        if (code.contains("var")) {
            Node varNode = new Node(Token.VAR);
            Node nameNode = new Node(Token.NAME, 1); // Assume line number 1
            nameNode.setString(code.substring(code.indexOf("var") + 3, code.indexOf("=")).trim());
            varNode.addChildToBack(nameNode);
            node.addChildToBack(varNode);
        } else if (code.contains("function")) {
             Node fnNode = new Node(Token.FUNCTION, 1);
             Node nameNode = new Node(Token.NAME, 1);
             nameNode.setString(code.substring(code.indexOf("function") + 8, code.indexOf("(")).trim());
             fnNode.addChildToBack(nameNode);
             node.addChildToBack(fnNode);
        } else if (code.contains("class")) {
             Node classNode = new Node(Token.CLASS, 1);
             Node nameNode = new Node(Token.NAME, 1);
             nameNode.setString(code.substring(code.indexOf("class") + 5, code.indexOf("{")).trim());
             classNode.addChildToBack(nameNode);
             node.addChildToBack(classNode);
        }
        return node;
    }

    @Override
    public JSTypeRegistry getTypeRegistry() { return registry; }
    @Override
    public CodingConvention getCodingConvention() { return convention; }
    @Override
    public TypeValidator getTypeValidator() { return new TypeValidator(this); }
    @Override
    public void report(DiagnosticType type, Node n, String... arguments) {
        System.err.println("Error: " + type.format(arguments));
    }
     @Override
    public void report(JSError error) {
        System.err.println("Error: " + error.getMessage());
    }
    @Override
    public String getSourcePath() { return "test.js"; }
    @Override
    public boolean shouldRunConventionalChecks() { return false; }
    @Override
    public String getAstRootIdentifier(Node root) { return "mockRoot"; }
    @Override
    public void setLifeCycle(LifeCycle lifeCycle) {}
    @Override
    public LifeCycle getLifeCycle() { return null; }
    @Override
    public void setProgress(Progress progress) {}
    @Override
    public Progress getProgress() { return null; }
    @Override
    public List<CompilerInput> getInputs() { return ImmutableList.of(); }
    @Override
    public void setErrorManager(ErrorManager errorManager) {}
    @Override
    public ErrorManager getErrorManager() { return null; }
    @Override
    public boolean isNormalized() { return false; }
    @Override
    public void normalize() {}
    @Override
    public boolean isTypeCheckingEnabled() { return true; }
    @Override
    public void enableTypeChecking(boolean enable) {}
    @Override
    public String[] getJSGlobalScopeNames() { return new String[0]; }
    @Override
    public void setJSGlobalScopeNames(String[] names) {}
    @Override
    public void injectGlobalScopeNames(Node scriptRoot) {}
    @Override
    public VarScopeCreator getVarScopeCreator() { return null; }
    @Override
    public void setVarScopeCreator(VarScopeCreator creator) {}
    @Override
    public void setDependencyGraph(DependencyGraph dependencyGraph) {}
    @Override
    public DependencyGraph getDependencyGraph() { return null; }
    @Override
    public void setIncrementalCompilation(boolean incremental) {}
    @Override
    public boolean isIncremental() { return false; }
    @Override
    public void process(CompilerOptions options, boolean useProvidedCode) {}
    @Override
    public void process(String code, String sourcePath, CompilerOptions options) {}
    @Override
    public void process(String code, CompilerOptions options) {}
    @Override
    public void process(List<SourceFile> externs, List<SourceFile> sources, CompilerOptions options) {}
    @Override
    public Result compile(List<SourceFile> externs, List<SourceFile> sources, CompilerOptions options) { return null; }
    @Override
    public Result compile(List<SourceFile> externs, List<SourceFile> sources) { return null; }
    @Override
    public Result compile(SourceFile externs, List<SourceFile> sources, CompilerOptions options) { return null; }
    @Override
    public Result compile(SourceFile externs, List<SourceFile> sources) { return null; }
    @Override
    public Result compile(String code, String sourcePath, CompilerOptions options) { return null; }
    @Override
    public Result compile(String code, CompilerOptions options) { return null; }
    @Override
    public Result compile(List<SourceFile> externs, List<SourceFile> sources, Node root, CompilerOptions options) { return null; }
    @Override
    public Result compile(List<SourceFile> externs, List<SourceFile> sources, Node root) { return null; }
    @Override
    public Result compile(SourceFile externs, List<SourceFile> sources, Node root, CompilerOptions options) { return null; }
    @Override
    public Result compile(SourceFile externs, List<SourceFile> sources, Node root) { return null; }
    @Override
    public Result compile(String code, String sourcePath, Node root, CompilerOptions options) { return null; }
    @Override
    public Result compile(String code, Node root, CompilerOptions options) { return null; }
    @Override
    public Node getRoot() { return null; }
    @Override
    public void dispose() {}
    @Override
    public void disposeHelpers() {}
    @Override
    public Node getInputFileByNode(Node node) { return null; }
    @Override
    public Node getInputFileByName(String name) { return null; }
    @Override
    public CompilerInput getInput(InputId id) { return null; }
    @Override
    public CompilerInput getInput(String name) { return null; }
    @Override
    public void setCssRenamingMap(CssRenamingMap renamingMap) {}
    @Override
    public void setExterns(List<SourceFile> externs) {}
    @Override
    public void setSources(List<SourceFile> sources) {}
    @Override
    public void setSource(SourceFile source) {}
    @Override
    public void setModules(List<JSModule> modules) {}
    @Override
    public JSModule getModule(String name) { return null; }
    @Override
    public String getPath(Node node) { return null; }
    @Override
    public String getPathId(Node node) { return null; }
    @Override
    public void setPhases(String[] phases) {}
    @Override
    public String[] getPhases() { return new String[0]; }
    @Override
    public PassFactory[] getPassFactories() { return new PassFactory[0]; }
    @Override
    public void setPassFactories(PassFactory[] passFactories) {}
    @Override
    public void setPassConfig(PassConfig passConfig) {}
    @Override
    public PassConfig getPassConfig() { return null; }
    @Override
    public void init(CompilerOptions options) {}
    @Override
    public void init(SourceFile externs, List<SourceFile> sources, CompilerOptions options) {}
    @Override
    public void init(List<SourceFile> externs, List<SourceFile> sources, CompilerOptions options) {}
    @Override
    public void init(Node externsRoot, Node root, CompilerOptions options) {}
    @Override
    public void setKnownReplacements(List<String> replacements) {}
    @Override
    public void setVariableMap(VariableMap variableMap) {}
    @Override
    public void setFunctionMap(FunctionMap functionMap) {}
    @Override
    public void setClassMap(ClassMap classMap) {}
    @Override
    public void setPropertyMap(PropertyMap propertyMap) {}
    @Override
    public void setAnonymousFunctionMap(AnonymousFunctionMap anonymousFunctionMap) {}
    @Override
    public void setLineNumberTable(LineNumberTable lineNumberTable) {}
    @Override
    public void setSourceMap(SourceMap sourceMap) {}
    @Override
    public void setSourceMapSettings(SourceMap.Settings settings) {}
    @Override
    public void setVerbosity(Verbosity verbosity) {}
    @Override
    public Verbosity getVerbosity() { return Verbosity.QUIET; }
    @Override
    public void setDiagnosticGroups(DiagnosticGroup ... groups) {}
    @Override
    public void setDiagnosticActive(DiagnosticGroup group, boolean active) {}
    @Override
    public void setErrorLevel(DiagnosticType type, CheckLevel level) {}
    @Override
    public CheckLevel getErrorLevel(DiagnosticType type) { return CheckLevel.OFF; }
    @Override
    public void setWarningsPerLine(int warningsPerLine) {}
    @Override
    public int getWarningsPerLine() { return 0; }
    @Override
    public void setInferTypes(boolean inferTypes) {}
    @Override
    public boolean inferTypes() { return true; }
    @Override
    public void setTypeCheckLevel(TypeCheckLevel typeCheckLevel) {}
    @Override
    public TypeCheckLevel getTypeCheckLevel() { return TypeCheckLevel.NORMAL; }
    @Override
    public void setPreferSingleQuotes(boolean preferSingleQuotes) {}
    @Override
    public boolean preferSingleQuotes() { return false; }
    @Override
    public void setPreferredRuntimeTypeUsage(PreferredRuntimeTypeUsage usage) {}
    @Override
    public PreferredRuntimeTypeUsage getPreferredRuntimeTypeUsage() { return PreferredRuntimeTypeUsage.BOTH; }
    @Override
    public void setRecordFunctionInformation(boolean recordFunctionInformation) {}
    @Override
    public boolean shouldRecordFunctionInformation() { return false; }
    @Override
    public void setGenerateExports(boolean generateExports) {}
    @Override
    public boolean shouldGenerateExports() { return false; }
    @Override
    public void setMarkAsCompiled(boolean markAsCompiled) {}
    @Override
    public boolean shouldMarkAsCompiled() { return false; }
    @Override
    public void setPropertyRenaming(PropertyRenaming propertyRenaming) {}
    @Override
    public PropertyRenaming getPropertyRenaming() { return PropertyRenaming.OFF; }
    @Override
    public void setRenamingPolicy(RenamingPolicy policy) {}
    @Override
    public RenamingPolicy getRenamingPolicy() { return RenamingPolicy.OFF; }
    @Override
    public void setAnonymousFunctionNaming(AnonymousFunctionNaming anonymousFunctionNaming) {}
    @Override
    public AnonymousFunctionNaming getAnonymousFunctionNaming() { return AnonymousFunctionNaming.OFF; }
    @Override
    public void setInputForwardDeclarations(Map<String, Node> declarations) {}
    @Override
    public Map<String, Node> getInputForwardDeclarations() { return Maps.newHashMap(); }
    @Override
    public String getCommandLineArgs() { return ""; }
    @Override
    public void setCommandLineArgs(String args) {}
    @Override
    public void setInstrumentationTemplate(String instrumentationTemplate) {}
    @Override
    public String getInstrumentationTemplate() { return ""; }
    @Override
    public void setAliasStrings(boolean aliasStrings) {}
    @Override
    public boolean shouldAliasStrings() { return false; }
    @Override
    public void setAliasAllStrings(boolean aliasAllStrings) {}
    @Override
    public boolean shouldAliasAllStrings() { return false; }
    @Override
    public void setReplace trứngStrings(boolean replace trứngStrings) {}
    @Override
    public boolean shouldReplace trứngStrings() { return false; }
    @Override
    public void setPrettyPrint(boolean prettyPrint) {}
    @Override
    public boolean shouldPrettyPrint() { return false; }
    @Override
    public void setLineLengthReportThreshold(int threshold) {}
    @Override
    public int getLineLengthReportThreshold() { return 0; }
    @Override
    public void setLineLengthLimit(int limit) {}
    @Override
    public int getLineLengthLimit() { return 0; }
    @Override
    public void setCollapseProperties(boolean collapseProperties) {}
    @Override
    public boolean shouldCollapseProperties() { return false; }
    @Override
    public void setCollapseAnonymousFunctions(boolean collapseAnonymousFunctions) {}
    @Override
    public boolean shouldCollapseAnonymousFunctions() { return false; }
    @Override
    public void setCollapseVariableMetadata(boolean collapseVariableMetadata) {}
    @Override
    public boolean shouldCollapseVariableMetadata() { return false; }
    @Override
    public void setExtractPrototypeMemberDeclarations(boolean extractPrototypeMemberDeclarations) {}
    @Override
    public boolean shouldExtractPrototypeMemberDeclarations() { return false; }
    @Override
    public void setDefineToReplace(Map<String, Boolean> defineToReplace) {}
    @Override
    public Map<String, Boolean> getDefineToReplace() { return Maps.newHashMap(); }
    @Override
    public void setDefineToNull(Set<String> defineToNull) {}
    @Override
    public Set<String> getDefineToNull() { return java.util.Collections.emptySet(); }
    @Override
    public void setDefineToTrue(Set<String> defineToTrue) {}
    @Override
    public Set<String> getDefineToTrue() { return java.util.Collections.emptySet(); }
    @Override
    public void setDefineToFalse(Set<String> defineToFalse) {}
    @Override
    public Set<String> getDefineToFalse() { return java.util.Collections.emptySet(); }
    @Override
    public void setCustomPasses(Map<String, String> customPasses) {}
    @Override
    public Map<String, String> getCustomPasses() { return Maps.newHashMap(); }
    @Override
    public void setExportTestFunctions(boolean exportTestFunctions) {}
    @Override
    public boolean shouldExportTestFunctions() { return false; }
    @Override
    public void setRemoveAbstractMethods(boolean removeAbstractMethods) {}
    @Override
    public boolean shouldRemoveAbstractMethods() { return false; }
    @Override
    public void setRemoveUnusedPrototypeProperties(boolean removeUnusedPrototypeProperties) {}
    @Override
    public boolean shouldRemoveUnusedPrototypeProperties() { return false; }
    @Override
    public void setRemoveUnusedClassProperties(boolean removeUnusedClassProperties) {}
    @Override
    public boolean shouldRemoveUnusedClassProperties() { return false; }
    @Override
    public void setRemoveUnusedLocalAssignment(boolean removeUnusedLocalAssignment) {}
    @Override
    public boolean shouldRemoveUnusedLocalAssignment() { return false; }
    @Override
    public void setRemoveUnusedCode(boolean removeUnusedCode) {}
    @Override
    public boolean shouldRemoveUnusedCode() { return false; }
    @Override
    public void setRemoveClosureAsserts(boolean removeClosureAsserts) {}
    @Override
    public boolean shouldRemoveClosureAsserts() { return false; }
    @Override
    public void setCoalesceVariableNames(boolean coalesceVariableNames) {}
    @Override
    public boolean shouldCoalesceVariableNames() { return false; }
    @Override
    public void setInlineFunctions(boolean inlineFunctions) {}
    @Override
    public boolean shouldInlineFunctions() { return false; }
    @Override
    public void setInlineVariables(boolean inlineVariables) {}
    @Override
    public boolean shouldInlineVariables() { return false; }
    @Override
    public void setInlineConstantVariables(boolean inlineConstantVariables) {}
    @Override
    public boolean shouldInlineConstantVariables() { return false; }
    @Override
    public void setInlineGetters(boolean inlineGetters) {}
    @Override
    public boolean shouldInlineGetters() { return false; }
    @Override
    public void setInlineLocalFunctions(boolean inlineLocalFunctions) {}
    @Override
    public boolean shouldInlineLocalFunctions() { return false; }
    @Override
    public void setInlineLocalVariables(boolean inlineLocalVariables) {}
    @Override
    public boolean shouldInlineLocalVariables() { return false; }
    @Override
    public void setInlineProperties(boolean inlineProperties) {}
    @Override
    public boolean shouldInlineProperties() { return false; }
    @Override
    public void setInlineSimpleMethods(boolean inlineSimpleMethods) {}
    @Override
    public boolean shouldInlineSimpleMethods() { return false; }
    @Override
    public void setRemoveEmptyFunctions(boolean removeEmptyFunctions) {}
    @Override
    public boolean shouldRemoveEmptyFunctions() { return false; }
    @Override
    public void setRemoveEmptyStaticMethods(boolean removeEmptyStaticMethods) {}
    @Override
    public boolean shouldRemoveEmptyStaticMethods() { return false; }
    @Override
    public void setRemoveEmptyClasses(boolean removeEmptyClasses) {}
    @Override
    public boolean shouldRemoveEmptyClasses() { return false; }
    @Override
    public void setDeadCodeElimination(boolean deadCodeElimination) {}
    @Override
    public boolean shouldDeadCodeElimination() { return false; }
    @Override
    public void setChainAssignment(boolean chainAssignment) {}
    @Override
    public boolean shouldChainAssignment() { return false; }
    @Override
    public void setFoldConstants(boolean foldConstants) {}
    @Override
    public boolean shouldFoldConstants() { return false; }
    @Override
    public void setRewriteNewlines(boolean rewriteNewlines) {}
    @Override
    public boolean shouldRewriteNewlines() { return false; }
    @Override
    public void setCheckGlobalThis(CheckLevel checkGlobalThis) {}
    @Override
    public CheckLevel getCheckGlobalThis() { return CheckLevel.OFF; }
    @Override
    public void setCheckMissingReturn(CheckLevel checkMissingReturn) {}
    @Override
    public CheckLevel getCheckMissingReturn() { return CheckLevel.OFF; }
    @Override
    public void setCheckMissingGetCssName(CheckLevel checkMissingGetCssName) {}
    @Override
    public CheckLevel getCheckMissingGetCssName() { return CheckLevel.OFF; }
    @Override
    public void setCheckGlobalAccess(CheckLevel checkGlobalAccess) {}
    @Override
    public CheckLevel getCheckGlobalAccess() { return CheckLevel.OFF; }
    @Override
    public void setCheckSuspiciousCode(CheckLevel checkSuspiciousCode) {}
    @Override
    public CheckLevel getCheckSuspiciousCode() { return CheckLevel.OFF; }
    @Override
    public void setCheckTypes(CheckLevel checkTypes) {}
    @Override
    public CheckLevel getCheckTypes() { return CheckLevel.OFF; }
    @Override
    public void setCheckConst(CheckLevel checkConst) {}
    @Override
    public CheckLevel getCheckConst() { return CheckLevel.OFF; }
    @Override
    public void setCheckUnusedProperties(CheckLevel checkUnusedProperties) {}
    @Override
    public CheckLevel getCheckUnusedProperties() { return CheckLevel.OFF; }
    @Override
    public void setCheckSync(CheckLevel checkSync) {}
    @Override
    public CheckLevel getCheckSync() { return CheckLevel.OFF; }
    @Override
    public void setCheckProvides(CheckLevel checkProvides) {}
    @Override
    public CheckLevel getCheckProvides() { return CheckLevel.OFF; }
    @Override
    public void setCheckRequires(CheckLevel checkRequires) {}
    @Override
    public CheckLevel getCheckRequires() { return CheckLevel.OFF; }
    @Override
    public void setCheckObjectsAndMethods(CheckLevel checkObjectsAndMethods) {}
    @Override
    public CheckLevel getCheckObjectsAndMethods() { return CheckLevel.OFF; }
    @Override
    public void setCheckTransitiveRequires(CheckLevel checkTransitiveRequires) {}
    @Override
    public CheckLevel getCheckTransitiveRequires() { return CheckLevel.OFF; }
    @Override
    public void setCheckAmbientContext(CheckLevel checkAmbientContext) {}
    @Override
    public CheckLevel getCheckAmbientContext() { return CheckLevel.OFF; }
    @Override
    public void setCheckNodeOrProperty(CheckLevel checkNodeOrProperty) {}
    @Override
    public CheckLevel getCheckNodeOrProperty() { return CheckLevel.OFF; }
    @Override
    public void setCheckMissingModule (CheckLevel checkMissingModule) {}
    @Override
    public CheckLevel getCheckMissingModule () { return CheckLevel.OFF;}
    @Override
    public void setCheckModuleDep(CheckLevel checkModuleDep) {}
    @Override
    public CheckLevel getCheckModuleDep() { return CheckLevel.OFF; }
    @Override
    public void setCheckEnumSyntax (CheckLevel checkEnumSyntax) {}
    @Override
    public CheckLevel getCheckEnumSyntax () { return CheckLevel.OFF;}
    @Override
    public void setCheckVariableReference (CheckLevel checkVariableReference) {}
    @Override
    public CheckLevel getCheckVariableReference () { return CheckLevel.OFF;}
    @Override
    public void setCheckVariableReferenceFrom(CheckLevel checkVariableReferenceFrom) {}
    @Override
    public CheckLevel getCheckVariableReferenceFrom() { return CheckLevel.OFF;}
    @Override
    public void setCheckInterfaceProperties(CheckLevel checkInterfaceProperties) {}
    @Override
    public CheckLevel getCheckInterfaceProperties() { return CheckLevel.OFF; }
    @Override
    public void setCheckPrototypeProperties(CheckLevel checkPrototypeProperties) {}
    @Override
    public CheckLevel getCheckPrototypeProperties() { return CheckLevel.OFF; }
    @Override
    public void setCheckPropertyAssignment(CheckLevel checkPropertyAssignment) {}
    @Override
    public CheckLevel getCheckPropertyAssignment() { return CheckLevel.OFF; }
    @Override
    public void setCheckConstructors(CheckLevel checkConstructors) {}
    @Override
    public CheckLevel getCheckConstructors() { return CheckLevel.OFF; }
    @Override
    public void setCheckTypes(boolean checkTypes) {}
    @Override
    public void setMissingReturnCheck(boolean check) {}
    @Override
    public void setSuspiciousCodeCheck(boolean check) {}
    @Override
    public void setGlobalThisCheck(boolean check) {}
    @Override
    public void setConstCheck(boolean check) {}
    @Override
    public void setUnusedPropertiesCheck(boolean check) {}
    @Override
    public void setSyncCheck(boolean check) {}
    @Override
    public void setProvidesCheck(boolean check) {}
    @Override
    public void setRequiresCheck(boolean check) {}
    @Override
    public void setObjectsAndMethodsCheck(boolean check) {}
    @Override
    public void setTransitiveRequiresCheck(boolean check) {}
    @Override
    public void setAmbientContextCheck(boolean check) {}
    @Override
    public void setNodeOrPropertyCheck(boolean check) {}
    @Override
    public void setModuleCheck(boolean check) {}
    @Override
    public void setModuleDepCheck(boolean check) {}
    @Override
    public void setEnumSyntaxCheck(boolean check) {}
    @Override
    public void setVariableReferenceCheck(boolean check) {}
    @Override
    public void setVariableReferenceFromCheck(boolean check) {}
    @Override
    public void setInterfacePropertiesCheck(boolean check) {}
    @Override
    public void setPrototypePropertiesCheck(boolean check) {}
    @Override
    public void setPropertyAssignmentCheck(boolean check) {}
    @Override
    public void setConstructorCheck(boolean check) {}
    @Override
    public void setVariableMap(VariableMap variableMap) {}
    @Override
    public void setFunctionMap(FunctionMap functionMap) {}
    @Override
    public void setClassMap(ClassMap classMap) {}
    @Override
    public void setPropertyMap(PropertyMap propertyMap) {}
    @Override
    public void setAnonymousFunctionMap(AnonymousFunctionMap anonymousFunctionMap) {}
    @Override
    public void setLineNumberTable(LineNumberTable lineNumberTable) {}
    @Override
    public void setSourceMap(SourceMap sourceMap) {}
    @Override
    public void setSourceMapSettings(SourceMap.Settings settings) {}
    @Override
    public void setInstrumentationTemplate(String instrumentationTemplate) {}
    @Override
    public void setAliasStrings(boolean aliasStrings) {}
    @Override
    public void setAliasAllStrings(boolean aliasAllStrings) {}
    @Override
    public void setReplace trứngStrings(boolean replace trứngStrings) {}
    @Override
    public void setPrettyPrint(boolean prettyPrint) {}
    @Override
    public void setLineLengthLimit(int limit) {}
    @Override
    public void setCollapseProperties(boolean collapseProperties) {}
    @Override
    public void setCollapseAnonymousFunctions(boolean collapseAnonymousFunctions) {}
    @Override
    public void setCollapseVariableMetadata(boolean collapseVariableMetadata) {}
    @Override
    public void setExtractPrototypeMemberDeclarations(boolean extractPrototypeMemberDeclarations) {}
    @Override
    public void setDefineToReplace(Map<String, Boolean> defineToReplace) {}
    @Override
    public void setDefineToNull(Set<String> defineToNull) {}
    @Override
    public void setDefineToTrue(Set<String> defineToTrue) {}
    @Override
    public void setDefineToFalse(Set<String> defineToFalse) {}
    @Override
    public void setCustomPasses(Map<String, String> customPasses) {}
    @Override
    public void setExportTestFunctions(boolean exportTestFunctions) {}
    @Override
    public void setRemoveAbstractMethods(boolean removeAbstractMethods) {}
    @Override
    public void setRemoveUnusedPrototypeProperties(boolean removeUnusedPrototypeProperties) {}
    @Override
    public void setRemoveUnusedClassProperties(boolean removeUnusedClassProperties) {}
    @Override
    public void setRemoveUnusedLocalAssignment(boolean removeUnusedLocalAssignment) {}
    @Override
    public void setRemoveUnusedCode(boolean removeUnusedCode) {}
    @Override
    public void setRemoveClosureAsserts(boolean removeClosureAsserts) {}
    @Override
    public void setCoalesceVariableNames(boolean coalesceVariableNames) {}
    @Override
    public void setInlineFunctions(boolean inlineFunctions) {}
    @Override
    public void setInlineVariables(boolean inlineVariables) {}
    @Override
    public void setInlineConstantVariables(boolean inlineConstantVariables) {}
    @Override
    public void setInlineGetters(boolean inlineGetters) {}
    @Override
    public void setInlineLocalFunctions(boolean inlineLocalFunctions) {}
    @Override
    public void setInlineLocalVariables(boolean inlineLocalVariables) {}
    @Override
    public void setInlineProperties(boolean inlineProperties) {}
    @Override
    public void setInlineSimpleMethods(boolean inlineSimpleMethods) {}
    @Override
    public void setRemoveEmptyFunctions(boolean removeEmptyFunctions) {}
    @Override
    public void setRemoveEmptyStaticMethods(boolean removeEmptyStaticMethods) {}
    @Override
    public void setRemoveEmptyClasses(boolean removeEmptyClasses) {}
    @Override
    public void setDeadCodeElimination(boolean deadCodeElimination) {}
    @Override
    public void setChainAssignment(boolean chainAssignment) {}
    @Override
    public void setFoldConstants(boolean foldConstants) {}
    @Override
    public void setRewriteNewlines(boolean rewriteNewlines) {}
    @Override
    public void setPassFactories(PassFactory[] passFactories) {}
    @Override
    public void setPassConfig(PassConfig passConfig) {}
    @Override
    public void setLifeCycle(Compiler.LifeCycle lifeCycle) {}
    @Override
    public void setProgress(Compiler.Progress progress) {}
    @Override
    public void setDependencyGraph(DependencyGraph dependencyGraph) {}
    @Override
    public void setErrors(List<JSError> errors) {}
    @Override
    public void setWarnings(List<JSError> warnings) {}
    @Override
    public void setModuleWrapper(String moduleWrapper) {}
    @Override
    public String getModuleWrapper() { return null; }
    @Override
    public void setModulePostfix(String modulePostfix) {}
    @Override
    public String getModulePostfix() { return null; }
    @Override
    public void setModulePrefix(String modulePrefix) {}
    @Override
    public String getModulePrefix() { return null; }
    @Override
    public void setJsModuleRegistry(JSModuleRegistry registry) {}
    @Override
    public JSModuleRegistry getJsModuleRegistry() { return null; }
    @Override
    public void setSourceMap(SourceMap sourceMap, String rootPath) {}
    @Override
    public void setSourceMap(SourceMap sourceMap, ImmutableList<SourceMap.DetailLevel> detailLevels) {}
    @Override
    public void setSourceMap(SourceMap sourceMap, boolean outputSourceMaps) {}
    @Override
    public void setSourceMapFormat(SourceMap.Format format) {}
    @Override
    public SourceMap.Format getSourceMapFormat() { return SourceMap.Format.DEFAULT; }
    @Override
    public String getSourceMapPath(String sourcePath) { return null; }
    @Override
    public void setSourceMapProvider(SourceMap.Provider provider) {}
    @Override
    public SourceMap.Provider getSourceMapProvider() { return null; }
    @Override
    public void setSourceMapFileName(String fileName) {}
    @Override
    public String getSourceMapFileName() { return null; }
    @Override
    public void setSourceMapIncludeSourcesContent(boolean includeSourcesContent) {}
    @Override
    public boolean shouldIncludeSourcesContent() { return false; }
    @Override
    public void setSourceMapMapSources(boolean mapSources) {}
    @Override
    public boolean shouldMapSources() { return false; }
    @Override
    public void setSourceMapUseAbsolutePaths(boolean useAbsolutePaths) {}
    @Override
    public boolean shouldUseAbsolutePaths() { return false; }
    @Override
    public void setSourceMapApplySourceMapMappings(boolean applySourceMapMappings) {}
    @Override
    public boolean shouldApplySourceMapMappings() { return false; }
    @Override
    public void setSourceMapDevMode(boolean devMode) {}
    @Override
    public boolean isSourceMapDevMode() { return false; }
    @Override
    public void setSourceMapDevMode(SourceMap.DevMode devMode) {}
    @Override
    public SourceMap.DevMode getSourceMapDevMode() { return SourceMap.DevMode.OFF; }
    @Override
    public void setSourceMapDebug(boolean debug) {}
    @Override
    public boolean isSourceMapDebug() { return false; }
    @Override
    public void setSourceMapCheckSources(boolean checkSources) {}
    @Override
    public boolean isSourceMapCheckSources() { return false; }
    @Override
    public void setSourceMapFileForSource(String sourceFile, String mapFile) {}
    @Override
    public Map<String, String> getSourceMapFileForSource() { return Maps.newHashMap(); }
    @Override
    public void setSourceMapFileForSource(Map<String, String> fileForSource) {}
    @Override
    public void setSourceMapPathResolver(SourceMap.PathResolver resolver) {}
    @Override
    public SourceMap.PathResolver getSourceMapPathResolver() { return null; }
    @Override
    public void setSourceMapMapLines(boolean mapLines) {}
    @Override
    public boolean shouldMapLines() { return false; }
    @Override
    public void setSourceMapInlineSourcesContent(boolean inlineSourcesContent) {}
    @Override
    public boolean shouldInlineSourcesContent() { return false; }
    @Override
    public void setSourceMapAsciiOnly(boolean asciiOnly) {}
    @Override
    public boolean shouldAsciiOnly() { return false; }
    @Override
    public void setSourceMapRegExpEscape(boolean regExpEscape) {}
    @Override
    public boolean shouldRegExpEscape() { return false; }
    @Override
    public void setSourceMapSkipHiddenSources(boolean skipHiddenSources) {}
    @Override
    public boolean shouldSkipHiddenSources() { return false; }
    @Override
    public void setSourceMapWithSourceContent(boolean withSourceContent) {}
    @Override
    public boolean shouldWithSourceContent() { return false; }
    @Override
    public void setSourceMapBase64(boolean base64) {}
    @Override
    public boolean shouldBase64() { return false; }
    @Override
    public void setSourceMapWithOriginalObject(boolean withOriginalObject) {}
    @Override
    public boolean shouldWithOriginalObject() { return false; }
    @Override
    public void setSourceMapWithOriginalType(boolean withOriginalType) {}
    @Override
    public boolean shouldWithOriginalType() { return false; }
    @Override
    public void setSourceMapWithOriginalName(boolean withOriginalName) {}
    @Override
    public boolean shouldWithOriginalName() { return false; }
    @Override
    public void setSourceMapWithOriginalLine(boolean withOriginalLine) {}
    @Override
    public boolean shouldWithOriginalLine() { return false; }
    @Override
    public void setSourceMapWithOriginalColumn(boolean withOriginalColumn) {}
    @Override
    public boolean shouldWithOriginalColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalOffset(boolean withOriginalOffset) {}
    @Override
    public boolean shouldWithOriginalOffset() { return false; }
    @Override
    public void setSourceMapWithOriginalEndOffset(boolean withOriginalEndOffset) {}
    @Override
    public boolean shouldWithOriginalEndOffset() { return false; }
    @Override
    public void setSourceMapWithOriginalEndLine(boolean withOriginalEndLine) {}
    @Override
    public boolean shouldWithOriginalEndLine() { return false; }
    @Override
    public void setSourceMapWithOriginalEndColumn(boolean withOriginalEndColumn) {}
    @Override
    public boolean shouldWithOriginalEndColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalFile(boolean withOriginalFile) {}
    @Override
    public boolean shouldWithOriginalFile() { return false; }
    @Override
    public void setSourceMapWithOriginalVersion(boolean withOriginalVersion) {}
    @Override
    public boolean shouldWithOriginalVersion() { return false; }
    @Override
    public void setSourceMapWithOriginalHash(boolean withOriginalHash) {}
    @Override
    public boolean shouldWithOriginalHash() { return false; }
    @Override
    public void setSourceMapWithOriginalMapping(boolean withOriginalMapping) {}
    @Override
    public boolean shouldWithOriginalMapping() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingPath(boolean withOriginalMappingPath) {}
    @Override
    public boolean shouldWithOriginalMappingPath() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingLine(boolean withOriginalMappingLine) {}
    @Override
    public boolean shouldWithOriginalMappingLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingColumn(boolean withOriginalMappingColumn) {}
    @Override
    public boolean shouldWithOriginalMappingColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndLine(boolean withOriginalMappingEndLine) {}
    @Override
    public boolean shouldWithOriginalMappingEndLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndColumn(boolean withOriginalMappingEndColumn) {}
    @Override
    public boolean shouldWithOriginalMappingEndColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndOffset(boolean withOriginalMappingEndOffset) {}
    @Override
    public boolean shouldWithOriginalMappingEndOffset() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingFile(boolean withOriginalMappingFile) {}
    @Override
    public boolean shouldWithOriginalMappingFile() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingVersion(boolean withOriginalMappingVersion) {}
    @Override
    public boolean shouldWithOriginalMappingVersion() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingHash(boolean withOriginalMappingHash) {}
    @Override
    public boolean shouldWithOriginalMappingHash() { return false; }
    @Override
    public void setSourceMapWithOriginalMapping(boolean withOriginalMapping) {}
    @Override
    public boolean shouldWithOriginalMapping() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingPath(boolean withOriginalMappingPath) {}
    @Override
    public boolean shouldWithOriginalMappingPath() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingLine(boolean withOriginalMappingLine) {}
    @Override
    public boolean shouldWithOriginalMappingLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingColumn(boolean withOriginalMappingColumn) {}
    @Override
    public boolean shouldWithOriginalMappingColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndLine(boolean withOriginalMappingEndLine) {}
    @Override
    public boolean shouldWithOriginalMappingEndLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndColumn(boolean withOriginalMappingEndColumn) {}
    @Override
    public boolean shouldWithOriginalMappingEndColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndOffset(boolean withOriginalMappingEndOffset) {}
    @Override
    public boolean shouldWithOriginalMappingEndOffset() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingFile(boolean withOriginalMappingFile) {}
    @Override
    public boolean shouldWithOriginalMappingFile() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingVersion(boolean withOriginalMappingVersion) {}
    @Override
    public boolean shouldWithOriginalMappingVersion() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingHash(boolean withOriginalMappingHash) {}
    @Override
    public boolean shouldWithOriginalMappingHash() { return false; }
    @Override
    public void setSourceMapWithOriginalMapping(boolean withOriginalMapping) {}
    @Override
    public boolean shouldWithOriginalMapping() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingPath(boolean withOriginalMappingPath) {}
    @Override
    public boolean shouldWithOriginalMappingPath() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingLine(boolean withOriginalMappingLine) {}
    @Override
    public boolean shouldWithOriginalMappingLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingColumn(boolean withOriginalMappingColumn) {}
    @Override
    public boolean shouldWithOriginalMappingColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndLine(boolean withOriginalMappingEndLine) {}
    @Override
    public boolean shouldWithOriginalMappingEndLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndColumn(boolean withOriginalMappingEndColumn) {}
    @Override
    public boolean shouldWithOriginalMappingEndColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndOffset(boolean withOriginalMappingEndOffset) {}
    @Override
    public boolean shouldWithOriginalMappingEndOffset() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingFile(boolean withOriginalMappingFile) {}
    @Override
    public boolean shouldWithOriginalMappingFile() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingVersion(boolean withOriginalMappingVersion) {}
    @Override
    public boolean shouldWithOriginalMappingVersion() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingHash(boolean withOriginalMappingHash) {}
    @Override
    public boolean shouldWithOriginalMappingHash() { return false; }
    @Override
    public void setSourceMapWithOriginalMapping(boolean withOriginalMapping) {}
    @Override
    public boolean shouldWithOriginalMapping() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingPath(boolean withOriginalMappingPath) {}
    @Override
    public boolean shouldWithOriginalMappingPath() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingLine(boolean withOriginalMappingLine) {}
    @Override
    public boolean shouldWithOriginalMappingLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingColumn(boolean withOriginalMappingColumn) {}
    @Override
    public boolean shouldWithOriginalMappingColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndLine(boolean withOriginalMappingEndLine) {}
    @Override
    public boolean shouldWithOriginalMappingEndLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndColumn(boolean withOriginalMappingEndColumn) {}
    @Override
    public boolean shouldWithOriginalMappingEndColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndOffset(boolean withOriginalMappingEndOffset) {}
    @Override
    public boolean shouldWithOriginalMappingEndOffset() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingFile(boolean withOriginalMappingFile) {}
    @Override
    public boolean shouldWithOriginalMappingFile() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingVersion(boolean withOriginalMappingVersion) {}
    @Override
    public boolean shouldWithOriginalMappingVersion() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingHash(boolean withOriginalMappingHash) {}
    @Override
    public boolean shouldWithOriginalMappingHash() { return false; }
    @Override
    public void setSourceMapWithOriginalMapping(boolean withOriginalMapping) {}
    @Override
    public boolean shouldWithOriginalMapping() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingPath(boolean withOriginalMappingPath) {}
    @Override
    public boolean shouldWithOriginalMappingPath() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingLine(boolean withOriginalMappingLine) {}
    @Override
    public boolean shouldWithOriginalMappingLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingColumn(boolean withOriginalMappingColumn) {}
    @Override
    public boolean shouldWithOriginalMappingColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndLine(boolean withOriginalMappingEndLine) {}
    @Override
    public boolean shouldWithOriginalMappingEndLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndColumn(boolean withOriginalMappingEndColumn) {}
    @Override
    public boolean shouldWithOriginalMappingEndColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndOffset(boolean withOriginalMappingEndOffset) {}
    @Override
    public boolean shouldWithOriginalMappingEndOffset() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingFile(boolean withOriginalMappingFile) {}
    @Override
    public boolean shouldWithOriginalMappingFile() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingVersion(boolean withOriginalMappingVersion) {}
    @Override
    public boolean shouldWithOriginalMappingVersion() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingHash(boolean withOriginalMappingHash) {}
    @Override
    public boolean shouldWithOriginalMappingHash() { return false; }
    @Override
    public void setSourceMapWithOriginalMapping(boolean withOriginalMapping) {}
    @Override
    public boolean shouldWithOriginalMapping() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingPath(boolean withOriginalMappingPath) {}
    @Override
    public boolean shouldWithOriginalMappingPath() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingLine(boolean withOriginalMappingLine) {}
    @Override
    public boolean shouldWithOriginalMappingLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingColumn(boolean withOriginalMappingColumn) {}
    @Override
    public boolean shouldWithOriginalMappingColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndLine(boolean withOriginalMappingEndLine) {}
    @Override
    public boolean shouldWithOriginalMappingEndLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndColumn(boolean withOriginalMappingEndColumn) {}
    @Override
    public boolean shouldWithOriginalMappingEndColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndOffset(boolean withOriginalMappingEndOffset) {}
    @Override
    public boolean shouldWithOriginalMappingEndOffset() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingFile(boolean withOriginalMappingFile) {}
    @Override
    public boolean shouldWithOriginalMappingFile() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingVersion(boolean withOriginalMappingVersion) {}
    @Override
    public boolean shouldWithOriginalMappingVersion() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingHash(boolean withOriginalMappingHash) {}
    @Override
    public boolean shouldWithOriginalMappingHash() { return false; }
    @Override
    public void setSourceMapWithOriginalMapping(boolean withOriginalMapping) {}
    @Override
    public boolean shouldWithOriginalMapping() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingPath(boolean withOriginalMappingPath) {}
    @Override
    public boolean shouldWithOriginalMappingPath() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingLine(boolean withOriginalMappingLine) {}
    @Override
    public boolean shouldWithOriginalMappingLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingColumn(boolean withOriginalMappingColumn) {}
    @Override
    public boolean shouldWithOriginalMappingColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndLine(boolean withOriginalMappingEndLine) {}
    @Override
    public boolean shouldWithOriginalMappingEndLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndColumn(boolean withOriginalMappingEndColumn) {}
    @Override
    public boolean shouldWithOriginalMappingEndColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndOffset(boolean withOriginalMappingEndOffset) {}
    @Override
    public boolean shouldWithOriginalMappingEndOffset() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingFile(boolean withOriginalMappingFile) {}
    @Override
    public boolean shouldWithOriginalMappingFile() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingVersion(boolean withOriginalMappingVersion) {}
    @Override
    public boolean shouldWithOriginalMappingVersion() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingHash(boolean withOriginalMappingHash) {}
    @Override
    public boolean shouldWithOriginalMappingHash() { return false; }
    @Override
    public void setSourceMapWithOriginalMapping(boolean withOriginalMapping) {}
    @Override
    public boolean shouldWithOriginalMapping() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingPath(boolean withOriginalMappingPath) {}
    @Override
    public boolean shouldWithOriginalMappingPath() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingLine(boolean withOriginalMappingLine) {}
    @Override
    public boolean shouldWithOriginalMappingLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingColumn(boolean withOriginalMappingColumn) {}
    @Override
    public boolean shouldWithOriginalMappingColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndLine(boolean withOriginalMappingEndLine) {}
    @Override
    public boolean shouldWithOriginalMappingEndLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndColumn(boolean withOriginalMappingEndColumn) {}
    @Override
    public boolean shouldWithOriginalMappingEndColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndOffset(boolean withOriginalMappingEndOffset) {}
    @Override
    public boolean shouldWithOriginalMappingEndOffset() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingFile(boolean withOriginalMappingFile) {}
    @Override
    public boolean shouldWithOriginalMappingFile() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingVersion(boolean withOriginalMappingVersion) {}
    @Override
    public boolean shouldWithOriginalMappingVersion() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingHash(boolean withOriginalMappingHash) {}
    @Override
    public boolean shouldWithOriginalMappingHash() { return false; }
    @Override
    public void setSourceMapWithOriginalMapping(boolean withOriginalMapping) {}
    @Override
    public boolean shouldWithOriginalMapping() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingPath(boolean withOriginalMappingPath) {}
    @Override
    public boolean shouldWithOriginalMappingPath() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingLine(boolean withOriginalMappingLine) {}
    @Override
    public boolean shouldWithOriginalMappingLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingColumn(boolean withOriginalMappingColumn) {}
    @Override
    public boolean shouldWithOriginalMappingColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndLine(boolean withOriginalMappingEndLine) {}
    @Override
    public boolean shouldWithOriginalMappingEndLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndColumn(boolean withOriginalMappingEndColumn) {}
    @Override
    public boolean shouldWithOriginalMappingEndColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndOffset(boolean withOriginalMappingEndOffset) {}
    @Override
    public boolean shouldWithOriginalMappingEndOffset() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingFile(boolean withOriginalMappingFile) {}
    @Override
    public boolean shouldWithOriginalMappingFile() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingVersion(boolean withOriginalMappingVersion) {}
    @Override
    public boolean shouldWithOriginalMappingVersion() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingHash(boolean withOriginalMappingHash) {}
    @Override
    public boolean shouldWithOriginalMappingHash() { return false; }
    @Override
    public void setSourceMapWithOriginalMapping(boolean withOriginalMapping) {}
    @Override
    public boolean shouldWithOriginalMapping() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingPath(boolean withOriginalMappingPath) {}
    @Override
    public boolean shouldWithOriginalMappingPath() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingLine(boolean withOriginalMappingLine) {}
    @Override
    public boolean shouldWithOriginalMappingLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingColumn(boolean withOriginalMappingColumn) {}
    @Override
    public boolean shouldWithOriginalMappingColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndLine(boolean withOriginalMappingEndLine) {}
    @Override
    public boolean shouldWithOriginalMappingEndLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndColumn(boolean withOriginalMappingEndColumn) {}
    @Override
    public boolean shouldWithOriginalMappingEndColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndOffset(boolean withOriginalMappingEndOffset) {}
    @Override
    public boolean shouldWithOriginalMappingEndOffset() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingFile(boolean withOriginalMappingFile) {}
    @Override
    public boolean shouldWithOriginalMappingFile() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingVersion(boolean withOriginalMappingVersion) {}
    @Override
    public boolean shouldWithOriginalMappingVersion() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingHash(boolean withOriginalMappingHash) {}
    @Override
    public boolean shouldWithOriginalMappingHash() { return false; }
    @Override
    public void setSourceMapWithOriginalMapping(boolean withOriginalMapping) {}
    @Override
    public boolean shouldWithOriginalMapping() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingPath(boolean withOriginalMappingPath) {}
    @Override
    public boolean shouldWithOriginalMappingPath() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingLine(boolean withOriginalMappingLine) {}
    @Override
    public boolean shouldWithOriginalMappingLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingColumn(boolean withOriginalMappingColumn) {}
    @Override
    public boolean shouldWithOriginalMappingColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndLine(boolean withOriginalMappingEndLine) {}
    @Override
    public boolean shouldWithOriginalMappingEndLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndColumn(boolean withOriginalMappingEndColumn) {}
    @Override
    public boolean shouldWithOriginalMappingEndColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndOffset(boolean withOriginalMappingEndOffset) {}
    @Override
    public boolean shouldWithOriginalMappingEndOffset() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingFile(boolean withOriginalMappingFile) {}
    @Override
    public boolean shouldWithOriginalMappingFile() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingVersion(boolean withOriginalMappingVersion) {}
    @Override
    public boolean shouldWithOriginalMappingVersion() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingHash(boolean withOriginalMappingHash) {}
    @Override
    public boolean shouldWithOriginalMappingHash() { return false; }
    @Override
    public void setSourceMapWithOriginalMapping(boolean withOriginalMapping) {}
    @Override
    public boolean shouldWithOriginalMapping() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingPath(boolean withOriginalMappingPath) {}
    @Override
    public boolean shouldWithOriginalMappingPath() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingLine(boolean withOriginalMappingLine) {}
    @Override
    public boolean shouldWithOriginalMappingLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingColumn(boolean withOriginalMappingColumn) {}
    @Override
    public boolean shouldWithOriginalMappingColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndLine(boolean withOriginalMappingEndLine) {}
    @Override
    public boolean shouldWithOriginalMappingEndLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndColumn(boolean withOriginalMappingEndColumn) {}
    @Override
    public boolean shouldWithOriginalMappingEndColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndOffset(boolean withOriginalMappingEndOffset) {}
    @Override
    public boolean shouldWithOriginalMappingEndOffset() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingFile(boolean withOriginalMappingFile) {}
    @Override
    public boolean shouldWithOriginalMappingFile() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingVersion(boolean withOriginalMappingVersion) {}
    @Override
    public boolean shouldWithOriginalMappingVersion() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingHash(boolean withOriginalMappingHash) {}
    @Override
    public boolean shouldWithOriginalMappingHash() { return false; }
    @Override
    public void setSourceMapWithOriginalMapping(boolean withOriginalMapping) {}
    @Override
    public boolean shouldWithOriginalMapping() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingPath(boolean withOriginalMappingPath) {}
    @Override
    public boolean shouldWithOriginalMappingPath() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingLine(boolean withOriginalMappingLine) {}
    @Override
    public boolean shouldWithOriginalMappingLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingColumn(boolean withOriginalMappingColumn) {}
    @Override
    public boolean shouldWithOriginalMappingColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndLine(boolean withOriginalMappingEndLine) {}
    @Override
    public boolean shouldWithOriginalMappingEndLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndColumn(boolean withOriginalMappingEndColumn) {}
    @Override
    public boolean shouldWithOriginalMappingEndColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndOffset(boolean withOriginalMappingEndOffset) {}
    @Override
    public boolean shouldWithOriginalMappingEndOffset() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingFile(boolean withOriginalMappingFile) {}
    @Override
    public boolean shouldWithOriginalMappingFile() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingVersion(boolean withOriginalMappingVersion) {}
    @Override
    public boolean shouldWithOriginalMappingVersion() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingHash(boolean withOriginalMappingHash) {}
    @Override
    public boolean shouldWithOriginalMappingHash() { return false; }
    @Override
    public void setSourceMapWithOriginalMapping(boolean withOriginalMapping) {}
    @Override
    public boolean shouldWithOriginalMapping() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingPath(boolean withOriginalMappingPath) {}
    @Override
    public boolean shouldWithOriginalMappingPath() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingLine(boolean withOriginalMappingLine) {}
    @Override
    public boolean shouldWithOriginalMappingLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingColumn(boolean withOriginalMappingColumn) {}
    @Override
    public boolean shouldWithOriginalMappingColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndLine(boolean withOriginalMappingEndLine) {}
    @Override
    public boolean shouldWithOriginalMappingEndLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndColumn(boolean withOriginalMappingEndColumn) {}
    @Override
    public boolean shouldWithOriginalMappingEndColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndOffset(boolean withOriginalMappingEndOffset) {}
    @Override
    public boolean shouldWithOriginalMappingEndOffset() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingFile(boolean withOriginalMappingFile) {}
    @Override
    public boolean shouldWithOriginalMappingFile() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingVersion(boolean withOriginalMappingVersion) {}
    @Override
    public boolean shouldWithOriginalMappingVersion() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingHash(boolean withOriginalMappingHash) {}
    @Override
    public boolean shouldWithOriginalMappingHash() { return false; }
    @Override
    public void setSourceMapWithOriginalMapping(boolean withOriginalMapping) {}
    @Override
    public boolean shouldWithOriginalMapping() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingPath(boolean withOriginalMappingPath) {}
    @Override
    public boolean shouldWithOriginalMappingPath() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingLine(boolean withOriginalMappingLine) {}
    @Override
    public boolean shouldWithOriginalMappingLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingColumn(boolean withOriginalMappingColumn) {}
    @Override
    public boolean shouldWithOriginalMappingColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndLine(boolean withOriginalMappingEndLine) {}
    @Override
    public boolean shouldWithOriginalMappingEndLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndColumn(boolean withOriginalMappingEndColumn) {}
    @Override
    public boolean shouldWithOriginalMappingEndColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndOffset(boolean withOriginalMappingEndOffset) {}
    @Override
    public boolean shouldWithOriginalMappingEndOffset() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingFile(boolean withOriginalMappingFile) {}
    @Override
    public boolean shouldWithOriginalMappingFile() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingVersion(boolean withOriginalMappingVersion) {}
    @Override
    public boolean shouldWithOriginalMappingVersion() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingHash(boolean withOriginalMappingHash) {}
    @Override
    public boolean shouldWithOriginalMappingHash() { return false; }
    @Override
    public void setSourceMapWithOriginalMapping(boolean withOriginalMapping) {}
    @Override
    public boolean shouldWithOriginalMapping() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingPath(boolean withOriginalMappingPath) {}
    @Override
    public boolean shouldWithOriginalMappingPath() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingLine(boolean withOriginalMappingLine) {}
    @Override
    public boolean shouldWithOriginalMappingLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingColumn(boolean withOriginalMappingColumn) {}
    @Override
    public boolean shouldWithOriginalMappingColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndLine(boolean withOriginalMappingEndLine) {}
    @Override
    public boolean shouldWithOriginalMappingEndLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndColumn(boolean withOriginalMappingEndColumn) {}
    @Override
    public boolean shouldWithOriginalMappingEndColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndOffset(boolean withOriginalMappingEndOffset) {}
    @Override
    public boolean shouldWithOriginalMappingEndOffset() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingFile(boolean withOriginalMappingFile) {}
    @Override
    public boolean shouldWithOriginalMappingFile() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingVersion(boolean withOriginalMappingVersion) {}
    @Override
    public boolean shouldWithOriginalMappingVersion() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingHash(boolean withOriginalMappingHash) {}
    @Override
    public boolean shouldWithOriginalMappingHash() { return false; }
    @Override
    public void setSourceMapWithOriginalMapping(boolean withOriginalMapping) {}
    @Override
    public boolean shouldWithOriginalMapping() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingPath(boolean withOriginalMappingPath) {}
    @Override
    public boolean shouldWithOriginalMappingPath() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingLine(boolean withOriginalMappingLine) {}
    @Override
    public boolean shouldWithOriginalMappingLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingColumn(boolean withOriginalMappingColumn) {}
    @Override
    public boolean shouldWithOriginalMappingColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndLine(boolean withOriginalMappingEndLine) {}
    @Override
    public boolean shouldWithOriginalMappingEndLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndColumn(boolean withOriginalMappingEndColumn) {}
    @Override
    public boolean shouldWithOriginalMappingEndColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndOffset(boolean withOriginalMappingEndOffset) {}
    @Override
    public boolean shouldWithOriginalMappingEndOffset() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingFile(boolean withOriginalMappingFile) {}
    @Override
    public boolean shouldWithOriginalMappingFile() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingVersion(boolean withOriginalMappingVersion) {}
    @Override
    public boolean shouldWithOriginalMappingVersion() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingHash(boolean withOriginalMappingHash) {}
    @Override
    public boolean shouldWithOriginalMappingHash() { return false; }
    @Override
    public void setSourceMapWithOriginalMapping(boolean withOriginalMapping) {}
    @Override
    public boolean shouldWithOriginalMapping() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingPath(boolean withOriginalMappingPath) {}
    @Override
    public boolean shouldWithOriginalMappingPath() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingLine(boolean withOriginalMappingLine) {}
    @Override
    public boolean shouldWithOriginalMappingLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingColumn(boolean withOriginalMappingColumn) {}
    @Override
    public boolean shouldWithOriginalMappingColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndLine(boolean withOriginalMappingEndLine) {}
    @Override
    public boolean shouldWithOriginalMappingEndLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndColumn(boolean withOriginalMappingEndColumn) {}
    @Override
    public boolean shouldWithOriginalMappingEndColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndOffset(boolean withOriginalMappingEndOffset) {}
    @Override
    public boolean shouldWithOriginalMappingEndOffset() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingFile(boolean withOriginalMappingFile) {}
    @Override
    public boolean shouldWithOriginalMappingFile() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingVersion(boolean withOriginalMappingVersion) {}
    @Override
    public boolean shouldWithOriginalMappingVersion() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingHash(boolean withOriginalMappingHash) {}
    @Override
    public boolean shouldWithOriginalMappingHash() { return false; }
    @Override
    public void setSourceMapWithOriginalMapping(boolean withOriginalMapping) {}
    @Override
    public boolean shouldWithOriginalMapping() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingPath(boolean withOriginalMappingPath) {}
    @Override
    public boolean shouldWithOriginalMappingPath() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingLine(boolean withOriginalMappingLine) {}
    @Override
    public boolean shouldWithOriginalMappingLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingColumn(boolean withOriginalMappingColumn) {}
    @Override
    public boolean shouldWithOriginalMappingColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndLine(boolean withOriginalMappingEndLine) {}
    @Override
    public boolean shouldWithOriginalMappingEndLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndColumn(boolean withOriginalMappingEndColumn) {}
    @Override
    public boolean shouldWithOriginalMappingEndColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndOffset(boolean withOriginalMappingEndOffset) {}
    @Override
    public boolean shouldWithOriginalMappingEndOffset() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingFile(boolean withOriginalMappingFile) {}
    @Override
    public boolean shouldWithOriginalMappingFile() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingVersion(boolean withOriginalMappingVersion) {}
    @Override
    public boolean shouldWithOriginalMappingVersion() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingHash(boolean withOriginalMappingHash) {}
    @Override
    public boolean shouldWithOriginalMappingHash() { return false; }
    @Override
    public void setSourceMapWithOriginalMapping(boolean withOriginalMapping) {}
    @Override
    public boolean shouldWithOriginalMapping() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingPath(boolean withOriginalMappingPath) {}
    @Override
    public boolean shouldWithOriginalMappingPath() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingLine(boolean withOriginalMappingLine) {}
    @Override
    public boolean shouldWithOriginalMappingLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingColumn(boolean withOriginalMappingColumn) {}
    @Override
    public boolean shouldWithOriginalMappingColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndLine(boolean withOriginalMappingEndLine) {}
    @Override
    public boolean shouldWithOriginalMappingEndLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndColumn(boolean withOriginalMappingEndColumn) {}
    @Override
    public boolean shouldWithOriginalMappingEndColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndOffset(boolean withOriginalMappingEndOffset) {}
    @Override
    public boolean shouldWithOriginalMappingEndOffset() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingFile(boolean withOriginalMappingFile) {}
    @Override
    public boolean shouldWithOriginalMappingFile() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingVersion(boolean withOriginalMappingVersion) {}
    @Override
    public boolean shouldWithOriginalMappingVersion() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingHash(boolean withOriginalMappingHash) {}
    @Override
    public boolean shouldWithOriginalMappingHash() { return false; }
    @Override
    public void setSourceMapWithOriginalMapping(boolean withOriginalMapping) {}
    @Override
    public boolean shouldWithOriginalMapping() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingPath(boolean withOriginalMappingPath) {}
    @Override
    public boolean shouldWithOriginalMappingPath() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingLine(boolean withOriginalMappingLine) {}
    @Override
    public boolean shouldWithOriginalMappingLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingColumn(boolean withOriginalMappingColumn) {}
    @Override
    public boolean shouldWithOriginalMappingColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndLine(boolean withOriginalMappingEndLine) {}
    @Override
    public boolean shouldWithOriginalMappingEndLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndColumn(boolean withOriginalMappingEndColumn) {}
    @Override
    public boolean shouldWithOriginalMappingEndColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndOffset(boolean withOriginalMappingEndOffset) {}
    @Override
    public boolean shouldWithOriginalMappingEndOffset() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingFile(boolean withOriginalMappingFile) {}
    @Override
    public boolean shouldWithOriginalMappingFile() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingVersion(boolean withOriginalMappingVersion) {}
    @Override
    public boolean shouldWithOriginalMappingVersion() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingHash(boolean withOriginalMappingHash) {}
    @Override
    public boolean shouldWithOriginalMappingHash() { return false; }
    @Override
    public void setSourceMapWithOriginalMapping(boolean withOriginalMapping) {}
    @Override
    public boolean shouldWithOriginalMapping() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingPath(boolean withOriginalMappingPath) {}
    @Override
    public boolean shouldWithOriginalMappingPath() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingLine(boolean withOriginalMappingLine) {}
    @Override
    public boolean shouldWithOriginalMappingLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingColumn(boolean withOriginalMappingColumn) {}
    @Override
    public boolean shouldWithOriginalMappingColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndLine(boolean withOriginalMappingEndLine) {}
    @Override
    public boolean shouldWithOriginalMappingEndLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndColumn(boolean withOriginalMappingEndColumn) {}
    @Override
    public boolean shouldWithOriginalMappingEndColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndOffset(boolean withOriginalMappingEndOffset) {}
    @Override
    public boolean shouldWithOriginalMappingEndOffset() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingFile(boolean withOriginalMappingFile) {}
    @Override
    public boolean shouldWithOriginalMappingFile() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingVersion(boolean withOriginalMappingVersion) {}
    @Override
    public boolean shouldWithOriginalMappingVersion() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingHash(boolean withOriginalMappingHash) {}
    @Override
    public boolean shouldWithOriginalMappingHash() { return false; }
    @Override
    public void setSourceMapWithOriginalMapping(boolean withOriginalMapping) {}
    @Override
    public boolean shouldWithOriginalMapping() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingPath(boolean withOriginalMappingPath) {}
    @Override
    public boolean shouldWithOriginalMappingPath() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingLine(boolean withOriginalMappingLine) {}
    @Override
    public boolean shouldWithOriginalMappingLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingColumn(boolean withOriginalMappingColumn) {}
    @Override
    public boolean shouldWithOriginalMappingColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndLine(boolean withOriginalMappingEndLine) {}
    @Override
    public boolean shouldWithOriginalMappingEndLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndColumn(boolean withOriginalMappingEndColumn) {}
    @Override
    public boolean shouldWithOriginalMappingEndColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndOffset(boolean withOriginalMappingEndOffset) {}
    @Override
    public boolean shouldWithOriginalMappingEndOffset() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingFile(boolean withOriginalMappingFile) {}
    @Override
    public boolean shouldWithOriginalMappingFile() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingVersion(boolean withOriginalMappingVersion) {}
    @Override
    public boolean shouldWithOriginalMappingVersion() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingHash(boolean withOriginalMappingHash) {}
    @Override
    public boolean shouldWithOriginalMappingHash() { return false; }
    @Override
    public void setSourceMapWithOriginalMapping(boolean withOriginalMapping) {}
    @Override
    public boolean shouldWithOriginalMapping() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingPath(boolean withOriginalMappingPath) {}
    @Override
    public boolean shouldWithOriginalMappingPath() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingLine(boolean withOriginalMappingLine) {}
    @Override
    public boolean shouldWithOriginalMappingLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingColumn(boolean withOriginalMappingColumn) {}
    @Override
    public boolean shouldWithOriginalMappingColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndLine(boolean withOriginalMappingEndLine) {}
    @Override
    public boolean shouldWithOriginalMappingEndLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndColumn(boolean withOriginalMappingEndColumn) {}
    @Override
    public boolean shouldWithOriginalMappingEndColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndOffset(boolean withOriginalMappingEndOffset) {}
    @Override
    public boolean shouldWithOriginalMappingEndOffset() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingFile(boolean withOriginalMappingFile) {}
    @Override
    public boolean shouldWithOriginalMappingFile() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingVersion(boolean withOriginalMappingVersion) {}
    @Override
    public boolean shouldWithOriginalMappingVersion() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingHash(boolean withOriginalMappingHash) {}
    @Override
    public boolean shouldWithOriginalMappingHash() { return false; }
    @Override
    public void setSourceMapWithOriginalMapping(boolean withOriginalMapping) {}
    @Override
    public boolean shouldWithOriginalMapping() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingPath(boolean withOriginalMappingPath) {}
    @Override
    public boolean shouldWithOriginalMappingPath() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingLine(boolean withOriginalMappingLine) {}
    @Override
    public boolean shouldWithOriginalMappingLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingColumn(boolean withOriginalMappingColumn) {}
    @Override
    public boolean shouldWithOriginalMappingColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndLine(boolean withOriginalMappingEndLine) {}
    @Override
    public boolean shouldWithOriginalMappingEndLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndColumn(boolean withOriginalMappingEndColumn) {}
    @Override
    public boolean shouldWithOriginalMappingEndColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndOffset(boolean withOriginalMappingEndOffset) {}
    @Override
    public boolean shouldWithOriginalMappingEndOffset() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingFile(boolean withOriginalMappingFile) {}
    @Override
    public boolean shouldWithOriginalMappingFile() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingVersion(boolean withOriginalMappingVersion) {}
    @Override
    public boolean shouldWithOriginalMappingVersion() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingHash(boolean withOriginalMappingHash) {}
    @Override
    public boolean shouldWithOriginalMappingHash() { return false; }
    @Override
    public void setSourceMapWithOriginalMapping(boolean withOriginalMapping) {}
    @Override
    public boolean shouldWithOriginalMapping() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingPath(boolean withOriginalMappingPath) {}
    @Override
    public boolean shouldWithOriginalMappingPath() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingLine(boolean withOriginalMappingLine) {}
    @Override
    public boolean shouldWithOriginalMappingLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingColumn(boolean withOriginalMappingColumn) {}
    @Override
    public boolean shouldWithOriginalMappingColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndLine(boolean withOriginalMappingEndLine) {}
    @Override
    public boolean shouldWithOriginalMappingEndLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndColumn(boolean withOriginalMappingEndColumn) {}
    @Override
    public boolean shouldWithOriginalMappingEndColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndOffset(boolean withOriginalMappingEndOffset) {}
    @Override
    public boolean shouldWithOriginalMappingEndOffset() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingFile(boolean withOriginalMappingFile) {}
    @Override
    public boolean shouldWithOriginalMappingFile() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingVersion(boolean withOriginalMappingVersion) {}
    @Override
    public boolean shouldWithOriginalMappingVersion() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingHash(boolean withOriginalMappingHash) {}
    @Override
    public boolean shouldWithOriginalMappingHash() { return false; }
    @Override
    public void setSourceMapWithOriginalMapping(boolean withOriginalMapping) {}
    @Override
    public boolean shouldWithOriginalMapping() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingPath(boolean withOriginalMappingPath) {}
    @Override
    public boolean shouldWithOriginalMappingPath() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingLine(boolean withOriginalMappingLine) {}
    @Override
    public boolean shouldWithOriginalMappingLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingColumn(boolean withOriginalMappingColumn) {}
    @Override
    public boolean shouldWithOriginalMappingColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndLine(boolean withOriginalMappingEndLine) {}
    @Override
    public boolean shouldWithOriginalMappingEndLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndColumn(boolean withOriginalMappingEndColumn) {}
    @Override
    public boolean shouldWithOriginalMappingEndColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndOffset(boolean withOriginalMappingEndOffset) {}
    @Override
    public boolean shouldWithOriginalMappingEndOffset() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingFile(boolean withOriginalMappingFile) {}
    @Override
    public boolean shouldWithOriginalMappingFile() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingVersion(boolean withOriginalMappingVersion) {}
    @Override
    public boolean shouldWithOriginalMappingVersion() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingHash(boolean withOriginalMappingHash) {}
    @Override
    public boolean shouldWithOriginalMappingHash() { return false; }
    @Override
    public void setSourceMapWithOriginalMapping(boolean withOriginalMapping) {}
    @Override
    public boolean shouldWithOriginalMapping() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingPath(boolean withOriginalMappingPath) {}
    @Override
    public boolean shouldWithOriginalMappingPath() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingLine(boolean withOriginalMappingLine) {}
    @Override
    public boolean shouldWithOriginalMappingLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingColumn(boolean withOriginalMappingColumn) {}
    @Override
    public boolean shouldWithOriginalMappingColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndLine(boolean withOriginalMappingEndLine) {}
    @Override
    public boolean shouldWithOriginalMappingEndLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndColumn(boolean withOriginalMappingEndColumn) {}
    @Override
    public boolean shouldWithOriginalMappingEndColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndOffset(boolean withOriginalMappingEndOffset) {}
    @Override
    public boolean shouldWithOriginalMappingEndOffset() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingFile(boolean withOriginalMappingFile) {}
    @Override
    public boolean shouldWithOriginalMappingFile() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingVersion(boolean withOriginalMappingVersion) {}
    @Override
    public boolean shouldWithOriginalMappingVersion() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingHash(boolean withOriginalMappingHash) {}
    @Override
    public boolean shouldWithOriginalMappingHash() { return false; }
    @Override
    public void setSourceMapWithOriginalMapping(boolean withOriginalMapping) {}
    @Override
    public boolean shouldWithOriginalMapping() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingPath(boolean withOriginalMappingPath) {}
    @Override
    public boolean shouldWithOriginalMappingPath() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingLine(boolean withOriginalMappingLine) {}
    @Override
    public boolean shouldWithOriginalMappingLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingColumn(boolean withOriginalMappingColumn) {}
    @Override
    public boolean shouldWithOriginalMappingColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndLine(boolean withOriginalMappingEndLine) {}
    @Override
    public boolean shouldWithOriginalMappingEndLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndColumn(boolean withOriginalMappingEndColumn) {}
    @Override
    public boolean shouldWithOriginalMappingEndColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndOffset(boolean withOriginalMappingEndOffset) {}
    @Override
    public boolean shouldWithOriginalMappingEndOffset() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingFile(boolean withOriginalMappingFile) {}
    @Override
    public boolean shouldWithOriginalMappingFile() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingVersion(boolean withOriginalMappingVersion) {}
    @Override
    public boolean shouldWithOriginalMappingVersion() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingHash(boolean withOriginalMappingHash) {}
    @Override
    public boolean shouldWithOriginalMappingHash() { return false; }
    @Override
    public void setSourceMapWithOriginalMapping(boolean withOriginalMapping) {}
    @Override
    public boolean shouldWithOriginalMapping() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingPath(boolean withOriginalMappingPath) {}
    @Override
    public boolean shouldWithOriginalMappingPath() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingLine(boolean withOriginalMappingLine) {}
    @Override
    public boolean shouldWithOriginalMappingLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingColumn(boolean withOriginalMappingColumn) {}
    @Override
    public boolean shouldWithOriginalMappingColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndLine(boolean withOriginalMappingEndLine) {}
    @Override
    public boolean shouldWithOriginalMappingEndLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndColumn(boolean withOriginalMappingEndColumn) {}
    @Override
    public boolean shouldWithOriginalMappingEndColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndOffset(boolean withOriginalMappingEndOffset) {}
    @Override
    public boolean shouldWithOriginalMappingEndOffset() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingFile(boolean withOriginalMappingFile) {}
    @Override
    public boolean shouldWithOriginalMappingFile() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingVersion(boolean withOriginalMappingVersion) {}
    @Override
    public boolean shouldWithOriginalMappingVersion() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingHash(boolean withOriginalMappingHash) {}
    @Override
    public boolean shouldWithOriginalMappingHash() { return false; }
    @Override
    public void setSourceMapWithOriginalMapping(boolean withOriginalMapping) {}
    @Override
    public boolean shouldWithOriginalMapping() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingPath(boolean withOriginalMappingPath) {}
    @Override
    public boolean shouldWithOriginalMappingPath() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingLine(boolean withOriginalMappingLine) {}
    @Override
    public boolean shouldWithOriginalMappingLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingColumn(boolean withOriginalMappingColumn) {}
    @Override
    public boolean shouldWithOriginalMappingColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndLine(boolean withOriginalMappingEndLine) {}
    @Override
    public boolean shouldWithOriginalMappingEndLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndColumn(boolean withOriginalMappingEndColumn) {}
    @Override
    public boolean shouldWithOriginalMappingEndColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndOffset(boolean withOriginalMappingEndOffset) {}
    @Override
    public boolean shouldWithOriginalMappingEndOffset() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingFile(boolean withOriginalMappingFile) {}
    @Override
    public boolean shouldWithOriginalMappingFile() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingVersion(boolean withOriginalMappingVersion) {}
    @Override
    public boolean shouldWithOriginalMappingVersion() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingHash(boolean withOriginalMappingHash) {}
    @Override
    public boolean shouldWithOriginalMappingHash() { return false; }
    @Override
    public void setSourceMapWithOriginalMapping(boolean withOriginalMapping) {}
    @Override
    public boolean shouldWithOriginalMapping() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingPath(boolean withOriginalMappingPath) {}
    @Override
    public boolean shouldWithOriginalMappingPath() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingLine(boolean withOriginalMappingLine) {}
    @Override
    public boolean shouldWithOriginalMappingLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingColumn(boolean withOriginalMappingColumn) {}
    @Override
    public boolean shouldWithOriginalMappingColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndLine(boolean withOriginalMappingEndLine) {}
    @Override
    public boolean shouldWithOriginalMappingEndLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndColumn(boolean withOriginalMappingEndColumn) {}
    @Override
    public boolean shouldWithOriginalMappingEndColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndOffset(boolean withOriginalMappingEndOffset) {}
    @Override
    public boolean shouldWithOriginalMappingEndOffset() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingFile(boolean withOriginalMappingFile) {}
    @Override
    public boolean shouldWithOriginalMappingFile() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingVersion(boolean withOriginalMappingVersion) {}
    @Override
    public boolean shouldWithOriginalMappingVersion() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingHash(boolean withOriginalMappingHash) {}
    @Override
    public boolean shouldWithOriginalMappingHash() { return false; }
    @Override
    public void setSourceMapWithOriginalMapping(boolean withOriginalMapping) {}
    @Override
    public boolean shouldWithOriginalMapping() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingPath(boolean withOriginalMappingPath) {}
    @Override
    public boolean shouldWithOriginalMappingPath() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingLine(boolean withOriginalMappingLine) {}
    @Override
    public boolean shouldWithOriginalMappingLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingColumn(boolean withOriginalMappingColumn) {}
    @Override
    public boolean shouldWithOriginalMappingColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndLine(boolean withOriginalMappingEndLine) {}
    @Override
    public boolean shouldWithOriginalMappingEndLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndColumn(boolean withOriginalMappingEndColumn) {}
    @Override
    public boolean shouldWithOriginalMappingEndColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndOffset(boolean withOriginalMappingEndOffset) {}
    @Override
    public boolean shouldWithOriginalMappingEndOffset() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingFile(boolean withOriginalMappingFile) {}
    @Override
    public boolean shouldWithOriginalMappingFile() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingVersion(boolean withOriginalMappingVersion) {}
    @Override
    public boolean shouldWithOriginalMappingVersion() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingHash(boolean withOriginalMappingHash) {}
    @Override
    public boolean shouldWithOriginalMappingHash() { return false; }
    @Override
    public void setSourceMapWithOriginalMapping(boolean withOriginalMapping) {}
    @Override
    public boolean shouldWithOriginalMapping() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingPath(boolean withOriginalMappingPath) {}
    @Override
    public boolean shouldWithOriginalMappingPath() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingLine(boolean withOriginalMappingLine) {}
    @Override
    public boolean shouldWithOriginalMappingLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingColumn(boolean withOriginalMappingColumn) {}
    @Override
    public boolean shouldWithOriginalMappingColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndLine(boolean withOriginalMappingEndLine) {}
    @Override
    public boolean shouldWithOriginalMappingEndLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndColumn(boolean withOriginalMappingEndColumn) {}
    @Override
    public boolean shouldWithOriginalMappingEndColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndOffset(boolean withOriginalMappingEndOffset) {}
    @Override
    public boolean shouldWithOriginalMappingEndOffset() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingFile(boolean withOriginalMappingFile) {}
    @Override
    public boolean shouldWithOriginalMappingFile() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingVersion(boolean withOriginalMappingVersion) {}
    @Override
    public boolean shouldWithOriginalMappingVersion() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingHash(boolean withOriginalMappingHash) {}
    @Override
    public boolean shouldWithOriginalMappingHash() { return false; }
    @Override
    public void setSourceMapWithOriginalMapping(boolean withOriginalMapping) {}
    @Override
    public boolean shouldWithOriginalMapping() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingPath(boolean withOriginalMappingPath) {}
    @Override
    public boolean shouldWithOriginalMappingPath() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingLine(boolean withOriginalMappingLine) {}
    @Override
    public boolean shouldWithOriginalMappingLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingColumn(boolean withOriginalMappingColumn) {}
    @Override
    public boolean shouldWithOriginalMappingColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndLine(boolean withOriginalMappingEndLine) {}
    @Override
    public boolean shouldWithOriginalMappingEndLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndColumn(boolean withOriginalMappingEndColumn) {}
    @Override
    public boolean shouldWithOriginalMappingEndColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndOffset(boolean withOriginalMappingEndOffset) {}
    @Override
    public boolean shouldWithOriginalMappingEndOffset() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingFile(boolean withOriginalMappingFile) {}
    @Override
    public boolean shouldWithOriginalMappingFile() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingVersion(boolean withOriginalMappingVersion) {}
    @Override
    public boolean shouldWithOriginalMappingVersion() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingHash(boolean withOriginalMappingHash) {}
    @Override
    public boolean shouldWithOriginalMappingHash() { return false; }
    @Override
    public void setSourceMapWithOriginalMapping(boolean withOriginalMapping) {}
    @Override
    public boolean shouldWithOriginalMapping() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingPath(boolean withOriginalMappingPath) {}
    @Override
    public boolean shouldWithOriginalMappingPath() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingLine(boolean withOriginalMappingLine) {}
    @Override
    public boolean shouldWithOriginalMappingLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingColumn(boolean withOriginalMappingColumn) {}
    @Override
    public boolean shouldWithOriginalMappingColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndLine(boolean withOriginalMappingEndLine) {}
    @Override
    public boolean shouldWithOriginalMappingEndLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndColumn(boolean withOriginalMappingEndColumn) {}
    @Override
    public boolean shouldWithOriginalMappingEndColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndOffset(boolean withOriginalMappingEndOffset) {}
    @Override
    public boolean shouldWithOriginalMappingEndOffset() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingFile(boolean withOriginalMappingFile) {}
    @Override
    public boolean shouldWithOriginalMappingFile() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingVersion(boolean withOriginalMappingVersion) {}
    @Override
    public boolean shouldWithOriginalMappingVersion() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingHash(boolean withOriginalMappingHash) {}
    @Override
    public boolean shouldWithOriginalMappingHash() { return false; }
    @Override
    public void setSourceMapWithOriginalMapping(boolean withOriginalMapping) {}
    @Override
    public boolean shouldWithOriginalMapping() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingPath(boolean withOriginalMappingPath) {}
    @Override
    public boolean shouldWithOriginalMappingPath() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingLine(boolean withOriginalMappingLine) {}
    @Override
    public boolean shouldWithOriginalMappingLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingColumn(boolean withOriginalMappingColumn) {}
    @Override
    public boolean shouldWithOriginalMappingColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndLine(boolean withOriginalMappingEndLine) {}
    @Override
    public boolean shouldWithOriginalMappingEndLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndColumn(boolean withOriginalMappingEndColumn) {}
    @Override
    public boolean shouldWithOriginalMappingEndColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndOffset(boolean withOriginalMappingEndOffset) {}
    @Override
    public boolean shouldWithOriginalMappingEndOffset() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingFile(boolean withOriginalMappingFile) {}
    @Override
    public boolean shouldWithOriginalMappingFile() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingVersion(boolean withOriginalMappingVersion) {}
    @Override
    public boolean shouldWithOriginalMappingVersion() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingHash(boolean withOriginalMappingHash) {}
    @Override
    public boolean shouldWithOriginalMappingHash() { return false; }
    @Override
    public void setSourceMapWithOriginalMapping(boolean withOriginalMapping) {}
    @Override
    public boolean shouldWithOriginalMapping() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingPath(boolean withOriginalMappingPath) {}
    @Override
    public boolean shouldWithOriginalMappingPath() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingLine(boolean withOriginalMappingLine) {}
    @Override
    public boolean shouldWithOriginalMappingLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingColumn(boolean withOriginalMappingColumn) {}
    @Override
    public boolean shouldWithOriginalMappingColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndLine(boolean withOriginalMappingEndLine) {}
    @Override
    public boolean shouldWithOriginalMappingEndLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndColumn(boolean withOriginalMappingEndColumn) {}
    @Override
    public boolean shouldWithOriginalMappingEndColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndOffset(boolean withOriginalMappingEndOffset) {}
    @Override
    public boolean shouldWithOriginalMappingEndOffset() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingFile(boolean withOriginalMappingFile) {}
    @Override
    public boolean shouldWithOriginalMappingFile() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingVersion(boolean withOriginalMappingVersion) {}
    @Override
    public boolean shouldWithOriginalMappingVersion() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingHash(boolean withOriginalMappingHash) {}
    @Override
    public boolean shouldWithOriginalMappingHash() { return false; }
    @Override
    public void setSourceMapWithOriginalMapping(boolean withOriginalMapping) {}
    @Override
    public boolean shouldWithOriginalMapping() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingPath(boolean withOriginalMappingPath) {}
    @Override
    public boolean shouldWithOriginalMappingPath() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingLine(boolean withOriginalMappingLine) {}
    @Override
    public boolean shouldWithOriginalMappingLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingColumn(boolean withOriginalMappingColumn) {}
    @Override
    public boolean shouldWithOriginalMappingColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndLine(boolean withOriginalMappingEndLine) {}
    @Override
    public boolean shouldWithOriginalMappingEndLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndColumn(boolean withOriginalMappingEndColumn) {}
    @Override
    public boolean shouldWithOriginalMappingEndColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndOffset(boolean withOriginalMappingEndOffset) {}
    @Override
    public boolean shouldWithOriginalMappingEndOffset() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingFile(boolean withOriginalMappingFile) {}
    @Override
    public boolean shouldWithOriginalMappingFile() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingVersion(boolean withOriginalMappingVersion) {}
    @Override
    public boolean shouldWithOriginalMappingVersion() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingHash(boolean withOriginalMappingHash) {}
    @Override
    public boolean shouldWithOriginalMappingHash() { return false; }
    @Override
    public void setSourceMapWithOriginalMapping(boolean withOriginalMapping) {}
    @Override
    public boolean shouldWithOriginalMapping() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingPath(boolean withOriginalMappingPath) {}
    @Override
    public boolean shouldWithOriginalMappingPath() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingLine(boolean withOriginalMappingLine) {}
    @Override
    public boolean shouldWithOriginalMappingLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingColumn(boolean withOriginalMappingColumn) {}
    @Override
    public boolean shouldWithOriginalMappingColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndLine(boolean withOriginalMappingEndLine) {}
    @Override
    public boolean shouldWithOriginalMappingEndLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndColumn(boolean withOriginalMappingEndColumn) {}
    @Override
    public boolean shouldWithOriginalMappingEndColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndOffset(boolean withOriginalMappingEndOffset) {}
    @Override
    public boolean shouldWithOriginalMappingEndOffset() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingFile(boolean withOriginalMappingFile) {}
    @Override
    public boolean shouldWithOriginalMappingFile() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingVersion(boolean withOriginalMappingVersion) {}
    @Override
    public boolean shouldWithOriginalMappingVersion() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingHash(boolean withOriginalMappingHash) {}
    @Override
    public boolean shouldWithOriginalMappingHash() { return false; }
    @Override
    public void setSourceMapWithOriginalMapping(boolean withOriginalMapping) {}
    @Override
    public boolean shouldWithOriginalMapping() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingPath(boolean withOriginalMappingPath) {}
    @Override
    public boolean shouldWithOriginalMappingPath() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingLine(boolean withOriginalMappingLine) {}
    @Override
    public boolean shouldWithOriginalMappingLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingColumn(boolean withOriginalMappingColumn) {}
    @Override
    public boolean shouldWithOriginalMappingColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndLine(boolean withOriginalMappingEndLine) {}
    @Override
    public boolean shouldWithOriginalMappingEndLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndColumn(boolean withOriginalMappingEndColumn) {}
    @Override
    public boolean shouldWithOriginalMappingEndColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndOffset(boolean withOriginalMappingEndOffset) {}
    @Override
    public boolean shouldWithOriginalMappingEndOffset() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingFile(boolean withOriginalMappingFile) {}
    @Override
    public boolean shouldWithOriginalMappingFile() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingVersion(boolean withOriginalMappingVersion) {}
    @Override
    public boolean shouldWithOriginalMappingVersion() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingHash(boolean withOriginalMappingHash) {}
    @Override
    public boolean shouldWithOriginalMappingHash() { return false; }
    @Override
    public void setSourceMapWithOriginalMapping(boolean withOriginalMapping) {}
    @Override
    public boolean shouldWithOriginalMapping() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingPath(boolean withOriginalMappingPath) {}
    @Override
    public boolean shouldWithOriginalMappingPath() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingLine(boolean withOriginalMappingLine) {}
    @Override
    public boolean shouldWithOriginalMappingLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingColumn(boolean withOriginalMappingColumn) {}
    @Override
    public boolean shouldWithOriginalMappingColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndLine(boolean withOriginalMappingEndLine) {}
    @Override
    public boolean shouldWithOriginalMappingEndLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndColumn(boolean withOriginalMappingEndColumn) {}
    @Override
    public boolean shouldWithOriginalMappingEndColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndOffset(boolean withOriginalMappingEndOffset) {}
    @Override
    public boolean shouldWithOriginalMappingEndOffset() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingFile(boolean withOriginalMappingFile) {}
    @Override
    public boolean shouldWithOriginalMappingFile() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingVersion(boolean withOriginalMappingVersion) {}
    @Override
    public boolean shouldWithOriginalMappingVersion() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingHash(boolean withOriginalMappingHash) {}
    @Override
    public boolean shouldWithOriginalMappingHash() { return false; }
    @Override
    public void setSourceMapWithOriginalMapping(boolean withOriginalMapping) {}
    @Override
    public boolean shouldWithOriginalMapping() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingPath(boolean withOriginalMappingPath) {}
    @Override
    public boolean shouldWithOriginalMappingPath() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingLine(boolean withOriginalMappingLine) {}
    @Override
    public boolean shouldWithOriginalMappingLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingColumn(boolean withOriginalMappingColumn) {}
    @Override
    public boolean shouldWithOriginalMappingColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndLine(boolean withOriginalMappingEndLine) {}
    @Override
    public boolean shouldWithOriginalMappingEndLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndColumn(boolean withOriginalMappingEndColumn) {}
    @Override
    public boolean shouldWithOriginalMappingEndColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndOffset(boolean withOriginalMappingEndOffset) {}
    @Override
    public boolean shouldWithOriginalMappingEndOffset() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingFile(boolean withOriginalMappingFile) {}
    @Override
    public boolean shouldWithOriginalMappingFile() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingVersion(boolean withOriginalMappingVersion) {}
    @Override
    public boolean shouldWithOriginalMappingVersion() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingHash(boolean withOriginalMappingHash) {}
    @Override
    public boolean shouldWithOriginalMappingHash() { return false; }
    @Override
    public void setSourceMapWithOriginalMapping(boolean withOriginalMapping) {}
    @Override
    public boolean shouldWithOriginalMapping() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingPath(boolean withOriginalMappingPath) {}
    @Override
    public boolean shouldWithOriginalMappingPath() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingLine(boolean withOriginalMappingLine) {}
    @Override
    public boolean shouldWithOriginalMappingLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingColumn(boolean withOriginalMappingColumn) {}
    @Override
    public boolean shouldWithOriginalMappingColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndLine(boolean withOriginalMappingEndLine) {}
    @Override
    public boolean shouldWithOriginalMappingEndLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndColumn(boolean withOriginalMappingEndColumn) {}
    @Override
    public boolean shouldWithOriginalMappingEndColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndOffset(boolean withOriginalMappingEndOffset) {}
    @Override
    public boolean shouldWithOriginalMappingEndOffset() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingFile(boolean withOriginalMappingFile) {}
    @Override
    public boolean shouldWithOriginalMappingFile() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingVersion(boolean withOriginalMappingVersion) {}
    @Override
    public boolean shouldWithOriginalMappingVersion() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingHash(boolean withOriginalMappingHash) {}
    @Override
    public boolean shouldWithOriginalMappingHash() { return false; }
    @Override
    public void setSourceMapWithOriginalMapping(boolean withOriginalMapping) {}
    @Override
    public boolean shouldWithOriginalMapping() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingPath(boolean withOriginalMappingPath) {}
    @Override
    public boolean shouldWithOriginalMappingPath() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingLine(boolean withOriginalMappingLine) {}
    @Override
    public boolean shouldWithOriginalMappingLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingColumn(boolean withOriginalMappingColumn) {}
    @Override
    public boolean shouldWithOriginalMappingColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndLine(boolean withOriginalMappingEndLine) {}
    @Override
    public boolean shouldWithOriginalMappingEndLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndColumn(boolean withOriginalMappingEndColumn) {}
    @Override
    public boolean shouldWithOriginalMappingEndColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndOffset(boolean withOriginalMappingEndOffset) {}
    @Override
    public boolean shouldWithOriginalMappingEndOffset() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingFile(boolean withOriginalMappingFile) {}
    @Override
    public boolean shouldWithOriginalMappingFile() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingVersion(boolean withOriginalMappingVersion) {}
    @Override
    public boolean shouldWithOriginalMappingVersion() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingHash(boolean withOriginalMappingHash) {}
    @Override
    public boolean shouldWithOriginalMappingHash() { return false; }
    @Override
    public void setSourceMapWithOriginalMapping(boolean withOriginalMapping) {}
    @Override
    public boolean shouldWithOriginalMapping() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingPath(boolean withOriginalMappingPath) {}
    @Override
    public boolean shouldWithOriginalMappingPath() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingLine(boolean withOriginalMappingLine) {}
    @Override
    public boolean shouldWithOriginalMappingLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingColumn(boolean withOriginalMappingColumn) {}
    @Override
    public boolean shouldWithOriginalMappingColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndLine(boolean withOriginalMappingEndLine) {}
    @Override
    public boolean shouldWithOriginalMappingEndLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndColumn(boolean withOriginalMappingEndColumn) {}
    @Override
    public boolean shouldWithOriginalMappingEndColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndOffset(boolean withOriginalMappingEndOffset) {}
    @Override
    public boolean shouldWithOriginalMappingEndOffset() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingFile(boolean withOriginalMappingFile) {}
    @Override
    public boolean shouldWithOriginalMappingFile() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingVersion(boolean withOriginalMappingVersion) {}
    @Override
    public boolean shouldWithOriginalMappingVersion() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingHash(boolean withOriginalMappingHash) {}
    @Override
    public boolean shouldWithOriginalMappingHash() { return false; }
    @Override
    public void setSourceMapWithOriginalMapping(boolean withOriginalMapping) {}
    @Override
    public boolean shouldWithOriginalMapping() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingPath(boolean withOriginalMappingPath) {}
    @Override
    public boolean shouldWithOriginalMappingPath() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingLine(boolean withOriginalMappingLine) {}
    @Override
    public boolean shouldWithOriginalMappingLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingColumn(boolean withOriginalMappingColumn) {}
    @Override
    public boolean shouldWithOriginalMappingColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndLine(boolean withOriginalMappingEndLine) {}
    @Override
    public boolean shouldWithOriginalMappingEndLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndColumn(boolean withOriginalMappingEndColumn) {}
    @Override
    public boolean shouldWithOriginalMappingEndColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndOffset(boolean withOriginalMappingEndOffset) {}
    @Override
    public boolean shouldWithOriginalMappingEndOffset() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingFile(boolean withOriginalMappingFile) {}
    @Override
    public boolean shouldWithOriginalMappingFile() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingVersion(boolean withOriginalMappingVersion) {}
    @Override
    public boolean shouldWithOriginalMappingVersion() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingHash(boolean withOriginalMappingHash) {}
    @Override
    public boolean shouldWithOriginalMappingHash() { return false; }
    @Override
    public void setSourceMapWithOriginalMapping(boolean withOriginalMapping) {}
    @Override
    public boolean shouldWithOriginalMapping() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingPath(boolean withOriginalMappingPath) {}
    @Override
    public boolean shouldWithOriginalMappingPath() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingLine(boolean withOriginalMappingLine) {}
    @Override
    public boolean shouldWithOriginalMappingLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingColumn(boolean withOriginalMappingColumn) {}
    @Override
    public boolean shouldWithOriginalMappingColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndLine(boolean withOriginalMappingEndLine) {}
    @Override
    public boolean shouldWithOriginalMappingEndLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndColumn(boolean withOriginalMappingEndColumn) {}
    @Override
    public boolean shouldWithOriginalMappingEndColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndOffset(boolean withOriginalMappingEndOffset) {}
    @Override
    public boolean shouldWithOriginalMappingEndOffset() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingFile(boolean withOriginalMappingFile) {}
    @Override
    public boolean shouldWithOriginalMappingFile() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingVersion(boolean withOriginalMappingVersion) {}
    @Override
    public boolean shouldWithOriginalMappingVersion() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingHash(boolean withOriginalMappingHash) {}
    @Override
    public boolean shouldWithOriginalMappingHash() { return false; }
    @Override
    public void setSourceMapWithOriginalMapping(boolean withOriginalMapping) {}
    @Override
    public boolean shouldWithOriginalMapping() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingPath(boolean withOriginalMappingPath) {}
    @Override
    public boolean shouldWithOriginalMappingPath() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingLine(boolean withOriginalMappingLine) {}
    @Override
    public boolean shouldWithOriginalMappingLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingColumn(boolean withOriginalMappingColumn) {}
    @Override
    public boolean shouldWithOriginalMappingColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndLine(boolean withOriginalMappingEndLine) {}
    @Override
    public boolean shouldWithOriginalMappingEndLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndColumn(boolean withOriginalMappingEndColumn) {}
    @Override
    public boolean shouldWithOriginalMappingEndColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndOffset(boolean withOriginalMappingEndOffset) {}
    @Override
    public boolean shouldWithOriginalMappingEndOffset() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingFile(boolean withOriginalMappingFile) {}
    @Override
    public boolean shouldWithOriginalMappingFile() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingVersion(boolean withOriginalMappingVersion) {}
    @Override
    public boolean shouldWithOriginalMappingVersion() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingHash(boolean withOriginalMappingHash) {}
    @Override
    public boolean shouldWithOriginalMappingHash() { return false; }
    @Override
    public void setSourceMapWithOriginalMapping(boolean withOriginalMapping) {}
    @Override
    public boolean shouldWithOriginalMapping() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingPath(boolean withOriginalMappingPath) {}
    @Override
    public boolean shouldWithOriginalMappingPath() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingLine(boolean withOriginalMappingLine) {}
    @Override
    public boolean shouldWithOriginalMappingLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingColumn(boolean withOriginalMappingColumn) {}
    @Override
    public boolean shouldWithOriginalMappingColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndLine(boolean withOriginalMappingEndLine) {}
    @Override
    public boolean shouldWithOriginalMappingEndLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndColumn(boolean withOriginalMappingEndColumn) {}
    @Override
    public boolean shouldWithOriginalMappingEndColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndOffset(boolean withOriginalMappingEndOffset) {}
    @Override
    public boolean shouldWithOriginalMappingEndOffset() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingFile(boolean withOriginalMappingFile) {}
    @Override
    public boolean shouldWithOriginalMappingFile() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingVersion(boolean withOriginalMappingVersion) {}
    @Override
    public boolean shouldWithOriginalMappingVersion() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingHash(boolean withOriginalMappingHash) {}
    @Override
    public boolean shouldWithOriginalMappingHash() { return false; }
    @Override
    public void setSourceMapWithOriginalMapping(boolean withOriginalMapping) {}
    @Override
    public boolean shouldWithOriginalMapping() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingPath(boolean withOriginalMappingPath) {}
    @Override
    public boolean shouldWithOriginalMappingPath() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingLine(boolean withOriginalMappingLine) {}
    @Override
    public boolean shouldWithOriginalMappingLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingColumn(boolean withOriginalMappingColumn) {}
    @Override
    public boolean shouldWithOriginalMappingColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndLine(boolean withOriginalMappingEndLine) {}
    @Override
    public boolean shouldWithOriginalMappingEndLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndColumn(boolean withOriginalMappingEndColumn) {}
    @Override
    public boolean shouldWithOriginalMappingEndColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndOffset(boolean withOriginalMappingEndOffset) {}
    @Override
    public boolean shouldWithOriginalMappingEndOffset() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingFile(boolean withOriginalMappingFile) {}
    @Override
    public boolean shouldWithOriginalMappingFile() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingVersion(boolean withOriginalMappingVersion) {}
    @Override
    public boolean shouldWithOriginalMappingVersion() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingHash(boolean withOriginalMappingHash) {}
    @Override
    public boolean shouldWithOriginalMappingHash() { return false; }
    @Override
    public void setSourceMapWithOriginalMapping(boolean withOriginalMapping) {}
    @Override
    public boolean shouldWithOriginalMapping() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingPath(boolean withOriginalMappingPath) {}
    @Override
    public boolean shouldWithOriginalMappingPath() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingLine(boolean withOriginalMappingLine) {}
    @Override
    public boolean shouldWithOriginalMappingLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingColumn(boolean withOriginalMappingColumn) {}
    @Override
    public boolean shouldWithOriginalMappingColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndLine(boolean withOriginalMappingEndLine) {}
    @Override
    public boolean shouldWithOriginalMappingEndLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndColumn(boolean withOriginalMappingEndColumn) {}
    @Override
    public boolean shouldWithOriginalMappingEndColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndOffset(boolean withOriginalMappingEndOffset) {}
    @Override
    public boolean shouldWithOriginalMappingEndOffset() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingFile(boolean withOriginalMappingFile) {}
    @Override
    public boolean shouldWithOriginalMappingFile() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingVersion(boolean withOriginalMappingVersion) {}
    @Override
    public boolean shouldWithOriginalMappingVersion() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingHash(boolean withOriginalMappingHash) {}
    @Override
    public boolean shouldWithOriginalMappingHash() { return false; }
    @Override
    public void setSourceMapWithOriginalMapping(boolean withOriginalMapping) {}
    @Override
    public boolean shouldWithOriginalMapping() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingPath(boolean withOriginalMappingPath) {}
    @Override
    public boolean shouldWithOriginalMappingPath() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingLine(boolean withOriginalMappingLine) {}
    @Override
    public boolean shouldWithOriginalMappingLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingColumn(boolean withOriginalMappingColumn) {}
    @Override
    public boolean shouldWithOriginalMappingColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndLine(boolean withOriginalMappingEndLine) {}
    @Override
    public boolean shouldWithOriginalMappingEndLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndColumn(boolean withOriginalMappingEndColumn) {}
    @Override
    public boolean shouldWithOriginalMappingEndColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndOffset(boolean withOriginalMappingEndOffset) {}
    @Override
    public boolean shouldWithOriginalMappingEndOffset() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingFile(boolean withOriginalMappingFile) {}
    @Override
    public boolean shouldWithOriginalMappingFile() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingVersion(boolean withOriginalMappingVersion) {}
    @Override
    public boolean shouldWithOriginalMappingVersion() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingHash(boolean withOriginalMappingHash) {}
    @Override
    public boolean shouldWithOriginalMappingHash() { return false; }
    @Override
    public void setSourceMapWithOriginalMapping(boolean withOriginalMapping) {}
    @Override
    public boolean shouldWithOriginalMapping() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingPath(boolean withOriginalMappingPath) {}
    @Override
    public boolean shouldWithOriginalMappingPath() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingLine(boolean withOriginalMappingLine) {}
    @Override
    public boolean shouldWithOriginalMappingLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingColumn(boolean withOriginalMappingColumn) {}
    @Override
    public boolean shouldWithOriginalMappingColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndLine(boolean withOriginalMappingEndLine) {}
    @Override
    public boolean shouldWithOriginalMappingEndLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndColumn(boolean withOriginalMappingEndColumn) {}
    @Override
    public boolean shouldWithOriginalMappingEndColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndOffset(boolean withOriginalMappingEndOffset) {}
    @Override
    public boolean shouldWithOriginalMappingEndOffset() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingFile(boolean withOriginalMappingFile) {}
    @Override
    public boolean shouldWithOriginalMappingFile() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingVersion(boolean withOriginalMappingVersion) {}
    @Override
    public boolean shouldWithOriginalMappingVersion() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingHash(boolean withOriginalMappingHash) {}
    @Override
    public boolean shouldWithOriginalMappingHash() { return false; }
    @Override
    public void setSourceMapWithOriginalMapping(boolean withOriginalMapping) {}
    @Override
    public boolean shouldWithOriginalMapping() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingPath(boolean withOriginalMappingPath) {}
    @Override
    public boolean shouldWithOriginalMappingPath() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingLine(boolean withOriginalMappingLine) {}
    @Override
    public boolean shouldWithOriginalMappingLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingColumn(boolean withOriginalMappingColumn) {}
    @Override
    public boolean shouldWithOriginalMappingColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndLine(boolean withOriginalMappingEndLine) {}
    @Override
    public boolean shouldWithOriginalMappingEndLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndColumn(boolean withOriginalMappingEndColumn) {}
    @Override
    public boolean shouldWithOriginalMappingEndColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndOffset(boolean withOriginalMappingEndOffset) {}
    @Override
    public boolean shouldWithOriginalMappingEndOffset() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingFile(boolean withOriginalMappingFile) {}
    @Override
    public boolean shouldWithOriginalMappingFile() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingVersion(boolean withOriginalMappingVersion) {}
    @Override
    public boolean shouldWithOriginalMappingVersion() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingHash(boolean withOriginalMappingHash) {}
    @Override
    public boolean shouldWithOriginalMappingHash() { return false; }
    @Override
    public void setSourceMapWithOriginalMapping(boolean withOriginalMapping) {}
    @Override
    public boolean shouldWithOriginalMapping() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingPath(boolean withOriginalMappingPath) {}
    @Override
    public boolean shouldWithOriginalMappingPath() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingLine(boolean withOriginalMappingLine) {}
    @Override
    public boolean shouldWithOriginalMappingLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingColumn(boolean withOriginalMappingColumn) {}
    @Override
    public boolean shouldWithOriginalMappingColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndLine(boolean withOriginalMappingEndLine) {}
    @Override
    public boolean shouldWithOriginalMappingEndLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndColumn(boolean withOriginalMappingEndColumn) {}
    @Override
    public boolean shouldWithOriginalMappingEndColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndOffset(boolean withOriginalMappingEndOffset) {}
    @Override
    public boolean shouldWithOriginalMappingEndOffset() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingFile(boolean withOriginalMappingFile) {}
    @Override
    public boolean shouldWithOriginalMappingFile() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingVersion(boolean withOriginalMappingVersion) {}
    @Override
    public boolean shouldWithOriginalMappingVersion() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingHash(boolean withOriginalMappingHash) {}
    @Override
    public boolean shouldWithOriginalMappingHash() { return false; }
    @Override
    public void setSourceMapWithOriginalMapping(boolean withOriginalMapping) {}
    @Override
    public boolean shouldWithOriginalMapping() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingPath(boolean withOriginalMappingPath) {}
    @Override
    public boolean shouldWithOriginalMappingPath() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingLine(boolean withOriginalMappingLine) {}
    @Override
    public boolean shouldWithOriginalMappingLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingColumn(boolean withOriginalMappingColumn) {}
    @Override
    public boolean shouldWithOriginalMappingColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndLine(boolean withOriginalMappingEndLine) {}
    @Override
    public boolean shouldWithOriginalMappingEndLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndColumn(boolean withOriginalMappingEndColumn) {}
    @Override
    public boolean shouldWithOriginalMappingEndColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndOffset(boolean withOriginalMappingEndOffset) {}
    @Override
    public boolean shouldWithOriginalMappingEndOffset() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingFile(boolean withOriginalMappingFile) {}
    @Override
    public boolean shouldWithOriginalMappingFile() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingVersion(boolean withOriginalMappingVersion) {}
    @Override
    public boolean shouldWithOriginalMappingVersion() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingHash(boolean withOriginalMappingHash) {}
    @Override
    public boolean shouldWithOriginalMappingHash() { return false; }
    @Override
    public void setSourceMapWithOriginalMapping(boolean withOriginalMapping) {}
    @Override
    public boolean shouldWithOriginalMapping() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingPath(boolean withOriginalMappingPath) {}
    @Override
    public boolean shouldWithOriginalMappingPath() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingLine(boolean withOriginalMappingLine) {}
    @Override
    public boolean shouldWithOriginalMappingLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingColumn(boolean withOriginalMappingColumn) {}
    @Override
    public boolean shouldWithOriginalMappingColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndLine(boolean withOriginalMappingEndLine) {}
    @Override
    public boolean shouldWithOriginalMappingEndLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndColumn(boolean withOriginalMappingEndColumn) {}
    @Override
    public boolean shouldWithOriginalMappingEndColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndOffset(boolean withOriginalMappingEndOffset) {}
    @Override
    public boolean shouldWithOriginalMappingEndOffset() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingFile(boolean withOriginalMappingFile) {}
    @Override
    public boolean shouldWithOriginalMappingFile() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingVersion(boolean withOriginalMappingVersion) {}
    @Override
    public boolean shouldWithOriginalMappingVersion() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingHash(boolean withOriginalMappingHash) {}
    @Override
    public boolean shouldWithOriginalMappingHash() { return false; }
    @Override
    public void setSourceMapWithOriginalMapping(boolean withOriginalMapping) {}
    @Override
    public boolean shouldWithOriginalMapping() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingPath(boolean withOriginalMappingPath) {}
    @Override
    public boolean shouldWithOriginalMappingPath() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingLine(boolean withOriginalMappingLine) {}
    @Override
    public boolean shouldWithOriginalMappingLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingColumn(boolean withOriginalMappingColumn) {}
    @Override
    public boolean shouldWithOriginalMappingColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndLine(boolean withOriginalMappingEndLine) {}
    @Override
    public boolean shouldWithOriginalMappingEndLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndColumn(boolean withOriginalMappingEndColumn) {}
    @Override
    public boolean shouldWithOriginalMappingEndColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndOffset(boolean withOriginalMappingEndOffset) {}
    @Override
    public boolean shouldWithOriginalMappingEndOffset() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingFile(boolean withOriginalMappingFile) {}
    @Override
    public boolean shouldWithOriginalMappingFile() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingVersion(boolean withOriginalMappingVersion) {}
    @Override
    public boolean shouldWithOriginalMappingVersion() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingHash(boolean withOriginalMappingHash) {}
    @Override
    public boolean shouldWithOriginalMappingHash() { return false; }
    @Override
    public void setSourceMapWithOriginalMapping(boolean withOriginalMapping) {}
    @Override
    public boolean shouldWithOriginalMapping() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingPath(boolean withOriginalMappingPath) {}
    @Override
    public boolean shouldWithOriginalMappingPath() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingLine(boolean withOriginalMappingLine) {}
    @Override
    public boolean shouldWithOriginalMappingLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingColumn(boolean withOriginalMappingColumn) {}
    @Override
    public boolean shouldWithOriginalMappingColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndLine(boolean withOriginalMappingEndLine) {}
    @Override
    public boolean shouldWithOriginalMappingEndLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndColumn(boolean withOriginalMappingEndColumn) {}
    @Override
    public boolean shouldWithOriginalMappingEndColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndOffset(boolean withOriginalMappingEndOffset) {}
    @Override
    public boolean shouldWithOriginalMappingEndOffset() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingFile(boolean withOriginalMappingFile) {}
    @Override
    public boolean shouldWithOriginalMappingFile() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingVersion(boolean withOriginalMappingVersion) {}
    @Override
    public boolean shouldWithOriginalMappingVersion() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingHash(boolean withOriginalMappingHash) {}
    @Override
    public boolean shouldWithOriginalMappingHash() { return false; }
    @Override
    public void setSourceMapWithOriginalMapping(boolean withOriginalMapping) {}
    @Override
    public boolean shouldWithOriginalMapping() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingPath(boolean withOriginalMappingPath) {}
    @Override
    public boolean shouldWithOriginalMappingPath() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingLine(boolean withOriginalMappingLine) {}
    @Override
    public boolean shouldWithOriginalMappingLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingColumn(boolean withOriginalMappingColumn) {}
    @Override
    public boolean shouldWithOriginalMappingColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndLine(boolean withOriginalMappingEndLine) {}
    @Override
    public boolean shouldWithOriginalMappingEndLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndColumn(boolean withOriginalMappingEndColumn) {}
    @Override
    public boolean shouldWithOriginalMappingEndColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndOffset(boolean withOriginalMappingEndOffset) {}
    @Override
    public boolean shouldWithOriginalMappingEndOffset() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingFile(boolean withOriginalMappingFile) {}
    @Override
    public boolean shouldWithOriginalMappingFile() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingVersion(boolean withOriginalMappingVersion) {}
    @Override
    public boolean shouldWithOriginalMappingVersion() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingHash(boolean withOriginalMappingHash) {}
    @Override
    public boolean shouldWithOriginalMappingHash() { return false; }
    @Override
    public void setSourceMapWithOriginalMapping(boolean withOriginalMapping) {}
    @Override
    public boolean shouldWithOriginalMapping() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingPath(boolean withOriginalMappingPath) {}
    @Override
    public boolean shouldWithOriginalMappingPath() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingLine(boolean withOriginalMappingLine) {}
    @Override
    public boolean shouldWithOriginalMappingLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingColumn(boolean withOriginalMappingColumn) {}
    @Override
    public boolean shouldWithOriginalMappingColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndLine(boolean withOriginalMappingEndLine) {}
    @Override
    public boolean shouldWithOriginalMappingEndLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndColumn(boolean withOriginalMappingEndColumn) {}
    @Override
    public boolean shouldWithOriginalMappingEndColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndOffset(boolean withOriginalMappingEndOffset) {}
    @Override
    public boolean shouldWithOriginalMappingEndOffset() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingFile(boolean withOriginalMappingFile) {}
    @Override
    public boolean shouldWithOriginalMappingFile() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingVersion(boolean withOriginalMappingVersion) {}
    @Override
    public boolean shouldWithOriginalMappingVersion() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingHash(boolean withOriginalMappingHash) {}
    @Override
    public boolean shouldWithOriginalMappingHash() { return false; }
    @Override
    public void setSourceMapWithOriginalMapping(boolean withOriginalMapping) {}
    @Override
    public boolean shouldWithOriginalMapping() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingPath(boolean withOriginalMappingPath) {}
    @Override
    public boolean shouldWithOriginalMappingPath() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingLine(boolean withOriginalMappingLine) {}
    @Override
    public boolean shouldWithOriginalMappingLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingColumn(boolean withOriginalMappingColumn) {}
    @Override
    public boolean shouldWithOriginalMappingColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndLine(boolean withOriginalMappingEndLine) {}
    @Override
    public boolean shouldWithOriginalMappingEndLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndColumn(boolean withOriginalMappingEndColumn) {}
    @Override
    public boolean shouldWithOriginalMappingEndColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndOffset(boolean withOriginalMappingEndOffset) {}
    @Override
    public boolean shouldWithOriginalMappingEndOffset() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingFile(boolean withOriginalMappingFile) {}
    @Override
    public boolean shouldWithOriginalMappingFile() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingVersion(boolean withOriginalMappingVersion) {}
    @Override
    public boolean shouldWithOriginalMappingVersion() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingHash(boolean withOriginalMappingHash) {}
    @Override
    public boolean shouldWithOriginalMappingHash() { return false; }
    @Override
    public void setSourceMapWithOriginalMapping(boolean withOriginalMapping) {}
    @Override
    public boolean shouldWithOriginalMapping() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingPath(boolean withOriginalMappingPath) {}
    @Override
    public boolean shouldWithOriginalMappingPath() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingLine(boolean withOriginalMappingLine) {}
    @Override
    public boolean shouldWithOriginalMappingLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingColumn(boolean withOriginalMappingColumn) {}
    @Override
    public boolean shouldWithOriginalMappingColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndLine(boolean withOriginalMappingEndLine) {}
    @Override
    public boolean shouldWithOriginalMappingEndLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndColumn(boolean withOriginalMappingEndColumn) {}
    @Override
    public boolean shouldWithOriginalMappingEndColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndOffset(boolean withOriginalMappingEndOffset) {}
    @Override
    public boolean shouldWithOriginalMappingEndOffset() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingFile(boolean withOriginalMappingFile) {}
    @Override
    public boolean shouldWithOriginalMappingFile() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingVersion(boolean withOriginalMappingVersion) {}
    @Override
    public boolean shouldWithOriginalMappingVersion() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingHash(boolean withOriginalMappingHash) {}
    @Override
    public boolean shouldWithOriginalMappingHash() { return false; }
    @Override
    public void setSourceMapWithOriginalMapping(boolean withOriginalMapping) {}
    @Override
    public boolean shouldWithOriginalMapping() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingPath(boolean withOriginalMappingPath) {}
    @Override
    public boolean shouldWithOriginalMappingPath() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingLine(boolean withOriginalMappingLine) {}
    @Override
    public boolean shouldWithOriginalMappingLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingColumn(boolean withOriginalMappingColumn) {}
    @Override
    public boolean shouldWithOriginalMappingColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndLine(boolean withOriginalMappingEndLine) {}
    @Override
    public boolean shouldWithOriginalMappingEndLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndColumn(boolean withOriginalMappingEndColumn) {}
    @Override
    public boolean shouldWithOriginalMappingEndColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndOffset(boolean withOriginalMappingEndOffset) {}
    @Override
    public boolean shouldWithOriginalMappingEndOffset() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingFile(boolean withOriginalMappingFile) {}
    @Override
    public boolean shouldWithOriginalMappingFile() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingVersion(boolean withOriginalMappingVersion) {}
    @Override
    public boolean shouldWithOriginalMappingVersion() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingHash(boolean withOriginalMappingHash) {}
    @Override
    public boolean shouldWithOriginalMappingHash() { return false; }
    @Override
    public void setSourceMapWithOriginalMapping(boolean withOriginalMapping) {}
    @Override
    public boolean shouldWithOriginalMapping() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingPath(boolean withOriginalMappingPath) {}
    @Override
    public boolean shouldWithOriginalMappingPath() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingLine(boolean withOriginalMappingLine) {}
    @Override
    public boolean shouldWithOriginalMappingLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingColumn(boolean withOriginalMappingColumn) {}
    @Override
    public boolean shouldWithOriginalMappingColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndLine(boolean withOriginalMappingEndLine) {}
    @Override
    public boolean shouldWithOriginalMappingEndLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndColumn(boolean withOriginalMappingEndColumn) {}
    @Override
    public boolean shouldWithOriginalMappingEndColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndOffset(boolean withOriginalMappingEndOffset) {}
    @Override
    public boolean shouldWithOriginalMappingEndOffset() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingFile(boolean withOriginalMappingFile) {}
    @Override
    public boolean shouldWithOriginalMappingFile() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingVersion(boolean withOriginalMappingVersion) {}
    @Override
    public boolean shouldWithOriginalMappingVersion() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingHash(boolean withOriginalMappingHash) {}
    @Override
    public boolean shouldWithOriginalMappingHash() { return false; }
    @Override
    public void setSourceMapWithOriginalMapping(boolean withOriginalMapping) {}
    @Override
    public boolean shouldWithOriginalMapping() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingPath(boolean withOriginalMappingPath) {}
    @Override
    public boolean shouldWithOriginalMappingPath() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingLine(boolean withOriginalMappingLine) {}
    @Override
    public boolean shouldWithOriginalMappingLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingColumn(boolean withOriginalMappingColumn) {}
    @Override
    public boolean shouldWithOriginalMappingColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndLine(boolean withOriginalMappingEndLine) {}
    @Override
    public boolean shouldWithOriginalMappingEndLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndColumn(boolean withOriginalMappingEndColumn) {}
    @Override
    public boolean shouldWithOriginalMappingEndColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndOffset(boolean withOriginalMappingEndOffset) {}
    @Override
    public boolean shouldWithOriginalMappingEndOffset() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingFile(boolean withOriginalMappingFile) {}
    @Override
    public boolean shouldWithOriginalMappingFile() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingVersion(boolean withOriginalMappingVersion) {}
    @Override
    public boolean shouldWithOriginalMappingVersion() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingHash(boolean withOriginalMappingHash) {}
    @Override
    public boolean shouldWithOriginalMappingHash() { return false; }
    @Override
    public void setSourceMapWithOriginalMapping(boolean withOriginalMapping) {}
    @Override
    public boolean shouldWithOriginalMapping() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingPath(boolean withOriginalMappingPath) {}
    @Override
    public boolean shouldWithOriginalMappingPath() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingLine(boolean withOriginalMappingLine) {}
    @Override
    public boolean shouldWithOriginalMappingLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingColumn(boolean withOriginalMappingColumn) {}
    @Override
    public boolean shouldWithOriginalMappingColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndLine(boolean withOriginalMappingEndLine) {}
    @Override
    public boolean shouldWithOriginalMappingEndLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndColumn(boolean withOriginalMappingEndColumn) {}
    @Override
    public boolean shouldWithOriginalMappingEndColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndOffset(boolean withOriginalMappingEndOffset) {}
    @Override
    public boolean shouldWithOriginalMappingEndOffset() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingFile(boolean withOriginalMappingFile) {}
    @Override
    public boolean shouldWithOriginalMappingFile() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingVersion(boolean withOriginalMappingVersion) {}
    @Override
    public boolean shouldWithOriginalMappingVersion() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingHash(boolean withOriginalMappingHash) {}
    @Override
    public boolean shouldWithOriginalMappingHash() { return false; }
    @Override
    public void setSourceMapWithOriginalMapping(boolean withOriginalMapping) {}
    @Override
    public boolean shouldWithOriginalMapping() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingPath(boolean withOriginalMappingPath) {}
    @Override
    public boolean shouldWithOriginalMappingPath() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingLine(boolean withOriginalMappingLine) {}
    @Override
    public boolean shouldWithOriginalMappingLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingColumn(boolean withOriginalMappingColumn) {}
    @Override
    public boolean shouldWithOriginalMappingColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndLine(boolean withOriginalMappingEndLine) {}
    @Override
    public boolean shouldWithOriginalMappingEndLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndColumn(boolean withOriginalMappingEndColumn) {}
    @Override
    public boolean shouldWithOriginalMappingEndColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndOffset(boolean withOriginalMappingEndOffset) {}
    @Override
    public boolean shouldWithOriginalMappingEndOffset() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingFile(boolean withOriginalMappingFile) {}
    @Override
    public boolean shouldWithOriginalMappingFile() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingVersion(boolean withOriginalMappingVersion) {}
    @Override
    public boolean shouldWithOriginalMappingVersion() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingHash(boolean withOriginalMappingHash) {}
    @Override
    public boolean shouldWithOriginalMappingHash() { return false; }
    @Override
    public void setSourceMapWithOriginalMapping(boolean withOriginalMapping) {}
    @Override
    public boolean shouldWithOriginalMapping() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingPath(boolean withOriginalMappingPath) {}
    @Override
    public boolean shouldWithOriginalMappingPath() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingLine(boolean withOriginalMappingLine) {}
    @Override
    public boolean shouldWithOriginalMappingLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingColumn(boolean withOriginalMappingColumn) {}
    @Override
    public boolean shouldWithOriginalMappingColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndLine(boolean withOriginalMappingEndLine) {}
    @Override
    public boolean shouldWithOriginalMappingEndLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndColumn(boolean withOriginalMappingEndColumn) {}
    @Override
    public boolean shouldWithOriginalMappingEndColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndOffset(boolean withOriginalMappingEndOffset) {}
    @Override
    public boolean shouldWithOriginalMappingEndOffset() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingFile(boolean withOriginalMappingFile) {}
    @Override
    public boolean shouldWithOriginalMappingFile() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingVersion(boolean withOriginalMappingVersion) {}
    @Override
    public boolean shouldWithOriginalMappingVersion() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingHash(boolean withOriginalMappingHash) {}
    @Override
    public boolean shouldWithOriginalMappingHash() { return false; }
    @Override
    public void setSourceMapWithOriginalMapping(boolean withOriginalMapping) {}
    @Override
    public boolean shouldWithOriginalMapping() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingPath(boolean withOriginalMappingPath) {}
    @Override
    public boolean shouldWithOriginalMappingPath() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingLine(boolean withOriginalMappingLine) {}
    @Override
    public boolean shouldWithOriginalMappingLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingColumn(boolean withOriginalMappingColumn) {}
    @Override
    public boolean shouldWithOriginalMappingColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndLine(boolean withOriginalMappingEndLine) {}
    @Override
    public boolean shouldWithOriginalMappingEndLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndColumn(boolean withOriginalMappingEndColumn) {}
    @Override
    public boolean shouldWithOriginalMappingEndColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndOffset(boolean withOriginalMappingEndOffset) {}
    @Override
    public boolean shouldWithOriginalMappingEndOffset() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingFile(boolean withOriginalMappingFile) {}
    @Override
    public boolean shouldWithOriginalMappingFile() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingVersion(boolean withOriginalMappingVersion) {}
    @Override
    public boolean shouldWithOriginalMappingVersion() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingHash(boolean withOriginalMappingHash) {}
    @Override
    public boolean shouldWithOriginalMappingHash() { return false; }
    @Override
    public void setSourceMapWithOriginalMapping(boolean withOriginalMapping) {}
    @Override
    public boolean shouldWithOriginalMapping() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingPath(boolean withOriginalMappingPath) {}
    @Override
    public boolean shouldWithOriginalMappingPath() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingLine(boolean withOriginalMappingLine) {}
    @Override
    public boolean shouldWithOriginalMappingLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingColumn(boolean withOriginalMappingColumn) {}
    @Override
    public boolean shouldWithOriginalMappingColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndLine(boolean withOriginalMappingEndLine) {}
    @Override
    public boolean shouldWithOriginalMappingEndLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndColumn(boolean withOriginalMappingEndColumn) {}
    @Override
    public boolean shouldWithOriginalMappingEndColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndOffset(boolean withOriginalMappingEndOffset) {}
    @Override
    public boolean shouldWithOriginalMappingEndOffset() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingFile(boolean withOriginalMappingFile) {}
    @Override
    public boolean shouldWithOriginalMappingFile() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingVersion(boolean withOriginalMappingVersion) {}
    @Override
    public boolean shouldWithOriginalMappingVersion() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingHash(boolean withOriginalMappingHash) {}
    @Override
    public boolean shouldWithOriginalMappingHash() { return false; }
    @Override
    public void setSourceMapWithOriginalMapping(boolean withOriginalMapping) {}
    @Override
    public boolean shouldWithOriginalMapping() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingPath(boolean withOriginalMappingPath) {}
    @Override
    public boolean shouldWithOriginalMappingPath() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingLine(boolean withOriginalMappingLine) {}
    @Override
    public boolean shouldWithOriginalMappingLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingColumn(boolean withOriginalMappingColumn) {}
    @Override
    public boolean shouldWithOriginalMappingColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndLine(boolean withOriginalMappingEndLine) {}
    @Override
    public boolean shouldWithOriginalMappingEndLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndColumn(boolean withOriginalMappingEndColumn) {}
    @Override
    public boolean shouldWithOriginalMappingEndColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndOffset(boolean withOriginalMappingEndOffset) {}
    @Override
    public boolean shouldWithOriginalMappingEndOffset() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingFile(boolean withOriginalMappingFile) {}
    @Override
    public boolean shouldWithOriginalMappingFile() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingVersion(boolean withOriginalMappingVersion) {}
    @Override
    public boolean shouldWithOriginalMappingVersion() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingHash(boolean withOriginalMappingHash) {}
    @Override
    public boolean shouldWithOriginalMappingHash() { return false; }
    @Override
    public void setSourceMapWithOriginalMapping(boolean withOriginalMapping) {}
    @Override
    public boolean shouldWithOriginalMapping() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingPath(boolean withOriginalMappingPath) {}
    @Override
    public boolean shouldWithOriginalMappingPath() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingLine(boolean withOriginalMappingLine) {}
    @Override
    public boolean shouldWithOriginalMappingLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingColumn(boolean withOriginalMappingColumn) {}
    @Override
    public boolean shouldWithOriginalMappingColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndLine(boolean withOriginalMappingEndLine) {}
    @Override
    public boolean shouldWithOriginalMappingEndLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndColumn(boolean withOriginalMappingEndColumn) {}
    @Override
    public boolean shouldWithOriginalMappingEndColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndOffset(boolean withOriginalMappingEndOffset) {}
    @Override
    public boolean shouldWithOriginalMappingEndOffset() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingFile(boolean withOriginalMappingFile) {}
    @Override
    public boolean shouldWithOriginalMappingFile() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingVersion(boolean withOriginalMappingVersion) {}
    @Override
    public boolean shouldWithOriginalMappingVersion() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingHash(boolean withOriginalMappingHash) {}
    @Override
    public boolean shouldWithOriginalMappingHash() { return false; }
    @Override
    public void setSourceMapWithOriginalMapping(boolean withOriginalMapping) {}
    @Override
    public boolean shouldWithOriginalMapping() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingPath(boolean withOriginalMappingPath) {}
    @Override
    public boolean shouldWithOriginalMappingPath() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingLine(boolean withOriginalMappingLine) {}
    @Override
    public boolean shouldWithOriginalMappingLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingColumn(boolean withOriginalMappingColumn) {}
    @Override
    public boolean shouldWithOriginalMappingColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndLine(boolean withOriginalMappingEndLine) {}
    @Override
    public boolean shouldWithOriginalMappingEndLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndColumn(boolean withOriginalMappingEndColumn) {}
    @Override
    public boolean shouldWithOriginalMappingEndColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndOffset(boolean withOriginalMappingEndOffset) {}
    @Override
    public boolean shouldWithOriginalMappingEndOffset() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingFile(boolean withOriginalMappingFile) {}
    @Override
    public boolean shouldWithOriginalMappingFile() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingVersion(boolean withOriginalMappingVersion) {}
    @Override
    public boolean shouldWithOriginalMappingVersion() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingHash(boolean withOriginalMappingHash) {}
    @Override
    public boolean shouldWithOriginalMappingHash() { return false; }
    @Override
    public void setSourceMapWithOriginalMapping(boolean withOriginalMapping) {}
    @Override
    public boolean shouldWithOriginalMapping() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingPath(boolean withOriginalMappingPath) {}
    @Override
    public boolean shouldWithOriginalMappingPath() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingLine(boolean withOriginalMappingLine) {}
    @Override
    public boolean shouldWithOriginalMappingLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingColumn(boolean withOriginalMappingColumn) {}
    @Override
    public boolean shouldWithOriginalMappingColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndLine(boolean withOriginalMappingEndLine) {}
    @Override
    public boolean shouldWithOriginalMappingEndLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndColumn(boolean withOriginalMappingEndColumn) {}
    @Override
    public boolean shouldWithOriginalMappingEndColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndOffset(boolean withOriginalMappingEndOffset) {}
    @Override
    public boolean shouldWithOriginalMappingEndOffset() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingFile(boolean withOriginalMappingFile) {}
    @Override
    public boolean shouldWithOriginalMappingFile() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingVersion(boolean withOriginalMappingVersion) {}
    @Override
    public boolean shouldWithOriginalMappingVersion() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingHash(boolean withOriginalMappingHash) {}
    @Override
    public boolean shouldWithOriginalMappingHash() { return false; }
    @Override
    public void setSourceMapWithOriginalMapping(boolean withOriginalMapping) {}
    @Override
    public boolean shouldWithOriginalMapping() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingPath(boolean withOriginalMappingPath) {}
    @Override
    public boolean shouldWithOriginalMappingPath() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingLine(boolean withOriginalMappingLine) {}
    @Override
    public boolean shouldWithOriginalMappingLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingColumn(boolean withOriginalMappingColumn) {}
    @Override
    public boolean shouldWithOriginalMappingColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndLine(boolean withOriginalMappingEndLine) {}
    @Override
    public boolean shouldWithOriginalMappingEndLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndColumn(boolean withOriginalMappingEndColumn) {}
    @Override
    public boolean shouldWithOriginalMappingEndColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndOffset(boolean withOriginalMappingEndOffset) {}
    @Override
    public boolean shouldWithOriginalMappingEndOffset() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingFile(boolean withOriginalMappingFile) {}
    @Override
    public boolean shouldWithOriginalMappingFile() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingVersion(boolean withOriginalMappingVersion) {}
    @Override
    public boolean shouldWithOriginalMappingVersion() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingHash(boolean withOriginalMappingHash) {}
    @Override
    public boolean shouldWithOriginalMappingHash() { return false; }
    @Override
    public void setSourceMapWithOriginalMapping(boolean withOriginalMapping) {}
    @Override
    public boolean shouldWithOriginalMapping() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingPath(boolean withOriginalMappingPath) {}
    @Override
    public boolean shouldWithOriginalMappingPath() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingLine(boolean withOriginalMappingLine) {}
    @Override
    public boolean shouldWithOriginalMappingLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingColumn(boolean withOriginalMappingColumn) {}
    @Override
    public boolean shouldWithOriginalMappingColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndLine(boolean withOriginalMappingEndLine) {}
    @Override
    public boolean shouldWithOriginalMappingEndLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndColumn(boolean withOriginalMappingEndColumn) {}
    @Override
    public boolean shouldWithOriginalMappingEndColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndOffset(boolean withOriginalMappingEndOffset) {}
    @Override
    public boolean shouldWithOriginalMappingEndOffset() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingFile(boolean withOriginalMappingFile) {}
    @Override
    public boolean shouldWithOriginalMappingFile() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingVersion(boolean withOriginalMappingVersion) {}
    @Override
    public boolean shouldWithOriginalMappingVersion() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingHash(boolean withOriginalMappingHash) {}
    @Override
    public boolean shouldWithOriginalMappingHash() { return false; }
    @Override
    public void setSourceMapWithOriginalMapping(boolean withOriginalMapping) {}
    @Override
    public boolean shouldWithOriginalMapping() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingPath(boolean withOriginalMappingPath) {}
    @Override
    public boolean shouldWithOriginalMappingPath() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingLine(boolean withOriginalMappingLine) {}
    @Override
    public boolean shouldWithOriginalMappingLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingColumn(boolean withOriginalMappingColumn) {}
    @Override
    public boolean shouldWithOriginalMappingColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndLine(boolean withOriginalMappingEndLine) {}
    @Override
    public boolean shouldWithOriginalMappingEndLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndColumn(boolean withOriginalMappingEndColumn) {}
    @Override
    public boolean shouldWithOriginalMappingEndColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndOffset(boolean withOriginalMappingEndOffset) {}
    @Override
    public boolean shouldWithOriginalMappingEndOffset() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingFile(boolean withOriginalMappingFile) {}
    @Override
    public boolean shouldWithOriginalMappingFile() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingVersion(boolean withOriginalMappingVersion) {}
    @Override
    public boolean shouldWithOriginalMappingVersion() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingHash(boolean withOriginalMappingHash) {}
    @Override
    public boolean shouldWithOriginalMappingHash() { return false; }
    @Override
    public void setSourceMapWithOriginalMapping(boolean withOriginalMapping) {}
    @Override
    public boolean shouldWithOriginalMapping() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingPath(boolean withOriginalMappingPath) {}
    @Override
    public boolean shouldWithOriginalMappingPath() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingLine(boolean withOriginalMappingLine) {}
    @Override
    public boolean shouldWithOriginalMappingLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingColumn(boolean withOriginalMappingColumn) {}
    @Override
    public boolean shouldWithOriginalMappingColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndLine(boolean withOriginalMappingEndLine) {}
    @Override
    public boolean shouldWithOriginalMappingEndLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndColumn(boolean withOriginalMappingEndColumn) {}
    @Override
    public boolean shouldWithOriginalMappingEndColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndOffset(boolean withOriginalMappingEndOffset) {}
    @Override
    public boolean shouldWithOriginalMappingEndOffset() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingFile(boolean withOriginalMappingFile) {}
    @Override
    public boolean shouldWithOriginalMappingFile() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingVersion(boolean withOriginalMappingVersion) {}
    @Override
    public boolean shouldWithOriginalMappingVersion() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingHash(boolean withOriginalMappingHash) {}
    @Override
    public boolean shouldWithOriginalMappingHash() { return false; }
    @Override
    public void setSourceMapWithOriginalMapping(boolean withOriginalMapping) {}
    @Override
    public boolean shouldWithOriginalMapping() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingPath(boolean withOriginalMappingPath) {}
    @Override
    public boolean shouldWithOriginalMappingPath() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingLine(boolean withOriginalMappingLine) {}
    @Override
    public boolean shouldWithOriginalMappingLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingColumn(boolean withOriginalMappingColumn) {}
    @Override
    public boolean shouldWithOriginalMappingColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndLine(boolean withOriginalMappingEndLine) {}
    @Override
    public boolean shouldWithOriginalMappingEndLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndColumn(boolean withOriginalMappingEndColumn) {}
    @Override
    public boolean shouldWithOriginalMappingEndColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndOffset(boolean withOriginalMappingEndOffset) {}
    @Override
    public boolean shouldWithOriginalMappingEndOffset() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingFile(boolean withOriginalMappingFile) {}
    @Override
    public boolean shouldWithOriginalMappingFile() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingVersion(boolean withOriginalMappingVersion) {}
    @Override
    public boolean shouldWithOriginalMappingVersion() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingHash(boolean withOriginalMappingHash) {}
    @Override
    public boolean shouldWithOriginalMappingHash() { return false; }
    @Override
    public void setSourceMapWithOriginalMapping(boolean withOriginalMapping) {}
    @Override
    public boolean shouldWithOriginalMapping() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingPath(boolean withOriginalMappingPath) {}
    @Override
    public boolean shouldWithOriginalMappingPath() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingLine(boolean withOriginalMappingLine) {}
    @Override
    public boolean shouldWithOriginalMappingLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingColumn(boolean withOriginalMappingColumn) {}
    @Override
    public boolean shouldWithOriginalMappingColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndLine(boolean withOriginalMappingEndLine) {}
    @Override
    public boolean shouldWithOriginalMappingEndLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndColumn(boolean withOriginalMappingEndColumn) {}
    @Override
    public boolean shouldWithOriginalMappingEndColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndOffset(boolean withOriginalMappingEndOffset) {}
    @Override
    public boolean shouldWithOriginalMappingEndOffset() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingFile(boolean withOriginalMappingFile) {}
    @Override
    public boolean shouldWithOriginalMappingFile() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingVersion(boolean withOriginalMappingVersion) {}
    @Override
    public boolean shouldWithOriginalMappingVersion() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingHash(boolean withOriginalMappingHash) {}
    @Override
    public boolean shouldWithOriginalMappingHash() { return false; }
    @Override
    public void setSourceMapWithOriginalMapping(boolean withOriginalMapping) {}
    @Override
    public boolean shouldWithOriginalMapping() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingPath(boolean withOriginalMappingPath) {}
    @Override
    public boolean shouldWithOriginalMappingPath() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingLine(boolean withOriginalMappingLine) {}
    @Override
    public boolean shouldWithOriginalMappingLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingColumn(boolean withOriginalMappingColumn) {}
    @Override
    public boolean shouldWithOriginalMappingColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndLine(boolean withOriginalMappingEndLine) {}
    @Override
    public boolean shouldWithOriginalMappingEndLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndColumn(boolean withOriginalMappingEndColumn) {}
    @Override
    public boolean shouldWithOriginalMappingEndColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndOffset(boolean withOriginalMappingEndOffset) {}
    @Override
    public boolean shouldWithOriginalMappingEndOffset() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingFile(boolean withOriginalMappingFile) {}
    @Override
    public boolean shouldWithOriginalMappingFile() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingVersion(boolean withOriginalMappingVersion) {}
    @Override
    public boolean shouldWithOriginalMappingVersion() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingHash(boolean withOriginalMappingHash) {}
    @Override
    public boolean shouldWithOriginalMappingHash() { return false; }
    @Override
    public void setSourceMapWithOriginalMapping(boolean withOriginalMapping) {}
    @Override
    public boolean shouldWithOriginalMapping() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingPath(boolean withOriginalMappingPath) {}
    @Override
    public boolean shouldWithOriginalMappingPath() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingLine(boolean withOriginalMappingLine) {}
    @Override
    public boolean shouldWithOriginalMappingLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingColumn(boolean withOriginalMappingColumn) {}
    @Override
    public boolean shouldWithOriginalMappingColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndLine(boolean withOriginalMappingEndLine) {}
    @Override
    public boolean shouldWithOriginalMappingEndLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndColumn(boolean withOriginalMappingEndColumn) {}
    @Override
    public boolean shouldWithOriginalMappingEndColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndOffset(boolean withOriginalMappingEndOffset) {}
    @Override
    public boolean shouldWithOriginalMappingEndOffset() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingFile(boolean withOriginalMappingFile) {}
    @Override
    public boolean shouldWithOriginalMappingFile() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingVersion(boolean withOriginalMappingVersion) {}
    @Override
    public boolean shouldWithOriginalMappingVersion() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingHash(boolean withOriginalMappingHash) {}
    @Override
    public boolean shouldWithOriginalMappingHash() { return false; }
    @Override
    public void setSourceMapWithOriginalMapping(boolean withOriginalMapping) {}
    @Override
    public boolean shouldWithOriginalMapping() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingPath(boolean withOriginalMappingPath) {}
    @Override
    public boolean shouldWithOriginalMappingPath() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingLine(boolean withOriginalMappingLine) {}
    @Override
    public boolean shouldWithOriginalMappingLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingColumn(boolean withOriginalMappingColumn) {}
    @Override
    public boolean shouldWithOriginalMappingColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndLine(boolean withOriginalMappingEndLine) {}
    @Override
    public boolean shouldWithOriginalMappingEndLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndColumn(boolean withOriginalMappingEndColumn) {}
    @Override
    public boolean shouldWithOriginalMappingEndColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndOffset(boolean withOriginalMappingEndOffset) {}
    @Override
    public boolean shouldWithOriginalMappingEndOffset() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingFile(boolean withOriginalMappingFile) {}
    @Override
    public boolean shouldWithOriginalMappingFile() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingVersion(boolean withOriginalMappingVersion) {}
    @Override
    public boolean shouldWithOriginalMappingVersion() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingHash(boolean withOriginalMappingHash) {}
    @Override
    public boolean shouldWithOriginalMappingHash() { return false; }
    @Override
    public void setSourceMapWithOriginalMapping(boolean withOriginalMapping) {}
    @Override
    public boolean shouldWithOriginalMapping() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingPath(boolean withOriginalMappingPath) {}
    @Override
    public boolean shouldWithOriginalMappingPath() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingLine(boolean withOriginalMappingLine) {}
    @Override
    public boolean shouldWithOriginalMappingLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingColumn(boolean withOriginalMappingColumn) {}
    @Override
    public boolean shouldWithOriginalMappingColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndLine(boolean withOriginalMappingEndLine) {}
    @Override
    public boolean shouldWithOriginalMappingEndLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndColumn(boolean withOriginalMappingEndColumn) {}
    @Override
    public boolean shouldWithOriginalMappingEndColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndOffset(boolean withOriginalMappingEndOffset) {}
    @Override
    public boolean shouldWithOriginalMappingEndOffset() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingFile(boolean withOriginalMappingFile) {}
    @Override
    public boolean shouldWithOriginalMappingFile() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingVersion(boolean withOriginalMappingVersion) {}
    @Override
    public boolean shouldWithOriginalMappingVersion() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingHash(boolean withOriginalMappingHash) {}
    @Override
    public boolean shouldWithOriginalMappingHash() { return false; }
    @Override
    public void setSourceMapWithOriginalMapping(boolean withOriginalMapping) {}
    @Override
    public boolean shouldWithOriginalMapping() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingPath(boolean withOriginalMappingPath) {}
    @Override
    public boolean shouldWithOriginalMappingPath() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingLine(boolean withOriginalMappingLine) {}
    @Override
    public boolean shouldWithOriginalMappingLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingColumn(boolean withOriginalMappingColumn) {}
    @Override
    public boolean shouldWithOriginalMappingColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndLine(boolean withOriginalMappingEndLine) {}
    @Override
    public boolean shouldWithOriginalMappingEndLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndColumn(boolean withOriginalMappingEndColumn) {}
    @Override
    public boolean shouldWithOriginalMappingEndColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndOffset(boolean withOriginalMappingEndOffset) {}
    @Override
    public boolean shouldWithOriginalMappingEndOffset() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingFile(boolean withOriginalMappingFile) {}
    @Override
    public boolean shouldWithOriginalMappingFile() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingVersion(boolean withOriginalMappingVersion) {}
    @Override
    public boolean shouldWithOriginalMappingVersion() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingHash(boolean withOriginalMappingHash) {}
    @Override
    public boolean shouldWithOriginalMappingHash() { return false; }
    @Override
    public void setSourceMapWithOriginalMapping(boolean withOriginalMapping) {}
    @Override
    public boolean shouldWithOriginalMapping() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingPath(boolean withOriginalMappingPath) {}
    @Override
    public boolean shouldWithOriginalMappingPath() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingLine(boolean withOriginalMappingLine) {}
    @Override
    public boolean shouldWithOriginalMappingLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingColumn(boolean withOriginalMappingColumn) {}
    @Override
    public boolean shouldWithOriginalMappingColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndLine(boolean withOriginalMappingEndLine) {}
    @Override
    public boolean shouldWithOriginalMappingEndLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndColumn(boolean withOriginalMappingEndColumn) {}
    @Override
    public boolean shouldWithOriginalMappingEndColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndOffset(boolean withOriginalMappingEndOffset) {}
    @Override
    public boolean shouldWithOriginalMappingEndOffset() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingFile(boolean withOriginalMappingFile) {}
    @Override
    public boolean shouldWithOriginalMappingFile() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingVersion(boolean withOriginalMappingVersion) {}
    @Override
    public boolean shouldWithOriginalMappingVersion() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingHash(boolean withOriginalMappingHash) {}
    @Override
    public boolean shouldWithOriginalMappingHash() { return false; }
    @Override
    public void setSourceMapWithOriginalMapping(boolean withOriginalMapping) {}
    @Override
    public boolean shouldWithOriginalMapping() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingPath(boolean withOriginalMappingPath) {}
    @Override
    public boolean shouldWithOriginalMappingPath() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingLine(boolean withOriginalMappingLine) {}
    @Override
    public boolean shouldWithOriginalMappingLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingColumn(boolean withOriginalMappingColumn) {}
    @Override
    public boolean shouldWithOriginalMappingColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndLine(boolean withOriginalMappingEndLine) {}
    @Override
    public boolean shouldWithOriginalMappingEndLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndColumn(boolean withOriginalMappingEndColumn) {}
    @Override
    public boolean shouldWithOriginalMappingEndColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndOffset(boolean withOriginalMappingEndOffset) {}
    @Override
    public boolean shouldWithOriginalMappingEndOffset() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingFile(boolean withOriginalMappingFile) {}
    @Override
    public boolean shouldWithOriginalMappingFile() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingVersion(boolean withOriginalMappingVersion) {}
    @Override
    public boolean shouldWithOriginalMappingVersion() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingHash(boolean withOriginalMappingHash) {}
    @Override
    public boolean shouldWithOriginalMappingHash() { return false; }
    @Override
    public void setSourceMapWithOriginalMapping(boolean withOriginalMapping) {}
    @Override
    public boolean shouldWithOriginalMapping() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingPath(boolean withOriginalMappingPath) {}
    @Override
    public boolean shouldWithOriginalMappingPath() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingLine(boolean withOriginalMappingLine) {}
    @Override
    public boolean shouldWithOriginalMappingLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingColumn(boolean withOriginalMappingColumn) {}
    @Override
    public boolean shouldWithOriginalMappingColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndLine(boolean withOriginalMappingEndLine) {}
    @Override
    public boolean shouldWithOriginalMappingEndLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndColumn(boolean withOriginalMappingEndColumn) {}
    @Override
    public boolean shouldWithOriginalMappingEndColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndOffset(boolean withOriginalMappingEndOffset) {}
    @Override
    public boolean shouldWithOriginalMappingEndOffset() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingFile(boolean withOriginalMappingFile) {}
    @Override
    public boolean shouldWithOriginalMappingFile() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingVersion(boolean withOriginalMappingVersion) {}
    @Override
    public boolean shouldWithOriginalMappingVersion() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingHash(boolean withOriginalMappingHash) {}
    @Override
    public boolean shouldWithOriginalMappingHash() { return false; }
    @Override
    public void setSourceMapWithOriginalMapping(boolean withOriginalMapping) {}
    @Override
    public boolean shouldWithOriginalMapping() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingPath(boolean withOriginalMappingPath) {}
    @Override
    public boolean shouldWithOriginalMappingPath() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingLine(boolean withOriginalMappingLine) {}
    @Override
    public boolean shouldWithOriginalMappingLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingColumn(boolean withOriginalMappingColumn) {}
    @Override
    public boolean shouldWithOriginalMappingColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndLine(boolean withOriginalMappingEndLine) {}
    @Override
    public boolean shouldWithOriginalMappingEndLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndColumn(boolean withOriginalMappingEndColumn) {}
    @Override
    public boolean shouldWithOriginalMappingEndColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndOffset(boolean withOriginalMappingEndOffset) {}
    @Override
    public boolean shouldWithOriginalMappingEndOffset() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingFile(boolean withOriginalMappingFile) {}
    @Override
    public boolean shouldWithOriginalMappingFile() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingVersion(boolean withOriginalMappingVersion) {}
    @Override
    public boolean shouldWithOriginalMappingVersion() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingHash(boolean withOriginalMappingHash) {}
    @Override
    public boolean shouldWithOriginalMappingHash() { return false; }
    @Override
    public void setSourceMapWithOriginalMapping(boolean withOriginalMapping) {}
    @Override
    public boolean shouldWithOriginalMapping() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingPath(boolean withOriginalMappingPath) {}
    @Override
    public boolean shouldWithOriginalMappingPath() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingLine(boolean withOriginalMappingLine) {}
    @Override
    public boolean shouldWithOriginalMappingLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingColumn(boolean withOriginalMappingColumn) {}
    @Override
    public boolean shouldWithOriginalMappingColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndLine(boolean withOriginalMappingEndLine) {}
    @Override
    public boolean shouldWithOriginalMappingEndLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndColumn(boolean withOriginalMappingEndColumn) {}
    @Override
    public boolean shouldWithOriginalMappingEndColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndOffset(boolean withOriginalMappingEndOffset) {}
    @Override
    public boolean shouldWithOriginalMappingEndOffset() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingFile(boolean withOriginalMappingFile) {}
    @Override
    public boolean shouldWithOriginalMappingFile() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingVersion(boolean withOriginalMappingVersion) {}
    @Override
    public boolean shouldWithOriginalMappingVersion() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingHash(boolean withOriginalMappingHash) {}
    @Override
    public boolean shouldWithOriginalMappingHash() { return false; }
    @Override
    public void setSourceMapWithOriginalMapping(boolean withOriginalMapping) {}
    @Override
    public boolean shouldWithOriginalMapping() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingPath(boolean withOriginalMappingPath) {}
    @Override
    public boolean shouldWithOriginalMappingPath() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingLine(boolean withOriginalMappingLine) {}
    @Override
    public boolean shouldWithOriginalMappingLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingColumn(boolean withOriginalMappingColumn) {}
    @Override
    public boolean shouldWithOriginalMappingColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndLine(boolean withOriginalMappingEndLine) {}
    @Override
    public boolean shouldWithOriginalMappingEndLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndColumn(boolean withOriginalMappingEndColumn) {}
    @Override
    public boolean shouldWithOriginalMappingEndColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndOffset(boolean withOriginalMappingEndOffset) {}
    @Override
    public boolean shouldWithOriginalMappingEndOffset() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingFile(boolean withOriginalMappingFile) {}
    @Override
    public boolean shouldWithOriginalMappingFile() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingVersion(boolean withOriginalMappingVersion) {}
    @Override
    public boolean shouldWithOriginalMappingVersion() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingHash(boolean withOriginalMappingHash) {}
    @Override
    public boolean shouldWithOriginalMappingHash() { return false; }
    @Override
    public void setSourceMapWithOriginalMapping(boolean withOriginalMapping) {}
    @Override
    public boolean shouldWithOriginalMapping() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingPath(boolean withOriginalMappingPath) {}
    @Override
    public boolean shouldWithOriginalMappingPath() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingLine(boolean withOriginalMappingLine) {}
    @Override
    public boolean shouldWithOriginalMappingLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingColumn(boolean withOriginalMappingColumn) {}
    @Override
    public boolean shouldWithOriginalMappingColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndLine(boolean withOriginalMappingEndLine) {}
    @Override
    public boolean shouldWithOriginalMappingEndLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndColumn(boolean withOriginalMappingEndColumn) {}
    @Override
    public boolean shouldWithOriginalMappingEndColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndOffset(boolean withOriginalMappingEndOffset) {}
    @Override
    public boolean shouldWithOriginalMappingEndOffset() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingFile(boolean withOriginalMappingFile) {}
    @Override
    public boolean shouldWithOriginalMappingFile() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingVersion(boolean withOriginalMappingVersion) {}
    @Override
    public boolean shouldWithOriginalMappingVersion() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingHash(boolean withOriginalMappingHash) {}
    @Override
    public boolean shouldWithOriginalMappingHash() { return false; }
    @Override
    public void setSourceMapWithOriginalMapping(boolean withOriginalMapping) {}
    @Override
    public boolean shouldWithOriginalMapping() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingPath(boolean withOriginalMappingPath) {}
    @Override
    public boolean shouldWithOriginalMappingPath() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingLine(boolean withOriginalMappingLine) {}
    @Override
    public boolean shouldWithOriginalMappingLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingColumn(boolean withOriginalMappingColumn) {}
    @Override
    public boolean shouldWithOriginalMappingColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndLine(boolean withOriginalMappingEndLine) {}
    @Override
    public boolean shouldWithOriginalMappingEndLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndColumn(boolean withOriginalMappingEndColumn) {}
    @Override
    public boolean shouldWithOriginalMappingEndColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndOffset(boolean withOriginalMappingEndOffset) {}
    @Override
    public boolean shouldWithOriginalMappingEndOffset() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingFile(boolean withOriginalMappingFile) {}
    @Override
    public boolean shouldWithOriginalMappingFile() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingVersion(boolean withOriginalMappingVersion) {}
    @Override
    public boolean shouldWithOriginalMappingVersion() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingHash(boolean withOriginalMappingHash) {}
    @Override
    public boolean shouldWithOriginalMappingHash() { return false; }
    @Override
    public void setSourceMapWithOriginalMapping(boolean withOriginalMapping) {}
    @Override
    public boolean shouldWithOriginalMapping() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingPath(boolean withOriginalMappingPath) {}
    @Override
    public boolean shouldWithOriginalMappingPath() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingLine(boolean withOriginalMappingLine) {}
    @Override
    public boolean shouldWithOriginalMappingLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingColumn(boolean withOriginalMappingColumn) {}
    @Override
    public boolean shouldWithOriginalMappingColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndLine(boolean withOriginalMappingEndLine) {}
    @Override
    public boolean shouldWithOriginalMappingEndLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndColumn(boolean withOriginalMappingEndColumn) {}
    @Override
    public boolean shouldWithOriginalMappingEndColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndOffset(boolean withOriginalMappingEndOffset) {}
    @Override
    public boolean shouldWithOriginalMappingEndOffset() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingFile(boolean withOriginalMappingFile) {}
    @Override
    public boolean shouldWithOriginalMappingFile() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingVersion(boolean withOriginalMappingVersion) {}
    @Override
    public boolean shouldWithOriginalMappingVersion() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingHash(boolean withOriginalMappingHash) {}
    @Override
    public boolean shouldWithOriginalMappingHash() { return false; }
    @Override
    public void setSourceMapWithOriginalMapping(boolean withOriginalMapping) {}
    @Override
    public boolean shouldWithOriginalMapping() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingPath(boolean withOriginalMappingPath) {}
    @Override
    public boolean shouldWithOriginalMappingPath() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingLine(boolean withOriginalMappingLine) {}
    @Override
    public boolean shouldWithOriginalMappingLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingColumn(boolean withOriginalMappingColumn) {}
    @Override
    public boolean shouldWithOriginalMappingColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndLine(boolean withOriginalMappingEndLine) {}
    @Override
    public boolean shouldWithOriginalMappingEndLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndColumn(boolean withOriginalMappingEndColumn) {}
    @Override
    public boolean shouldWithOriginalMappingEndColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndOffset(boolean withOriginalMappingEndOffset) {}
    @Override
    public boolean shouldWithOriginalMappingEndOffset() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingFile(boolean withOriginalMappingFile) {}
    @Override
    public boolean shouldWithOriginalMappingFile() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingVersion(boolean withOriginalMappingVersion) {}
    @Override
    public boolean shouldWithOriginalMappingVersion() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingHash(boolean withOriginalMappingHash) {}
    @Override
    public boolean shouldWithOriginalMappingHash() { return false; }
    @Override
    public void setSourceMapWithOriginalMapping(boolean withOriginalMapping) {}
    @Override
    public boolean shouldWithOriginalMapping() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingPath(boolean withOriginalMappingPath) {}
    @Override
    public boolean shouldWithOriginalMappingPath() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingLine(boolean withOriginalMappingLine) {}
    @Override
    public boolean shouldWithOriginalMappingLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingColumn(boolean withOriginalMappingColumn) {}
    @Override
    public boolean shouldWithOriginalMappingColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndLine(boolean withOriginalMappingEndLine) {}
    @Override
    public boolean shouldWithOriginalMappingEndLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndColumn(boolean withOriginalMappingEndColumn) {}
    @Override
    public boolean shouldWithOriginalMappingEndColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndOffset(boolean withOriginalMappingEndOffset) {}
    @Override
    public boolean shouldWithOriginalMappingEndOffset() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingFile(boolean withOriginalMappingFile) {}
    @Override
    public boolean shouldWithOriginalMappingFile() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingVersion(boolean withOriginalMappingVersion) {}
    @Override
    public boolean shouldWithOriginalMappingVersion() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingHash(boolean withOriginalMappingHash) {}
    @Override
    public boolean shouldWithOriginalMappingHash() { return false; }
    @Override
    public void setSourceMapWithOriginalMapping(boolean withOriginalMapping) {}
    @Override
    public boolean shouldWithOriginalMapping() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingPath(boolean withOriginalMappingPath) {}
    @Override
    public boolean shouldWithOriginalMappingPath() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingLine(boolean withOriginalMappingLine) {}
    @Override
    public boolean shouldWithOriginalMappingLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingColumn(boolean withOriginalMappingColumn) {}
    @Override
    public boolean shouldWithOriginalMappingColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndLine(boolean withOriginalMappingEndLine) {}
    @Override
    public boolean shouldWithOriginalMappingEndLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndColumn(boolean withOriginalMappingEndColumn) {}
    @Override
    public boolean shouldWithOriginalMappingEndColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndOffset(boolean withOriginalMappingEndOffset) {}
    @Override
    public boolean shouldWithOriginalMappingEndOffset() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingFile(boolean withOriginalMappingFile) {}
    @Override
    public boolean shouldWithOriginalMappingFile() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingVersion(boolean withOriginalMappingVersion) {}
    @Override
    public boolean shouldWithOriginalMappingVersion() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingHash(boolean withOriginalMappingHash) {}
    @Override
    public boolean shouldWithOriginalMappingHash() { return false; }
    @Override
    public void setSourceMapWithOriginalMapping(boolean withOriginalMapping) {}
    @Override
    public boolean shouldWithOriginalMapping() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingPath(boolean withOriginalMappingPath) {}
    @Override
    public boolean shouldWithOriginalMappingPath() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingLine(boolean withOriginalMappingLine) {}
    @Override
    public boolean shouldWithOriginalMappingLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingColumn(boolean withOriginalMappingColumn) {}
    @Override
    public boolean shouldWithOriginalMappingColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndLine(boolean withOriginalMappingEndLine) {}
    @Override
    public boolean shouldWithOriginalMappingEndLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndColumn(boolean withOriginalMappingEndColumn) {}
    @Override
    public boolean shouldWithOriginalMappingEndColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndOffset(boolean withOriginalMappingEndOffset) {}
    @Override
    public boolean shouldWithOriginalMappingEndOffset() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingFile(boolean withOriginalMappingFile) {}
    @Override
    public boolean shouldWithOriginalMappingFile() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingVersion(boolean withOriginalMappingVersion) {}
    @Override
    public boolean shouldWithOriginalMappingVersion() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingHash(boolean withOriginalMappingHash) {}
    @Override
    public boolean shouldWithOriginalMappingHash() { return false; }
    @Override
    public void setSourceMapWithOriginalMapping(boolean withOriginalMapping) {}
    @Override
    public boolean shouldWithOriginalMapping() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingPath(boolean withOriginalMappingPath) {}
    @Override
    public boolean shouldWithOriginalMappingPath() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingLine(boolean withOriginalMappingLine) {}
    @Override
    public boolean shouldWithOriginalMappingLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingColumn(boolean withOriginalMappingColumn) {}
    @Override
    public boolean shouldWithOriginalMappingColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndLine(boolean withOriginalMappingEndLine) {}
    @Override
    public boolean shouldWithOriginalMappingEndLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndColumn(boolean withOriginalMappingEndColumn) {}
    @Override
    public boolean shouldWithOriginalMappingEndColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndOffset(boolean withOriginalMappingEndOffset) {}
    @Override
    public boolean shouldWithOriginalMappingEndOffset() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingFile(boolean withOriginalMappingFile) {}
    @Override
    public boolean shouldWithOriginalMappingFile() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingVersion(boolean withOriginalMappingVersion) {}
    @Override
    public boolean shouldWithOriginalMappingVersion() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingHash(boolean withOriginalMappingHash) {}
    @Override
    public boolean shouldWithOriginalMappingHash() { return false; }
    @Override
    public void setSourceMapWithOriginalMapping(boolean withOriginalMapping) {}
    @Override
    public boolean shouldWithOriginalMapping() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingPath(boolean withOriginalMappingPath) {}
    @Override
    public boolean shouldWithOriginalMappingPath() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingLine(boolean withOriginalMappingLine) {}
    @Override
    public boolean shouldWithOriginalMappingLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingColumn(boolean withOriginalMappingColumn) {}
    @Override
    public boolean shouldWithOriginalMappingColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndLine(boolean withOriginalMappingEndLine) {}
    @Override
    public boolean shouldWithOriginalMappingEndLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndColumn(boolean withOriginalMappingEndColumn) {}
    @Override
    public boolean shouldWithOriginalMappingEndColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndOffset(boolean withOriginalMappingEndOffset) {}
    @Override
    public boolean shouldWithOriginalMappingEndOffset() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingFile(boolean withOriginalMappingFile) {}
    @Override
    public boolean shouldWithOriginalMappingFile() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingVersion(boolean withOriginalMappingVersion) {}
    @Override
    public boolean shouldWithOriginalMappingVersion() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingHash(boolean withOriginalMappingHash) {}
    @Override
    public boolean shouldWithOriginalMappingHash() { return false; }
    @Override
    public void setSourceMapWithOriginalMapping(boolean withOriginalMapping) {}
    @Override
    public boolean shouldWithOriginalMapping() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingPath(boolean withOriginalMappingPath) {}
    @Override
    public boolean shouldWithOriginalMappingPath() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingLine(boolean withOriginalMappingLine) {}
    @Override
    public boolean shouldWithOriginalMappingLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingColumn(boolean withOriginalMappingColumn) {}
    @Override
    public boolean shouldWithOriginalMappingColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndLine(boolean withOriginalMappingEndLine) {}
    @Override
    public boolean shouldWithOriginalMappingEndLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndColumn(boolean withOriginalMappingEndColumn) {}
    @Override
    public boolean shouldWithOriginalMappingEndColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndOffset(boolean withOriginalMappingEndOffset) {}
    @Override
    public boolean shouldWithOriginalMappingEndOffset() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingFile(boolean withOriginalMappingFile) {}
    @Override
    public boolean shouldWithOriginalMappingFile() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingVersion(boolean withOriginalMappingVersion) {}
    @Override
    public boolean shouldWithOriginalMappingVersion() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingHash(boolean withOriginalMappingHash) {}
    @Override
    public boolean shouldWithOriginalMappingHash() { return false; }
    @Override
    public void setSourceMapWithOriginalMapping(boolean withOriginalMapping) {}
    @Override
    public boolean shouldWithOriginalMapping() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingPath(boolean withOriginalMappingPath) {}
    @Override
    public boolean shouldWithOriginalMappingPath() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingLine(boolean withOriginalMappingLine) {}
    @Override
    public boolean shouldWithOriginalMappingLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingColumn(boolean withOriginalMappingColumn) {}
    @Override
    public boolean shouldWithOriginalMappingColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndLine(boolean withOriginalMappingEndLine) {}
    @Override
    public boolean shouldWithOriginalMappingEndLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndColumn(boolean withOriginalMappingEndColumn) {}
    @Override
    public boolean shouldWithOriginalMappingEndColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndOffset(boolean withOriginalMappingEndOffset) {}
    @Override
    public boolean shouldWithOriginalMappingEndOffset() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingFile(boolean withOriginalMappingFile) {}
    @Override
    public boolean shouldWithOriginalMappingFile() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingVersion(boolean withOriginalMappingVersion) {}
    @Override
    public boolean shouldWithOriginalMappingVersion() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingHash(boolean withOriginalMappingHash) {}
    @Override
    public boolean shouldWithOriginalMappingHash() { return false; }
    @Override
    public void setSourceMapWithOriginalMapping(boolean withOriginalMapping) {}
    @Override
    public boolean shouldWithOriginalMapping() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingPath(boolean withOriginalMappingPath) {}
    @Override
    public boolean shouldWithOriginalMappingPath() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingLine(boolean withOriginalMappingLine) {}
    @Override
    public boolean shouldWithOriginalMappingLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingColumn(boolean withOriginalMappingColumn) {}
    @Override
    public boolean shouldWithOriginalMappingColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndLine(boolean withOriginalMappingEndLine) {}
    @Override
    public boolean shouldWithOriginalMappingEndLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndColumn(boolean withOriginalMappingEndColumn) {}
    @Override
    public boolean shouldWithOriginalMappingEndColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndOffset(boolean withOriginalMappingEndOffset) {}
    @Override
    public boolean shouldWithOriginalMappingEndOffset() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingFile(boolean withOriginalMappingFile) {}
    @Override
    public boolean shouldWithOriginalMappingFile() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingVersion(boolean withOriginalMappingVersion) {}
    @Override
    public boolean shouldWithOriginalMappingVersion() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingHash(boolean withOriginalMappingHash) {}
    @Override
    public boolean shouldWithOriginalMappingHash() { return false; }
    @Override
    public void setSourceMapWithOriginalMapping(boolean withOriginalMapping) {}
    @Override
    public boolean shouldWithOriginalMapping() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingPath(boolean withOriginalMappingPath) {}
    @Override
    public boolean shouldWithOriginalMappingPath() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingLine(boolean withOriginalMappingLine) {}
    @Override
    public boolean shouldWithOriginalMappingLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingColumn(boolean withOriginalMappingColumn) {}
    @Override
    public boolean shouldWithOriginalMappingColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndLine(boolean withOriginalMappingEndLine) {}
    @Override
    public boolean shouldWithOriginalMappingEndLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndColumn(boolean withOriginalMappingEndColumn) {}
    @Override
    public boolean shouldWithOriginalMappingEndColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndOffset(boolean withOriginalMappingEndOffset) {}
    @Override
    public boolean shouldWithOriginalMappingEndOffset() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingFile(boolean withOriginalMappingFile) {}
    @Override
    public boolean shouldWithOriginalMappingFile() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingVersion(boolean withOriginalMappingVersion) {}
    @Override
    public boolean shouldWithOriginalMappingVersion() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingHash(boolean withOriginalMappingHash) {}
    @Override
    public boolean shouldWithOriginalMappingHash() { return false; }
    @Override
    public void setSourceMapWithOriginalMapping(boolean withOriginalMapping) {}
    @Override
    public boolean shouldWithOriginalMapping() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingPath(boolean withOriginalMappingPath) {}
    @Override
    public boolean shouldWithOriginalMappingPath() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingLine(boolean withOriginalMappingLine) {}
    @Override
    public boolean shouldWithOriginalMappingLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingColumn(boolean withOriginalMappingColumn) {}
    @Override
    public boolean shouldWithOriginalMappingColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndLine(boolean withOriginalMappingEndLine) {}
    @Override
    public boolean shouldWithOriginalMappingEndLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndColumn(boolean withOriginalMappingEndColumn) {}
    @Override
    public boolean shouldWithOriginalMappingEndColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndOffset(boolean withOriginalMappingEndOffset) {}
    @Override
    public boolean shouldWithOriginalMappingEndOffset() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingFile(boolean withOriginalMappingFile) {}
    @Override
    public boolean shouldWithOriginalMappingFile() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingVersion(boolean withOriginalMappingVersion) {}
    @Override
    public boolean shouldWithOriginalMappingVersion() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingHash(boolean withOriginalMappingHash) {}
    @Override
    public boolean shouldWithOriginalMappingHash() { return false; }
    @Override
    public void setSourceMapWithOriginalMapping(boolean withOriginalMapping) {}
    @Override
    public boolean shouldWithOriginalMapping() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingPath(boolean withOriginalMappingPath) {}
    @Override
    public boolean shouldWithOriginalMappingPath() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingLine(boolean withOriginalMappingLine) {}
    @Override
    public boolean shouldWithOriginalMappingLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingColumn(boolean withOriginalMappingColumn) {}
    @Override
    public boolean shouldWithOriginalMappingColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndLine(boolean withOriginalMappingEndLine) {}
    @Override
    public boolean shouldWithOriginalMappingEndLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndColumn(boolean withOriginalMappingEndColumn) {}
    @Override
    public boolean shouldWithOriginalMappingEndColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndOffset(boolean withOriginalMappingEndOffset) {}
    @Override
    public boolean shouldWithOriginalMappingEndOffset() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingFile(boolean withOriginalMappingFile) {}
    @Override
    public boolean shouldWithOriginalMappingFile() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingVersion(boolean withOriginalMappingVersion) {}
    @Override
    public boolean shouldWithOriginalMappingVersion() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingHash(boolean withOriginalMappingHash) {}
    @Override
    public boolean shouldWithOriginalMappingHash() { return false; }
    @Override
    public void setSourceMapWithOriginalMapping(boolean withOriginalMapping) {}
    @Override
    public boolean shouldWithOriginalMapping() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingPath(boolean withOriginalMappingPath) {}
    @Override
    public boolean shouldWithOriginalMappingPath() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingLine(boolean withOriginalMappingLine) {}
    @Override
    public boolean shouldWithOriginalMappingLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingColumn(boolean withOriginalMappingColumn) {}
    @Override
    public boolean shouldWithOriginalMappingColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndLine(boolean withOriginalMappingEndLine) {}
    @Override
    public boolean shouldWithOriginalMappingEndLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndColumn(boolean withOriginalMappingEndColumn) {}
    @Override
    public boolean shouldWithOriginalMappingEndColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndOffset(boolean withOriginalMappingEndOffset) {}
    @Override
    public boolean shouldWithOriginalMappingEndOffset() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingFile(boolean withOriginalMappingFile) {}
    @Override
    public boolean shouldWithOriginalMappingFile() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingVersion(boolean withOriginalMappingVersion) {}
    @Override
    public boolean shouldWithOriginalMappingVersion() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingHash(boolean withOriginalMappingHash) {}
    @Override
    public boolean shouldWithOriginalMappingHash() { return false; }
    @Override
    public void setSourceMapWithOriginalMapping(boolean withOriginalMapping) {}
    @Override
    public boolean shouldWithOriginalMapping() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingPath(boolean withOriginalMappingPath) {}
    @Override
    public boolean shouldWithOriginalMappingPath() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingLine(boolean withOriginalMappingLine) {}
    @Override
    public boolean shouldWithOriginalMappingLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingColumn(boolean withOriginalMappingColumn) {}
    @Override
    public boolean shouldWithOriginalMappingColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndLine(boolean withOriginalMappingEndLine) {}
    @Override
    public boolean shouldWithOriginalMappingEndLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndColumn(boolean withOriginalMappingEndColumn) {}
    @Override
    public boolean shouldWithOriginalMappingEndColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndOffset(boolean withOriginalMappingEndOffset) {}
    @Override
    public boolean shouldWithOriginalMappingEndOffset() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingFile(boolean withOriginalMappingFile) {}
    @Override
    public boolean shouldWithOriginalMappingFile() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingVersion(boolean withOriginalMappingVersion) {}
    @Override
    public boolean shouldWithOriginalMappingVersion() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingHash(boolean withOriginalMappingHash) {}
    @Override
    public boolean shouldWithOriginalMappingHash() { return false; }
    @Override
    public void setSourceMapWithOriginalMapping(boolean withOriginalMapping) {}
    @Override
    public boolean shouldWithOriginalMapping() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingPath(boolean withOriginalMappingPath) {}
    @Override
    public boolean shouldWithOriginalMappingPath() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingLine(boolean withOriginalMappingLine) {}
    @Override
    public boolean shouldWithOriginalMappingLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingColumn(boolean withOriginalMappingColumn) {}
    @Override
    public boolean shouldWithOriginalMappingColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndLine(boolean withOriginalMappingEndLine) {}
    @Override
    public boolean shouldWithOriginalMappingEndLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndColumn(boolean withOriginalMappingEndColumn) {}
    @Override
    public boolean shouldWithOriginalMappingEndColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndOffset(boolean withOriginalMappingEndOffset) {}
    @Override
    public boolean shouldWithOriginalMappingEndOffset() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingFile(boolean withOriginalMappingFile) {}
    @Override
    public boolean shouldWithOriginalMappingFile() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingVersion(boolean withOriginalMappingVersion) {}
    @Override
    public boolean shouldWithOriginalMappingVersion() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingHash(boolean withOriginalMappingHash) {}
    @Override
    public boolean shouldWithOriginalMappingHash() { return false; }
    @Override
    public void setSourceMapWithOriginalMapping(boolean withOriginalMapping) {}
    @Override
    public boolean shouldWithOriginalMapping() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingPath(boolean withOriginalMappingPath) {}
    @Override
    public boolean shouldWithOriginalMappingPath() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingLine(boolean withOriginalMappingLine) {}
    @Override
    public boolean shouldWithOriginalMappingLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingColumn(boolean withOriginalMappingColumn) {}
    @Override
    public boolean shouldWithOriginalMappingColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndLine(boolean withOriginalMappingEndLine) {}
    @Override
    public boolean shouldWithOriginalMappingEndLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndColumn(boolean withOriginalMappingEndColumn) {}
    @Override
    public boolean shouldWithOriginalMappingEndColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndOffset(boolean withOriginalMappingEndOffset) {}
    @Override
    public boolean shouldWithOriginalMappingEndOffset() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingFile(boolean withOriginalMappingFile) {}
    @Override
    public boolean shouldWithOriginalMappingFile() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingVersion(boolean withOriginalMappingVersion) {}
    @Override
    public boolean shouldWithOriginalMappingVersion() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingHash(boolean withOriginalMappingHash) {}
    @Override
    public boolean shouldWithOriginalMappingHash() { return false; }
    @Override
    public void setSourceMapWithOriginalMapping(boolean withOriginalMapping) {}
    @Override
    public boolean shouldWithOriginalMapping() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingPath(boolean withOriginalMappingPath) {}
    @Override
    public boolean shouldWithOriginalMappingPath() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingLine(boolean withOriginalMappingLine) {}
    @Override
    public boolean shouldWithOriginalMappingLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingColumn(boolean withOriginalMappingColumn) {}
    @Override
    public boolean shouldWithOriginalMappingColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndLine(boolean withOriginalMappingEndLine) {}
    @Override
    public boolean shouldWithOriginalMappingEndLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndColumn(boolean withOriginalMappingEndColumn) {}
    @Override
    public boolean shouldWithOriginalMappingEndColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndOffset(boolean withOriginalMappingEndOffset) {}
    @Override
    public boolean shouldWithOriginalMappingEndOffset() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingFile(boolean withOriginalMappingFile) {}
    @Override
    public boolean shouldWithOriginalMappingFile() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingVersion(boolean withOriginalMappingVersion) {}
    @Override
    public boolean shouldWithOriginalMappingVersion() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingHash(boolean withOriginalMappingHash) {}
    @Override
    public boolean shouldWithOriginalMappingHash() { return false; }
    @Override
    public void setSourceMapWithOriginalMapping(boolean withOriginalMapping) {}
    @Override
    public boolean shouldWithOriginalMapping() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingPath(boolean withOriginalMappingPath) {}
    @Override
    public boolean shouldWithOriginalMappingPath() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingLine(boolean withOriginalMappingLine) {}
    @Override
    public boolean shouldWithOriginalMappingLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingColumn(boolean withOriginalMappingColumn) {}
    @Override
    public boolean shouldWithOriginalMappingColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndLine(boolean withOriginalMappingEndLine) {}
    @Override
    public boolean shouldWithOriginalMappingEndLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndColumn(boolean withOriginalMappingEndColumn) {}
    @Override
    public boolean shouldWithOriginalMappingEndColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndOffset(boolean withOriginalMappingEndOffset) {}
    @Override
    public boolean shouldWithOriginalMappingEndOffset() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingFile(boolean withOriginalMappingFile) {}
    @Override
    public boolean shouldWithOriginalMappingFile() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingVersion(boolean withOriginalMappingVersion) {}
    @Override
    public boolean shouldWithOriginalMappingVersion() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingHash(boolean withOriginalMappingHash) {}
    @Override
    public boolean shouldWithOriginalMappingHash() { return false; }
    @Override
    public void setSourceMapWithOriginalMapping(boolean withOriginalMapping) {}
    @Override
    public boolean shouldWithOriginalMapping() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingPath(boolean withOriginalMappingPath) {}
    @Override
    public boolean shouldWithOriginalMappingPath() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingLine(boolean withOriginalMappingLine) {}
    @Override
    public boolean shouldWithOriginalMappingLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingColumn(boolean withOriginalMappingColumn) {}
    @Override
    public boolean shouldWithOriginalMappingColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndLine(boolean withOriginalMappingEndLine) {}
    @Override
    public boolean shouldWithOriginalMappingEndLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndColumn(boolean withOriginalMappingEndColumn) {}
    @Override
    public boolean shouldWithOriginalMappingEndColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndOffset(boolean withOriginalMappingEndOffset) {}
    @Override
    public boolean shouldWithOriginalMappingEndOffset() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingFile(boolean withOriginalMappingFile) {}
    @Override
    public boolean shouldWithOriginalMappingFile() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingVersion(boolean withOriginalMappingVersion) {}
    @Override
    public boolean shouldWithOriginalMappingVersion() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingHash(boolean withOriginalMappingHash) {}
    @Override
    public boolean shouldWithOriginalMappingHash() { return false; }
    @Override
    public void setSourceMapWithOriginalMapping(boolean withOriginalMapping) {}
    @Override
    public boolean shouldWithOriginalMapping() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingPath(boolean withOriginalMappingPath) {}
    @Override
    public boolean shouldWithOriginalMappingPath() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingLine(boolean withOriginalMappingLine) {}
    @Override
    public boolean shouldWithOriginalMappingLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingColumn(boolean withOriginalMappingColumn) {}
    @Override
    public boolean shouldWithOriginalMappingColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndLine(boolean withOriginalMappingEndLine) {}
    @Override
    public boolean shouldWithOriginalMappingEndLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndColumn(boolean withOriginalMappingEndColumn) {}
    @Override
    public boolean shouldWithOriginalMappingEndColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndOffset(boolean withOriginalMappingEndOffset) {}
    @Override
    public boolean shouldWithOriginalMappingEndOffset() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingFile(boolean withOriginalMappingFile) {}
    @Override
    public boolean shouldWithOriginalMappingFile() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingVersion(boolean withOriginalMappingVersion) {}
    @Override
    public boolean shouldWithOriginalMappingVersion() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingHash(boolean withOriginalMappingHash) {}
    @Override
    public boolean shouldWithOriginalMappingHash() { return false; }
    @Override
    public void setSourceMapWithOriginalMapping(boolean withOriginalMapping) {}
    @Override
    public boolean shouldWithOriginalMapping() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingPath(boolean withOriginalMappingPath) {}
    @Override
    public boolean shouldWithOriginalMappingPath() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingLine(boolean withOriginalMappingLine) {}
    @Override
    public boolean shouldWithOriginalMappingLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingColumn(boolean withOriginalMappingColumn) {}
    @Override
    public boolean shouldWithOriginalMappingColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndLine(boolean withOriginalMappingEndLine) {}
    @Override
    public boolean shouldWithOriginalMappingEndLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndColumn(boolean withOriginalMappingEndColumn) {}
    @Override
    public boolean shouldWithOriginalMappingEndColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndOffset(boolean withOriginalMappingEndOffset) {}
    @Override
    public boolean shouldWithOriginalMappingEndOffset() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingFile(boolean withOriginalMappingFile) {}
    @Override
    public boolean shouldWithOriginalMappingFile() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingVersion(boolean withOriginalMappingVersion) {}
    @Override
    public boolean shouldWithOriginalMappingVersion() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingHash(boolean withOriginalMappingHash) {}
    @Override
    public boolean shouldWithOriginalMappingHash() { return false; }
    @Override
    public void setSourceMapWithOriginalMapping(boolean withOriginalMapping) {}
    @Override
    public boolean shouldWithOriginalMapping() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingPath(boolean withOriginalMappingPath) {}
    @Override
    public boolean shouldWithOriginalMappingPath() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingLine(boolean withOriginalMappingLine) {}
    @Override
    public boolean shouldWithOriginalMappingLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingColumn(boolean withOriginalMappingColumn) {}
    @Override
    public boolean shouldWithOriginalMappingColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndLine(boolean withOriginalMappingEndLine) {}
    @Override
    public boolean shouldWithOriginalMappingEndLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndColumn(boolean withOriginalMappingEndColumn) {}
    @Override
    public boolean shouldWithOriginalMappingEndColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndOffset(boolean withOriginalMappingEndOffset) {}
    @Override
    public boolean shouldWithOriginalMappingEndOffset() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingFile(boolean withOriginalMappingFile) {}
    @Override
    public boolean shouldWithOriginalMappingFile() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingVersion(boolean withOriginalMappingVersion) {}
    @Override
    public boolean shouldWithOriginalMappingVersion() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingHash(boolean withOriginalMappingHash) {}
    @Override
    public boolean shouldWithOriginalMappingHash() { return false; }
    @Override
    public void setSourceMapWithOriginalMapping(boolean withOriginalMapping) {}
    @Override
    public boolean shouldWithOriginalMapping() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingPath(boolean withOriginalMappingPath) {}
    @Override
    public boolean shouldWithOriginalMappingPath() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingLine(boolean withOriginalMappingLine) {}
    @Override
    public boolean shouldWithOriginalMappingLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingColumn(boolean withOriginalMappingColumn) {}
    @Override
    public boolean shouldWithOriginalMappingColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndLine(boolean withOriginalMappingEndLine) {}
    @Override
    public boolean shouldWithOriginalMappingEndLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndColumn(boolean withOriginalMappingEndColumn) {}
    @Override
    public boolean shouldWithOriginalMappingEndColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndOffset(boolean withOriginalMappingEndOffset) {}
    @Override
    public boolean shouldWithOriginalMappingEndOffset() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingFile(boolean withOriginalMappingFile) {}
    @Override
    public boolean shouldWithOriginalMappingFile() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingVersion(boolean withOriginalMappingVersion) {}
    @Override
    public boolean shouldWithOriginalMappingVersion() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingHash(boolean withOriginalMappingHash) {}
    @Override
    public boolean shouldWithOriginalMappingHash() { return false; }
    @Override
    public void setSourceMapWithOriginalMapping(boolean withOriginalMapping) {}
    @Override
    public boolean shouldWithOriginalMapping() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingPath(boolean withOriginalMappingPath) {}
    @Override
    public boolean shouldWithOriginalMappingPath() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingLine(boolean withOriginalMappingLine) {}
    @Override
    public boolean shouldWithOriginalMappingLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingColumn(boolean withOriginalMappingColumn) {}
    @Override
    public boolean shouldWithOriginalMappingColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndLine(boolean withOriginalMappingEndLine) {}
    @Override
    public boolean shouldWithOriginalMappingEndLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndColumn(boolean withOriginalMappingEndColumn) {}
    @Override
    public boolean shouldWithOriginalMappingEndColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndOffset(boolean withOriginalMappingEndOffset) {}
    @Override
    public boolean shouldWithOriginalMappingEndOffset() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingFile(boolean withOriginalMappingFile) {}
    @Override
    public boolean shouldWithOriginalMappingFile() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingVersion(boolean withOriginalMappingVersion) {}
    @Override
    public boolean shouldWithOriginalMappingVersion() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingHash(boolean withOriginalMappingHash) {}
    @Override
    public boolean shouldWithOriginalMappingHash() { return false; }
    @Override
    public void setSourceMapWithOriginalMapping(boolean withOriginalMapping) {}
    @Override
    public boolean shouldWithOriginalMapping() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingPath(boolean withOriginalMappingPath) {}
    @Override
    public boolean shouldWithOriginalMappingPath() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingLine(boolean withOriginalMappingLine) {}
    @Override
    public boolean shouldWithOriginalMappingLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingColumn(boolean withOriginalMappingColumn) {}
    @Override
    public boolean shouldWithOriginalMappingColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndLine(boolean withOriginalMappingEndLine) {}
    @Override
    public boolean shouldWithOriginalMappingEndLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndColumn(boolean withOriginalMappingEndColumn) {}
    @Override
    public boolean shouldWithOriginalMappingEndColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndOffset(boolean withOriginalMappingEndOffset) {}
    @Override
    public boolean shouldWithOriginalMappingEndOffset() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingFile(boolean withOriginalMappingFile) {}
    @Override
    public boolean shouldWithOriginalMappingFile() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingVersion(boolean withOriginalMappingVersion) {}
    @Override
    public boolean shouldWithOriginalMappingVersion() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingHash(boolean withOriginalMappingHash) {}
    @Override
    public boolean shouldWithOriginalMappingHash() { return false; }
    @Override
    public void setSourceMapWithOriginalMapping(boolean withOriginalMapping) {}
    @Override
    public boolean shouldWithOriginalMapping() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingPath(boolean withOriginalMappingPath) {}
    @Override
    public boolean shouldWithOriginalMappingPath() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingLine(boolean withOriginalMappingLine) {}
    @Override
    public boolean shouldWithOriginalMappingLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingColumn(boolean withOriginalMappingColumn) {}
    @Override
    public boolean shouldWithOriginalMappingColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndLine(boolean withOriginalMappingEndLine) {}
    @Override
    public boolean shouldWithOriginalMappingEndLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndColumn(boolean withOriginalMappingEndColumn) {}
    @Override
    public boolean shouldWithOriginalMappingEndColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndOffset(boolean withOriginalMappingEndOffset) {}
    @Override
    public boolean shouldWithOriginalMappingEndOffset() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingFile(boolean withOriginalMappingFile) {}
    @Override
    public boolean shouldWithOriginalMappingFile() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingVersion(boolean withOriginalMappingVersion) {}
    @Override
    public boolean shouldWithOriginalMappingVersion() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingHash(boolean withOriginalMappingHash) {}
    @Override
    public boolean shouldWithOriginalMappingHash() { return false; }
    @Override
    public void setSourceMapWithOriginalMapping(boolean withOriginalMapping) {}
    @Override
    public boolean shouldWithOriginalMapping() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingPath(boolean withOriginalMappingPath) {}
    @Override
    public boolean shouldWithOriginalMappingPath() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingLine(boolean withOriginalMappingLine) {}
    @Override
    public boolean shouldWithOriginalMappingLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingColumn(boolean withOriginalMappingColumn) {}
    @Override
    public boolean shouldWithOriginalMappingColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndLine(boolean withOriginalMappingEndLine) {}
    @Override
    public boolean shouldWithOriginalMappingEndLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndColumn(boolean withOriginalMappingEndColumn) {}
    @Override
    public boolean shouldWithOriginalMappingEndColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndOffset(boolean withOriginalMappingEndOffset) {}
    @Override
    public boolean shouldWithOriginalMappingEndOffset() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingFile(boolean withOriginalMappingFile) {}
    @Override
    public boolean shouldWithOriginalMappingFile() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingVersion(boolean withOriginalMappingVersion) {}
    @Override
    public boolean shouldWithOriginalMappingVersion() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingHash(boolean withOriginalMappingHash) {}
    @Override
    public boolean shouldWithOriginalMappingHash() { return false; }
    @Override
    public void setSourceMapWithOriginalMapping(boolean withOriginalMapping) {}
    @Override
    public boolean shouldWithOriginalMapping() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingPath(boolean withOriginalMappingPath) {}
    @Override
    public boolean shouldWithOriginalMappingPath() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingLine(boolean withOriginalMappingLine) {}
    @Override
    public boolean shouldWithOriginalMappingLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingColumn(boolean withOriginalMappingColumn) {}
    @Override
    public boolean shouldWithOriginalMappingColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndLine(boolean withOriginalMappingEndLine) {}
    @Override
    public boolean shouldWithOriginalMappingEndLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndColumn(boolean withOriginalMappingEndColumn) {}
    @Override
    public boolean shouldWithOriginalMappingEndColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndOffset(boolean withOriginalMappingEndOffset) {}
    @Override
    public boolean shouldWithOriginalMappingEndOffset() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingFile(boolean withOriginalMappingFile) {}
    @Override
    public boolean shouldWithOriginalMappingFile() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingVersion(boolean withOriginalMappingVersion) {}
    @Override
    public boolean shouldWithOriginalMappingVersion() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingHash(boolean withOriginalMappingHash) {}
    @Override
    public boolean shouldWithOriginalMappingHash() { return false; }
    @Override
    public void setSourceMapWithOriginalMapping(boolean withOriginalMapping) {}
    @Override
    public boolean shouldWithOriginalMapping() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingPath(boolean withOriginalMappingPath) {}
    @Override
    public boolean shouldWithOriginalMappingPath() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingLine(boolean withOriginalMappingLine) {}
    @Override
    public boolean shouldWithOriginalMappingLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingColumn(boolean withOriginalMappingColumn) {}
    @Override
    public boolean shouldWithOriginalMappingColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndLine(boolean withOriginalMappingEndLine) {}
    @Override
    public boolean shouldWithOriginalMappingEndLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndColumn(boolean withOriginalMappingEndColumn) {}
    @Override
    public boolean shouldWithOriginalMappingEndColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndOffset(boolean withOriginalMappingEndOffset) {}
    @Override
    public boolean shouldWithOriginalMappingEndOffset() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingFile(boolean withOriginalMappingFile) {}
    @Override
    public boolean shouldWithOriginalMappingFile() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingVersion(boolean withOriginalMappingVersion) {}
    @Override
    public boolean shouldWithOriginalMappingVersion() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingHash(boolean withOriginalMappingHash) {}
    @Override
    public boolean shouldWithOriginalMappingHash() { return false; }
    @Override
    public void setSourceMapWithOriginalMapping(boolean withOriginalMapping) {}
    @Override
    public boolean shouldWithOriginalMapping() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingPath(boolean withOriginalMappingPath) {}
    @Override
    public boolean shouldWithOriginalMappingPath() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingLine(boolean withOriginalMappingLine) {}
    @Override
    public boolean shouldWithOriginalMappingLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingColumn(boolean withOriginalMappingColumn) {}
    @Override
    public boolean shouldWithOriginalMappingColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndLine(boolean withOriginalMappingEndLine) {}
    @Override
    public boolean shouldWithOriginalMappingEndLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndColumn(boolean withOriginalMappingEndColumn) {}
    @Override
    public boolean shouldWithOriginalMappingEndColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndOffset(boolean withOriginalMappingEndOffset) {}
    @Override
    public boolean shouldWithOriginalMappingEndOffset() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingFile(boolean withOriginalMappingFile) {}
    @Override
    public boolean shouldWithOriginalMappingFile() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingVersion(boolean withOriginalMappingVersion) {}
    @Override
    public boolean shouldWithOriginalMappingVersion() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingHash(boolean withOriginalMappingHash) {}
    @Override
    public boolean shouldWithOriginalMappingHash() { return false; }
    @Override
    public void setSourceMapWithOriginalMapping(boolean withOriginalMapping) {}
    @Override
    public boolean shouldWithOriginalMapping() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingPath(boolean withOriginalMappingPath) {}
    @Override
    public boolean shouldWithOriginalMappingPath() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingLine(boolean withOriginalMappingLine) {}
    @Override
    public boolean shouldWithOriginalMappingLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingColumn(boolean withOriginalMappingColumn) {}
    @Override
    public boolean shouldWithOriginalMappingColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndLine(boolean withOriginalMappingEndLine) {}
    @Override
    public boolean shouldWithOriginalMappingEndLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndColumn(boolean withOriginalMappingEndColumn) {}
    @Override
    public boolean shouldWithOriginalMappingEndColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndOffset(boolean withOriginalMappingEndOffset) {}
    @Override
    public boolean shouldWithOriginalMappingEndOffset() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingFile(boolean withOriginalMappingFile) {}
    @Override
    public boolean shouldWithOriginalMappingFile() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingVersion(boolean withOriginalMappingVersion) {}
    @Override
    public boolean shouldWithOriginalMappingVersion() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingHash(boolean withOriginalMappingHash) {}
    @Override
    public boolean shouldWithOriginalMappingHash() { return false; }
    @Override
    public void setSourceMapWithOriginalMapping(boolean withOriginalMapping) {}
    @Override
    public boolean shouldWithOriginalMapping() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingPath(boolean withOriginalMappingPath) {}
    @Override
    public boolean shouldWithOriginalMappingPath() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingLine(boolean withOriginalMappingLine) {}
    @Override
    public boolean shouldWithOriginalMappingLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingColumn(boolean withOriginalMappingColumn) {}
    @Override
    public boolean shouldWithOriginalMappingColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndLine(boolean withOriginalMappingEndLine) {}
    @Override
    public boolean shouldWithOriginalMappingEndLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndColumn(boolean withOriginalMappingEndColumn) {}
    @Override
    public boolean shouldWithOriginalMappingEndColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndOffset(boolean withOriginalMappingEndOffset) {}
    @Override
    public boolean shouldWithOriginalMappingEndOffset() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingFile(boolean withOriginalMappingFile) {}
    @Override
    public boolean shouldWithOriginalMappingFile() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingVersion(boolean withOriginalMappingVersion) {}
    @Override
    public boolean shouldWithOriginalMappingVersion() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingHash(boolean withOriginalMappingHash) {}
    @Override
    public boolean shouldWithOriginalMappingHash() { return false; }
    @Override
    public void setSourceMapWithOriginalMapping(boolean withOriginalMapping) {}
    @Override
    public boolean shouldWithOriginalMapping() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingPath(boolean withOriginalMappingPath) {}
    @Override
    public boolean shouldWithOriginalMappingPath() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingLine(boolean withOriginalMappingLine) {}
    @Override
    public boolean shouldWithOriginalMappingLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingColumn(boolean withOriginalMappingColumn) {}
    @Override
    public boolean shouldWithOriginalMappingColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndLine(boolean withOriginalMappingEndLine) {}
    @Override
    public boolean shouldWithOriginalMappingEndLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndColumn(boolean withOriginalMappingEndColumn) {}
    @Override
    public boolean shouldWithOriginalMappingEndColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndOffset(boolean withOriginalMappingEndOffset) {}
    @Override
    public boolean shouldWithOriginalMappingEndOffset() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingFile(boolean withOriginalMappingFile) {}
    @Override
    public boolean shouldWithOriginalMappingFile() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingVersion(boolean withOriginalMappingVersion) {}
    @Override
    public boolean shouldWithOriginalMappingVersion() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingHash(boolean withOriginalMappingHash) {}
    @Override
    public boolean shouldWithOriginalMappingHash() { return false; }
    @Override
    public void setSourceMapWithOriginalMapping(boolean withOriginalMapping) {}
    @Override
    public boolean shouldWithOriginalMapping() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingPath(boolean withOriginalMappingPath) {}
    @Override
    public boolean shouldWithOriginalMappingPath() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingLine(boolean withOriginalMappingLine) {}
    @Override
    public boolean shouldWithOriginalMappingLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingColumn(boolean withOriginalMappingColumn) {}
    @Override
    public boolean shouldWithOriginalMappingColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndLine(boolean withOriginalMappingEndLine) {}
    @Override
    public boolean shouldWithOriginalMappingEndLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndColumn(boolean withOriginalMappingEndColumn) {}
    @Override
    public boolean shouldWithOriginalMappingEndColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndOffset(boolean withOriginalMappingEndOffset) {}
    @Override
    public boolean shouldWithOriginalMappingEndOffset() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingFile(boolean withOriginalMappingFile) {}
    @Override
    public boolean shouldWithOriginalMappingFile() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingVersion(boolean withOriginalMappingVersion) {}
    @Override
    public boolean shouldWithOriginalMappingVersion() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingHash(boolean withOriginalMappingHash) {}
    @Override
    public boolean shouldWithOriginalMappingHash() { return false; }
    @Override
    public void setSourceMapWithOriginalMapping(boolean withOriginalMapping) {}
    @Override
    public boolean shouldWithOriginalMapping() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingPath(boolean withOriginalMappingPath) {}
    @Override
    public boolean shouldWithOriginalMappingPath() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingLine(boolean withOriginalMappingLine) {}
    @Override
    public boolean shouldWithOriginalMappingLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingColumn(boolean withOriginalMappingColumn) {}
    @Override
    public boolean shouldWithOriginalMappingColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndLine(boolean withOriginalMappingEndLine) {}
    @Override
    public boolean shouldWithOriginalMappingEndLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndColumn(boolean withOriginalMappingEndColumn) {}
    @Override
    public boolean shouldWithOriginalMappingEndColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndOffset(boolean withOriginalMappingEndOffset) {}
    @Override
    public boolean shouldWithOriginalMappingEndOffset() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingFile(boolean withOriginalMappingFile) {}
    @Override
    public boolean shouldWithOriginalMappingFile() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingVersion(boolean withOriginalMappingVersion) {}
    @Override
    public boolean shouldWithOriginalMappingVersion() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingHash(boolean withOriginalMappingHash) {}
    @Override
    public boolean shouldWithOriginalMappingHash() { return false; }
    @Override
    public void setSourceMapWithOriginalMapping(boolean withOriginalMapping) {}
    @Override
    public boolean shouldWithOriginalMapping() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingPath(boolean withOriginalMappingPath) {}
    @Override
    public boolean shouldWithOriginalMappingPath() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingLine(boolean withOriginalMappingLine) {}
    @Override
    public boolean shouldWithOriginalMappingLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingColumn(boolean withOriginalMappingColumn) {}
    @Override
    public boolean shouldWithOriginalMappingColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndLine(boolean withOriginalMappingEndLine) {}
    @Override
    public boolean shouldWithOriginalMappingEndLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndColumn(boolean withOriginalMappingEndColumn) {}
    @Override
    public boolean shouldWithOriginalMappingEndColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndOffset(boolean withOriginalMappingEndOffset) {}
    @Override
    public boolean shouldWithOriginalMappingEndOffset() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingFile(boolean withOriginalMappingFile) {}
    @Override
    public boolean shouldWithOriginalMappingFile() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingVersion(boolean withOriginalMappingVersion) {}
    @Override
    public boolean shouldWithOriginalMappingVersion() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingHash(boolean withOriginalMappingHash) {}
    @Override
    public boolean shouldWithOriginalMappingHash() { return false; }
    @Override
    public void setSourceMapWithOriginalMapping(boolean withOriginalMapping) {}
    @Override
    public boolean shouldWithOriginalMapping() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingPath(boolean withOriginalMappingPath) {}
    @Override
    public boolean shouldWithOriginalMappingPath() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingLine(boolean withOriginalMappingLine) {}
    @Override
    public boolean shouldWithOriginalMappingLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingColumn(boolean withOriginalMappingColumn) {}
    @Override
    public boolean shouldWithOriginalMappingColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndLine(boolean withOriginalMappingEndLine) {}
    @Override
    public boolean shouldWithOriginalMappingEndLine() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndColumn(boolean withOriginalMappingEndColumn) {}
    @Override
    public boolean shouldWithOriginalMappingEndColumn() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingEndOffset(boolean withOriginalMappingEndOffset) {}
    @Override
    public boolean shouldWithOriginalMappingEndOffset() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingFile(boolean withOriginalMappingFile) {}
    @Override
    public boolean shouldWithOriginalMappingFile() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingVersion(boolean withOriginalMappingVersion) {}
    @Override
    public boolean shouldWithOriginalMappingVersion() { return false; }
    @Override
    public void setSourceMapWithOriginalMappingHash(boolean withOriginalMappingHash) {}
    @Override
    public boolean shouldWithOriginalMappingHash() { return false; }
    @Override
    public void setSourceMapWithOriginalMapping(boolean withOriginalMapping) {}
    @Override
    public boolean shouldWithOriginalMapping() { return false;