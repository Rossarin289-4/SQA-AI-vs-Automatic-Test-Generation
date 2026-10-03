package com.google.javascript.jscomp.parsing;

import org.junit.Test;
import static org.junit.Assert.*;

public class IRFactoryAI37Test {

    @Test
    public void testSuspiciousCommentWarningConstant() {
        assertEquals(
            "Non-JSDoc comment has annotations. Did you mean to start it with '/**'?",
            IRFactory.SUSPICIOUS_COMMENT_WARNING
        );
    }
}
