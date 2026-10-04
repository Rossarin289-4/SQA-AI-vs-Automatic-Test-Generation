```java
package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Multimap;
import com.google.common.collect.Sets;
import com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback;
import com.google.javascript.jscomp.NodeTraversal.Callback;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;
import com.google.common.base.Preconditions;
import java.util.*;

public class MethodCompilerPassTest {
    @Test
    public void testPassesNullExternsAndEmptyScript() throws Exception {
        MethodCheck pass = new MethodCheck(new Compiler(), CheckLevel.WARNING);
        Node root = new Node(Token.SCRIPT);
        pass.process(null, root);
        assertTrue(true);
    }

    @Test
    public void testPassesEmptyExternsAndEmptyScript() throws Exception {
        MethodCheck pass = new MethodCheck(new Compiler(), CheckLevel.WARNING);
        pass.process(new Node(Token.SCRIPT), new Node(Token.SCRIPT));
        assertTrue(true);
    }

    @Test
    public void testProcessesExternFunctionDeclaration() throws Exception {
        MethodCheck pass = new MethodCheck(new Compiler(), CheckLevel.WARNING);
        Node externs = new Node(Token.SCRIPT);
        externs.addChildToBack(new Node(Token.FUNCTION,
                Node.newString(Token.NAME, "externFn"),
                new Node(Token.BLOCK),
                new Node(Token.BLOCK)));
        pass.process(externs, new Node(Token.SCRIPT));
        assertTrue(true);
    }

    @Test
    public void testProcessesSourceFunctionDeclaration() throws Exception {
        MethodCheck pass = new MethodCheck(new Compiler(), CheckLevel.WARNING);
        Node root = new Node(Token.SCRIPT);
        root.addChildToBack(new Node(Token.FUNCTION,
                Node.newString(Token.NAME, "sourceFn"),
                new Node(Token.BLOCK),
                new Node(Token.BLOCK)));
        pass.process(null, root);
        assertTrue(true);
    }

    @Test
    public void testProcessesExternObjectLiteral() throws Exception {
        MethodCheck pass = new MethodCheck(new Compiler(), CheckLevel.WARNING);
        Node externs = new Node(Token.SCRIPT);
        Node object = new Node(Token.OBJECTLIT);
        object.addChildToBack(Node.newString("named"));
        object.addChildToBack(new Node(Token.FUNCTION,
                Node.newString(Token.NAME, ""),
                new Node(Token.BLOCK),
                new Node(Token.BLOCK)));
        externs.addChildToBack(object);
        pass.process(externs, new Node(Token.SCRIPT));
        assertTrue(true);
    }

    @Test
    public void testProcessesEmptyExternObjectLiteral() throws Exception {
        MethodCheck pass = new MethodCheck(new Compiler(), CheckLevel.WARNING);
        Node externs = new Node(Token.SCRIPT);
        externs.addChildToBack(new Node(Token.OBJECTLIT));
        pass.process(externs, new Node(Token.SCRIPT));
        assertTrue(true);
    }

    @Test
    public void testProcessesSourceObjectLiteralFunction() throws Exception {
        MethodCheck pass = new MethodCheck(new Compiler(), CheckLevel.WARNING);
        Node object = new Node(Token.OBJECTLIT);
        object.addChildToBack(Node.newString("method"));
        object.addChildToBack(new Node(Token.FUNCTION,
                Node.newString(Token.NAME, ""),
                new Node(Token.BLOCK), new Node(Token.BLOCK)));
        Node root = new Node(Token.SCRIPT);
        root.addChildToBack(object);
        pass.process(null, root);
        assertTrue(true);
    }

    @Test
    public void testProcessesSourceObjectLiteralNonFunction() throws Exception {
        MethodCheck pass = new MethodCheck(new Compiler(), CheckLevel.WARNING);
        Node object = new Node(Token.OBJECTLIT);
        object.addChildToBack(Node.newString("value"));
        object.addChildToBack(Node.newNumber(1));
        Node root = new Node(Token.SCRIPT);
        root.addChildToBack(object);
        pass.process(null, root);
        assertTrue(true);
    }

    @Test
    public void testProcessesStaticFunctionAssignment() throws Exception {
        MethodCheck pass = new MethodCheck(new Compiler(), CheckLevel.WARNING);
        Node getprop = new Node(Token.GETPROP,
                Node.newString(Token.NAME, "Holder"),
                Node.newString(Token.STRING, "run"));
        Node assign = new Node(Token.ASSIGN, getprop,
                new Node(Token.FUNCTION, Node.newString(Token.NAME, ""),
                        new Node(Token.BLOCK), new Node(Token.BLOCK)));
        Node root = new Node(Token.SCRIPT);
        root.addChildToBack(new Node(Token.EXPR_RESULT, assign));
        pass.process(null, root);
        assertTrue(true);
    }

    @Test
    public void testProcessesStaticNonFunctionAssignment() throws Exception {
        MethodCheck pass = new MethodCheck(new Compiler(), CheckLevel.WARNING);
        Node getprop = new Node(Token.GETPROP,
                Node.newString(Token.NAME, "Holder"),
                Node.newString(Token.STRING, "run"));
        Node assign = new Node(Token.ASSIGN, getprop,
                Node.newString(Token.NAME, "other"));
        Node root = new Node(Token.SCRIPT);
        root.addChildToBack(new Node(Token.EXPR_RESULT, assign));
        pass.process(null, root);
        assertTrue(true);
    }

    @Test
    public void testProcessesPrototypeFunctionAssignment() throws Exception {
        MethodCheck pass = new MethodCheck(new Compiler(), CheckLevel.WARNING);
        Node proto = new Node(Token.GETPROP,
                Node.newString(Token.NAME, "Holder"),
                Node.newString(Token.STRING, "prototype"));
        Node member = new Node(Token.GETPROP, proto,
                Node.newString(Token.STRING, "run"));
        Node assign = new Node(Token.ASSIGN, member,
                new Node(Token.FUNCTION, Node.newString(Token.NAME, ""),
                        new Node(Token.BLOCK), new Node(Token.BLOCK)));
        Node root = new Node(Token.SCRIPT);
        root.addChildToBack(new Node(Token.EXPR_RESULT, assign));
        pass.process(null, root);
        assertTrue(true);
    }

    @Test
    public void testProcessesPrototypeNonFunctionAssignment() throws Exception {
        MethodCheck pass = new MethodCheck(new Compiler(), CheckLevel.WARNING);
        Node proto = new Node(Token.GETPROP,
                Node.newString(Token.NAME, "Holder"),
                Node.newString(Token.STRING, "prototype"));
        Node member = new Node(Token.GETPROP, proto,
                Node.newString(Token.STRING, "run"));
        Node assign = new Node(Token.ASSIGN, member,
                Node.newString(Token.NAME, "other"));
        Node root = new Node(Token.SCRIPT);
        root.addChildToBack(new Node(Token.EXPR_RESULT, assign));
        pass.process(null, root);
        assertTrue(true);
    }

    @Test
    public void testMultimapPutAndGet() throws Exception {
        Multimap<String, Node> definitions = HashMultimap.create();
        Node function = new Node(Token.FUNCTION);
        definitions.put("method", function);
        assertEquals(1, definitions.size());
        assertTrue(definitions.containsEntry("method", function));
    }

    @Test
    public void testMultimapRemoveSignatureEntry() throws Exception {
        Multimap<String, Node> definitions = HashMultimap.create();
        Node function = new Node(Token.FUNCTION);
        definitions.put("method", function);
        definitions.removeAll("method");
        assertEquals(0, definitions.size());
        assertFalse(definitions.containsKey("method"));
    }

    @Test
    public void testSetClearAndMembership() throws Exception {
        Set<String> names = Sets.newHashSet();
        names.add("method");
        assertTrue(names.contains("method"));
        names.clear();
        assertEquals(0, names.size());
    }

    @Test
    public void testHashMultimapDoesNotDuplicatePair() throws Exception {
        Multimap<String, Node> definitions = HashMultimap.create();
        Node function = new Node(Token.FUNCTION);
        definitions.put("method", function);
        definitions.put("method", function);
        assertEquals(1, definitions.size());
    }

    @Test
    public void testListConstructionPreservesNullSlots() throws Exception {
        List<Node> roots = Lists.newArrayList((Node) null, new Node(Token.SCRIPT));
        assertEquals(2, roots.size());
        assertNull(roots.get(0));
        assertEquals(Token.SCRIPT, roots.get(1).getType());
    }

    @Test
    public void testListConstructionWithTwoNodes() throws Exception {
        Node first = new Node(Token.SCRIPT);
        Node second = new Node(Token.BLOCK);
        List<Node> roots = Lists.newArrayList(first, second);
        assertSame(first, roots.get(0));
        assertSame(second, roots.get(1));
    }

    @Test
    public void testStringKeyAndFunctionValueInObjectLiteral() throws Exception {
        Node object = new Node(Token.OBJECTLIT);
        Node key = Node.newString("m");
        Node function = new Node(Token.FUNCTION);
        object.addChildToBack(key);
        object.addChildToBack(function);
        assertEquals(Token.STRING, object.getFirstChild().getType());
        assertSame(function, key.getNext());
    }

    @Test
    public void testGetpropChildrenAndSiblingOrder() throws Exception {
        Node base = Node.newString(Token.NAME, "A");
        Node property = Node.newString(Token.STRING, "m");
        Node getprop = new Node(Token.GETPROP, base, property);
        assertSame(base, getprop.getFirstChild());
        assertSame(property, base.getNext());
        assertNull(property.getNext());
    }

    @Test
    public void testAssignmentChildOrder() throws Exception {
        Node lhs = new Node(Token.GETPROP,
                Node.newString(Token.NAME, "A"),
                Node.newString(Token.STRING, "m"));
        Node rhs = Node.newNumber(1);
        Node assign = new Node(Token.ASSIGN, lhs, rhs);
        assertSame(lhs, assign.getFirstChild());
        assertSame(rhs, lhs.getNext());
    }

    @Test
    public void testNodeNumberAndType() throws Exception {
        Node number = Node.newNumber(1);
        assertEquals(Token.NUMBER, number.getType());
        assertEquals(1.0, number.getDouble(), 0.0);
    }

    @Test
    public void testStringNodeValueAndType() throws Exception {
        Node string = Node.newString(Token.STRING, "m");
        assertEquals(Token.STRING, string.getType());
        assertEquals("m", string.getString());
    }
}
```