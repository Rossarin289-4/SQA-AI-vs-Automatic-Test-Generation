package org.jfree.chart.util.junit;

import java.awt.geom.GeneralPath;
import java.awt.geom.Rectangle2D;

import org.jfree.util.ShapeList;

import junit.framework.TestCase;

public class Chart6GeneratedTest extends TestCase {

    // T1: รูปทรงที่มีค่าเท่ากัน ต้องถือว่าเท่ากัน
    public void test01EquivalentShapesAreEqual() {
        ShapeList a = new ShapeList();
        ShapeList b = new ShapeList();

        a.setShape(0, new Rectangle2D.Double(1.0, 2.0, 3.0, 4.0));
        b.setShape(0, new Rectangle2D.Double(1.0, 2.0, 3.0, 4.0));

        assertTrue(a.equals(b));
    }

    // T2: ความกว้างต่างกัน ต้องไม่เท่ากัน
    public void test02DifferentWidthShapesAreNotEqual() {
        ShapeList a = new ShapeList();
        ShapeList b = new ShapeList();

        a.setShape(0, new Rectangle2D.Double(1.0, 2.0, 3.0, 4.0));
        b.setShape(0, new Rectangle2D.Double(1.0, 2.0, 9.0, 4.0));

        assertFalse(a.equals(b));
    }

    // T3: ShapeList ว่างสองตัว ต้องเท่ากัน
    public void test03EmptyListsAreEqual() {
        ShapeList a = new ShapeList();
        ShapeList b = new ShapeList();

        assertTrue(a.equals(b));
    }

    // T4: เก็บ shape ที่ index ต่างกัน ต้องไม่เท่ากัน
    public void test04ShapesAtDifferentIndexesAreNotEqual() {
        ShapeList a = new ShapeList();
        ShapeList b = new ShapeList();

        a.setShape(0, new Rectangle2D.Double(1.0, 2.0, 3.0, 4.0));
        b.setShape(1, new Rectangle2D.Double(1.0, 2.0, 3.0, 4.0));

        assertFalse(a.equals(b));
    }

    // T5: หลาย shape ที่เท่ากันในตำแหน่งเดียวกัน ต้องเท่ากัน
    public void test05MultipleEquivalentShapesAreEqual() {
        ShapeList a = new ShapeList();
        ShapeList b = new ShapeList();

        a.setShape(0, new Rectangle2D.Double(1.0, 1.0, 2.0, 2.0));
        a.setShape(1, new Rectangle2D.Double(3.0, 3.0, 4.0, 4.0));

        b.setShape(0, new Rectangle2D.Double(1.0, 1.0, 2.0, 2.0));
        b.setShape(1, new Rectangle2D.Double(3.0, 3.0, 4.0, 4.0));

        assertTrue(a.equals(b));
    }

    // T6: เปลี่ยน shape ใน list หนึ่งแล้ว ต้องไม่เท่ากับอีก list
    public void test06ReplacingShapeMakesListsDifferent() {
        ShapeList a = new ShapeList();
        ShapeList b = new ShapeList();

        a.setShape(0, new Rectangle2D.Double(1.0, 2.0, 3.0, 4.0));
        b.setShape(0, new Rectangle2D.Double(1.0, 2.0, 3.0, 4.0));

        a.setShape(0, new Rectangle2D.Double(5.0, 6.0, 7.0, 8.0));

        assertFalse(a.equals(b));
    }
    // T7: GeneralPath คนละ object แต่มีเส้นทางเหมือนกัน ต้องเท่ากัน
public void test07EquivalentGeneralPathsAreEqual() {
    ShapeList a = new ShapeList();
    ShapeList b = new ShapeList();

    GeneralPath first = new GeneralPath();
    first.moveTo(1.0f, 1.0f);
    first.lineTo(2.0f, 2.0f);
    first.lineTo(3.0f, 1.0f);

    GeneralPath second = new GeneralPath();
    second.moveTo(1.0f, 1.0f);
    second.lineTo(2.0f, 2.0f);
    second.lineTo(3.0f, 1.0f);

    a.setShape(0, first);
    b.setShape(0, second);

    assertTrue(a.equals(b));
}
}