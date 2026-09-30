#!/bin/zsh

export PROJECT_ROOT="$HOME/Documents/SQA_Project_2026"

export DEFECTS4J_HOME="$HOME/Documents/SQA_Project/defects4j"
export PATH="$DEFECTS4J_HOME/framework/bin:$PATH"

export BUGGY_WORKSPACE="$PROJECT_ROOT/workspaces/Lang-3-buggy"
export FIXED_WORKSPACE="$PROJECT_ROOT/workspaces/Lang-3-fixed"

export GROUND_TRUTH="$PROJECT_ROOT/projects/Lang/Bug-3"

export MASTER_RESULTS="$PROJECT_ROOT/results/master_results.csv"
export EXPERIMENT_CONFIG="$PROJECT_ROOT/automation/config/experiment.json"

export JAVA_HOME="/opt/homebrew/opt/openjdk@11/libexec/openjdk.jdk/Contents/Home"
export PATH="$JAVA_HOME/bin:$PATH"

export TEST_PACKAGE="org.apache.commons.lang3.math"
export TEST_CLASS="NumberUtilsGeneratedTest"

export MODIFIED_CLASS="org.apache.commons.lang3.math.NumberUtils"
