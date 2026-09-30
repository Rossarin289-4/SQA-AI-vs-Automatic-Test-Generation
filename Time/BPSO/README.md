# BPSO Testing Results - Joda-Time

## Experimental Scope

- Project: Joda-Time
- Defects4J bugs: 26
- Bugs tested: Time-1 to Time-20 and Time-22 to Time-27
- BPSO suite size: 3 test cases per bug
- Rounds: 2
- Test cases executed per round: 78
- Execution errors: 0

## Round 1

- Bugs tested: 26/26
- Bugs detected: 10/26
- Fault Detection Rate: 38.46%
- Detected bugs:
  - Time-3
  - Time-6
  - Time-8
  - Time-9
  - Time-12
  - Time-13
  - Time-15
  - Time-16
  - Time-26
  - Time-27

## Round 2

- Bugs tested: 26/26
- Bugs detected: 8/26
- Fault Detection Rate: 30.77%
- Detected bugs:
  - Time-3
  - Time-6
  - Time-12
  - Time-13
  - Time-15
  - Time-16
  - Time-26
  - Time-27

## Notes

BPSO performs test-case selection from the prepared candidate pool.
The selected tests are then executed against the buggy and fixed versions
of each Defects4J bug to evaluate fault detection and coverage.
