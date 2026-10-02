# Repository Structure

This repository uses two compatible layers.

## Team-compatible layer

    algorithms/
    ai-tests/
    results/
    projects/

These directories follow the repository organization used by the
team repository.

## Experiment automation layer

    automation/
        datasets/
        scripts/
        runs/
        state/

The automation layer is the canonical source of experiment metadata,
generated artifacts, execution results, checkpoints, and aggregate
results.

## Important rule

Do not delete or move the automation directory when integrating
this repository with the team repository.

The compatibility layer is intentionally separated from the
automation layer so that repository integration does not invalidate
previous experiment results.

## Methods

    ChatGPT
    Gemini
    Simulated Annealing (SA)
    Binary Particle Swarm Optimization (BPSO)

## Dataset

    Apache Commons Lang / Defects4J

The current automation supports multiple Lang defects and is designed
to continue processing remaining defects without rerunning completed
experiments.
