# TestBench inside the team repository

This folder is a copy of the TestBench application (group 10, CP353201 1/2569). It is self-contained:
build and run it with Docker (`docker compose up -d`) or `mvn spring-boot:run` next to a Defects4J 3.0.1
installation, see README.md and docs/ARCHITECTURE.md.

To refresh the per-project folders and `master_results.csv` of this repository from TestBench results:

    python3 testbench/scripts/export_team_layout.py --output <path to TestBench output/ai-runs> --dest <repository root>

Only folders of TestBench methods (SA, BPSO, and the configured AI names) and TestBench rows of
`master_results.csv` are written; nothing else in the repository is changed.
