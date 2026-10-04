```java
package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.javascript.jscomp.CheckLevel;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

public class CheckGlobalThisTest {

    private CheckGlobalThis createCheckGlobalThis() {
        // AbstractCompiler is an interface, and a null implementation is often sufficient
        // for testing components that just need a compiler instance.
        AbstractCompiler compiler = new AbstractCompiler() {
            @Override
            public void report(NodeTraversal t, Node n, CheckLevel level, DiagnosticType diagnosticType, String... arguments) {
                // Do nothing for tests. In a real run, this would record the error.
            }

            @Override
            public boolean isIdeMode() { return false; }
            @Override
            public void process(SourceFile externs, SourceFile code, CompilerOptions options) {}
            @Override
            public void process(List<SourceFile> externs, List<SourceFile> code, CompilerOptions options) {}
            @Override
            public void process(SourceFile externs, List<SourceFile> code, CompilerOptions options) {}
            @Override
            public Node parse(String filename, String code, CheckLevel level) { return null; }
            @Override
            public Node parseFormalCode(String filename, String code, CheckLevel level) { return null; }
            @Override
            public void normalize(NormalizeMode mode) {}
            @Override
            public void normalize() {}
            @Override
            public void phaseChanged(CompilerPass pass) {}
            @Override
            public String toSource(Node root) { return ""; }
            @Override
            public String toSource(Node root, boolean printSourceMap) { return ""; }
            @Override
            public <T extends JSType> T findCommonSuperType(T a, T b) { return null; }
            @Override
            public void prepareCodeGeneration() {}
            @Override
            public void optimize() {}
            @Override
            public void setExternPropertiesMap(Map<String, Object> externProps) {}
            @Override
            public void setIrOptimizationEnabled(boolean enabled) {}
            @Override
            public void setPropertyMap(Map<String, Object> propMap) {}
            @Override
            public void setSourceMapPath(String path) {}
            @Override
            public void setShouldGeneratePseudoNames(boolean shouldGeneratePseudoNames) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AssertionFunctionSpec assertionFunctionSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ClosureEquivalence closureEquivalence) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionPrototypeProperties functionPrototypeProperties) {}
            @Override
            public void setStereotype(Node n, CodingConvention.InferredConstProperties inferredConstProperties) {}
            @Override
            public void setStereotype(Node n, CodingConvention.VariableReference variableReference) {}
            @Override
            public void setStereotype(Node n, String name) {}
            @Override
            public void setStereotype(Node n, JSType type) {}
            @Override
            public void setStereotype(Node n, CodingConvention.StatementKey statementKey) {}
            @Override
            public void setStereotype(Node n, JSDocInfo.Visibility visibility) {}
            @Override
            public void setStereotype(Node n, CodingConvention.DelegateAndImplicitParams delegateAndImplicitParams) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ExtendOverride extendOverride) {}
            @Override
            public void setStereotype(Node n, CodingConvention.InterfaceExtendsInterface interfaceExtendsInterface) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorOverrides constructorOverrides) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AbstractMethodProperty abstractMethodProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Reference reference) {}
            @Override
            public void setStereotype(Node n, CodingConvention.CallLinker callLinker) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ModuleLoader moduleLoader) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Source fileUrl) {}
            @Override
            public void setStereotype(Node n, JSType.PropagationPolicy propagationPolicy) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ObjectLiteralObjectKey objectLiteralObjectKey) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ThisType thisType) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionType functionType) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorSpec constructorSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Parameter parameter) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ReturnSpec returnSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Abstract thisType) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Abstract classType) {}
            @Override
            public void setStereotype(Node n, JSType.TypeSummary typeSummary) {}
            @Override
            public void setStereotype(Node n, JSDocInfo jsDocInfo) {}
            @Override
            public void setStereotype(Node n, Var var) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AssertionFunctionSpec spec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FieldReference fieldReference) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ModuleWithUpwardExposedProperties moduleWithUpwardExposedProperties) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Enum syntheticEnum) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionArgumentSpec functionArgumentSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Reference reference) {}
            @Override
            public void setStereotype(Node n, Node expression) {}
            @Override
            public void setStereotype(Node n, JSDocInfo.Visibility visibility) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstantId constantId) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AliasSpec aliasSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ObjectSpec objectSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.NodeContent nodeContent) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionDescriptor functionDescriptor) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ClosureAssignProperty closureAssignProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ObjectProperty objectProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionPrototypeSpec functionPrototypeSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeInfo typeInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Source file) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Delegate delegate) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeValidator typeValidator) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ParameterParameterSpec parameterParameterSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstantSpec constantSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionSignature functionSignature) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ExtendedParameters extendedParameters) {}
            @Override
            public void setStereotype(Node n, CodingConvention.VariableMap variableMap) {}
            @Override
            public void setStereotype(Node n, CodingConvention.JsDocParameterSpec jsDocParameterSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorOverload constructorOverload) {}
            @Override
            public void setStereotype(Node n, CodingConvention.InlineConstant inlineConstant) {}
            @Override
            public void setStereotype(Node n, CodingConvention.PropertyReference propertyReference) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AbstractObject abstractObject) {}
            @Override
            public void setStereotype(Node n, CodingConvention.NamedPropertySpec namedPropertySpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstantId constantId) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Reference reference) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypePropertyType typePropertyType) {}
            @Override
            public void setStereotype(Node n, JSDocInfo.Visibility visibility) {}
            @Override
            public void setStereotype(Node n, CodingConvention.NodeContent nodeContent) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Source file) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Delegate delegate) {}
            @Override
            public void setStereotype(Node n, JSType.TypeSummary typeSummary) {}
            @Override
            public void setStereotype(Node n, Var var) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ClosureAssignProperty closureAssignProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeInfo typeInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionSignature functionSignature) {}
            @Override
            public void setStereotype(Node n, CodingConvention.JsDocParameterSpec jsDocParameterSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstantSpec constantSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionDescriptor functionDescriptor) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AssertionFunctionSpec spec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.InlineConstant inlineConstant) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorSpec constructorSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ObjectSpec objectSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Abstract thisType) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Reference reference) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Parameter parameter) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypePropertyType typePropertyType) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ObjectProperty objectProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ReturnSpec returnSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionPrototypeSpec functionPrototypeSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ExtendOverride extendOverride) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AliasSpec aliasSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionType functionType) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Abstract classType) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ParameterParameterSpec parameterParameterSpec) {}
            @Override
            public void setStereotype(Node n, JSDocInfo jsDocInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ModuleWithUpwardExposedProperties moduleWithUpwardExposedProperties) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Enum syntheticEnum) {}
            @Override
            public void setStereotype(Node n, CodingConvention.NamedPropertySpec namedPropertySpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeValidator typeValidator) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstantId constantId) {}
            @Override
            public void setStereotype(Node n, CodingConvention.CallLinker callLinker) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FieldReference fieldReference) {}
            @Override
            public void setStereotype(Node n, CodingConvention.InferredConstProperties inferredConstProperties) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AssertionFunctionSpec assertionFunctionSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.DelegateAndImplicitParams delegateAndImplicitParams) {}
            @Override
            public void setStereotype(Node n, CodingConvention.VariableReference variableReference) {}
            @Override
            public void setStereotype(Node n, JSType.PropagationPolicy propagationPolicy) {}
            @Override
            public void setStereotype(Node n, JSDocInfo.Visibility visibility) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorOverrides constructorOverrides) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeInfo typeInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Source fileUrl) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionArgumentSpec functionArgumentSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.NodeContent nodeContent) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AbstractMethodProperty abstractMethodProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.InterfaceExtendsInterface interfaceExtendsInterface) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorOverload constructorOverload) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ClosureEquivalence closureEquivalence) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionPrototypeProperties functionPrototypeProperties) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ObjectLiteralObjectKey objectLiteralObjectKey) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ThisType thisType) {}
            @Override
            public void setStereotype(Node n, CodingConvention.VariableMap variableMap) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ExtType extType) {}
            @Override
            public void setStereotype(Node n, CodingConvention.StatementKey statementKey) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ExtendOverride extendOverride) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ModuleLoader moduleLoader) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeValidator typeValidator) {}
            @Override
            public void setStereotype(Node n, CodingConvention.InlineConstant inlineConstant) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Abstract thisType) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Abstract classType) {}
            @Override
            public void setStereotype(Node n, JSDocInfo.Visibility visibility) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstantId constantId) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Delegate delegate) {}
            @Override
            public void setStereotype(Node n, CodingConvention.NamedPropertySpec namedPropertySpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ObjectProperty objectProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionSignature functionSignature) {}
            @Override
            public void setStereotype(Node n, CodingConvention.VariableMap variableMap) {}
            @Override
            public void setStereotype(Node n, CodingConvention.PropertyReference propertyReference) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypePropertyType typePropertyType) {}
            @Override
            public void setStereotype(Node n, JSDocInfo jsDocInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AliasSpec aliasSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.DelegateAndImplicitParams delegateAndImplicitParams) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AssertionFunctionSpec assertionFunctionSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ObjectSpec objectSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionType functionType) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ReturnSpec returnSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Parameter parameter) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorSpec constructorSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeInfo typeInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.CallLinker callLinker) {}
            @Override
            public void setStereotype(Node n, CodingConvention.NodeContent nodeContent) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Source file) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionArgumentSpec functionArgumentSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorOverrides constructorOverrides) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AbstractMethodProperty abstractMethodProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.InterfaceExtendsInterface interfaceExtendsInterface) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ModuleLoader moduleLoader) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FieldReference fieldReference) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorOverload constructorOverload) {}
            @Override
            public void setStereotype(Node n, CodingConvention.InferredConstProperties inferredConstProperties) {}
            @Override
            public void setStereotype(Node n, CodingConvention.JsDocParameterSpec jsDocParameterSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Enum syntheticEnum) {}
            @Override
            public void setStereotype(Node n, CodingConvention.StatementKey statementKey) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeValidator typeValidator) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ClosureEquivalence closureEquivalence) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AssertionFunctionSpec assertionFunctionSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionPrototypeProperties functionPrototypeProperties) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeInfo typeInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ClosureAssignProperty closureAssignProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ObjectLiteralObjectKey objectLiteralObjectKey) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ThisType thisType) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstantId constantId) {}
            @Override
            public void setStereotype(Node n, CodingConvention.VariableReference variableReference) {}
            @Override
            public void setStereotype(Node n, JSType.PropagationPolicy propagationPolicy) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Abstract thisType) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Abstract classType) {}
            @Override
            public void setStereotype(Node n, JSDocInfo.Visibility visibility) {}
            @Override
            public void setStereotype(Node n, CodingConvention.NamedPropertySpec namedPropertySpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ObjectProperty objectProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionSignature functionSignature) {}
            @Override
            public void setStereotype(Node n, CodingConvention.VariableMap variableMap) {}
            @Override
            public void setStereotype(Node n, CodingConvention.PropertyReference propertyReference) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypePropertyType typePropertyType) {}
            @Override
            public void setStereotype(Node n, JSDocInfo jsDocInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AliasSpec aliasSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.DelegateAndImplicitParams delegateAndImplicitParams) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Parameter parameter) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorSpec constructorSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeInfo typeInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.CallLinker callLinker) {}
            @Override
            public void setStereotype(Node n, CodingConvention.NodeContent nodeContent) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Source file) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionArgumentSpec functionArgumentSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorOverrides constructorOverrides) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AbstractMethodProperty abstractMethodProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.InterfaceExtendsInterface interfaceExtendsInterface) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ModuleLoader moduleLoader) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FieldReference fieldReference) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorOverload constructorOverload) {}
            @Override
            public void setStereotype(Node n, CodingConvention.InferredConstProperties inferredConstProperties) {}
            @Override
            public void setStereotype(Node n, CodingConvention.JsDocParameterSpec jsDocParameterSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Enum syntheticEnum) {}
            @Override
            public void setStereotype(Node n, CodingConvention.StatementKey statementKey) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeValidator typeValidator) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ClosureEquivalence closureEquivalence) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AssertionFunctionSpec assertionFunctionSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionPrototypeProperties functionPrototypeProperties) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeInfo typeInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ClosureAssignProperty closureAssignProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ObjectLiteralObjectKey objectLiteralObjectKey) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ThisType thisType) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstantId constantId) {}
            @Override
            public void setStereotype(Node n, CodingConvention.VariableReference variableReference) {}
            @Override
            public void setStereotype(Node n, JSType.PropagationPolicy propagationPolicy) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Abstract thisType) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Abstract classType) {}
            @Override
            public void setStereotype(Node n, JSDocInfo.Visibility visibility) {}
            @Override
            public void setStereotype(Node n, CodingConvention.NamedPropertySpec namedPropertySpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ObjectProperty objectProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionSignature functionSignature) {}
            @Override
            public void setStereotype(Node n, CodingConvention.VariableMap variableMap) {}
            @Override
            public void setStereotype(Node n, CodingConvention.PropertyReference propertyReference) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypePropertyType typePropertyType) {}
            @Override
            public void setStereotype(Node n, JSDocInfo jsDocInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AliasSpec aliasSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.DelegateAndImplicitParams delegateAndImplicitParams) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Parameter parameter) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorSpec constructorSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeInfo typeInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.CallLinker callLinker) {}
            @Override
            public void setStereotype(Node n, CodingConvention.NodeContent nodeContent) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Source file) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionArgumentSpec functionArgumentSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorOverrides constructorOverrides) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AbstractMethodProperty abstractMethodProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.InterfaceExtendsInterface interfaceExtendsInterface) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ModuleLoader moduleLoader) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FieldReference fieldReference) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorOverload constructorOverload) {}
            @Override
            public void setStereotype(Node n, CodingConvention.InferredConstProperties inferredConstProperties) {}
            @Override
            public void setStereotype(Node n, CodingConvention.JsDocParameterSpec jsDocParameterSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Enum syntheticEnum) {}
            @Override
            public void setStereotype(Node n, CodingConvention.StatementKey statementKey) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeValidator typeValidator) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ClosureEquivalence closureEquivalence) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AssertionFunctionSpec assertionFunctionSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionPrototypeProperties functionPrototypeProperties) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeInfo typeInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ClosureAssignProperty closureAssignProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ObjectLiteralObjectKey objectLiteralObjectKey) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ThisType thisType) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstantId constantId) {}
            @Override
            public void setStereotype(Node n, CodingConvention.VariableReference variableReference) {}
            @Override
            public void setStereotype(Node n, JSType.PropagationPolicy propagationPolicy) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Abstract thisType) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Abstract classType) {}
            @Override
            public void setStereotype(Node n, JSDocInfo.Visibility visibility) {}
            @Override
            public void setStereotype(Node n, CodingConvention.NamedPropertySpec namedPropertySpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ObjectProperty objectProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionSignature functionSignature) {}
            @Override
            public void setStereotype(Node n, CodingConvention.VariableMap variableMap) {}
            @Override
            public void setStereotype(Node n, CodingConvention.PropertyReference propertyReference) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypePropertyType typePropertyType) {}
            @Override
            public void setStereotype(Node n, JSDocInfo jsDocInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AliasSpec aliasSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.DelegateAndImplicitParams delegateAndImplicitParams) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Parameter parameter) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorSpec constructorSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeInfo typeInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.CallLinker callLinker) {}
            @Override
            public void setStereotype(Node n, CodingConvention.NodeContent nodeContent) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Source file) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionArgumentSpec functionArgumentSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorOverrides constructorOverrides) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AbstractMethodProperty abstractMethodProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.InterfaceExtendsInterface interfaceExtendsInterface) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ModuleLoader moduleLoader) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FieldReference fieldReference) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorOverload constructorOverload) {}
            @Override
            public void setStereotype(Node n, CodingConvention.InferredConstProperties inferredConstProperties) {}
            @Override
            public void setStereotype(Node n, CodingConvention.JsDocParameterSpec jsDocParameterSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Enum syntheticEnum) {}
            @Override
            public void setStereotype(Node n, CodingConvention.StatementKey statementKey) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeValidator typeValidator) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ClosureEquivalence closureEquivalence) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AssertionFunctionSpec assertionFunctionSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionPrototypeProperties functionPrototypeProperties) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeInfo typeInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ClosureAssignProperty closureAssignProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ObjectLiteralObjectKey objectLiteralObjectKey) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ThisType thisType) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstantId constantId) {}
            @Override
            public void setStereotype(Node n, CodingConvention.VariableReference variableReference) {}
            @Override
            public void setStereotype(Node n, JSType.PropagationPolicy propagationPolicy) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Abstract thisType) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Abstract classType) {}
            @Override
            public void setStereotype(Node n, JSDocInfo.Visibility visibility) {}
            @Override
            public void setStereotype(Node n, CodingConvention.NamedPropertySpec namedPropertySpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ObjectProperty objectProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionSignature functionSignature) {}
            @Override
            public void setStereotype(Node n, CodingConvention.VariableMap variableMap) {}
            @Override
            public void setStereotype(Node n, CodingConvention.PropertyReference propertyReference) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypePropertyType typePropertyType) {}
            @Override
            public void setStereotype(Node n, JSDocInfo jsDocInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AliasSpec aliasSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.DelegateAndImplicitParams delegateAndImplicitParams) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Parameter parameter) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorSpec constructorSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeInfo typeInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.CallLinker callLinker) {}
            @Override
            public void setStereotype(Node n, CodingConvention.NodeContent nodeContent) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Source file) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionArgumentSpec functionArgumentSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorOverrides constructorOverrides) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AbstractMethodProperty abstractMethodProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.InterfaceExtendsInterface interfaceExtendsInterface) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ModuleLoader moduleLoader) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FieldReference fieldReference) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorOverload constructorOverload) {}
            @Override
            public void setStereotype(Node n, CodingConvention.InferredConstProperties inferredConstProperties) {}
            @Override
            public void setStereotype(Node n, CodingConvention.JsDocParameterSpec jsDocParameterSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Enum syntheticEnum) {}
            @Override
            public void setStereotype(Node n, CodingConvention.StatementKey statementKey) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeValidator typeValidator) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ClosureEquivalence closureEquivalence) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AssertionFunctionSpec assertionFunctionSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionPrototypeProperties functionPrototypeProperties) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeInfo typeInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ClosureAssignProperty closureAssignProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ObjectLiteralObjectKey objectLiteralObjectKey) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ThisType thisType) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstantId constantId) {}
            @Override
            public void setStereotype(Node n, CodingConvention.VariableReference variableReference) {}
            @Override
            public void setStereotype(Node n, JSType.PropagationPolicy propagationPolicy) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Abstract thisType) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Abstract classType) {}
            @Override
            public void setStereotype(Node n, JSDocInfo.Visibility visibility) {}
            @Override
            public void setStereotype(Node n, CodingConvention.NamedPropertySpec namedPropertySpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ObjectProperty objectProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionSignature functionSignature) {}
            @Override
            public void setStereotype(Node n, CodingConvention.VariableMap variableMap) {}
            @Override
            public void setStereotype(Node n, CodingConvention.PropertyReference propertyReference) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypePropertyType typePropertyType) {}
            @Override
            public void setStereotype(Node n, JSDocInfo jsDocInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AliasSpec aliasSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.DelegateAndImplicitParams delegateAndImplicitParams) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Parameter parameter) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorSpec constructorSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeInfo typeInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.CallLinker callLinker) {}
            @Override
            public void setStereotype(Node n, CodingConvention.NodeContent nodeContent) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Source file) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionArgumentSpec functionArgumentSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorOverrides constructorOverrides) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AbstractMethodProperty abstractMethodProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.InterfaceExtendsInterface interfaceExtendsInterface) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ModuleLoader moduleLoader) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FieldReference fieldReference) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorOverload constructorOverload) {}
            @Override
            public void setStereotype(Node n, CodingConvention.InferredConstProperties inferredConstProperties) {}
            @Override
            public void setStereotype(Node n, CodingConvention.JsDocParameterSpec jsDocParameterSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Enum syntheticEnum) {}
            @Override
            public void setStereotype(Node n, CodingConvention.StatementKey statementKey) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeValidator typeValidator) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ClosureEquivalence closureEquivalence) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AssertionFunctionSpec assertionFunctionSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionPrototypeProperties functionPrototypeProperties) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeInfo typeInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ClosureAssignProperty closureAssignProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ObjectLiteralObjectKey objectLiteralObjectKey) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ThisType thisType) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstantId constantId) {}
            @Override
            public void setStereotype(Node n, CodingConvention.VariableReference variableReference) {}
            @Override
            public void setStereotype(Node n, JSType.PropagationPolicy propagationPolicy) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Abstract thisType) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Abstract classType) {}
            @Override
            public void setStereotype(Node n, JSDocInfo.Visibility visibility) {}
            @Override
            public void setStereotype(Node n, CodingConvention.NamedPropertySpec namedPropertySpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ObjectProperty objectProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionSignature functionSignature) {}
            @Override
            public void setStereotype(Node n, CodingConvention.VariableMap variableMap) {}
            @Override
            public void setStereotype(Node n, CodingConvention.PropertyReference propertyReference) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypePropertyType typePropertyType) {}
            @Override
            public void setStereotype(Node n, JSDocInfo jsDocInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AliasSpec aliasSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.DelegateAndImplicitParams delegateAndImplicitParams) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Parameter parameter) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorSpec constructorSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeInfo typeInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.CallLinker callLinker) {}
            @Override
            public void setStereotype(Node n, CodingConvention.NodeContent nodeContent) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Source file) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionArgumentSpec functionArgumentSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorOverrides constructorOverrides) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AbstractMethodProperty abstractMethodProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.InterfaceExtendsInterface interfaceExtendsInterface) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ModuleLoader moduleLoader) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FieldReference fieldReference) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorOverload constructorOverload) {}
            @Override
            public void setStereotype(Node n, CodingConvention.InferredConstProperties inferredConstProperties) {}
            @Override
            public void setStereotype(Node n, CodingConvention.JsDocParameterSpec jsDocParameterSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Enum syntheticEnum) {}
            @Override
            public void setStereotype(Node n, CodingConvention.StatementKey statementKey) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeValidator typeValidator) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ClosureEquivalence closureEquivalence) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AssertionFunctionSpec assertionFunctionSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionPrototypeProperties functionPrototypeProperties) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeInfo typeInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ClosureAssignProperty closureAssignProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ObjectLiteralObjectKey objectLiteralObjectKey) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ThisType thisType) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstantId constantId) {}
            @Override
            public void setStereotype(Node n, CodingConvention.VariableReference variableReference) {}
            @Override
            public void setStereotype(Node n, JSType.PropagationPolicy propagationPolicy) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Abstract thisType) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Abstract classType) {}
            @Override
            public void setStereotype(Node n, JSDocInfo.Visibility visibility) {}
            @Override
            public void setStereotype(Node n, CodingConvention.NamedPropertySpec namedPropertySpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ObjectProperty objectProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionSignature functionSignature) {}
            @Override
            public void setStereotype(Node n, CodingConvention.VariableMap variableMap) {}
            @Override
            public void setStereotype(Node n, CodingConvention.PropertyReference propertyReference) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypePropertyType typePropertyType) {}
            @Override
            public void setStereotype(Node n, JSDocInfo jsDocInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AliasSpec aliasSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.DelegateAndImplicitParams delegateAndImplicitParams) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Parameter parameter) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorSpec constructorSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeInfo typeInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.CallLinker callLinker) {}
            @Override
            public void setStereotype(Node n, CodingConvention.NodeContent nodeContent) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Source file) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionArgumentSpec functionArgumentSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorOverrides constructorOverrides) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AbstractMethodProperty abstractMethodProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.InterfaceExtendsInterface interfaceExtendsInterface) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ModuleLoader moduleLoader) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FieldReference fieldReference) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorOverload constructorOverload) {}
            @Override
            public void setStereotype(Node n, CodingConvention.InferredConstProperties inferredConstProperties) {}
            @Override
            public void setStereotype(Node n, CodingConvention.JsDocParameterSpec jsDocParameterSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Enum syntheticEnum) {}
            @Override
            public void setStereotype(Node n, CodingConvention.StatementKey statementKey) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeValidator typeValidator) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ClosureEquivalence closureEquivalence) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AssertionFunctionSpec assertionFunctionSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionPrototypeProperties functionPrototypeProperties) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeInfo typeInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ClosureAssignProperty closureAssignProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ObjectLiteralObjectKey objectLiteralObjectKey) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ThisType thisType) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstantId constantId) {}
            @Override
            public void setStereotype(Node n, CodingConvention.VariableReference variableReference) {}
            @Override
            public void setStereotype(Node n, JSType.PropagationPolicy propagationPolicy) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Abstract thisType) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Abstract classType) {}
            @Override
            public void setStereotype(Node n, JSDocInfo.Visibility visibility) {}
            @Override
            public void setStereotype(Node n, CodingConvention.NamedPropertySpec namedPropertySpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ObjectProperty objectProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionSignature functionSignature) {}
            @Override
            public void setStereotype(Node n, CodingConvention.VariableMap variableMap) {}
            @Override
            public void setStereotype(Node n, CodingConvention.PropertyReference propertyReference) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypePropertyType typePropertyType) {}
            @Override
            public void setStereotype(Node n, JSDocInfo jsDocInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AliasSpec aliasSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.DelegateAndImplicitParams delegateAndImplicitParams) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Parameter parameter) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorSpec constructorSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeInfo typeInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.CallLinker callLinker) {}
            @Override
            public void setStereotype(Node n, CodingConvention.NodeContent nodeContent) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Source file) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionArgumentSpec functionArgumentSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorOverrides constructorOverrides) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AbstractMethodProperty abstractMethodProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.InterfaceExtendsInterface interfaceExtendsInterface) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ModuleLoader moduleLoader) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FieldReference fieldReference) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorOverload constructorOverload) {}
            @Override
            public void setStereotype(Node n, CodingConvention.InferredConstProperties inferredConstProperties) {}
            @Override
            public void setStereotype(Node n, CodingConvention.JsDocParameterSpec jsDocParameterSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Enum syntheticEnum) {}
            @Override
            public void setStereotype(Node n, CodingConvention.StatementKey statementKey) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeValidator typeValidator) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ClosureEquivalence closureEquivalence) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AssertionFunctionSpec assertionFunctionSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionPrototypeProperties functionPrototypeProperties) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeInfo typeInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ClosureAssignProperty closureAssignProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ObjectLiteralObjectKey objectLiteralObjectKey) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ThisType thisType) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstantId constantId) {}
            @Override
            public void setStereotype(Node n, CodingConvention.VariableReference variableReference) {}
            @Override
            public void setStereotype(Node n, JSType.PropagationPolicy propagationPolicy) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Abstract thisType) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Abstract classType) {}
            @Override
            public void setStereotype(Node n, JSDocInfo.Visibility visibility) {}
            @Override
            public void setStereotype(Node n, CodingConvention.NamedPropertySpec namedPropertySpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ObjectProperty objectProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionSignature functionSignature) {}
            @Override
            public void setStereotype(Node n, CodingConvention.VariableMap variableMap) {}
            @Override
            public void setStereotype(Node n, CodingConvention.PropertyReference propertyReference) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypePropertyType typePropertyType) {}
            @Override
            public void setStereotype(Node n, JSDocInfo jsDocInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AliasSpec aliasSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.DelegateAndImplicitParams delegateAndImplicitParams) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Parameter parameter) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorSpec constructorSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeInfo typeInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.CallLinker callLinker) {}
            @Override
            public void setStereotype(Node n, CodingConvention.NodeContent nodeContent) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Source file) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionArgumentSpec functionArgumentSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorOverrides constructorOverrides) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AbstractMethodProperty abstractMethodProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.InterfaceExtendsInterface interfaceExtendsInterface) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ModuleLoader moduleLoader) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FieldReference fieldReference) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorOverload constructorOverload) {}
            @Override
            public void setStereotype(Node n, CodingConvention.InferredConstProperties inferredConstProperties) {}
            @Override
            public void setStereotype(Node n, CodingConvention.JsDocParameterSpec jsDocParameterSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Enum syntheticEnum) {}
            @Override
            public void setStereotype(Node n, CodingConvention.StatementKey statementKey) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeValidator typeValidator) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ClosureEquivalence closureEquivalence) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AssertionFunctionSpec assertionFunctionSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionPrototypeProperties functionPrototypeProperties) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeInfo typeInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ClosureAssignProperty closureAssignProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ObjectLiteralObjectKey objectLiteralObjectKey) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ThisType thisType) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstantId constantId) {}
            @Override
            public void setStereotype(Node n, CodingConvention.VariableReference variableReference) {}
            @Override
            public void setStereotype(Node n, JSType.PropagationPolicy propagationPolicy) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Abstract thisType) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Abstract classType) {}
            @Override
            public void setStereotype(Node n, JSDocInfo.Visibility visibility) {}
            @Override
            public void setStereotype(Node n, CodingConvention.NamedPropertySpec namedPropertySpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ObjectProperty objectProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionSignature functionSignature) {}
            @Override
            public void setStereotype(Node n, CodingConvention.VariableMap variableMap) {}
            @Override
            public void setStereotype(Node n, CodingConvention.PropertyReference propertyReference) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypePropertyType typePropertyType) {}
            @Override
            public void setStereotype(Node n, JSDocInfo jsDocInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AliasSpec aliasSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.DelegateAndImplicitParams delegateAndImplicitParams) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Parameter parameter) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorSpec constructorSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeInfo typeInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.CallLinker callLinker) {}
            @Override
            public void setStereotype(Node n, CodingConvention.NodeContent nodeContent) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Source file) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionArgumentSpec functionArgumentSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorOverrides constructorOverrides) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AbstractMethodProperty abstractMethodProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.InterfaceExtendsInterface interfaceExtendsInterface) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ModuleLoader moduleLoader) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FieldReference fieldReference) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorOverload constructorOverload) {}
            @Override
            public void setStereotype(Node n, CodingConvention.InferredConstProperties inferredConstProperties) {}
            @Override
            public void setStereotype(Node n, CodingConvention.JsDocParameterSpec jsDocParameterSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Enum syntheticEnum) {}
            @Override
            public void setStereotype(Node n, CodingConvention.StatementKey statementKey) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeValidator typeValidator) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ClosureEquivalence closureEquivalence) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AssertionFunctionSpec assertionFunctionSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionPrototypeProperties functionPrototypeProperties) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeInfo typeInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ClosureAssignProperty closureAssignProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ObjectLiteralObjectKey objectLiteralObjectKey) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ThisType thisType) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstantId constantId) {}
            @Override
            public void setStereotype(Node n, CodingConvention.VariableReference variableReference) {}
            @Override
            public void setStereotype(Node n, JSType.PropagationPolicy propagationPolicy) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Abstract thisType) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Abstract classType) {}
            @Override
            public void setStereotype(Node n, JSDocInfo.Visibility visibility) {}
            @Override
            public void setStereotype(Node n, CodingConvention.NamedPropertySpec namedPropertySpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ObjectProperty objectProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionSignature functionSignature) {}
            @Override
            public void setStereotype(Node n, CodingConvention.VariableMap variableMap) {}
            @Override
            public void setStereotype(Node n, CodingConvention.PropertyReference propertyReference) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypePropertyType typePropertyType) {}
            @Override
            public void setStereotype(Node n, JSDocInfo jsDocInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AliasSpec aliasSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.DelegateAndImplicitParams delegateAndImplicitParams) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Parameter parameter) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorSpec constructorSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeInfo typeInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.CallLinker callLinker) {}
            @Override
            public void setStereotype(Node n, CodingConvention.NodeContent nodeContent) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Source file) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionArgumentSpec functionArgumentSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorOverrides constructorOverrides) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AbstractMethodProperty abstractMethodProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.InterfaceExtendsInterface interfaceExtendsInterface) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ModuleLoader moduleLoader) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FieldReference fieldReference) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorOverload constructorOverload) {}
            @Override
            public void setStereotype(Node n, CodingConvention.InferredConstProperties inferredConstProperties) {}
            @Override
            public void setStereotype(Node n, CodingConvention.JsDocParameterSpec jsDocParameterSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Enum syntheticEnum) {}
            @Override
            public void setStereotype(Node n, CodingConvention.StatementKey statementKey) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeValidator typeValidator) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ClosureEquivalence closureEquivalence) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AssertionFunctionSpec assertionFunctionSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionPrototypeProperties functionPrototypeProperties) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeInfo typeInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ClosureAssignProperty closureAssignProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ObjectLiteralObjectKey objectLiteralObjectKey) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ThisType thisType) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstantId constantId) {}
            @Override
            public void setStereotype(Node n, CodingConvention.VariableReference variableReference) {}
            @Override
            public void setStereotype(Node n, JSType.PropagationPolicy propagationPolicy) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Abstract thisType) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Abstract classType) {}
            @Override
            public void setStereotype(Node n, JSDocInfo.Visibility visibility) {}
            @Override
            public void setStereotype(Node n, CodingConvention.NamedPropertySpec namedPropertySpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ObjectProperty objectProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionSignature functionSignature) {}
            @Override
            public void setStereotype(Node n, CodingConvention.VariableMap variableMap) {}
            @Override
            public void setStereotype(Node n, CodingConvention.PropertyReference propertyReference) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypePropertyType typePropertyType) {}
            @Override
            public void setStereotype(Node n, JSDocInfo jsDocInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AliasSpec aliasSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.DelegateAndImplicitParams delegateAndImplicitParams) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Parameter parameter) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorSpec constructorSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeInfo typeInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.CallLinker callLinker) {}
            @Override
            public void setStereotype(Node n, CodingConvention.NodeContent nodeContent) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Source file) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionArgumentSpec functionArgumentSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorOverrides constructorOverrides) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AbstractMethodProperty abstractMethodProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.InterfaceExtendsInterface interfaceExtendsInterface) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ModuleLoader moduleLoader) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FieldReference fieldReference) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorOverload constructorOverload) {}
            @Override
            public void setStereotype(Node n, CodingConvention.InferredConstProperties inferredConstProperties) {}
            @Override
            public void setStereotype(Node n, CodingConvention.JsDocParameterSpec jsDocParameterSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Enum syntheticEnum) {}
            @Override
            public void setStereotype(Node n, CodingConvention.StatementKey statementKey) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeValidator typeValidator) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ClosureEquivalence closureEquivalence) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AssertionFunctionSpec assertionFunctionSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionPrototypeProperties functionPrototypeProperties) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeInfo typeInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ClosureAssignProperty closureAssignProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ObjectLiteralObjectKey objectLiteralObjectKey) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ThisType thisType) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstantId constantId) {}
            @Override
            public void setStereotype(Node n, CodingConvention.VariableReference variableReference) {}
            @Override
            public void setStereotype(Node n, JSType.PropagationPolicy propagationPolicy) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Abstract thisType) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Abstract classType) {}
            @Override
            public void setStereotype(Node n, JSDocInfo.Visibility visibility) {}
            @Override
            public void setStereotype(Node n, CodingConvention.NamedPropertySpec namedPropertySpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ObjectProperty objectProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionSignature functionSignature) {}
            @Override
            public void setStereotype(Node n, CodingConvention.VariableMap variableMap) {}
            @Override
            public void setStereotype(Node n, CodingConvention.PropertyReference propertyReference) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypePropertyType typePropertyType) {}
            @Override
            public void setStereotype(Node n, JSDocInfo jsDocInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AliasSpec aliasSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.DelegateAndImplicitParams delegateAndImplicitParams) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Parameter parameter) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorSpec constructorSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeInfo typeInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.CallLinker callLinker) {}
            @Override
            public void setStereotype(Node n, CodingConvention.NodeContent nodeContent) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Source file) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionArgumentSpec functionArgumentSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorOverides constructorOverides) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AbstractMethodProperty abstractMethodProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.InterfaceExtendsInterface interfaceExtendsInterface) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ModuleLoader moduleLoader) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FieldReference fieldReference) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorOverload constructorOverload) {}
            @Override
            public void setStereotype(Node n, CodingConvention.InferredConstProperties inferredConstProperties) {}
            @Override
            public void setStereotype(Node n, CodingConvention.JsDocParameterSpec jsDocParameterSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Enum syntheticEnum) {}
            @Override
            public void setStereotype(Node n, CodingConvention.StatementKey statementKey) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeValidator typeValidator) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ClosureEquivalence closureEquivalence) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AssertionFunctionSpec assertionFunctionSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionPrototypeProperties functionPrototypeProperties) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeInfo typeInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ClosureAssignProperty closureAssignProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ObjectLiteralObjectKey objectLiteralObjectKey) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ThisType thisType) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstantId constantId) {}
            @Override
            public void setStereotype(Node n, CodingConvention.VariableReference variableReference) {}
            @Override
            public void setStereotype(Node n, JSType.PropagationPolicy propagationPolicy) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Abstract thisType) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Abstract classType) {}
            @Override
            public void setStereotype(Node n, JSDocInfo.Visibility visibility) {}
            @Override
            public void setStereotype(Node n, CodingConvention.NamedPropertySpec namedPropertySpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ObjectProperty objectProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionSignature functionSignature) {}
            @Override
            public void setStereotype(Node n, CodingConvention.VariableMap variableMap) {}
            @Override
            public void setStereotype(Node n, CodingConvention.PropertyReference propertyReference) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypePropertyType typePropertyType) {}
            @Override
            public void setStereotype(Node n, JSDocInfo jsDocInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AliasSpec aliasSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.DelegateAndImplicitParams delegateAndImplicitParams) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Parameter parameter) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorSpec constructorSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeInfo typeInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.CallLinker callLinker) {}
            @Override
            public void setStereotype(Node n, CodingConvention.NodeContent nodeContent) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Source file) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionArgumentSpec functionArgumentSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorOverides constructorOverides) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AbstractMethodProperty abstractMethodProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.InterfaceExtendsInterface interfaceExtendsInterface) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ModuleLoader moduleLoader) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FieldReference fieldReference) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorOverload constructorOverload) {}
            @Override
            public void setStereotype(Node n, CodingConvention.InferredConstProperties inferredConstProperties) {}
            @Override
            public void setStereotype(Node n, CodingConvention.JsDocParameterSpec jsDocParameterSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Enum syntheticEnum) {}
            @Override
            public void setStereotype(Node n, CodingConvention.StatementKey statementKey) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeValidator typeValidator) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ClosureEquivalence closureEquivalence) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AssertionFunctionSpec assertionFunctionSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionPrototypeProperties functionPrototypeProperties) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeInfo typeInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ClosureAssignProperty closureAssignProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ObjectLiteralObjectKey objectLiteralObjectKey) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ThisType thisType) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstantId constantId) {}
            @Override
            public void setStereotype(Node n, CodingConvention.VariableReference variableReference) {}
            @Override
            public void setStereotype(Node n, JSType.PropagationPolicy propagationPolicy) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Abstract thisType) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Abstract classType) {}
            @Override
            public void setStereotype(Node n, JSDocInfo.Visibility visibility) {}
            @Override
            public void setStereotype(Node n, CodingConvention.NamedPropertySpec namedPropertySpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ObjectProperty objectProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionSignature functionSignature) {}
            @Override
            public void setStereotype(Node n, CodingConvention.VariableMap variableMap) {}
            @Override
            public void setStereotype(Node n, CodingConvention.PropertyReference propertyReference) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypePropertyType typePropertyType) {}
            @Override
            public void setStereotype(Node n, JSDocInfo jsDocInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AliasSpec aliasSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.DelegateAndImplicitParams delegateAndImplicitParams) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Parameter parameter) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorSpec constructorSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeInfo typeInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.CallLinker callLinker) {}
            @Override
            public void setStereotype(Node n, CodingConvention.NodeContent nodeContent) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Source file) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionArgumentSpec functionArgumentSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorOverides constructorOverides) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AbstractMethodProperty abstractMethodProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.InterfaceExtendsInterface interfaceExtendsInterface) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ModuleLoader moduleLoader) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FieldReference fieldReference) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorOverload constructorOverload) {}
            @Override
            public void setStereotype(Node n, CodingConvention.InferredConstProperties inferredConstProperties) {}
            @Override
            public void setStereotype(Node n, CodingConvention.JsDocParameterSpec jsDocParameterSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Enum syntheticEnum) {}
            @Override
            public void setStereotype(Node n, CodingConvention.StatementKey statementKey) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeValidator typeValidator) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ClosureEquivalence closureEquivalence) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AssertionFunctionSpec assertionFunctionSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionPrototypeProperties functionPrototypeProperties) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeInfo typeInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ClosureAssignProperty closureAssignProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ObjectLiteralObjectKey objectLiteralObjectKey) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ThisType thisType) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstantId constantId) {}
            @Override
            public void setStereotype(Node n, CodingConvention.VariableReference variableReference) {}
            @Override
            public void setStereotype(Node n, JSType.PropagationPolicy propagationPolicy) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Abstract thisType) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Abstract classType) {}
            @Override
            public void setStereotype(Node n, JSDocInfo.Visibility visibility) {}
            @Override
            public void setStereotype(Node n, CodingConvention.NamedPropertySpec namedPropertySpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ObjectProperty objectProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionSignature functionSignature) {}
            @Override
            public void setStereotype(Node n, CodingConvention.VariableMap variableMap) {}
            @Override
            public void setStereotype(Node n, CodingConvention.PropertyReference propertyReference) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypePropertyType typePropertyType) {}
            @Override
            public void setStereotype(Node n, JSDocInfo jsDocInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AliasSpec aliasSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.DelegateAndImplicitParams delegateAndImplicitParams) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Parameter parameter) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorSpec constructorSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeInfo typeInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.CallLinker callLinker) {}
            @Override
            public void setStereotype(Node n, CodingConvention.NodeContent nodeContent) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Source file) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionArgumentSpec functionArgumentSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorOverides constructorOverides) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AbstractMethodProperty abstractMethodProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.InterfaceExtendsInterface interfaceExtendsInterface) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ModuleLoader moduleLoader) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FieldReference fieldReference) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorOverload constructorOverload) {}
            @Override
            public void setStereotype(Node n, CodingConvention.InferredConstProperties inferredConstProperties) {}
            @Override
            public void setStereotype(Node n, CodingConvention.JsDocParameterSpec jsDocParameterSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Enum syntheticEnum) {}
            @Override
            public void setStereotype(Node n, CodingConvention.StatementKey statementKey) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeValidator typeValidator) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ClosureEquivalence closureEquivalence) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AssertionFunctionSpec assertionFunctionSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionPrototypeProperties functionPrototypeProperties) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeInfo typeInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ClosureAssignProperty closureAssignProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ObjectLiteralObjectKey objectLiteralObjectKey) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ThisType thisType) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstantId constantId) {}
            @Override
            public void setStereotype(Node n, CodingConvention.VariableReference variableReference) {}
            @Override
            public void setStereotype(Node n, JSType.PropagationPolicy propagationPolicy) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Abstract thisType) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Abstract classType) {}
            @Override
            public void setStereotype(Node n, JSDocInfo.Visibility visibility) {}
            @Override
            public void setStereotype(Node n, CodingConvention.NamedPropertySpec namedPropertySpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ObjectProperty objectProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionSignature functionSignature) {}
            @Override
            public void setStereotype(Node n, CodingConvention.VariableMap variableMap) {}
            @Override
            public void setStereotype(Node n, CodingConvention.PropertyReference propertyReference) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypePropertyType typePropertyType) {}
            @Override
            public void setStereotype(Node n, JSDocInfo jsDocInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AliasSpec aliasSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.DelegateAndImplicitParams delegateAndImplicitParams) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Parameter parameter) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorSpec constructorSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeInfo typeInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.CallLinker callLinker) {}
            @Override
            public void setStereotype(Node n, CodingConvention.NodeContent nodeContent) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Source file) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionArgumentSpec functionArgumentSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorOverides constructorOverides) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AbstractMethodProperty abstractMethodProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.InterfaceExtendsInterface interfaceExtendsInterface) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ModuleLoader moduleLoader) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FieldReference fieldReference) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorOverload constructorOverload) {}
            @Override
            public void setStereotype(Node n, CodingConvention.InferredConstProperties inferredConstProperties) {}
            @Override
            public void setStereotype(Node n, CodingConvention.JsDocParameterSpec jsDocParameterSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Enum syntheticEnum) {}
            @Override
            public void setStereotype(Node n, CodingConvention.StatementKey statementKey) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeValidator typeValidator) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ClosureEquivalence closureEquivalence) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AssertionFunctionSpec assertionFunctionSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionPrototypeProperties functionPrototypeProperties) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeInfo typeInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ClosureAssignProperty closureAssignProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ObjectLiteralObjectKey objectLiteralObjectKey) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ThisType thisType) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstantId constantId) {}
            @Override
            public void setStereotype(Node n, CodingConvention.VariableReference variableReference) {}
            @Override
            public void setStereotype(Node n, JSType.PropagationPolicy propagationPolicy) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Abstract thisType) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Abstract classType) {}
            @Override
            public void setStereotype(Node n, JSDocInfo.Visibility visibility) {}
            @Override
            public void setStereotype(Node n, CodingConvention.NamedPropertySpec namedPropertySpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ObjectProperty objectProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionSignature functionSignature) {}
            @Override
            public void setStereotype(Node n, CodingConvention.VariableMap variableMap) {}
            @Override
            public void setStereotype(Node n, CodingConvention.PropertyReference propertyReference) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypePropertyType typePropertyType) {}
            @Override
            public void setStereotype(Node n, JSDocInfo jsDocInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AliasSpec aliasSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.DelegateAndImplicitParams delegateAndImplicitParams) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Parameter parameter) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorSpec constructorSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeInfo typeInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.CallLinker callLinker) {}
            @Override
            public void setStereotype(Node n, CodingConvention.NodeContent nodeContent) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Source file) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionArgumentSpec functionArgumentSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorOverides constructorOverides) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AbstractMethodProperty abstractMethodProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.InterfaceExtendsInterface interfaceExtendsInterface) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ModuleLoader moduleLoader) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FieldReference fieldReference) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorOverload constructorOverload) {}
            @Override
            public void setStereotype(Node n, CodingConvention.InferredConstProperties inferredConstProperties) {}
            @Override
            public void setStereotype(Node n, CodingConvention.JsDocParameterSpec jsDocParameterSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Enum syntheticEnum) {}
            @Override
            public void setStereotype(Node n, CodingConvention.StatementKey statementKey) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeValidator typeValidator) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ClosureEquivalence closureEquivalence) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AssertionFunctionSpec assertionFunctionSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionPrototypeProperties functionPrototypeProperties) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeInfo typeInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ClosureAssignProperty closureAssignProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ObjectLiteralObjectKey objectLiteralObjectKey) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ThisType thisType) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstantId constantId) {}
            @Override
            public void setStereotype(Node n, CodingConvention.VariableReference variableReference) {}
            @Override
            public void setStereotype(Node n, JSType.PropagationPolicy propagationPolicy) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Abstract thisType) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Abstract classType) {}
            @Override
            public void setStereotype(Node n, JSDocInfo.Visibility visibility) {}
            @Override
            public void setStereotype(Node n, CodingConvention.NamedPropertySpec namedPropertySpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ObjectProperty objectProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionSignature functionSignature) {}
            @Override
            public void setStereotype(Node n, CodingConvention.VariableMap variableMap) {}
            @Override
            public void setStereotype(Node n, CodingConvention.PropertyReference propertyReference) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypePropertyType typePropertyType) {}
            @Override
            public void setStereotype(Node n, JSDocInfo jsDocInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AliasSpec aliasSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.DelegateAndImplicitParams delegateAndImplicitParams) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Parameter parameter) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorSpec constructorSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeInfo typeInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.CallLinker callLinker) {}
            @Override
            public void setStereotype(Node n, CodingConvention.NodeContent nodeContent) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Source file) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionArgumentSpec functionArgumentSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorOverides constructorOverides) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AbstractMethodProperty abstractMethodProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.InterfaceExtendsInterface interfaceExtendsInterface) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ModuleLoader moduleLoader) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FieldReference fieldReference) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorOverload constructorOverload) {}
            @Override
            public void setStereotype(Node n, CodingConvention.InferredConstProperties inferredConstProperties) {}
            @Override
            public void setStereotype(Node n, CodingConvention.JsDocParameterSpec jsDocParameterSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Enum syntheticEnum) {}
            @Override
            public void setStereotype(Node n, CodingConvention.StatementKey statementKey) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeValidator typeValidator) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ClosureEquivalence closureEquivalence) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AssertionFunctionSpec assertionFunctionSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionPrototypeProperties functionPrototypeProperties) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeInfo typeInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ClosureAssignProperty closureAssignProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ObjectLiteralObjectKey objectLiteralObjectKey) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ThisType thisType) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstantId constantId) {}
            @Override
            public void setStereotype(Node n, CodingConvention.VariableReference variableReference) {}
            @Override
            public void setStereotype(Node n, JSType.PropagationPolicy propagationPolicy) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Abstract thisType) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Abstract classType) {}
            @Override
            public void setStereotype(Node n, JSDocInfo.Visibility visibility) {}
            @Override
            public void setStereotype(Node n, CodingConvention.NamedPropertySpec namedPropertySpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ObjectProperty objectProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionSignature functionSignature) {}
            @Override
            public void setStereotype(Node n, CodingConvention.VariableMap variableMap) {}
            @Override
            public void setStereotype(Node n, CodingConvention.PropertyReference propertyReference) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypePropertyType typePropertyType) {}
            @Override
            public void setStereotype(Node n, JSDocInfo jsDocInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AliasSpec aliasSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.DelegateAndImplicitParams delegateAndImplicitParams) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Parameter parameter) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorSpec constructorSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeInfo typeInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.CallLinker callLinker) {}
            @Override
            public void setStereotype(Node n, CodingConvention.NodeContent nodeContent) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Source file) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionArgumentSpec functionArgumentSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorOverides constructorOverides) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AbstractMethodProperty abstractMethodProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.InterfaceExtendsInterface interfaceExtendsInterface) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ModuleLoader moduleLoader) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FieldReference fieldReference) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorOverload constructorOverload) {}
            @Override
            public void setStereotype(Node n, CodingConvention.InferredConstProperties inferredConstProperties) {}
            @Override
            public void setStereotype(Node n, CodingConvention.JsDocParameterSpec jsDocParameterSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Enum syntheticEnum) {}
            @Override
            public void setStereotype(Node n, CodingConvention.StatementKey statementKey) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeValidator typeValidator) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ClosureEquivalence closureEquivalence) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AssertionFunctionSpec assertionFunctionSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionPrototypeProperties functionPrototypeProperties) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeInfo typeInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ClosureAssignProperty closureAssignProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ObjectLiteralObjectKey objectLiteralObjectKey) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ThisType thisType) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstantId constantId) {}
            @Override
            public void setStereotype(Node n, CodingConvention.VariableReference variableReference) {}
            @Override
            public void setStereotype(Node n, JSType.PropagationPolicy propagationPolicy) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Abstract thisType) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Abstract classType) {}
            @Override
            public void setStereotype(Node n, JSDocInfo.Visibility visibility) {}
            @Override
            public void setStereotype(Node n, CodingConvention.NamedPropertySpec namedPropertySpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ObjectProperty objectProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionSignature functionSignature) {}
            @Override
            public void setStereotype(Node n, CodingConvention.VariableMap variableMap) {}
            @Override
            public void setStereotype(Node n, CodingConvention.PropertyReference propertyReference) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypePropertyType typePropertyType) {}
            @Override
            public void setStereotype(Node n, JSDocInfo jsDocInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AliasSpec aliasSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.DelegateAndImplicitParams delegateAndImplicitParams) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Parameter parameter) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorSpec constructorSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeInfo typeInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.CallLinker callLinker) {}
            @Override
            public void setStereotype(Node n, CodingConvention.NodeContent nodeContent) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Source file) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionArgumentSpec functionArgumentSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorOverides constructorOverides) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AbstractMethodProperty abstractMethodProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.InterfaceExtendsInterface interfaceExtendsInterface) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ModuleLoader moduleLoader) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FieldReference fieldReference) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorOverload constructorOverload) {}
            @Override
            public void setStereotype(Node n, CodingConvention.InferredConstProperties inferredConstProperties) {}
            @Override
            public void setStereotype(Node n, CodingConvention.JsDocParameterSpec jsDocParameterSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Enum syntheticEnum) {}
            @Override
            public void setStereotype(Node n, CodingConvention.StatementKey statementKey) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeValidator typeValidator) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ClosureEquivalence closureEquivalence) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AssertionFunctionSpec assertionFunctionSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionPrototypeProperties functionPrototypeProperties) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeInfo typeInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ClosureAssignProperty closureAssignProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ObjectLiteralObjectKey objectLiteralObjectKey) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ThisType thisType) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstantId constantId) {}
            @Override
            public void setStereotype(Node n, CodingConvention.VariableReference variableReference) {}
            @Override
            public void setStereotype(Node n, JSType.PropagationPolicy propagationPolicy) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Abstract thisType) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Abstract classType) {}
            @Override
            public void setStereotype(Node n, JSDocInfo.Visibility visibility) {}
            @Override
            public void setStereotype(Node n, CodingConvention.NamedPropertySpec namedPropertySpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ObjectProperty objectProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionSignature functionSignature) {}
            @Override
            public void setStereotype(Node n, CodingConvention.VariableMap variableMap) {}
            @Override
            public void setStereotype(Node n, CodingConvention.PropertyReference propertyReference) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypePropertyType typePropertyType) {}
            @Override
            public void setStereotype(Node n, JSDocInfo jsDocInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AliasSpec aliasSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.DelegateAndImplicitParams delegateAndImplicitParams) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Parameter parameter) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorSpec constructorSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeInfo typeInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.CallLinker callLinker) {}
            @Override
            public void setStereotype(Node n, CodingConvention.NodeContent nodeContent) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Source file) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionArgumentSpec functionArgumentSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorOverides constructorOverides) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AbstractMethodProperty abstractMethodProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.InterfaceExtendsInterface interfaceExtendsInterface) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ModuleLoader moduleLoader) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FieldReference fieldReference) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorOverload constructorOverload) {}
            @Override
            public void setStereotype(Node n, CodingConvention.InferredConstProperties inferredConstProperties) {}
            @Override
            public void setStereotype(Node n, CodingConvention.JsDocParameterSpec jsDocParameterSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Enum syntheticEnum) {}
            @Override
            public void setStereotype(Node n, CodingConvention.StatementKey statementKey) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeValidator typeValidator) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ClosureEquivalence closureEquivalence) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AssertionFunctionSpec assertionFunctionSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionPrototypeProperties functionPrototypeProperties) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeInfo typeInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ClosureAssignProperty closureAssignProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ObjectLiteralObjectKey objectLiteralObjectKey) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ThisType thisType) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstantId constantId) {}
            @Override
            public void setStereotype(Node n, CodingConvention.VariableReference variableReference) {}
            @Override
            public void setStereotype(Node n, JSType.PropagationPolicy propagationPolicy) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Abstract thisType) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Abstract classType) {}
            @Override
            public void setStereotype(Node n, JSDocInfo.Visibility visibility) {}
            @Override
            public void setStereotype(Node n, CodingConvention.NamedPropertySpec namedPropertySpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ObjectProperty objectProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionSignature functionSignature) {}
            @Override
            public void setStereotype(Node n, CodingConvention.VariableMap variableMap) {}
            @Override
            public void setStereotype(Node n, CodingConvention.PropertyReference propertyReference) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypePropertyType typePropertyType) {}
            @Override
            public void setStereotype(Node n, JSDocInfo jsDocInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AliasSpec aliasSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.DelegateAndImplicitParams delegateAndImplicitParams) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Parameter parameter) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorSpec constructorSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeInfo typeInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.CallLinker callLinker) {}
            @Override
            public void setStereotype(Node n, CodingConvention.NodeContent nodeContent) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Source file) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionArgumentSpec functionArgumentSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorOverides constructorOverides) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AbstractMethodProperty abstractMethodProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.InterfaceExtendsInterface interfaceExtendsInterface) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ModuleLoader moduleLoader) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FieldReference fieldReference) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorOverload constructorOverload) {}
            @Override
            public void setStereotype(Node n, CodingConvention.InferredConstProperties inferredConstProperties) {}
            @Override
            public void setStereotype(Node n, CodingConvention.JsDocParameterSpec jsDocParameterSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Enum syntheticEnum) {}
            @Override
            public void setStereotype(Node n, CodingConvention.StatementKey statementKey) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeValidator typeValidator) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ClosureEquivalence closureEquivalence) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AssertionFunctionSpec assertionFunctionSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionPrototypeProperties functionPrototypeProperties) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeInfo typeInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ClosureAssignProperty closureAssignProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ObjectLiteralObjectKey objectLiteralObjectKey) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ThisType thisType) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstantId constantId) {}
            @Override
            public void setStereotype(Node n, CodingConvention.VariableReference variableReference) {}
            @Override
            public void setStereotype(Node n, JSType.PropagationPolicy propagationPolicy) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Abstract thisType) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Abstract classType) {}
            @Override
            public void setStereotype(Node n, JSDocInfo.Visibility visibility) {}
            @Override
            public void setStereotype(Node n, CodingConvention.NamedPropertySpec namedPropertySpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ObjectProperty objectProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionSignature functionSignature) {}
            @Override
            public void setStereotype(Node n, CodingConvention.VariableMap variableMap) {}
            @Override
            public void setStereotype(Node n, CodingConvention.PropertyReference propertyReference) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypePropertyType typePropertyType) {}
            @Override
            public void setStereotype(Node n, JSDocInfo jsDocInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AliasSpec aliasSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.DelegateAndImplicitParams delegateAndImplicitParams) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Parameter parameter) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorSpec constructorSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeInfo typeInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.CallLinker callLinker) {}
            @Override
            public void setStereotype(Node n, CodingConvention.NodeContent nodeContent) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Source file) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionArgumentSpec functionArgumentSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorOverides constructorOverides) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AbstractMethodProperty abstractMethodProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.InterfaceExtendsInterface interfaceExtendsInterface) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ModuleLoader moduleLoader) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FieldReference fieldReference) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorOverload constructorOverload) {}
            @Override
            public void setStereotype(Node n, CodingConvention.InferredConstProperties inferredConstProperties) {}
            @Override
            public void setStereotype(Node n, CodingConvention.JsDocParameterSpec jsDocParameterSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Enum syntheticEnum) {}
            @Override
            public void setStereotype(Node n, CodingConvention.StatementKey statementKey) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeValidator typeValidator) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ClosureEquivalence closureEquivalence) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AssertionFunctionSpec assertionFunctionSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionPrototypeProperties functionPrototypeProperties) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeInfo typeInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ClosureAssignProperty closureAssignProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ObjectLiteralObjectKey objectLiteralObjectKey) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ThisType thisType) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstantId constantId) {}
            @Override
            public void setStereotype(Node n, CodingConvention.VariableReference variableReference) {}
            @Override
            public void setStereotype(Node n, JSType.PropagationPolicy propagationPolicy) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Abstract thisType) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Abstract classType) {}
            @Override
            public void setStereotype(Node n, JSDocInfo.Visibility visibility) {}
            @Override
            public void setStereotype(Node n, CodingConvention.NamedPropertySpec namedPropertySpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ObjectProperty objectProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionSignature functionSignature) {}
            @Override
            public void setStereotype(Node n, CodingConvention.VariableMap variableMap) {}
            @Override
            public void setStereotype(Node n, CodingConvention.PropertyReference propertyReference) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypePropertyType typePropertyType) {}
            @Override
            public void setStereotype(Node n, JSDocInfo jsDocInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AliasSpec aliasSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.DelegateAndImplicitParams delegateAndImplicitParams) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Parameter parameter) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorSpec constructorSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeInfo typeInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.CallLinker callLinker) {}
            @Override
            public void setStereotype(Node n, CodingConvention.NodeContent nodeContent) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Source file) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionArgumentSpec functionArgumentSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorOverides constructorOverides) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AbstractMethodProperty abstractMethodProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.InterfaceExtendsInterface interfaceExtendsInterface) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ModuleLoader moduleLoader) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FieldReference fieldReference) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorOverload constructorOverload) {}
            @Override
            public void setStereotype(Node n, CodingConvention.InferredConstProperties inferredConstProperties) {}
            @Override
            public void setStereotype(Node n, CodingConvention.JsDocParameterSpec jsDocParameterSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Enum syntheticEnum) {}
            @Override
            public void setStereotype(Node n, CodingConvention.StatementKey statementKey) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeValidator typeValidator) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ClosureEquivalence closureEquivalence) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AssertionFunctionSpec assertionFunctionSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionPrototypeProperties functionPrototypeProperties) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeInfo typeInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ClosureAssignProperty closureAssignProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ObjectLiteralObjectKey objectLiteralObjectKey) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ThisType thisType) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstantId constantId) {}
            @Override
            public void setStereotype(Node n, CodingConvention.VariableReference variableReference) {}
            @Override
            public void setStereotype(Node n, JSType.PropagationPolicy propagationPolicy) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Abstract thisType) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Abstract classType) {}
            @Override
            public void setStereotype(Node n, JSDocInfo.Visibility visibility) {}
            @Override
            public void setStereotype(Node n, CodingConvention.NamedPropertySpec namedPropertySpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ObjectProperty objectProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionSignature functionSignature) {}
            @Override
            public void setStereotype(Node n, CodingConvention.VariableMap variableMap) {}
            @Override
            public void setStereotype(Node n, CodingConvention.PropertyReference propertyReference) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypePropertyType typePropertyType) {}
            @Override
            public void setStereotype(Node n, JSDocInfo jsDocInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AliasSpec aliasSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.DelegateAndImplicitParams delegateAndImplicitParams) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Parameter parameter) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorSpec constructorSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeInfo typeInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.CallLinker callLinker) {}
            @Override
            public void setStereotype(Node n, CodingConvention.NodeContent nodeContent) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Source file) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionArgumentSpec functionArgumentSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorOverides constructorOverides) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AbstractMethodProperty abstractMethodProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.InterfaceExtendsInterface interfaceExtendsInterface) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ModuleLoader moduleLoader) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FieldReference fieldReference) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorOverload constructorOverload) {}
            @Override
            public void setStereotype(Node n, CodingConvention.InferredConstProperties inferredConstProperties) {}
            @Override
            public void setStereotype(Node n, CodingConvention.JsDocParameterSpec jsDocParameterSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Enum syntheticEnum) {}
            @Override
            public void setStereotype(Node n, CodingConvention.StatementKey statementKey) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeValidator typeValidator) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ClosureEquivalence closureEquivalence) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AssertionFunctionSpec assertionFunctionSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionPrototypeProperties functionPrototypeProperties) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeInfo typeInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ClosureAssignProperty closureAssignProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ObjectLiteralObjectKey objectLiteralObjectKey) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ThisType thisType) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstantId constantId) {}
            @Override
            public void setStereotype(Node n, CodingConvention.VariableReference variableReference) {}
            @Override
            public void setStereotype(Node n, JSType.PropagationPolicy propagationPolicy) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Abstract thisType) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Abstract classType) {}
            @Override
            public void setStereotype(Node n, JSDocInfo.Visibility visibility) {}
            @Override
            public void setStereotype(Node n, CodingConvention.NamedPropertySpec namedPropertySpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ObjectProperty objectProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionSignature functionSignature) {}
            @Override
            public void setStereotype(Node n, CodingConvention.VariableMap variableMap) {}
            @Override
            public void setStereotype(Node n, CodingConvention.PropertyReference propertyReference) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypePropertyType typePropertyType) {}
            @Override
            public void setStereotype(Node n, JSDocInfo jsDocInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AliasSpec aliasSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.DelegateAndImplicitParams delegateAndImplicitParams) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Parameter parameter) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorSpec constructorSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeInfo typeInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.CallLinker callLinker) {}
            @Override
            public void setStereotype(Node n, CodingConvention.NodeContent nodeContent) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Source file) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionArgumentSpec functionArgumentSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorOverides constructorOverides) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AbstractMethodProperty abstractMethodProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.InterfaceExtendsInterface interfaceExtendsInterface) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ModuleLoader moduleLoader) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FieldReference fieldReference) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorOverload constructorOverload) {}
            @Override
            public void setStereotype(Node n, CodingConvention.InferredConstProperties inferredConstProperties) {}
            @Override
            public void setStereotype(Node n, CodingConvention.JsDocParameterSpec jsDocParameterSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Enum syntheticEnum) {}
            @Override
            public void setStereotype(Node n, CodingConvention.StatementKey statementKey) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeValidator typeValidator) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ClosureEquivalence closureEquivalence) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AssertionFunctionSpec assertionFunctionSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionPrototypeProperties functionPrototypeProperties) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeInfo typeInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ClosureAssignProperty closureAssignProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ObjectLiteralObjectKey objectLiteralObjectKey) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ThisType thisType) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstantId constantId) {}
            @Override
            public void setStereotype(Node n, CodingConvention.VariableReference variableReference) {}
            @Override
            public void setStereotype(Node n, JSType.PropagationPolicy propagationPolicy) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Abstract thisType) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Abstract classType) {}
            @Override
            public void setStereotype(Node n, JSDocInfo.Visibility visibility) {}
            @Override
            public void setStereotype(Node n, CodingConvention.NamedPropertySpec namedPropertySpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ObjectProperty objectProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionSignature functionSignature) {}
            @Override
            public void setStereotype(Node n, CodingConvention.VariableMap variableMap) {}
            @Override
            public void setStereotype(Node n, CodingConvention.PropertyReference propertyReference) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypePropertyType typePropertyType) {}
            @Override
            public void setStereotype(Node n, JSDocInfo jsDocInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AliasSpec aliasSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.DelegateAndImplicitParams delegateAndImplicitParams) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Parameter parameter) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorSpec constructorSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeInfo typeInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.CallLinker callLinker) {}
            @Override
            public void setStereotype(Node n, CodingConvention.NodeContent nodeContent) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Source file) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionArgumentSpec functionArgumentSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorOverides constructorOverides) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AbstractMethodProperty abstractMethodProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.InterfaceExtendsInterface interfaceExtendsInterface) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ModuleLoader moduleLoader) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FieldReference fieldReference) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorOverload constructorOverload) {}
            @Override
            public void setStereotype(Node n, CodingConvention.InferredConstProperties inferredConstProperties) {}
            @Override
            public void setStereotype(Node n, CodingConvention.JsDocParameterSpec jsDocParameterSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Enum syntheticEnum) {}
            @Override
            public void setStereotype(Node n, CodingConvention.StatementKey statementKey) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeValidator typeValidator) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ClosureEquivalence closureEquivalence) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AssertionFunctionSpec assertionFunctionSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionPrototypeProperties functionPrototypeProperties) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeInfo typeInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ClosureAssignProperty closureAssignProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ObjectLiteralObjectKey objectLiteralObjectKey) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ThisType thisType) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstantId constantId) {}
            @Override
            public void setStereotype(Node n, CodingConvention.VariableReference variableReference) {}
            @Override
            public void setStereotype(Node n, JSType.PropagationPolicy propagationPolicy) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Abstract thisType) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Abstract classType) {}
            @Override
            public void setStereotype(Node n, JSDocInfo.Visibility visibility) {}
            @Override
            public void setStereotype(Node n, CodingConvention.NamedPropertySpec namedPropertySpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ObjectProperty objectProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionSignature functionSignature) {}
            @Override
            public void setStereotype(Node n, CodingConvention.VariableMap variableMap) {}
            @Override
            public void setStereotype(Node n, CodingConvention.PropertyReference propertyReference) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypePropertyType typePropertyType) {}
            @Override
            public void setStereotype(Node n, JSDocInfo jsDocInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AliasSpec aliasSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.DelegateAndImplicitParams delegateAndImplicitParams) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Parameter parameter) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorSpec constructorSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeInfo typeInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.CallLinker callLinker) {}
            @Override
            public void setStereotype(Node n, CodingConvention.NodeContent nodeContent) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Source file) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionArgumentSpec functionArgumentSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorOverides constructorOverides) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AbstractMethodProperty abstractMethodProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.InterfaceExtendsInterface interfaceExtendsInterface) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ModuleLoader moduleLoader) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FieldReference fieldReference) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorOverload constructorOverload) {}
            @Override
            public void setStereotype(Node n, CodingConvention.InferredConstProperties inferredConstProperties) {}
            @Override
            public void setStereotype(Node n, CodingConvention.JsDocParameterSpec jsDocParameterSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Enum syntheticEnum) {}
            @Override
            public void setStereotype(Node n, CodingConvention.StatementKey statementKey) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeValidator typeValidator) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ClosureEquivalence closureEquivalence) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AssertionFunctionSpec assertionFunctionSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionPrototypeProperties functionPrototypeProperties) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeInfo typeInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ClosureAssignProperty closureAssignProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ObjectLiteralObjectKey objectLiteralObjectKey) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ThisType thisType) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstantId constantId) {}
            @Override
            public void setStereotype(Node n, CodingConvention.VariableReference variableReference) {}
            @Override
            public void setStereotype(Node n, JSType.PropagationPolicy propagationPolicy) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Abstract thisType) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Abstract classType) {}
            @Override
            public void setStereotype(Node n, JSDocInfo.Visibility visibility) {}
            @Override
            public void setStereotype(Node n, CodingConvention.NamedPropertySpec namedPropertySpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ObjectProperty objectProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionSignature functionSignature) {}
            @Override
            public void setStereotype(Node n, CodingConvention.VariableMap variableMap) {}
            @Override
            public void setStereotype(Node n, CodingConvention.PropertyReference propertyReference) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypePropertyType typePropertyType) {}
            @Override
            public void setStereotype(Node n, JSDocInfo jsDocInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AliasSpec aliasSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.DelegateAndImplicitParams delegateAndImplicitParams) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Parameter parameter) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorSpec constructorSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeInfo typeInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.CallLinker callLinker) {}
            @Override
            public void setStereotype(Node n, CodingConvention.NodeContent nodeContent) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Source file) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionArgumentSpec functionArgumentSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorOverides constructorOverides) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AbstractMethodProperty abstractMethodProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.InterfaceExtendsInterface interfaceExtendsInterface) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ModuleLoader moduleLoader) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FieldReference fieldReference) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorOverload constructorOverload) {}
            @Override
            public void setStereotype(Node n, CodingConvention.InferredConstProperties inferredConstProperties) {}
            @Override
            public void setStereotype(Node n, CodingConvention.JsDocParameterSpec jsDocParameterSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Enum syntheticEnum) {}
            @Override
            public void setStereotype(Node n, CodingConvention.StatementKey statementKey) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeValidator typeValidator) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ClosureEquivalence closureEquivalence) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AssertionFunctionSpec assertionFunctionSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionPrototypeProperties functionPrototypeProperties) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeInfo typeInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ClosureAssignProperty closureAssignProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ObjectLiteralObjectKey objectLiteralObjectKey) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ThisType thisType) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstantId constantId) {}
            @Override
            public void setStereotype(Node n, CodingConvention.VariableReference variableReference) {}
            @Override
            public void setStereotype(Node n, JSType.PropagationPolicy propagationPolicy) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Abstract thisType) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Abstract classType) {}
            @Override
            public void setStereotype(Node n, JSDocInfo.Visibility visibility) {}
            @Override
            public void setStereotype(Node n, CodingConvention.NamedPropertySpec namedPropertySpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ObjectProperty objectProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionSignature functionSignature) {}
            @Override
            public void setStereotype(Node n, CodingConvention.VariableMap variableMap) {}
            @Override
            public void setStereotype(Node n, CodingConvention.PropertyReference propertyReference) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypePropertyType typePropertyType) {}
            @Override
            public void setStereotype(Node n, JSDocInfo jsDocInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AliasSpec aliasSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.DelegateAndImplicitParams delegateAndImplicitParams) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Parameter parameter) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorSpec constructorSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeInfo typeInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.CallLinker callLinker) {}
            @Override
            public void setStereotype(Node n, CodingConvention.NodeContent nodeContent) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Source file) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionArgumentSpec functionArgumentSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorOverides constructorOverides) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AbstractMethodProperty abstractMethodProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.InterfaceExtendsInterface interfaceExtendsInterface) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ModuleLoader moduleLoader) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FieldReference fieldReference) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorOverload constructorOverload) {}
            @Override
            public void setStereotype(Node n, CodingConvention.InferredConstProperties inferredConstProperties) {}
            @Override
            public void setStereotype(Node n, CodingConvention.JsDocParameterSpec jsDocParameterSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Enum syntheticEnum) {}
            @Override
            public void setStereotype(Node n, CodingConvention.StatementKey statementKey) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeValidator typeValidator) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ClosureEquivalence closureEquivalence) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AssertionFunctionSpec assertionFunctionSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionPrototypeProperties functionPrototypeProperties) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeInfo typeInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ClosureAssignProperty closureAssignProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ObjectLiteralObjectKey objectLiteralObjectKey) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ThisType thisType) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstantId constantId) {}
            @Override
            public void setStereotype(Node n, CodingConvention.VariableReference variableReference) {}
            @Override
            public void setStereotype(Node n, JSType.PropagationPolicy propagationPolicy) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Abstract thisType) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Abstract classType) {}
            @Override
            public void setStereotype(Node n, JSDocInfo.Visibility visibility) {}
            @Override
            public void setStereotype(Node n, CodingConvention.NamedPropertySpec namedPropertySpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ObjectProperty objectProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionSignature functionSignature) {}
            @Override
            public void setStereotype(Node n, CodingConvention.VariableMap variableMap) {}
            @Override
            public void setStereotype(Node n, CodingConvention.PropertyReference propertyReference) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypePropertyType typePropertyType) {}
            @Override
            public void setStereotype(Node n, JSDocInfo jsDocInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AliasSpec aliasSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.DelegateAndImplicitParams delegateAndImplicitParams) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Parameter parameter) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorSpec constructorSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeInfo typeInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.CallLinker callLinker) {}
            @Override
            public void setStereotype(Node n, CodingConvention.NodeContent nodeContent) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Source file) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionArgumentSpec functionArgumentSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorOverides constructorOverides) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AbstractMethodProperty abstractMethodProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.InterfaceExtendsInterface interfaceExtendsInterface) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ModuleLoader moduleLoader) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FieldReference fieldReference) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorOverload constructorOverload) {}
            @Override
            public void setStereotype(Node n, CodingConvention.InferredConstProperties inferredConstProperties) {}
            @Override
            public void setStereotype(Node n, CodingConvention.JsDocParameterSpec jsDocParameterSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Enum syntheticEnum) {}
            @Override
            public void setStereotype(Node n, CodingConvention.StatementKey statementKey) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeValidator typeValidator) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ClosureEquivalence closureEquivalence) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AssertionFunctionSpec assertionFunctionSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionPrototypeProperties functionPrototypeProperties) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeInfo typeInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ClosureAssignProperty closureAssignProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ObjectLiteralObjectKey objectLiteralObjectKey) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ThisType thisType) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstantId constantId) {}
            @Override
            public void setStereotype(Node n, CodingConvention.VariableReference variableReference) {}
            @Override
            public void setStereotype(Node n, JSType.PropagationPolicy propagationPolicy) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Abstract thisType) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Abstract classType) {}
            @Override
            public void setStereotype(Node n, JSDocInfo.Visibility visibility) {}
            @Override
            public void setStereotype(Node n, CodingConvention.NamedPropertySpec namedPropertySpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ObjectProperty objectProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionSignature functionSignature) {}
            @Override
            public void setStereotype(Node n, CodingConvention.VariableMap variableMap) {}
            @Override
            public void setStereotype(Node n, CodingConvention.PropertyReference propertyReference) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypePropertyType typePropertyType) {}
            @Override
            public void setStereotype(Node n, JSDocInfo jsDocInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AliasSpec aliasSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.DelegateAndImplicitParams delegateAndImplicitParams) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Parameter parameter) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorSpec constructorSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeInfo typeInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.CallLinker callLinker) {}
            @Override
            public void setStereotype(Node n, CodingConvention.NodeContent nodeContent) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Source file) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionArgumentSpec functionArgumentSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorOverides constructorOverides) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AbstractMethodProperty abstractMethodProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.InterfaceExtendsInterface interfaceExtendsInterface) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ModuleLoader moduleLoader) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FieldReference fieldReference) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorOverload constructorOverload) {}
            @Override
            public void setStereotype(Node n, CodingConvention.InferredConstProperties inferredConstProperties) {}
            @Override
            public void setStereotype(Node n, CodingConvention.JsDocParameterSpec jsDocParameterSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Enum syntheticEnum) {}
            @Override
            public void setStereotype(Node n, CodingConvention.StatementKey statementKey) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeValidator typeValidator) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ClosureEquivalence closureEquivalence) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AssertionFunctionSpec assertionFunctionSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionPrototypeProperties functionPrototypeProperties) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeInfo typeInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ClosureAssignProperty closureAssignProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ObjectLiteralObjectKey objectLiteralObjectKey) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ThisType thisType) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstantId constantId) {}
            @Override
            public void setStereotype(Node n, CodingConvention.VariableReference variableReference) {}
            @Override
            public void setStereotype(Node n, JSType.PropagationPolicy propagationPolicy) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Abstract thisType) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Abstract classType) {}
            @Override
            public void setStereotype(Node n, JSDocInfo.Visibility visibility) {}
            @Override
            public void setStereotype(Node n, CodingConvention.NamedPropertySpec namedPropertySpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ObjectProperty objectProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionSignature functionSignature) {}
            @Override
            public void setStereotype(Node n, CodingConvention.VariableMap variableMap) {}
            @Override
            public void setStereotype(Node n, CodingConvention.PropertyReference propertyReference) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypePropertyType typePropertyType) {}
            @Override
            public void setStereotype(Node n, JSDocInfo jsDocInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AliasSpec aliasSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.DelegateAndImplicitParams delegateAndImplicitParams) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Parameter parameter) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorSpec constructorSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeInfo typeInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.CallLinker callLinker) {}
            @Override
            public void setStereotype(Node n, CodingConvention.NodeContent nodeContent) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Source file) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionArgumentSpec functionArgumentSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorOverides constructorOverides) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AbstractMethodProperty abstractMethodProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.InterfaceExtendsInterface interfaceExtendsInterface) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ModuleLoader moduleLoader) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FieldReference fieldReference) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorOverload constructorOverload) {}
            @Override
            public void setStereotype(Node n, CodingConvention.InferredConstProperties inferredConstProperties) {}
            @Override
            public void setStereotype(Node n, CodingConvention.JsDocParameterSpec jsDocParameterSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Enum syntheticEnum) {}
            @Override
            public void setStereotype(Node n, CodingConvention.StatementKey statementKey) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeValidator typeValidator) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ClosureEquivalence closureEquivalence) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AssertionFunctionSpec assertionFunctionSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionPrototypeProperties functionPrototypeProperties) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeInfo typeInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ClosureAssignProperty closureAssignProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ObjectLiteralObjectKey objectLiteralObjectKey) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ThisType thisType) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstantId constantId) {}
            @Override
            public void setStereotype(Node n, CodingConvention.VariableReference variableReference) {}
            @Override
            public void setStereotype(Node n, JSType.PropagationPolicy propagationPolicy) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Abstract thisType) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Abstract classType) {}
            @Override
            public void setStereotype(Node n, JSDocInfo.Visibility visibility) {}
            @Override
            public void setStereotype(Node n, CodingConvention.NamedPropertySpec namedPropertySpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ObjectProperty objectProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionSignature functionSignature) {}
            @Override
            public void setStereotype(Node n, CodingConvention.VariableMap variableMap) {}
            @Override
            public void setStereotype(Node n, CodingConvention.PropertyReference propertyReference) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypePropertyType typePropertyType) {}
            @Override
            public void setStereotype(Node n, JSDocInfo jsDocInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AliasSpec aliasSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.DelegateAndImplicitParams delegateAndImplicitParams) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Parameter parameter) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorSpec constructorSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeInfo typeInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.CallLinker callLinker) {}
            @Override
            public void setStereotype(Node n, CodingConvention.NodeContent nodeContent) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Source file) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionArgumentSpec functionArgumentSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorOverides constructorOverides) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AbstractMethodProperty abstractMethodProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.InterfaceExtendsInterface interfaceExtendsInterface) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ModuleLoader moduleLoader) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FieldReference fieldReference) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorOverload constructorOverload) {}
            @Override
            public void setStereotype(Node n, CodingConvention.InferredConstProperties inferredConstProperties) {}
            @Override
            public void setStereotype(Node n, CodingConvention.JsDocParameterSpec jsDocParameterSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Enum syntheticEnum) {}
            @Override
            public void setStereotype(Node n, CodingConvention.StatementKey statementKey) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeValidator typeValidator) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ClosureEquivalence closureEquivalence) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AssertionFunctionSpec assertionFunctionSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionPrototypeProperties functionPrototypeProperties) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeInfo typeInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ClosureAssignProperty closureAssignProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ObjectLiteralObjectKey objectLiteralObjectKey) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ThisType thisType) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstantId constantId) {}
            @Override
            public void setStereotype(Node n, CodingConvention.VariableReference variableReference) {}
            @Override
            public void setStereotype(Node n, JSType.PropagationPolicy propagationPolicy) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Abstract thisType) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Abstract classType) {}
            @Override
            public void setStereotype(Node n, JSDocInfo.Visibility visibility) {}
            @Override
            public void setStereotype(Node n, CodingConvention.NamedPropertySpec namedPropertySpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ObjectProperty objectProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionSignature functionSignature) {}
            @Override
            public void setStereotype(Node n, CodingConvention.VariableMap variableMap) {}
            @Override
            public void setStereotype(Node n, CodingConvention.PropertyReference propertyReference) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypePropertyType typePropertyType) {}
            @Override
            public void setStereotype(Node n, JSDocInfo jsDocInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AliasSpec aliasSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.DelegateAndImplicitParams delegateAndImplicitParams) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Parameter parameter) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorSpec constructorSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeInfo typeInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.CallLinker callLinker) {}
            @Override
            public void setStereotype(Node n, CodingConvention.NodeContent nodeContent) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Source file) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionArgumentSpec functionArgumentSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorOverides constructorOverides) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AbstractMethodProperty abstractMethodProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.InterfaceExtendsInterface interfaceExtendsInterface) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ModuleLoader moduleLoader) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FieldReference fieldReference) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorOverload constructorOverload) {}
            @Override
            public void setStereotype(Node n, CodingConvention.InferredConstProperties inferredConstProperties) {}
            @Override
            public void setStereotype(Node n, CodingConvention.JsDocParameterSpec jsDocParameterSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Enum syntheticEnum) {}
            @Override
            public void setStereotype(Node n, CodingConvention.StatementKey statementKey) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeValidator typeValidator) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ClosureEquivalence closureEquivalence) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AssertionFunctionSpec assertionFunctionSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionPrototypeProperties functionPrototypeProperties) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeInfo typeInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ClosureAssignProperty closureAssignProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ObjectLiteralObjectKey objectLiteralObjectKey) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ThisType thisType) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstantId constantId) {}
            @Override
            public void setStereotype(Node n, CodingConvention.VariableReference variableReference) {}
            @Override
            public void setStereotype(Node n, JSType.PropagationPolicy propagationPolicy) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Abstract thisType) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Abstract classType) {}
            @Override
            public void setStereotype(Node n, JSDocInfo.Visibility visibility) {}
            @Override
            public void setStereotype(Node n, CodingConvention.NamedPropertySpec namedPropertySpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ObjectProperty objectProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionSignature functionSignature) {}
            @Override
            public void setStereotype(Node n, CodingConvention.VariableMap variableMap) {}
            @Override
            public void setStereotype(Node n, CodingConvention.PropertyReference propertyReference) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypePropertyType typePropertyType) {}
            @Override
            public void setStereotype(Node n, JSDocInfo jsDocInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AliasSpec aliasSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.DelegateAndImplicitParams delegateAndImplicitParams) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Parameter parameter) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorSpec constructorSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeInfo typeInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.CallLinker callLinker) {}
            @Override
            public void setStereotype(Node n, CodingConvention.NodeContent nodeContent) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Source file) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionArgumentSpec functionArgumentSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorOverides constructorOverides) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AbstractMethodProperty abstractMethodProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.InterfaceExtendsInterface interfaceExtendsInterface) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ModuleLoader moduleLoader) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FieldReference fieldReference) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorOverload constructorOverload) {}
            @Override
            public void setStereotype(Node n, CodingConvention.InferredConstProperties inferredConstProperties) {}
            @Override
            public void setStereotype(Node n, CodingConvention.JsDocParameterSpec jsDocParameterSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Enum syntheticEnum) {}
            @Override
            public void setStereotype(Node n, CodingConvention.StatementKey statementKey) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeValidator typeValidator) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ClosureEquivalence closureEquivalence) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AssertionFunctionSpec assertionFunctionSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionPrototypeProperties functionPrototypeProperties) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeInfo typeInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ClosureAssignProperty closureAssignProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ObjectLiteralObjectKey objectLiteralObjectKey) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ThisType thisType) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstantId constantId) {}
            @Override
            public void setStereotype(Node n, CodingConvention.VariableReference variableReference) {}
            @Override
            public void setStereotype(Node n, JSType.PropagationPolicy propagationPolicy) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Abstract thisType) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Abstract classType) {}
            @Override
            public void setStereotype(Node n, JSDocInfo.Visibility visibility) {}
            @Override
            public void setStereotype(Node n, CodingConvention.NamedPropertySpec namedPropertySpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ObjectProperty objectProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionSignature functionSignature) {}
            @Override
            public void setStereotype(Node n, CodingConvention.VariableMap variableMap) {}
            @Override
            public void setStereotype(Node n, CodingConvention.PropertyReference propertyReference) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypePropertyType typePropertyType) {}
            @Override
            public void setStereotype(Node n, JSDocInfo jsDocInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AliasSpec aliasSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.DelegateAndImplicitParams delegateAndImplicitParams) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Parameter parameter) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorSpec constructorSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeInfo typeInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.CallLinker callLinker) {}
            @Override
            public void setStereotype(Node n, CodingConvention.NodeContent nodeContent) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Source file) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionArgumentSpec functionArgumentSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorOverides constructorOverides) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AbstractMethodProperty abstractMethodProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.InterfaceExtendsInterface interfaceExtendsInterface) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ModuleLoader moduleLoader) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FieldReference fieldReference) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorOverload constructorOverload) {}
            @Override
            public void setStereotype(Node n, CodingConvention.InferredConstProperties inferredConstProperties) {}
            @Override
            public void setStereotype(Node n, CodingConvention.JsDocParameterSpec jsDocParameterSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Enum syntheticEnum) {}
            @Override
            public void setStereotype(Node n, CodingConvention.StatementKey statementKey) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeValidator typeValidator) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ClosureEquivalence closureEquivalence) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AssertionFunctionSpec assertionFunctionSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionPrototypeProperties functionPrototypeProperties) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeInfo typeInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ClosureAssignProperty closureAssignProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ObjectLiteralObjectKey objectLiteralObjectKey) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ThisType thisType) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstantId constantId) {}
            @Override
            public void setStereotype(Node n, CodingConvention.VariableReference variableReference) {}
            @Override
            public void setStereotype(Node n, JSType.PropagationPolicy propagationPolicy) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Abstract thisType) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Abstract classType) {}
            @Override
            public void setStereotype(Node n, JSDocInfo.Visibility visibility) {}
            @Override
            public void setStereotype(Node n, CodingConvention.NamedPropertySpec namedPropertySpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ObjectProperty objectProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionSignature functionSignature) {}
            @Override
            public void setStereotype(Node n, CodingConvention.VariableMap variableMap) {}
            @Override
            public void setStereotype(Node n, CodingConvention.PropertyReference propertyReference) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypePropertyType typePropertyType) {}
            @Override
            public void setStereotype(Node n, JSDocInfo jsDocInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AliasSpec aliasSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.DelegateAndImplicitParams delegateAndImplicitParams) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Parameter parameter) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorSpec constructorSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeInfo typeInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.CallLinker callLinker) {}
            @Override
            public void setStereotype(Node n, CodingConvention.NodeContent nodeContent) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Source file) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionArgumentSpec functionArgumentSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorOverides constructorOverides) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AbstractMethodProperty abstractMethodProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.InterfaceExtendsInterface interfaceExtendsInterface) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ModuleLoader moduleLoader) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FieldReference fieldReference) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorOverload constructorOverload) {}
            @Override
            public void setStereotype(Node n, CodingConvention.InferredConstProperties inferredConstProperties) {}
            @Override
            public void setStereotype(Node n, CodingConvention.JsDocParameterSpec jsDocParameterSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Enum syntheticEnum) {}
            @Override
            public void setStereotype(Node n, CodingConvention.StatementKey statementKey) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeValidator typeValidator) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ClosureEquivalence closureEquivalence) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AssertionFunctionSpec assertionFunctionSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionPrototypeProperties functionPrototypeProperties) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeInfo typeInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ClosureAssignProperty closureAssignProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ObjectLiteralObjectKey objectLiteralObjectKey) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ThisType thisType) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstantId constantId) {}
            @Override
            public void setStereotype(Node n, CodingConvention.VariableReference variableReference) {}
            @Override
            public void setStereotype(Node n, JSType.PropagationPolicy propagationPolicy) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Abstract thisType) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Abstract classType) {}
            @Override
            public void setStereotype(Node n, JSDocInfo.Visibility visibility) {}
            @Override
            public void setStereotype(Node n, CodingConvention.NamedPropertySpec namedPropertySpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ObjectProperty objectProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionSignature functionSignature) {}
            @Override
            public void setStereotype(Node n, CodingConvention.VariableMap variableMap) {}
            @Override
            public void setStereotype(Node n, CodingConvention.PropertyReference propertyReference) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypePropertyType typePropertyType) {}
            @Override
            public void setStereotype(Node n, JSDocInfo jsDocInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AliasSpec aliasSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.DelegateAndImplicitParams delegateAndImplicitParams) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Parameter parameter) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorSpec constructorSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeInfo typeInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.CallLinker callLinker) {}
            @Override
            public void setStereotype(Node n, CodingConvention.NodeContent nodeContent) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Source file) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionArgumentSpec functionArgumentSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorOverides constructorOverides) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AbstractMethodProperty abstractMethodProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.InterfaceExtendsInterface interfaceExtendsInterface) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ModuleLoader moduleLoader) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FieldReference fieldReference) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorOverload constructorOverload) {}
            @Override
            public void setStereotype(Node n, CodingConvention.InferredConstProperties inferredConstProperties) {}
            @Override
            public void setStereotype(Node n, CodingConvention.JsDocParameterSpec jsDocParameterSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Enum syntheticEnum) {}
            @Override
            public void setStereotype(Node n, CodingConvention.StatementKey statementKey) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeValidator typeValidator) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ClosureEquivalence closureEquivalence) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AssertionFunctionSpec assertionFunctionSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionPrototypeProperties functionPrototypeProperties) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeInfo typeInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ClosureAssignProperty closureAssignProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ObjectLiteralObjectKey objectLiteralObjectKey) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ThisType thisType) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstantId constantId) {}
            @Override
            public void setStereotype(Node n, CodingConvention.VariableReference variableReference) {}
            @Override
            public void setStereotype(Node n, JSType.PropagationPolicy propagationPolicy) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Abstract thisType) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Abstract classType) {}
            @Override
            public void setStereotype(Node n, JSDocInfo.Visibility visibility) {}
            @Override
            public void setStereotype(Node n, CodingConvention.NamedPropertySpec namedPropertySpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ObjectProperty objectProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionSignature functionSignature) {}
            @Override
            public void setStereotype(Node n, CodingConvention.VariableMap variableMap) {}
            @Override
            public void setStereotype(Node n, CodingConvention.PropertyReference propertyReference) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypePropertyType typePropertyType) {}
            @Override
            public void setStereotype(Node n, JSDocInfo jsDocInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AliasSpec aliasSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.DelegateAndImplicitParams delegateAndImplicitParams) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Parameter parameter) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorSpec constructorSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeInfo typeInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.CallLinker callLinker) {}
            @Override
            public void setStereotype(Node n, CodingConvention.NodeContent nodeContent) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Source file) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionArgumentSpec functionArgumentSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorOverides constructorOverides) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AbstractMethodProperty abstractMethodProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.InterfaceExtendsInterface interfaceExtendsInterface) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ModuleLoader moduleLoader) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FieldReference fieldReference) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorOverload constructorOverload) {}
            @Override
            public void setStereotype(Node n, CodingConvention.InferredConstProperties inferredConstProperties) {}
            @Override
            public void setStereotype(Node n, CodingConvention.JsDocParameterSpec jsDocParameterSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Enum syntheticEnum) {}
            @Override
            public void setStereotype(Node n, CodingConvention.StatementKey statementKey) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeValidator typeValidator) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ClosureEquivalence closureEquivalence) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AssertionFunctionSpec assertionFunctionSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionPrototypeProperties functionPrototypeProperties) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeInfo typeInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ClosureAssignProperty closureAssignProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ObjectLiteralObjectKey objectLiteralObjectKey) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ThisType thisType) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstantId constantId) {}
            @Override
            public void setStereotype(Node n, CodingConvention.VariableReference variableReference) {}
            @Override
            public void setStereotype(Node n, JSType.PropagationPolicy propagationPolicy) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Abstract thisType) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Abstract classType) {}
            @Override
            public void setStereotype(Node n, JSDocInfo.Visibility visibility) {}
            @Override
            public void setStereotype(Node n, CodingConvention.NamedPropertySpec namedPropertySpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ObjectProperty objectProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionSignature functionSignature) {}
            @Override
            public void setStereotype(Node n, CodingConvention.VariableMap variableMap) {}
            @Override
            public void setStereotype(Node n, CodingConvention.PropertyReference propertyReference) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypePropertyType typePropertyType) {}
            @Override
            public void setStereotype(Node n, JSDocInfo jsDocInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AliasSpec aliasSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.DelegateAndImplicitParams delegateAndImplicitParams) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Parameter parameter) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorSpec constructorSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeInfo typeInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.CallLinker callLinker) {}
            @Override
            public void setStereotype(Node n, CodingConvention.NodeContent nodeContent) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Source file) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionArgumentSpec functionArgumentSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorOverides constructorOverides) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AbstractMethodProperty abstractMethodProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.InterfaceExtendsInterface interfaceExtendsInterface) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ModuleLoader moduleLoader) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FieldReference fieldReference) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorOverload constructorOverload) {}
            @Override
            public void setStereotype(Node n, CodingConvention.InferredConstProperties inferredConstProperties) {}
            @Override
            public void setStereotype(Node n, CodingConvention.JsDocParameterSpec jsDocParameterSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Enum syntheticEnum) {}
            @Override
            public void setStereotype(Node n, CodingConvention.StatementKey statementKey) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeValidator typeValidator) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ClosureEquivalence closureEquivalence) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AssertionFunctionSpec assertionFunctionSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionPrototypeProperties functionPrototypeProperties) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeInfo typeInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ClosureAssignProperty closureAssignProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ObjectLiteralObjectKey objectLiteralObjectKey) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ThisType thisType) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstantId constantId) {}
            @Override
            public void setStereotype(Node n, CodingConvention.VariableReference variableReference) {}
            @Override
            public void setStereotype(Node n, JSType.PropagationPolicy propagationPolicy) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Abstract thisType) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Abstract classType) {}
            @Override
            public void setStereotype(Node n, JSDocInfo.Visibility visibility) {}
            @Override
            public void setStereotype(Node n, CodingConvention.NamedPropertySpec namedPropertySpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ObjectProperty objectProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionSignature functionSignature) {}
            @Override
            public void setStereotype(Node n, CodingConvention.VariableMap variableMap) {}
            @Override
            public void setStereotype(Node n, CodingConvention.PropertyReference propertyReference) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypePropertyType typePropertyType) {}
            @Override
            public void setStereotype(Node n, JSDocInfo jsDocInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AliasSpec aliasSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.DelegateAndImplicitParams delegateAndImplicitParams) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Parameter parameter) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorSpec constructorSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeInfo typeInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.CallLinker callLinker) {}
            @Override
            public void setStereotype(Node n, CodingConvention.NodeContent nodeContent) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Source file) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionArgumentSpec functionArgumentSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorOverides constructorOverides) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AbstractMethodProperty abstractMethodProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.InterfaceExtendsInterface interfaceExtendsInterface) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ModuleLoader moduleLoader) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FieldReference fieldReference) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorOverload constructorOverload) {}
            @Override
            public void setStereotype(Node n, CodingConvention.InferredConstProperties inferredConstProperties) {}
            @Override
            public void setStereotype(Node n, CodingConvention.JsDocParameterSpec jsDocParameterSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Enum syntheticEnum) {}
            @Override
            public void setStereotype(Node n, CodingConvention.StatementKey statementKey) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeValidator typeValidator) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ClosureEquivalence closureEquivalence) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AssertionFunctionSpec assertionFunctionSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionPrototypeProperties functionPrototypeProperties) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeInfo typeInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ClosureAssignProperty closureAssignProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ObjectLiteralObjectKey objectLiteralObjectKey) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ThisType thisType) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstantId constantId) {}
            @Override
            public void setStereotype(Node n, CodingConvention.VariableReference variableReference) {}
            @Override
            public void setStereotype(Node n, JSType.PropagationPolicy propagationPolicy) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Abstract thisType) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Abstract classType) {}
            @Override
            public void setStereotype(Node n, JSDocInfo.Visibility visibility) {}
            @Override
            public void setStereotype(Node n, CodingConvention.NamedPropertySpec namedPropertySpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ObjectProperty objectProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionSignature functionSignature) {}
            @Override
            public void setStereotype(Node n, CodingConvention.VariableMap variableMap) {}
            @Override
            public void setStereotype(Node n, CodingConvention.PropertyReference propertyReference) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypePropertyType typePropertyType) {}
            @Override
            public void setStereotype(Node n, JSDocInfo jsDocInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AliasSpec aliasSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.DelegateAndImplicitParams delegateAndImplicitParams) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Parameter parameter) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorSpec constructorSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeInfo typeInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.CallLinker callLinker) {}
            @Override
            public void setStereotype(Node n, CodingConvention.NodeContent nodeContent) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Source file) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionArgumentSpec functionArgumentSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorOverides constructorOverides) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AbstractMethodProperty abstractMethodProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.InterfaceExtendsInterface interfaceExtendsInterface) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ModuleLoader moduleLoader) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FieldReference fieldReference) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorOverload constructorOverload) {}
            @Override
            public void setStereotype(Node n, CodingConvention.InferredConstProperties inferredConstProperties) {}
            @Override
            public void setStereotype(Node n, CodingConvention.JsDocParameterSpec jsDocParameterSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Enum syntheticEnum) {}
            @Override
            public void setStereotype(Node n, CodingConvention.StatementKey statementKey) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeValidator typeValidator) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ClosureEquivalence closureEquivalence) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AssertionFunctionSpec assertionFunctionSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionPrototypeProperties functionPrototypeProperties) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeInfo typeInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ClosureAssignProperty closureAssignProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ObjectLiteralObjectKey objectLiteralObjectKey) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ThisType thisType) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstantId constantId) {}
            @Override
            public void setStereotype(Node n, CodingConvention.VariableReference variableReference) {}
            @Override
            public void setStereotype(Node n, JSType.PropagationPolicy propagationPolicy) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Abstract thisType) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Abstract classType) {}
            @Override
            public void setStereotype(Node n, JSDocInfo.Visibility visibility) {}
            @Override
            public void setStereotype(Node n, CodingConvention.NamedPropertySpec namedPropertySpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ObjectProperty objectProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionSignature functionSignature) {}
            @Override
            public void setStereotype(Node n, CodingConvention.VariableMap variableMap) {}
            @Override
            public void setStereotype(Node n, CodingConvention.PropertyReference propertyReference) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypePropertyType typePropertyType) {}
            @Override
            public void setStereotype(Node n, JSDocInfo jsDocInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AliasSpec aliasSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.DelegateAndImplicitParams delegateAndImplicitParams) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Parameter parameter) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorSpec constructorSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeInfo typeInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.CallLinker callLinker) {}
            @Override
            public void setStereotype(Node n, CodingConvention.NodeContent nodeContent) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Source file) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionArgumentSpec functionArgumentSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorOverides constructorOverides) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AbstractMethodProperty abstractMethodProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.InterfaceExtendsInterface interfaceExtendsInterface) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ModuleLoader moduleLoader) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FieldReference fieldReference) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorOverload constructorOverload) {}
            @Override
            public void setStereotype(Node n, CodingConvention.InferredConstProperties inferredConstProperties) {}
            @Override
            public void setStereotype(Node n, CodingConvention.JsDocParameterSpec jsDocParameterSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Enum syntheticEnum) {}
            @Override
            public void setStereotype(Node n, CodingConvention.StatementKey statementKey) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeValidator typeValidator) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ClosureEquivalence closureEquivalence) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AssertionFunctionSpec assertionFunctionSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionPrototypeProperties functionPrototypeProperties) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeInfo typeInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ClosureAssignProperty closureAssignProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ObjectLiteralObjectKey objectLiteralObjectKey) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ThisType thisType) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstantId constantId) {}
            @Override
            public void setStereotype(Node n, CodingConvention.VariableReference variableReference) {}
            @Override
            public void setStereotype(Node n, JSType.PropagationPolicy propagationPolicy) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Abstract thisType) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Abstract classType) {}
            @Override
            public void setStereotype(Node n, JSDocInfo.Visibility visibility) {}
            @Override
            public void setStereotype(Node n, CodingConvention.NamedPropertySpec namedPropertySpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ObjectProperty objectProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionSignature functionSignature) {}
            @Override
            public void setStereotype(Node n, CodingConvention.VariableMap variableMap) {}
            @Override
            public void setStereotype(Node n, CodingConvention.PropertyReference propertyReference) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypePropertyType typePropertyType) {}
            @Override
            public void setStereotype(Node n, JSDocInfo jsDocInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AliasSpec aliasSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.DelegateAndImplicitParams delegateAndImplicitParams) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Parameter parameter) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorSpec constructorSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeInfo typeInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.CallLinker callLinker) {}
            @Override
            public void setStereotype(Node n, CodingConvention.NodeContent nodeContent) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Source file) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionArgumentSpec functionArgumentSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorOverides constructorOverides) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AbstractMethodProperty abstractMethodProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.InterfaceExtendsInterface interfaceExtendsInterface) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ModuleLoader moduleLoader) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FieldReference fieldReference) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorOverload constructorOverload) {}
            @Override
            public void setStereotype(Node n, CodingConvention.InferredConstProperties inferredConstProperties) {}
            @Override
            public void setStereotype(Node n, CodingConvention.JsDocParameterSpec jsDocParameterSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Enum syntheticEnum) {}
            @Override
            public void setStereotype(Node n, CodingConvention.StatementKey statementKey) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeValidator typeValidator) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ClosureEquivalence closureEquivalence) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AssertionFunctionSpec assertionFunctionSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionPrototypeProperties functionPrototypeProperties) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeInfo typeInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ClosureAssignProperty closureAssignProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ObjectLiteralObjectKey objectLiteralObjectKey) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ThisType thisType) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstantId constantId) {}
            @Override
            public void setStereotype(Node n, CodingConvention.VariableReference variableReference) {}
            @Override
            public void setStereotype(Node n, JSType.PropagationPolicy propagationPolicy) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Abstract thisType) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Abstract classType) {}
            @Override
            public void setStereotype(Node n, JSDocInfo.Visibility visibility) {}
            @Override
            public void setStereotype(Node n, CodingConvention.NamedPropertySpec namedPropertySpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ObjectProperty objectProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionSignature functionSignature) {}
            @Override
            public void setStereotype(Node n, CodingConvention.VariableMap variableMap) {}
            @Override
            public void setStereotype(Node n, CodingConvention.PropertyReference propertyReference) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypePropertyType typePropertyType) {}
            @Override
            public void setStereotype(Node n, JSDocInfo jsDocInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AliasSpec aliasSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.DelegateAndImplicitParams delegateAndImplicitParams) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Parameter parameter) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorSpec constructorSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeInfo typeInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.CallLinker callLinker) {}
            @Override
            public void setStereotype(Node n, CodingConvention.NodeContent nodeContent) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Source file) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionArgumentSpec functionArgumentSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorOverides constructorOverides) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AbstractMethodProperty abstractMethodProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.InterfaceExtendsInterface interfaceExtendsInterface) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ModuleLoader moduleLoader) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FieldReference fieldReference) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorOverload constructorOverload) {}
            @Override
            public void setStereotype(Node n, CodingConvention.InferredConstProperties inferredConstProperties) {}
            @Override
            public void setStereotype(Node n, CodingConvention.JsDocParameterSpec jsDocParameterSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Enum syntheticEnum) {}
            @Override
            public void setStereotype(Node n, CodingConvention.StatementKey statementKey) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeValidator typeValidator) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ClosureEquivalence closureEquivalence) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AssertionFunctionSpec assertionFunctionSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionPrototypeProperties functionPrototypeProperties) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeInfo typeInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ClosureAssignProperty closureAssignProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ObjectLiteralObjectKey objectLiteralObjectKey) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ThisType thisType) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstantId constantId) {}
            @Override
            public void setStereotype(Node n, CodingConvention.VariableReference variableReference) {}
            @Override
            public void setStereotype(Node n, JSType.PropagationPolicy propagationPolicy) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Abstract thisType) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Abstract classType) {}
            @Override
            public void setStereotype(Node n, JSDocInfo.Visibility visibility) {}
            @Override
            public void setStereotype(Node n, CodingConvention.NamedPropertySpec namedPropertySpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ObjectProperty objectProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionSignature functionSignature) {}
            @Override
            public void setStereotype(Node n, CodingConvention.VariableMap variableMap) {}
            @Override
            public void setStereotype(Node n, CodingConvention.PropertyReference propertyReference) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypePropertyType typePropertyType) {}
            @Override
            public void setStereotype(Node n, JSDocInfo jsDocInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AliasSpec aliasSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.DelegateAndImplicitParams delegateAndImplicitParams) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Parameter parameter) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorSpec constructorSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeInfo typeInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.CallLinker callLinker) {}
            @Override
            public void setStereotype(Node n, CodingConvention.NodeContent nodeContent) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Source file) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionArgumentSpec functionArgumentSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorOverides constructorOverides) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AbstractMethodProperty abstractMethodProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.InterfaceExtendsInterface interfaceExtendsInterface) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ModuleLoader moduleLoader) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FieldReference fieldReference) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorOverload constructorOverload) {}
            @Override
            public void setStereotype(Node n, CodingConvention.InferredConstProperties inferredConstProperties) {}
            @Override
            public void setStereotype(Node n, CodingConvention.JsDocParameterSpec jsDocParameterSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Enum syntheticEnum) {}
            @Override
            public void setStereotype(Node n, CodingConvention.StatementKey statementKey) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeValidator typeValidator) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ClosureEquivalence closureEquivalence) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AssertionFunctionSpec assertionFunctionSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionPrototypeProperties functionPrototypeProperties) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeInfo typeInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ClosureAssignProperty closureAssignProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ObjectLiteralObjectKey objectLiteralObjectKey) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ThisType thisType) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstantId constantId) {}
            @Override
            public void setStereotype(Node n, CodingConvention.VariableReference variableReference) {}
            @Override
            public void setStereotype(Node n, JSType.PropagationPolicy propagationPolicy) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Abstract thisType) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Abstract classType) {}
            @Override
            public void setStereotype(Node n, JSDocInfo.Visibility visibility) {}
            @Override
            public void setStereotype(Node n, CodingConvention.NamedPropertySpec namedPropertySpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ObjectProperty objectProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionSignature functionSignature) {}
            @Override
            public void setStereotype(Node n, CodingConvention.VariableMap variableMap) {}
            @Override
            public void setStereotype(Node n, CodingConvention.PropertyReference propertyReference) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypePropertyType typePropertyType) {}
            @Override
            public void setStereotype(Node n, JSDocInfo jsDocInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AliasSpec aliasSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.DelegateAndImplicitParams delegateAndImplicitParams) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Parameter parameter) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorSpec constructorSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeInfo typeInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.CallLinker callLinker) {}
            @Override
            public void setStereotype(Node n, CodingConvention.NodeContent nodeContent) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Source file) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionArgumentSpec functionArgumentSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorOverides constructorOverides) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AbstractMethodProperty abstractMethodProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.InterfaceExtendsInterface interfaceExtendsInterface) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ModuleLoader moduleLoader) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FieldReference fieldReference) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorOverload constructorOverload) {}
            @Override
            public void setStereotype(Node n, CodingConvention.InferredConstProperties inferredConstProperties) {}
            @Override
            public void setStereotype(Node n, CodingConvention.JsDocParameterSpec jsDocParameterSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Enum syntheticEnum) {}
            @Override
            public void setStereotype(Node n, CodingConvention.StatementKey statementKey) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeValidator typeValidator) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ClosureEquivalence closureEquivalence) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AssertionFunctionSpec assertionFunctionSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionPrototypeProperties functionPrototypeProperties) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeInfo typeInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ClosureAssignProperty closureAssignProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ObjectLiteralObjectKey objectLiteralObjectKey) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ThisType thisType) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstantId constantId) {}
            @Override
            public void setStereotype(Node n, CodingConvention.VariableReference variableReference) {}
            @Override
            public void setStereotype(Node n, JSType.PropagationPolicy propagationPolicy) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Abstract thisType) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Abstract classType) {}
            @Override
            public void setStereotype(Node n, JSDocInfo.Visibility visibility) {}
            @Override
            public void setStereotype(Node n, CodingConvention.NamedPropertySpec namedPropertySpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ObjectProperty objectProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionSignature functionSignature) {}
            @Override
            public void setStereotype(Node n, CodingConvention.VariableMap variableMap) {}
            @Override
            public void setStereotype(Node n, CodingConvention.PropertyReference propertyReference) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypePropertyType typePropertyType) {}
            @Override
            public void setStereotype(Node n, JSDocInfo jsDocInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AliasSpec aliasSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.DelegateAndImplicitParams delegateAndImplicitParams) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Parameter parameter) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorSpec constructorSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeInfo typeInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.CallLinker callLinker) {}
            @Override
            public void setStereotype(Node n, CodingConvention.NodeContent nodeContent) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Source file) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionArgumentSpec functionArgumentSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorOverides constructorOverides) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AbstractMethodProperty abstractMethodProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.InterfaceExtendsInterface interfaceExtendsInterface) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ModuleLoader moduleLoader) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FieldReference fieldReference) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorOverload constructorOverload) {}
            @Override
            public void setStereotype(Node n, CodingConvention.InferredConstProperties inferredConstProperties) {}
            @Override
            public void setStereotype(Node n, CodingConvention.JsDocParameterSpec jsDocParameterSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Enum syntheticEnum) {}
            @Override
            public void setStereotype(Node n, CodingConvention.StatementKey statementKey) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeValidator typeValidator) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ClosureEquivalence closureEquivalence) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AssertionFunctionSpec assertionFunctionSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionPrototypeProperties functionPrototypeProperties) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeInfo typeInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ClosureAssignProperty closureAssignProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ObjectLiteralObjectKey objectLiteralObjectKey) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ThisType thisType) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstantId constantId) {}
            @Override
            public void setStereotype(Node n, CodingConvention.VariableReference variableReference) {}
            @Override
            public void setStereotype(Node n, JSType.PropagationPolicy propagationPolicy) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Abstract thisType) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Abstract classType) {}
            @Override
            public void setStereotype(Node n, JSDocInfo.Visibility visibility) {}
            @Override
            public void setStereotype(Node n, CodingConvention.NamedPropertySpec namedPropertySpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ObjectProperty objectProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionSignature functionSignature) {}
            @Override
            public void setStereotype(Node n, CodingConvention.VariableMap variableMap) {}
            @Override
            public void setStereotype(Node n, CodingConvention.PropertyReference propertyReference) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypePropertyType typePropertyType) {}
            @Override
            public void setStereotype(Node n, JSDocInfo jsDocInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AliasSpec aliasSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.DelegateAndImplicitParams delegateAndImplicitParams) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Parameter parameter) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorSpec constructorSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeInfo typeInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.CallLinker callLinker) {}
            @Override
            public void setStereotype(Node n, CodingConvention.NodeContent nodeContent) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Source file) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionArgumentSpec functionArgumentSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorOverides constructorOverides) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AbstractMethodProperty abstractMethodProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.InterfaceExtendsInterface interfaceExtendsInterface) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ModuleLoader moduleLoader) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FieldReference fieldReference) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorOverload constructorOverload) {}
            @Override
            public void setStereotype(Node n, CodingConvention.InferredConstProperties inferredConstProperties) {}
            @Override
            public void setStereotype(Node n, CodingConvention.JsDocParameterSpec jsDocParameterSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Enum syntheticEnum) {}
            @Override
            public void setStereotype(Node n, CodingConvention.StatementKey statementKey) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeValidator typeValidator) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ClosureEquivalence closureEquivalence) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AssertionFunctionSpec assertionFunctionSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionPrototypeProperties functionPrototypeProperties) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeInfo typeInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ClosureAssignProperty closureAssignProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ObjectLiteralObjectKey objectLiteralObjectKey) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ThisType thisType) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstantId constantId) {}
            @Override
            public void setStereotype(Node n, CodingConvention.VariableReference variableReference) {}
            @Override
            public void setStereotype(Node n, JSType.PropagationPolicy propagationPolicy) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Abstract thisType) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Abstract classType) {}
            @Override
            public void setStereotype(Node n, JSDocInfo.Visibility visibility) {}
            @Override
            public void setStereotype(Node n, CodingConvention.NamedPropertySpec namedPropertySpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ObjectProperty objectProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionSignature functionSignature) {}
            @Override
            public void setStereotype(Node n, CodingConvention.VariableMap variableMap) {}
            @Override
            public void setStereotype(Node n, CodingConvention.PropertyReference propertyReference) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypePropertyType typePropertyType) {}
            @Override
            public void setStereotype(Node n, JSDocInfo jsDocInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AliasSpec aliasSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.DelegateAndImplicitParams delegateAndImplicitParams) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Parameter parameter) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorSpec constructorSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeInfo typeInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.CallLinker callLinker) {}
            @Override
            public void setStereotype(Node n, CodingConvention.NodeContent nodeContent) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Source file) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionArgumentSpec functionArgumentSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorOverides constructorOverides) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AbstractMethodProperty abstractMethodProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.InterfaceExtendsInterface interfaceExtendsInterface) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ModuleLoader moduleLoader) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FieldReference fieldReference) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorOverload constructorOverload) {}
            @Override
            public void setStereotype(Node n, CodingConvention.InferredConstProperties inferredConstProperties) {}
            @Override
            public void setStereotype(Node n, CodingConvention.JsDocParameterSpec jsDocParameterSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Enum syntheticEnum) {}
            @Override
            public void setStereotype(Node n, CodingConvention.StatementKey statementKey) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeValidator typeValidator) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ClosureEquivalence closureEquivalence) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AssertionFunctionSpec assertionFunctionSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionPrototypeProperties functionPrototypeProperties) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeInfo typeInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ClosureAssignProperty closureAssignProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ObjectLiteralObjectKey objectLiteralObjectKey) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ThisType thisType) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstantId constantId) {}
            @Override
            public void setStereotype(Node n, CodingConvention.VariableReference variableReference) {}
            @Override
            public void setStereotype(Node n, JSType.PropagationPolicy propagationPolicy) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Abstract thisType) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Abstract classType) {}
            @Override
            public void setStereotype(Node n, JSDocInfo.Visibility visibility) {}
            @Override
            public void setStereotype(Node n, CodingConvention.NamedPropertySpec namedPropertySpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ObjectProperty objectProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionSignature functionSignature) {}
            @Override
            public void setStereotype(Node n, CodingConvention.VariableMap variableMap) {}
            @Override
            public void setStereotype(Node n, CodingConvention.PropertyReference propertyReference) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypePropertyType typePropertyType) {}
            @Override
            public void setStereotype(Node n, JSDocInfo jsDocInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AliasSpec aliasSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.DelegateAndImplicitParams delegateAndImplicitParams) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Parameter parameter) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorSpec constructorSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeInfo typeInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.CallLinker callLinker) {}
            @Override
            public void setStereotype(Node n, CodingConvention.NodeContent nodeContent) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Source file) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionArgumentSpec functionArgumentSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorOverides constructorOverides) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AbstractMethodProperty abstractMethodProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.InterfaceExtendsInterface interfaceExtendsInterface) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ModuleLoader moduleLoader) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FieldReference fieldReference) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorOverload constructorOverload) {}
            @Override
            public void setStereotype(Node n, CodingConvention.InferredConstProperties inferredConstProperties) {}
            @Override
            public void setStereotype(Node n, CodingConvention.JsDocParameterSpec jsDocParameterSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Enum syntheticEnum) {}
            @Override
            public void setStereotype(Node n, CodingConvention.StatementKey statementKey) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeValidator typeValidator) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ClosureEquivalence closureEquivalence) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AssertionFunctionSpec assertionFunctionSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionPrototypeProperties functionPrototypeProperties) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeInfo typeInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ClosureAssignProperty closureAssignProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ObjectLiteralObjectKey objectLiteralObjectKey) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ThisType thisType) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstantId constantId) {}
            @Override
            public void setStereotype(Node n, CodingConvention.VariableReference variableReference) {}
            @Override
            public void setStereotype(Node n, JSType.PropagationPolicy propagationPolicy) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Abstract thisType) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Abstract classType) {}
            @Override
            public void setStereotype(Node n, JSDocInfo.Visibility visibility) {}
            @Override
            public void setStereotype(Node n, CodingConvention.NamedPropertySpec namedPropertySpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ObjectProperty objectProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionSignature functionSignature) {}
            @Override
            public void setStereotype(Node n, CodingConvention.VariableMap variableMap) {}
            @Override
            public void setStereotype(Node n, CodingConvention.PropertyReference propertyReference) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypePropertyType typePropertyType) {}
            @Override
            public void setStereotype(Node n, JSDocInfo jsDocInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AliasSpec aliasSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.DelegateAndImplicitParams delegateAndImplicitParams) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Parameter parameter) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorSpec constructorSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeInfo typeInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.CallLinker callLinker) {}
            @Override
            public void setStereotype(Node n, CodingConvention.NodeContent nodeContent) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Source file) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionArgumentSpec functionArgumentSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorOverides constructorOverides) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AbstractMethodProperty abstractMethodProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.InterfaceExtendsInterface interfaceExtendsInterface) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ModuleLoader moduleLoader) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FieldReference fieldReference) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorOverload constructorOverload) {}
            @Override
            public void setStereotype(Node n, CodingConvention.InferredConstProperties inferredConstProperties) {}
            @Override
            public void setStereotype(Node n, CodingConvention.JsDocParameterSpec jsDocParameterSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Enum syntheticEnum) {}
            @Override
            public void setStereotype(Node n, CodingConvention.StatementKey statementKey) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeValidator typeValidator) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ClosureEquivalence closureEquivalence) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AssertionFunctionSpec assertionFunctionSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionPrototypeProperties functionPrototypeProperties) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeInfo typeInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ClosureAssignProperty closureAssignProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ObjectLiteralObjectKey objectLiteralObjectKey) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ThisType thisType) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstantId constantId) {}
            @Override
            public void setStereotype(Node n, CodingConvention.VariableReference variableReference) {}
            @Override
            public void setStereotype(Node n, JSType.PropagationPolicy propagationPolicy) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Abstract thisType) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Abstract classType) {}
            @Override
            public void setStereotype(Node n, JSDocInfo.Visibility visibility) {}
            @Override
            public void setStereotype(Node n, CodingConvention.NamedPropertySpec namedPropertySpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ObjectProperty objectProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionSignature functionSignature) {}
            @Override
            public void setStereotype(Node n, CodingConvention.VariableMap variableMap) {}
            @Override
            public void setStereotype(Node n, CodingConvention.PropertyReference propertyReference) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypePropertyType typePropertyType) {}
            @Override
            public void setStereotype(Node n, JSDocInfo jsDocInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AliasSpec aliasSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.DelegateAndImplicitParams delegateAndImplicitParams) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Parameter parameter) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorSpec constructorSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeInfo typeInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.CallLinker callLinker) {}
            @Override
            public void setStereotype(Node n, CodingConvention.NodeContent nodeContent) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Source file) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionArgumentSpec functionArgumentSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorOverides constructorOverides) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AbstractMethodProperty abstractMethodProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.InterfaceExtendsInterface interfaceExtendsInterface) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ModuleLoader moduleLoader) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FieldReference fieldReference) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorOverload constructorOverload) {}
            @Override
            public void setStereotype(Node n, CodingConvention.InferredConstProperties inferredConstProperties) {}
            @Override
            public void setStereotype(Node n, CodingConvention.JsDocParameterSpec jsDocParameterSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Enum syntheticEnum) {}
            @Override
            public void setStereotype(Node n, CodingConvention.StatementKey statementKey) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeValidator typeValidator) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ClosureEquivalence closureEquivalence) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AssertionFunctionSpec assertionFunctionSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionPrototypeProperties functionPrototypeProperties) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeInfo typeInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ClosureAssignProperty closureAssignProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ObjectLiteralObjectKey objectLiteralObjectKey) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ThisType thisType) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstantId constantId) {}
            @Override
            public void setStereotype(Node n, CodingConvention.VariableReference variableReference) {}
            @Override
            public void setStereotype(Node n, JSType.PropagationPolicy propagationPolicy) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Abstract thisType) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Abstract classType) {}
            @Override
            public void setStereotype(Node n, JSDocInfo.Visibility visibility) {}
            @Override
            public void setStereotype(Node n, CodingConvention.NamedPropertySpec namedPropertySpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ObjectProperty objectProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionSignature functionSignature) {}
            @Override
            public void setStereotype(Node n, CodingConvention.VariableMap variableMap) {}
            @Override
            public void setStereotype(Node n, CodingConvention.PropertyReference propertyReference) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypePropertyType typePropertyType) {}
            @Override
            public void setStereotype(Node n, JSDocInfo jsDocInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AliasSpec aliasSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.DelegateAndImplicitParams delegateAndImplicitParams) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Parameter parameter) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorSpec constructorSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeInfo typeInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.CallLinker callLinker) {}
            @Override
            public void setStereotype(Node n, CodingConvention.NodeContent nodeContent) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Source file) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionArgumentSpec functionArgumentSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorOverides constructorOverides) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AbstractMethodProperty abstractMethodProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.InterfaceExtendsInterface interfaceExtendsInterface) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ModuleLoader moduleLoader) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FieldReference fieldReference) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorOverload constructorOverload) {}
            @Override
            public void setStereotype(Node n, CodingConvention.InferredConstProperties inferredConstProperties) {}
            @Override
            public void setStereotype(Node n, CodingConvention.JsDocParameterSpec jsDocParameterSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Enum syntheticEnum) {}
            @Override
            public void setStereotype(Node n, CodingConvention.StatementKey statementKey) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeValidator typeValidator) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ClosureEquivalence closureEquivalence) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AssertionFunctionSpec assertionFunctionSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionPrototypeProperties functionPrototypeProperties) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeInfo typeInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ClosureAssignProperty closureAssignProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ObjectLiteralObjectKey objectLiteralObjectKey) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ThisType thisType) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstantId constantId) {}
            @Override
            public void setStereotype(Node n, CodingConvention.VariableReference variableReference) {}
            @Override
            public void setStereotype(Node n, JSType.PropagationPolicy propagationPolicy) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Abstract thisType) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Abstract classType) {}
            @Override
            public void setStereotype(Node n, JSDocInfo.Visibility visibility) {}
            @Override
            public void setStereotype(Node n, CodingConvention.NamedPropertySpec namedPropertySpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ObjectProperty objectProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionSignature functionSignature) {}
            @Override
            public void setStereotype(Node n, CodingConvention.VariableMap variableMap) {}
            @Override
            public void setStereotype(Node n, CodingConvention.PropertyReference propertyReference) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypePropertyType typePropertyType) {}
            @Override
            public void setStereotype(Node n, JSDocInfo jsDocInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AliasSpec aliasSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.DelegateAndImplicitParams delegateAndImplicitParams) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Parameter parameter) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorSpec constructorSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeInfo typeInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.CallLinker callLinker) {}
            @Override
            public void setStereotype(Node n, CodingConvention.NodeContent nodeContent) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Source file) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionArgumentSpec functionArgumentSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorOverides constructorOverides) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AbstractMethodProperty abstractMethodProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.InterfaceExtendsInterface interfaceExtendsInterface) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ModuleLoader moduleLoader) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FieldReference fieldReference) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorOverload constructorOverload) {}
            @Override
            public void setStereotype(Node n, CodingConvention.InferredConstProperties inferredConstProperties) {}
            @Override
            public void setStereotype(Node n, CodingConvention.JsDocParameterSpec jsDocParameterSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Enum syntheticEnum) {}
            @Override
            public void setStereotype(Node n, CodingConvention.StatementKey statementKey) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeValidator typeValidator) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ClosureEquivalence closureEquivalence) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AssertionFunctionSpec assertionFunctionSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionPrototypeProperties functionPrototypeProperties) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeInfo typeInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ClosureAssignProperty closureAssignProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ObjectLiteralObjectKey objectLiteralObjectKey) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ThisType thisType) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstantId constantId) {}
            @Override
            public void setStereotype(Node n, CodingConvention.VariableReference variableReference) {}
            @Override
            public void setStereotype(Node n, JSType.PropagationPolicy propagationPolicy) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Abstract thisType) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Abstract classType) {}
            @Override
            public void setStereotype(Node n, JSDocInfo.Visibility visibility) {}
            @Override
            public void setStereotype(Node n, CodingConvention.NamedPropertySpec namedPropertySpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ObjectProperty objectProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionSignature functionSignature) {}
            @Override
            public void setStereotype(Node n, CodingConvention.VariableMap variableMap) {}
            @Override
            public void setStereotype(Node n, CodingConvention.PropertyReference propertyReference) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypePropertyType typePropertyType) {}
            @Override
            public void setStereotype(Node n, JSDocInfo jsDocInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AliasSpec aliasSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.DelegateAndImplicitParams delegateAndImplicitParams) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Parameter parameter) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorSpec constructorSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeInfo typeInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.CallLinker callLinker) {}
            @Override
            public void setStereotype(Node n, CodingConvention.NodeContent nodeContent) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Source file) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionArgumentSpec functionArgumentSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorOverides constructorOverides) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AbstractMethodProperty abstractMethodProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.InterfaceExtendsInterface interfaceExtendsInterface) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ModuleLoader moduleLoader) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FieldReference fieldReference) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorOverload constructorOverload) {}
            @Override
            public void setStereotype(Node n, CodingConvention.InferredConstProperties inferredConstProperties) {}
            @Override
            public void setStereotype(Node n, CodingConvention.JsDocParameterSpec jsDocParameterSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Enum syntheticEnum) {}
            @Override
            public void setStereotype(Node n, CodingConvention.StatementKey statementKey) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeValidator typeValidator) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ClosureEquivalence closureEquivalence) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AssertionFunctionSpec assertionFunctionSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionPrototypeProperties functionPrototypeProperties) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeInfo typeInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ClosureAssignProperty closureAssignProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ObjectLiteralObjectKey objectLiteralObjectKey) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ThisType thisType) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstantId constantId) {}
            @Override
            public void setStereotype(Node n, CodingConvention.VariableReference variableReference) {}
            @Override
            public void setStereotype(Node n, JSType.PropagationPolicy propagationPolicy) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Abstract thisType) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Abstract classType) {}
            @Override
            public void setStereotype(Node n, JSDocInfo.Visibility visibility) {}
            @Override
            public void setStereotype(Node n, CodingConvention.NamedPropertySpec namedPropertySpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ObjectProperty objectProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionSignature functionSignature) {}
            @Override
            public void setStereotype(Node n, CodingConvention.VariableMap variableMap) {}
            @Override
            public void setStereotype(Node n, CodingConvention.PropertyReference propertyReference) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypePropertyType typePropertyType) {}
            @Override
            public void setStereotype(Node n, JSDocInfo jsDocInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AliasSpec aliasSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.DelegateAndImplicitParams delegateAndImplicitParams) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Parameter parameter) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorSpec constructorSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeInfo typeInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.CallLinker callLinker) {}
            @Override
            public void setStereotype(Node n, CodingConvention.NodeContent nodeContent) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Source file) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionArgumentSpec functionArgumentSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorOverides constructorOverides) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AbstractMethodProperty abstractMethodProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.InterfaceExtendsInterface interfaceExtendsInterface) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ModuleLoader moduleLoader) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FieldReference fieldReference) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorOverload constructorOverload) {}
            @Override
            public void setStereotype(Node n, CodingConvention.InferredConstProperties inferredConstProperties) {}
            @Override
            public void setStereotype(Node n, CodingConvention.JsDocParameterSpec jsDocParameterSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Enum syntheticEnum) {}
            @Override
            public void setStereotype(Node n, CodingConvention.StatementKey statementKey) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeValidator typeValidator) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ClosureEquivalence closureEquivalence) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AssertionFunctionSpec assertionFunctionSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionPrototypeProperties functionPrototypeProperties) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeInfo typeInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ClosureAssignProperty closureAssignProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ObjectLiteralObjectKey objectLiteralObjectKey) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ThisType thisType) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstantId constantId) {}
            @Override
            public void setStereotype(Node n, CodingConvention.VariableReference variableReference) {}
            @Override
            public void setStereotype(Node n, JSType.PropagationPolicy propagationPolicy) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Abstract thisType) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Abstract classType) {}
            @Override
            public void setStereotype(Node n, JSDocInfo.Visibility visibility) {}
            @Override
            public void setStereotype(Node n, CodingConvention.NamedPropertySpec namedPropertySpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ObjectProperty objectProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionSignature functionSignature) {}
            @Override
            public void setStereotype(Node n, CodingConvention.VariableMap variableMap) {}
            @Override
            public void setStereotype(Node n, CodingConvention.PropertyReference propertyReference) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypePropertyType typePropertyType) {}
            @Override
            public void setStereotype(Node n, JSDocInfo jsDocInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AliasSpec aliasSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.DelegateAndImplicitParams delegateAndImplicitParams) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Parameter parameter) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorSpec constructorSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeInfo typeInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.CallLinker callLinker) {}
            @Override
            public void setStereotype(Node n, CodingConvention.NodeContent nodeContent) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Source file) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionArgumentSpec functionArgumentSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorOverides constructorOverides) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AbstractMethodProperty abstractMethodProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.InterfaceExtendsInterface interfaceExtendsInterface) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ModuleLoader moduleLoader) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FieldReference fieldReference) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorOverload constructorOverload) {}
            @Override
            public void setStereotype(Node n, CodingConvention.InferredConstProperties inferredConstProperties) {}
            @Override
            public void setStereotype(Node n, CodingConvention.JsDocParameterSpec jsDocParameterSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Enum syntheticEnum) {}
            @Override
            public void setStereotype(Node n, CodingConvention.StatementKey statementKey) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeValidator typeValidator) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ClosureEquivalence closureEquivalence) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AssertionFunctionSpec assertionFunctionSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionPrototypeProperties functionPrototypeProperties) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeInfo typeInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ClosureAssignProperty closureAssignProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ObjectLiteralObjectKey objectLiteralObjectKey) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ThisType thisType) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstantId constantId) {}
            @Override
            public void setStereotype(Node n, CodingConvention.VariableReference variableReference) {}
            @Override
            public void setStereotype(Node n, JSType.PropagationPolicy propagationPolicy) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Abstract thisType) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Abstract classType) {}
            @Override
            public void setStereotype(Node n, JSDocInfo.Visibility visibility) {}
            @Override
            public void setStereotype(Node n, CodingConvention.NamedPropertySpec namedPropertySpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ObjectProperty objectProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionSignature functionSignature) {}
            @Override
            public void setStereotype(Node n, CodingConvention.VariableMap variableMap) {}
            @Override
            public void setStereotype(Node n, CodingConvention.PropertyReference propertyReference) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypePropertyType typePropertyType) {}
            @Override
            public void setStereotype(Node n, JSDocInfo jsDocInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AliasSpec aliasSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.DelegateAndImplicitParams delegateAndImplicitParams) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Parameter parameter) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorSpec constructorSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeInfo typeInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.CallLinker callLinker) {}
            @Override
            public void setStereotype(Node n, CodingConvention.NodeContent nodeContent) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Source file) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionArgumentSpec functionArgumentSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorOverides constructorOverides) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AbstractMethodProperty abstractMethodProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.InterfaceExtendsInterface interfaceExtendsInterface) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ModuleLoader moduleLoader) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FieldReference fieldReference) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstructorOverload constructorOverload) {}
            @Override
            public void setStereotype(Node n, CodingConvention.InferredConstProperties inferredConstProperties) {}
            @Override
            public void setStereotype(Node n, CodingConvention.JsDocParameterSpec jsDocParameterSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Enum syntheticEnum) {}
            @Override
            public void setStereotype(Node n, CodingConvention.StatementKey statementKey) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeValidator typeValidator) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ClosureEquivalence closureEquivalence) {}
            @Override
            public void setStereotype(Node n, CodingConvention.AssertionFunctionSpec assertionFunctionSpec) {}
            @Override
            public void setStereotype(Node n, CodingConvention.FunctionPrototypeProperties functionPrototypeProperties) {}
            @Override
            public void setStereotype(Node n, CodingConvention.TypeInfo typeInfo) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ClosureAssignProperty closureAssignProperty) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ObjectLiteralObjectKey objectLiteralObjectKey) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ThisType thisType) {}
            @Override
            public void setStereotype(Node n, CodingConvention.ConstantId constantId) {}
            @Override
            public void setStereotype(Node n, CodingConvention.VariableReference variableReference) {}
            @Override
            public void setStereotype(Node n, JSType.PropagationPolicy propagationPolicy) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Abstract thisType) {}
            @Override
            public void setStereotype(Node n, CodingConvention.Abstract classType) {}
            @Override
