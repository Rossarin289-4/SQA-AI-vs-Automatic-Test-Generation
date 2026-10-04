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
import org.apache.commons.cli2.DefaultOption; // Added import for DefaultOption

public class PatternBuilderTest extends TestCase {

    public void testEmptyPattern() throws Exception {
        PatternBuilder pb = new PatternBuilder();
        Option option = pb.withPattern("").create();
        assertNotNull(option);
        // The create() method returns a Group if there's more than one option,
        // or the single option if there's only one.
        // For an empty pattern, it should result in a Group with no options.
        assertTrue("Expected Group, but was " + option.getClass().getName(), option instanceof org.apache.commons.cli2.Group);
        org.apache.commons.cli2.Group group = (org.apache.commons.cli2.Group) option;
        assertFalse("Group should not be required", group.isRequired());
        assertEquals("Group should have no options", 0, group.getOptions().size());
    }

    public void testSingleOptionNoArgument() throws Exception {
        PatternBuilder pb = new PatternBuilder();
        Option option = pb.withPattern("a").create();
        assertNotNull(option);
        assertEquals("Option short name should be 'a'", "a", option.getPreferredName());
        assertFalse("Option should not be required", option.isRequired());
        // The getArgument() method is available on Option.
        assertNull("Option should not have an argument", option.getArgument());
    }

    public void testSingleOptionRequiredNoArgument() throws Exception {
        PatternBuilder pb = new PatternBuilder();
        Option option = pb.withPattern("!a").create();
        assertNotNull(option);
        assertEquals("Option short name should be 'a'", "a", option.getPreferredName());
        assertTrue("Option should be required", option.isRequired());
        assertNull("Option should not have an argument", option.getArgument());
    }

    public void testSingleOptionWithType() throws Exception {
        PatternBuilder pb = new PatternBuilder();
        Option option = pb.withPattern("a:").create(); // ':' indicates String type, but handled as null argument here
        assertNotNull(option);
        assertEquals("Option short name should be 'a'", "a", option.getPreferredName());
        assertFalse("Option should not be required", option.isRequired());
        assertNotNull("Option should have an argument", option.getArgument());
        assertNull("Argument validator should be null", option.getArgument().getValidator());
    }

    public void testSingleOptionWithClassType() throws Exception {
        PatternBuilder pb = new PatternBuilder();
        Option option = pb.withPattern("a@").create();
        assertNotNull(option);
        assertEquals("Option short name should be 'a'", "a", option.getPreferredName());
        assertFalse("Option should not be required", option.isRequired());
        assertNotNull("Option should have an argument", option.getArgument());
        assertTrue("Argument validator should be a ClassValidator", option.getArgument().getValidator() instanceof ClassValidator);
        ClassValidator validator = (ClassValidator) option.getArgument().getValidator();
        assertTrue("ClassValidator should be instance check", validator.isInstance());
    }

    public void testSingleOptionWithInstanceClassType() throws Exception {
        PatternBuilder pb = new PatternBuilder();
        Option option = pb.withPattern("a+").create();
        assertNotNull(option);
        assertEquals("Option short name should be 'a'", "a", option.getPreferredName());
        assertFalse("Option should not be required", option.isRequired());
        assertNotNull("Option should have an argument", option.getArgument());
        assertTrue("Argument validator should be a ClassValidator", option.getArgument().getValidator() instanceof ClassValidator);
        ClassValidator validator = (ClassValidator) option.getArgument().getValidator();
        assertFalse("ClassValidator should not be instance check", validator.isInstance());
    }

    public void testSingleOptionWithNumberType() throws Exception {
        PatternBuilder pb = new PatternBuilder();
        Option option = pb.withPattern("a%").create();
        assertNotNull(option);
        assertEquals("Option short name should be 'a'", "a", option.getPreferredName());
        assertFalse("Option should not be required", option.isRequired());
        assertNotNull("Option should have an argument", option.getArgument());
        assertTrue("Argument validator should be a NumberValidator", option.getArgument().getValidator() instanceof NumberValidator);
    }

