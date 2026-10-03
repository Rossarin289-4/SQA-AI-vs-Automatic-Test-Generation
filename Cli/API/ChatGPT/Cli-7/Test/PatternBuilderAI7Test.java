package org.apache.commons.cli2.builder;

import org.apache.commons.cli2.Option;
import org.junit.Test;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class PatternBuilderAI7Test {

    @Test
    public void testCreateSingleOption() {
        PatternBuilder builder = new PatternBuilder();
        builder.withPattern("a");
        Option option = builder.create();
        assertNotNull(option);
    }

    @Test
    public void testCreateMultipleOptions() {
        PatternBuilder builder = new PatternBuilder();
        builder.withPattern("a!b");
        Option option = builder.create();
        assertNotNull(option);
    }

    @Test
    public void testPatternWithValidator() {
        PatternBuilder builder = new PatternBuilder();
        builder.withPattern("a%!");
        Option option = builder.create();
        assertNotNull(option);
        assertTrue(option.isRequired());
    }
}
