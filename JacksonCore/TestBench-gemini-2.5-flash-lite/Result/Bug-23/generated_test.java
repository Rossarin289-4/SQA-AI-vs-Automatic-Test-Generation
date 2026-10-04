package com.fasterxml.jackson.core.util;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.TreeNode;

public class DefaultPrettyPrinterTest {

    // Helper to create a dummy JsonGenerator for testing output.

    // Test for default constructor and root separator

    // Test for constructor with null root separator

    // Test for constructor with empty string root separator

    // Test for constructor with custom string root separator

    // Test for constructor with SerializableString root separator

    // Test withRootSeparator(SerializableString) for null

    // Test withRootSeparator(SerializableString) for same value
    @Test
    public void testWithRootSeparatorSerializableSame() throws Exception {
        DefaultPrettyPrinter printer = new DefaultPrettyPrinter("ABC");
        DefaultPrettyPrinter newPrinter = printer.withRootSeparator(new SerializedString("ABC"));
        assertSame(printer, newPrinter); // Should return the same instance if value is same
    }

    // Test withRootSeparator(SerializableString) for different value

    // Test withRootSeparator(String) for null

    // Test withRootSeparator(String) for empty string

    // Test withRootSeparator(String) for custom string

    // Test indentArraysWith and beforeArrayValues (default behavior)

    // Test indentArraysWith and beforeArrayValues with NopIndenter

    // Test indentObjectsWith and beforeObjectEntries (default behavior)

    // Test indentObjectsWith and beforeObjectEntries with NopIndenter

    // Test writeObjectFieldValueSeparator with spaces

    // Test writeObjectFieldValueSeparator without spaces

    // Test writeObjectEntrySeparator (default)

    // Test writeEndObject with entries

    // Test writeEndObject with zero entries

    // Test writeStartArray default behavior

    // Test writeStartArray with NopIndenter (inline)

    // Test writeEndArray with entries

    // Test writeEndArray with zero entries

    // Test createInstance() for DefaultPrettyPrinter
    @Test
    public void testCreateInstanceDefault() throws Exception {
        DefaultPrettyPrinter printer = new DefaultPrettyPrinter();
        DefaultPrettyPrinter newInstance = printer.createInstance();
        assertNotSame(printer, newInstance);
        assertEquals(printer._arrayIndenter, newInstance._arrayIndenter);
        assertEquals(printer._objectIndenter, newInstance._objectIndenter);
        assertEquals(printer._rootSeparator, newInstance._rootSeparator);
        assertEquals(printer._spacesInObjectEntries, newInstance._spacesInObjectEntries);
    }

    // Test createInstance() for a subclass (should throw exception)
    @Test
    public void testCreateInstanceSubclass() throws Exception {
        // Create a dummy subclass to test the check
        class MyPrettyPrinter extends DefaultPrettyPrinter {
            public MyPrettyPrinter() { super(); }
            public MyPrettyPrinter(DefaultPrettyPrinter base) { super(base); }
            // No override of createInstance
        }
        MyPrettyPrinter printer = new MyPrettyPrinter();
        try {
            printer.createInstance(); // This should throw
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            assertTrue(e.getMessage().contains("does not override method"));
        }
    }

    // Test withArrayIndenter with null

    // Test withArrayIndenter with FixedSpaceIndenter
    @Test
    public void testWithArrayIndenterFixedSpace() throws Exception {
        DefaultPrettyPrinter printer = new DefaultPrettyPrinter();
        DefaultPrettyPrinter newPrinter = printer.withArrayIndenter(DefaultPrettyPrinter.FixedSpaceIndenter.instance);
        assertEquals(DefaultPrettyPrinter.FixedSpaceIndenter.instance, newPrinter._arrayIndenter);
    }

    // Test withObjectIndenter with null
    @Test
    public void testWithObjectIndenterNull() throws Exception {
        DefaultPrettyPrinter printer = new DefaultPrettyPrinter();
        DefaultPrettyPrinter newPrinter = printer.withObjectIndenter(null);
        assertEquals(DefaultPrettyPrinter.NopIndenter.instance, newPrinter._objectIndenter);
    }

    // Test withObjectIndenter with DefaultIndenter
    @Test
    public void testWithObjectIndenterDefault() throws Exception {
        DefaultPrettyPrinter printer = new DefaultPrettyPrinter();
        DefaultPrettyPrinter newPrinter = printer.withObjectIndenter(DefaultIndenter.SYSTEM_LINEFEED_INSTANCE);
        assertEquals(DefaultIndenter.SYSTEM_LINEFEED_INSTANCE, newPrinter._objectIndenter);
    }

    // Test withSpacesInObjectEntries() when already set
    @Test
    public void testWithSpacesInObjectEntriesAlreadySet() throws Exception {
        DefaultPrettyPrinter printer = new DefaultPrettyPrinter();
        assertTrue(printer._spacesInObjectEntries); // Default is true
        DefaultPrettyPrinter newPrinter = printer.withSpacesInObjectEntries();
        assertSame(printer, newPrinter); // Should return same instance
    }

