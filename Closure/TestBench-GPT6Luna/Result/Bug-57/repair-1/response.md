```java
package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.ObjectType;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class ClosureCodingConventionTest {
    @Test
    public void testSuperClassReferenceMatchesOnlyExactName() throws Exception {
        ClosureCodingConvention convention = new ClosureCodingConvention();
        assertTrue(convention.isSuperClassReference("superClass_"));
        assertFalse(convention.isSuperClassReference("superClass"));
        assertFalse(convention.isSuperClassReference(null));
    }

    @Test
    public void testClosureFunctionNames() throws Exception {
        ClosureCodingConvention convention = new ClosureCodingConvention();
        assertEquals("goog.exportProperty", convention.getExportPropertyFunction());
        assertEquals("goog.exportSymbol", convention.getExportSymbolFunction());
        assertEquals("goog.abstractMethod", convention.getAbstractMethodName());
        assertEquals("goog.global", convention.getGlobalObject());
    }

    @Test
    public void testProvideAndRequireNamesForUnrelatedExpressionAreNull() throws Exception {
        ClosureCodingConvention convention = new ClosureCodingConvention();
        Node expression = new Node(Token.EXPR_RESULT);
        Node call = new Node(Token.CALL, Node.newString(Token.NAME, "other"));
        expression.addChildToBack(call);
        assertNull(convention.extractClassNameIfProvide(call, expression));
        assertNull(convention.extractClassNameIfRequire(call, expression));
    }

    @Test
    public void testRecognizesProvideCall() throws Exception {
        ClosureCodingConvention convention = new ClosureCodingConvention();
        Node expression = new Node(Token.EXPR_RESULT);
        Node callee = new Node(Token.GETPROP,
                Node.newString(Token.NAME, "goog"),
                Node.newString(Token.STRING, "provide"));
        Node call = new Node(Token.CALL, callee);
        call.addChildToBack(Node.newString("sample.Type"));
        expression.addChildToBack(call);
        assertEquals("sample.Type", convention.extractClassNameIfProvide(call, expression));
        assertNull(convention.extractClassNameIfRequire(call, expression));
    }

    @Test
    public void testRecognizesRequireCall() throws Exception {
        ClosureCodingConvention convention = new ClosureCodingConvention();
        Node expression = new Node(Token.EXPR_RESULT);
        Node callee = new Node(Token.GETPROP,
                Node.newString(Token.NAME, "goog"),
                Node.newString(Token.STRING, "require"));
        Node call = new Node(Token.CALL, callee);
        call.addChildToBack(Node.newString("sample.Type"));
        expression.addChildToBack(call);
        assertEquals("sample.Type", convention.extractClassNameIfRequire(call, expression));
        assertNull(convention.extractClassNameIfProvide(call, expression));
    }

    @Test
    public void testProvideRejectsNonStringArgument() throws Exception {
        ClosureCodingConvention convention = new ClosureCodingConvention();
        Node expression = new Node(Token.EXPR_RESULT);
        Node callee = new Node(Token.GETPROP,
                Node.newString(Token.NAME, "goog"),
                Node.newString(Token.STRING, "provide"));
        Node call = new Node(Token.CALL, callee);
        call.addChildToBack(Node.newNumber(1));
        expression.addChildToBack(call);
        assertNull(convention.extractClassNameIfProvide(call, expression));
    }

    @Test
    public void testPropertyTestFunctionRecognizedAndRejected() throws Exception {
        ClosureCodingConvention convention = new ClosureCodingConvention();
        Node recognizedName = new Node(Token.GETPROP,
                Node.newString(Token.NAME, "goog"),
                Node.newString(Token.STRING, "isDef"));
        assertTrue(convention.isPropertyTestFunction(new Node(Token.CALL, recognizedName)));

        Node otherName = new Node(Token.GETPROP,
                Node.newString(Token.NAME, "goog"),
                Node.newString(Token.STRING, "notATypeTest"));
        assertFalse(convention.isPropertyTestFunction(new Node(Token.CALL, otherName)));
    }

    @Test
    public void testPropertyTestFunctionRecognizesCollapsedName() throws Exception {
        ClosureCodingConvention convention = new ClosureCodingConvention();
        assertTrue(convention.isPropertyTestFunction(
                new Node(Token.CALL, Node.newString(Token.NAME, "goog.isArray"))));
    }

    @Test
    public void testTypeDeclarationCallReturnsStringEntriesOnly() throws Exception {
        ClosureCodingConvention convention = new ClosureCodingConvention();
        Node callee = new Node(Token.GETPROP,
                Node.newString(Token.NAME, "goog"),
                Node.newString(Token.STRING, "addDependency"));
        Node call = new Node(Token.CALL, callee);
        call.addChildToBack(Node.newString("path"));
        Node names = new Node(Token.ARRAYLIT);
        names.addChildToBack(Node.newString("alpha.Type"));
        names.addChildToBack(Node.newNumber(3));
        names.addChildToBack(Node.newString("beta.Type"));
        call.addChildToBack(names);

        assertEquals(ImmutableList.of("alpha.Type", "beta.Type"),
                convention.identifyTypeDeclarationCall(call));
    }

    @Test
    public void testTypeDeclarationCallRequiresEnoughChildren() throws Exception {
        ClosureCodingConvention convention = new ClosureCodingConvention();
        Node callee = new Node(Token.GETPROP,
                Node.newString(Token.NAME, "goog"),
                Node.newString(Token.STRING, "addDependency"));
        Node call = new Node(Token.CALL, callee);
        call.addChildToBack(Node.newString("path"));
        assertNull(convention.identifyTypeDeclarationCall(call));
    }

    @Test
    public void testSingletonGetterRecognizesStandardAndCollapsedNames() throws Exception {
        ClosureCodingConvention convention = new ClosureCodingConvention();
        Node standard = new Node(Token.CALL, Node.newString(Token.NAME, "goog.addSingletonGetter"));
        standard.addChildToBack(Node.newString(Token.NAME, "sample.Singleton"));
        assertEquals("sample.Singleton", convention.getSingletonGetterClassName(standard));

        Node collapsed = new Node(Token.CALL, Node.newString(Token.NAME, "goog$addSingletonGetter"));
        collapsed.addChildToBack(Node.newString(Token.NAME, "sample.Collapsed"));
        assertEquals("sample.Collapsed", convention.getSingletonGetterClassName(collapsed));
    }

    @Test
    public void testSingletonGetterRejectsWrongNameAndArgumentCount() throws Exception {
        ClosureCodingConvention convention = new ClosureCodingConvention();
        Node wrong = new Node(Token.CALL, Node.newString(Token.NAME, "other"));
        wrong.addChildToBack(Node.newString(Token.NAME, "sample.Type"));
        assertNull(convention.getSingletonGetterClassName(wrong));

        Node extra = new Node(Token.CALL, Node.newString(Token.NAME, "goog.addSingletonGetter"));
        extra.addChildToBack(Node.newString(Token.NAME, "sample.Type"));
        extra.addChildToBack(Node.newString(Token.NAME, "extra"));
        assertNull(convention.getSingletonGetterClassName(extra));
    }

    @Test
    public void testParameterAndPrivacyPredicatesAreFalse() throws Exception {
        ClosureCodingConvention convention = new ClosureCodingConvention();
        Node parameter = Node.newString(Token.NAME, "arg");
        assertFalse(convention.isOptionalParameter(parameter));
        assertFalse(convention.isVarArgsParameter(parameter));
        assertFalse(convention.isPrivate("privateName"));
    }

    @Test
    public void testAssertionFunctionsAreProvided() throws Exception {
        ClosureCodingConvention convention = new ClosureCodingConvention();
        Collection<?> functions = convention.getAssertionFunctions();
        assertEquals(7, functions.size());
    }

    @Test
    public void testObjectLiteralCastRejectsUnrelatedCall() throws Exception {
        ClosureCodingConvention convention = new ClosureCodingConvention();
        Node call = new Node(Token.CALL, Node.newString(Token.NAME, "other"));
        assertNull(convention.getObjectLiteralCast(null, call));
    }

    @Test
    public void testDescribeFunctionBindRejectsNonCall() throws Exception {
        ClosureCodingConvention convention = new ClosureCodingConvention();
        assertNull(convention.describeFunctionBind(Node.newString(Token.NAME, "fn")));
    }

    @Test
    public void testClassRelationshipRejectsUnrecognizedCallName() throws Exception {
        ClosureCodingConvention convention = new ClosureCodingConvention();
        Node call = new Node(Token.CALL, Node.newString(Token.NAME, "other"));
        call.addChildToBack(Node.newString(Token.NAME, "Sub"));
        call.addChildToBack(Node.newString(Token.NAME, "Super"));
        assertNull(convention.getClassesDefinedByCall(call));
    }

    @Test
    public void testClassRelationshipRejectsUnscopedConditionalSuperclass() throws Exception {
        ClosureCodingConvention convention = new ClosureCodingConvention();
        Node callee = new Node(Token.GETPROP,
                Node.newString(Token.NAME, "Sub"),
                Node.newString(Token.STRING, "inherits"));
        Node call = new Node(Token.CALL, callee);
        call.addChildToBack(new Node(Token.HOOK));
        assertNull(convention.getClassesDefinedByCall(call));
    }
}
```