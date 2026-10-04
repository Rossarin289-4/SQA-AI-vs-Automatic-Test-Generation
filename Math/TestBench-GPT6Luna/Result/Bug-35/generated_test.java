package org.apache.commons.math3.genetics;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Collections;
import java.util.List;
import org.apache.commons.math3.exception.OutOfRangeException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.util.FastMath;

public class ElitisticListPopulationTest {
    @Test
    public void testDefaultRate() throws Exception {
        ElitisticListPopulation population = new ElitisticListPopulation(5, 0.5);
        assertEquals(0.5, population.getElitismRate(), 0.0);
    }

    @Test
    public void testSetRateZero() throws Exception {
        ElitisticListPopulation population = new ElitisticListPopulation(5, 0.5);
        population.setElitismRate(0.0);
        assertEquals(0.0, population.getElitismRate(), 0.0);
    }

    @Test
    public void testSetRateOne() throws Exception {
        ElitisticListPopulation population = new ElitisticListPopulation(5, 0.5);
        population.setElitismRate(1.0);
        assertEquals(1.0, population.getElitismRate(), 0.0);
    }

    @Test
    public void testSetInteriorRate() throws Exception {
        ElitisticListPopulation population = new ElitisticListPopulation(5, 0.0);
        population.setElitismRate(0.25);
        assertEquals(0.25, population.getElitismRate(), 0.0);
    }

    @Test
    public void testRejectNegativeRate() throws Exception {
        ElitisticListPopulation population = new ElitisticListPopulation(5, 0.5);
        try {
            population.setElitismRate(-0.01);
            fail("expected OutOfRangeException");
        } catch (OutOfRangeException expected) { }
    }

    @Test
    public void testRejectRateAboveOne() throws Exception {
        ElitisticListPopulation population = new ElitisticListPopulation(5, 0.5);
        try {
            population.setElitismRate(1.01);
            fail("expected OutOfRangeException");
        } catch (OutOfRangeException expected) { }
    }

    @Test
    public void testConstructorAcceptsZeroRate() throws Exception {
        ElitisticListPopulation population = new ElitisticListPopulation(4, 0.0);
        assertEquals(0.0, population.getElitismRate(), 0.0);
    }

    @Test
    public void testConstructorAcceptsOneRate() throws Exception {
        ElitisticListPopulation population = new ElitisticListPopulation(4, 1.0);
        assertEquals(1.0, population.getElitismRate(), 0.0);
    }

    @Test
    public void testConstructorRejectsNegativeRate() throws Exception {
        try {
            new ElitisticListPopulation(4, -0.1);
            fail("expected OutOfRangeException");
        } catch (OutOfRangeException expected) { }
    }

    @Test
    public void testConstructorRejectsRateAboveOne() throws Exception {
        try {
            new ElitisticListPopulation(4, 1.1);
            fail("expected OutOfRangeException");
        } catch (OutOfRangeException expected) { }
    }

    @Test
    public void testNextGenerationAtZeroRate() throws Exception {
        ElitisticListPopulation population = new ElitisticListPopulation(5, 0.0);
        Population next = population.nextGeneration();
        assertEquals(0, next.getPopulationSize());
        assertEquals(5, next.getPopulationLimit());
    }

    @Test
    public void testNextGenerationAtOneRate() throws Exception {
        ElitisticListPopulation population = new ElitisticListPopulation(5, 1.0);
        Population next = population.nextGeneration();
        assertEquals(0, next.getPopulationSize());
        assertEquals(5, next.getPopulationLimit());
    }

    @Test
    public void testNextGenerationWithEmptyPopulation() throws Exception {
        ElitisticListPopulation population = new ElitisticListPopulation(3, 0.5);
        Population next = population.nextGeneration();
        assertEquals(0, next.getPopulationSize());
        assertEquals(3, next.getPopulationLimit());
    }
}
