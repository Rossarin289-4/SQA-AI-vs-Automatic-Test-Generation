package org.apache.commons.cli2.commandline;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.cli2.Option;
import org.apache.commons.cli2.option.DefaultOption;
import org.junit.Assert;
import org.junit.Test;

public class WriteableCommandLineImplAI13Test {

    @Test
    public void testAddPropertyAndGetProperty() {
        Set prefixes = new HashSet();
        prefixes.add("-");
        DefaultOption root = new DefaultOption("-h", "--help", false, "help", prefixes, null, null, null, ' ', null, null, 0, 0);
        List args = new ArrayList();
        WriteableCommandLineImpl cmd = new WriteableCommandLineImpl(root, args);

        cmd.addProperty("testProp", "testVal");
        Assert.assertEquals("testVal", cmd.getProperty("testProp", "defaultVal"));
        Assert.assertEquals("defaultVal", cmd.getProperty("nonExistent", "defaultVal"));
        Assert.assertNotNull(cmd.getProperties());
    }

    @Test
    public void testLooksLikeOption() {
        Set prefixes = new HashSet();
        prefixes.add("-");
        DefaultOption root = new DefaultOption("-h", "--help", false, "help", prefixes, null, null, null, ' ', null, null, 0, 0);
        List args = new ArrayList();
        WriteableCommandLineImpl cmd = new WriteableCommandLineImpl(root, args);

        Assert.assertTrue(cmd.looksLikeOption("-file"));
        Assert.assertFalse(cmd.looksLikeOption("file"));
    }

    @Test
    public void testToStringFormatting() {
        Set prefixes = new HashSet();
        prefixes.add("-");
        DefaultOption root = new DefaultOption("-h", "--help", false, "help", prefixes, null, null, null, ' ', null, null, 0, 0);
        List args = new ArrayList();
        args.add("arg1");
        args.add("arg with space");
        WriteableCommandLineImpl cmd = new WriteableCommandLineImpl(root, args);

        Assert.assertEquals("arg1 \"arg with space\"", cmd.toString());
    }
}
