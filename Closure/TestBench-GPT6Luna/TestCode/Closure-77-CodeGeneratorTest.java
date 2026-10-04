package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Charsets;
import com.google.common.base.Preconditions;
import com.google.javascript.jscomp.NodeUtil.MatchNotFunction;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.TokenStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;

public class CodeGeneratorTest {
    @Test
    public void testTagAsStrictEmitsDirective() throws Exception {
        StringBuilder out = new StringBuilder();
        CodeGenerator generator = new CodeGenerator(new CodeConsumer() {
            @Override char getLastChar() { return out.length() == 0 ? '\0' : out.charAt(out.length() - 1); }
            @Override void append(String str) { out.append(str); }
        });
        generator.tagAsStrict();
        assertEquals("'use strict';", out.toString());
    }
}
