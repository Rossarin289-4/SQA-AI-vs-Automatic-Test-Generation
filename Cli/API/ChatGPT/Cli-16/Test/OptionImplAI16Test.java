package org.apache.commons.cli2.option;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

import org.apache.commons.cli2.WriteableCommandLine;
import org.junit.Assert;
import org.junit.Test;

public class OptionImplAI16Test {

    private static class ConcreteOption extends OptionImpl {
        private final String preferredName;
        private final String description;
        private final Set prefixes;
        private final Set triggers;

        public ConcreteOption(int id, boolean required, String preferredName, String description, Set prefixes, Set triggers) {
            super(id, required);
            this.preferredName = preferredName;
            this.description = description;
            this.prefixes = prefixes != null ? prefixes : new HashSet();
            this.triggers = triggers != null ? triggers : new HashSet();
        }

        public void appendUsage(StringBuffer buffer, java.util.Set settings, java.util.Comparator comparator) {
            buffer.append(preferredName);
        }

        public String getDescription() {
            return description;
        }

        public String getPreferredName() {
            return preferredName;
        }

        public Set getPrefixes() {
            return prefixes;
        }

        public Set getTriggers() {
            return triggers;
        }

        public void helpLines(int indent, java.util.Set settings, java.util.Comparator comparator) {
        }

        public List PREFIXES = null;

        public void validate(WriteableCommandLine commandLine) {
        }
    }

    @Test
    public void testGettersAndParent() {
        ConcreteOption option = new ConcreteOption(123, true, "test", "desc", null, null);
        Assert.assertEquals(123, option.getId());
        Assert.assertTrue(option.isRequired());
        Assert.assertNull(option.getParent());

        ConcreteOption parent = new ConcreteOption(456, false, "parent", "pdesc", null, null);
        option.setParent(parent);
        Assert.assertEquals(parent, option.getParent());
    }

    @Test
    public void testFindOptionAndCanProcess() {
        Set triggers = new HashSet();
        triggers.add("-t");
        ConcreteOption option = new ConcreteOption(1, false, "-t", "test", null, triggers);

        Assert.assertEquals(option, option.findOption("-t"));
        Assert.assertNull(option.findOption("-x"));

        List args = new ArrayList();
        ListIterator iterator = args.listIterator();
        Assert.assertFalse(option.canProcess(null, iterator));

        args.add("-t");
        iterator = args.listIterator();
        Assert.assertTrue(option.canProcess(null, iterator));
    }

    @Test
    public void testEqualsAndHashCode() {
        Set prefixes1 = new HashSet();
        Set triggers1 = new HashSet();
        triggers1.add("-a");

        Set prefixes2 = new HashSet();
        Set triggers2 = new HashSet();
        triggers2.add("-a");

        ConcreteOption opt1 = new ConcreteOption(1, true, "a", "desc", prefixes1, triggers1);
        ConcreteOption opt2 = new ConcreteOption(1, true, "a", "desc", prefixes2, triggers2);
        ConcreteOption opt3 = new ConcreteOption(2, true, "a", "desc", prefixes2, triggers2);

        Assert.assertTrue(opt1.equals(opt2));
        Assert.assertEquals(opt1.hashCode(), opt2.hashCode());
        Assert.assertFalse(opt1.equals(opt3));
        Assert.assertFalse(opt1.equals("not an option"));
    }
}
