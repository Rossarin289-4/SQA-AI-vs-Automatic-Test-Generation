package org.jfree.data.statistics.junit;

import java.util.ArrayList;
import junit.framework.TestCase;
import org.jfree.data.Range;
import org.jfree.data.statistics.BoxAndWhiskerItem;
import org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset;

public class Chart21GeminiTest extends TestCase {

    public Chart21GeminiTest(String name) {
        super(name);
    }

    public void testUpdateBounds() {
        DefaultBoxAndWhiskerCategoryDataset dataset = new DefaultBoxAndWhiskerCategoryDataset();
        
        // Add item 1 with min outlier = 1.0
        BoxAndWhiskerItem item1 = new BoxAndWhiskerItem(
            new Double(1.0), new Double(2.0), new Double(0.0), new Double(4.0),
            new Double(0.5), new Double(4.5), new Double(1.0), new Double(5.0), new ArrayList()
        );
        dataset.add(item1, "R1", "C1");

        // Add item 2 with min outlier = 2.0
        BoxAndWhiskerItem item2 = new BoxAndWhiskerItem(
            new Double(10.0), new Double(20.0), new Double(5.0), new Double(25.0),
            new Double(8.0), new Double(22.0), new Double(2.0), new Double(30.0), new ArrayList()
        );
        dataset.add(item2, "R2", "C2");

        // Overwrite item 1 with a new item (min outlier = 10.0)
        BoxAndWhiskerItem item1New = new BoxAndWhiskerItem(
            new Double(15.0), new Double(20.0), new Double(12.0), new Double(25.0),
            new Double(14.0), new Double(22.0), new Double(10.0), new Double(30.0), new ArrayList()
        );
        dataset.add(item1New, "R1", "C1");

        Range bounds = dataset.getRangeBounds(true);
        assertNotNull(bounds);
        assertFalse(Double.isNaN(bounds.getLowerBound()));
        assertEquals(2.0, bounds.getLowerBound(), 0.00001);
    }
}
