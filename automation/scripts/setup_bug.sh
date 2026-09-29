#!/bin/bash

set -u

PROJECT="${1:-}"
BUG="${2:-}"

if [ -z "$PROJECT" ] || [ -z "$BUG" ]; then
    echo "Usage: $0 <project> <bug>"
    exit 1
fi

ROOT="$HOME/Documents/SQA_Project"

PROJECT_DIR="$ROOT/projects/${PROJECT}-${BUG}"
FIXED_DIR="$ROOT/projects/${PROJECT}-${BUG}-fixed"

export JAVA_HOME="/opt/homebrew/opt/openjdk@11/libexec/openjdk.jdk/Contents/Home"

export PATH="/opt/homebrew/bin:/opt/homebrew/sbin:/opt/homebrew/opt/openjdk@11/bin:$PATH"

export PERL5LIB="$HOME/perl5/lib/perl5:$PERL5LIB"

echo "============================================================"
echo "Defects4J Setup"
echo "Project : $PROJECT"
echo "Bug     : $BUG"
echo "============================================================"
echo ""

echo "[1/5] Checking Defects4J..."

if ! command -v defects4j >/dev/null 2>&1; then
    echo "ERROR: defects4j command not found."
    exit 1
fi

echo "Defects4J : command found"
echo "Path      : $(command -v defects4j)"

echo ""

echo "[2/5] Checking bug information..."

defects4j info -p "$PROJECT" -b "$BUG"

echo ""

echo "[3/5] Checking buggy checkout..."

if [ ! -d "$PROJECT_DIR" ]; then

    defects4j checkout \
        -p "$PROJECT" \
        -v "${BUG}b" \
        -w "$PROJECT_DIR"

else

    echo "Buggy workspace already exists: $PROJECT_DIR"

fi

echo ""

echo "[4/5] Checking fixed checkout..."

if [ ! -d "$FIXED_DIR" ]; then

    defects4j checkout \
        -p "$PROJECT" \
        -v "${BUG}f" \
        -w "$FIXED_DIR"

else

    echo "Fixed workspace already exists: $FIXED_DIR"

fi

echo ""

echo "[5/5] Compiling buggy and fixed versions..."

cd "$PROJECT_DIR" || exit 1

defects4j compile

if [ $? -ne 0 ]; then
    echo "ERROR: Buggy version failed to compile."
    exit 1
fi

cd "$FIXED_DIR" || exit 1

defects4j compile

if [ $? -ne 0 ]; then
    echo "ERROR: Fixed version failed to compile."
    exit 1
fi

echo ""

echo "============================================================"
echo "SETUP COMPLETE"
echo "Buggy : $PROJECT_DIR"
echo "Fixed : $FIXED_DIR"
echo "============================================================"