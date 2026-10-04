package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.TernaryValue;
import java.util.List;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;

public class PeepholeFoldConstantsTest {
    @Test
    public void testCannotInstantiatePublicApiSubjectAsSpecified() throws Exception {
        assertEquals(Token.NUMBER, Node.newNumber(1).getType());
    }
}
