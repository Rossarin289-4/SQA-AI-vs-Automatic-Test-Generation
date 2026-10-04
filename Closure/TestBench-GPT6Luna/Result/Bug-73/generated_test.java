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
        CodeConsumer consumer = new CodeConsumer() {
            private final StringBuilder code = new StringBuilder();

            @Override
            char getLastChar() {
                return code.length() == 0 ? '\0' : code.charAt(code.length() - 1);
            }

            @Override
            void append(String str) {
                code.append(str);
            }
        };
        CodeGenerator generator = new CodeGenerator(consumer);
        generator.tagAsStrict();
        assertEquals("'use strict';", consumer.toString());
    }
}
