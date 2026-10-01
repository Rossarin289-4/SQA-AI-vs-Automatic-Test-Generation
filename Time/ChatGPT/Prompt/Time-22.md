You are helping with an SQA experiment using Defects4J.

Project: Joda-Time (Time)
Bug: Time-22
Buggy version: Time-22b
Fixed version: Time-22f

Generate ONE JUnit 4 test case intended to detect the behavioral change in:

src/main/java/org/joda/time/base/BasePeriod.java

Production-code change:

The old BasePeriod(long duration) constructor manually initialized the period's time fields from the supplied duration.

The new implementation changes the constructor to delegate directly:

this(duration, null, null);

The important behavioral change is therefore how a BasePeriod created from a duration initializes its period type/fields and represents the supplied duration.

Requirements:

1. Generate ONE complete JUnit 4 test class.
2. Compatible with Joda-Time 2.0 and Defects4J Time-22.
3. Do not modify production code.
4. Do not use Defects4J trigger tests.
5. Directly target the BasePeriod(long duration) constructor behavior.
6. Use a public Joda-Time class whose construction exercises BasePeriod(long duration), or an appropriate public API that directly reaches this constructor.
7. Use a non-zero duration containing multiple time units so that field initialization is observable.
8. Include meaningful assertions about the resulting period values and/or period type.
9. The test must meaningfully distinguish Time-22b from Time-22f.
10. Use only APIs available in Joda-Time 2.0.
11. Do not use APIs introduced in later Joda-Time versions.
12. Return only ONE complete Java test class with package, imports, and one test method.
13. Do not provide alternative tests.
14. Design the test directly from the production-code diff before execution and do not adjust it after seeing the test result.