    // Test withSpacesInObjectEntries() when not set
    @Test
    public void testWithSpacesInObjectEntriesNotSet() throws Exception {
        DefaultPrettyPrinter printer = new DefaultPrettyPrinter();
        printer._spacesInObjectEntries = false; // Manually set to false
        DefaultPrettyPrinter newPrinter = printer.withSpacesInObjectEntries();
        assertFalse(newPrinter._spacesInObjectEntries);
    }

    // Test withoutSpacesInObjectEntries() when already set
    @Test
    public void testWithoutSpacesInObjectEntriesAlreadySet() throws Exception {
        DefaultPrettyPrinter printer = new DefaultPrettyPrinter();
        printer._spacesInObjectEntries = false; // Manually set to false
        DefaultPrettyPrinter newPrinter = printer.withoutSpacesInObjectEntries();
        assertSame(printer, newPrinter); // Should return same instance
    }

    // Test withoutSpacesInObjectEntries() when not set
    @Test
    public void testWithoutSpacesInObjectEntriesNotSet() throws Exception {
        DefaultPrettyPrinter printer = new DefaultPrettyPrinter();
        assertTrue(printer._spacesInObjectEntries); // Default is true
        DefaultPrettyPrinter newPrinter = printer.withoutSpacesInObjectEntries();
        assertFalse(newPrinter._spacesInObjectEntries);
    }

    // Test withSeparators with default separators
    @Test
    public void testWithSeparatorsDefault() throws Exception {
        DefaultPrettyPrinter printer = new DefaultPrettyPrinter();
        Separators defaultSeparators = Separators.createDefaultInstance();
        DefaultPrettyPrinter newPrinter = printer.withSeparators(defaultSeparators);
        assertEquals(defaultSeparators, newPrinter._separators);
        assertEquals(" : ", newPrinter._objectFieldValueSeparatorWithSpaces);
    }

    // Test withSeparators with custom separators
    @Test
    public void testWithSeparatorsCustom() throws Exception {
        DefaultPrettyPrinter printer = new DefaultPrettyPrinter();
        Separators customSeparators = new Separators('|', ';', '-');
        DefaultPrettyPrinter newPrinter = printer.withSeparators(customSeparators);
        assertEquals(customSeparators, newPrinter._separators);
        assertEquals(" | ", newPrinter._objectFieldValueSeparatorWithSpaces); // objectFieldValueSeparator is '|', spaces are added
    }

    // Test writeObjectEntrySeparator when spaces are disabled and custom separators are used

    // Test writeStartObject behavior

    // Test writeStartObject with NopIndenter

    // Test writeEndObject behavior with zero entries and inline array indenter

    // Test writeEndObject behavior with entries and inline array indenter

    // Test writeEndArray behavior with zero entries and inline array indenter

    // Test writeEndArray behavior with entries and inline array indenter

    // Test writeStartObject with _objectIndenter.isInline() == true

    // Test writeEndObject with _objectIndenter.isInline() == true

    // Test writeStartArray with _arrayIndenter.isInline() == true

    // Test writeEndArray with _arrayIndenter.isInline() == true
    
    // Test withSeparators and writeObjectEntrySeparator when _spacesInObjectEntries is false

    // Test withSeparators and writeArrayValueSeparator
    
    // Test for DefaultPrettyPrinter(DefaultPrettyPrinter base) constructor
    @Test
    public void testCopyConstructor() throws Exception {
        DefaultPrettyPrinter base = new DefaultPrettyPrinter();
        base.indentArraysWith(DefaultPrettyPrinter.NopIndenter.instance);
        base.indentObjectsWith(DefaultPrettyPrinter.NopIndenter.instance);
        base._spacesInObjectEntries = false;
        Separators customSeparators = new Separators('|', ';', '-');
        base.withSeparators(customSeparators);

        DefaultPrettyPrinter copy = new DefaultPrettyPrinter(base);

        assertNotSame(base, copy);
        assertEquals(base._arrayIndenter, copy._arrayIndenter);
        assertEquals(base._objectIndenter, copy._objectIndenter);
        assertEquals(base._rootSeparator, copy._rootSeparator); // Should be same as base's root separator
        assertEquals(base._spacesInObjectEntries, copy._spacesInObjectEntries);
        assertEquals(base._separators, copy._separators);
        assertEquals(base._objectFieldValueSeparatorWithSpaces, copy._objectFieldValueSeparatorWithSpaces);
    }

    // Test for DefaultPrettyPrinter(DefaultPrettyPrinter base, SerializableString rootSeparator) constructor
    @Test
    public void testCopyConstructorWithRootSeparator() throws Exception {
        DefaultPrettyPrinter base = new DefaultPrettyPrinter("ABC");
        SerializableString newRootSeparator = new SerializedString("XYZ");
        
        DefaultPrettyPrinter copy = new DefaultPrettyPrinter(base, newRootSeparator);

        assertNotSame(base, copy);
        assertEquals(base._arrayIndenter, copy._arrayIndenter);
        assertEquals(base._objectIndenter, copy._objectIndenter);
        assertEquals(newRootSeparator, copy._rootSeparator); // Should be the new root separator
        assertEquals(base._spacesInObjectEntries, copy._spacesInObjectEntries);
        assertEquals(base._separators, copy._separators);
        assertEquals(base._objectFieldValueSeparatorWithSpaces, copy._objectFieldValueSeparatorWithSpaces);
    }
}




