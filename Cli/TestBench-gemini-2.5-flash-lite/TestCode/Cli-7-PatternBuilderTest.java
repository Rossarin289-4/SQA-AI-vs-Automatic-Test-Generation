package org.apache.commons.cli2.builder;

import junit.framework.TestCase;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.List;
import java.util.Comparator;
import java.util.ListIterator;
import org.apache.commons.cli2.Option;
import org.apache.commons.cli2.OptionException;
import org.apache.commons.cli2.validation.ClassValidator;
import org.apache.commons.cli2.validation.DateValidator;
import org.apache.commons.cli2.validation.FileValidator;
import org.apache.commons.cli2.validation.NumberValidator;
import org.apache.commons.cli2.validation.UrlValidator;
import org.apache.commons.cli2.validation.Validator;
import org.apache.commons.cli2.validation.InvalidArgumentException;
import org.apache.commons.cli2.Group;
import org.apache.commons.cli2.WriteableCommandLine;

public class PatternBuilderTest extends TestCase {

    public void testCreateWithSingleOption() throws Exception {
        PatternBuilder pb = new PatternBuilder();
        pb.withPattern("a");
        Option option = pb.create();
        assertNotNull(option);
        // The preferred name of an option is used for generating help and usage information.
        // For single character options, the short name is used.
        assertEquals("Option preferred name should be 'a'", "a", option.getPreferredName());
        assertFalse("Option should not be required", option.isRequired());
    }

    public void testBuilderWithCustomBuilders() throws Exception {
        GroupBuilder gb = new GroupBuilder();
        DefaultOptionBuilder dob = new DefaultOptionBuilder();
        ArgumentBuilder ab = new ArgumentBuilder();
        PatternBuilder pb = new PatternBuilder(gb, dob, ab);
        pb.withPattern("x");
        Option option = pb.create();
        assertNotNull(option);
        // The preferred name of an option is used for generating help and usage information.
        // For single character options, the short name is used.
        assertEquals("Option preferred name should be 'x'", "x", option.getPreferredName());
    }
}
