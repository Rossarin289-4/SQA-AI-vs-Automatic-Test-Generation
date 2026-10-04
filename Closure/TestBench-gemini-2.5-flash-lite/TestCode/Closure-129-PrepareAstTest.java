package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import com.google.javascript.rhino.IR;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

public class PrepareAstTest {

    // Helper to create a simple compiler for testing


    // Helper method to create a Node with a given type and children
    private Node createNode(int type, Node... children) {
        Node n = new Node(type);
        for (Node child : children) {
            n.addChildToBack(child);
        }
        return n;
    }

    // Helper method to create a Node with a given type, source reference, and children
    private Node createNode(int type, Node srcref, Node... children) {
        Node n = new Node(type, srcref.getLineno(), srcref.getCharno());
        for (Node child : children) {
            n.addChildToBack(child);
        }
        return n;
    }

    // Helper method to set parent pointers for a subtree

































    @Test
    public void testNormalizeObjectLiteralKeyAnnotationsMovesJsDocToFunctionValueWhenValueIsFunction() throws Exception {
        Node objLit = IR.objectLit();
        Node key = IR.stringKey("method");
        Node functionValue = IR.function(null, IR.newNode(Token.PARAM_LIST), IR.block());
        key.addChildToBack(functionValue);
        JSDocInfoBuilder jsDocBuilder = new JSDocInfoBuilder(false);
        jsDocBuilder.recordDescription("A test description.");
        key.setJSDocInfo(jsDocBuilder.build());
        objLit.addChildToBack(key);
        setParentPointers(objLit, key);
        setParentPointers(key, functionValue);

        compiler.prepareAst(objLit);

        assertNull(key.getJSDocInfo()); // JSDoc should be moved from the key
        assertNotNull(functionValue.getJSDocInfo()); // JSDoc should now be on the function value
        assertEquals("A test description.", functionValue.getJSDocInfo().getDescription());
    }

    @Test
    public void testNormalizeObjectLiteralKeyAnnotationsDoesNotMoveJsDocWhenValueIsNotFunction() throws Exception {
        Node objLit = IR.objectLit();
        Node key = IR.stringKey("property");
        Node stringValue = IR.string("value");
        key.addChildToBack(stringValue);
        JSDocInfoBuilder jsDocBuilder = new JSDocInfoBuilder(false);
        jsDocBuilder.recordDescription("A test description.");
        key.setJSDocInfo(jsDocBuilder.build());
        objLit.addChildToBack(key);
        setParentPointers(objLit, key);
        setParentPointers(key, stringValue);

        compiler.prepareAst(objLit);

        assertNotNull(key.getJSDocInfo()); // JSDoc should remain on the key
        assertEquals("A test description.", key.getJSDocInfo().getDescription());
        assertNull(stringValue.getJSDocInfo()); // JSDoc should not be on the string value
    }

    @Test
    public void testNormalizeObjectLiteralKeyAnnotationsHandlesEmptyObjectLiteral() throws Exception {
        Node objLit = IR.objectLit();
        compiler.prepareAst(objLit);
        // Should not throw an exception and objLit should remain empty.
        assertNull(objLit.getFirstChild());
    }

    @Test
    public void testNormalizeObjectLiteralKeyAnnotationsHandlesObjectLiteralWithOnlyKeys() throws Exception {
        Node objLit = IR.objectLit();
        Node key = IR.stringKey("onlyKey");
        objLit.addChildToBack(key);
        setParentPointers(objLit, key);
        compiler.prepareAst(objLit);
        // Should not throw and the key should remain.
        assertNotNull(objLit.getFirstChild());
        assertEquals(Token.STRING_KEY, objLit.getFirstChild().getType());
    }

    @Test
    public void testAnnotateCallsWithCastAsFirstChild() throws Exception {
        Node root = IR.script();
        Node castNode = IR.cast(IR.name("eval"), IR.newNode(Token.STRING)); // Cast with eval as target
        Node callNode = IR.call(castNode);
        root.addChildToBack(callNode);
        setParentPointers(root, callNode);

        compiler.prepareAst(root);

        // The first child of the call is a CAST. The logic unwraps it.
        // The unwrapped node is a NAME node with value "eval".
        // Thus, DIRECT_EVAL should be true.
        assertTrue(callNode.getFirstChild().getFirstChild().getBooleanProp(Node.DIRECT_EVAL));
    }

    @Test
    public void testAnnotateCallsIgnoresCastNodesForFreeCall() throws Exception {
        Node root = IR.script();
        Node castNode = IR.cast(IR.getprop(IR.name("obj"), IR.stringKey("method")), IR.newNode(Token.STRING));
        Node callNode = IR.call(castNode);
        root.addChildToBack(callNode);
        setParentPointers(root, callNode);

        compiler.prepareAst(root);

        // The unwrapped node is a GETPROP, so FREE_CALL should be false.
        assertFalse(callNode.hasProperty(Node.FREE_CALL));
    }
}





