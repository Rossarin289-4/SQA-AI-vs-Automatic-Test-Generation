package org.jfree.data.category.junit;
import org.jfree.data.category.DefaultCategoryDataset;

import junit.framework.TestCase;
public class Chart18GeneratedTest extends TestCase {
 public void testRemoveAndReAddColumnKeepsNewValue() {
     DefaultCategoryDataset d=new DefaultCategoryDataset();
      d.addValue(1.0,"R1","C1"); 
      d.addValue(2.0,"R2","C2"); 
      d.removeColumn("C2"); 
      d.addValue(3.0,"R2","C2"); 
      assertEquals(3.0,d.getValue("R2","C2").doubleValue(),0.0000000001); }
}
