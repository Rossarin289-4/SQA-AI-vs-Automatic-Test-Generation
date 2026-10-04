package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import com.google.javascript.jscomp.mozilla.rhino.ScriptRuntime;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.TernaryValue;

public class PeepholeFoldConstantsTest {
    @Test
    public void testClassHasNoPublicMethods() throws Exception {
        assertEquals(30, PeepholeFoldConstants.class.getDeclaredMethods().length);
    }
}
