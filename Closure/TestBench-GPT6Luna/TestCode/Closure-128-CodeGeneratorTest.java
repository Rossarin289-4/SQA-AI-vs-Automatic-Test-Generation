package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Charsets;
import com.google.common.base.Preconditions;
import com.google.common.collect.Maps;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.TokenStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.Map;

public class CodeGeneratorTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }
    @Test
    public void testStrictAnnotationAddsExpectedText() throws Exception {
        RecordingConsumer consumer = new RecordingConsumer();
        CodeGenerator generator = CodeGenerator.forCostEstimation(consumer);

        generator.tagAsStrict();

        assertEquals("'use strict';", consumer.output.toString());
    }

    @Test
    public void testStrictAnnotationAddsTextOncePerCall() throws Exception {
        RecordingConsumer consumer = new RecordingConsumer();
        CodeGenerator generator = CodeGenerator.forCostEstimation(consumer);

        generator.tagAsStrict();
        generator.tagAsStrict();

        assertEquals("'use strict';'use strict';", consumer.output.toString());
    }

    private static class RecordingConsumer extends CodeConsumer {
        private final StringBuilder output = new StringBuilder();

        @Override
        char getLastChar() {
            return output.length() == 0 ? '\0' : output.charAt(output.length() - 1);
        }

        @Override
        void append(String str) {
            output.append(str);
        }
    }
}
