package org.evosuite.ga.metaheuristics;

import java.util.ArrayList;
import java.util.List;

import org.evosuite.Properties;
import org.evosuite.ga.ChromosomeFactory;
import org.evosuite.testsuite.TestSuiteChromosome;
import org.evosuite.utils.LoggingUtils;
import org.evosuite.utils.Randomness;

/**
 * Simulated Annealing for EvoSuite test-suite generation.
 *
 * <p>The chromosome is an EvoSuite {@link TestSuiteChromosome}; therefore a
 * mutation creates constructor calls, method calls and input values, rather
 * than selecting a pre-written JUnit test. Every candidate is evaluated by
 * EvoSuite's configured coverage fitness before Metropolis acceptance.</p>
 */
public final class SimulatedAnnealingAlgorithm extends GeneticAlgorithm<TestSuiteChromosome> {

    private static final long serialVersionUID = 1L;
    private static final double INITIAL_TEMPERATURE = 10.0;
    private static final double MIN_TEMPERATURE = 0.01;

    public SimulatedAnnealingAlgorithm(ChromosomeFactory<TestSuiteChromosome> factory) {
        super(factory);
    }

    @Override
    public void initializePopulation() {
        notifySearchStarted();
        currentIteration = 0;
        generateInitialPopulation(Properties.POPULATION);
        calculateFitnessAndSortPopulation();
        notifyIteration();
    }

    @Override
    protected void evolve() {
        double temperature = temperature();
        List<TestSuiteChromosome> next = new ArrayList<TestSuiteChromosome>(population.size());

        for (TestSuiteChromosome current : population) {
            if (isFinished()) {
                next.add(current.clone());
                continue;
            }

            TestSuiteChromosome candidate = current.clone();
            candidate.mutate();
            notifyMutation(candidate);

            if (isTooLong(candidate)) {
                next.add(current.clone());
                continue;
            }

            calculateFitness(candidate);
            if (accept(current, candidate, temperature)) {
                next.add(candidate);
            } else {
                next.add(current.clone());
            }
        }

        population = next;
        sortPopulation();
        currentIteration++;
    }

    @Override
    public void generateSolution() {
        if (Properties.ENABLE_SECONDARY_OBJECTIVE_AFTER > 0
                || Properties.ENABLE_SECONDARY_OBJECTIVE_STARVATION) {
            disableFirstSecondaryCriterion();
        }
        if (population.isEmpty()) {
            initializePopulation();
        }

        int unchangedIterations = 0;
        double lastBest = getBestIndividual().getFitness();

        while (!isFinished()) {
            evolve();
            applyLocalSearch();
            sortPopulation();

            double best = getBestIndividual().getFitness();
            if (Double.compare(best, lastBest) == 0) {
                unchangedIterations++;
            } else {
                unchangedIterations = 0;
                lastBest = best;
            }
            updateSecondaryCriterion(unchangedIterations);
            notifyIteration();

            if (currentIteration <= 5 || currentIteration % 20 == 0) {
                LoggingUtils.getEvoLogger().info("SA iteration=" + currentIteration
                        + " bestFitness=" + best + " population=" + population.size()
                        + " temperature=" + temperature());
            }
        }

        updateBestIndividualFromArchive();
        notifySearchFinished();
    }

    private boolean accept(TestSuiteChromosome current, TestSuiteChromosome candidate,
            double temperature) {
        if (isBetterOrEqual(candidate, current)) {
            return true;
        }
        double difference = isMaximizationFunction()
                ? candidate.getFitness() - current.getFitness()
                : current.getFitness() - candidate.getFitness();
        return Randomness.nextDouble() < Math.exp(difference / temperature);
    }

    private double temperature() {
        double horizon = Math.max(1.0, Properties.SEARCH_BUDGET);
        double progress = Math.min(1.0, ((double) currentIteration) / horizon);
        return Math.max(MIN_TEMPERATURE, INITIAL_TEMPERATURE * (1.0 - progress));
    }
}
