package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Charsets;
import com.google.common.base.Preconditions;
import com.google.common.collect.Maps;
import com.google.javascript.jscomp.NodeUtil.MatchNotFunction;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.TokenStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.Map;

public class CodeGeneratorTest {
    @Test
    public void testStrictAnnotation() throws Exception {
        CodeConsumer consumer = new CodeConsumer() {
            private final StringBuilder output = new StringBuilder();

            @Override
            char getLastChar() {
                return output.length() == 0 ? '\0' : output.charAt(output.length() - 1);
            }

            @Override
            void append(String str) {
                output.append(str);
            }
        };

        CodeGenerator generator = new CodeGenerator(consumer);
        generator.tagAsStrict();
        assertEquals(';', consumer.getLastChar());
    }
}
