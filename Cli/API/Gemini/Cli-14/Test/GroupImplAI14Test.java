package org.apache.commons.cli2.option;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

public class GroupImplAI14Test {

    @Test
    public void testCanProcessNull() {
        final List options = new ArrayList();
        final GroupImpl group = new GroupImpl(options, "group", "A test group", 0, 1);
        assertFalse(group.canProcess(null, null));
    }

    @Test
    public void testGetOptionsNotNull() {
        final List options = new ArrayList();
        final GroupImpl group = new GroupImpl(options, "group", "A test group", 0, 1);
        assertNotNull(group.getOptions());
    }

    @Test
    public void testGetAnonymousNotNull() {
        final List options = new ArrayList();
        final GroupImpl group = new GroupImpl(options, "group", "A test group", 0, 1);
        assertNotNull(group.getAnonymous());
    }
}
