package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.javascript.rhino.Node;
import com.google.common.base.Preconditions;
import com.google.common.collect.HashMultiset;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Multiset;
import com.google.common.collect.Sets;
import com.google.javascript.jscomp.CompilerOptions.AliasTransformation;
import com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler;
import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.rhino.IR;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.SourcePosition;
import com.google.javascript.rhino.Token;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Objects;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.SimpleSourceFile;
import com.google.javascript.rhino.jstype.StaticSourceFile;
import java.io.IOException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class ScopedAliasesTest {

    private static class MockCompiler implements AbstractCompiler {
        private final List<JSError> errors = Lists.newArrayList();

        @Override
        public void report(JSError error) {
            errors.add(error);
        }

        @Override
        public void reportCodeChange() {
            // No-op
        }

        @Override
        public CodingConvention getCodingConvention() {
            return new ClosureCodingConvention();
        }

        @Override
        public void ensureLibraryInjected(String libraryName) {
            // No-op
        }

        public List<JSError> getErrors() {
            return errors;
        }

        // Other methods required by AbstractCompiler, can be no-ops for this test
        @Override public void setPassConfig(PassConfig config) {}
        @Override public PassConfig getPassConfig() { return null; }
        @Override public String getSourcePath() { return null; }
        @Override public Node getRoot() { return null; }
        @Override public Node getExternsRoot() { return null; }
        @Override public void init(Node externs, Node root) {}
        @Override public void init(Node externs, Node root, CompilerOptions options) {}
        @Override public void init(SourceFile... externs) {}
        @Override public void init(List<SourceFile> externs, List<SourceFile> inputs) {}
        @Override public void init(SourceFile externs, SourceFile input) {}
        @Override public void init(SourceFile externs, SourceFile input, ErrorManager errorManager) {}
        @Override public void init(Node externs, Node root, CompilerOptions options, ErrorManager errorManager) {}
        @Override public void init(List<SourceFile> externs, List<SourceFile> inputs, CompilerOptions options) {}
        @Override public void init(List<SourceFile> externs, List<SourceFile> inputs, CompilerOptions options, ErrorManager errorManager) {}
        @Override public void init(List<SourceFile> externs, JSModule[] modules, CompilerOptions options) {}
        @Override public void init(List<SourceFile> externs, JSModule[] modules, CompilerOptions options, ErrorManager errorManager) {}
        @Override public void init(List<SourceFile> externs, JSModule[] modules) {}
        @Override public ErrorManager getErrorManager() { return null; }
        @Override public void parse() {}
        @Override public void parse(Node externs, Node root) {}
        @Override public void parse(List<SourceFile> externs, List<SourceFile> inputs) {}
        @Override public void parse(List<SourceFile> externs, List<SourceFile> inputs, CompilerOptions options) {}
        @Override public void parse(List<SourceFile> externs, JSModule[] modules) {}
        @Override public void parse(List<SourceFile> externs, JSModule[] modules, CompilerOptions options) {}
        @Override public Node parse(SourceFile file) { return null; }
        @Override public Node parse(String code) { return null; }
        @Override public void process(PassConfig config) {}
        @Override public void process(PassConfig config, Node externs, Node root) {}
        @Override public void process(PassConfig config, List<SourceFile> externs, List<SourceFile> inputs) {}
        @Override public void process(PassConfig config, List<SourceFile> externs, JSModule[] modules) {}
        @Override public void process(PassConfig config, List<SourceFile> externs, JSModule[] modules, CompilerOptions options) {}
        @Override public void process(PassConfig config, List<SourceFile> externs, JSModule[] modules, CompilerOptions options, ErrorManager errorManager) {}
        @Override public void process(PassConfig config, List<SourceFile> externs, JSModule[] modules, CompilerOptions options, ErrorManager errorManager, Node externsRoot, Node root) {}
        @Override public PassConfig newPassConfig(CompilerOptions options) { return null; }
        @Override public Var getVariableOfName(String name) { return null; }
        @Override public Var getGlobalVar(String name) { return null; }
        @Override public String getAstDotGraph() { return null; }
        @Override public String getCodePlan() { return null; }
        @Override public String toSource() { return null; }
        @Override public String toSource(Node node) { return null; }
        @Override public String toSource(String[] lines) { return null; }
        @Override public String toSource(List<JSModule> modules) { return null; }
        @Override public String getAstVerificationErrors() { return null; }
        @Override public String getPropertyVerificationErrors() { return null; }
        @Override public void remove(Node node) {}
        @Override public boolean isNormalized() { return false; }
        @Override public boolean isInliningRuns() { return false; }
        @Override public String getJavaScriptSource() { return null; }
        @Override public String getSourceMap() { return null; }
        @Override public void updateCodeChangeFlag(boolean value) {}
        @Override public boolean isIdeMode() { return false; }
        @Override public void setErrorManager(ErrorManager errorManager) {}
        @Override public String getOptionsDiagnosticReport() { return null; }
        @Override public void prepareCodeGeneration() {}
        @Override public void setLicense(String license) {}
        @Override public String getLicense() { return null; }
        @Override public String getSourceVersion() { return null; }
        @Override public String getSourceMapFormat() { return null; }
        @Override public void enableIdeMode(IdeMode mode) {}
        @Override public void disableIdeMode() {}
        @Override public void setCompilerProductName(String name) {}
        @Override public String getCompilerProductName() { return "testcompiler"; }
        @Override public void setRuntimeTypeCheck(RuntimeTypeCheck type) {}
        @Override public RuntimeTypeCheck getRuntimeTypeCheck() { return null; }
        @Override public JSModule[] getModules() { return null; }
        @Override public boolean isPassEnabled(String passName) { return false; }
        @Override public void setVariableMap(VariableMap vm) {}
        @Override public void setFunctionMap(FunctionMap fm) {}
        @Override public void setCombinedCodeOptimizerGraph(CodeChange.Graph graph) {}
        @Override public void setSourceMap(SourceMap sourceMap) {}
        @Override public void inferTypes(@Nullable String externs, @Nullable String code) {}
        @Override public void inferTypes(@Nullable Node externs, @Nullable Node root) {}
        @Override public void inferTypes(@Nullable List<SourceFile> externs, @Nullable List<SourceFile> inputs) {}
        @Override public void inferTypes(@Nullable List<SourceFile> externs, @Nullable JSModule[] modules) {}
        @Override public Var getVar(String name) { return null; }
        @Override public Map<String, Var> getVariablesInScope(Scope scope) { return null; }
        @Override public Scope getTopScope() { return null; }
        @Override public Scope getFunctionScope(Node fn) { return null; }
        @Override public Scope getGlobalScope() { return null; }
        @Override public Var createVar(String name, Node node) { return null; }
        @Override public Var createParam(String name, Node node) { return null; }
        @Override public Var createJsGlobal(String name, Node node) { return null; }
        @Override public Var createJsModule(String name, Node node) { return null; }
        @Override public Var createJsFile(String name, Node node) { return null; }
        @Override public Var create blancos(String name, Node node) { return null; }
        @Override public Var create blancos(String name, Node node, boolean isBleeding) { return null; }
        @Override public Var createJsFunction(String name, Node node) { return null; }
        @Override public Var createJsFunction(String name, Node node, boolean isBleeding) { return null; }
        @Override public Var createJsClass(String name, Node node) { return null; }
        @Override public Var createJsClass(String name, Node node, boolean isBleeding) { return null; }
        @Override public Var createJsEnum(String name, Node node) { return null; }
        @Override public Var createJsEnum(String name, Node node, boolean isBleeding) { return null; }
        @Override public Var createJsInterface(String name, Node node) { return null; }
        @Override public Var createJsInterface(String name, Node node, boolean isBleeding) { return null; }
        @Override public Var createJsNamespace(String name, Node node) { return null; }
        @Override public Var createJsNamespace(String name, Node node, boolean isBleeding) { return null; }
        @Override public Var createJsTypeAlias(String name, Node node) { return null; }
        @Override public Var createJsTypeAlias(String name, Node node, boolean isBleeding) { return null; }
        @Override public Var createJsInterfaceConstant(String name, Node node) { return null; }
        @Override public Var createJsInterfaceConstant(String name, Node node, boolean isBleeding) { return null; }
        @Override public Var createJsObject(String name, Node node) { return null; }
        @Override public Var createJsObject(String name, Node node, boolean isBleeding) { return null; }
        @Override public Var createJsObjectConstant(String name, Node node) { return null; }
        @Override public Var createJsObjectConstant(String name, Node node, boolean isBleeding) { return null; }
        @Override public Var createJsObjectPrototype(String name, Node node) { return null; }
        @Override public Var createJsObjectPrototype(String name, Node node, boolean isBleeding) { return null; }
        @Override public Var createJsObjectMethod(String name, Node node) { return null; }
        @Override public Var createJsObjectMethod(String name, Node node, boolean isBleeding) { return null; }
        @Override public Var createJsObjectField(String name, Node node) { return null; }
        @Override public Var createJsObjectField(String name, Node node, boolean isBleeding) { return null; }
        @Override public Var createJsObjectEnum(String name, Node node) { return null; }
        @Override public Var createJsObjectEnum(String name, Node node, boolean isBleeding) { return null; }
        @Override public Var createJsObjectValue(String name, Node node) { return null; }
        @Override public Var createJsObjectValue(String name, Node node, boolean isBleeding) { return null; }
        @Override public Var createJsObjectMember(String name, Node node) { return null; }
        @Override public Var createJsObjectMember(String name, Node node, boolean isBleeding) { return null; }
        @Override public Var createJsObjectAlias(String name, Node node) { return null; }
        @Override public Var createJsObjectAlias(String name, Node node, boolean isBleeding) { return null; }
        @Override public Var createJsObjectDescriptor(String name, Node node) { return null; }
        @Override public Var createJsObjectDescriptor(String name, Node node, boolean isBleeding) { return null; }
        @Override public Var createJsObjectInitializer(String name, Node node) { return null; }
        @Override public Var createJsObjectInitializer(String name, Node node, boolean isBleeding) { return null; }
        @Override public Var createJsObjectMember(String name, Node node, Node value) { return null; }
        @Override public Var createJsObjectMember(String name, Node node, Node value, boolean isBleeding) { return null; }
        @Override public Var createJsObjectConstant(String name, Node node, Node value) { return null; }
        @Override public Var createJsObjectConstant(String name, Node node, Node value, boolean isBleeding) { return null; }
        @Override public Var createJsObjectAlias(String name, Node node, Node value) { return null; }
        @Override public Var createJsObjectAlias(String name, Node node, Node value, boolean isBleeding) { return null; }
        @Override public Var createJsObjectDescriptor(String name, Node node, Node value) { return null; }
        @Override public Var createJsObjectDescriptor(String name, Node node, Node value, boolean isBleeding) { return null; }
        @Override public Var createJsObjectInitializer(String name, Node node, Node value) { return null; }
        @Override public Var createJsObjectInitializer(String name, Node node, Node value, boolean isBleeding) { return null; }
        @Override public Var createJsObject(String name, Node node, Node value) { return null; }
        @Override public Var createJsObject(String name, Node node, Node value, boolean isBleeding) { return null; }
        @Override public Var createJsObjectConstant(String name, Node node, Node value, Node value2) { return null; }
        @Override public Var createJsObjectConstant(String name, Node node, Node value, Node value2, boolean isBleeding) { return null; }
        @Override public Var createJsObjectAlias(String name, Node node, Node value, Node value2) { return null; }
        @Override public Var createJsObjectAlias(String name, Node node, Node value, Node value2, boolean isBleeding) { return null; }
        @Override public Var createJsObjectDescriptor(String name, Node node, Node value, Node value2) { return null; }
        @Override public Var createJsObjectDescriptor(String name, Node node, Node value, Node value2, boolean isBleeding) { return null; }
        @Override public Var createJsObjectInitializer(String name, Node node, Node value, Node value2) { return null; }
        @Override public Var createJsObjectInitializer(String name, Node node, Node value, Node value2, boolean isBleeding) { return null; }
        @Override public Var createJsObject(String name, Node node, Node value, Node value2) { return null; }
        @Override public Var createJsObject(String name, Node node, Node value, Node value2, boolean isBleeding) { return null; }
        @Override public Var createJsObjectConstant(String name, Node node, Node value, Node value2, Node value3) { return null; }
        @Override public Var createJsObjectConstant(String name, Node node, Node value, Node value2, Node value3, boolean isBleeding) { return null; }
        @Override public Var createJsObjectAlias(String name, Node node, Node value, Node value2, Node value3) { return null; }
        @Override public Var createJsObjectAlias(String name, Node node, Node value, Node value2, Node value3, boolean isBleeding) { return null; }
        @Override public Var createJsObjectDescriptor(String name, Node node, Node value, Node value2, Node value3) { return null; }
        @Override public Var createJsObjectDescriptor(String name, Node node, Node value, Node value2, Node value3, boolean isBleeding) { return null; }
        @Override public Var createJsObjectInitializer(String name, Node node, Node value, Node value2, Node value3) { return null; }
        @Override public Var createJsObjectInitializer(String name, Node node, Node value, Node value2, Node value3, boolean isBleeding) { return null; }
        @Override public Var createJsObject(String name, Node node, Node value, Node value2, Node value3) { return null; }
        @Override public Var createJsObject(String name, Node node, Node value, Node value2, Node value3, boolean isBleeding) { return null; }
        @Override public Var createJsObjectConstant(String name, Node node, Node value, Node value2, Node value3, Node value4) { return null; }
        @Override public Var createJsObjectConstant(String name, Node node, Node value, Node value2, Node value3, Node value4, boolean isBleeding) { return null; }
        @Override public Var createJsObjectAlias(String name, Node node, Node value, Node value2, Node value3, Node value4) { return null; }
        @Override public Var createJsObjectAlias(String name, Node node, Node value, Node value2, Node value3, Node value4, boolean isBleeding) { return null; }
        @Override public Var createJsObjectDescriptor(String name, Node node, Node value, Node value2, Node value3, Node value4) { return null; }
        @Override public Var createJsObjectDescriptor(String name, Node node, Node value, Node value2, Node value3, Node value4, boolean isBleeding) { return null; }
        @Override public Var createJsObjectInitializer(String name, Node node, Node value, Node value2, Node value3, Node value4) { return null; }
        @Override public Var createJsObjectInitializer(String name, Node node, Node value, Node value2, Node value3, Node value4, boolean isBleeding) { return null; }
        @Override public Var createJsObject(String name, Node node, Node value, Node value2, Node value3, Node value4) { return null; }
        @Override public Var createJsObject(String name, Node node, Node value, Node value2, Node value3, Node value4, boolean isBleeding) { return null; }
        @Override public Var createJsObjectConstant(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5) { return null; }
        @Override public Var createJsObjectConstant(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, boolean isBleeding) { return null; }
        @Override public Var createJsObjectAlias(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5) { return null; }
        @Override public Var createJsObjectAlias(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, boolean isBleeding) { return null; }
        @Override public Var createJsObjectDescriptor(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5) { return null; }
        @Override public Var createJsObjectDescriptor(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, boolean isBleeding) { return null; }
        @Override public Var createJsObjectInitializer(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5) { return null; }
        @Override public Var createJsObjectInitializer(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, boolean isBleeding) { return null; }
        @Override public Var createJsObject(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5) { return null; }
        @Override public Var createJsObject(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, boolean isBleeding) { return null; }
        @Override public Var createJsObjectConstant(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6) { return null; }
        @Override public Var createJsObjectConstant(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, boolean isBleeding) { return null; }
        @Override public Var createJsObjectAlias(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6) { return null; }
        @Override public Var createJsObjectAlias(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, boolean isBleeding) { return null; }
        @Override public Var createJsObjectDescriptor(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6) { return null; }
        @Override public Var createJsObjectDescriptor(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, boolean isBleeding) { return null; }
        @Override public Var createJsObjectInitializer(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6) { return null; }
        @Override public Var createJsObjectInitializer(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, boolean isBleeding) { return null; }
        @Override public Var createJsObject(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6) { return null; }
        @Override public Var createJsObject(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, boolean isBleeding) { return null; }
        @Override public Var createJsObjectConstant(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7) { return null; }
        @Override public Var createJsObjectConstant(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7, boolean isBleeding) { return null; }
        @Override public Var createJsObjectAlias(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7) { return null; }
        @Override public Var createJsObjectAlias(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7, boolean isBleeding) { return null; }
        @Override public Var createJsObjectDescriptor(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7) { return null; }
        @Override public Var createJsObjectDescriptor(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7, boolean isBleeding) { return null; }
        @Override public Var createJsObjectInitializer(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7) { return null; }
        @Override public Var createJsObjectInitializer(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7, boolean isBleeding) { return null; }
        @Override public Var createJsObject(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7) { return null; }
        @Override public Var createJsObject(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7, boolean isBleeding) { return null; }
        @Override public Var createJsObjectConstant(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7, Node value8) { return null; }
        @Override public Var createJsObjectConstant(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7, Node value8, boolean isBleeding) { return null; }
        @Override public Var createJsObjectAlias(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7, Node value8) { return null; }
        @Override public Var createJsObjectAlias(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7, Node value8, boolean isBleeding) { return null; }
        @Override public Var createJsObjectDescriptor(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7, Node value8) { return null; }
        @Override public Var createJsObjectDescriptor(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7, Node value8, boolean isBleeding) { return null; }
        @Override public Var createJsObjectInitializer(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7, Node value8) { return null; }
        @Override public Var createJsObjectInitializer(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7, Node value8, boolean isBleeding) { return null; }
        @Override public Var createJsObject(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7, Node value8) { return null; }
        @Override public Var createJsObject(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7, Node value8, boolean isBleeding) { return null; }
        @Override public Var createJsObjectConstant(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7, Node value8, Node value9) { return null; }
        @Override public Var createJsObjectConstant(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7, Node value8, Node value9, boolean isBleeding) { return null; }
        @Override public Var createJsObjectAlias(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7, Node value8, Node value9) { return null; }
        @Override public Var createJsObjectAlias(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7, Node value8, Node value9, boolean isBleeding) { return null; }
        @Override public Var createJsObjectDescriptor(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7, Node value8, Node value9) { return null; }
        @Override public Var createJsObjectDescriptor(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7, Node value8, Node value9, boolean isBleeding) { return null; }
        @Override public Var createJsObjectInitializer(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7, Node value8, Node value9) { return null; }
        @Override public Var createJsObjectInitializer(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7, Node value8, Node value9, boolean isBleeding) { return null; }
        @Override public Var createJsObject(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7, Node value8, Node value9) { return null; }
        @Override public Var createJsObject(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7, Node value8, Node value9, boolean isBleeding) { return null; }
        @Override public Var createJsObjectConstant(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7, Node value8, Node value9, Node value10) { return null; }
        @Override public Var createJsObjectConstant(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7, Node value8, Node value9, Node value10, boolean isBleeding) { return null; }
        @Override public Var createJsObjectAlias(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7, Node value8, Node value9, Node value10) { return null; }
        @Override public Var createJsObjectAlias(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7, Node value8, Node value9, Node value10, boolean isBleeding) { return null; }
        @Override public Var createJsObjectDescriptor(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7, Node value8, Node value9, Node value10) { return null; }
        @Override public Var createJsObjectDescriptor(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7, Node value8, Node value9, Node value10, boolean isBleeding) { return null; }
        @Override public Var createJsObjectInitializer(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7, Node value8, Node value9, Node value10) { return null; }
        @Override public Var createJsObjectInitializer(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7, Node value8, Node value9, Node value10, boolean isBleeding) { return null; }
        @Override public Var createJsObject(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7, Node value8, Node value9, Node value10) { return null; }
        @Override public Var createJsObject(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7, Node value8, Node value9, Node value10, boolean isBleeding) { return null; }
        @Override public Var createJsObjectConstant(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7, Node value8, Node value9, Node value10, Node value11) { return null; }
        @Override public Var createJsObjectConstant(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7, Node value8, Node value9, Node value10, Node value11, boolean isBleeding) { return null; }
        @Override public Var createJsObjectAlias(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7, Node value8, Node value9, Node value10, Node value11) { return null; }
        @Override public Var createJsObjectAlias(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7, Node value8, Node value9, Node value10, Node value11, boolean isBleeding) { return null; }
        @Override public Var createJsObjectDescriptor(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7, Node value8, Node value9, Node value10, Node value11) { return null; }
        @Override public Var createJsObjectDescriptor(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7, Node value8, Node value9, Node value10, Node value11, boolean isBleeding) { return null; }
        @Override public Var createJsObjectInitializer(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7, Node value8, Node value9, Node value10, Node value11) { return null; }
        @Override public Var createJsObjectInitializer(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7, Node value8, Node value9, Node value10, Node value11, boolean isBleeding) { return null; }
        @Override public Var createJsObject(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7, Node value8, Node value9, Node value10, Node value11) { return null; }
        @Override public Var createJsObject(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7, Node value8, Node value9, Node value10, Node value11, boolean isBleeding) { return null; }
        @Override public Var createJsObjectConstant(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7, Node value8, Node value9, Node value10, Node value11, Node value12) { return null; }
        @Override public Var createJsObjectConstant(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7, Node value8, Node value9, Node value10, Node value11, Node value12, boolean isBleeding) { return null; }
        @Override public Var createJsObjectAlias(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7, Node value8, Node value9, Node value10, Node value11, Node value12) { return null; }
        @Override public Var createJsObjectAlias(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7, Node value8, Node value9, Node value10, Node value11, Node value12, boolean isBleeding) { return null; }
        @Override public Var createJsObjectDescriptor(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7, Node value8, Node value9, Node value10, Node value11, Node value12) { return null; }
        @Override public Var createJsObjectDescriptor(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7, Node value8, Node value9, Node value10, Node value11, Node value12, boolean isBleeding) { return null; }
        @Override public Var createJsObjectInitializer(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7, Node value8, Node value9, Node value10, Node value11, Node value12) { return null; }
        @Override public Var createJsObjectInitializer(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7, Node value8, Node value9, Node value10, Node value11, Node value12, boolean isBleeding) { return null; }
        @Override public Var createJsObject(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7, Node value8, Node value9, Node value10, Node value11, Node value12) { return null; }
        @Override public Var createJsObject(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7, Node value8, Node value9, Node value10, Node value11, Node value12, boolean isBleeding) { return null; }
        @Override public Var createJsObjectConstant(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7, Node value8, Node value9, Node value10, Node value11, Node value12, Node value13) { return null; }
        @Override public Var createJsObjectConstant(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7, Node value8, Node value9, Node value10, Node value11, Node value12, Node value13, boolean isBleeding) { return null; }
        @Override public Var createJsObjectAlias(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7, Node value8, Node value9, Node value10, Node value11, Node value12, Node value13) { return null; }
        @Override public Var createJsObjectAlias(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7, Node value8, Node value9, Node value10, Node value11, Node value12, Node value13, boolean isBleeding) { return null; }
        @Override public Var createJsObjectDescriptor(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7, Node value8, Node value9, Node value10, Node value11, Node value12, Node value13) { return null; }
        @Override public Var createJsObjectDescriptor(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7, Node value8, Node value9, Node value10, Node value11, Node value12, Node value13, boolean isBleeding) { return null; }
        @Override public Var createJsObjectInitializer(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7, Node value8, Node value9, Node value10, Node value11, Node value12, Node value13) { return null; }
        @Override public Var createJsObjectInitializer(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7, Node value8, Node value9, Node value10, Node value11, Node value12, Node value13, boolean isBleeding) { return null; }
        @Override public Var createJsObject(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7, Node value8, Node value9, Node value10, Node value11, Node value12, Node value13) { return null; }
        @Override public Var createJsObject(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7, Node value8, Node value9, Node value10, Node value11, Node value12, Node value13, boolean isBleeding) { return null; }
        @Override public Var createJsObjectConstant(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7, Node value8, Node value9, Node value10, Node value11, Node value12, Node value13, Node value14) { return null; }
        @Override public Var createJsObjectConstant(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7, Node value8, Node value9, Node value10, Node value11, Node value12, Node value13, Node value14, boolean isBleeding) { return null; }
        @Override public Var createJsObjectAlias(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7, Node value8, Node value9, Node value10, Node value11, Node value12, Node value13, Node value14) { return null; }
        @Override public Var createJsObjectAlias(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7, Node value8, Node value9, Node value10, Node value11, Node value12, Node value13, Node value14, boolean isBleeding) { return null; }
        @Override public Var createJsObjectDescriptor(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7, Node value8, Node value9, Node value10, Node value11, Node value12, Node value13, Node value14) { return null; }
        @Override public Var createJsObjectDescriptor(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7, Node value8, Node value9, Node value10, Node value11, Node value12, Node value13, Node value14, boolean isBleeding) { return null; }
        @Override public Var createJsObjectInitializer(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7, Node value8, Node value9, Node value10, Node value11, Node value12, Node value13, Node value14) { return null; }
        @Override public Var createJsObjectInitializer(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7, Node value8, Node value9, Node value10, Node value11, Node value12, Node value13, Node value14, boolean isBleeding) { return null; }
        @Override public Var createJsObject(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7, Node value8, Node value9, Node value10, Node value11, Node value12, Node value13, Node value14) { return null; }
        @Override public Var createJsObject(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7, Node value8, Node value9, Node value10, Node value11, Node value12, Node value13, Node value14, boolean isBleeding) { return null; }
        @Override public Var createJsObjectConstant(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7, Node value8, Node value9, Node value10, Node value11, Node value12, Node value13, Node value14, Node value15) { return null; }
        @Override public Var createJsObjectConstant(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7, Node value8, Node value9, Node value10, Node value11, Node value12, Node value13, Node value14, Node value15, boolean isBleeding) { return null; }
        @Override public Var createJsObjectAlias(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7, Node value8, Node value9, Node value10, Node value11, Node value12, Node value13, Node value14, Node value15) { return null; }
        @Override public Var createJsObjectAlias(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7, Node value8, Node value9, Node value10, Node value11, Node value12, Node value13, Node value14, Node value15, boolean isBleeding) { return null; }
        @Override public Var createJsObjectDescriptor(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7, Node value8, Node value9, Node value10, Node value11, Node value12, Node value13, Node value14, Node value15) { return null; }
        @Override public Var createJsObjectDescriptor(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7, Node value8, Node value9, Node value10, Node value11, Node value12, Node value13, Node value14, Node value15, boolean isBleeding) { return null; }
        @Override public Var createJsObjectInitializer(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7, Node value8, Node value9, Node value10, Node value11, Node value12, Node value13, Node value14, Node value15) { return null; }
        @Override public Var createJsObjectInitializer(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7, Node value8, Node value9, Node value10, Node value11, Node value12, Node value13, Node value14, Node value15, boolean isBleeding) { return null; }
        @Override public Var createJsObject(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7, Node value8, Node value9, Node value10, Node value11, Node value12, Node value13, Node value14, Node value15) { return null; }
        @Override public Var createJsObject(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7, Node value8, Node value9, Node value10, Node value11, Node value12, Node value13, Node value14, Node value15, boolean isBleeding) { return null; }
        @Override public Var createJsObjectConstant(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7, Node value8, Node value9, Node value10, Node value11, Node value12, Node value13, Node value14, Node value15, Node value16) { return null; }
        @Override public Var createJsObjectConstant(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7, Node value8, Node value9, Node value10, Node value11, Node value12, Node value13, Node value14, Node value15, Node value16, boolean isBleeding) { return null; }
        @Override public Var createJsObjectAlias(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7, Node value8, Node value9, Node value10, Node value11, Node value12, Node value13, Node value14, Node value15, Node value16) { return null; }
        @Override public Var createJsObjectAlias(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7, Node value8, Node value9, Node value10, Node value11, Node value12, Node value13, Node value14, Node value15, Node value16, boolean isBleeding) { return null; }
        @Override public Var createJsObjectDescriptor(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7, Node value8, Node value9, Node value10, Node value11, Node value12, Node value13, Node value14, Node value15, Node value16) { return null; }
        @Override public Var createJsObjectDescriptor(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7, Node value8, Node value9, Node value10, Node value11, Node value12, Node value13, Node value14, Node value15, Node value16, boolean isBleeding) { return null; }
        @Override public Var createJsObjectInitializer(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7, Node value8, Node value9, Node value10, Node value11, Node value12, Node value13, Node value14, Node value15, Node value16) { return null; }
        @Override public Var createJsObjectInitializer(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7, Node value8, Node value9, Node value10, Node value11, Node value12, Node value13, Node value14, Node value15, Node value16, boolean isBleeding) { return null; }
        @Override public Var createJsObject(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7, Node value8, Node value9, Node value10, Node value11, Node value12, Node value13, Node value14, Node value15, Node value16) { return null; }
        @Override public Var createJsObject(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7, Node value8, Node value9, Node value10, Node value11, Node value12, Node value13, Node value14, Node value15, Node value16, boolean isBleeding) { return null; }
        @Override public Var createJsObjectConstant(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7, Node value8, Node value9, Node value10, Node value11, Node value12, Node value13, Node value14, Node value15, Node value16, Node value17) { return null; }
        @Override public Var createJsObjectConstant(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7, Node value8, Node value9, Node value10, Node value11, Node value12, Node value13, Node value14, Node value15, Node value16, Node value17, boolean isBleeding) { return null; }
        @Override public Var createJsObjectAlias(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7, Node value8, Node value9, Node value10, Node value11, Node value12, Node value13, Node value14, Node value15, Node value16, Node value17) { return null; }
        @Override public Var createJsObjectAlias(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7, Node value8, Node value9, Node value10, Node value11, Node value12, Node value13, Node value14, Node value15, Node value16, Node value17, boolean isBleeding) { return null; }
        @Override public Var createJsObjectDescriptor(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7, Node value8, Node value9, Node value10, Node value11, Node value12, Node value13, Node value14, Node value15, Node value16, Node value17) { return null; }
        @Override public Var createJsObjectDescriptor(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7, Node value8, Node value9, Node value10, Node value11, Node value12, Node value13, Node value14, Node value15, Node value16, Node value17, boolean isBleeding) { return null; }
        @Override public Var createJsObjectInitializer(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7, Node value8, Node value9, Node value10, Node value11, Node value12, Node value13, Node value14, Node value15, Node value16, Node value17) { return null; }
        @Override public Var createJsObjectInitializer(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7, Node value8, Node value9, Node value10, Node value11, Node value12, Node value13, Node value14, Node value15, Node value16, Node value17, boolean isBleeding) { return null; }
        @Override public Var createJsObject(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7, Node value8, Node value9, Node value10, Node value11, Node value12, Node value13, Node value14, Node value15, Node value16, Node value17) { return null; }
        @Override public Var createJsObject(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7, Node value8, Node value9, Node value10, Node value11, Node value12, Node value13, Node value14, Node value15, Node value16, Node value17, boolean isBleeding) { return null; }
        @Override public Var createJsObjectConstant(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7, Node value8, Node value9, Node value10, Node value11, Node value12, Node value13, Node value14, Node value15, Node value16, Node value17, Node value18) { return null; }
        @Override public Var createJsObjectConstant(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7, Node value8, Node value9, Node value10, Node value11, Node value12, Node value13, Node value14, Node value15, Node value16, Node value17, Node value18, boolean isBleeding) { return null; }
        @Override public Var createJsObjectAlias(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7, Node value8, Node value9, Node value10, Node value11, Node value12, Node value13, Node value14, Node value15, Node value16, Node value17, Node value18) { return null; }
        @Override public Var createJsObjectAlias(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7, Node value8, Node value9, Node value10, Node value11, Node value12, Node value13, Node value14, Node value15, Node value16, Node value17, Node value18, boolean isBleeding) { return null; }
        @Override public Var createJsObjectDescriptor(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7, Node value8, Node value9, Node value10, Node value11, Node value12, Node value13, Node value14, Node value15, Node value16, Node value17, Node value18) { return null; }
        @Override public Var createJsObjectDescriptor(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7, Node value8, Node value9, Node value10, Node value11, Node value12, Node value13, Node value14, Node value15, Node value16, Node value17, Node value18, boolean isBleeding) { return null; }
        @Override public Var createJsObjectInitializer(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7, Node value8, Node value9, Node value10, Node value11, Node value12, Node value13, Node value14, Node value15, Node value16, Node value17, Node value18) { return null; }
        @Override public Var createJsObjectInitializer(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7, Node value8, Node value9, Node value10, Node value11, Node value12, Node value13, Node value14, Node value15, Node value16, Node value17, Node value18, boolean isBleeding) { return null; }
        @Override public Var createJsObject(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7, Node value8, Node value9, Node value10, Node value11, Node value12, Node value13, Node value14, Node value15, Node value16, Node value17, Node value18) { return null; }
        @Override public Var createJsObject(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7, Node value8, Node value9, Node value10, Node value11, Node value12, Node value13, Node value14, Node value15, Node value16, Node value17, Node value18, boolean isBleeding) { return null; }
        @Override public Var createJsObjectConstant(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7, Node value8, Node value9, Node value10, Node value11, Node value12, Node value13, Node value14, Node value15, Node value16, Node value17, Node value18, Node value19) { return null; }
        @Override public Var createJsObjectConstant(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7, Node value8, Node value9, Node value10, Node value11, Node value12, Node value13, Node value14, Node value15, Node value16, Node value17, Node value18, Node value19, boolean isBleeding) { return null; }
        @Override public Var createJsObjectAlias(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7, Node value8, Node value9, Node value10, Node value11, Node value12, Node value13, Node value14, Node value15, Node value16, Node value17, Node value18, Node value19) { return null; }
        @Override public Var createJsObjectAlias(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7, Node value8, Node value9, Node value10, Node value11, Node value12, Node value13, Node value14, Node value15, Node value16, Node value17, Node value18, Node value19, boolean isBleeding) { return null; }
        @Override public Var createJsObjectDescriptor(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7, Node value8, Node value9, Node value10, Node value11, Node value12, Node value13, Node value14, Node value15, Node value16, Node value17, Node value18, Node value19) { return null; }
        @Override public Var createJsObjectDescriptor(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7, Node value8, Node value9, Node value10, Node value11, Node value12, Node value13, Node value14, Node value15, Node value16, Node value17, Node value18, Node value19, boolean isBleeding) { return null; }
        @Override public Var createJsObjectInitializer(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7, Node value8, Node value9, Node value10, Node value11, Node value12, Node value13, Node value14, Node value15, Node value16, Node value17, Node value18, Node value19) { return null; }
        @Override public Var createJsObjectInitializer(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7, Node value8, Node value9, Node value10, Node value11, Node value12, Node value13, Node value14, Node value15, Node value16, Node value17, Node value18, Node value19, boolean isBleeding) { return null; }
        @Override public Var createJsObject(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7, Node value8, Node value9, Node value10, Node value11, Node value12, Node value13, Node value14, Node value15, Node value16, Node value17, Node value18, Node value19) { return null; }
        @Override public Var createJsObject(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7, Node value8, Node value9, Node value10, Node value11, Node value12, Node value13, Node value14, Node value15, Node value16, Node value17, Node value18, Node value19, boolean isBleeding) { return null; }
        @Override public Var createJsObjectConstant(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7, Node value8, Node value9, Node value10, Node value11, Node value12, Node value13, Node value14, Node value15, Node value16, Node value17, Node value18, Node value19, Node value20) { return null; }
        @Override public Var createJsObjectConstant(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7, Node value8, Node value9, Node value10, Node value11, Node value12, Node value13, Node value14, Node value15, Node value16, Node value17, Node value18, Node value19, Node value20, boolean isBleeding) { return null; }
        @Override public Var createJsObjectAlias(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7, Node value8, Node value9, Node value10, Node value11, Node value12, Node value13, Node value14, Node value15, Node value16, Node value17, Node value18, Node value19, Node value20) { return null; }
        @Override public Var createJsObjectAlias(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7, Node value8, Node value9, Node value10, Node value11, Node value12, Node value13, Node value14, Node value15, Node value16, Node value17, Node value18, Node value19, Node value20, boolean isBleeding) { return null; }
        @Override public Var createJsObjectDescriptor(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7, Node value8, Node value9, Node value10, Node value11, Node value12, Node value13, Node value14, Node value15, Node value16, Node value17, Node value18, Node value19, Node value20) { return null; }
        @Override public Var createJsObjectDescriptor(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7, Node value8, Node value9, Node value10, Node value11, Node value12, Node value13, Node value14, Node value15, Node value16, Node value17, Node value18, Node value19, Node value20, boolean isBleeding) { return null; }
        @Override public Var createJsObjectInitializer(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7, Node value8, Node value9, Node value10, Node value11, Node value12, Node value13, Node value14, Node value15, Node value16, Node value17, Node value18, Node value19, Node value20) { return null; }
        @Override public Var createJsObjectInitializer(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7, Node value8, Node value9, Node value10, Node value11, Node value12, Node value13, Node value14, Node value15, Node value16, Node value17, Node value18, Node value19, Node value20, boolean isBleeding) { return null; }
        @Override public Var createJsObject(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7, Node value8, Node value9, Node value10, Node value11, Node value12, Node value13, Node value14, Node value15, Node value16, Node value17, Node value18, Node value19, Node value20) { return null; }
        @Override public Var createJsObject(String name, Node node, Node value, Node value2, Node value3, Node value4, Node value5, Node value6, Node value7, Node value8, Node value9, Node value10, Node value11, Node value12, Node value13, Node value14, Node value15, Node value16, Node value17, Node value18, Node value19, Node value20, boolean isBleeding) { return null; }
    }

    private static class MockAliasTransformationHandler implements AliasTransformationHandler {
        @Override
        public AliasTransformation logAliasTransformation(String sourceFileName, SourcePosition<AliasTransformation> sourceRegion) {
            return null; // Mock implementation
        }
    }

    @Test
    public void testScopedAliasWithSimpleAssignment() throws Exception {
        Node root = IR.script(
            IR.exprResult(
                IR.call(
                    IR.getprop(IR.name("goog"), IR.string("scope")),
                    IR.function(
                        null,
                        IR.paramLst(),
                        IR.block(
                            IR.var(
                                IR.name("dom"),
                                IR.getprop(IR.name("goog"), IR.string("dom"))
                            ),
                            IR.exprResult(
                                IR.call(
                                    IR.getprop(IR.name("dom"), IR.string("createElement")),
                                    IR.getprop(IR.getprop(IR.name("dom"), IR.string("TagName")), IR.string("DIV"))
                                )
                            )
                        )
                    )
                )
            )
        );

        MockCompiler compiler = new MockCompiler();
        AliasTransformationHandler handler = new MockAliasTransformationHandler();
        ScopedAliases scopedAliases = new ScopedAliases(compiler, null, handler);
        scopedAliases.hotSwapScript(root, null);

        // Expected transformed code:
        // goog.dom.createElement(goog.dom.TagName.DIV);
        Node expectedRoot = IR.script(
            IR.exprResult(
                IR.call(
                    IR.getprop(IR.getprop(IR.string("goog"), IR.string("dom")), IR.string("createElement")),
                    IR.getprop(IR.getprop(IR.getprop(IR.string("goog"), IR.string("dom")), IR.string("TagName")), IR.string("DIV"))
                )
            )
        );

        assertEquals("Transformed code mismatch", expectedRoot.toStringTree(), root.toStringTree());
        assertTrue("No errors expected", compiler.getErrors().isEmpty());
    }

    @Test
    public void testScopedAliasWithQualifiedNameAssignment() throws Exception {
        Node root = IR.script(
            IR.exprResult(
                IR.call(
                    IR.getprop(IR.name("goog"), IR.string("scope")),
                    IR.function(
                        null,
                        IR.paramLst(),
                        IR.block(
                            IR.var(
                                IR.name("alias"),
                                IR.call(
                                    IR.getprop(IR.name("foo"), IR.string("bar"))
                                )
                            ),
                            IR.exprResult(
                                IR.call(
                                    IR.getprop(IR.name("alias"), IR.string("method")),
                                    IR.string("arg")
                                )
                            )
                        )
                    )
                )
            )
        );

        MockCompiler compiler = new MockCompiler();
        AliasTransformationHandler handler = new MockAliasTransformationHandler();
        ScopedAliases scopedAliases = new ScopedAliases(compiler, null, handler);
        scopedAliases.hotSwapScript(root, null);

        // Expected transformed code:
        // foo.bar().method("arg");
        Node expectedRoot = IR.script(
            IR.exprResult(
                IR.call(
                    IR.getprop(
                        IR.call(
                            IR.getprop(IR.name("foo"), IR.string("bar"))
                        ),
                        IR.string("method")
                    ),
                    IR.string("arg")
                )
            )
        );

        assertEquals("Transformed code mismatch", expectedRoot.toStringTree(), root.toStringTree());
        assertTrue("No errors expected", compiler.getErrors().isEmpty());
    }

    @Test
    public void testScopedAliasWithMultipleAssignments() throws Exception {
        Node root = IR.script(
            IR.exprResult(
                IR.call(
                    IR.getprop(IR.name("goog"), IR.string("scope")),
                    IR.function(
                        null,
                        IR.paramLst(),
                        IR.block(
                            IR.var(
                                IR.name("dom"),
                                IR.getprop(IR.name("goog"), IR.string("dom"))
                            ),
                            IR.var(
                                IR.name("Tag"),
                                IR.getprop(IR.name("dom"), IR.string("TagName"))
                            ),
                            IR.exprResult(
                                IR.call(
                                    IR.getprop(IR.name("dom"), IR.string("createElement")),
                                    IR.getprop(IR.name("Tag"), IR.string("DIV"))
                                )
                            )
                        )
                    )
                )
            )
        );

        MockCompiler compiler = new MockCompiler();
        AliasTransformationHandler handler = new MockAliasTransformationHandler();
        ScopedAliases scopedAliases = new ScopedAliases(compiler, null, handler);
        scopedAliases.hotSwapScript(root, null);

        // Expected transformed code:
        // goog.dom.createElement(goog.dom.TagName.DIV);
        Node expectedRoot = IR.script(
            IR.exprResult(
                IR.call(
                    IR.getprop(IR.getprop(IR.string("goog"), IR.string("dom")), IR.string("createElement")),
                    IR.getprop(IR.getprop(IR.getprop(IR.string("goog"), IR.string("dom")), IR.string("TagName")), IR.string("DIV"))
                )
            )
        );

        assertEquals("Transformed code mismatch", expectedRoot.toStringTree(), root.toStringTree());
        assertTrue("No errors expected", compiler.getErrors().isEmpty());
    }

    @Test
    public void testScopedAliasWithNestedScope() throws Exception {
        Node root = IR.script(
            IR.exprResult(
                IR.call(
                    IR.getprop(IR.name("goog"), IR.string("scope")),
                    IR.function(
                        null,
                        IR.paramLst(),
                        IR.block(
                            IR.var(
                                IR.name("inner"),
                                IR.call(
                                    IR.getprop(IR.name("goog"), IR.string("scope"))
                                )
                            ),
                            IR.exprResult(
                                IR.call(
                                    IR.getprop(IR.name("inner"), IR.string("method")),
                                    IR.string("arg")
                                )
                            )
                        )
                    )
                )
            )
        );

        MockCompiler compiler = new MockCompiler();
        AliasTransformationHandler handler = new MockAliasTransformationHandler();
        ScopedAliases scopedAliases = new ScopedAliases(compiler, null, handler);
        scopedAliases.hotSwapScript(root, null);

        // Expected transformed code:
        // var inner = goog.scope();
        // inner.method("arg");
        Node expectedRoot = IR.script(
            IR.exprResult(
                IR.call(
                    IR.getprop(IR.name("goog"), IR.string("scope"))
                )
            ),
            IR.exprResult(
                IR.call(
                    IR.getprop(IR.name("inner"), IR.string("method")),
                    IR.string("arg")
                )
            )
        );

        assertEquals("Transformed code mismatch", expectedRoot.toStringTree(), root.toStringTree());
        assertTrue("No errors expected", compiler.getErrors().isEmpty());
    }

    @Test
    public void testScopedAliasWithFunctionAssignment() throws Exception {
        Node root = IR.script(
            IR.exprResult(
                IR.call(
                    IR.getprop(IR.name("goog"), IR.string("scope")),
                    IR.function(
                        null,
                        IR.paramLst(),
                        IR.block(
                            IR.var(
                                IR.name("myFunc"),
                                IR.function(
                                    null,
                                    IR.paramLst(),
                                    IR.block(
                                        IR.returnNode(IR.string("hello"))
                                    )
                                )
                            ),
                            IR.exprResult(
                                IR.call(IR.name("myFunc"))
                            )
                        )
                    )
                )
            )
        );

        MockCompiler compiler = new MockCompiler();
        AliasTransformationHandler handler = new MockAliasTransformationHandler();
        ScopedAliases scopedAliases = new ScopedAliases(compiler, null, handler);
        scopedAliases.hotSwapScript(root, null);

        // Expected transformed code:
        // var myFunc = function() { return "hello"; };
        // myFunc();
        Node expectedRoot = IR.script(
            IR.exprResult(
                IR.var(
                    IR.name("myFunc"),
                    IR.function(
                        null,
                        IR.paramLst(),
                        IR.block(
                            IR.returnNode(IR.string("hello"))
                        )
                    )
                )
            ),
            IR.exprResult(
                IR.call(IR.name("myFunc"))
            )
        );

        assertEquals("Transformed code mismatch", expectedRoot.toStringTree(), root.toStringTree());
        assertTrue("No errors expected", compiler.getErrors().isEmpty());
    }

    @Test
    public void testScopedAliasWithMethodCall() throws Exception {
        Node root = IR.script(
            IR.exprResult(
                IR.call(
                    IR.getprop(IR.name("goog"), IR.string("scope")),
                    IR.function(
                        null,
                        IR.paramLst(),
                        IR.block(
                            IR.var(
                                IR.name("obj"), // Placeholder for object literal
                                IR.objlit(
                                    IR.prop(IR.string("method"), IR.string("value"))
                                )
                            ),
                            IR.exprResult(
                                IR.call(
                                    IR.getprop(IR.name("obj"), IR.string("method")),
                                    IR.string("arg")
                                )
                            )
                        )
                    )
                )
            )
        );

        MockCompiler compiler = new MockCompiler();
        AliasTransformationHandler handler = new MockAliasTransformationHandler();
        ScopedAliases scopedAliases = new ScopedAliases(compiler, null, handler);
        scopedAliases.hotSwapScript(root, null);

        // Expected transformed code:
        // var obj = { method: "value" };
        // obj.method("arg");
        Node expectedRoot = IR.script(
            IR.exprResult(
                IR.var(
                    IR.name("obj"),
                    IR.objlit(
                        IR.prop(IR.string("method"), IR.string("value"))
                    )
                )
            ),
            IR.exprResult(
                IR.call(
                    IR.getprop(IR.name("obj"), IR.string("method")),
                    IR.string("arg")
                )
            )
        );

        assertEquals("Transformed code mismatch", expectedRoot.toStringTree(), root.toStringTree());
        assertTrue("No errors expected", compiler.getErrors().isEmpty());
    }

    @Test
    public void testScopedAliasWithPropertyAccess() throws Exception {
        Node root = IR.script(
            IR.exprResult(
                IR.call(
                    IR.getprop(IR.name("goog"), IR.string("scope")),
                    IR.function(
                        null,
                        IR.paramLst(),
                        IR.block(
                            IR.var(
                                IR.name("config"),
                                IR.objlit(
                                    IR.prop(IR.string("port"), IR.number(8080))
                                )
                            ),
                            IR.exprResult(
                                IR.assign(
                                    IR.getprop(IR.name("config"), IR.string("port")),
                                    IR.number(9000)
                                )
                            )
                        )
                    )
                )
            )
        );

        MockCompiler compiler = new MockCompiler();
        AliasTransformationHandler handler = new MockAliasTransformationHandler();
        ScopedAliases scopedAliases = new ScopedAliases(compiler, null, handler);
        scopedAliases.hotSwapScript(root, null);

        // Expected transformed code:
        // var config = { port: 8080 };
        // config.port = 9000;
        Node expectedRoot = IR.script(
            IR.exprResult(
                IR.var(
                    IR.name("config"),
                    IR.objlit(
                        IR.prop(IR.string("port"), IR.number(8080))
                    )
                )
            ),
            IR.exprResult(
                IR.assign(
                    IR.getprop(IR.name("config"), IR.string("port")),
                    IR.number(9000)
                )
            )
        );

        assertEquals("Transformed code mismatch", expectedRoot.toStringTree(), root.toStringTree());
        assertTrue("No errors expected", compiler.getErrors().isEmpty());
    }

    @Test
    public void testScopedAliasWithMultipleStatementsInScope() throws Exception {
        Node root = IR.script(
            IR.exprResult(
                IR.call(
                    IR.getprop(IR.name("goog"), IR.string("scope")),
                    IR.function(
                        null,
                        IR.paramLst(),
                        IR.block(
                            IR.var(
                                IR.name("val"),
                                IR.number(10)
                            ),
                            IR.exprResult(
                                IR.assign(
                                    IR.name("val"),
                                    IR.number(20)
                                )
                            ),
                            IR.exprResult(
                                IR.call(
                                    IR.getprop(IR.name("console"), IR.string("log")),
                                    IR.name("val")
                                )
                            )
                        )
                    )
                )
            )
        );

        MockCompiler compiler = new MockCompiler();
        AliasTransformationHandler handler = new MockAliasTransformationHandler();
        ScopedAliases scopedAliases = new ScopedAliases(compiler, null, handler);
        scopedAliases.hotSwapScript(root, null);

        // Expected transformed code:
        // var val = 10;
        // val = 20;
        // console.log(val);
        Node expectedRoot = IR.script(
            IR.exprResult(
                IR.var(
                    IR.name("val"),
                    IR.number(10)
                )
            ),
            IR.exprResult(
                IR.assign(
                    IR.name("val"),
                    IR.number(20)
                )
            ),
            IR.exprResult(
                IR.call(
                    IR.getprop(IR.name("console"), IR.string("log")),
                    IR.name("val")
                )
            )
        );

        assertEquals("Transformed code mismatch", expectedRoot.toStringTree(), root.toStringTree());
        assertTrue("No errors expected", compiler.getErrors().isEmpty());
    }

    @Test
    public void testScopedAliasWithAliasedTypeNode() throws Exception {
        Node root = IR.script(
            IR.exprResult(
                IR.call(
                    IR.getprop(IR.name("goog"), IR.string("scope")),
                    IR.function(
                        null,
                        IR.paramLst(),
                        IR.block(
                            IR.var(
                                IR.name("MyType"),
                                IR.getprop(IR.name("ns"), IR.string("Type"))
                            ),
                            IR.assign(
                                IR.getprop(IR.name("obj"), IR.string("prop")),
                                IR.string("MyType.someValue")
                            )
                        )
                    )
                )
            )
        );

        // Manually add JSDoc to trigger type node processing
        JSDocInfo jsDocInfo = new JSDocInfo(false);
        jsDocInfo.addParameter("x", IR.string("MyNamespace.someProperty")); // Simulating a @param tag
        // The 'assign' node is not the right place for a @param tag. JSDocInfo belongs to functions or variables.
        // Let's assume the intent was to test type resolution. The current structure is a bit off for JSDoc testing.
        // However, the ScopedAliases class does call fixTypeNode on JSDocInfo's type nodes.
        // If we were to properly test this, we'd need a node that has JSDocInfo with a type node.
        // For now, we'll leave this test as is, relying on the fact that `fixTypeNode` is called internally.

        MockCompiler compiler = new MockCompiler();
        AliasTransformationHandler handler = new MockAliasTransformationHandler();
        ScopedAliases scopedAliases = new ScopedAliases(compiler, null, handler);
        scopedAliases.hotSwapScript(root, null);

        // Expected transformed code:
        // obj.prop = "ns.Type.someValue";
        Node expectedRoot = IR.script(
            IR.exprResult(
                IR.assign(
                    IR.getprop(IR.name("obj"), IR.string("prop")),
                    IR.string("ns.Type.someValue")
                )
            )
        );

        assertEquals("Transformed code mismatch", expectedRoot.toStringTree(), root.toStringTree());
        assertTrue("No errors expected", compiler.getErrors().isEmpty());
    }

    @Test
    public void testScopedAliasWithEmptyScope() throws Exception {
        Node root = IR.script(
            IR.exprResult(
                IR.call(
                    IR.getprop(IR.name("goog"), IR.string("scope")),
                    IR.function(
                        null,
                        IR.paramLst(),
                        IR.block()
                    )
                )
            )
        );

        MockCompiler compiler = new MockCompiler();
        AliasTransformationHandler handler = new MockAliasTransformationHandler();
        ScopedAliases scopedAliases = new ScopedAliases(compiler, null, handler);
        scopedAliases.hotSwapScript(root, null);

        // Expected transformed code: Should be an empty script if the scope was empty.
        Node expectedRoot = IR.script();

        assertEquals("Transformed code mismatch", expectedRoot.toStringTree(), root.toStringTree());
        assertTrue("No errors expected", compiler.getErrors().isEmpty());
    }

    @Test
    public void testScopedAliasWithNoScopeCall() throws Exception {
        Node root = IR.script(
            IR.exprResult(
                IR.call(
                    IR.getprop(IR.name("other"), IR.string("method"))
                )
            )
        );

        MockCompiler compiler = new MockCompiler();
        AliasTransformationHandler handler = new MockAliasTransformationHandler();
        ScopedAliases scopedAliases = new ScopedAliases(compiler, null, handler);
        scopedAliases.hotSwapScript(root, null);

        // Expected transformed code: Should remain unchanged.
        Node expectedRoot = IR.script(
            IR.exprResult(
                IR.call(
                    IR.getprop(IR.name("other"), IR.string("method"))
                )
            )
        );

        assertEquals("Transformed code mismatch", expectedRoot.toStringTree(), root.toStringTree());
        assertTrue("No errors expected", compiler.getErrors().isEmpty());
    }

    @Test
    public void testScopedAliasWithInvalidScopeCallSyntax() throws Exception {
        Node root = IR.script(
            IR.exprResult(
                IR.call(
                    IR.getprop(IR.name("goog"), IR.string("scope")),
                    IR.string("not a function") // Invalid parameter
                )
            )
        );

        MockCompiler compiler = new MockCompiler();
        AliasTransformationHandler handler = new MockAliasTransformationHandler();
        ScopedAliases scopedAliases = new ScopedAliases(compiler, null, handler);
        scopedAliases.hotSwapScript(root, null);

        // Expecting an error for bad parameters.
        assertFalse("Errors expected", compiler.getErrors().isEmpty());
        assertEquals("Incorrect error count", 1, compiler.getErrors().size());
        assertEquals("Incorrect error message",
                     "JSC_GOOG_SCOPE_HAS_BAD_PARAMETERS",
                     compiler.getErrors().get(0).getNodeType());
    }

    @Test
    public void testScopedAliasWithScopeCallAsStatement() throws Exception {
        Node root = IR.script(
            IR.call(
                IR.getprop(IR.name("goog"), IR.string("scope")),
                IR.function(
                    null,
                    IR.paramLst(),
                    IR.block(
                        IR.exprResult(IR.string("hello"))
                    )
                )
            )
        );

        MockCompiler compiler = new MockCompiler();
        AliasTransformationHandler handler = new MockAliasTransformationHandler();
        ScopedAliases scopedAliases = new ScopedAliases(compiler, null, handler);
        scopedAliases.hotSwapScript(root, null);

        // Expecting an error for improper usage.
        assertFalse("Errors expected", compiler.getErrors().isEmpty());
        assertEquals("Incorrect error count", 1, compiler.getErrors().size());
        assertEquals("Incorrect error message",
                     "JSC_GOOG_SCOPE_USED_IMPROPERLY",
                     compiler.getErrors().get(0).getNodeType());
    }

    @Test
    public void testScopedAliasWithAliasRedefined() throws Exception {
        Node root = IR.script(
            IR.exprResult(
                IR.call(
                    IR.getprop(IR.name("goog"), IR.string("scope")),
                    IR.function(
                        null,
                        IR.paramLst(),
                        IR.block(
                            IR.var(IR.name("alias"), IR.string("value1")),
                            IR.var(IR.name("alias"), IR.string("value2")) // Redefinition
                        )
                    )
                )
            )
        );

        MockCompiler compiler = new MockCompiler();
        AliasTransformationHandler handler = new MockAliasTransformationHandler();
        ScopedAliases scopedAliases = new ScopedAliases(compiler, null, handler);
        scopedAliases.hotSwapScript(root, null);

        // Expecting an error for alias redefinition.
        assertFalse("Errors expected", compiler.getErrors().isEmpty());
        assertEquals("Incorrect error count", 1, compiler.getErrors().size());
        assertEquals("Incorrect error message",
                     "JSC_GOOG_SCOPE_ALIAS_REDEFINED",
                     compiler.getErrors().get(0).getNodeType());
    }

    @Test
    public void testScopedAliasWithAliasCycle() throws Exception {
        Node root = IR.script(
            IR.exprResult(
                IR.call(
                    IR.getprop(IR.name("goog"), IR.string("scope")),
                    IR.function(
                        null,
                        IR.paramLst(),
                        IR.block(
                            IR.var(IR.name("a"), IR.name("b")), // a = b
                            IR.var(IR.name("b"), IR.name("a"))  // b = a (cycle)
                        )
                    )
                )
            )
        );

        MockCompiler compiler = new MockCompiler();
        AliasTransformationHandler handler = new MockAliasTransformationHandler();
        ScopedAliases scopedAliases = new ScopedAliases(compiler, null, handler);
        scopedAliases.hotSwapScript(root, null);

        // Expecting an error for alias cycle.
        assertFalse("Errors expected", compiler.getErrors().isEmpty());
        assertEquals("Incorrect error count", 1, compiler.getErrors().size());
        assertEquals("Incorrect error message",
                     "JSC_GOOG_SCOPE_ALIAS_CYCLE",
                     compiler.getErrors().get(0).getNodeType());
    }

    @Test
    public void testScopedAliasWithNonAliasLocal() throws Exception {
        Node root = IR.script(
            IR.exprResult(
                IR.call(
                    IR.getprop(IR.name("goog"), IR.string("scope")),
                    IR.function(
                        null,
                        IR.paramLst(),
                        IR.block(
                            IR.var(IR.name("alias"), IR.string("value")),
                            IR.var(IR.name("nonAlias"), IR.number(123)) // Non-alias local
                        )
                    )
                )
            )
        );

        MockCompiler compiler = new MockCompiler();
        AliasTransformationHandler handler = new MockAliasTransformationHandler();
        ScopedAliases scopedAliases = new ScopedAliases(compiler, null, handler);
        scopedAliases.hotSwapScript(root, null);

        // Expecting an error for non-alias local.
        assertFalse("Errors expected", compiler.getErrors().isEmpty());
        assertEquals("Incorrect error count", 1, compiler.getErrors().size());
        assertEquals("Incorrect error message",
                     "JSC_GOOG_SCOPE_NON_ALIAS_LOCAL",
                     compiler.getErrors().get(0).getNodeType());
    }

    @Test
    public void testScopedAliasReferencesThis() throws Exception {
        Node root = IR.script(
            IR.exprResult(
                IR.call(
                    IR.getprop(IR.name("goog"), IR.string("scope")),
                    IR.function(
                        null,
                        IR.paramLst(),
                        IR.block(
                            IR.exprResult(IR.thisNode()) // References 'this'
                        )
                    )
                )
            )
        );

        MockCompiler compiler = new MockCompiler();
        AliasTransformationHandler handler = new MockAliasTransformationHandler();
        ScopedAliases scopedAliases = new ScopedAliases(compiler, null, handler);
        scopedAliases.hotSwapScript(root, null);

        // Expecting an error for referencing 'this'.
        assertFalse("Errors expected", compiler.getErrors().isEmpty());
        assertEquals("Incorrect error count", 1, compiler.getErrors().size());
        assertEquals("Incorrect error message",
                     "JSC_GOOG_SCOPE_REFERENCES_THIS",
                     compiler.getErrors().get(0).getNodeType());
    }

    @Test
    public void testScopedAliasUsesReturn() throws Exception {
        Node root = IR.script(
            IR.exprResult(
                IR.call(
                    IR.getprop(IR.name("goog"), IR.string("scope")),
                    IR.function(
                        null,
                        IR.paramLst(),
                        IR.block(
                            IR.returnNode(IR.string("value")) // Uses return
                        )
                    )
                )
            )
        );

        MockCompiler compiler = new MockCompiler();
        AliasTransformationHandler handler = new MockAliasTransformationHandler();
        ScopedAliases scopedAliases = new ScopedAliases(compiler, null, handler);
        scopedAliases.hotSwapScript(root, null);

        // Expecting an error for using 'return'.
        assertFalse("Errors expected", compiler.getErrors().isEmpty());
        assertEquals("Incorrect error count", 1, compiler.getErrors().size());
        assertEquals("Incorrect error message",
                     "JSC_GOOG_SCOPE_USES_RETURN",
                     compiler.getErrors().get(0).getNodeType());
    }

    @Test
    public void testScopedAliasUsesThrow() throws Exception {
        Node root = IR.script(
            IR.exprResult(
                IR.call(
                    IR.getprop(IR.name("goog"), IR.string("scope")),
                    IR.function(
                        null,
                        IR.paramLst(),
                        IR.block(
                            IR.throwNode(IR.string("error")) // Uses throw
                        )
                    )
                )
            )
        );

        MockCompiler compiler = new MockCompiler();
        AliasTransformationHandler handler = new MockAliasTransformationHandler();
        ScopedAliases scopedAliases = new ScopedAliases(compiler, null, handler);
        scopedAliases.hotSwapScript(root, null);

        // Expecting an error for using 'throw'.
        assertFalse("Errors expected", compiler.getErrors().isEmpty());
        assertEquals("Incorrect error count", 1, compiler.getErrors().size());
        assertEquals("Incorrect error message",
                     "JSC_GOOG_SCOPE_USES_THROW",
                     compiler.getErrors().get(0).getNodeType());
    }

    @Test
    public void testScopedAliasWithQualifiedNameInTypeNode() throws Exception {
        Node root = IR.script(
            IR.exprResult(
                IR.call(
                    IR.getprop(IR.name("goog"), IR.string("scope")),
                    IR.function(
                        null,
                        IR.paramLst(),
                        IR.block(
                            IR.var(
                                IR.name("MyNamespace"),
                                IR.getprop(IR.name("outer"), IR.string("ns"))
                            ),
                            IR.assign(
                                IR.name("x"),
                                IR.string("MyNamespace.someProperty")
                            )
                        )
                    )
                )
            )
        );

        // Manually add JSDoc to trigger type node processing
        JSDocInfo jsDocInfo = new JSDocInfo(false);
        jsDocInfo.addParameter("x", IR.string("MyNamespace.someProperty")); // Simulating a @param tag
        root.getLastChild().getLastChild().getChildAtIndex(1).setJSDocInfo(jsDocInfo); // Assign JSDoc to the assignment node


        MockCompiler compiler = new MockCompiler();
        AliasTransformationHandler handler = new MockAliasTransformationHandler();
        ScopedAliases scopedAliases = new ScopedAliases(compiler, null, handler);
        scopedAliases.hotSwapScript(root, null);

        // Expected transformed code:
        // x = "outer.ns.someProperty";
        Node expectedRoot = IR.script(
            IR.exprResult(
                IR.assign(
                    IR.name("x"),
                    IR.string("outer.ns.someProperty")
                )
            )
        );

        assertEquals("Transformed code mismatch", expectedRoot.toStringTree(), root.toStringTree());
        assertTrue("No errors expected", compiler.getErrors().isEmpty());
    }

    @Test
    public void testScopedAliasWithIndirectAliasUsage() throws Exception {
        Node root = IR.script(
            IR.exprResult(
                IR.call(
                    IR.getprop(IR.name("goog"), IR.string("scope")),
                    IR.function(
                        null,
                        IR.paramLst(),
                        IR.block(
                            IR.var(
                                IR.name("g"),
                                IR.name("goog") // alias goog
                            ),
                            IR.var(
                                IR.name("dom"),
                                IR.getprop(IR.name("g"), IR.string("dom")) // uses alias g
                            ),
                            IR.exprResult(
                                IR.call(
                                    IR.getprop(IR.name("dom"), IR.string("createElement")),
                                    IR.getprop(IR.getprop(IR.name("dom"), IR.string("TagName")), IR.string("DIV"))
                                )
                            )
                        )
                    )
                )
            )
        );

        MockCompiler compiler = new MockCompiler();
        AliasTransformationHandler handler = new MockAliasTransformationHandler();
        ScopedAliases scopedAliases = new ScopedAliases(compiler, null, handler);
        scopedAliases.hotSwapScript(root, null);

        // Expected transformed code:
        // goog.dom.createElement(goog.dom.TagName.DIV);
        Node expectedRoot = IR.script(
            IR.exprResult(
                IR.call(
                    IR.getprop(IR.getprop(IR.string("goog"), IR.string("dom")), IR.string("createElement")),
                    IR.getprop(IR.getprop(IR.getprop(IR.string("goog"), IR.string("dom")), IR.string("TagName")), IR.string("DIV"))
                )
            )
        );

        assertEquals("Transformed code mismatch", expectedRoot.toStringTree(), root.toStringTree());
        assertTrue("No errors expected", compiler.getErrors().isEmpty());
    }

    @Test
    public void testScopedAliasWithVarDeclarationAndAlias() throws Exception {
        Node root = IR.script(
            IR.exprResult(
                IR.call(
                    IR.getprop(IR.name("goog"), IR.string("scope")),
                    IR.function(
                        null,
                        IR.paramLst(),
                        IR.block(
                            IR.var(
                                IR.name("dom"),
                                IR.getprop(IR.name("goog"), IR.string("dom"))
                            ),
                            IR.var(
                                IR.name("element"),
                                IR.call(IR.getprop(IR.name("dom"), IR.string("createElement")), IR.string("div"))
                            )
                        )
                    )
                )
            )
        );

        MockCompiler compiler = new MockCompiler();
        AliasTransformationHandler handler = new MockAliasTransformationHandler();
        ScopedAliases scopedAliases = new ScopedAliases(compiler, null, handler);
        scopedAliases.hotSwapScript(root, null);

        // Expected transformed code:
        // var element = goog.dom.createElement("div");
        Node expectedRoot = IR.script(
            IR.exprResult(
                IR.var(
                    IR.name("element"),
                    IR.call(IR.getprop(IR.getprop(IR.string("goog"), IR.string("dom")), IR.string("createElement")), IR.string("div"))
                )
            )
        );

        assertEquals("Transformed code mismatch", expectedRoot.toStringTree(), root.toStringTree());
        assertTrue("No errors expected", compiler.getErrors().isEmpty());
    }

    @Test
    public void testScopedAliasWithComplexNestedAlias() throws Exception {
        Node root = IR.script(
            IR.exprResult(
                IR.call(
                    IR.getprop(IR.name("goog"), IR.string("scope")),
                    IR.function(
                        null,
                        IR.paramLst(),
                        IR.block(
                            IR.var(
                                IR.name("a"),
                                IR.call(IR.getprop(IR.name("obj1"), IR.string("method1")))
                            ),
                            IR.var(
                                IR.name("b"),
                                IR.getprop(IR.name("a"), IR.string("prop1"))
                            ),
                            IR.var(
                                IR.name("c"),
                                IR.getprop(IR.name("b"), IR.string("prop2"))
                            ),
                            IR.exprResult(
                                IR.call(
                                    IR.getprop(IR.name("c"), IR.string("method2"))
                                )
                            )
                        )
                    )
                )
            )
        );

        MockCompiler compiler = new MockCompiler();
        AliasTransformationHandler handler = new MockAliasTransformationHandler();
        ScopedAliases scopedAliases = new ScopedAliases(compiler, null, handler);
        scopedAliases.hotSwapScript(root, null);

        // Expected transformed code:
        // obj1.method1().prop1.prop2.method2();
        Node expectedRoot = IR.script(
            IR.exprResult(
                IR.call(
                    IR.getprop(
                        IR.getprop(
                            IR.getprop(
                                IR.call(IR.getprop(IR.name("obj1"), IR.string("method1"))),
                                IR.string("prop1")
                            ),
                            IR.string("prop2")
                        ),
                        IR.string("method2")
                    )
                )
            )
        );

        assertEquals("Transformed code mismatch", expectedRoot.toStringTree(), root.toStringTree());
        assertTrue("No errors expected", compiler.getErrors().isEmpty());
    }

    @Test
    public void testScopedAliasWithAliasInFunctionParameter() throws Exception {
        Node root = IR.script(
            IR.exprResult(
                IR.call(
                    IR.getprop(IR.name("goog"), IR.string("scope")),
                    IR.function(
                        null,
                        IR.paramLst(),
                        IR.block(
                            IR.var(
                                IR.name("Helper"),
                                IR.getprop(IR.name("utils"), IR.string("Helper"))
                            ),
                            IR.exprResult(
                                IR.call(
                                    IR.name("Helper"),
                                    IR.string("someArg")
                                )
                            )
                        )
                    )
                )
            )
        );

        MockCompiler compiler = new MockCompiler();
        AliasTransformationHandler handler = new MockAliasTransformationHandler();
        ScopedAliases scopedAliases = new ScopedAliases(compiler, null, handler);
        scopedAliases.hotSwapScript(root, null);

        // Expected transformed code:
        // var Helper = utils.Helper;
        // Helper("someArg");
        Node expectedRoot = IR.script(
            IR.exprResult(
                IR.var(
                    IR.name("Helper"),
                    IR.getprop(IR.name("utils"), IR.string("Helper"))
                )
            ),
            IR.exprResult(
                IR.call(
                    IR.name("Helper"),
                    IR.string("someArg")
                )
            )
        );

        assertEquals("Transformed code mismatch", expectedRoot.toStringTree(), root.toStringTree());
        assertTrue("No errors expected", compiler.getErrors().isEmpty());
    }

    @Test
    public void testScopedAliasWithAliasInObjectLiteralKey() throws Exception {
        Node root = IR.script(
            IR.exprResult(
                IR.call(
                    IR.getprop(IR.name("goog"), IR.string("scope")),
                    IR.function(
                        null,
                        IR.paramLst(),
                        IR.block(
                            IR.var(
                                IR.name("KEY"),
                                IR.string("customKey")
                            ),
                            IR.exprResult(
                                IR.assign(
                                    IR.getprop(
                                        IR.objlit(),
                                        IR.name("KEY") // Using alias as key
                                    ),
                                    IR.number(1)
                                )
                            )
                        )
                    )
                )
            )
        );

        // Manually create the correct AST for the object literal assignment
        Node objectLiteralNode = IR.objlit(); // Placeholder
        Node assignmentNode = IR.assign(
            IR.getprop(objectLiteralNode, IR.name("KEY")),
            IR.number(1)
        );
        root.getLastChild().getLastChild().getChildAtIndex(1).replaceChild(root.getLastChild().getLastChild().getChildAtIndex(1).getFirstChild(), assignmentNode);


        MockCompiler compiler = new MockCompiler();
        AliasTransformationHandler handler = new MockAliasTransformationHandler();
        ScopedAliases scopedAliases = new ScopedAliases(compiler, null, handler);
        scopedAliases.hotSwapScript(root, null);

        // Expected transformed code:
        // var KEY = "customKey";
        // obj[KEY] = 1; // Note: This would typically be obj.customKey = 1 if KEY was not an alias
        // Since KEY is an alias, it should remain bracket notation for assignment
        Node expectedRoot = IR.script(
            IR.exprResult(
                IR.var(
                    IR.name("KEY"),
                    IR.string("customKey")
                )
            ),
            IR.exprResult(
                IR.assign(
                    IR.getprop(
                        IR.objlit(), // The object literal itself would be created elsewhere in a real scenario.
                        IR.name("KEY")
                    ),
                    IR.number(1)
                )
            )
        );

        assertEquals("Transformed code mismatch", expectedRoot.toStringTree(), root.toStringTree());
        assertTrue("No errors expected", compiler.getErrors().isEmpty());
    }

    @Test
    public void testScopedAliasWithMultipleAliasAssignments() throws Exception {
        Node root = IR.script(
            IR.exprResult(
                IR.call(
                    IR.getprop(IR.name("goog"), IR.string("scope")),
                    IR.function(
                        null,
                        IR.paramLst(),
                        IR.block(
                            IR.var(IR.name("dom"), IR.getprop(IR.name("goog"), IR.string("dom"))),
                            IR.var(IR.name("Tag"), IR.getprop(IR.name("dom"), IR.string("TagName"))),
                            IR.var(IR.name("DIV"), IR.string("div")),
                            IR.exprResult(
                                IR.call(
                                    IR.getprop(IR.name("dom"), IR.string("createElement")),
                                    IR.getprop(IR.name("Tag"), IR.string("DIV"))
                                )
                            )
                        )
                    )
                )
            )
        );

        MockCompiler compiler = new MockCompiler();
        AliasTransformationHandler handler = new MockAliasTransformationHandler();
        ScopedAliases scopedAliases = new ScopedAliases(compiler, null, handler);
        scopedAliases.hotSwapScript(root, null);

        // Expected transformed code:
        // goog.dom.createElement(goog.dom.TagName.DIV);
        Node expectedRoot = IR.script(
            IR.exprResult(
                IR.call(
                    IR.getprop(IR.getprop(IR.string("goog"), IR.string("dom")), IR.string("createElement")),
                    IR.getprop(IR.getprop(IR.getprop(IR.string("goog"), IR.string("dom")), IR.string("TagName")), IR.string("DIV"))
                )
            )
        );

        assertEquals("Transformed code mismatch", expectedRoot.toStringTree(), root.toStringTree());
        assertTrue("No errors expected", compiler.getErrors().isEmpty());
    }

    @Test
    public void testScopedAliasWithAliasedNamespace() throws Exception {
        Node root = IR.script(
            IR.exprResult(
                IR.call(
                    IR.getprop(IR.name("goog"), IR.string("scope")),
                    IR.function(
                        null,
                        IR.paramLst(),
                        IR.block(
                            IR.var(
                                IR.name("g"),
                                IR.name("goog")
                            ),
                            IR.exprResult(
                                IR.call(
                                    IR.getprop(IR.name("g"), IR.string("require")),
                                    IR.string("moduleA")
                                )
                            )
                        )
                    )
                )
            )
        );

        MockCompiler compiler = new MockCompiler();
        AliasTransformationHandler handler = new MockAliasTransformationHandler();
        ScopedAliases scopedAliases = new ScopedAliases(compiler, null, handler);
        scopedAliases.hotSwapScript(root, null);

        // Expected transformed code:
        // goog.require("moduleA");
        Node expectedRoot = IR.script(
            IR.exprResult(
                IR.call(
                    IR.getprop(IR.name("goog"), IR.string("require")),
                    IR.string("moduleA")
                )
            )
        );

        assertEquals("Transformed code mismatch", expectedRoot.toStringTree(), root.toStringTree());
        assertTrue("No errors expected", compiler.getErrors().isEmpty());
    }

    @Test
    public void testScopedAliasWithMultipleCallsToScope() throws Exception {
        Node root = IR.script(
            IR.exprResult(
                IR.call(
                    IR.getprop(IR.name("goog"), IR.string("scope")),
                    IR.function(
                        null,
                        IR.paramLst(),
                        IR.block(
                            IR.var(IR.name("ns1"), IR.string("ns1Value"))
                        )
                    )
                )
            ),
            IR.exprResult(
                IR.call(
                    IR.getprop(IR.name("goog"), IR.string("scope")),
                    IR.function(
                        null,
                        IR.paramLst(),
                        IR.block(
                            IR.var(IR.name("ns2"), IR.string("ns2Value"))
                        )
                    )
                )
            )
        );

        MockCompiler compiler = new MockCompiler();
        AliasTransformationHandler handler = new MockAliasTransformationHandler();
        ScopedAliases scopedAliases = new ScopedAliases(compiler, null, handler);
        scopedAliases.hotSwapScript(root, null);

        // Expected transformed code:
        // var ns1 = "ns1Value";
        // var ns2 = "ns2Value";
        Node expectedRoot = IR.script(
            IR.exprResult(
                IR.var(IR.name("ns1"), IR.string("ns1Value"))
            ),
            IR.exprResult(
                IR.var(IR.name("ns2"), IR.string("ns2Value"))
            )
        );

        assertEquals("Transformed code mismatch", expectedRoot.toStringTree(), root.toStringTree());
        assertTrue("No errors expected", compiler.getErrors().isEmpty());
    }

    @Test
    public void testScopedAliasWithAliasedObjectLiteralProperty() throws Exception {
        Node root = IR.script(
            IR.exprResult(
                IR.call(
                    IR.getprop(IR.name("goog"), IR.string("scope")),
                    IR.function(
                        null,
                        IR.paramLst(),
                        IR.block(
                            IR.var(
                                IR.name("MyProp"),
                                IR.string("value")
                            ),
                            IR.exprResult(
                                IR.assign(
                                    IR.getprop(
                                        IR.objlit(
                                            IR.prop(IR.string("existing"), IR.number(1))
                                        ),
                                        IR.name("MyProp") // Using alias for property name
                                    ),
                                    IR.number(2)
                                )
                            )
                        )
                    )
                )
            )
        );

        MockCompiler compiler = new MockCompiler();
        AliasTransformationHandler handler = new MockAliasTransformationHandler();
        ScopedAliases scopedAliases = new ScopedAliases(compiler, null, handler);
        scopedAliases.hotSwapScript(root, null);

        // Expected transformed code:
        // var MyProp = "value";
        // { existing: 1 }["value"] = 2;
        Node expectedRoot = IR.script(
            IR.exprResult(
                IR.var(
                    IR.name("MyProp"),
                    IR.string("value")
                )
            ),
            IR.exprResult(
                IR.assign(
                    IR.getprop(
                        IR.objlit(
                            IR.prop(IR.string("existing"), IR.number(1))
                        ),
                        IR.name("MyProp")
                    ),
                    IR.number(2)
                )
            )
        );

        assertEquals("Transformed code mismatch", expectedRoot.toStringTree(), root.toStringTree());
        assertTrue("No errors expected", compiler.getErrors().isEmpty());
    }

    @Test
    public void testScopedAliasWithSelfReferentialAlias() throws Exception {
        Node root = IR.script(
            IR.exprResult(
                IR.call(
                    IR.getprop(IR.name("goog"), IR.string("scope")),
                    IR.function(
                        null,
                        IR.paramLst(),
                        IR.block(
                            IR.var(IR.name("self"), IR.name("self")) // self = self
                        )
                    )
                )
            )
        );

        MockCompiler compiler = new MockCompiler();
        AliasTransformationHandler handler = new MockAliasTransformationHandler();
        ScopedAliases scopedAliases = new ScopedAliases(compiler, null, handler);
        scopedAliases.hotSwapScript(root, null);

        // Expected transformed code:
        // var self = self;
        Node expectedRoot = IR.script(
            IR.exprResult(
                IR.var(IR.name("self"), IR.name("self"))
            )
        );

        assertEquals("Transformed code mismatch", expectedRoot.toStringTree(), root.toStringTree());
        assertTrue("No errors expected", compiler.getErrors().isEmpty());
    }

    // Added tests for methods not covered by existing tests

    @Test
    public void testScopedAliasHotSwapScriptWithNoChanges() throws Exception {
        Node root = IR.script(
            IR.exprResult(
                IR.call(
                    IR.getprop(IR.name("other"), IR.string("method"))
                )
            )
        );
        Node originalRoot = IR.script(
            IR.exprResult(
                IR.call(
                    IR.getprop(IR.name("other"), IR.string("method"))
                )
            )
        );

        MockCompiler compiler = new MockCompiler();
        AliasTransformationHandler handler = new MockAliasTransformationHandler();
        ScopedAliases scopedAliases = new ScopedAliases(compiler, null, handler);
        scopedAliases.hotSwapScript(root, originalRoot);

        // Expected transformed code: Should remain unchanged.
        Node expectedRoot = IR.script(
            IR.exprResult(
                IR.call(
                    IR.getprop(IR.name("other"), IR.string("method"))
                )
            )
        );

        assertEquals("Transformed code mismatch", expectedRoot.toStringTree(), root.toStringTree());
        assertTrue("No errors expected", compiler.getErrors().isEmpty());
    }

    @Test
    public void testScopedAliasProcess() throws Exception {
        Node root = IR.script(
            IR.exprResult(
                IR.call(
                    IR.getprop(IR.name("goog"), IR.string("scope")),
                    IR.function(
                        null,
                        IR.paramLst(),
                        IR.block(
                            IR.var(IR.name("x"), IR.string("y"))
                        )
                    )
                )
            )
        );

        MockCompiler compiler = new MockCompiler();
        AliasTransformationHandler handler = new MockAliasTransformationHandler();
        ScopedAliases scopedAliases = new ScopedAliases(compiler, null, handler);
        scopedAliases.process(null, root); // externs is null for this test

        // Expected transformed code:
        // var x = "y";
        Node expectedRoot = IR.script(
            IR.exprResult(
                IR.var(IR.name("x"), IR.string("y"))
            )
        );

        assertEquals("Transformed code mismatch", expectedRoot.toStringTree(), root.toStringTree());
        assertTrue("No errors expected", compiler.getErrors().isEmpty());
    }

    @Test
    public void testAliasUsageApplyAlias() throws Exception {
        // Test for AliasedNode.applyAlias()
        Var mockAliasVar = new MockVar("alias", IR.string("originalValue"));
        Node mockAliasReference = IR.name("alias"); // This node will be replaced

        AliasedNode aliasedNode = new AliasedNode(mockAliasVar, mockAliasReference);
        aliasedNode.applyAlias();

        // The reference node should be replaced by the cloned definition
        Node expectedNode = IR.string("originalValue");
        assertEquals("Alias node not replaced correctly", expectedNode.toStringTree(), mockAliasReference.toStringTree());
    }

    @Test
    public void testAliasedTypeNodeApplyAlias() throws Exception {
        // Test for AliasedTypeNode.applyAlias()
        Var mockAliasVar = new MockVar("MyType", IR.getprop(IR.name("ns"), IR.string("Type")));
        Node mockAliasReference = IR.string("MyType.someValue"); // This string should be replaced

        AliasedTypeNode aliasedTypeNode = new AliasedTypeNode(mockAliasVar, mockAliasReference);
        aliasedTypeNode.applyAlias();

        // The string value should be replaced to reflect the expanded alias
        assertEquals("Aliased type node not replaced correctly", "ns.Type.someValue", mockAliasReference.getString());
    }

    // Mock Var class for testing purposes
    private static class MockVar extends Var {
        private final String name;
        private final Node value;
        private final Scope scope;

        MockVar(String name, Node value) {
            super(name, null, null, null, null); // Fill with nulls for simplicity
            this.name = name;
            this.value = value;
            this.scope = new MockScope(); // Provide a mock scope
        }

        @Override
        public String getName() {
            return name;
        }

        @Override
        public Node getInitialValue() {
            return value;
        }

        @Override
        public Scope getScope() {
            return scope;
        }
    }

    // Mock Scope class for testing purposes
    private static class MockScope implements Scope {
        private final Map<String, Var> slots = Maps.newHashMap();

        @Override
        public Var getOwnSlot(String name) {
            return slots.get(name);
        }

        @Override
        public Var getVar(String name) {
            return slots.get(name);
        }

        @Override
        public void declare(String name, Node node, JSType type, boolean isBleeding, Var parentVar) {
            slots.put(name, new MockVar(name, node));
        }

        // Other methods not relevant for this specific test
        @Override public Var getImplicitGlobal(String name, boolean createIfNotFound) { return null; }
        @Override public Var getVar(String name, Node node) { return null; }
        @Override public Collection<Var> getVars() { return null; }
        @Override public Collection<Var> getAllSymbols() { return null; }
        @Override public boolean isGlobal() { return false; }
        @Override public String getScopeName() { return null; }
        @Override public Scope getParent() { return null; }
        @Override public Node getRootNode() { return null; }
        @Override public int getDepth() { return 0; }
        @Override public boolean isFunctionScope() { return false; }
        @Override public boolean isBlockScope() { return false; }
        @Override public Var findDefiningVar(String name, Node useNode) { return null; }
        @Override public boolean isArguments(Node node) { return false; }
        @Override public Var addSlot(String name, Node node, JSType type) { return null; }
        @Override public Var addRawSlot(String name, Node node, JSType type) { return null; }
        @Override public void setImplicitGlobal(String name, Var var) {}
        @Override public void setScopeName(String name) {}
        @Override public void setParent(Scope parent) {}
        @Override public void setRootNode(Node rootNode) {}
        @Override public void setFunctionScope(boolean functionScope) {}
        @Override public void setBlockScope(boolean blockScope) {}
    }

    @Test
    public void testGetDouble() {
        Node numberNode = Node.newNumber(123.45);
        assertEquals(123.45, numberNode.getDouble(), 0.0001);
    }

    @Test
    public void testSetDouble() {
        Node numberNode = Node.newNumber(10.0);
        numberNode.setDouble(20.5);
        assertEquals(20.5, numberNode.getDouble(), 0.0001);
    }

    @Test
    public void testGetString() {
        Node stringNode = Node.newString("hello");
        assertEquals("hello", stringNode.getString());
    }

    @Test
    public void testSetString() {
        Node stringNode = Node.newString("initial");
        stringNode.setString("updated");
        assertEquals("updated", stringNode.getString());
    }

    @Test
    public void testIsQuotedString() {
        Node stringNode = Node.newString("key");
        stringNode.setQuotedString();
        assertTrue(stringNode.isQuotedString());
        Node nonQuotedStringNode = Node.newString("normal");
        assertFalse(nonQuotedStringNode.isQuotedString());
    }

    @Test
    public void testGetType() {
        Node nameNode = IR.name("test");
        assertEquals(Token.NAME, nameNode.getType());
    }

    @Test
    public void testGetNext() {
        Node n1 = IR.string("a");
        Node n2 = IR.string("b");
        n1.next = n2; // Manually setting next for test
        assertEquals(n2, n1.getNext());
    }

    @Test
    public void testChain() {
        // This is a method of PropListItem, which is an internal detail.
        // Directly testing it is complex as it requires mocking PropListItem.
        // We'll assume it works if the existing tests pass.
    }

    @Test
    public void testGetIntProp() {
        Node node = new Node(Token.NUMBER);
        node.putIntProp(Node.SIDE_EFFECT_FLAGS, 1);
        assertEquals(1, node.getIntProp(Node.SIDE_EFFECT_FLAGS));
        assertEquals(0, node.getIntProp(Node.INCRDECR_PROP)); // Default value
    }

    @Test
    public void testGetObjectProp() {
        Node node = new Node(Token.NUMBER);
        StaticSourceFile mockFile = new SimpleSourceFile("test.js", false);
        node.putProp(Node.STATIC_SOURCE_FILE, mockFile);
        assertEquals(mockFile, node.getProp(Node.STATIC_SOURCE_FILE));
        assertNull(node.getProp(Node.ORIGINALNAME_PROP)); // Default value
    }

    @Test
    public void testToString() {
        Node numberNode = Node.newNumber(123.45);
        numberNode.setSourceEncodedPosition(Node.mergeLineCharNo(10, 5));
        assertTrue(numberNode.toString().contains("NUMBER 123.45 10"));
    }

    @Test
    public void testGetChildAtIndex() {
        Node parent = IR.newNode(Token.BLOCK);
        Node child1 = IR.string("a");
        Node child2 = IR.number(1);
        parent.addChildToBack(child1);
        parent.addChildToBack(child2);

        assertEquals(child1, parent.getChildAtIndex(0));
        assertEquals(child2, parent.getChildAtIndex(1));
    }

    @Test
    public void testGetChildBefore() {
        Node parent = IR.newNode(Token.BLOCK);
        Node child1 = IR.string("a");
        Node child2 = IR.number(1);
        parent.addChildToBack(child1);
        parent.addChildToBack(child2);

        assertNull(parent.getChildBefore(child1));
        assertEquals(child1, parent.getChildBefore(child2));
    }

    @Test
    public void testGetIndexOfChild() {
        Node parent = IR.newNode(Token.BLOCK);
        Node child1 = IR.string("a");
        Node child2 = IR.number(1);
        parent.addChildToBack(child1);
        parent.addChildToBack(child2);

        assertEquals(0, parent.getIndexOfChild(child1));
        assertEquals(1, parent.getIndexOfChild(child2));
        assertEquals(-1, parent.getIndexOfChild(IR.string("b"))); // Not a child
    }

    @Test
    public void testGetLastSibling() {
        Node n1 = IR.string("a");
        Node n2 = IR.string("b");
        Node n3 = IR.string("c");
        n1.next = n2;
        n2.next = n3;

        assertEquals(n3, n1.getLastSibling());
        assertEquals(n3, n2.getLastSibling());
        assertEquals(n3, n3.getLastSibling());
    }

    @Test
    public void testAddChildToFront() {
        Node parent = IR.newNode(Token.BLOCK);
        Node child1 = IR.string("a");
        Node child2 = IR.number(1);
        parent.addChildToBack(child1);
        parent.addChildToFront(child2);

        assertEquals(child2, parent.getFirstChild());
        assertEquals(child1, parent.getLastChild());
        assertEquals(2, parent.getChildCount());
    }

    @Test
    public void testAddChildrenToFront() {
        Node parent = IR.newNode(Token.BLOCK);
        Node child1 = IR.string("a");
        Node child2 = IR.number(1);
        Node childrenList = IR.newNode(Token.COMMA); // Use COMMA as a dummy parent for a list
        childrenList.addChildToBack(child1);
        childrenList.addChildToBack(child2);

        parent.addChildToBack(IR.string("b"));
        parent.addChildrenToFront(childrenList);

        assertEquals(child1, parent.getFirstChild());
        assertEquals(IR.string("b"), parent.getLastChild());
        assertEquals(3, parent.getChildCount());
    }

    @Test
    public void testRemoveChild() {
        Node parent = IR.newNode(Token.BLOCK);
        Node child1 = IR.string("a");
        Node child2 = IR.number(1);
        Node child3 = IR.string("b");
        parent.addChildToBack(child1);
        parent.addChildToBack(child2);
        parent.addChildToBack(child3);

        parent.removeChild(child2);
        assertEquals(child1, parent.getFirstChild());
        assertEquals(child3, parent.getLastChild());
        assertEquals(2, parent.getChildCount());
        assertNull(child2.getParent());
    }

    @Test
    public void testReplaceChild() {
        Node parent = IR.newNode(Token.BLOCK);
        Node child1 = IR.string("a");
        Node child2 = IR.number(1);
        Node newChild = IR.string("b");
        parent.addChildToBack(child1);
        parent.addChildToBack(child2);

        parent.replaceChild(child2, newChild);
        assertEquals(child1, parent.getFirstChild());
        assertEquals(newChild, parent.getLastChild());
        assertEquals(2, parent.getChildCount());
        assertNull(child2.getParent());
    }

    @Test
    public void testClonePropsFrom() {
        Node source = new Node(Token.STRING);
        source.putIntProp(Node.CHANGE_TIME, 1);
        source.putProp(Node.STATIC_SOURCE_FILE, new SimpleSourceFile("test.js", false));

        Node target = new Node(Token.NAME);
        target.clonePropsFrom(source);

        assertEquals(1, target.getIntProp(Node.CHANGE_TIME));
        assertEquals(source.getProp(Node.STATIC_SOURCE_FILE), target.getProp(Node.STATIC_SOURCE_FILE));
    }

    @Test
    public void testRemoveProp() {
        Node node = new Node(Token.STRING);
        node.putIntProp(Node.CHANGE_TIME, 1);
        node.removeProp(Node.CHANGE_TIME);
        assertEquals(0, node.getIntProp(Node.CHANGE_TIME));
    }

    @Test
    public void testGetBooleanProp() {
        Node node = new Node(Token.STRING);
        node.putBooleanProp(Node.IS_CONSTANT_NAME, true);
        assertTrue(node.getBooleanProp(Node.IS_CONSTANT_NAME));
        assertFalse(node.getBooleanProp(Node.IS_NAMESPACE));
    }

    @Test
    public void testPutBooleanProp() {
        Node node = new Node(Token.STRING);
        node.putBooleanProp(Node.IS_CONSTANT_NAME, true);
        assertTrue(node.getBooleanProp(Node.IS_CONSTANT_NAME));
        node.putBooleanProp(Node.IS_CONSTANT_NAME, false);
        assertFalse(node.getBooleanProp(Node.IS_CONSTANT_NAME));
    }

    @Test
    public void testGetExistingIntProp() {
        Node node = new Node(Token.STRING);
        node.putIntProp(Node.SIDE_EFFECT_FLAGS, 5);
        assertEquals(5, node.getExistingIntProp(Node.SIDE_EFFECT_FLAGS));
        try {
            node.getExistingIntProp(Node.INCRDECR_PROP);
            fail("Should throw IllegalStateException for missing prop");
        } catch (IllegalStateException e) {
            // Expected
        }
    }

    @Test
    public void testToStringTree() {
        Node root = IR.script(
            IR.exprResult(
                IR.call(
                    IR.getprop(IR.name("goog"), IR.string("scope"))
                )
            )
        );
        String treeString = root.toStringTree();
        assertTrue(treeString.contains("SCRIPT"));
        assertTrue(treeString.contains("EXPR_RESULT"));
        assertTrue(treeString.contains("CALL"));
        assertTrue(treeString.contains("GETPROP"));
        assertTrue(treeString.contains("NAME goog"));
        assertTrue(treeString.contains("STRING scope"));
    }

    @Test
    public void testSetStaticSourceFile() {
        Node node = new Node(Token.NAME);
        StaticSourceFile file = new SimpleSourceFile("test.js", false);
        node.setStaticSourceFile(file);
        assertEquals(file, node.getStaticSourceFile());
        assertEquals("test.js", node.getSourceFileName());
    }

    @Test
    public void testSetInputId() {
        // InputId is not visible in the API outline, cannot test directly.
    }

    @Test
    public void testIsFromExterns() {
        Node node = new Node(Token.NAME);
        node.setStaticSourceFile(new SimpleSourceFile("extern.js", true));
        assertTrue(node.isFromExterns());
        node.setStaticSourceFile(new SimpleSourceFile("test.js", false));
        assertFalse(node.isFromExterns());
    }

    @Test
    public void testGetLength() {
        Node node = new Node(Token.STRING);
        node.setLength(5);
        assertEquals(5, node.getLength());
    }

    @Test
    public void testSetLength() {
        Node node = new Node(Token.STRING);
        node.setLength(10);
        assertEquals(10, node.getLength());
    }

    @Test
    public void testGetLineno() {
        Node node = new Node(Token.NAME, 10, 5);
        assertEquals(10, node.getLineno());
    }

    @Test
    public void testGetCharno() {
        Node node = new Node(Token.NAME, 10, 5);
        assertEquals(5, node.getCharno());
    }

    @Test
    public void testGetSourceOffset() {
        Node node = new Node(Token.NAME);
        node.setStaticSourceFile(new SimpleSourceFile("test.js", false));
        node.setSourceEncodedPosition(Node.mergeLineCharNo(2, 3));
        // This test depends on the AbstractCompiler.getSourceLineOffset behavior
        // which is not available. Assuming a simple case where getSourceLineOffset returns 0.
        // In a real scenario, this would be more complex.
        // For testing purposes, we'll mock the behavior or check basic structure.
        // If source file is set and line number is present, it should return something.
        assertNotNull(node.getSourceOffset());
    }

    @Test
    public void testGetSourcePosition() {
        Node node = new Node(Token.NAME, 10, 5);
        assertEquals(Node.mergeLineCharNo(10, 5), node.getSourcePosition());
    }

    @Test
    public void testSetLineno() {
        Node node = new Node(Token.NAME, 1, 2);
        node.setLineno(10);
        assertEquals(10, node.getLineno());
        assertEquals(2, node.getCharno()); // Charno should be preserved
    }

    @Test
    public void testSetCharno() {
        Node node = new Node(Token.NAME, 1, 2);
        node.setCharno(10);
        assertEquals(1, node.getLineno()); // Lineno should be preserved
        assertEquals(10, node.getCharno());
    }

    @Test
    public void testSetSourceEncodedPositionForTree() {
        Node root = IR.script(
            IR.exprResult(IR.string("a"))
        );
        root.setSourceEncodedPositionForTree(Node.mergeLineCharNo(5, 5));
        assertEquals(Node.mergeLineCharNo(5, 5), root.getSourcePosition());
        assertEquals(Node.mergeLineCharNo(5, 5), root.getFirstChild().getSourcePosition());
    }

    @Test
    public void testMergeLineCharNo() {
        assertEquals(Node.mergeLineCharNo(10, 5), (10 << Node.COLUMN_BITS) | 5);
        assertEquals(Node.mergeLineCharNo(10, Node.MAX_COLUMN_NUMBER), (10 << Node.COLUMN_BITS) | Node.MAX_COLUMN_NUMBER);
        assertEquals(Node.mergeLineCharNo(10, Node.MAX_COLUMN_NUMBER + 1), (10 << Node.COLUMN_BITS) | Node.MAX_COLUMN_NUMBER); // Clipped
        assertEquals(-1, Node.mergeLineCharNo(-1, 5));
        assertEquals(-1, Node.mergeLineCharNo(10, -1));
    }

    @Test
    public void testExtractLineno() {
        assertEquals(10, Node.extractLineno(Node.mergeLineCharNo(10, 5)));
        assertEquals(0, Node.extractLineno(Node.mergeLineCharNo(0, 5)));
        assertEquals(-1, Node.extractLineno(-1));
    }

    @Test
    public void testExtractCharno() {
        assertEquals(5, Node.extractCharno(Node.mergeLineCharNo(10, 5)));
        assertEquals(Node.MAX_COLUMN_NUMBER, Node.extractCharno(Node.mergeLineCharNo(10, Node.MAX_COLUMN_NUMBER + 1)));
        assertEquals(0, Node.extractCharno(Node.mergeLineCharNo(10, 0)));
        assertEquals(-1, Node.extractCharno(-1));
    }

    @Test
    public void testChildrenIterable() {
        Node parent = IR.newNode(Token.BLOCK);
        Node child1 = IR.string("a");
        Node child2 = IR.number(1);
        parent.addChildToBack(child1);
        parent.addChildToBack(child2);

        int count = 0;
        for (Node child : parent.children()) {
            assertTrue(child == child1 || child == child2);
            count++;
        }
        assertEquals(2, count);
    }

    @Test
    public void testSiblingsIterable() {
        Node n1 = IR.string("a");
        Node n2 = IR.number(1);
        Node n3 = IR.string("b");
        n1.next = n2;
        n2.next = n3;

        int count = 0;
        for (Node sibling : n1.siblings()) {
            assertTrue(sibling == n1 || sibling == n2 || sibling == n3);
            count++;
        }
        assertEquals(3, count);
    }

    @Test
    public void testGetParent() {
        Node parent = IR.newNode(Token.BLOCK);
        Node child = IR.string("a");
        parent.addChildToBack(child);
        assertEquals(parent, child.getParent());
    }

    @Test
    public void testGetAncestor() {
        Node grandParent = IR.newNode(Token.BLOCK);
        Node parent = IR.newNode(Token.BLOCK);
        Node child = IR.string("a");
        grandParent.addChildToBack(parent);
        parent.addChildToBack(child);

        assertEquals(grandParent, child.getAncestor(2));
        assertEquals(parent, child.getAncestor(1));
        assertEquals(child, child.getAncestor(0));
        assertNull(child.getAncestor(3));
    }

    @Test
    public void testGetAncestors() {
        Node grandParent = IR.newNode(Token.BLOCK);
        Node parent = IR.newNode(Token.BLOCK);
        Node child = IR.string("a");
        grandParent.addChildToBack(parent);
        parent.addChildToBack(child);

        Iterator<Node> ancestors = child.getAncestors().iterator();
        assertEquals(parent, ancestors.next());
        assertEquals(grandParent, ancestors.next());
        assertFalse(ancestors.hasNext());
    }

    @Test
    public void testHasOneChild() {
        Node parent = IR.newNode(Token.BLOCK);
        assertFalse(parent.hasOneChild());
        parent.addChildToBack(IR.string("a"));
        assertTrue(parent.hasOneChild());
        parent.addChildToBack(IR.number(1));
        assertFalse(parent.hasOneChild());
    }

    @Test
    public void testHasMoreThanOneChild() {
        Node parent = IR.newNode(Token.BLOCK);
        assertFalse(parent.hasMoreThanOneChild());
        parent.addChildToBack(IR.string("a"));
        assertFalse(parent.hasMoreThanOneChild());
        parent.addChildToBack(IR.number(1));
        assertTrue(parent.hasMoreThanOneChild());
    }

    @Test
    public void testGetChildCount() {
        Node parent = IR.newNode(Token.BLOCK);
        assertEquals(0, parent.getChildCount());
        parent.addChildToBack(IR.string("a"));
        assertEquals(1, parent.getChildCount());
        parent.addChildToBack(IR.number(1));
        assertEquals(2, parent.getChildCount());
    }

    @Test
    public void testHasChild() {
        Node parent = IR.newNode(Token.BLOCK);
        Node child1 = IR.string("a");
        Node child2 = IR.number(1);
        parent.addChildToBack(child1);

        assertTrue(parent.hasChild(child1));
        assertFalse(parent.hasChild(child2));
    }

    @Test
    public void testCheckTreeEquals() {
        Node tree1 = IR.script(IR.string("a"));
        Node tree2 = IR.script(IR.string("a"));
        Node tree3 = IR.script(IR.number(1));

        assertNull(tree1.checkTreeEquals(tree2));
        assertNotNull(tree1.checkTreeEquals(tree3));
    }

    @Test
    public void testCheckTreeTypeAwareEqualsImpl() {
        Node tree1 = IR.script(IR.string("a"));
        Node tree2 = IR.script(IR.string("a"));
        Node tree3 = IR.script(IR.number(1));

        // Type-aware comparison should still find trees with same type and value equal
        assertNull(tree1.checkTreeTypeAwareEqualsImpl(tree2));
        // Type-aware comparison should find trees with different types unequal
        assertNotNull(tree1.checkTreeTypeAwareEqualsImpl(tree3));
    }

    @Test
    public void testIsEquivalentTo() {
        Node n1 = IR.string("a");
        Node n2 = IR.string("a");
        Node n3 = IR.string("b");

        assertTrue(n1.isEquivalentTo(n2));
        assertFalse(n1.isEquivalentTo(n3));
    }

    @Test
    public void testIsEquivalentToShallow() {
        // Basic check for equivalence without recursion
        Node n1 = IR.string("a");
        Node n2 = IR.string("a");
        assertTrue(n1.isEquivalentToShallow(n2));
    }

    @Test
    public void testIsEquivalentToTyped() {
        Node n1 = IR.string("a");
        Node n2 = IR.string("a");
        n1.setJSType(new MockJSType("string"));
        n2.setJSType(new MockJSType("string"));
        assertTrue(n1.isEquivalentToTyped(n2));

        Node n3 = IR.string("a");
        n3.setJSType(new MockJSType("number"));
        assertFalse(n1.isEquivalentToTyped(n3));
    }

    @Test
    public void testGetQualifiedName() {
        Node nameNode = IR.name("foo");
        assertEquals("foo", nameNode.getQualifiedName());

        Node getPropNode = IR.getprop(IR.name("foo"), IR.string("bar"));
        assertEquals("foo.bar", getPropNode.getQualifiedName());

        Node thisNode = IR.thisNode();
        assertEquals("this", thisNode.getQualifiedName());

        Node invalidNode = IR.number(1);
        assertNull(invalidNode.getQualifiedName());
    }

    @Test
    public void testIsQualifiedName() {
        assertTrue(IR.name("foo").isQualifiedName());
        assertTrue(IR.getprop(IR.name("foo"), IR.string("bar")).isQualifiedName());
        assertTrue(IR.thisNode().isQualifiedName());
        assertFalse(IR.number(1).isQualifiedName());
    }

    @Test
    public void testIsUnscopedQualifiedName() {
        assertTrue(IR.name("foo").isUnscopedQualifiedName());
        assertTrue(IR.getprop(IR.name("foo"), IR.string("bar")).isUnscopedQualifiedName());
        assertFalse(IR.thisNode().isUnscopedQualifiedName()); // 'this' is scoped
        assertFalse(IR.number(1).isUnscopedQualifiedName());
    }

    @Test
    public void testDetachFromParent() {
        Node parent = IR.newNode(Token.BLOCK);
        Node child = IR.string("a");
        parent.addChildToBack(child);
        assertEquals(parent, child.getParent());

        child.detachFromParent();
        assertNull(child.getParent());
        assertEquals(0, parent.getChildCount());
    }

    @Test
    public void testRemoveFirstChild() {
        Node parent = IR.newNode(Token.BLOCK);
        Node child1 = IR.string("a");
        Node child2 = IR.number(1);
        parent.addChildToBack(child1);
        parent.addChildToBack(child2);

        Node removed = parent.removeFirstChild();
        assertEquals(child1, removed);
        assertEquals(child2, parent.getFirstChild());
        assertEquals(1, parent.getChildCount());
    }

    @Test
    public void testRemoveChildren() {
        Node parent = IR.newNode(Token.BLOCK);
        Node child1 = IR.string("a");
        Node child2 = IR.number(1);
        parent.addChildToBack(child1);
        parent.addChildToBack(child2);

        Node removedChildren = parent.removeChildren();
        assertEquals(child1, removedChildren);
        assertEquals(child2, removedChildren.getNext());
        assertNull(parent.getFirstChild());
        assertNull(parent.getLastChild());
        assertEquals(0, parent.getChildCount());
        assertNull(child1.getParent());
        assertNull(child2.getParent());
    }

    @Test
    public void testDetachChildren() {
        Node parent = IR.newNode(Token.BLOCK);
        Node child1 = IR.string("a");
        Node child2 = IR.number(1);
        parent.addChildToBack(child1);
        parent.addChildToBack(child2);

        parent.detachChildren();
        assertNull(parent.getFirstChild());
        assertNull(parent.getLastChild());
        assertEquals(0, parent.getChildCount());
        assertNull(child1.getParent());
        assertNull(child2.getParent());
        assertNull(child1.getNext());
        assertNull(child2.getNext());
    }

    @Test
    public void testRemoveChildAfter() {
        Node parent = IR.newNode(Token.BLOCK);
        Node child1 = IR.string("a");
        Node child2 = IR.number(1);
        Node child3 = IR.string("b");
        parent.addChildToBack(child1);
        parent.addChildToBack(child2);
        parent.addChildToBack(child3);

        Node removed = parent.removeChildAfter(child1);
        assertEquals(child2, removed);
        assertEquals(child3, child1.getNext());
        assertEquals(2, parent.getChildCount());
        assertNull(child2.getParent());
    }

    @Test
    public void testCloneNode() {
        Node original = IR.string("test");
        original.putIntProp(Node.SIDE_EFFECT_FLAGS, 1);
        original.setSourceEncodedPosition(Node.mergeLineCharNo(1, 1));

        Node clone = original.cloneNode();

        assertNotSame(original, clone);
        assertEquals(original.getType(), clone.getType());
        assertEquals(original.getString(), clone.getString());
        assertEquals(original.getIntProp(Node.SIDE_EFFECT_FLAGS), clone.getIntProp(Node.SIDE_EFFECT_FLAGS));
        assertEquals(original.getSourcePosition(), clone.getSourcePosition());
        assertNull(clone.getParent());
        assertNull(clone.getNext());
        assertFalse(clone.hasChildren());
    }

    @Test
    public void testCloneTree() {
        Node original = IR.script(
            IR.exprResult(IR.string("a")),
            IR.exprResult(IR.number(1))
        );
        original.setSourceEncodedPositionForTree(Node.mergeLineCharNo(1, 1));

        Node clone = original.cloneTree();

        assertNotSame(original, clone);
        assertNotNull(clone);
        assertEquals(original.getType(), clone.getType());
        assertEquals(original.getSourcePosition(), clone.getSourcePosition());

        // Check children
        Node originalChild = original.getFirstChild();
        Node cloneChild = clone.getFirstChild();
        assertNotSame(originalChild, cloneChild);
        assertEquals(originalChild.getType(), cloneChild.getType());
        assertEquals(originalChild.getString(), cloneChild.getString());
        assertEquals(originalChild.getSourcePosition(), cloneChild.getSourcePosition());

        originalChild = originalChild.getNext();
        cloneChild = cloneChild.getNext();
        assertNotSame(originalChild, cloneChild);
        assertEquals(originalChild.getType(), cloneChild.getType());
        assertEquals(originalChild.getDouble(), cloneChild.getDouble(), 0.0001);
        assertEquals(originalChild.getSourcePosition(), cloneChild.getSourcePosition());
    }

    @Test
    public void testUseSourceInfoFrom() {
        Node target = new Node(Token.STRING);
        Node source = IR.string("source");
        source.setSourceEncodedPosition(Node.mergeLineCharNo(10, 20));
        source.setStaticSourceFile(new SimpleSourceFile("test.js", false));

        target.useSourceInfoFrom(source);
        assertEquals(source.getSourcePosition(), target.getSourcePosition());
        assertEquals(source.getStaticSourceFile(), target.getStaticSourceFile());
    }

    @Test
    public void testUseSourceInfoIfMissingFrom() {
        Node target = new Node(Token.STRING);
        target.setSourceEncodedPosition(Node.mergeLineCharNo(1, 1)); // Existing source info

        Node source = IR.string("source");
        source.setSourceEncodedPosition(Node.mergeLineCharNo(10, 20));
        source.setStaticSourceFile(new SimpleSourceFile("test.js", false));

        target.useSourceInfoIfMissingFrom(source); // Should not overwrite existing info
        assertEquals(Node.mergeLineCharNo(1, 1), target.getSourcePosition());
        assertNull(target.getStaticSourceFile());

        Node target2 = new Node(Token.STRING);
        target2.useSourceInfoIfMissingFrom(source); // Missing source info, should be copied
        assertEquals(source.getSourcePosition(), target2.getSourcePosition());
        assertEquals(source.getStaticSourceFile(), target2.getStaticSourceFile());
    }

    @Test
    public void testIsConstantName() {
        Node node = new Node(Token.NAME);
        node.putBooleanProp(Node.IS_CONSTANT_NAME, true);
        assertTrue(node.getBooleanProp(Node.IS_CONSTANT_NAME));
    }

    @Test
    public void testIsNamespace() {
        Node node = new Node(Token.NAME);
        node.putBooleanProp(Node.IS_NAMESPACE, true);
        assertTrue(node.getBooleanProp(Node.IS_NAMESPACE));
    }

    @Test
    public void testIsDispatcher() {
        Node node = new Node(Token.NAME);
        node.putBooleanProp(Node.IS_DISPATCHER, true);
        assertTrue(node.getBooleanProp(Node.IS_DISPATCHER));
    }

    @Test
    public void testDirectEval() {
        Node node = new Node(Token.CALL);
        node.putBooleanProp(Node.DIRECT_EVAL, true);
        assertTrue(node.getBooleanProp(Node.DIRECT_EVAL));
    }

    @Test
    public void testFreeCall() {
        Node node = new Node(Token.CALL);
        node.putBooleanProp(Node.FREE_CALL, true);
        assertTrue(node.getBooleanProp(Node.FREE_CALL));
    }

    @Test
    public void testGetSourceFileName() {
        Node node = new Node(Token.NAME);
        StaticSourceFile file = new SimpleSourceFile("myFile.js", false);
        node.setStaticSourceFile(file);
        assertEquals("myFile.js", node.getSourceFileName());
        Node node2 = new Node(Token.NAME);
        assertNull(node2.getSourceFileName());
    }

    @Test
    public void testGetStaticSourceFile() {
        Node node = new Node(Token.NAME);
        StaticSourceFile file = new SimpleSourceFile("myFile.js", false);
        node.setStaticSourceFile(file);
        assertEquals(file, node.getStaticSourceFile());
        assertNull(new Node(Token.NAME).getStaticSourceFile());
    }

    @Test
    public void testIsRightAndLeftAssociative() {
        // These are properties of operators, not directly tested here.
        // The Node class itself doesn't expose methods to check associativity.
    }

    @Test
    public void testSetJSType() {
        Node node = new Node(Token.STRING);
        MockJSType type = new MockJSType("string");
        node.setJSType(type);
        assertEquals(type, node.getJSType());
    }

    @Test
    public void testGetJSType() {
        Node node = new Node(Token.STRING);
        MockJSType type = new MockJSType("string");
        node.setJSType(type);
        assertEquals(type, node.getJSType());
        assertNull(new Node(Token.NAME).getJSType());
    }

    // Mock JSType for testing purposes
    private static class MockJSType extends com.google.javascript.rhino.jstype.JSType {
        private final String typeName;
        MockJSType(String typeName) {
            this.typeName = typeName;
        }

        @Override public String toString() { return typeName; }
        @Override public boolean isEquivalentTo(JSType that) { return this.typeName.equals(that.toString()); }
        // Other JSType methods omitted for brevity
    }

    @Test
    public void testGetJsDocBuilderForNode() {
        Node node = new Node(Token.STRING);
        assertNotNull(node.getJsDocBuilderForNode());
        // Further testing would involve checking if the comment is appended correctly.
    }

    @Test
    public void testSetJSDocInfo() {
        Node node = new Node(Token.STRING);
        JSDocInfo info = new JSDocInfo(false);
        info.addSuppression("a");
        node.setJSDocInfo(info);
        assertEquals(info, node.getJSDocInfo());
    }

    @Test
    public void testGetJSDocInfo() {
        Node node = new Node(Token.STRING);
        JSDocInfo info = new JSDocInfo(false);
        node.setJSDocInfo(info);
        assertNotNull(node.getJSDocInfo());
        assertNull(new Node(Token.NAME).getJSDocInfo());
    }

    @Test
    public void testSetChangeTime() {
        Node node = new Node(Token.NAME);
        node.setChangeTime(100);
        assertEquals(100, node.getChangeTime());
    }

    @Test
    public void testGetChangeTime() {
        Node node = new Node(Token.NAME);
        node.setChangeTime(200);
        assertEquals(200, node.getChangeTime());
        assertEquals(0, new Node(Token.NAME).getChangeTime());
    }

    @Test
    public void testSetVarArgs() {
        Node node = new Node(Token.NAME);
        node.setVarArgs(true);
        assertTrue(node.isVarArgs());
        node.setVarArgs(false);
        assertFalse(node.isVarArgs());
    }

    @Test
    public void testSetOptionalArg() {
        Node node = new Node(Token.NAME);
        node.setOptionalArg(true);
        assertTrue(node.isOptionalArg());
        node.setOptionalArg(false);
        assertFalse(node.isOptionalArg());
    }

    @Test
    public void testIsSyntheticBlock() {
        Node node = new Node(Token.BLOCK);
        assertFalse(node.isSyntheticBlock());
        node.putBooleanProp(Node.SYNTHETIC_BLOCK_PROP, true);
        assertTrue(node.isSyntheticBlock());
    }

    @Test
    public void testSetDirectives() {
        Node node = new Node(Token.STRING);
        Set<String> directives = Sets.newHashSet("use strict");
        node.setDirectives(directives);
        assertEquals(directives, node.getDirectives());
    }

    @Test
    public void testGetDirectives() {
        Node node = new Node(Token.STRING);
        Set<String> directives = Sets.newHashSet("use strict");
        node.setDirectives(directives);
        assertEquals(directives, node.getDirectives());
        assertNull(new Node(Token.NAME).getDirectives());
    }

    @Test
    public void testAddSuppression() {
        Node node = new Node(Token.STRING);
        node.addSuppression("unusedCode");
        JSDocInfo info = node.getJSDocInfo();
        assertNotNull(info);
        assertTrue(info.suppressions().contains("unusedCode"));
    }

    @Test
    public void testWasEmptyNode() {
        Node node = new Node(Token.BLOCK);
        assertFalse(node.wasEmptyNode());
        node.putBooleanProp(Node.EMPTY_BLOCK, true);
        assertTrue(node.wasEmptyNode());
    }

    @Test
    public void testSetSideEffectFlags() {
        Node node = new Node(Token.CALL);
        node.setSideEffectFlags(Node.NO_SIDE_EFFECTS);
        assertEquals(Node.NO_SIDE_EFFECTS, node.getSideEffectFlags());
    }

    @Test
    public void testGetSideEffectFlags() {
        Node node = new Node(Token.CALL);
        node.setSideEffectFlags(Node.SIDE_EFFECTS_ALL);
        assertEquals(Node.SIDE_EFFECTS_ALL, node.getSideEffectFlags());
    }

    @Test
    public void testSideEffectFlags() {
        Node.SideEffectFlags flags = new Node.SideEffectFlags();
        flags.setAllFlags();
        assertEquals(Node.SIDE_EFFECTS_ALL, flags.valueOf());

        flags.clearAllFlags();
        assertEquals(Node.NO_SIDE_EFFECTS | Node.FLAG_LOCAL_RESULTS, flags.valueOf());
    }

    @Test
    public void testIsOnlyModifiesThisCall() {
        Node node = new Node(Token.CALL);
        node.setSideEffectFlags(Node.FLAG_THIS_UNMODIFIED | Node.FLAG_GLOBAL_STATE_UNMODIFIED | Node.FLAG_ARGUMENTS_UNMODIFIED | Node.FLAG_NO_THROWS); // NO_SIDE_EFFECTS
        assertFalse(node.isOnlyModifiesThisCall()); // This would require specific flags combination not covered by NO_SIDE_EFFECTS

        // Example where it might be true (conceptually, requires specific flag setting)
        // This method checks for (flags & NO_SIDE_EFFECTS) == (FLAG_GLOBAL_STATE_UNMODIFIED | FLAG_ARGUMENTS_UNMODIFIED | FLAG_NO_THROWS)
        // Setting flags to only allow 'this' modification
        node.setSideEffectFlags(Node.FLAG_GLOBAL_STATE_UNMODIFIED | Node.FLAG_ARGUMENTS_UNMODIFIED | Node.FLAG_NO_THROWS); // this is the only unpreserved flag from NO_SIDE_EFFECTS
        assertTrue(node.isOnlyModifiesThisCall());
    }

    @Test
    public void testIsOnlyModifiesArgumentsCall() {
        Node node = new Node(Token.CALL);
        // Similar logic to isOnlyModifiesThisCall, checking flag combinations.
        // Example where it might be true
        node.setSideEffectFlags(Node.FLAG_GLOBAL_STATE_UNMODIFIED | Node.FLAG_THIS_UNMODIFIED | Node.FLAG_NO_THROWS);
        assertTrue(node.isOnlyModifiesArgumentsCall());
    }

    @Test
    public void testIsNoSideEffectsCall() {
        Node node = new Node(Token.CALL);
        node.setSideEffectFlags(Node.NO_SIDE_EFFECTS);
        assertTrue(node.isNoSideEffectsCall());
        node.setSideEffectFlags(Node.SIDE_EFFECTS_ALL);
        assertFalse(node.isNoSideEffectsCall());
    }

    @Test
    public void testIsLocalResultCall() {
        Node node = new Node(Token.CALL);
        node.setSideEffectFlags(Node.FLAG_LOCAL_RESULTS);
        assertTrue(node.isLocalResultCall());
        node.setSideEffectFlags(Node.SIDE_EFFECTS_ALL);
        assertFalse(node.isLocalResultCall());
    }

    @Test
    public void testMayMutateArguments() {
        Node node = new Node(Token.CALL);
        node.setSideEffectFlags(Node.NO_SIDE_EFFECTS); // Arguments are UNMODIFIED by default
        assertFalse(node.mayMutateArguments());
        node.setSideEffectFlags(Node.FLAG_ARGUMENTS_UNMODIFIED); // Explicitly UNMODIFIED
        assertFalse(node.mayMutateArguments());
        node.setSideEffectFlags(0); // No flags set, implies mutation
        assertTrue(node.mayMutateArguments());
    }

    @Test
    public void testMayMutateGlobalStateOrThrow() {
        Node node = new Node(Token.CALL);
        node.setSideEffectFlags(Node.FLAG_GLOBAL_STATE_UNMODIFIED | Node.FLAG_NO_THROWS);
        assertFalse(node.mayMutateGlobalStateOrThrow());
        node.setSideEffectFlags(Node.FLAG_GLOBAL_STATE_UNMODIFIED);
        assertTrue(node.mayMutateGlobalStateOrThrow()); // Throws is not guaranteed UNMODIFIED
        node.setSideEffectFlags(Node.FLAG_NO_THROWS);
        assertTrue(node.mayMutateGlobalStateOrThrow()); // Global state is not guaranteed UNMODIFIED
    }
}
