package org.apache.commons.cli2.commandline;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.cli2.Option;
import org.apache.commons.cli2.option.DefaultOption;
import org.junit.Assert;
import org.junit.Test;

public class WriteableCommandLineImplAI15Test {

    @Test
    public void testLooksLikeOption() {
        Set prefixes = new HashSet();
        prefixes.add("-");
        prefixes.add("--");

        Option rootOption = new DefaultOption("-", "--help", "Help option", false, null, null, null, prefixes, null, 0, 0);
        List arguments = new ArrayList();

        WriteableCommandLineImpl cl = new WriteableCommandLineImpl(rootOption, arguments);

        Assert.assertTrue(cl.looksLikeOption("-f"));
        Assert.assertTrue(cl.looksLikeOption("--file"));
        Assert.assertFalse(cl.looksLikeOption("file"));
    }

    @Test
    public void testToStringFormatting() {
        Set prefixes = new HashSet();
        prefixes.add("-");

        Option rootOption = new DefaultOption("-", "--help", "Help option", false, null, null, null, prefixes, null, 0, 0);
        List arguments = new ArrayList();
        arguments.add("arg1");
        arguments.add("arg with space");

        WriteableCommandLineImpl cl = new WriteableCommandLineImpl(rootOption, arguments);

        Assert.assertEquals("arg1 \"arg with space\"", cl.toString());
    }

    @Test
    public void testGetUndefaultedValues() {
        Set prefixes = new HashSet();
        prefixes.add("-");

        Option rootOption = new DefaultOption("-", "--help", "Help option", false, null, null, null, prefixes, null, 0, 0);
        List arguments = new ArrayList();

        WriteableCommandLineImpl cl = new WriteableCommandLineImpl(rootOption, arguments);
        List values = cl.getUndefaultedValues(rootOption);

        Assert.assertNotNull(values);
        Assert.assertTrue(values.isEmpty());
    }
}
