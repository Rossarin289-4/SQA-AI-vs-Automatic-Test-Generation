package org.jfree.chart.plot.junit;
import java.awt.BasicStroke; import java.awt.Color; import junit.framework.TestCase; import org.jfree.chart.plot.ValueMarker;
public class Chart20GeneratedTest extends TestCase { public void testConstructorPreservesOutlineArguments() { BasicStroke stroke=new BasicStroke(1f), outline=new BasicStroke(2f); ValueMarker m=new ValueMarker(1.0,Color.red,stroke,Color.blue,outline,0.5f); assertEquals(Color.blue,m.getOutlinePaint()); assertEquals(outline,m.getOutlineStroke()); } }
