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
    @Test
    public void testEmptyPopulationLimit() throws Exception {
        ElitisticListPopulation p = new ElitisticListPopulation(1, 0.5);
        assertEquals(1, p.getPopulationLimit());
        assertEquals(0, p.getPopulationSize());
    }

    @Test
    public void testConstructorRejectsZeroLimit() throws Exception {
        try {
            new ElitisticListPopulation(0, 0.5);
            fail("expected NotPositiveException");
        } catch (NotPositiveException expected) { }
    }

    @Test
    public void testSetLimitRejectsNegative() throws Exception {
        ElitisticListPopulation p = new ElitisticListPopulation(1, 0.5);
        try {
            p.setPopulationLimit(-1);
            fail("expected NotPositiveException");
        } catch (NotPositiveException expected) { }
        assertEquals(1, p.getPopulationLimit());
    }

    @Test
    public void testSetLimitAcceptsCurrentSize() throws Exception {
        List<Chromosome> chromosomes = new ArrayList<Chromosome>();
        chromosomes.add(null);
        ElitisticListPopulation p = new ElitisticListPopulation(chromosomes, 2, 0.5);
        p.setPopulationLimit(1);
        assertEquals(1, p.getPopulationLimit());
    }

    @Test
    public void testSetLimitRejectsBelowCurrentSize() throws Exception {
        List<Chromosome> chromosomes = new ArrayList<Chromosome>();
        chromosomes.add(null);
        chromosomes.add(null);
        ElitisticListPopulation p = new ElitisticListPopulation(chromosomes, 2, 0.5);
        try {
            p.setPopulationLimit(1);
            fail("expected NumberIsTooSmallException");
        } catch (NumberIsTooSmallException expected) { }
        assertEquals(2, p.getPopulationLimit());
    }

    @Test
    public void testAddChromosomeUntilLimit() throws Exception {
        ElitisticListPopulation p = new ElitisticListPopulation(1, 0.5);
        p.addChromosome(null);
        assertEquals(1, p.getPopulationSize());
        assertEquals(Collections.<Chromosome>singletonList(null), p.getChromosomes());
    }

    @Test
    public void testAddChromosomeAtLimitThrows() throws Exception {
        List<Chromosome> chromosomes = new ArrayList<Chromosome>();
        chromosomes.add(null);
        ElitisticListPopulation p = new ElitisticListPopulation(chromosomes, 1, 0.5);
        try {
            p.addChromosome(null);
            fail("expected NumberIsTooLargeException");
        } catch (NumberIsTooLargeException expected) { }
        assertEquals(1, p.getPopulationSize());
    }

    @Test
    public void testAddChromosomesFitsExactly() throws Exception {
        ElitisticListPopulation p = new ElitisticListPopulation(2, 0.5);
        Collection<Chromosome> additions = new ArrayList<Chromosome>();
        additions.add(null);
        additions.add(null);
        p.addChromosomes(additions);
        assertEquals(2, p.getPopulationSize());
        assertEquals(additions, p.getChromosomes());
    }

    @Test
    public void testAddChromosomesOverLimitIsAtomic() throws Exception {
        ElitisticListPopulation p = new ElitisticListPopulation(1, 0.5);
        Collection<Chromosome> additions = new ArrayList<Chromosome>();
        additions.add(null);
        additions.add(null);
        try {
            p.addChromosomes(additions);
            fail("expected NumberIsTooLargeException");
        } catch (NumberIsTooLargeException expected) { }
        assertEquals(0, p.getPopulationSize());
    }

    @Test
    public void testSetChromosomesReplacesContents() throws Exception {
        List<Chromosome> initial = new ArrayList<Chromosome>();
        initial.add(null);
        ElitisticListPopulation p = new ElitisticListPopulation(initial, 2, 0.5);
        List<Chromosome> replacement = new ArrayList<Chromosome>();
        replacement.add(null);
        replacement.add(null);
        p.setChromosomes(replacement);
        assertEquals(2, p.getPopulationSize());
        assertEquals(replacement, p.getChromosomes());
    }

    @Test
    public void testSetChromosomesRejectsTooMany() throws Exception {
        ElitisticListPopulation p = new ElitisticListPopulation(1, 0.5);
        List<Chromosome> replacement = new ArrayList<Chromosome>();
        replacement.add(null);
        replacement.add(null);
        try {
            p.setChromosomes(replacement);
            fail("expected NumberIsTooLargeException");
        } catch (NumberIsTooLargeException expected) { }
        assertEquals(0, p.getPopulationSize());
    }

    @Test
    public void testGetChromosomesIsUnmodifiable() throws Exception {
        ElitisticListPopulation p = new ElitisticListPopulation(1, 0.5);
        try {
            p.getChromosomes().add(null);
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) { }
        assertEquals(0, p.getPopulationSize());
    }

    @Test
    public void testIteratorTraversesChromosomes() throws Exception {
        List<Chromosome> chromosomes = new ArrayList<Chromosome>();
        chromosomes.add(null);
        chromosomes.add(null);
        ElitisticListPopulation p = new ElitisticListPopulation(chromosomes, 2, 0.5);
        Iterator<Chromosome> iterator = p.iterator();
        assertTrue(iterator.hasNext());
        assertNull(iterator.next());
        assertTrue(iterator.hasNext());
        assertNull(iterator.next());
        assertFalse(iterator.hasNext());
    }

    @Test
    public void testIteratorRemoveIsUnsupported() throws Exception {
        List<Chromosome> chromosomes = new ArrayList<Chromosome>();
        chromosomes.add(null);
        ElitisticListPopulation p = new ElitisticListPopulation(chromosomes, 1, 0.5);
        Iterator<Chromosome> iterator = p.iterator();
        iterator.next();
        try {
            iterator.remove();
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) { }
        assertEquals(1, p.getPopulationSize());
    }

    @Test
    public void testToStringReflectsContents() throws Exception {
        ElitisticListPopulation p = new ElitisticListPopulation(1, 0.5);
        assertEquals("[]", p.toString());
        p.addChromosome(null);
        assertEquals("[null]", p.toString());
    }

    @Test
    public void testFittestChromosomeFromSingleEntry() throws Exception {
        List<Chromosome> chromosomes = new ArrayList<Chromosome>();
        ElitisticListPopulation p = new ElitisticListPopulation(chromosomes, 1, 0.5);
        try {
            p.getFittestChromosome();
            fail("expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException expected) { }
    }

    @Test
    public void testSetChromosomesNullRejected() throws Exception {
        ElitisticListPopulation p = new ElitisticListPopulation(1, 0.5);
        try {
            p.setChromosomes(null);
            fail("expected NullArgumentException");
        } catch (NullArgumentException expected) { }
        assertEquals(0, p.getPopulationSize());
    }
}
