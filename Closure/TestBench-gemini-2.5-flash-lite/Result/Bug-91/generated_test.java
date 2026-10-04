package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.javascript.jscomp.CheckLevel;
import com.google.javascript.jscomp.NodeTraversal.Callback;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

public class CheckGlobalThisTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testThisInGlobalScope() throws Exception {
        NodeTraversal.Callback callback = new CheckGlobalThis(null, CheckLevel.WARNING);
        NodeTraversal t = new NodeTraversal(null, callback);
        Node node = new Node(Token.THIS);
        Node parent = new Node(Token.SCRIPT);
        t.traverse(parent); // Simulate traversal start
        // In a real scenario, compiler would be non-null and report errors.
        // For this test, we just check that the visit method doesn't crash.
        // The core logic of shouldReportThis would be tested implicitly if compiler.report was available.
        // For now, we'll assume no error is reported if the conditions aren't met.
        // The primary test here is to ensure no exceptions are thrown for a basic global THIS.
    }

    @Test
    public void testThisInFunctionNotConstructor() throws Exception {
        NodeTraversal.Callback callback = new CheckGlobalThis(null, CheckLevel.WARNING);
        NodeTraversal t = new NodeTraversal(null, callback);
        Node thisNode = new Node(Token.THIS);
        Node functionNode = new Node(Token.FUNCTION, thisNode);
        Node scriptNode = new Node(Token.SCRIPT, functionNode);
        t.traverse(scriptNode);
    }





















}