    public void testSingleOptionWithDateType() throws Exception {
        PatternBuilder pb = new PatternBuilder();
        Option option = pb.withPattern("a#").create();
        assertNotNull(option);
        assertEquals("Option short name should be 'a'", "a", option.getPreferredName());
        assertFalse("Option should not be required", option.isRequired());
        assertNotNull("Option should have an argument", option.getArgument());
        assertTrue("Argument validator should be a DateValidator", option.getArgument().getValidator() instanceof DateValidator);
    }

    public void testSingleOptionWithExistingDirectoryType() throws Exception {
        PatternBuilder pb = new PatternBuilder();
        Option option = pb.withPattern("a<").create();
        assertNotNull(option);
        assertEquals("Option short name should be 'a'", "a", option.getPreferredName());
        assertFalse("Option should not be required", option.isRequired());
        assertNotNull("Option should have an argument", option.getArgument());
        assertTrue("Argument validator should be a FileValidator", option.getArgument().getValidator() instanceof FileValidator);
        FileValidator validator = (FileValidator) option.getArgument().getValidator();
        assertTrue("FileValidator should be for existing entries", validator.isExisting());
        assertTrue("FileValidator should be for directories", validator.isDirectory());
        assertFalse("FileValidator should not be for files", validator.isFile());
    }

    public void testSingleOptionWithFileType() throws Exception {
        PatternBuilder pb = new PatternBuilder();
        Option option = pb.withPattern("a>").create();
        assertNotNull(option);
        assertEquals("Option short name should be 'a'", "a", option.getPreferredName());
        assertFalse("Option should not be required", option.isRequired());
        assertNotNull("Option should have an argument", option.getArgument());
        assertTrue("Argument validator should be a FileValidator", option.getArgument().getValidator() instanceof FileValidator);
        FileValidator validator = (FileValidator) option.getArgument().getValidator();
        assertFalse("FileValidator should not be for existing entries", validator.isExisting());
        assertFalse("FileValidator should not be for directories", validator.isDirectory());
        assertTrue("FileValidator should be for files", validator.isFile());
    }

    public void testSingleOptionWithWildcardFileType() throws Exception {
        PatternBuilder pb = new PatternBuilder();
        Option option = pb.withPattern("a*").create();
        assertNotNull(option);
        assertEquals("Option short name should be 'a'", "a", option.getPreferredName());
        assertFalse("Option should not be required", option.isRequired());
        assertNotNull("Option should have an argument", option.getArgument());
        assertTrue("Argument validator should be a FileValidator", option.getArgument().getValidator() instanceof FileValidator);
        FileValidator validator = (FileValidator) option.getArgument().getValidator();
        assertFalse("FileValidator should not be for existing entries", validator.isExisting());
        assertFalse("FileValidator should not be for directories", validator.isDirectory());
        assertTrue("FileValidator should be for files", validator.isFile());
    }

    public void testSingleOptionWithUrlType() throws Exception {
        PatternBuilder pb = new PatternBuilder();
        Option option = pb.withPattern("a/").create();
        assertNotNull(option);
        assertEquals("Option short name should be 'a'", "a", option.getPreferredName());
        assertFalse("Option should not be required", option.isRequired());
        assertNotNull("Option should have an argument", option.getArgument());
        assertTrue("Argument validator should be a UrlValidator", option.getArgument().getValidator() instanceof UrlValidator);
    }

    public void testTwoOptions() throws Exception {
        PatternBuilder pb = new PatternBuilder();
        pb.withPattern("ab");
        Option option = pb.create();
        assertNotNull(option);
        assertTrue("Expected Group, but was " + option.getClass().getName(), option instanceof org.apache.commons.cli2.Group);
        org.apache.commons.cli2.Group group = (org.apache.commons.cli2.Group) option;
        assertEquals("Group should have two options", 2, group.getOptions().size());

        Iterator it = group.getOptions().iterator();
        Option optA = (Option) it.next();
        assertEquals("First option short name should be 'a'", "a", optA.getPreferredName());
        assertFalse("First option should not be required", optA.isRequired());
        assertNull("First option should not have an argument", optA.getArgument());

        Option optB = (Option) it.next();
        assertEquals("Second option short name should be 'b'", "b", optB.getPreferredName());
        assertFalse("Second option should not be required", optB.isRequired());
        assertNull("Second option should not have an argument", optB.getArgument());
    }

