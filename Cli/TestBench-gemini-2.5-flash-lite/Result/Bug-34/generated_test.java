package org.apache.commons.cli;

import junit.framework.TestCase;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class OptionTest extends TestCase {
    // test methods (as many as the instructions ask for), each exactly in this form (the name starts with "test", no annotation):
    //     public void testWhatItChecks() throws Exception { }

    public void testConstructorShortOptAndDescription() throws Exception {
        Option option = new Option("a", "A description");
        assertEquals("a", option.getOpt());
        assertNull(option.getLongOpt());
        assertFalse(option.hasArg()); // Default for hasArg is false if not set to true
        assertEquals("A description", option.getDescription());
        assertFalse(option.isRequired());
        assertFalse(option.hasOptionalArg());
        assertEquals(Option.UNINITIALIZED, option.getArgs());
        assertEquals(String.class, option.getType());
        assertFalse(option.hasValueSeparator());
    }

    public void testConstructorShortOptHasArgDescription() throws Exception {
        Option option = new Option("b", true, "B description");
        assertEquals("b", option.getOpt());
        assertNull(option.getLongOpt());
        assertTrue(option.hasArg()); // Explicitly set to true
        assertEquals("B description", option.getDescription());
        assertFalse(option.isRequired());
        assertFalse(option.hasOptionalArg());
        assertEquals(1, option.getArgs()); // When hasArg is true, numberOfArgs defaults to 1
        assertEquals(String.class, option.getType());
        assertFalse(option.hasValueSeparator());
    }

    public void testConstructorShortOptLongOptHasArgDescription() throws Exception {
        Option option = new Option("c", "longc", true, "C description");
        assertEquals("c", option.getOpt());
        assertEquals("longc", option.getLongOpt());
        assertTrue(option.hasArg()); // Explicitly set to true
        assertEquals("C description", option.getDescription());
        assertFalse(option.isRequired());
        assertFalse(option.hasOptionalArg());
        assertEquals(1, option.getArgs()); // When hasArg is true, numberOfArgs defaults to 1
        assertEquals(String.class, option.getType());
        assertFalse(option.hasValueSeparator());
    }

    public void testShortOpt() throws Exception {
        Option option = new Option("d", "D description");
        assertEquals("d", option.getOpt());
    }

    public void testLongOpt() throws Exception {
        Option option = new Option("e", "longe", false, "E description");
        assertEquals("longe", option.getLongOpt());
    }

    public void testDescription() throws Exception {
        Option option = new Option("f", "F description");
        assertEquals("F description", option.getDescription());
    }

    public void testRequired() throws Exception {
        Option option = new Option("g", "G description");
        assertFalse(option.isRequired());
        option.setRequired(true);
        assertTrue(option.isRequired());
    }

    public void testOptionalArg() throws Exception {
        Option option = new Option("h", "H description");
        assertFalse(option.hasOptionalArg());
        option.setOptionalArg(true);
        assertTrue(option.hasOptionalArg());
    }

    public void testArgName() throws Exception {
        Option option = new Option("i", "I description");
        assertNull(option.getArgName());
        assertFalse(option.hasArgName());
        option.setArgName("argI");
        assertEquals("argI", option.getArgName());
        assertTrue(option.hasArgName());
    }

    public void testHasArg() throws Exception {
        Option option = new Option("j", "J description");
        assertFalse(option.hasArg()); // Default numberOfArgs is UNINITIALIZED
        Option optionWithArg = new Option("k", true, "K description");
        assertTrue(optionWithArg.hasArg()); // Constructor sets numberOfArgs to 1
        Option optionWithArgs = new Option("l", "L description");
        optionWithArgs.setArgs(3);
        assertTrue(optionWithArgs.hasArg()); // setArgs(3) means hasArg() is true
        Option optionWithUnlimitedArgs = new Option("m", "M description");
        optionWithUnlimitedArgs.setArgs(Option.UNLIMITED_VALUES);
        assertTrue(optionWithUnlimitedArgs.hasArg()); // UNLIMITED_VALUES means hasArg() is true
    }

    public void testHasArgs() throws Exception {
        Option option = new Option("n", "N description");
        assertFalse(option.hasArgs()); // Default numberOfArgs is UNINITIALIZED
        Option optionWithArgs = new Option("o", "O description");
        optionWithArgs.setArgs(3);
        assertTrue(optionWithArgs.hasArgs()); // setArgs(3) means hasArgs() is true
        Option optionWithUnlimitedArgs = new Option("p", "P description");
        optionWithUnlimitedArgs.setArgs(Option.UNLIMITED_VALUES);
        assertTrue(optionWithUnlimitedArgs.hasArgs()); // UNLIMITED_VALUES means hasArgs() is true
    }

    public void testSetArgs() throws Exception {
        Option option = new Option("q", "Q description");
        assertEquals(Option.UNINITIALIZED, option.getArgs());
        option.setArgs(1);
        assertEquals(1, option.getArgs());
        option.setArgs(3);
        assertEquals(3, option.getArgs());
        option.setArgs(Option.UNLIMITED_VALUES);
        assertEquals(Option.UNLIMITED_VALUES, option.getArgs());
    }

    public void testSetValueSeparator() throws Exception {
        Option option = new Option("r", "R description");
        assertEquals((char) 0, option.getValueSeparator()); // Default value for char
        assertFalse(option.hasValueSeparator());
        option.setValueSeparator(':');
        assertEquals(':', option.getValueSeparator());
        assertTrue(option.hasValueSeparator());
    }

    public void testGetTypeAndSetType() throws Exception {
        Option option = new Option("s", "S description");
        assertEquals(String.class, option.getType()); // Default type
        option.setType(Integer.class);
        assertEquals(Integer.class, option.getType());
    }

    public void testGetLongOptAndSetLongOpt() throws Exception {
        Option option = new Option("t", "T description");
        assertNull(option.getLongOpt()); // Default longOpt is null
        option.setLongOpt("longT");
        assertEquals("longT", option.getLongOpt());
    }

    public void testHasLongOpt() throws Exception {
        Option option = new Option("u", "U description");
        assertFalse(option.hasLongOpt()); // Initially null
        option.setLongOpt("longU");
        assertTrue(option.hasLongOpt());
    }

    public void testGetValueAndGetValuesAndGetValuesList() throws Exception {
        // Test when no values are added
        Option optionEmpty = new Option("empty", true, "Empty Option");
        assertNull(optionEmpty.getValue());
        assertNull(optionEmpty.getValues());
        assertEquals(0, optionEmpty.getValuesList().size());

        // Test with one value
        Option optionOneValue = new Option("one", true, "One Value Option");
        optionOneValue.addValueForProcessing("val1");
        assertEquals("val1", optionOneValue.getValue());
        assertEquals("val1", optionOneValue.getValue(0));
        String[] valuesOne = optionOneValue.getValues();
        assertNotNull(valuesOne);
        assertEquals(1, valuesOne.length);
        assertEquals("val1", valuesOne[0]);
        assertEquals(1, optionOneValue.getValuesList().size());
        assertEquals("val1", optionOneValue.getValuesList().get(0));

        // Test with multiple values
        Option optionMultiValue = new Option("multi", true, "Multi Value Option");
        optionMultiValue.setArgs(2); // Allow two arguments
        optionMultiValue.addValueForProcessing("valA");
        optionMultiValue.addValueForProcessing("valB");
        assertEquals("valA", optionMultiValue.getValue()); // First value
        assertEquals("valA", optionMultiValue.getValue(0));
        assertEquals("valB", optionMultiValue.getValue(1));
        String[] valuesMulti = optionMultiValue.getValues();
        assertNotNull(valuesMulti);
        assertEquals(2, valuesMulti.length);
        assertEquals("valA", valuesMulti[0]);
        assertEquals("valB", valuesMulti[1]);
        assertEquals(2, optionMultiValue.getValuesList().size());
        assertEquals("valA", optionMultiValue.getValuesList().get(0));
        assertEquals("valB", optionMultiValue.getValuesList().get(1));
    }

    public void testGetValueWithDefault() throws Exception {
        Option option = new Option("w", "W description");
        assertNull(option.getValue("defaultW")); // No values present
        option.addValueForProcessing("valW");
        assertEquals("valW", option.getValue("defaultW")); // Value is present
    }

    public void testToString() throws Exception {
        Option option = new Option("x", "longX", true, "X description");
        assertEquals("[ option: x longX [ARG] :: X description :: class java.lang.String ]", option.toString());

        Option optionNoArg = new Option("y", "longY", false, "Y description");
        assertEquals("[ option: y longY :: Y description :: class java.lang.String ]", optionNoArg.toString());

        Option optionMultiArg = new Option("z", "longZ", false, "Z description");
        optionMultiArg.setArgs(3);
        assertEquals("[ option: z longZ [ARG...] :: Z description :: class java.lang.String ]", optionMultiArg.toString());

        Option optionUnlimitedArg = new Option("a1", "longA1", false, "A1 description");
        optionUnlimitedArg.setArgs(Option.UNLIMITED_VALUES);
        assertEquals("[ option: a1 longA1 [ARG...] :: A1 description :: class java.lang.String ]", optionUnlimitedArg.toString());

        Option optionWithType = new Option("b2", "longB2", true, "B2 description");
        optionWithType.setType(Double.class);
        assertEquals("[ option: b2 longB2 [ARG] :: B2 description :: class java.lang.Double ]", optionWithType.toString());
    }

    public void testEqualsAndHashCode() throws Exception {
        Option option1 = new Option("c", "longC", false, "C description");
        Option option2 = new Option("c", "longC", false, "C description");
        Option option3 = new Option("d", "longD", false, "D description");
        Option option4 = new Option("c", "differentLongC", false, "C description");

        assertEquals(option1, option2);
        assertEquals(option1.hashCode(), option2.hashCode());
        assertFalse(option1.equals(option3));
        assertFalse(option1.hashCode() == option3.hashCode());
        assertFalse(option1.equals(option4));
        assertFalse(option1.hashCode() == option4.hashCode());
        assertFalse(option1.equals(null));
        assertFalse(option1.equals("c"));
    }

    public void testClone() throws Exception {
        Option original = new Option("cloneOpt", "Clone description");
        original.addValueForProcessing("value1"); // This adds to the values list
        original.setArgs(2);
        original.setType(Boolean.class);

        Option cloned = (Option) original.clone();

        assertNotSame(original, cloned);
        assertEquals(original.getOpt(), cloned.getOpt());
        assertEquals(original.getDescription(), cloned.getDescription());
        assertEquals(original.getArgs(), cloned.getArgs());
        assertEquals(original.getType(), cloned.getType());
        
        // Check that values are also copied, but are distinct lists
        List originalValues = original.getValuesList();
        List clonedValues = cloned.getValuesList();
        assertNotNull(originalValues);
        assertNotNull(clonedValues);
        assertNotSame(originalValues, clonedValues); // Should be different list instances
        assertEquals(originalValues.size(), clonedValues.size());
        assertEquals("value1", originalValues.get(0));
        assertEquals("value1", clonedValues.get(0)); // Values are copied

        // Modifying the clone should not affect the original
        cloned.addValueForProcessing("value2"); // This will succeed if setArgs(2)
        assertEquals(1, originalValues.size()); // Original should remain unchanged
        assertEquals(2, clonedValues.size()); // Clone has the new value
    }

    public void testClearValues() throws Exception {
        Option option = new Option("v", true, "V description");
        option.addValueForProcessing("val1");
        assertEquals(1, option.getValuesList().size());
        option.clearValues();
        assertTrue(option.getValuesList().isEmpty());
    }

    public void testAddValueForProcessing_UNINITIALIZED() throws Exception {
        // When numberOfArgs is UNINITIALIZED, addValueForProcessing throws RuntimeException("NO_ARGS_ALLOWED")
        Option option = new Option("init", "Init description"); // Default numberOfArgs is UNINITIALIZED
        try {
            option.addValueForProcessing("value");
            fail("Expected RuntimeException for UNINITIALIZED numberOfArgs");
        } catch (RuntimeException e) {
            assertEquals("NO_ARGS_ALLOWED", e.getMessage());
        }
    }

    public void testAddValueForProcessing_WhenFull() throws Exception {
        Option option = new Option("full", true, "Full description"); // numberOfArgs is 1
        option.addValueForProcessing("val1");
        assertEquals(1, option.getValuesList().size());
        // Now the list is full for numberOfArgs = 1. Adding another value should fail.
        try {
            option.addValueForProcessing("val2");
            fail("Expected RuntimeException when list is full");
        } catch (RuntimeException e) {
            assertEquals("Cannot add value, list full.", e.getMessage());
        }
    }

    public void testProcessValueWithSeparator() throws Exception {
        Option option = new Option("sep", "Separator description");
        option.setArgs(Option.UNLIMITED_VALUES); // Allow unlimited values
        option.setValueSeparator(',');
        option.addValueForProcessing("key1,key2,key3");
        
        assertEquals(3, option.getValuesList().size());
        assertEquals("key1", option.getValue(0));
        assertEquals("key2", option.getValue(1));
        assertEquals("key3", option.getValue(2));
    }

    public void testProcessValueWithSeparatorAndLimitedArgs() throws Exception {
        Option option = new Option("limsep", "Limited Separator description");
        option.setArgs(2); // Expect exactly 2 arguments
        option.setValueSeparator('=');
        option.addValueForProcessing("key1=val1=extra"); // The string has two separators.
        // According to processValue, it will parse until n-1 tokens are found.
        // For n=2, n-1=1. It finds one separator at index 4 ('=').
        // It adds substring(0, 4) which is "key1".
        // Then it processes "val1=extra".
        // The loop condition `index != -1` is true. index is 4.
        // `values.size()` is 1. `numberOfArgs` is 2. `values.size() == (numberOfArgs - 1)` is true.
        // The break statement is executed.
        // The remaining value "val1=extra" is added to values.
        
        assertEquals(2, option.getValuesList().size());
        assertEquals("key1", option.getValue(0));
        assertEquals("val1=extra", option.getValue(1)); 
    }
    
    public void testProcessValueWithSeparatorAndExactArgsLimit() throws Exception {
        Option option = new Option("exactsep", "Exact Separator description");
        option.setArgs(2);
        option.setValueSeparator(':');
        option.addValueForProcessing("a:b"); 
        
        assertEquals(2, option.getValuesList().size());
        assertEquals("a", option.getValue(0));
        assertEquals("b", option.getValue(1));
    }

    public void testAcceptsArg_Positive() throws Exception {
        // Case 1: hasArg is true, numberOfArgs = 1
        Option option1 = new Option("a", true, "A"); 
        assertTrue(option1.acceptsArg());

        // Case 2: hasArg is false, numberOfArgs = 2 (set by setArgs)
        Option option2 = new Option("b", "B"); // hasArg is false, numberOfArgs = UNINITIALIZED
        option2.setArgs(2); // numberOfArgs = 2
        assertTrue(option2.acceptsArg());

        // Case 3: hasArg is false, numberOfArgs = UNLIMITED_VALUES (set by setArgs)
        Option option3 = new Option("c", "C"); // hasArg is false, numberOfArgs = UNINITIALIZED
        option3.setArgs(Option.UNLIMITED_VALUES); // numberOfArgs = UNLIMITED_VALUES
        assertTrue(option3.acceptsArg());

        // Case 4: hasArg is false, numberOfArgs = 1 (from constructor's hasArg=false), optionalArg = true
        Option option4 = new Option("d", false, "D"); // hasArg = false, constructor implies numberOfArgs = UNINITIALIZED.
        // If hasArg is false, then `new Option(opt, hasArg, description)` constructor sets numberOfArgs to UNINITIALIZED.
        // Let's re-examine constructor:
        // public Option(String opt, boolean hasArg, String description)
        //  if (hasArg) { this.numberOfArgs = 1; }
        // So, if hasArg is false, numberOfArgs remains UNINITIALIZED.
        // The method `acceptsArg()` checks: `(hasArg() || hasArgs() || hasOptionalArg()) && (numberOfArgs <= 0 || values.size() < numberOfArgs)`
        // For option4: hasArg() is false. hasArgs() is false. hasOptionalArg() is false. So the first part is false.
        // To make it pass, we need to set hasOptionalArg to true.
        option4.setOptionalArg(true); // optionalArg = true
        assertTrue(option4.acceptsArg());
    }

    public void testAcceptsArg_Negative() throws Exception {
        // Case 1: Option with numberOfArgs = 1, one value already added.
        Option option1 = new Option("a", true, "A"); // numberOfArgs = 1
        option1.addValueForProcessing("val1");
        assertFalse(option1.acceptsArg()); // Full: numberOfArgs = 1, values.size() = 1. (numberOfArgs <= 0 || values.size() < numberOfArgs) is false.

        // Case 2: Option with numberOfArgs = 2, two values already added.
        Option option2 = new Option("b", "B");
        option2.setArgs(2); // numberOfArgs = 2
        option2.addValueForProcessing("val1");
        assertTrue(option2.acceptsArg()); // Not full yet: values.size() = 1, numberOfArgs = 2. (values.size() < numberOfArgs) is true.
        option2.addValueForProcessing("val2");
        assertFalse(option2.acceptsArg()); // Full: numberOfArgs = 2, values.size() = 2. (values.size() < numberOfArgs) is false.

        // Case 3: Option with numberOfArgs = UNLIMITED_VALUES. This should always accept args.
        Option option3 = new Option("c", "C");
        option3.setArgs(Option.UNLIMITED_VALUES); // numberOfArgs = UNLIMITED_VALUES
        assertTrue(option3.acceptsArg()); // condition `values.size() < numberOfArgs` is always true for UNLIMITED_VALUES.
    }

    public void testRequiresArg_TrueCases() throws Exception {
        // Case 1: numberOfArgs = 1, optionalArg = false
        Option option1 = new Option("a", true, "A"); // numberOfArgs = 1, optionalArg = false
        assertTrue(option1.requiresArg());

        // Case 2: numberOfArgs = 3, optionalArg = false
        Option option2 = new Option("b", "B");
        option2.setArgs(3); // numberOfArgs = 3, optionalArg = false
        assertTrue(option2.requiresArg());

        // Case 3: numberOfArgs = UNLIMITED_VALUES, optionalArg = false
        Option option3 = new Option("c", "C");
        option3.setArgs(Option.UNLIMITED_VALUES); // numberOfArgs = UNLIMITED_VALUES, optionalArg = false
        assertTrue(option3.requiresArg());
    }

    public void testRequiresArg_FalseCases() throws Exception {
        // Case 1: numberOfArgs = 1, one value already added.
        Option option1 = new Option("a", true, "A"); // numberOfArgs = 1, optionalArg = false
        option1.addValueForProcessing("val1"); // Now it doesn't require more. requiresArg checks: `acceptsArg()`
        // acceptsArg returns false because values.size() (1) is not less than numberOfArgs (1).
        // So requiresArg() correctly returns false.
        assertFalse(option1.requiresArg());

        // Case 2: numberOfArgs = 3, three values already added.
        Option option2 = new Option("b", "B");
        option2.setArgs(3); // numberOfArgs = 3, optionalArg = false
        option2.addValueForProcessing("val1");
        option2.addValueForProcessing("val2");
        option2.addValueForProcessing("val3"); 
        assertFalse(option2.requiresArg()); // acceptsArg() is false, so requiresArg() is false.

        // Case 3: numberOfArgs = UNLIMITED_VALUES, one value already added.
        Option option3 = new Option("c", "C");
        option3.setArgs(Option.UNLIMITED_VALUES); // numberOfArgs = UNLIMITED_VALUES, optionalArg = false
        option3.addValueForProcessing("val1"); // Now it doesn't require more. requiresArg checks acceptsArg().
        // acceptsArg() returns true for UNLIMITED_VALUES, but requiresArg() checks `values.size() < 1` for UNLIMITED_VALUES.
        // requiresArg(): if (optionalArg) return false; if (numberOfArgs == UNLIMITED_VALUES) { return values.size() < 1; } else { return acceptsArg(); }
        // For option3, optionalArg is false. numberOfArgs is UNLIMITED_VALUES. values.size() is 1. 1 < 1 is false.
        assertFalse(option3.requiresArg());
        
        // Case 4: optionalArg is true.
        Option option4 = new Option("d", false, "D"); // hasArg = false. numberOfArgs = UNINITIALIZED.
        option4.setOptionalArg(true); // optionalArg = true
        assertFalse(option4.requiresArg()); // The first check `if (optionalArg)` returns false.
    }
    
    public void testGetId() throws Exception {
        Option option = new Option("x", "X description");
        assertEquals((int)'x', option.getId());
    }

    public void testGetKey_ShortOpt() throws Exception {
        Option option = new Option("short", "Short Description");
        assertEquals("short", option.getKey());
    }

    public void testGetKey_LongOpt() throws Exception {
        Option option = new Option(null, "long", false, "Long Description");
        assertEquals("long", option.getKey());
    }

    // New tests for methods not covered before

    public void testSetDescription() throws Exception {
        Option option = new Option("descTest", "Initial Description");
        assertEquals("Initial Description", option.getDescription());
        option.setDescription("New Description");
        assertEquals("New Description", option.getDescription());
    }

    public void testAddValue_UnsupportedOperation() throws Exception {
        Option option = new Option("addValTest", "Add Value Test");
        try {
            option.addValue("someValue"); // This method is deprecated and throws exception
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // Expected exception
        }
    }

    public void testOptionBuilder_WithLongOpt() throws Exception {
        Option option = OptionBuilder.withLongOpt("builderLongOpt")
                                     .withDescription("Builder Description")
                                     .create('b');
        assertEquals("builderLongOpt", option.getLongOpt());
        assertEquals("Builder Description", option.getDescription());
        assertEquals("b", option.getOpt());
    }

    public void testOptionBuilder_WithArgName() throws Exception {
        Option option = OptionBuilder.withArgName("myArg")
                                     .withDescription("Arg Name Test")
                                     .create('a');
        assertEquals("myArg", option.getArgName());
        assertEquals("Arg Name Test", option.getDescription());
        assertEquals("a", option.getOpt());
    }

    public void testOptionBuilder_WithValueSeparatorChar() throws Exception {
        Option option = OptionBuilder.withValueSeparator(':')
                                     .hasArgs(2)
                                     .withDescription("Value Separator Test")
                                     .create('s');
        assertEquals(':', option.getValueSeparator());
        assertEquals(2, option.getArgs());
        assertTrue(option.hasValueSeparator());
    }

    public void testOptionBuilder_WithValueSeparatorDefault() throws Exception {
        Option option = OptionBuilder.withValueSeparator()
                                     .hasArgs(2)
                                     .withDescription("Value Separator Default Test")
                                     .create('d');
        assertEquals('=', option.getValueSeparator());
        assertEquals(2, option.getArgs());
        assertTrue(option.hasValueSeparator());
    }

    public void testOptionBuilder_HasOptionalArgs() throws Exception {
        Option option = OptionBuilder.hasOptionalArgs()
                                     .withDescription("Optional Args Test")
                                     .create('o');
        assertTrue(option.hasOptionalArg());
        assertEquals(Option.UNLIMITED_VALUES, option.getArgs());
        assertEquals("Optional Args Test", option.getDescription());
    }
    
    public void testOptionBuilder_HasOptionalArgsInt() throws Exception {
        Option option = OptionBuilder.hasOptionalArgs(3)
                                     .withDescription("Optional Args Int Test")
                                     .create('i');
        assertTrue(option.hasOptionalArg());
        assertEquals(3, option.getArgs());
        assertEquals("Optional Args Int Test", option.getDescription());
    }

    public void testOptionBuilder_WithType() throws Exception {
        Option option = OptionBuilder.withType(Integer.class)
                                     .withDescription("Type Test")
                                     .create('t');
        assertEquals(Integer.class, option.getType());
        assertEquals("Type Test", option.getDescription());
        assertEquals("t", option.getOpt());
    }

    public void testOptionBuilder_WithDescription() throws Exception {
        Option option = OptionBuilder.withDescription("Explicit Description")
                                     .create('e');
        assertEquals("Explicit Description", option.getDescription());
        assertEquals("e", option.getOpt());
    }

    public void testOptionBuilder_CreateWithChar() throws Exception {
        Option option = OptionBuilder.withDescription("Create Char Test").create('c');
        assertEquals("c", option.getOpt());
        assertEquals("Create Char Test", option.getDescription());
        assertNull(option.getLongOpt());
    }

    public void testOptionBuilder_CreateNoArgThrowsException() throws Exception {
        try {
            OptionBuilder.create(); // create() requires longopt to be set
            fail("Expected IllegalArgumentException when longOpt is not set");
        } catch (IllegalArgumentException e) {
            assertEquals("must specify longopt", e.getMessage());
        }
    }
    
    public void testOptionBuilder_CreateWithLongOptAndOtherSettings() throws Exception {
        Option option = OptionBuilder.withLongOpt("myLongOpt")
                                     .withDescription("Complex Builder")
                                     .isRequired()
                                     .hasArgs(2)
                                     .withArgName("name")
                                     .withValueSeparator(',')
                                     .withType(Float.class)
                                     .create();
        assertEquals("myLongOpt", option.getLongOpt());
        assertEquals("Complex Builder", option.getDescription());
        assertTrue(option.isRequired());
        assertEquals(2, option.getArgs());
        assertEquals("name", option.getArgName());
        assertEquals(',', option.getValueSeparator());
        assertEquals(Float.class, option.getType());
        assertTrue(option.hasValueSeparator());
        assertFalse(option.hasOptionalArg()); // default is false
    }
}
