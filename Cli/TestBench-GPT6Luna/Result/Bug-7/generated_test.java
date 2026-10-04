package org.apache.commons.cli2.builder;

import junit.framework.TestCase;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import org.apache.commons.cli2.Argument;
import org.apache.commons.cli2.Option;
import org.apache.commons.cli2.validation.ClassValidator;
import org.apache.commons.cli2.validation.DateValidator;
import org.apache.commons.cli2.validation.FileValidator;
import org.apache.commons.cli2.validation.NumberValidator;
import org.apache.commons.cli2.validation.UrlValidator;
import org.apache.commons.cli2.validation.Validator;

public class PatternBuilderTest extends TestCase {
    public void testSingleOption() throws Exception {
        PatternBuilder builder = new PatternBuilder();
        builder.withPattern("a");
        Option option = builder.create();
        assertEquals("-a", option.getPreferredName());
        assertFalse(option.isRequired());
    }

    public void testRequiredOption() throws Exception {
        PatternBuilder builder = new PatternBuilder();
        builder.withPattern("!a");
        Option option = builder.create();
        assertEquals("-a", option.getPreferredName());
        assertTrue(option.isRequired());
    }

    public void testArgumentOption() throws Exception {
        PatternBuilder builder = new PatternBuilder();
        builder.withPattern(":a");
        Option option = builder.create();
        assertEquals("-a", option.getPreferredName());
    }

    public void testRequiredArgumentOption() throws Exception {
        PatternBuilder builder = new PatternBuilder();
        builder.withPattern("!:a");
        Option option = builder.create();
        assertEquals("-a", option.getPreferredName());
        assertTrue(option.isRequired());
    }

    public void testTwoOptionsCreateGroup() throws Exception {
        PatternBuilder builder = new PatternBuilder();
        builder.withPattern("ab");
        Option option = builder.create();
        assertNotNull(option);
    }

    public void testThreeOptionsCreateGroup() throws Exception {
        PatternBuilder builder = new PatternBuilder();
        builder.withPattern("abc");
        Option option = builder.create();
        assertNotNull(option);
    }

    public void testDuplicateOptionsAreDeduplicated() throws Exception {
        PatternBuilder builder = new PatternBuilder();
        builder.withPattern("aa");
        Option option = builder.create();
        assertEquals("-a", option.getPreferredName());
    }

    public void testTypeMarkerAppliesToFollowingOption() throws Exception {
        PatternBuilder builder = new PatternBuilder();
        builder.withPattern("%a");
        Option option = builder.create();
        assertEquals("-a", option.getPreferredName());
    }

    public void testTypeMarkerResetForNextOption() throws Exception {
        PatternBuilder builder = new PatternBuilder();
        builder.withPattern("%ab");
        Option option = builder.create();
        assertNotNull(option);
    }

    public void testRequiredMarkerAppliesToOption() throws Exception {
        PatternBuilder builder = new PatternBuilder();
        builder.withPattern("!ab");
        Option option = builder.create();
        assertNotNull(option);
    }

    public void testMultipleRequiredMarkersRemainRequired() throws Exception {
        PatternBuilder builder = new PatternBuilder();
        builder.withPattern("!!a");
        Option option = builder.create();
        assertTrue(option.isRequired());
    }

    public void testResetDiscardsPendingPattern() throws Exception {
        PatternBuilder builder = new PatternBuilder();
        builder.withPattern("a");
        builder.reset();
        builder.withPattern("b");
        assertEquals("-b", builder.create().getPreferredName());
    }

    public void testCreateResetsBuilderForNextPattern() throws Exception {
        PatternBuilder builder = new PatternBuilder();
        builder.withPattern("a");
        builder.create();
        builder.withPattern("b");
        assertEquals("-b", builder.create().getPreferredName());
    }

    public void testEmptyPatternCreatesEmptyGroup() throws Exception {
        PatternBuilder builder = new PatternBuilder();
        builder.withPattern("");
        assertNotNull(builder.create());
    }

    public void testTypeMarkerWithoutOptionDoesNotCreatePendingOption() throws Exception {
        PatternBuilder builder = new PatternBuilder();
        builder.withPattern("%");
        builder.withPattern("a");
        assertEquals("-a", builder.create().getPreferredName());
    }

    public void testOptionAtEndOfPatternIsCreated() throws Exception {
        PatternBuilder builder = new PatternBuilder();
        builder.withPattern("ab");
        Option option = builder.create();
        assertNotNull(option);
    }

    public void testSlashTypeMarkerPattern() throws Exception {
        PatternBuilder builder = new PatternBuilder();
        builder.withPattern("/a");
        assertEquals("-a", builder.create().getPreferredName());
    }

    public void testStarTypeMarkerPattern() throws Exception {
        PatternBuilder builder = new PatternBuilder();
        builder.withPattern("*a");
        assertEquals("-a", builder.create().getPreferredName());
    }

    public void testAngleTypeMarkerPattern() throws Exception {
        PatternBuilder builder = new PatternBuilder();
        builder.withPattern("<a");
        assertEquals("-a", builder.create().getPreferredName());
    }

    public void testGreaterThanTypeMarkerPattern() throws Exception {
        PatternBuilder builder = new PatternBuilder();
        builder.withPattern(">a");
        assertEquals("-a", builder.create().getPreferredName());
    }
}
