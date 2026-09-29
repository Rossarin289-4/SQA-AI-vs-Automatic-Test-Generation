package org.jfree.data.junit;
import junit.framework.TestCase; import org.jfree.data.KeyedObjects2D;
public class Chart22GeneratedTest extends TestCase { public void testRemovingSparseColumnKeepsOtherColumn() { KeyedObjects2D d=new KeyedObjects2D(); d.addObject("one","R1","C1"); d.addObject("two","R2","C2"); d.removeColumn("C2"); assertEquals(1,d.getColumnCount()); assertEquals("one",d.getObject("R1","C1")); } }
