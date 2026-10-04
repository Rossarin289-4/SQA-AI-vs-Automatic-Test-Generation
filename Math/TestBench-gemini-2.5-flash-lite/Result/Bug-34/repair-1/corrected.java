package org.apache.commons.math3.genetics;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.exception.NotPositiveException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.exception.NumberIsTooLargeException;
import org.apache.commons.math3.exception.NumberIsTooSmallException;

public class ListPopulationTest {

    // DummyChromosome is removed as it was causing compilation errors.
    // Instead, we use a concrete subclass of Chromosome provided by the API outline.
    // Since ElitisticListPopulation is a concrete subclass, we can instantiate it directly for testing ListPopulation's behavior.

    @Test
    public void testConstructorWithNegativeLimit() {
        try {
            // Using ElitisticListPopulation as a concrete implementation of ListPopulation
            new ElitisticListPopulation(-1, 0.1);
            fail("NotPositiveException expected");
        } catch (NotPositiveException e) {
            // Corrected: Use getMessage() or check for specific exception arguments if available.
            // The constructor for NotPositiveException in the API outline doesn't directly expose getGeneralPattern() or getArg().
            // We'll rely on the exception type for this assertion.
            assertTrue(true); // Exception was thrown as expected
        }
    }

    @Test
    public void testConstructorWithZeroLimit() {
        try {
            new ElitisticListPopulation(0, 0.1);
            fail("NotPositiveException expected");
        } catch (NotPositiveException e) {
            assertTrue(true); // Exception was thrown as expected
        }
    }

    @Test
    public void testConstructorWithNullChromosomes() {
        try {
            new ElitisticListPopulation(null, 10, 0.1);
            fail("NullArgumentException expected");
        } catch (NullArgumentException e) {
            assertTrue(true); // Exception was thrown as expected
        }
    }

    @Test
    public void testConstructorWithChromosomesListTooLarge() {
        List<Chromosome> chromosomes = new ArrayList<>();
        chromosomes.add(new DummyChromosomeForTest(0.5, 1));
        chromosomes.add(new DummyChromosomeForTest(0.6, 2));
        chromosomes.add(new DummyChromosomeForTest(0.7, 3));
        try {
            // Test against ElitisticListPopulation constructor that takes a list
            new ElitisticListPopulation(chromosomes, 2, 0.1);
            fail("NumberIsTooLargeException expected");
        } catch (NumberIsTooLargeException e) {
            // Checking the exception type is sufficient based on API outline.
            assertTrue(true); // Exception was thrown as expected
        }
    }

    @Test
    public void testConstructorWithValidParameters() {
        List<Chromosome> chromosomes = new ArrayList<>();
        chromosomes.add(new DummyChromosomeForTest(0.5, 1));
        chromosomes.add(new DummyChromosomeForTest(0.6, 2));
        ElitisticListPopulation pop = new ElitisticListPopulation(chromosomes, 5, 0.1);
        assertEquals(5, pop.getPopulationLimit());
        assertEquals(2, pop.getPopulationSize());
        assertEquals(chromosomes, pop.getChromosomes());
    }

    @Test
    public void testConstructorWithEmptyList() {
        ElitisticListPopulation pop = new ElitisticListPopulation(Collections.<Chromosome>emptyList(), 5, 0.1);
        assertEquals(5, pop.getPopulationLimit());
        assertEquals(0, pop.getPopulationSize());
        assertTrue(pop.getChromosomes().isEmpty());
    }

    @Test
    public void testSetChromosomesWithNull() {
        ElitisticListPopulation pop = new ElitisticListPopulation(5, 0.1);
        try {
            pop.setChromosomes(null);
            fail("NullArgumentException expected");
        } catch (NullArgumentException e) {
            assertTrue(true); // Exception was thrown as expected
        }
    }

    @Test
    public void testSetChromosomesWithListTooLarge() {
        ElitisticListPopulation pop = new ElitisticListPopulation(5, 0.1);
        List<Chromosome> chromosomes = new ArrayList<>();
        chromosomes.add(new DummyChromosomeForTest(0.5, 1));
        chromosomes.add(new DummyChromosomeForTest(0.6, 2));
        chromosomes.add(new DummyChromosomeForTest(0.7, 3));
        chromosomes.add(new DummyChromosomeForTest(0.8, 4));
        chromosomes.add(new DummyChromosomeForTest(0.9, 5));
        chromosomes.add(new DummyChromosomeForTest(1.0, 6));
        try {
            pop.setChromosomes(chromosomes);
            fail("NumberIsTooLargeException expected");
        } catch (NumberIsTooLargeException e) {
            assertTrue(true); // Exception was thrown as expected
        }
    }

