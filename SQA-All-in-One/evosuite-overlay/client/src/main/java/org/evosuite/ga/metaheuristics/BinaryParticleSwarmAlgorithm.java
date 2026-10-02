package org.evosuite.ga.metaheuristics;

import java.util.ArrayList;
import java.util.List;

import org.evosuite.Properties;
import org.evosuite.ga.ChromosomeFactory;
import org.evosuite.testsuite.TestSuiteChromosome;
import org.evosuite.utils.LoggingUtils;
import org.evosuite.utils.Randomness;

/**
 * Discrete Binary Particle Swarm Optimization for EvoSuite test generation.
 *
 * <p>A particle contains a real EvoSuite test suite plus an eight-bit control
 * position. BPSO updates this binary position with the standard sigmoid of
 * velocity. The bits choose whether construction starts from a new suite, the
 * particle's current suite, its personal best, or the swarm global best, and
 * how many fresh EvoSuite mutations are applied. Thus the output is new JUnit
 * code generated from the target class, not a selection from an external test
 * case pool.</p>
 */
public final class BinaryParticleSwarmAlgorithm extends GeneticAlgorithm<TestSuiteChromosome> {

    private static final long serialVersionUID = 1L;
    private static final int DIMENSIONS = 8;
    private static final double INERTIA = 0.72;
    private static final double COGNITIVE = 1.49;
    private static final double SOCIAL = 1.49;

    private final List<Particle> swarm = new ArrayList<Particle>();
    private TestSuiteChromosome globalBest;
    private int[] globalBestBits;

    public BinaryParticleSwarmAlgorithm(ChromosomeFactory<TestSuiteChromosome> factory) {
        super(factory);
    }

    @Override
    public void initializePopulation() {
        notifySearchStarted();
        currentIteration = 0;
        generateInitialPopulation(Properties.POPULATION);
        calculateFitnessAndSortPopulation();

        swarm.clear();
        for (TestSuiteChromosome suite : population) {
            swarm.add(new Particle(suite.clone()));
        }
        globalBest = population.get(0).clone();
        globalBestBits = swarm.get(0).personalBestBits.clone();
        notifyIteration();
    }

    @Override
    protected void evolve() {
        List<TestSuiteChromosome> nextPopulation = new ArrayList<TestSuiteChromosome>(swarm.size());

        for (Particle particle : swarm) {
            updateBinaryPosition(particle);
            TestSuiteChromosome candidate = buildCandidate(particle);

            if (isTooLong(candidate)) {
                candidate = particle.current.clone();
            } else {
                calculateFitness(candidate);
            }

            particle.current = candidate;
            if (isBetterOrEqual(candidate, particle.personalBest)) {
                particle.personalBest = candidate.clone();
                particle.personalBestBits = particle.position.clone();
            }
            if (isBetterOrEqual(candidate, globalBest)) {
                globalBest = candidate.clone();
                globalBestBits = particle.position.clone();
            }
            nextPopulation.add(candidate);
        }

        population = nextPopulation;
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
                LoggingUtils.getEvoLogger().info("BPSO iteration=" + currentIteration
                        + " bestFitness=" + best + " population=" + swarm.size()
                        + " inertia=" + INERTIA);
            }
        }

        updateBestIndividualFromArchive();
        notifySearchFinished();
    }

    private void updateBinaryPosition(Particle particle) {
        for (int bit = 0; bit < DIMENSIONS; bit++) {
            double r1 = Randomness.nextDouble();
            double r2 = Randomness.nextDouble();
            particle.velocity[bit] = INERTIA * particle.velocity[bit]
                    + COGNITIVE * r1 * (particle.personalBestBits[bit] - particle.position[bit])
                    + SOCIAL * r2 * (globalBestBits[bit] - particle.position[bit]);
            double probability = 1.0 / (1.0 + Math.exp(-particle.velocity[bit]));
            particle.position[bit] = Randomness.nextDouble() < probability ? 1 : 0;
        }
    }

    private TestSuiteChromosome buildCandidate(Particle particle) {
        TestSuiteChromosome base;
        if (particle.position[0] == 1) {
            base = globalBest.clone();
        } else if (particle.position[1] == 1) {
            base = particle.personalBest.clone();
        } else if (particle.position[2] == 1) {
            base = chromosomeFactory.getChromosome();
        } else {
            base = particle.current.clone();
        }

        int mutations = 1;
        for (int bit = 3; bit < DIMENSIONS; bit++) {
            if (particle.position[bit] == 1) {
                mutations++;
            }
        }
        for (int index = 0; index < mutations; index++) {
            base.mutate();
            notifyMutation(base);
        }
        return base;
    }

    private static final class Particle {
        private TestSuiteChromosome current;
        private TestSuiteChromosome personalBest;
        private final int[] position = new int[DIMENSIONS];
        private int[] personalBestBits = new int[DIMENSIONS];
        private final double[] velocity = new double[DIMENSIONS];

        private Particle(TestSuiteChromosome initial) {
            current = initial;
            personalBest = initial.clone();
            for (int bit = 0; bit < DIMENSIONS; bit++) {
                position[bit] = Randomness.nextBoolean() ? 1 : 0;
                personalBestBits[bit] = position[bit];
                velocity[bit] = Randomness.nextDouble() - 0.5;
            }
        }
    }
}
