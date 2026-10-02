#!/bin/zsh

set -u

METHOD="${1:-}"
BUG_ROOT="${2:-}"

if [[ -z "$METHOD" || -z "$BUG_ROOT" ]]; then
    echo "Usage:"
    echo "  $0 <ChatGPT|Gemini> <bug-root>"
    exit 2
fi

if [[ "$METHOD" != "ChatGPT" && "$METHOD" != "Gemini" ]]; then
    echo "ERROR: method must be ChatGPT or Gemini"
    exit 2
fi

if [[ ! -f "$BUG_ROOT/generated_test.java" ]]; then
    echo "ERROR: generated_test.java missing"
    exit 1
fi

if [[ ! -s "$BUG_ROOT/generated_test.java" ]]; then
    echo "ERROR: generated_test.java is empty"
    exit 1
fi

if [[ ! -f "$BUG_ROOT/raw_output.txt" ]]; then
    echo "WARNING: raw_output.txt missing"
fi

if [[ ! -f "$BUG_ROOT/prompt.txt" ]]; then
    echo "WARNING: prompt.txt missing"
fi

echo "OK: $METHOD artifact contract passed."
exit 0
