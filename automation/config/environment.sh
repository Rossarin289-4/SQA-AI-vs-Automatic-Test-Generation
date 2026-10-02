#!/bin/zsh

# ============================================================
# SQA PROJECT 2026 — EXPERIMENT ENVIRONMENT
# ============================================================

# Project root
export PROJECT_ROOT="${PROJECT_ROOT:-$HOME/Documents/SQA_Project_2026}"

# Defects4J
export DEFECTS4J_HOME="${DEFECTS4J_HOME:-$HOME/Documents/SQA_Project/defects4j}"
export DEFECTS4J_BIN="$DEFECTS4J_HOME/framework/bin"

# Java 11 — required by this Defects4J environment
export JAVA_HOME="${JAVA_HOME:-/opt/homebrew/opt/openjdk@11/libexec/openjdk.jdk/Contents/Home}"

# Put Java 11 and Defects4J first in PATH
export PATH="$JAVA_HOME/bin:$DEFECTS4J_BIN:$PATH"

# Perl module installed in user's local Perl library
PERL_LOCAL="$HOME/perl5/lib/perl5"
case ":${PERL5LIB:-}:" in
    *":$PERL_LOCAL:"*)
        ;;
    *)
        export PERL5LIB="$PERL_LOCAL${PERL5LIB:+:$PERL5LIB}"
        ;;
esac

# Automation directories
export AUTOMATION_ROOT="$PROJECT_ROOT/automation"
export DATASET_ROOT="$AUTOMATION_ROOT/datasets"
export RUN_ROOT="$AUTOMATION_ROOT/runs"
export SCRIPT_ROOT="$AUTOMATION_ROOT/scripts"

# Default experiment seed
export EXPERIMENT_SEED="${EXPERIMENT_SEED:-20260923}"

# Test framework
export TEST_FRAMEWORK="${TEST_FRAMEWORK:-JUnit 4.12}"

# Do not hard-code a particular bug/project here.
# Dataset, bug ID, buggy/fixed workspace, modified class,
# trigger test, and result directory are resolved from metadata.
