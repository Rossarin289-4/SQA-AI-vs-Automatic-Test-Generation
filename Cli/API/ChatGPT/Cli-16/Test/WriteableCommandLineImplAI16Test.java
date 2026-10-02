package org.apache.commons.cli2.commandline;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.cli2.Option;
import org.apache.commons.cli2.option.DefaultOption;
import org.junit.Test;

public class WriteableCommandLineImplAI16Test {

    @Test
    public void testLooksLikeOption() {
        final Set prefixes = new HashSet();
        prefixes.add("--");
        prefixes.add("-");

        final Option root = new DefaultOption.Builder()
            .withPrefixes(prefixes)
            .withShortName("h")
            .withLongName("help")
            .create();

        final WriteableCommandLineImpl cmd = new WriteableCommandLineImpl(root, new ArrayList());

        assertTrue(cmd.looksLikeOption("--help"));
        assertTrue(cmd.looksLikeOption("-h"));
        assertFalse(cmd.looksLikeOption("help"));
    }

    @Test
    public void testToStringFormatting() {
        final Set prefixes = new HashSet();
        prefixes.add("-");

        final Option root = new DefaultOption.Builder()
            .withPrefixes(prefixes)
            .withShortName("v")
            .create();

        final List arguments = new ArrayList();
        arguments.add("arg1");
        arguments.add("arg with space");

        final WriteableCommandLineImpl cmd = new WriteableCommandLineImpl(root, arguments);

        assertEquals("arg1 \"arg with space\"", cmd.toString());
    }

    @Test
    public void testAddSwitchAndGetSwitch() {
        final Set prefixes = new HashSet();
        prefixes.add("-");

        final Option root = new DefaultOption.Builder()
            .withPrefixes(prefixes)
            .withShortName("f")
            .create();

        final WriteableCommandLineImpl cmd = new WriteableCommandLineImpl(root, new ArrayList());

        cmd.addSwitch(root, true);

        assertTrue(cmd.hasOption(root));
        assertEquals(Boolean.TRUE, cmd.getSwitch(root, Boolean.FALSE));
    }
}
