package org.apache.commons.math3.genetics;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import org.apache.commons.math3.exception.OutOfRangeException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.util.FastMath;

public class ElitisticListPopulationTest {

    // Dummy Chromosome implementation for testing purposes

    // Helper method to create a ListPopulation instance
    private ElitisticListPopulation createPopulation(List<Chromosome> chromosomes, int populationLimit, double elitismRate) {
        return new ElitisticListPopulation(chromosomes, populationLimit, elitismRate);
    }

    // Helper method to create a ListPopulation instance without initial chromosomes
    private ElitisticListPopulation createPopulation(int populationLimit, double elitismRate) {
        return new ElitisticListPopulation(populationLimit, elitismRate);
    }


    @Test
    public void testConstructorWithPopulationLimitAndElitismRate() throws Exception {
        ElitisticListPopulation population = createPopulation(10, 0.5);
        assertEquals(10, population.getPopulationLimit());
        assertEquals(0.5, population.getElitismRate(), 1e-9);
        assertEquals(0, population.getPopulationSize());
    }

    @Test
    public void testSetElitismRateValid() throws Exception {
        ElitisticListPopulation population = createPopulation(10, 0.5);
        population.setElitismRate(0.75);
        assertEquals(0.75, population.getElitismRate(), 1e-9);
    }

    @Test
    public void testSetElitismRateZero() throws Exception {
        ElitisticListPopulation population = createPopulation(10, 0.5);
        population.setElitismRate(0.0);
        assertEquals(0.0, population.getElitismRate(), 1e-9);
    }

    @Test
    public void testSetElitismRateOne() throws Exception {
        ElitisticListPopulation population = createPopulation(10, 0.5);
        population.setElitismRate(1.0);
        assertEquals(1.0, population.getElitismRate(), 1e-9);
    }

    @Test(expected = OutOfRangeException.class)
    public void testSetElitismRateTooLow() throws Exception {
        ElitisticListPopulation population = createPopulation(10, 0.5);
        population.setElitismRate(-0.1);
    }

    @Test(expected = OutOfRangeException.class)
    public void testSetElitismRateTooHigh() throws Exception {
        ElitisticListPopulation population = createPopulation(10, 0.5);
        population.setElitismRate(1.1);
    }

    @Test
    public void testGetElitismRate() throws Exception {
        ElitisticListPopulation population = createPopulation(10, 0.7);
        assertEquals(0.7, population.getElitismRate(), 1e-9);
    }




    @Test
    public void testNextGenerationEmptyPopulation() throws Exception {
        ElitisticListPopulation population = createPopulation(5, 0.5);
        Population nextPop = population.nextGeneration();
        assertEquals(0, nextPop.getPopulationSize());
    }










    @Test
    public void testConstructorHandlesNullChromosomesList() throws Exception {
        ElitisticListPopulation population = createPopulation(null, 10, 0.5);
        assertEquals(10, population.getPopulationLimit());
        assertEquals(0.5, population.getElitismRate(), 1e-9);
        assertEquals(0, population.getPopulationSize()); // Should be empty if null list is provided
    }


    @Test
    public void testNextGenerationWithZeroSizePopulation() throws Exception {
        List<Chromosome> chromosomes = new ArrayList<>();
        ElitisticListPopulation population = createPopulation(chromosomes, 5, 0.5);
        Population nextPop = population.nextGeneration();
        assertEquals(0, nextPop.getPopulationSize());
    }



}




