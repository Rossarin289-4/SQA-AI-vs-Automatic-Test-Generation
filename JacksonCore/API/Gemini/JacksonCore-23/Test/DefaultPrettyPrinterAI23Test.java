package com.fasterxml.jackson.core.util;

import org.junit.Assert;
import org.junit.Test;

import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.io.SerializedString;

public class DefaultPrettyPrinterAI23Test {

    @Test
    public void testDefaultConstructor() {
        DefaultPrettyPrinter printer = new DefaultPrettyPrinter();
        Assert.assertNotNull(printer);
    }

    @Test
    public void testStringConstructor() {
        DefaultPrettyPrinter printer = new DefaultPrettyPrinter("---");
        Assert.assertNotNull(printer);
    }

    @Test
    public void testSerializableStringConstructor() {
        SerializableString sep = new SerializedString("===");
        DefaultPrettyPrinter printer = new DefaultPrettyPrinter(sep);
        Assert.assertNotNull(printer);
    }

    @Test
    public void testCopyConstructor() {
        DefaultPrettyPrinter base = new DefaultPrettyPrinter(" ");
        DefaultPrettyPrinter copy = new DefaultPrettyPrinter(base);
        Assert.assertNotNull(copy);
    }

    @Test
    public void testWithRootSeparatorString() {
        DefaultPrettyPrinter printer = new DefaultPrettyPrinter();
        DefaultPrettyPrinter updated = printer.withRootSeparator("||");
        Assert.assertNotSame(printer, updated);
        
        // Same root separator should return 'this'
        DefaultPrettyPrinter same = updated.withRootSeparator("||");
        Assert.assertSame(updated, same);
        
        // Null root separator
        DefaultPrettyPrinter nullSep = printer.withRootSeparator((String) null);
        Assert.assertNotNull(nullSep);
    }

    @Test
    public void testWithRootSeparatorSerializableString() {
        DefaultPrettyPrinter printer = new DefaultPrettyPrinter();
        SerializableString s = new SerializedString("&&");
        DefaultPrettyPrinter updated = printer.withRootSeparator(s);
        Assert.assertNotSame(printer, updated);
        
        // Same instance check
        DefaultPrettyPrinter same = updated.withRootSeparator(s);
        Assert.assertSame(updated, same);
    }

    @Test
    public void testIndentArraysWith() {
        DefaultPrettyPrinter printer = new DefaultPrettyPrinter();
        printer.indentArraysWith(null);
        printer.indentArraysWith(DefaultPrettyPrinter.NopIndenter.instance);
    }

    @Test
    public void testIndentObjectsWith() {
        DefaultPrettyPrinter printer = new DefaultPrettyPrinter();
        printer.indentObjectsWith(null);
        printer.indentObjectsWith(DefaultPrettyPrinter.NopIndenter.instance);
    }

    @Test
    public void testWithArrayIndenter() {
        DefaultPrettyPrinter printer = new DefaultPrettyPrinter();
        DefaultPrettyPrinter.Indenter indenter = DefaultPrettyPrinter.NopIndenter.instance;
        DefaultPrettyPrinter updated = printer.withArrayIndenter(indenter);
        Assert.assertNotSame(printer, updated);

        // Setting null indenter defaults to NopIndenter
        DefaultPrettyPrinter nullIndenter = printer.withArrayIndenter(null);
        Assert.assertNotNull(nullIndenter);
    }

    @Test
    public void testWithObjectIndenter() {
        DefaultPrettyPrinter printer = new DefaultPrettyPrinter();
        DefaultPrettyPrinter.Indenter indenter = DefaultPrettyPrinter.NopIndenter.instance;
        DefaultPrettyPrinter updated = printer.withObjectIndenter(indenter);
        Assert.assertNotSame(printer, updated);

        // Setting null indenter defaults to NopIndenter
        DefaultPrettyPrinter nullIndenter = printer.withObjectIndenter(null);
        Assert.assertNotNull(nullIndenter);
    }

    @Test
    public void testSpacesInObjectEntriesToggle() {
        DefaultPrettyPrinter printer = new DefaultPrettyPrinter();
        // Default is true
        DefaultPrettyPrinter withSpaces = printer.withSpacesInObjectEntries();
        Assert.assertSame(printer, withSpaces);

        DefaultPrettyPrinter withoutSpaces = printer.withoutSpacesInObjectEntries();
        Assert.assertNotSame(printer, withoutSpaces);

        DefaultPrettyPrinter stillWithout = withoutSpaces.withoutSpacesInObjectEntries();
        Assert.assertSame(withoutSpaces, stillWithout);

        DefaultPrettyPrinter backWith = withoutSpaces.withSpacesInObjectEntries();
        Assert.assertNotSame(withoutSpaces, backWith);
    }

    @Test
    public void testCreateInstance() {
        DefaultPrettyPrinter printer = new DefaultPrettyPrinter();
        DefaultPrettyPrinter instance = printer.createInstance();
        Assert.assertNotNull(instance);
        Assert.assertNotSame(printer, instance);
    }

    @Test(expected = IllegalStateException.class)
    public void testCreateInstanceSubclass() {
        DefaultPrettyPrinter subclass = new DefaultPrettyPrinter() {
            // anonymous subclass to trigger getClass() != DefaultPrettyPrinter.class check
        };
        subclass.createInstance();
    }

    @Test
    public void testNopIndenterBehavior() {
        DefaultPrettyPrinter.NopIndenter indenter = DefaultPrettyPrinter.NopIndenter.instance;
        Assert.assertTrue(indenter.isInline());
    }

    @Test
    public void testFixedSpaceIndenterBehavior() {
        DefaultPrettyPrinter.FixedSpaceIndenter indenter = DefaultPrettyPrinter.FixedSpaceIndenter.instance;
        Assert.assertTrue(indenter.isInline());
    }
}
