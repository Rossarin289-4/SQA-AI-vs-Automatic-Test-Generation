package org.apache.commons.cli2.commandline;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.commons.cli2.Option;
import org.apache.commons.cli2.option.ArgumentImpl;
import org.apache.commons.cli2.option.GroupImpl;
import org.apache.commons.cli2.option.PropertyOption;
import org.junit.Assert;
import org.junit.Test;

public class WriteableCommandLineImplAI21Test {

    @Test
    public void testToStringFormatting() {
        final List arguments = new ArrayList();
        arguments.add("arg1");
        arguments.add("arg with space");
        arguments.add("arg3");

        final GroupImpl rootOption = new GroupImpl(Collections.EMPTY_LIST, "group", "group", 0, 0);
        final WriteableCommandLineImpl cmd = new WriteableCommandLineImpl(rootOption, arguments);

        Assert.assertEquals("arg1 \"arg with space\" arg3", cmd.toString());
    }

    @Test
    public void testGetUndefaultedValuesEmpty() {
        final GroupImpl rootOption = new GroupImpl(Collections.EMPTY_LIST, "group", "group", 0, 0);
        final WriteableCommandLineImpl cmd = new WriteableCommandLineImpl(rootOption, Collections.EMPTY_LIST);
        final ArgumentImpl arg = new ArgumentImpl("arg", "arg", 0, 1, '.', ' ', Collections.EMPTY_LIST, Collections.EMPTY_LIST, 0, 0);

        List values = cmd.getUndefaultedValues(arg);
        Assert.assertNotNull(values);
        Assert.assertTrue(values.isEmpty());
    }

    @Test
    public void testPropertyMethods() {
        final GroupImpl rootOption = new GroupImpl(Collections.EMPTY_LIST, "group", "group", 0, 0);
        final WriteableCommandLineImpl cmd = new WriteableCommandLineImpl(rootOption, Collections.EMPTY_LIST);

        cmd.addProperty("key1", "value1");
        Assert.assertEquals("value1", cmd.getProperty("key1"));
        Assert.assertEquals("default", cmd.getProperty("nonexistent", "default"));
        Assert.assertTrue(cmd.getProperties().contains("key1"));
    }
}
