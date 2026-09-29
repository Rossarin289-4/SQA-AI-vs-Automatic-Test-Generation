package org.jfree.chart.renderer.junit;
import java.awt.Color; import junit.framework.TestCase; import org.jfree.chart.renderer.GrayPaintScale;
public class Chart24GeneratedTest extends TestCase { public void testOutOfRangeValuesAreClamped() { GrayPaintScale scale=new GrayPaintScale(); assertEquals(Color.black,scale.getPaint(-0.5)); assertEquals(Color.white,scale.getPaint(1.5)); } }
