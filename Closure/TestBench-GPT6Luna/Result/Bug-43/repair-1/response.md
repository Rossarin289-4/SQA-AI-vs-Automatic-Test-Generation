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

public class TypedScopeCreatorTest {
    @Test
    public void testCreateScopeAndNativeUndefinedBinding() throws Exception {
        Compiler compiler = new Compiler();
        Node script = new Node(Token.SCRIPT);
        Scope scope = new TypedScopeCreator(compiler).createScope(script, null);
        assertNotNull(scope.getVar("undefined"));
        assertEquals("undefined", scope.getVar("undefined").getName());
    }

    @Test
    public void testCreateScopeDeclaresActiveXObject() throws Exception {
        Compiler compiler = new Compiler();
        Node script = new Node(Token.SCRIPT);
        Scope scope = new TypedScopeCreator(compiler).createScope(script, null);
        assertEquals("ActiveXObject", scope.getVar("ActiveXObject").getName());
    }

    @Test
    public void testCreateScopeDeclaresObjectConstructor() throws Exception {
        Compiler compiler = new Compiler();
        Node script = new Node(Token.SCRIPT);
        Scope scope = new TypedScopeCreator(compiler).createScope(script, null);
        assertNotNull(scope.getVar("Object"));
    }

    @Test
    public void testCreateScopeDeclaresArrayConstructor() throws Exception {
        Compiler compiler = new Compiler();
        Node script = new Node(Token.SCRIPT);
        Scope scope = new TypedScopeCreator(compiler).createScope(script, null);
        assertNotNull(scope.getVar("Array"));
    }

    @Test
    public void testCreateScopeDeclaresStringConstructor() throws Exception {
        Compiler compiler = new Compiler();
        Node script = new Node(Token.SCRIPT);
        Scope scope = new TypedScopeCreator(compiler).createScope(script, null);
        assertNotNull(scope.getVar("String"));
    }

    @Test
    public void testCreateScopeDeclaresBooleanConstructor() throws Exception {
        Compiler compiler = new Compiler();
        Node script = new Node(Token.SCRIPT);
        Scope scope = new TypedScopeCreator(compiler).createScope(script, null);
        assertNotNull(scope.getVar("Boolean"));
    }

    @Test
    public void testCreateScopeDeclaresDateConstructor() throws Exception {
        Compiler compiler = new Compiler();
        Node script = new Node(Token.SCRIPT);
        Scope scope = new TypedScopeCreator(compiler).createScope(script, null);
        assertNotNull(scope.getVar("Date"));
    }

    @Test
    public void testCreateScopeDeclaresRegExpConstructor() throws Exception {
        Compiler compiler = new Compiler();
        Node script = new Node(Token.SCRIPT);
        Scope scope = new TypedScopeCreator(compiler).createScope(script, null);
        assertNotNull(scope.getVar("RegExp"));
    }

    @Test
    public void testCreateScopeDeclaresNumberConstructor() throws Exception {
        Compiler compiler = new Compiler();
        Node script = new Node(Token.SCRIPT);
        Scope scope = new TypedScopeCreator(compiler).createScope(script, null);
        assertNotNull(scope.getVar("Number"));
    }

    @Test
    public void testCreateScopeDeclaresFunctionConstructor() throws Exception {
        Compiler compiler = new Compiler();
        Node script = new Node(Token.SCRIPT);
        Scope scope = new TypedScopeCreator(compiler).createScope(script, null);
        assertNotNull(scope.getVar("Function"));
    }

    @Test
    public void testCreateScopeDeclaresErrorConstructor() throws Exception {
        Compiler compiler = new Compiler();
        Node script = new Node(Token.SCRIPT);
        Scope scope = new TypedScopeCreator(compiler).createScope(script, null);
        assertNotNull(scope.getVar("Error"));
    }

    @Test
    public void testCreateScopeDeclaresTypeErrorConstructor() throws Exception {
        Compiler compiler = new Compiler();
        Node script = new Node(Token.SCRIPT);
        Scope scope = new TypedScopeCreator(compiler).createScope(script, null);
        assertNotNull(scope.getVar("TypeError"));
    }

    @Test
    public void testCreateScopeDeclaresUriErrorConstructor() throws Exception {
        Compiler compiler = new Compiler();
        Node script = new Node(Token.SCRIPT);
        Scope scope = new TypedScopeCreator(compiler).createScope(script, null);
        assertNotNull(scope.getVar("URIError"));
    }

    @Test
    public void testCreateScopeDeclaresSyntaxErrorConstructor() throws Exception {
        Compiler compiler = new Compiler();
        Node script = new Node(Token.SCRIPT);
        Scope scope = new TypedScopeCreator(compiler).createScope(script, null);
        assertNotNull(scope.getVar("SyntaxError"));
    }

    @Test
    public void testCreateScopeDeclaresReferenceErrorConstructor() throws Exception {
        Compiler compiler = new Compiler();
        Node script = new Node(Token.SCRIPT);
        Scope scope = new TypedScopeCreator(compiler).createScope(script, null);
        assertNotNull(scope.getVar("ReferenceError"));
    }

    @Test
    public void testCreateScopeDeclaresRangeErrorConstructor() throws Exception {
        Compiler compiler = new Compiler();
        Node script = new Node(Token.SCRIPT);
        Scope scope = new TypedScopeCreator(compiler).createScope(script, null);
        assertNotNull(scope.getVar("RangeError"));
    }

    @Test
    public void testCreateScopeDeclaresEvalErrorConstructor() throws Exception {
        Compiler compiler = new Compiler();
        Node script = new Node(Token.SCRIPT);
        Scope scope = new TypedScopeCreator(compiler).createScope(script, null);
        assertNotNull(scope.getVar("EvalError"));
    }

    @Test
    public void testCreateScopeIncludesNoUserVariableInitially() throws Exception {
        Compiler compiler = new Compiler();
        Node script = new Node(Token.SCRIPT);
        Scope scope = new TypedScopeCreator(compiler).createScope(script, null);
        assertNull(scope.getVar("userValue"));
    }
}
```