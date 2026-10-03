package org.apache.commons.cli2.option;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class GroupImplAI21Test {

    @Test
    public void testCanProcessNull() {
        final List options = new ArrayList();
        final GroupImpl group = new GroupImpl(options, "group", "description", 0, 1, false);
        Assert.assertFalse("Should not be able to process null argument", group.canProcess(null, null));
    }

    @Test
    public void testGetMinimumAndMaximum() {
        final List options = new ArrayList();
        final GroupImpl group = new GroupImpl(options, "group", "description", 2, 5, false);
        Assert.assertEquals(2, group.getMinimum());
        Assert.assertEquals(5, group.getMaximum());
    }

    @Test
    public void testIsRequiredWithZeroMinimum() {
        final List options = new ArrayList();
        final GroupImpl group = new GroupImpl(options, "group", "description", 0, 1, true);
        Assert.assertFalse("Group with minimum 0 should not be required", group.isRequired());
    }
}
