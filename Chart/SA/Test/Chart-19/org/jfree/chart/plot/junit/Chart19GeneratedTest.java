package org.jfree.chart.plot.junit;
import junit.framework.TestCase;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.CategoryPlot;
public class Chart19GeneratedTest extends TestCase {
 public void testNullAxisIsRejected() { CategoryPlot p=new CategoryPlot(null,new CategoryAxis("X"),new NumberAxis("Y"),null); try { p.getDomainAxisIndex(null); fail(); } catch (IllegalArgumentException expected) {} try { p.getRangeAxisIndex(null); fail(); } catch (IllegalArgumentException expected) {} }
}