    @Test
    public void testSetChromosomes() {
        ElitisticListPopulation pop = new ElitisticListPopulation(5, 0.1);
        List<Chromosome> chromosomes = new ArrayList<>();
        chromosomes.add(new DummyChromosomeForTest(0.5, 1));
        chromosomes.add(new DummyChromosomeForTest(0.6, 2));
        pop.setChromosomes(chromosomes);
        assertEquals(5, pop.getPopulationLimit());
        assertEquals(2, pop.getPopulationSize());
        assertEquals(chromosomes, pop.getChromosomes());
    }

    @Test
    public void testAddChromosomesWithCollectionTooLarge() {
        List<Chromosome> chromosomes = new ArrayList<>();
        chromosomes.add(new DummyChromosomeForTest(0.5, 1));
        chromosomes.add(new DummyChromosomeForTest(0.6, 2));
        chromosomes.add(new DummyChromosomeForTest(0.7, 3));
        ElitisticListPopulation pop = new ElitisticListPopulation(chromosomes, 5, 0.1);
        List<Chromosome> toAdd = new ArrayList<>();
        toAdd.add(new DummyChromosomeForTest(0.8, 4));
        toAdd.add(new DummyChromosomeForTest(0.9, 5));
        toAdd.add(new DummyChromosomeForTest(1.0, 6));
        try {
            pop.addChromosomes(toAdd);
            fail("NumberIsTooLargeException expected");
        } catch (NumberIsTooLargeException e) {
            assertTrue(true); // Exception was thrown as expected
        }
    }

    @Test
    public void testAddChromosomes() {
        List<Chromosome> chromosomes = new ArrayList<>();
        chromosomes.add(new DummyChromosomeForTest(0.5, 1));
        chromosomes.add(new DummyChromosomeForTest(0.6, 2));
        ElitisticListPopulation pop = new ElitisticListPopulation(chromosomes, 5, 0.1);
        List<Chromosome> toAdd = new ArrayList<>();
        toAdd.add(new DummyChromosomeForTest(0.7, 3));
        toAdd.add(new DummyChromosomeForTest(0.8, 4));
        pop.addChromosomes(toAdd);
        assertEquals(5, pop.getPopulationLimit());
        assertEquals(4, pop.getPopulationSize());
        List<Chromosome> expected = new ArrayList<>();
        expected.add(new DummyChromosomeForTest(0.5, 1));
        expected.add(new DummyChromosomeForTest(0.6, 2));
        expected.add(new DummyChromosomeForTest(0.7, 3));
        expected.add(new DummyChromosomeForTest(0.8, 4));
        assertEquals(expected, pop.getChromosomes());
    }

    @Test
    public void testAddChromosomeWhenFull() {
        List<Chromosome> chromosomes = new ArrayList<>();
        chromosomes.add(new DummyChromosomeForTest(0.5, 1));
        chromosomes.add(new DummyChromosomeForTest(0.6, 2));
        ElitisticListPopulation pop = new ElitisticListPopulation(chromosomes, 2, 0.1);
        try {
            pop.addChromosome(new DummyChromosomeForTest(0.7, 3));
            fail("NumberIsTooLargeException expected");
        } catch (NumberIsTooLargeException e) {
            assertTrue(true); // Exception was thrown as expected
        }
    }

    @Test
    public void testAddChromosome() {
        List<Chromosome> chromosomes = new ArrayList<>();
        chromosomes.add(new DummyChromosomeForTest(0.5, 1));
        ElitisticListPopulation pop = new ElitisticListPopulation(chromosomes, 5, 0.1);
        pop.addChromosome(new DummyChromosomeForTest(0.6, 2));
        assertEquals(5, pop.getPopulationLimit());
        assertEquals(2, pop.getPopulationSize());
        List<Chromosome> expected = new ArrayList<>();
        expected.add(new DummyChromosomeForTest(0.5, 1));
        expected.add(new DummyChromosomeForTest(0.6, 2));
        assertEquals(expected, pop.getChromosomes());
    }

