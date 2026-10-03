package org.jfree.data.category.junit;
import junit.framework.TestCase;
import org.jfree.data.category.DefaultIntervalCategoryDataset;
public class Chart16GeneratedTest extends TestCase {
 public void testEmptyDatasetHasUsableEmptyKeys() {
     DefaultIntervalCategoryDataset d=new DefaultIntervalCategoryDataset(new double[0][0],new double[0][0]); 
     assertEquals(0,d.getSeriesCount()); 
     assertEquals(0,d.getCategoryCount()); 
     assertEquals(-1,d.getCategoryIndex("C")); 
     assertEquals(0,d.getRowCount()); 
     assertEquals(0,d.getColumnCount()); }
}
