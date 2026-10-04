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
    private static class DummyChromosome implements Comparable<Chromosome> {
        private final double fitness;
        private final int id;

        public DummyChromosome(double fitness, int id) {
            this.fitness = fitness;
            this.id = id;
        }

        @Override
        public int compareTo(Chromosome other) {
            if (other instanceof DummyChromosome) {
                return Double.compare(this.fitness, ((DummyChromosome) other).fitness);
            }
            // Fallback for comparison with non-DummyChromosome, though ideally not needed for internal tests
            return Double.compare(this.fitness, other.getFitness());
        }

        @Override
        public double getFitness() {
            return this.fitness;
        }

        @Override
        public int hashCode() {
            return id;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            DummyChromosome other = (DummyChromosome) obj;
            return id == other.id;
        }
    }

    // Helper method to create a ListPopulation instance
    private ElitisticListPopulation createPopulation(List<Chromosome> chromosomes, int populationLimit, double elitismRate) {
        return new ElitisticListPopulation(chromosomes, populationLimit, elitismRate);
    }

    // Helper method to create a ListPopulation instance without initial chromosomes
    private ElitisticListPopulation createPopulation(int populationLimit, double elitismRate) {
        return new ElitisticListPopulation(populationLimit, elitismRate);
    }

    @Test
    public void testConstructorWithChromosomesAndElitismRate() throws Exception {
        List<Chromosome> chromosomes = new ArrayList<>();
        chromosomes.add(new DummyChromosome(1.0, 1));
        chromosomes.add(new DummyChromosome(2.0, 2));
        ElitisticListPopulation population = createPopulation(chromosomes, 10, 0.5);
        assertEquals(10, population.getPopulationLimit());
        assertEquals(0.5, population.getElitismRate(), 1e-9);
        assertEquals(2, population.getPopulationSize());
        assertTrue(population.getChromosomes().contains(new DummyChromosome(1.0, 1)));
        assertTrue(population.getChromosomes().contains(new DummyChromosome(2.0, 2)));
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
    public void testNextGenerationWithElitism() throws Exception {
        List<Chromosome> chromosomes = new ArrayList<>();
        chromosomes.add(new DummyChromosome(1.0, 1)); // Worst
        chromosomes.add(new DummyChromosome(2.0, 2));
        ElitisticListPopulation population = createPopulation(chromosomes, 5, 0.5); // 50% elitism
        Population nextPop = population.nextGeneration();
        // ceil((1-0.5)*2) = ceil(1.0) = 1. One chromosome should be kept.
        assertEquals(1, nextPop.getPopulationSize());
        assertTrue(nextPop.getChromosomes().contains(new DummyChromosome(2.0, 2)));
    }

    @Test
    public void testNextGenerationWithZeroElitism() throws Exception {
        List<Chromosome> chromosomes = new ArrayList<>();
        chromosomes.add(new DummyChromosome(1.0, 1));
        chromosomes.add(new DummyChromosome(2.0, 2));
        ElitisticListPopulation population = createPopulation(chromosomes, 5, 0.0); // 0% elitism
        Population nextPop = population.nextGeneration();
        assertEquals(0, nextPop.getPopulationSize()); // 0% elitism means no chromosomes are carried over
    }

    @Test
    public void testNextGenerationWithFullElitism() throws Exception {
        List<Chromosome> chromosomes = new ArrayList<>();
        chromosomes.add(new DummyChromosome(1.0, 1));
        chromosomes.add(new DummyChromosome(2.0, 2));
        ElitisticListPopulation population = createPopulation(chromosomes, 5, 1.0); // 100% elitism
        Population nextPop = population.nextGeneration();
        assertEquals(2, nextPop.getPopulationSize()); // 100% elitism means all chromosomes are carried over
        assertTrue(nextPop.getChromosomes().contains(new DummyChromosome(1.0, 1)));
        assertTrue(nextPop.getChromosomes().contains(new DummyChromosome(2.0, 2)));
    }

    @Test
    public void testNextGenerationEmptyPopulation() throws Exception {
        ElitisticListPopulation population = createPopulation(5, 0.5);
        Population nextPop = population.nextGeneration();
        assertEquals(0, nextPop.getPopulationSize());
    }

    @Test
    public void testNextGenerationWithOddNumberOfChromosomes() throws Exception {
        List<Chromosome> chromosomes = new ArrayList<>();
        chromosomes.add(new DummyChromosome(1.0, 1)); // Worst
        chromosomes.add(new DummyChromosome(2.0, 2));
        chromosomes.add(new DummyChromosome(3.0, 3)); // Best
        // Elitism rate 0.34 means ceil((1-0.34)*3) = ceil(0.66*3) = ceil(1.98) = 2. So 2 chromosomes should be kept.
        ElitisticListPopulation population = createPopulation(chromosomes, 5, 0.34);
        Population nextPop = population.nextGeneration();
        assertEquals(2, nextPop.getPopulationSize());
        assertTrue(nextPop.getChromosomes().contains(new DummyChromosome(2.0, 2)));
        assertTrue(nextPop.getChromosomes().contains(new DummyChromosome(3.0, 3)));
    }

    @Test
    public void testNextGenerationWithElitismRateExactlyAtBoundary() throws Exception {
        List<Chromosome> chromosomes = new ArrayList<>();
        chromosomes.add(new DummyChromosome(1.0, 1));
        chromosomes.add(new DummyChromosome(2.0, 2));
        chromosomes.add(new DummyChromosome(3.0, 3));
        chromosomes.add(new DummyChromosome(4.0, 4));
        chromosomes.add(new DummyChromosome(5.0, 5));

        // Elitism rate 0.6 means ceil((1-0.6)*5) = ceil(0.4 * 5) = ceil(2.0) = 2. Chromosomes 4 and 5 are kept.
        ElitisticListPopulation population = createPopulation(chromosomes, 10, 0.6);
        Population nextPop = population.nextGeneration();
        assertEquals(2, nextPop.getPopulationSize());
        assertTrue(nextPop.getChromosomes().contains(new DummyChromosome(4.0, 4)));
        assertTrue(nextPop.getChromosomes().contains(new DummyChromosome(5.0, 5)));
    }

    @Test
    public void testNextGenerationWithElitismRateSlightlyAboveBoundary() throws Exception {
        List<Chromosome> chromosomes = new ArrayList<>();
        chromosomes.add(new DummyChromosome(1.0, 1));
        chromosomes.add(new DummyChromosome(2.0, 2));
        chromosomes.add(new DummyChromosome(3.0, 3));
        chromosomes.add(new DummyChromosome(4.0, 4));
        chromosomes.add(new DummyChromosome(5.0, 5));

        // Elitism rate 0.6000000000000001 means ceil((1-0.6000000000000001)*5) = ceil(0.3999999999999999 * 5) = ceil(1.9999999999999995) = 2. Chromosomes 4 and 5 are kept.
        ElitisticListPopulation population = createPopulation(chromosomes, 10, 0.6000000000000001);
        Population nextPop = population.nextGeneration();
        assertEquals(2, nextPop.getPopulationSize());
        assertTrue(nextPop.getChromosomes().contains(new DummyChromosome(4.0, 4)));
        assertTrue(nextPop.getChromosomes().contains(new DummyChromosome(5.0, 5)));
    }

    @Test
    public void testNextGenerationWithElitismRateSlightlyBelowBoundary() throws Exception {
        List<Chromosome> chromosomes = new ArrayList<>();
        chromosomes.add(new DummyChromosome(1.0, 1));
        chromosomes.add(new DummyChromosome(2.0, 2));
        chromosomes.add(new DummyChromosome(3.0, 3));
        chromosomes.add(new DummyChromosome(4.0, 4));
        chromosomes.add(new DummyChromosome(5.0, 5));

        // Elitism rate 0.5999999999999999 means ceil((1-0.5999999999999999)*5) = ceil(0.4000000000000001 * 5) = ceil(2.0000000000000005) = 3. Chromosomes 3, 4, and 5 are kept.
        ElitisticListPopulation population = createPopulation(chromosomes, 10, 0.5999999999999999);
        Population nextPop = population.nextGeneration();
        assertEquals(3, nextPop.getPopulationSize());
        assertTrue(nextPop.getChromosomes().contains(new DummyChromosome(3.0, 3)));
        assertTrue(nextPop.getChromosomes().contains(new DummyChromosome(4.0, 4)));
        assertTrue(nextPop.getChromosomes().contains(new DummyChromosome(5.0, 5)));
    }

    @Test
    public void testNextGenerationWithSmallPopulationAndHighElitism() throws Exception {
        List<Chromosome> chromosomes = new ArrayList<>();
        chromosomes.add(new DummyChromosome(10.0, 1)); // Worst
        chromosomes.add(new DummyChromosome(20.0, 2)); // Best
        ElitisticListPopulation population = createPopulation(chromosomes, 5, 0.8); // 80% elitism
        Population nextPop = population.nextGeneration();
        // ceil((1-0.8)*2) = ceil(0.2*2) = ceil(0.4) = 1. So 1 chromosome is kept.
        assertEquals(1, nextPop.getPopulationSize());
        assertTrue(nextPop.getChromosomes().contains(new DummyChromosome(20.0, 2)));
    }

    @Test
    public void testNextGenerationWithLargePopulationAndLowElitism() throws Exception {
        List<Chromosome> chromosomes = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            chromosomes.add(new DummyChromosome(i + 1.0, i)); // Fitness increases with id
        }
        // Elitism rate 0.1 means ceil((1-0.1)*100) = ceil(0.9 * 100) = ceil(90) = 90.
        // This means chromosomes with IDs 10 to 99 (inclusive) are kept. Total 90.
        ElitisticListPopulation population = createPopulation(chromosomes, 200, 0.1);
        Population nextPop = population.nextGeneration();
        assertEquals(90, nextPop.getPopulationSize());
        for (int i = 10; i < 100; i++) {
            assertTrue(nextPop.getChromosomes().contains(new DummyChromosome(i + 1.0, i)));
        }
    }

    @Test
    public void testNextGenerationWithDifferentFitnessValues() throws Exception {
        List<Chromosome> chromosomes = new ArrayList<>();
        chromosomes.add(new DummyChromosome(0.5, 1));
        chromosomes.add(new DummyChromosome(1.5, 2));
        chromosomes.add(new DummyChromosome(2.5, 3));
        chromosomes.add(new DummyChromosome(0.1, 4)); // Worst
        chromosomes.add(new DummyChromosome(2.0, 5)); // Best

        // Elitism rate 0.4 means ceil((1-0.4)*5) = ceil(0.6 * 5) = ceil(3) = 3.
        // Chromosomes with fitness 1.5, 2.0, 2.5 should be kept.
        ElitisticListPopulation population = createPopulation(chromosomes, 10, 0.4);
        Population nextPop = population.nextGeneration();
        assertEquals(3, nextPop.getPopulationSize());
        assertTrue(nextPop.getChromosomes().contains(new DummyChromosome(1.5, 2)));
        assertTrue(nextPop.getChromosomes().contains(new DummyChromosome(2.0, 5)));
        assertTrue(nextPop.getChromosomes().contains(new DummyChromosome(2.5, 3)));
    }

    @Test
    public void testNextGenerationDoesNotModifyOriginalPopulation() throws Exception {
        List<Chromosome> chromosomes = new ArrayList<>();
        chromosomes.add(new DummyChromosome(1.0, 1));
        chromosomes.add(new DummyChromosome(2.0, 2));
        ElitisticListPopulation population = createPopulation(chromosomes, 5, 0.5);
        Population originalChromosomes = new ArrayList<>(population.getChromosomes()); // Copy to compare later

        population.nextGeneration();

        assertEquals(2, population.getPopulationSize()); // Original population size should remain unchanged
        assertEquals(0.5, population.getElitismRate(), 1e-9); // Elitism rate should remain unchanged
        assertEquals(originalChromosomes, population.getChromosomes()); // Chromosomes list should not be modified
    }

    @Test
    public void testNextGenerationWithPopulationLimitEffect() throws Exception {
        List<Chromosome> chromosomes = new ArrayList<>();
        chromosomes.add(new DummyChromosome(1.0, 1));
        chromosomes.add(new DummyChromosome(2.0, 2));
        chromosomes.add(new DummyChromosome(3.0, 3));
        chromosomes.add(new DummyChromosome(4.0, 4));

        // Population limit is 2. Elitism rate 0.6.
        // ceil((1-0.6)*4) = ceil(0.4*4) = ceil(1.6) = 2.
        // The two best chromosomes (3.0, 4.0) should be selected for the next generation.
        ElitisticListPopulation population = createPopulation(chromosomes, 2, 0.6);
        Population nextPop = population.nextGeneration();
        assertEquals(2, nextPop.getPopulationSize());
        assertEquals(2, nextPop.getPopulationLimit()); // The new population should inherit the limit
        assertTrue(nextPop.getChromosomes().contains(new DummyChromosome(3.0, 3)));
        assertTrue(nextPop.getChromosomes().contains(new DummyChromosome(4.0, 4)));
    }

    @Test
    public void testConstructorHandlesNullChromosomesList() throws Exception {
        ElitisticListPopulation population = createPopulation(null, 10, 0.5);
        assertEquals(10, population.getPopulationLimit());
        assertEquals(0.5, population.getElitismRate(), 1e-9);
        assertEquals(0, population.getPopulationSize()); // Should be empty if null list is provided
    }

    @Test
    public void testNextGenerationCalculationWithCeil() throws Exception {
        List<Chromosome> chromosomes = new ArrayList<>();
        chromosomes.add(new DummyChromosome(1.0, 1));
        chromosomes.add(new DummyChromosome(2.0, 2));
        chromosomes.add(new DummyChromosome(3.0, 3));
        chromosomes.add(new DummyChromosome(4.0, 4));
        chromosomes.add(new DummyChromosome(5.0, 5));
        chromosomes.add(new DummyChromosome(6.0, 6));

        // Elitism rate 0.5.
        // (1.0 - 0.5) * 6 = 3.0. ceil(3.0) = 3.
        // This means chromosomes with fitness 4.0, 5.0, 6.0 should be kept.
        ElitisticListPopulation population = createPopulation(chromosomes, 10, 0.5);
        Population nextPop = population.nextGeneration();
        assertEquals(3, nextPop.getPopulationSize());
        assertTrue(nextPop.getChromosomes().contains(new DummyChromosome(4.0, 4)));
        assertTrue(nextPop.getChromosomes().contains(new DummyChromosome(5.0, 5)));
        assertTrue(nextPop.getChromosomes().contains(new DummyChromosome(6.0, 6)));
    }

    @Test
    public void testNextGenerationWithZeroSizePopulation() throws Exception {
        List<Chromosome> chromosomes = new ArrayList<>();
        ElitisticListPopulation population = createPopulation(chromosomes, 5, 0.5);
        Population nextPop = population.nextGeneration();
        assertEquals(0, nextPop.getPopulationSize());
    }

    @Test
    public void testNextGenerationWithOneChromosome() throws Exception {
        List<Chromosome> chromosomes = new ArrayList<>();
        chromosomes.add(new DummyChromosome(5.0, 1));
        ElitisticListPopulation population = createPopulation(chromosomes, 5, 0.5); // 50% elitism
        Population nextPop = population.nextGeneration();
        // ceil((1-0.5)*1) = ceil(0.5) = 1. So 1 chromosome is kept.
        assertEquals(1, nextPop.getPopulationSize());
        assertTrue(nextPop.getChromosomes().contains(new DummyChromosome(5.0, 1)));
    }

    @Test
    public void testNextGenerationWithElitismRateVeryCloseToZero() throws Exception {
        List<Chromosome> chromosomes = new ArrayList<>();
        chromosomes.add(new DummyChromosome(1.0, 1));
        chromosomes.add(new DummyChromosome(2.0, 2));
        chromosomes.add(new DummyChromosome(3.0, 3));
        chromosomes.add(new DummyChromosome(4.0, 4));
        chromosomes.add(new DummyChromosome(5.0, 5));

        // Elitism rate 0.0000000000000001
        // ceil((1-0.0000000000000001)*5) = ceil(0.9999999999999999 * 5) = ceil(4.9999999999999995) = 5.
        // All chromosomes should be kept.
        ElitisticListPopulation population = createPopulation(chromosomes, 10, 0.0000000000000001);
        Population nextPop = population.nextGeneration();
        assertEquals(5, nextPop.getPopulationSize());
        assertTrue(nextPop.getChromosomes().contains(new DummyChromosome(1.0, 1)));
        assertTrue(nextPop.getChromosomes().contains(new DummyChromosome(2.0, 2)));
        assertTrue(nextPop.getChromosomes().contains(new DummyChromosome(3.0, 3)));
        assertTrue(nextPop.getChromosomes().contains(new DummyChromosome(4.0, 4)));
        assertTrue(nextPop.getChromosomes().contains(new DummyChromosome(5.0, 5)));
    }

    @Test
    public void testNextGenerationWithElitismRateVeryCloseToOne() throws Exception {
        List<Chromosome> chromosomes = new ArrayList<>();
        chromosomes.add(new DummyChromosome(1.0, 1));
        chromosomes.add(new DummyChromosome(2.0, 2));
        chromosomes.add(new DummyChromosome(3.0, 3));
        chromosomes.add(new DummyChromosome(4.0, 4));
        chromosomes.add(new DummyChromosome(5.0, 5));

        // Elitism rate 0.9999999999999999
        // ceil((1-0.9999999999999999)*5) = ceil(0.0000000000000001 * 5) = ceil(0.0000000000000005) = 1.
        // Only the best chromosome should be kept.
        ElitisticListPopulation population = createPopulation(chromosomes, 10, 0.9999999999999999);
        Population nextPop = population.nextGeneration();
        assertEquals(1, nextPop.getPopulationSize());
        assertTrue(nextPop.getChromosomes().contains(new DummyChromosome(5.0, 5)));
    }
}