    public void testOptionsWithMixedTypes() throws Exception {
        PatternBuilder pb = new PatternBuilder();
        pb.withPattern("a!b%c:");
        Option option = pb.create();
        assertNotNull(option);
        assertTrue("Expected Group, but was " + option.getClass().getName(), option instanceof org.apache.commons.cli2.Group);
        org.apache.commons.cli2.Group group = (org.apache.commons.cli2.Group) option;
        assertEquals("Group should have three options", 3, group.getOptions().size());

        Iterator it = group.getOptions().iterator();
        Option optA = (Option) it.next();
        assertEquals("First option short name should be 'a'", "a", optA.getPreferredName());
        assertTrue("First option should be required", optA.isRequired());
        assertNull("First option should not have an argument", optA.getArgument());

        Option optB = (Option) it.next();
        assertEquals("Second option short name should be 'b'", "b", optB.getPreferredName());
        assertFalse("Second option should not be required", optB.isRequired());
        assertNotNull("Second option should have an argument", optB.getArgument());
        assertTrue("Second option argument validator should be NumberValidator", optB.getArgument().getValidator() instanceof NumberValidator);

        Option optC = (Option) it.next();
        assertEquals("Third option short name should be 'c'", "c", optC.getPreferredName());
        assertFalse("Third option should not be required", optC.isRequired());
        assertNotNull("Third option should have an argument", optC.getArgument());
        assertNull("Third option argument validator should be null", optC.getArgument().getValidator());
    }

    public void testPatternWithSpacesAndSpecialChars() throws Exception {
        PatternBuilder pb = new PatternBuilder();
        pb.withPattern("a !b% c:"); // Spaces should be ignored and special chars apply to the preceding option char
        Option option = pb.create();
        assertNotNull(option);
        assertTrue("Expected Group, but was " + option.getClass().getName(), option instanceof org.apache.commons.cli2.Group);
        org.apache.commons.cli2.Group group = (org.apache.commons.cli2.Group) option;
        assertEquals("Group should have three options", 3, group.getOptions().size());

        Iterator it = group.getOptions().iterator();
        Option optA = (Option) it.next();
        assertEquals("First option short name should be 'a'", "a", optA.getPreferredName());
        assertFalse("First option should not be required", optA.isRequired());
        assertNull("First option should not have an argument", optA.getArgument());

        Option optB = (Option) it.next();
        assertEquals("Second option short name should be 'b'", "b", optB.getPreferredName());
        assertTrue("Second option should be required", optB.isRequired());
        assertNotNull("Second option should have an argument", optB.getArgument());
        assertTrue("Second option argument validator should be NumberValidator", optB.getArgument().getValidator() instanceof NumberValidator);

        Option optC = (Option) it.next();
        assertEquals("Third option short name should be 'c'", "c", optC.getPreferredName());
        assertFalse("Third option should not be required", optC.isRequired());
        assertNotNull("Third option should have an argument", optC.getArgument());
        assertNull("Third option argument validator should be null", optC.getArgument().getValidator());
    }

    public void testMultipleSpecialCharsBeforeOption() throws Exception {
        PatternBuilder pb = new PatternBuilder();
        pb.withPattern("!%a"); // Both '!' and '%' should apply to 'a'
        Option option = pb.create();
        assertNotNull(option);
        assertEquals("Option short name should be 'a'", "a", option.getPreferredName());
        assertTrue("Option should be required", option.isRequired());
        assertNotNull("Option should have an argument", option.getArgument());
        assertTrue("Argument validator should be a NumberValidator", option.getArgument().getValidator() instanceof NumberValidator);
    }

    public void testMultipleSpecialCharsAfterOption() throws Exception {
        PatternBuilder pb = new PatternBuilder();
        pb.withPattern("a!%"); // '!' should be ignored, '%' should set the type. This might be an issue in the parser logic.
        // The current logic will treat '!' as required and then '%' as type for 'a'
        Option option = pb.create();
        assertNotNull(option);
        assertEquals("Option short name should be 'a'", "a", option.getPreferredName());
        assertTrue("Option should be required", option.isRequired());
        assertNotNull("Option should have an argument", option.getArgument());
        assertTrue("Argument validator should be a NumberValidator", option.getArgument().getValidator() instanceof NumberValidator);
    }

