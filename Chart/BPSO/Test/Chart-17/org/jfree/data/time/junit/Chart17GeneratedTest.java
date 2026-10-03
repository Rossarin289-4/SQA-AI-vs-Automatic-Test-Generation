package org.jfree.data.time.junit;
import junit.framework.TestCase;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.Year;
public class Chart17GeneratedTest extends TestCase {
 public void testCloneOfEmptySeriesIsIndependent() 
 throws CloneNotSupportedException { 
    TimeSeries original=new TimeSeries("S");
    TimeSeries copy=(TimeSeries) original.clone(); 
    assertTrue(original.equals(copy)); 
    original.add(new Year(2007),100.0); 
    assertFalse(original.equals(copy)); }
}