    @Test
    public void testGetFittestChromosome() {
        List<Chromosome> chromosomes = new ArrayList<>();
        chromosomes.add(new DummyChromosomeForTest(0.5, 1));
        chromosomes.add(new DummyChromosomeForTest(0.7, 3)); // Fittest
        chromosomes.add(new DummyChromosomeForTest(0.6, 2));
        ElitisticListPopulation pop = new ElitisticListPopulation(chromosomes, 5, 0.1);
        assertEquals(chromosomes.get(1), pop.getFittestChromosome());
    }

    @Test
    public void testGetFittestChromosomeSingle() {
        List<Chromosome> chromosomes = new ArrayList<>();
        chromosomes.add(new DummyChromosomeForTest(0.5, 1));
        ElitisticListPopulation pop = new ElitisticListPopulation(chromosomes, 5, 0.1);
        assertEquals(chromosomes.get(0), pop.getFittestChromosome());
    }

    @Test
    public void testGetPopulationLimit() {
        ElitisticListPopulation pop = new ElitisticListPopulation(10, 0.1);
        assertEquals(10, pop.getPopulationLimit());
    }

    @Test
    public void testSetPopulationLimitWithNegativeValue() {
        ElitisticListPopulation pop = new ElitisticListPopulation(10, 0.1);
        try {
            pop.setPopulationLimit(-1);
            fail("NotPositiveException expected");
        } catch (NotPositiveException e) {
            assertTrue(true); // Exception was thrown as expected
        }
    }

    @Test
    public void testSetPopulationLimitWithZeroValue() {
        ElitisticListPopulation pop = new ElitisticListPopulation(10, 0.1);
        try {
            pop.setPopulationLimit(0);
            fail("NotPositiveException expected");
        } catch (NotPositiveException e) {
            assertTrue(true); // Exception was thrown as expected
        }
    }

    @Test
    public void testSetPopulationLimitSmallerThanCurrentSize() {
        List<Chromosome> chromosomes = new ArrayList<>();
        chromosomes.add(new DummyChromosomeForTest(0.5, 1));
        chromosomes.add(new DummyChromosomeForTest(0.6, 2));
        chromosomes.add(new DummyChromosomeForTest(0.7, 3));
        ElitisticListPopulation pop = new ElitisticListPopulation(chromosomes, 5, 0.1);
        try {
            pop.setPopulationLimit(2);
            fail("NumberIsTooSmallException expected");
        } catch (NumberIsTooSmallException e) {
            assertTrue(true); // Exception was thrown as expected
        }
    }

    @Test
    public void testSetPopulationLimitToCurrentSize() {
        List<Chromosome> chromosomes = new ArrayList<>();
        chromosomes.add(new DummyChromosomeForTest(0.5, 1));
        chromosomes.add(new DummyChromosomeForTest(0.6, 2));
        chromosomes.add(new DummyChromosomeForTest(0.7, 3));
        ElitisticListPopulation pop = new ElitisticListPopulation(chromosomes, 5, 0.1);
        pop.setPopulationLimit(3);
        assertEquals(3, pop.getPopulationLimit());
        assertEquals(3, pop.getPopulationSize());
    }

    @Test
    public void testSetPopulationLimitLargerThanCurrentSize() {
        List<Chromosome> chromosomes = new ArrayList<>();
        chromosomes.add(new DummyChromosomeForTest(0.5, 1));
        chromosomes.add(new DummyChromosomeForTest(0.6, 2));
        ElitisticListPopulation pop = new ElitisticListPopulation(chromosomes, 5, 0.1);
        pop.setPopulationLimit(10);
        assertEquals(10, pop.getPopulationLimit());
        assertEquals(2, pop.getPopulationSize());
        assertEquals(chromosomes, pop.getChromosomes());
    }

    @Test
    public void testGetPopulationSize() {
        List<Chromosome> chromosomes = new ArrayList<>();
        chromosomes.add(new DummyChromosomeForTest(0.5, 1));
        chromosomes.add(new DummyChromosomeForTest(0.6, 2));
        ElitisticListPopulation pop = new ElitisticListPopulation(chromosomes, 5, 0.1);
        assertEquals(2, pop.getPopulationSize());
    }

