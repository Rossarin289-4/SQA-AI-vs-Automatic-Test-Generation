package org.apache.commons.cli2.option;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

public class GroupImplAI16Test {

    @Test
    public void testCanProcessNull() {
        List options = new ArrayList();
        GroupImpl group = new GroupImpl(options, "group", "description", 0, 1);
        assertFalse(group.canProcess(null, null));
    }

    @Test
    public void testGroupMinimumMaximum() {
        List options = new ArrayList();
        GroupImpl group = new GroupImpl(options, "group", "description", 1, 2);
        assertEquals(1, group.getMinimum());
        assertEquals(2, group.getMaximum());
        assertTrue(group.isRequired());
    }

    @Test
    public void testGetOptionsAndAnonymous() {
        List options = new ArrayList();
        GroupImpl group = new GroupImpl(options, "group", "description", 0, 1);
        assertTrue(group.getOptions().isEmpty());
        assertTrue(group.getAnonymous().isEmpty());
    }
}