    public void testMultipleTypesSpecified() throws Exception {
        PatternBuilder pb = new PatternBuilder();
        pb.withPattern("a@%"); // The last type specified should win
        Option option = pb.create();
        assertNotNull(option);
        assertEquals("Option short name should be 'a'", "a", option.getPreferredName());
        assertFalse("Option should not be required", option.isRequired());
        assertNotNull("Option should have an argument", option.getArgument());
        assertTrue("Argument validator should be a NumberValidator", option.getArgument().getValidator() instanceof NumberValidator);
    }

    public void testArgumentMaxOneWithDefaultType() throws Exception {
        PatternBuilder pb = new PatternBuilder();
        pb.withPattern("a:"); // Default type ':' means String, but max is 1
        Option option = pb.create();
        assertNotNull(option);
        assertNotNull(option.getArgument());
        assertEquals("Argument maximum should be 1", 1, option.getArgument().getMaximum());
    }

    public void testArgumentMaxOneWithNonDefaultType() throws Exception {
        PatternBuilder pb = new PatternBuilder();
        pb.withPattern("a%"); // Number type, max should be 1
        Option option = pb.create();
        assertNotNull(option);
        assertNotNull(option.getArgument());
        assertEquals("Argument maximum should be 1", 1, option.getArgument().getMaximum());
    }

    public void testArgumentMinOneWithRequiredFlag() throws Exception {
        PatternBuilder pb = new PatternBuilder();
        pb.withPattern("!a%"); // Required flag should set minimum to 1 for the argument
        Option option = pb.create();
        assertNotNull(option);
        assertNotNull(option.getArgument());
        assertEquals("Argument minimum should be 1", 1, option.getArgument().getMinimum());
    }

    public void testArgumentMinZeroWithNonRequiredFlag() throws Exception {
        PatternBuilder pb = new PatternBuilder();
        pb.withPattern("a%"); // Non-required flag should result in minimum of 0
        Option option = pb.create();
        assertNotNull(option);
        assertNotNull(option.getArgument());
        assertEquals("Argument minimum should be 0", 0, option.getArgument().getMinimum());
    }

    public void testResetClearsOptions() throws Exception {
        PatternBuilder pb = new PatternBuilder();
        pb.withPattern("abc");
        Option option1 = pb.create();
        assertNotNull(option1);
        assertEquals("First create should have 3 options", 3, ((org.apache.commons.cli2.Group)option1).getOptions().size());

        pb.reset();
        Option option2 = pb.create();
        assertNotNull(option2);
        assertEquals("Second create after reset should have 0 options", 0, ((org.apache.commons.cli2.Group)option2).getOptions().size());
    }

    public void testCreateWithSingleOption() throws Exception {
        PatternBuilder pb = new PatternBuilder();
        pb.withPattern("a");
        Option option = pb.create();
        assertNotNull(option);
        assertEquals("Option short name should be 'a'", "a", option.getPreferredName());
        assertFalse("Option should not be required", option.isRequired());
    }

    public void testCreateWithMultipleOptions() throws Exception {
        PatternBuilder pb = new PatternBuilder();
        pb.withPattern("ab");
        Option group = pb.create();
        assertNotNull(group);
        assertTrue("Expected Group, but was " + group.getClass().getName(), group instanceof org.apache.commons.cli2.Group);
        assertEquals("Group should have two options", 2, group.getOptions().size());
    }

    public void testPatternWithLongOptionNamesAreIgnored() throws Exception {
        PatternBuilder pb = new PatternBuilder();
        // The pattern builder only uses short names from the pattern.
        // Long names are not supported by this method.
        pb.withPattern("option");
        Option option = pb.create();
        assertNotNull(option);
        // The parser splits "option" into 'o', 'p', 't', 'i', 'o', 'n'.
        // The last character 'n' is used as the option name.
        assertEquals("Last option short name should be 'n'", "n", option.getPreferredName());
        assertTrue("Expected Group for multiple characters", option instanceof org.apache.commons.cli2.Group);
        // The 'o', 'p', 't', 'i', 'o' characters are processed before 'n'.
        // The `createOption` method is called for each char before the last one.
        // So, this should create options 'o', 'p', 't', 'i', 'o'.
        assertEquals("Should be 5 options before the last one", 5, ((org.apache.commons.cli2.Group)option).getOptions().size());
    }

