The exact changed mapping from the Time-23 diff is:

IST -> Asia/Calcutta

The buggy version maps:
"IST" -> "Asia/Kolkata"

The fixed version maps:
"IST" -> "Asia/Calcutta"

Generate the test using the exact legacy ID "IST".

IMPORTANT:
- Call DateTimeZone.forID("IST") directly.
- Do NOT use java.util.TimeZone.
- Do NOT use TimeZone.getTimeZone(...).
- Do NOT use DateTimeZone.forTimeZone(...).
- Assert the resulting DateTimeZone ID.
- The expected result on Time-23b must be "Asia/Kolkata".
- The expected result on Time-23f must be "Asia/Calcutta".

You are helping with an SQA experiment using Defects4J.

Project: Joda-Time (Time)
Bug: Time-23
Buggy version: Time-23b
Fixed version: Time-23f

Generate ONE JUnit 4 test case intended to detect the behavioral change in:

src/main/java/org/joda/time/DateTimeZone.java

Production-code change:

Time-23 changes the legacy time-zone ID mappings in DateTimeZone.

The affected code maps old/legacy time-zone IDs to replacement IDs before resolving the zone.

The test must directly exercise this legacy-ID mapping behavior and observe the resulting DateTimeZone.

Requirements:

1. Generate ONE complete JUnit 4 test class.
2. Compatible with Joda-Time 2.0 and Defects4J Time-23.
3. Do not modify production code.
4. Do not use Defects4J trigger tests.
5. Directly target the changed legacy time-zone ID mapping.
6. Use DateTimeZone.forID(...) or another public API that invokes the mapping.
7. Use one legacy time-zone ID affected by the Time-23 diff.
8. Assert the resulting zone ID or another observable property that differs between Time-23b and Time-23f.
9. The test must meaningfully distinguish Time-23b from Time-23f.
10. Use only APIs available in Joda-Time 2.0.
11. Do not use unrelated date/time behavior.
12. Return only ONE complete Java test class with package, imports, and one test method.
13. Do not provide alternative tests.
14. Design the test directly from the production-code diff before execution.
15. Do not adjust the test after seeing execution results.
