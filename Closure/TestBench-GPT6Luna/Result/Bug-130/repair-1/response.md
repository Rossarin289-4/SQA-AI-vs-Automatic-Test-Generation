```java
package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicates;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.javascript.jscomp.GlobalNamespace.Name;
import com.google.javascript.jscomp.GlobalNamespace.Ref;
import com.google.javascript.jscomp.GlobalNamespace.Ref.Type;
import com.google.javascript.jscomp.ReferenceCollectingCallback;
import com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection;
import com.google.javascript.jscomp.Scope;
import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.rhino.IR;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.TokenStream;
import com.google.javascript.rhino.jstype.JSType;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollapsePropertiesTest {
    @Test
    public void testEmptyScriptProcessing() throws Exception {
        Compiler compiler = new Compiler();
        CollapseProperties pass = new CollapseProperties(compiler, false, false);
        Node root = IR.script();
        pass.process(null, root);
        assertEquals(Token.SCRIPT, root.getType());
        assertFalse(root.hasChildren());
    }

    @Test
    public void testSimpleGlobalVariableProcessing() throws Exception {
        Compiler compiler = new Compiler();
        CollapseProperties pass = new CollapseProperties(compiler, false, false);
        Node root = IR.script(IR.var(IR.name("v"), IR.number(1)));
        pass.process(null, root);
        assertEquals(Token.SCRIPT, root.getType());
        assertEquals(Token.VAR, root.getFirstChild().getType());
        assertEquals("v", root.getFirstChild().getFirstChild().getString());
        assertEquals(1.0, root.getFirstChild().getFirstChild()
                .getFirstChild().getDouble(), 0.0);
    }

    @Test
    public void testEmptyScriptWithInliningEnabled() throws Exception {
        Compiler compiler = new Compiler();
        CollapseProperties pass = new CollapseProperties(compiler, false, true);
        Node root = IR.script();
        pass.process(null, root);
        assertEquals(Token.SCRIPT, root.getType());
        assertFalse(root.hasChildren());
    }

    @Test
    public void testNestedGlobalObjectLiteralProcessing() throws Exception {
        Compiler compiler = new Compiler();
        CollapseProperties pass = new CollapseProperties(compiler, false, false);
        Node key = IR.stringKey("item");
        key.addChildToBack(IR.number(3));
        Node root = IR.script(IR.var(IR.name("ns"),
                IR.objectlit(key)));
        pass.process(null, root);
        assertEquals(Token.SCRIPT, root.getType());
        assertNotNull(root.getFirstChild());
        assertEquals(Token.VAR, root.getFirstChild().getType());
    }

    @Test
    public void testGlobalPropertyReadProcessing() throws Exception {
        Compiler compiler = new Compiler();
        CollapseProperties pass = new CollapseProperties(compiler, false, false);
        Node key = IR.stringKey("value");
        key.addChildToBack(IR.number(4));
        Node root = IR.script(
                IR.var(IR.name("space"),
                        IR.objectlit(key)),
                IR.exprResult(IR.getprop(IR.name("space"), IR.string("value"))));
        pass.process(null, root);
        assertEquals(Token.SCRIPT, root.getType());
        assertNotNull(root.getFirstChild());
        assertNotNull(root.getLastChild());
    }

    @Test
    public void testGlobalPropertyAssignmentProcessing() throws Exception {
        Compiler compiler = new Compiler();
        CollapseProperties pass = new CollapseProperties(compiler, false, false);
        Node root = IR.script(
                IR.var(IR.name("space"), IR.objectlit()),
                IR.exprResult(IR.assign(
                        IR.getprop(IR.name("space"), IR.string("value")), IR.number(5))));
        pass.process(null, root);
        assertEquals(Token.SCRIPT, root.getType());
        assertNotNull(root.getFirstChild());
    }

    @Test
    public void testDollarInPropertyNameProcessing() throws Exception {
        Compiler compiler = new Compiler();
        CollapseProperties pass = new CollapseProperties(compiler, false, false);
        Node key = IR.stringKey("a$b");
        key.addChildToBack(IR.number(6));
        Node root = IR.script(
                IR.var(IR.name("space"),
                        IR.objectlit(key)),
                IR.exprResult(IR.getprop(IR.name("space"), IR.string("a$b"))));
        pass.process(null, root);
        assertEquals(Token.SCRIPT, root.getType());
        assertNotNull(root.getFirstChild());
    }

    @Test
    public void testComputedPropertyAccessRemainsProcessable() throws Exception {
        Compiler compiler = new Compiler();
        CollapseProperties pass = new CollapseProperties(compiler, false, false);
        Node key = IR.stringKey("value");
        key.addChildToBack(IR.number(7));
        Node root = IR.script(
                IR.var(IR.name("space"),
                        IR.objectlit(key)),
                IR.exprResult(IR.getelem(IR.name("space"), IR.string("value"))));
        pass.process(null, root);
        assertEquals(Token.SCRIPT, root.getType());
        assertEquals(Token.GETELEM,
                root.getLastChild().getFirstChild().getType());
    }

    @Test
    public void testRepeatedNamespaceDefinitionProcessing() throws Exception {
        Compiler compiler = new Compiler();
        CollapseProperties pass = new CollapseProperties(compiler, false, false);
        Node root = IR.script(
                IR.var(IR.name("space"), IR.objectlit()),
                IR.exprResult(IR.assign(IR.name("space"), IR.objectlit())));
        pass.process(null, root);
        assertEquals(Token.SCRIPT, root.getType());
        assertNotNull(root.getFirstChild());
    }

    @Test
    public void testLocalFunctionInsidePropertyProcessing() throws Exception {
        Compiler compiler = new Compiler();
        CollapseProperties pass = new CollapseProperties(compiler, false, false);
        Node fn = IR.function(IR.name(""), IR.paramList(), IR.block());
        Node key = IR.stringKey("run");
        key.addChildToBack(fn);
        Node root = IR.script(IR.var(IR.name("space"),
                IR.objectlit(key)));
        pass.process(null, root);
        assertEquals(Token.SCRIPT, root.getType());
        assertNotNull(root.getFirstChild());
    }

    @Test
    public void testExternRootOverloadProcessing() throws Exception {
        Compiler compiler = new Compiler();
        CollapseProperties pass = new CollapseProperties(compiler, true, false);
        Node externs = IR.script();
        Node root = IR.script();
        pass.process(externs, root);
        assertEquals(Token.SCRIPT, root.getType());
        assertFalse(root.hasChildren());
    }

    @Test
    public void testNestedPropertyReadProcessing() throws Exception {
        Compiler compiler = new Compiler();
        CollapseProperties pass = new CollapseProperties(compiler, false, false);
        Node innerKey = IR.stringKey("value");
        innerKey.addChildToBack(IR.number(8));
        Node outerKey = IR.stringKey("inner");
        outerKey.addChildToBack(IR.objectlit(innerKey));
        Node root = IR.script(
                IR.var(IR.name("space"), IR.objectlit(outerKey)),
                IR.exprResult(IR.getprop(
                        IR.getprop(IR.name("space"), IR.string("inner")),
                        IR.string("value"))));
        pass.process(null, root);
        assertEquals(Token.SCRIPT, root.getType());
        assertNotNull(root.getFirstChild());
        assertNotNull(root.getLastChild());
    }
}
```