    public void testUnknownTypeCharacter() throws Exception {
        PatternBuilder pb = new PatternBuilder();
        pb.withPattern("a$"); // '$' is not a recognized type character
        Option option = pb.create();
        assertNotNull(option);
        assertEquals("Option short name should be 'a'", "a", option.getPreferredName());
        assertNull("Argument validator should be null for unknown type", option.getArgument().getValidator());
    }

    public void testConsecutiveOptionsWithTypes() throws Exception {
        PatternBuilder pb = new PatternBuilder();
        pb.withPattern("a%b#");
        Option group = pb.create();
        assertNotNull(group);
        assertTrue("Expected Group, but was " + group.getClass().getName(), group instanceof org.apache.commons.cli2.Group);
        assertEquals("Group should have two options", 2, group.getOptions().size());

        Iterator it = group.getOptions().iterator();
        Option optA = (Option) it.next();
        assertNotNull("Option 'a' should have an argument", optA.getArgument());
        assertTrue("Option 'a' validator should be NumberValidator", optA.getArgument().getValidator() instanceof NumberValidator);

        Option optB = (Option) it.next();
        assertNotNull("Option 'b' should have an argument", optB.getArgument());
        assertTrue("Option 'b' validator should be DateValidator", optB.getArgument().getValidator() instanceof DateValidator);
    }

    public void testPatternWithOnlySpecialCharacters() throws Exception {
        PatternBuilder pb = new PatternBuilder();
        pb.withPattern("!@#"); // This should result in an option '!' with type '@' and required 'true'.
        // However, the parser logic treats '!' as required and then '@' as type.
        // The last character before a space or end of string becomes the option name.
        // If special chars appear at the end, they may be interpreted as the option name.
        // Testing the current implementation's behavior:
        Option option = pb.create();
        assertNotNull(option);
        // The current logic will set '!' as the option name, '@' as type, and '!' as required.
        // This seems like an edge case where special chars are used as option names.
        // Let's assume it creates an option named '!'
        assertEquals("Option short name should be '!'", "!", option.getPreferredName());
        assertTrue("Option should be required", option.isRequired());
        assertNotNull("Option should have an argument", option.getArgument());
        assertTrue("Argument validator should be ClassValidator", option.getArgument().getValidator() instanceof ClassValidator);
        ClassValidator cv = (ClassValidator) option.getArgument().getValidator();
        assertTrue("ClassValidator should be instance check", cv.isInstance());
    }

    public void testPatternWithTrailingSpecialCharacter() throws Exception {
        PatternBuilder pb = new PatternBuilder();
        pb.withPattern("a!"); // 'a' is the option, '!' makes it required.
        Option option = pb.create();
        assertNotNull(option);
        assertEquals("Option short name should be 'a'", "a", option.getPreferredName());
        assertTrue("Option should be required", option.isRequired());
        assertNull("Option should not have an argument", option.getArgument());
    }

    public void testPatternWithTrailingTypeCharacter() throws Exception {
        PatternBuilder pb = new PatternBuilder();
        pb.withPattern("a%"); // 'a' is the option, '%' sets the type.
        Option option = pb.create();
        assertNotNull(option);
        assertEquals("Option short name should be 'a'", "a", option.getPreferredName());
        assertFalse("Option should not be required", option.isRequired());
        assertNotNull("Option should have an argument", option.getArgument());
        assertTrue("Argument validator should be NumberValidator", option.getArgument().getValidator() instanceof NumberValidator);
    }

    public void testBuilderWithCustomBuilders() throws Exception {
        GroupBuilder gb = new GroupBuilder();
        DefaultOptionBuilder dob = new DefaultOptionBuilder();
        ArgumentBuilder ab = new ArgumentBuilder();
        PatternBuilder pb = new PatternBuilder(gb, dob, ab);
        pb.withPattern("x");
        Option option = pb.create();
        assertNotNull(option);
        assertEquals("Option short name should be 'x'", "x", option.getPreferredName());
    }
}