    @Test
    public void testGetPopulationSizeEmpty() {
        ElitisticListPopulation pop = new ElitisticListPopulation(5, 0.1);
        assertEquals(0, pop.getPopulationSize());
    }

    @Test
    public void testToString() {
        List<Chromosome> chromosomes = new ArrayList<>();
        chromosomes.add(new DummyChromosomeForTest(0.5, 1));
        chromosomes.add(new DummyChromosomeForTest(0.6, 2));
        ElitisticListPopulation pop = new ElitisticListPopulation(chromosomes, 5, 0.1);
        // The toString method of ListPopulation delegates to the toString of the list of chromosomes.
        // We need to ensure DummyChromosomeForTest has a useful toString or assert against the List's string representation.
        // Assuming DummyChromosomeForTest.toString() is reasonable for this test.
        // If not, we would need to mock toString or assert list contents.
        // For now, let's assume a default representation for the list.
        // The actual output of `chromosomes.toString()` would be like "[0.5: 1, 0.6: 2]" if DummyChromosomeForTest.toString() is "fitness: representation"
        // Let's verify the list content instead of relying on toString output.
        assertEquals("Fitness: 0.5, Representation: 1", chromosomes.get(0).toString());
        assertEquals("Fitness: 0.6, Representation: 2", chromosomes.get(1).toString());
        assertEquals("[Fitness: 0.5, Representation: 1, Fitness: 0.6, Representation: 2]", pop.toString());
    }

    @Test
    public void testIterator() {
        List<Chromosome> chromosomes = new ArrayList<>();
        chromosomes.add(new DummyChromosomeForTest(0.5, 1));
        chromosomes.add(new DummyChromosomeForTest(0.6, 2));
        ElitisticListPopulation pop = new ElitisticListPopulation(chromosomes, 5, 0.1);
        Iterator<Chromosome> it = pop.iterator();
        assertTrue(it.hasNext());
        assertEquals(chromosomes.get(0), it.next());
        assertTrue(it.hasNext());
        assertEquals(chromosomes.get(1), it.next());
        assertFalse(it.hasNext());
    }

    @Test
    public void testIteratorRemove() {
        ElitisticListPopulation pop = new ElitisticListPopulation(5, 0.1);
        Iterator<Chromosome> it = pop.iterator();
        try {
            it.remove();
            fail("UnsupportedOperationException expected");
        } catch (UnsupportedOperationException e) {
            assertTrue(true); // Exception was thrown as expected
        }
    }

    // Helper class to instantiate the abstract Chromosome, as it's required by ListPopulation.
    // This is a concrete implementation to satisfy the abstract class requirement.
    private static class DummyChromosomeForTest extends Chromosome {
        private final double fitness;
        private final int representation;

        public DummyChromosomeForTest(double fitness, int representation) {
            this.fitness = fitness;
            this.representation = representation;
        }

        @Override
        public double getFitness() {
            return fitness;
        }

        @Override
        protected boolean isSame(Chromosome another) {
            if (another instanceof DummyChromosomeForTest) {
                return this.representation == ((DummyChromosomeForTest) another).representation;
            }
            return false;
        }

        @Override
        protected Chromosome findSameChromosome(Population population) {
            for (Chromosome c : population.getChromosomes()) { // population.getChromosomes() is accessible
                if (c.isSame(this)) {
                    return c;
                }
            }
            return null;
        }

        @Override
        public void searchForFitnessUpdate(Population population) {
            Chromosome found = findSameChromosome(population);
            if (found != null) {
                // Calling setFitness from the superclass if it were abstract and implemented by this.
                // However, Chromosome is abstract and setFitness is not provided in the outline.
                // Assuming a concrete implementation would handle fitness updates or this method is not critical for ListPopulation tests.
                // For now, we won't call setFitness directly as it's not visible/defined.
            }
        }

        @Override
        public int compareTo(Chromosome another) {
            if (another instanceof DummyChromosomeForTest) {
                return Double.compare(this.fitness, ((DummyChromosomeForTest) another).fitness);
            }
            return 0; // Or throw an exception, depending on desired behavior for different Chromosome types.
        }

        // Implementing abstract methods from Chromosome interface/class
        @Override
        public void setFitness(double fitness) {
            // Dummy implementation, not critical for testing ListPopulation itself.
        }

        @Override
        public String toString() {
            return "Fitness: " + fitness + ", Representation: " + representation;
        }
    }
}
