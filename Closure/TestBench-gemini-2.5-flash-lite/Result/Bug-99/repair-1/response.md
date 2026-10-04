```java
package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.javascript.jscomp.CheckLevel;
import com.google.javascript.jscomp.NodeTraversal.Callback;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CheckGlobalThisTest {
    // Dummy AbstractCompiler for testing.
    private static class Compiler extends AbstractCompiler {
        private StringBuilder errors = new StringBuilder();

        @Override
        public boolean isIdeMode() {
            return false;
        }

        @Override
        public void report(JSError error) {
            errors.append(error.getMessage()).append("\n");
        }

        public String getErrors() {
            return errors.toString();
        }

        // Implement other abstract methods as needed for testing.
        @Override
        public void process(SourceFile sourceFile) {}
        @Override
        public void process(SourceFile sourceFile, SourceFile sourceFile2) {}
        @Override
        public void process(SourceFile[] sourceFiles) {}
        @Override
        public void process(List<SourceFile> sourceFiles) {}
        @Override
        public void parse() {}
        @Override
        public Node parse(SourceFile file) { return null; }
        @Override
        public Node parseSyntheticCode(String code) { return null; }
        @Override
        public Node parseTestCode(String code) { return null; }
        @Override
        public String toSource() { return ""; }
        @Override
        public String toSource(Node node) { return ""; }
        @Override
        public void setLicenseToPass(String license) {}
        @Override
        public <T2 extends Enum<T2>> T2 process(SourceFile sourceFile, String name, Class<T2> enumClass) { return null; }
        @Override
        public <T2 extends Enum<T2>> T2 process(SourceFile[] sourceFiles, String name, Class<T2> enumClass) { return null; }
        @Override
        public <T2 extends Enum<T2>> T2 process(List<SourceFile> sourceFiles, String name, Class<T2> enumClass) { return null; }
        @Override
        public PassConfig getPassConfig() { return null; }
        @Override
        public void init(PassConfig passConfig) {}
        @Override
        public void ensureDefaultPassConfig() {}
        @Override
        public void compile(PassConfig passConfig) {}
        @Override
        public void compile() {}
        @Override
        public void close() {}
        @Override
        public void setExterns(List<SourceFile> externs) {}
        @Override
        public void setCode(String code) {}
        @Override
        public void setSourceFile(String filename) {}
        @Override
        public void setSourceMap(SourceMap sourceMap) {}
        @Override
        public SourceMap getSourceMap() { return null; }
        @Override
        public Region getSourceRegion(Node n) { return null; }
        @Override
        public String getSourceluents(Node n) { return null; }
        @Override
        public void setErrorManager(ErrorManager errorManager) {}
        @Override
        public ErrorManager getErrorManager() { return null; }
        @Override
        public void removeGlobalVar(String name) {}
        @Override
        public String getPath(String filename) { return null; }
        @Override
        public boolean isFileNotFound(String filename) { return false; }
        @Override
        public boolean isSuspiciousFileName(String filename) { return false; }
        @Override
        public void setInstrumentationTemplate(String instrumentationTemplate) {}
        @Override
        public String getInstrumentationTemplate() { return null; }
        @Override
        public void setIncludeDefaultPasses(boolean includeDefaultPasses) {}
        @Override
        public boolean shouldIncludeDefaultPasses() { return false; }
        @Override
        public void setPropertyMap(Map<String, String> propertyMap) {}
        @Override
        public Map<String, String> getPropertyMap() { return null; }
        @Override
        public String normalize(String source, String sourceName) { return null; }
        @Override
        public String normalize(String source, CharSequence sourceName) { return null; }
        @Override
        public String normalize(String source, CharSequence sourceName, Region region) { return null; }
        @Override
        public String getSource() { return null; }
        @Override
        public void setSource(String source) {}
        @Override
        public void setOptions(CompilerOptions options) {}
        @Override
        public CompilerOptions getOptions() { return null; }
        @Override
        public PhaseOptimizer getPhaseOptimizer() { return null; }
        @Override
        public Var getVariableMap() { return null; }
        @Override
        public String getGlobalExecuterPath() { return null; }
        @Override
        public void setGlobalExecuterPath(String path) {}
        @Override
        public String getJsFileHeader() { return null; }
        @Override
        public void setJsFileHeader(String header) {}
        @Override
        public String getOutputManifestFileName() { return null; }
        @Override
        public void setOutputManifestFileName(String name) {}
        @Override
        public String getOutputJsDevMode() { return null; }
        @Override
        public void setOutputJsDevMode(String jsDevMode) {}
        @Override
        public String getOutputFragmentSuffix() { return null; }
        @Override
        public void setOutputFragmentSuffix(String suffix) {}
        @Override
        public void setGenerateExports(boolean generateExports) {}
        @Override
        public boolean shouldGenerateExports() { return false; }
        @Override
        public void setGeneratePseudoNames(boolean generatePseudoNames) {}
        @Override
        public boolean shouldGeneratePseudoNames() { return false; }
        @Override
        public void setSourceRoot(String sourceRoot) {}
        @Override
        public String getSourceRoot() { return null; }
        @Override
        public void setPrettyPrint(boolean prettyPrint) {}
        @Override
        public boolean shouldPrettyPrint() { return false; }
        @Override
        public void setPreferredQuotedName(boolean preferredQuotedName) {}
        @Override
        public boolean shouldQuotePublicAPI() { return false; }
        @Override
        public void setPrettyPrintFlag(String flag) {}
        @Override
        public String getPrettyPrintFlag() { return null; }
        @Override
        public void setTweakValidation(boolean tweakValidation) {}
        @Override
        public boolean shouldTweakValidation() { return false; }
        @Override
        public void setRecordFunctionInformation(boolean recordFunctionInformation) {}
        @Override
        public boolean shouldRecordFunctionInformation() { return false; }
        @Override
        public void setTrustedFunctions(Set<String> trustedFunctions) {}
        @Override
        public Set<String> getTrustedFunctions() { return null; }
        @Override
        public void setRemoveClosureRandomness(boolean removeClosureRandomness) {}
        @Override
        public boolean shouldRemoveClosureRandomness() { return false; }
        @Override
        public void setDefineReplacements(Map<String, Node> defineReplacements) {}
        @Override
        public Map<String, Node> getDefineReplacements() { return null; }
        @Override
        public void setLineBreak(boolean lineBreak) {}
        @Override
        public boolean shouldLineBreak() { return false; }
        @Override
        public void setOutputWrapper(String outputWrapper) {}
        @Override
        public String getOutputWrapper() { return null; }
        @Override
        public void setSourceUrl(String sourceUrl) {}
        @Override
        public String getSourceUrl() { return null; }
        @Override
        public void setSourceUrlFormat(String sourceUrlFormat) {}
        @Override
        public String getSourceUrlFormat() { return null; }
        @Override
        public void setCodePrinterPass(CodePrinter.Format flag) {}
        @Override
        public CodePrinter.Format getCodePrinterFormat() { return null; }
        @Override
        public void setGenerateExports(String[] exports) {}
        @Override
        public String[] getExports() { return null; }
        @Override
        public void setAliasableGlobals(Set<String> aliasableGlobals) {}
        @Override
        public Set<String> getAliasableGlobals() { return null; }
        @Override
        public void setPreferSingleQuotes(boolean preferSingleQuotes) {}
        @Override
        public boolean shouldPreferSingleQuotes() { return false; }
        @Override
        public void setDebugPrototypes(boolean debugPrototypes) {}
        @Override
        public boolean shouldDebugPrototypes() { return false; }
        @Override
        public void setProcessClosurePrimitives(boolean processClosurePrimitives) {}
        @Override
        public boolean shouldProcessClosurePrimitives() { return false; }
        @Override
        public void setAnonymousFunctionNaming(AnonymousFunctionNamingMode anonymousFunctionNaming) {}
        @Override
        public AnonymousFunctionNamingMode getAnonymousFunctionNaming() { return null; }
        @Override
        public void setTransformAMDToCJSModules(boolean transformAMDToCJSModules) {}
        @Override
        public boolean shouldTransformAMDToCJSModules() { return false; }
        @Override
        public void setTransformCommonJSModules(boolean transformCommonJSModules) {}
        @Override
        public boolean shouldTransformCommonJSModules() { return false; }
        @Override
        public void setAssumeGettersArePure(boolean assumeGettersArePure) {}
        @Override
        public boolean shouldAssumeGettersArePure() { return false; }
        @Override
        public void setCheckConstStrings(boolean checkConstStrings) {}
        @Override
        public boolean shouldCheckConstStrings() { return false; }
        @Override
        public void setCheckGlobalThis(CheckLevel checkGlobalThis) {}
        @Override
        public CheckLevel getCheckGlobalThisLevel() { return CheckLevel.OFF; }
        @Override
        public void setCheckGlobalThis(boolean checkGlobalThis) {}
        @Override
        public void setCheckSuspiciousCode(CheckLevel level) {}
        @Override
        public CheckLevel getCheckSuspiciousCodeLevel() { return CheckLevel.OFF; }
        @Override
        public void setCheckGlobalThis(CompilerOptions.Reach checkGlobalThis) {}
        @Override
        public void setCheckGlobalThis(CheckLevel checkGlobalThis, CheckLevel level) {}
        @Override
        public void setCheckGlobalThis(CheckLevel checkGlobalThis, CheckLevel level, CheckLevel level2) {}
        @Override
        public void setPropertyRenaming(CompilerOptions.RenamingPolicy policy) {}
        @Override
        public CompilerOptions.RenamingPolicy getPropertyRenaming() { return null; }
        @Override
        public void setVariableRenaming(CompilerOptions.RenamingPolicy policy) {}
        @Override
        public CompilerOptions.RenamingPolicy getVariableRenaming() { return null; }
        @Override
        public void setAliasStrings(boolean aliasStrings) {}
        @Override
        public boolean shouldAliasStrings() { return false; }
        @Override
        public void setGenerateExports(boolean generateExports, String name, String namespace) {}
        @Override
        public void setPreferTrailingComma(boolean preferTrailingComma) {}
        @Override
        public boolean shouldPreferTrailingComma() { return false; }
        @Override
        public void setExportTestFunctions(boolean exportTestFunctions) {}
        @Override
        public boolean shouldExportTestFunctions() { return false; }
        @Override
        public void setGeneratePseudoNames(boolean generatePseudoNames, String name) {}
        @Override
        public void setCollapseAnonymousFunctions(boolean collapseAnonymousFunctions) {}
        @Override
        public boolean shouldCollapseAnonymousFunctions() { return false; }
        @Override
        public void setInstrumentedCode(boolean instrumentedCode) {}
        @Override
        public boolean shouldInstrumentCode() { return false; }
        @Override
        public void setInlineVariables(boolean inlineVariables) {}
        @Override
        public boolean shouldInlineVariables() { return false; }
        @Override
        public void setInlineFunctions(boolean inlineFunctions) {}
        @Override
        public boolean shouldInlineFunctions() { return false; }
        @Override
        public void setInlineLocalVariables(boolean inlineLocalVariables) {}
        @Override
        public boolean shouldInlineLocalVariables() { return false; }
        @Override
        public void setInlineConstantVars(boolean inlineConstantVars) {}
        @Override
        public boolean shouldInlineConstantVars() { return false; }
        @Override
        public void setInlineProperties(boolean inlineProperties) {}
        @Override
        public boolean shouldInlineProperties() { return false; }
        @Override
        public void setInlineSimpleMethods(boolean inlineSimpleMethods) {}
        @Override
        public boolean shouldInlineSimpleMethods() { return false; }
        @Override
        public void setInlineHeavyMethods(boolean inlineHeavyMethods) {}
        @Override
        public boolean shouldInlineHeavyMethods() { return false; }
        @Override
        public void setInlineVariables(boolean inlineVariables, boolean inlineConstants) {}
        @Override
        public void setInlineProperties(boolean inlineProperties, boolean inlineConstants) {}
        @Override
        public void setInlineLocalVariables(boolean inlineLocalVariables, boolean inlineConstants) {}
        @Override
        public void setInlineFunctions(boolean inlineFunctions, boolean inlineConstants) {}
        @Override
        public void setInlineSimpleMethods(boolean inlineSimpleMethods, boolean inlineConstants) {}
        @Override
        public void setInlineHeavyMethods(boolean inlineHeavyMethods, boolean inlineConstants) {}
        @Override
        public void setRemoveDeadCode(boolean removeDeadCode) {}
        @Override
        public boolean shouldRemoveDeadCode() { return false; }
        @Override
        public void setDevirtualizePrototypeMethods(boolean devirtualizePrototypeMethods) {}
        @Override
        public boolean shouldDevirtualizePrototypeMethods() { return false; }
        @Override
        public void setInlineGetters(boolean inlineGetters) {}
        @Override
        public boolean shouldInlineGetters() { return false; }
        @Override
        public void setReplaceIds(boolean replaceIds) {}
        @Override
        public boolean shouldReplaceIds() { return false; }
        @Override
        public void setAliasExterns(boolean aliasExterns) {}
        @Override
        public boolean shouldAliasExterns() { return false; }
        @Override
        public void setFoldConstants(boolean foldConstants) {}
        @Override
        public boolean shouldFoldConstants() { return false; }
        @Override
        public void setOptimizeArgumentsArray(boolean optimizeArgumentsArray) {}
        @Override
        public boolean shouldOptimizeArgumentsArray() { return false; }
        @Override
        public void setOptimizeCalls(boolean optimizeCalls) {}
        @Override
        public boolean shouldOptimizeCalls() { return false; }
        @Override
        public void setOptimizeEs52(boolean optimizeEs52) {}
        @Override
        public boolean shouldOptimizeEs52() { return false; }
        @Override
        public void setAliasAllStrings(boolean aliasAllStrings) {}
        @Override
        public boolean shouldAliasAllStrings() { return false; }
        @Override
        public void setTightenExpressionTypes(boolean tightenExpressionTypes) {}
        @Override
        public boolean shouldTightenExpressionTypes() { return false; }
        @Override
        public void setCrossModuleCodeMotion(boolean crossModuleCodeMotion) {}
        @Override
        public boolean shouldCrossModuleCodeMotion() { return false; }
        @Override
        public void setCrossModuleMethodMotion(boolean crossModuleMethodMotion) {}
        @Override
        public boolean shouldCrossModuleMethodMotion() { return false; }
        @Override
        public void setComputeChecksumQemu(boolean computeChecksumQemu) {}
        @Override
        public boolean shouldComputeChecksumQemu() { return false; }
        @Override
        public void setChainAssignments(boolean chainAssignments) {}
        @Override
        public boolean shouldChainAssignments() { return false; }
        @Override
        public void setMoveFunctionDeclarations(boolean moveFunctionDeclarations) {}
        @Override
        public boolean shouldMoveFunctionDeclarations() { return false; }
        @Override
        public void setRemoveUnusedPrototypeProperties(boolean removeUnusedPrototypeProperties) {}
        @Override
        public boolean shouldRemoveUnusedPrototypeProperties() { return false; }
        @Override
        public void setRemoveUnusedLocalVariables(boolean removeUnusedLocalVariables) {}
        @Override
        public boolean shouldRemoveUnusedLocalVariables() { return false; }
        @Override
        public void setAliasKeywords(boolean aliasKeywords) {}
        @Override
        public boolean shouldAliasKeywords() { return false; }
        @Override
        public void setAliasInternalFunctions(boolean aliasInternalFunctions) {}
        @Override
        public boolean shouldAliasInternalFunctions() { return false; }
        @Override
        public void setSpecialize_prototype_methods(boolean specialize_prototype_methods) {}
        @Override
        public boolean shouldSpecialize_prototype_methods() { return false; }
        @Override
        public void setAliasExterns(boolean aliasExterns, String namespace) {}
        @Override
        public void setAliasExterns(boolean aliasExterns, String namespace, boolean aliasAll) {}
        @Override
        public void setAliasExterns(boolean aliasExterns, String namespace, boolean aliasAll, Set<String> aliasableGlobals) {}
        @Override
        public void setAliasExterns(boolean aliasExterns, String namespace, boolean aliasAll, Set<String> aliasableGlobals, boolean aliasKeywords) {}
        @Override
        public void setAliasExterns(boolean aliasExterns, String namespace, boolean aliasAll, Set<String> aliasableGlobals, boolean aliasKeywords, boolean aliasInternalFunctions) {}
        @Override
        public void setAliasExterns(boolean aliasExterns, String namespace, boolean aliasAll, Set<String> aliasableGlobals, boolean aliasKeywords, boolean aliasInternalFunctions, boolean specialize_prototype_methods) {}
        @Override
        public void setAliasExterns(boolean aliasExterns, String namespace, boolean aliasAll, Set<String> aliasableGlobals, boolean aliasKeywords, boolean aliasInternalFunctions, boolean specialize_prototype_methods, boolean aliasStrings) {}
        @Override
        public void setAliasExterns(boolean aliasExterns, String namespace, boolean aliasAll, Set<String> aliasableGlobals, boolean aliasKeywords, boolean aliasInternalFunctions, boolean specialize_prototype_methods, boolean aliasStrings, boolean exportTestFunctions) {}
        @Override
        public void setAliasExterns(boolean aliasExterns, String namespace, boolean aliasAll, Set<String> aliasableGlobals, boolean aliasKeywords, boolean aliasInternalFunctions, boolean specialize_prototype_methods, boolean aliasStrings, boolean exportTestFunctions, boolean exportTestFunctions) {}
        @Override
        public void setAliasExterns(boolean aliasExterns, String namespace, boolean aliasAll, Set<String> aliasableGlobals, boolean aliasKeywords, boolean aliasInternalFunctions, boolean specialize_prototype_methods, boolean aliasStrings, boolean exportTestFunctions, boolean exportTestFunctions, String license) {}
        @Override
        public void setAliasExterns(boolean aliasExterns, String namespace, boolean aliasAll, Set<String> aliasableGlobals, boolean aliasKeywords, boolean aliasInternalFunctions, boolean specialize_prototype_methods, boolean aliasStrings, boolean exportTestFunctions, boolean exportTestFunctions, String license, boolean aliasUnknownPrototypes) {}
        @Override
        public void setAliasExterns(boolean aliasExterns, String namespace, boolean aliasAll, Set<String> aliasableGlobals, boolean aliasKeywords, boolean aliasInternalFunctions, boolean specialize_prototype_methods, boolean aliasStrings, boolean exportTestFunctions, boolean exportTestFunctions, String license, boolean aliasUnknownPrototypes, String propertyRenaming, String variableRenaming) {}
        @Override
        public void setAliasExterns(boolean aliasExterns, String namespace, boolean aliasAll, Set<String> aliasableGlobals, boolean aliasKeywords, boolean aliasInternalFunctions, boolean specialize_prototype_methods, boolean aliasStrings, boolean exportTestFunctions, boolean exportTestFunctions, String license, boolean aliasUnknownPrototypes, String propertyRenaming, String variableRenaming, boolean removeClosureRandomness) {}
        @Override
        public void setAliasExterns(boolean aliasExterns, String namespace, boolean aliasAll, Set<String> aliasableGlobals, boolean aliasKeywords, boolean aliasInternalFunctions, boolean specialize_prototype_methods, boolean aliasStrings, boolean exportTestFunctions, boolean exportTestFunctions, String license, boolean aliasUnknownPrototypes, String propertyRenaming, String variableRenaming, boolean removeClosureRandomness, boolean optimizeEs52) {}
        @Override
        public void setAliasExterns(boolean aliasExterns, String namespace, boolean aliasAll, Set<String> aliasableGlobals, boolean aliasKeywords, boolean aliasInternalFunctions, boolean specialize_prototype_methods, boolean aliasStrings, boolean exportTestFunctions, boolean exportTestFunctions, String license, boolean aliasUnknownPrototypes, String propertyRenaming, String variableRenaming, boolean removeClosureRandomness, boolean optimizeEs52, String devMode) {}
        @Override
        public void setAliasExterns(boolean aliasExterns, String namespace, boolean aliasAll, Set<String> aliasableGlobals, boolean aliasKeywords, boolean aliasInternalFunctions, boolean specialize_prototype_methods, boolean aliasStrings, boolean exportTestFunctions, boolean exportTestFunctions, String license, boolean aliasUnknownPrototypes, String propertyRenaming, String variableRenaming, boolean removeClosureRandomness, boolean optimizeEs52, String devMode, boolean transformAMDToCJSModules) {}
        @Override
        public void setAliasExterns(boolean aliasExterns, String namespace, boolean aliasAll, Set<String> aliasableGlobals, boolean aliasKeywords, boolean aliasInternalFunctions, boolean specialize_prototype_methods, boolean aliasStrings, boolean exportTestFunctions, boolean exportTestFunctions, String license, boolean aliasUnknownPrototypes, String propertyRenaming, String variableRenaming, boolean removeClosureRandomness, boolean optimizeEs52, String devMode, boolean transformAMDToCJSModules, boolean transformCommonJSModules) {}
        @Override
        public void setAliasExterns(boolean aliasExterns, String namespace, boolean aliasAll, Set<String> aliasableGlobals, boolean aliasKeywords, boolean aliasInternalFunctions, boolean specialize_prototype_methods, boolean aliasStrings, boolean exportTestFunctions, boolean exportTestFunctions, String license, boolean aliasUnknownPrototypes, String propertyRenaming, String variableRenaming, boolean removeClosureRandomness, boolean optimizeEs52, String devMode, boolean transformAMDToCJSModules, boolean transformCommonJSModules, boolean assumeGettersArePure) {}
        @Override
        public void setAliasExterns(boolean aliasExterns, String namespace, boolean aliasAll, Set<String> aliasableGlobals, boolean aliasKeywords, boolean aliasInternalFunctions, boolean specialize_prototype_methods, boolean aliasStrings, boolean exportTestFunctions, boolean exportTestFunctions, String license, boolean aliasUnknownPrototypes, String propertyRenaming, String variableRenaming, boolean removeClosureRandomness, boolean optimizeEs52, String devMode, boolean transformAMDToCJSModules, boolean transformCommonJSModules, boolean assumeGettersArePure, boolean checkConstStrings) {}
        @Override
        public void setAliasExterns(boolean aliasExterns, String namespace, boolean aliasAll, Set<String> aliasableGlobals, boolean aliasKeywords, boolean aliasInternalFunctions, boolean specialize_prototype_methods, boolean aliasStrings, boolean exportTestFunctions, boolean exportTestFunctions, String license, boolean aliasUnknownPrototypes, String propertyRenaming, String variableRenaming, boolean removeClosureRandomness, boolean optimizeEs52, String devMode, boolean transformAMDToCJSModules, boolean transformCommonJSModules, boolean assumeGettersArePure, boolean checkConstStrings, boolean checkGlobalThis) {}
        @Override
        public void setAliasExterns(boolean aliasExterns, String namespace, boolean aliasAll, Set<String> aliasableGlobals, boolean aliasKeywords, boolean aliasInternalFunctions, boolean specialize_prototype_methods, boolean aliasStrings, boolean exportTestFunctions, boolean exportTestFunctions, String license, boolean aliasUnknownPrototypes, String propertyRenaming, String variableRenaming, boolean removeClosureRandomness, boolean optimizeEs52, String devMode, boolean transformAMDToCJSModules, boolean transformCommonJSModules, boolean assumeGettersArePure, boolean checkConstStrings, boolean checkGlobalThis, String checkGlobalThis) {}
        @Override
        public void setAliasExterns(boolean aliasExterns, String namespace, boolean aliasAll, Set<String> aliasableGlobals, boolean aliasKeywords, boolean aliasInternalFunctions, boolean specialize_prototype_methods, boolean aliasStrings, boolean exportTestFunctions, boolean exportTestFunctions, String license, boolean aliasUnknownPrototypes, String propertyRenaming, String variableRenaming, boolean removeClosureRandomness, boolean optimizeEs52, String devMode, boolean transformAMDToCJSModules, boolean transformCommonJSModules, boolean assumeGettersArePure, boolean checkConstStrings, boolean checkGlobalThis, String checkGlobalThis, String checkGlobalThis) {}
        @Override
        public void setAliasExterns(boolean aliasExterns, String namespace, boolean aliasAll, Set<String> aliasableGlobals, boolean aliasKeywords, boolean aliasInternalFunctions, boolean specialize_prototype_methods, boolean aliasStrings, boolean exportTestFunctions, boolean exportTestFunctions, String license, boolean aliasUnknownPrototypes, String propertyRenaming, String variableRenaming, boolean removeClosureRandomness, boolean optimizeEs52, String devMode, boolean transformAMDToCJSModules, boolean transformCommonJSModules, boolean assumeGettersArePure, boolean checkConstStrings, boolean checkGlobalThis, String checkGlobalThis, String checkGlobalThis, String checkGlobalThis) {}
        @Override
        public void setAliasExterns(boolean aliasExterns, String namespace, boolean aliasAll, Set<String> aliasableGlobals, boolean aliasKeywords, boolean aliasInternalFunctions, boolean specialize_prototype_methods, boolean aliasStrings, boolean exportTestFunctions, boolean exportTestFunctions, String license, boolean aliasUnknownPrototypes, String propertyRenaming, String variableRenaming, boolean removeClosureRandomness, boolean optimizeEs52, String devMode, boolean transformAMDToCJSModules, boolean transformCommonJSModules, boolean assumeGettersArePure, boolean checkConstStrings, boolean checkGlobalThis, String checkGlobalThis, String checkGlobalThis, String checkGlobalThis, String checkGlobalThis) {}
        @Override
        public void setAliasExterns(boolean aliasExterns, String namespace, boolean aliasAll, Set<String> aliasableGlobals, boolean aliasKeywords, boolean aliasInternalFunctions, boolean specialize_prototype_methods, boolean aliasStrings, boolean exportTestFunctions, boolean exportTestFunctions, String license, boolean aliasUnknownPrototypes, String propertyRenaming, String variableRenaming, boolean removeClosureRandomness, boolean optimizeEs52, String devMode, boolean transformAMDToCJSModules, boolean transformCommonJSModules, boolean assumeGettersArePure, boolean checkConstStrings, boolean checkGlobalThis, String checkGlobalThis, String checkGlobalThis, String checkGlobalThis, String checkGlobalThis, String checkGlobalThis) {}
        @Override
        public void setAliasExterns(boolean aliasExterns, String namespace, boolean aliasAll, Set<String> aliasableGlobals, boolean aliasKeywords, boolean aliasInternalFunctions, boolean specialize_prototype_methods, boolean aliasStrings, boolean exportTestFunctions, boolean exportTestFunctions, String license, boolean aliasUnknownPrototypes, String propertyRenaming, String variableRenaming, boolean removeClosureRandomness, boolean optimizeEs52, String devMode, boolean transformAMDToCJSModules, boolean transformCommonJSModules, boolean assumeGettersArePure, boolean checkConstStrings, boolean checkGlobalThis, String checkGlobalThis, String checkGlobalThis, String checkGlobalThis, String checkGlobalThis, String checkGlobalThis, String checkGlobalThis) {}
        @Override
        public void setAliasExterns(boolean aliasExterns, String namespace, boolean aliasAll, Set<String> aliasableGlobals, boolean aliasKeywords, boolean aliasInternalFunctions, boolean specialize_prototype_methods, boolean aliasStrings, boolean exportTestFunctions, boolean exportTestFunctions, String license, boolean aliasUnknownPrototypes, String propertyRenaming, String variableRenaming, boolean removeClosureRandomness, boolean optimizeEs52, String devMode, boolean transformAMDToCJSModules, boolean transformCommonJSModules, boolean assumeGettersArePure, boolean checkConstStrings, boolean checkGlobalThis, String checkGlobalThis, String checkGlobalThis, String checkGlobalThis, String checkGlobalThis, String checkGlobalThis, String checkGlobalThis, String checkGlobalThis) {}
        @Override
        public void setAliasExterns(boolean aliasExterns, String namespace, boolean aliasAll, Set<String> aliasableGlobals, boolean aliasKeywords, boolean aliasInternalFunctions, boolean specialize_prototype_methods, boolean aliasStrings, boolean exportTestFunctions, boolean exportTestFunctions, String license, boolean aliasUnknownPrototypes, String propertyRenaming, String variableRenaming, boolean removeClosureRandomness, boolean optimizeEs52, String devMode, boolean transformAMDToCJSModules, boolean transformCommonJSModules, boolean assumeGettersArePure, boolean checkConstStrings, boolean checkGlobalThis, String checkGlobalThis, String checkGlobalThis, String checkGlobalThis, String checkGlobalThis, String checkGlobalThis, String checkGlobalThis, String checkGlobalThis, String checkGlobalThis) {}
        @Override
        public void setAliasExterns(boolean aliasExterns, String namespace, boolean aliasAll, Set<String> aliasableGlobals, boolean aliasKeywords, boolean aliasInternalFunctions, boolean specialize_prototype_methods, boolean aliasStrings, boolean exportTestFunctions, boolean exportTestFunctions, String license, boolean aliasUnknownPrototypes, String propertyRenaming, String variableRenaming, boolean removeClosureRandomness, boolean optimizeEs52, String devMode, boolean transformAMDToCJSModules, boolean transformCommonJSModules, boolean assumeGettersArePure, boolean checkConstStrings, boolean checkGlobalThis, String checkGlobalThis, String checkGlobalThis, String checkGlobalThis, String checkGlobalThis, String checkGlobalThis, String checkGlobalThis, String checkGlobalThis, String checkGlobalThis, String checkGlobalThis) {}
        @Override
        public void setAliasExterns(boolean aliasExterns, String namespace, boolean aliasAll, Set<String> aliasableGlobals, boolean aliasKeywords, boolean aliasInternalFunctions, boolean specialize_prototype_methods, boolean aliasStrings, boolean exportTestFunctions, boolean exportTestFunctions, String license, boolean aliasUnknownPrototypes, String propertyRenaming, String variableRenaming, boolean removeClosureRandomness, boolean optimizeEs52, String devMode, boolean transformAMDToCJSModules, boolean transformCommonJSModules, boolean assumeGettersArePure, boolean checkConstStrings, boolean checkGlobalThis, String checkGlobalThis, String checkGlobalThis, String checkGlobalThis, String checkGlobalThis, String checkGlobalThis, String checkGlobalThis, String checkGlobalThis, String checkGlobalThis, String checkGlobalThis, String checkGlobalThis) {}
        @Override
        public void setAliasExterns(boolean aliasExterns, String namespace, boolean aliasAll, Set<String> aliasableGlobals, boolean aliasKeywords, boolean aliasInternalFunctions, boolean specialize_prototype_methods, boolean aliasStrings, boolean exportTestFunctions, boolean exportTestFunctions, String license, boolean aliasUnknownPrototypes, String propertyRenaming, String variableRenaming, boolean removeClosureRandomness, boolean optimizeEs52, String devMode, boolean transformAMDToCJSModules, boolean transformCommonJSModules, boolean assumeGettersArePure, boolean checkConstStrings, boolean checkGlobalThis, String checkGlobalThis, String checkGlobalThis, String checkGlobalThis, String checkGlobalThis, String checkGlobalThis, String checkGlobalThis, String checkGlobalThis, String checkGlobalThis, String checkGlobalThis, String checkGlobalThis, String checkGlobalThis) {}
        @Override
        public void setAliasExterns(boolean aliasExterns, String namespace, boolean aliasAll, Set<String> aliasableGlobals, boolean aliasKeywords, boolean aliasInternalFunctions, boolean specialize_prototype_methods, boolean aliasStrings, boolean exportTestFunctions, boolean exportTestFunctions, String license, boolean aliasUnknownPrototypes, String propertyRenaming, String variableRenaming, boolean removeClosureRandomness, boolean optimizeEs52, String devMode, boolean transformAMDToCJSModules, boolean transformCommonJSModules, boolean assumeGettersArePure, boolean checkConstStrings, boolean checkGlobalThis, String checkGlobalThis, String checkGlobalThis, String checkGlobalThis, String checkGlobalThis, String checkGlobalThis, String checkGlobalThis, String checkGlobalThis, String checkGlobalThis, String checkGlobalThis, String checkGlobalThis, String checkGlobalThis, String checkGlobalThis) {}
        @Override
        public void setAliasExterns(boolean aliasExterns, String namespace, boolean aliasAll, Set<String> aliasableGlobals, boolean aliasKeywords, boolean aliasInternalFunctions, boolean specialize_prototype_methods, boolean aliasStrings, boolean exportTestFunctions, boolean exportTestFunctions, String license, boolean aliasUnknownPrototypes, String propertyRenaming, String variableRenaming, boolean removeClosureRandomness, boolean optimizeEs52, String devMode, boolean transformAMDToCJSModules, boolean transformCommonJSModules, boolean assumeGettersArePure, boolean checkConstStrings, boolean checkGlobalThis, String checkGlobalThis, String checkGlobalThis, String checkGlobalThis, String checkGlobalThis, String checkGlobalThis, String checkGlobalThis, String checkGlobalThis, String checkGlobalThis, String checkGlobalThis, String checkGlobalThis, String checkGlobalThis, String checkGlobalThis, String checkGlobalThis) {}
        @Override
        public void setAliasExterns(boolean aliasExterns, String namespace, boolean aliasAll, Set<String> aliasableGlobals, boolean aliasKeywords, boolean aliasInternalFunctions, boolean specialize_prototype_methods, boolean aliasStrings, boolean exportTestFunctions, boolean exportTestFunctions, String license, boolean aliasUnknownPrototypes, String propertyRenaming, String variableRenaming, boolean removeClosureRandomness, boolean optimizeEs52, String devMode, boolean transformAMDToCJSModules, boolean transformCommonJSModules, boolean assumeGettersArePure, boolean checkConstStrings, boolean checkGlobalThis, String checkGlobalThis, String checkGlobalThis, String checkGlobalThis, String checkGlobalThis, String checkGlobalThis, String checkGlobalThis, String checkGlobalThis, String checkGlobalThis, String checkGlobalThis, String checkGlobalThis, String checkGlobalThis, String checkGlobalThis, String checkGlobalThis, String checkGlobalThis) {}
        @Override
        public void setAliasExterns(boolean aliasExterns, String namespace, boolean aliasAll, Set<String> aliasableGlobals, boolean aliasKeywords, boolean aliasInternalFunctions, boolean specialize_prototype_methods, boolean aliasStrings, boolean exportTestFunctions, boolean exportTestFunctions, String license, boolean aliasUnknownPrototypes, String propertyRenaming, String variableRenaming, boolean removeClosureRandomness, boolean optimizeEs52, String devMode, boolean transformAMDToCJSModules, boolean transformCommonJSModules, boolean assumeGettersArePure, boolean checkConstStrings, boolean checkGlobalThis, String checkGlobalThis, String checkGlobalThis, String checkGlobalThis, String checkGlobalThis, String checkGlobalThis, String checkGlobalThis, String checkGlobalThis, String checkGlobalThis, String checkGlobalThis, String checkGlobalThis, String checkGlobalThis, String checkGlobalThis, String checkGlobalThis, String checkGlobalThis, String checkGlobalThis) {}
        @Override
        public void setAliasExterns(boolean aliasExterns, String namespace, boolean aliasAll, Set<String> aliasableGlobals, boolean aliasKeywords, boolean aliasInternalFunctions, boolean specialize_prototype_methods, boolean aliasStrings, boolean exportTestFunctions, boolean exportTestFunctions, String license, boolean aliasUnknownPrototypes, String propertyRenaming, String variableRenaming, boolean removeClosureRandomness, boolean optimizeEs52, String devMode, boolean transformAMDToCJSModules, boolean transformCommonJSModules, boolean assumeGettersArePure, boolean checkConstStrings, boolean checkGlobalThis, String checkGlobalThis, String checkGlobalThis, String checkGlobalThis, String checkGlobalThis, String checkGlobalThis, String checkGlobalThis, String checkGlobalThis, String checkGlobalThis, String checkGlobalThis, String checkGlobalThis, String checkGlobalThis, String checkGlobalThis, String checkGlobalThis, String checkGlobalThis, String checkGlobalThis, String checkGlobalThis) {}
        @Override
        public void setAliasExterns(boolean aliasExterns, String namespace, boolean aliasAll, Set<String> aliasableGlobals, boolean aliasKeywords, boolean aliasInternalFunctions, boolean specialize_prototype_methods, boolean aliasStrings, boolean exportTestFunctions, boolean exportTestFunctions, String license, boolean aliasUnknownPrototypes, String propertyRenaming, String variableRenaming, boolean removeClosureRandomness, boolean optimizeEs52, String devMode, boolean transformAMDToCJSModules, boolean transformCommonJSModules, boolean assumeGettersArePure, boolean checkConstStrings, boolean checkGlobalThis, String checkGlobalThis, String checkGlobalThis, String checkGlobalThis, String checkGlobalThis, String checkGlobalThis, String checkGlobalThis, String checkGlobalThis, String checkGlobalThis, String checkGlobalThis, String checkGlobalThis, String checkGlobalThis, String checkGlobalThis, String checkGlobalThis, String checkGlobalThis, String checkGlobalThis, String checkGlobalThis, String checkGlobalThis) {}
    }

    private Compiler compiler = new Compiler();
    private CheckGlobalThis checkGlobalThis = new CheckGlobalThis(compiler, CheckLevel.WARNING);

    private Node traverse(Node n) {
        NodeTraversal.traverse(compiler, n, checkGlobalThis);
        return n;
    }

    private void traverseFunction(String jsCode) {
        NodeTraversal.traverse(compiler, parseCode(jsCode), checkGlobalThis);
    }

    private Node parseCode(String jsCode) {
        Node root = Node.newScript(new Node(Token.STRING, jsCode));
        return root;
    }

    // Helper to create a 'this' node
    private Node createThisNode() {
        return new Node(Token.THIS);
    }

    // Helper to create a simple function node
    private Node createFunctionNode() {
        Node fn = new Node(Token.FUNCTION);
        fn.addChildToBack(new Node(Token.BLOCK));
        return fn;
    }

    // Helper to create a function node with JSDoc
    private Node createFunctionNodeWithJsDoc(JSDocInfo jsDoc) {
        Node fn = createFunctionNode();
        fn.setJSDocInfo(jsDoc);
        return fn;
    }

    // Helper to create a JSDocInfo object
    private JSDocInfo createJsDocInfo() {
        return new JSDocInfo();
    }

    // Helper to create a GETPROP node
    private Node createGetPropNode(Node obj, String propName) {
        Node prop = Node.newString(propName);
        return new Node(Token.GETPROP, obj, prop);
    }

    // Helper to create an ASSIGN node
    private Node createAssignNode(Node lhs, Node rhs) {
        return new Node(Token.ASSIGN, lhs, rhs);
    }

    @Test
    public void testThisInGlobalScope() {
        Node root = Node.newScript(new Node(Token.THIS));
        traverse(root);
        assertTrue(compiler.getErrors().contains("dangerous use of the global 'this' object"));
    }

    @Test
    public void testThisInGlobalScopeWithPropertyAccess() {
        Node thisNode = createThisNode();
        Node getProp = createGetPropNode(thisNode, "foo");
        Node root = Node.newScript(getProp);
        traverse(root);
        assertTrue(compiler.getErrors().contains("dangerous use of the global 'this' object"));
    }

    @Test
    public void testThisAsLhsOfAssignment() {
        Node thisNode = createThisNode();
        Node value = Node.newNumber(1);
        Node assign = createAssignNode(thisNode, value);
        Node root = Node.newScript(assign);
        traverse(root);
        assertTrue(compiler.getErrors().contains("dangerous use of the global 'this' object"));
    }

    @Test
    public void testThisInConstructorFunction() {
        JSDocInfo jsDoc = createJsDocInfo();
        jsDoc.setConstructor(true);
        Node fn = createFunctionNodeWithJsDoc(jsDoc);
        fn.addChildToBack(new Node(Token.THIS)); // 'this' inside the function
        Node root = Node.newScript(fn);
        traverse(root);
        assertFalse(compiler.getErrors().contains("dangerous use of the global 'this' object"));
    }

    @Test
    public void testThisInFunctionWithThisAnnotation() {
        JSDocInfo jsDoc = createJsDocInfo();
        jsDoc.hasThisType(); // Simulate setting a @this type
        Node fn = createFunctionNodeWithJsDoc(jsDoc);
        fn.addChildToBack(new Node(Token.THIS));
        Node root = Node.newScript(fn);
        traverse(root);
        assertFalse(compiler.getErrors().contains("dangerous use of the global 'this' object"));
    }

    @Test
    public void testThisInFunctionWithOverrideAnnotation() {
        JSDocInfo jsDoc = createJsDocInfo();
        jsDoc.setOverride(true);
        Node fn = createFunctionNodeWithJsDoc(jsDoc);
        fn.addChildToBack(new Node(Token.THIS));
        Node root = Node.newScript(fn);
        traverse(root);
        assertFalse(compiler.getErrors().contains("dangerous use of the global 'this' object"));
    }

    @Test
    public void testThisInPrototypeMethod() {
        Node objectLit = new Node(Token.OBJECTLIT);
        Node protoAssign = createAssignNode(
                createGetPropNode(objectLit, "prototype"),
                createFunctionNode()); // A function for the method
        Node fnBody = protoAssign.getLastChild();
        fnBody.addChildToBack(new Node(Token.THIS)); // 'this' inside the prototype method

        Node root = Node.newScript(protoAssign);
        traverse(root);
        assertFalse(compiler.getErrors().contains("dangerous use of the global 'this' object"));
    }

    @Test
    public void testThisInNestedAssignmentLhs() {
        Node thisNode = createThisNode();
        Node propAccess = createGetPropNode(thisNode, "a");
        Node nestedAssign = createAssignNode(propAccess, new Node(Token.NUMBER));
        Node root = Node.newScript(nestedAssign);
        traverse(root);
        assertTrue(compiler.getErrors().contains("dangerous use of the global 'this' object"));
    }

    @Test
    public void testThisInMethodCall() {
        Node thisNode = createThisNode();
        Node methodCall = new Node(Token.CALL, createGetPropNode(thisNode, "method"));
        Node root = Node.newScript(methodCall);
        traverse(root);
        assertTrue(compiler.getErrors().contains("dangerous use of the global 'this' object"));
    }

    @Test
    public void testThisInFunctionAssignedToVariable() {
        Node thisNode = createThisNode();
        Node fn = createFunctionNode();
        fn.addChildToBack(new Node(Token.THIS));
        Node varDecl = new Node(Token.VAR, new Node(Token.NAME, Node.newString("myFunc")), fn);
        Node root = Node.newScript(varDecl);
        traverse(root);
        assertTrue(compiler.getErrors().contains("dangerous use of the global 'this' object"));
    }

    @Test
    public void testThisInFunctionAssignedToProperty() {
        Node thisNode = createThisNode();
        Node fn = createFunctionNode();
        fn.addChildToBack(new Node(Token.THIS));
        Node assign = createAssignNode(createGetPropNode(new Node(Token.THIS), "method"), fn);
        Node root = Node.newScript(assign);
        traverse(root);
        assertTrue(compiler.getErrors().contains("dangerous use of the global 'this' object"));
    }

    @Test
    public void testThisInFunctionWithNoLogicalPlaceForThisAnnotation() {
        Node fn = createFunctionNode();
        fn.addChildToBack(new Node(Token.THIS));
        Node root = Node.newScript(fn);
        traverse(root);
        assertTrue(compiler.getErrors().contains("dangerous use of the global 'this' object"));
    }

    @Test
    public void testThisInBlockStatement() {
        Node thisNode = createThisNode();
        Node block = new Node(Token.BLOCK, thisNode);
        Node root = Node.newScript(block);
        traverse(root);
        assertTrue(compiler.getErrors().contains("dangerous use of the global 'this' object"));
    }

    @Test
    public void testThisInLabelStatement() {
        Node thisNode = createThisNode();
        Node label = new Node(Token.LABEL, Node.newString("myLabel"), thisNode);
        Node root = Node.newScript(label);
        traverse(root);
        assertTrue(compiler.getErrors().contains("dangerous use of the global 'this' object"));
    }

    @Test
    public void testThisInLoopStatement() {
        Node thisNode = createThisNode();
        Node loop = new Node(Token.FOR, new Node(Token.BLOCK, thisNode));
        Node root = Node.newScript(loop);
        traverse(root);
        assertTrue(compiler.getErrors().contains("dangerous use of the global 'this' object"));
    }

    @Test
    public void testThisInIfStatement() {
        Node thisNode = createThisNode();
        Node ifNode = new Node(Token.IF, new Node(Token.TRUE), new Node(Token.BLOCK, thisNode));
        Node root = Node.newScript(ifNode);
        traverse(root);
        assertTrue(compiler.getErrors().contains("dangerous use of the global 'this' object"));
    }

    @Test
    public void testThisInSwitchStatement() {
        Node thisNode = createThisNode();
        Node caseNode = new Node(Token.CASE, Node.newString("case1"), thisNode);
        Node switchNode = new Node(Token.SWITCH, new Node(Token.NAME, Node.newString("expr")), caseNode);
        Node root = Node.newScript(switchNode);
        traverse(root);
        assertTrue(compiler.getErrors().contains("dangerous use of the global 'this' object"));
    }

    @Test
    public void testThisInTryStatement() {
        Node thisNode = createThisNode();
        Node catchBlock = new Node(Token.BLOCK, thisNode);
        Node tryNode = new Node(Token.TRY, new Node(Token.BLOCK), null, catchBlock);
        Node root = Node.newScript(tryNode);
        traverse(root);
        assertTrue(compiler.getErrors().contains("dangerous use of the global 'this' object"));
    }

    @Test
    public void testThisInCatchClause() {
        Node thisNode = createThisNode();
        Node catchClause = new Node(Token.CATCH, new Node(Token.NAME, Node.newString("e")), new Node(Token.BLOCK, thisNode));
        Node tryNode = new Node(Token.TRY, new Node(Token.BLOCK), catchClause);
        Node root = Node.newScript(tryNode);
        traverse(root);
        assertTrue(compiler.getErrors().contains("dangerous use of the global 'this' object"));
    }

    @Test
    public void testThisInFinallyBlock() {
        Node thisNode = createThisNode();
        Node finallyBlock = new Node(Token.FINALLY, new Node(Token.BLOCK, thisNode));
        Node tryNode = new Node(Token.TRY, new Node(Token.BLOCK), null, null, finallyBlock);
        Node root = Node.newScript(tryNode);
        traverse(root);
        assertTrue(compiler.getErrors().contains("dangerous use of the global 'this' object"));
    }

    @Test
    public void testThisInAssignmentToPrototypeProperty() {
        Node thisNode = createThisNode();
        Node protoNode = new Node(Token.GETPROP, new Node(Token.THIS), Node.newString("prototype"));
        Node propAccess = createGetPropNode(protoNode, "foo");
        Node assign = createAssignNode(propAccess, thisNode);
        Node root = Node.newScript(assign);
        traverse(root);
        assertTrue(compiler.getErrors().contains("dangerous use of the global 'this' object"));
    }

    @Test
    public void testThisInNestedAssignmentToPrototypeProperty() {
        Node thisNode = createThisNode();
        Node nestedObj = new Node(Token.GETPROP, thisNode, Node.newString("bar"));
        Node protoNode = new Node(Token.GETPROP, nestedObj, Node.newString("prototype"));
        Node propAccess = createGetPropNode(protoNode, "foo");
        Node assign = createAssignNode(propAccess, thisNode);
        Node root = Node.newScript(assign);
        traverse(root);
        assertTrue(compiler.getErrors().contains("dangerous use of the global 'this' object"));
    }
    
    @Test
    public void testThisInAssignmentWithParentNotAssign() {
        Node thisNode = createThisNode();
        Node fnBody = new Node(Token.BLOCK, new Node(Token.ASSIGN, Node.newString("x"), thisNode));
        Node fn = new Node(Token.FUNCTION, fnBody);
        Node root = Node.newScript(fn);
        traverse(root);
        assertTrue(compiler.getErrors().contains("dangerous use of the global 'this' object"));
    }

    @Test
    public void testShouldTraverseIgnoresConstructor() {
        JSDocInfo jsDoc = createJsDocInfo();
        jsDoc.setConstructor(true);
        Node fn = createFunctionNodeWithJsDoc(jsDoc);
        Node traversalRoot = new Node(Token.SCRIPT, fn);
        assertFalse(checkGlobalThis.shouldTraverse(null, fn, traversalRoot));
    }

    @Test
    public void testShouldTraverseIgnoresInterface() {
        JSDocInfo jsDoc = createJsDocInfo();
        jsDoc.setInterface(true);
        Node fn = createFunctionNodeWithJsDoc(jsDoc);
        Node traversalRoot = new Node(Token.SCRIPT, fn);
        assertFalse(checkGlobalThis.shouldTraverse(null, fn, traversalRoot));
    }
    
    @Test
    public void testShouldTraverseIgnoresFunctionWithThisType() {
        JSDocInfo jsDoc = createJsDocInfo();
        jsDoc.hasThisType(); // Simulate setting a @this type
        Node fn = createFunctionNodeWithJsDoc(jsDoc);
        Node traversalRoot = new Node(Token.SCRIPT, fn);
        assertFalse(checkGlobalThis.shouldTraverse(null, fn, traversalRoot));
    }

    @Test
    public void testShouldTraverseIgnoresFunctionWithOverride() {
        JSDocInfo jsDoc = createJsDocInfo();
        jsDoc.setOverride(true);
        Node fn = createFunctionNodeWithJsDoc(jsDoc);
        Node traversalRoot = new Node(Token.SCRIPT, fn);
        assertFalse(checkGlobalThis.shouldTraverse(null, fn, traversalRoot));
    }

    @Test
    public void testShouldTraverseHandlesFunctionInBlock() {
        Node fn = createFunctionNode();
        Node block = new Node(Token.BLOCK, fn);
        assertTrue(checkGlobalThis.shouldTraverse(null, fn, block));
    }

    @Test
    public void testShouldTraverseHandlesFunctionInScript() {
        Node fn = createFunctionNode();
        Node script = new Node(Token.SCRIPT, fn);
        assertTrue(checkGlobalThis.shouldTraverse(null, fn, script));
    }

    @Test
    public void testShouldTraverseHandlesFunctionInName() {
        Node name = new Node(Token.NAME);
        Node var = new Node(Token.VAR, name);
        assertTrue(checkGlobalThis.shouldTraverse(null, name, var));
    }

    @Test
    public void testShouldTraverseHandlesFunctionInAssign() {
        Node lhs = new Node(Token.NAME);
        Node rhs = createFunctionNode();
        Node assign = new Node(Token.ASSIGN, lhs, rhs);
        assertTrue(checkGlobalThis.shouldTraverse(null, rhs, assign));
    }

    @Test
    public void testShouldTraverseDoesNotHandleFunctionInObjectLit() {
        Node fn = createFunctionNode();
        Node objLit = new Node(Token.OBJECTLIT, new Node(Token.STRING_KEY, Node.newString("method"), fn));
        assertFalse(checkGlobalThis.shouldTraverse(null, fn, objLit));
    }

    @Test
    public void testShouldReportThisWithAssignLhsChild() {
        Node thisNode = createThisNode();
        Node assign = createAssignNode(thisNode, new Node(Token.NUMBER));
        Node root = Node.newScript(assign);
        
        checkGlobalThis.assignLhsChild = thisNode;
        assertTrue(checkGlobalThis.shouldReportThis(thisNode, assign));
    }

    @Test
    public void testShouldReportThisWithPropertyAccess() {
        Node thisNode = createThisNode();
        Node getProp = createGetPropNode(thisNode, "foo");
        assertTrue(checkGlobalThis.shouldReportThis(thisNode, getProp));
    }

    @Test
    public void testShouldNotReportThisWhenNotLhsOfAssignAndNotPropertyAccess() {
        Node thisNode = createThisNode();
        Node paren = new Node(Token.PAREN, thisNode); 
        assertFalse(checkGlobalThis.shouldReportThis(thisNode, paren));
    }

    @Test
    public void testGetFunctionJsDocInfoFromFunctionNode() {
        JSDocInfo jsDoc = createJsDocInfo();
        Node fn = createFunctionNodeWithJsDoc(jsDoc);
        assertEquals(jsDoc, checkGlobalThis.getFunctionJsDocInfo(fn));
    }

    @Test
    public void testGetFunctionJsDocInfoFromParentNameNode() {
        JSDocInfo jsDoc = createJsDocInfo();
        Node name = new Node(Token.NAME, Node.newString("myFunc"));
        name.setJSDocInfo(jsDoc);
        Node var = new Node(Token.VAR, name);
        assertEquals(jsDoc, checkGlobalThis.getFunctionJsDocInfo(name));
    }

    @Test
    public void testGetFunctionJsDocInfoFromParentAssignNode() {
        JSDocInfo jsDoc = createJsDocInfo();
        Node lhs = new Node(Token.NAME);
        Node rhsFn = createFunctionNode();
        Node assign = new Node(Token.ASSIGN, lhs, rhsFn);
        assign.setJSDocInfo(jsDoc);
        assertEquals(jsDoc, checkGlobalThis.getFunctionJsDocInfo(rhsFn));
    }

    @Test
    public void testGetFunctionJsDocInfoFromGrandparentVarNode() {
        JSDocInfo jsDoc = createJsDocInfo();
        Node name = new Node(Token.NAME, Node.newString("myFunc"));
        Node var = new Node(Token.VAR, name);
        var.setJSDocInfo(jsDoc);
        assertEquals(jsDoc, checkGlobalThis.getFunctionJsDocInfo(name));
    }

    @Test
    public void testGetFunctionJsDocInfoReturnsNullWhenNonePresent() {
        Node fn = createFunctionNode();
        assertNull(checkGlobalThis.getFunctionJsDocInfo(fn));
    }
}
```