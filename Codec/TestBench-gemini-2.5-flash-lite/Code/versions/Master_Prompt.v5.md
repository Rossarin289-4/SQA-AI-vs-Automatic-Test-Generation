You are generating Java unit tests for one Defects4J bug. Use only the
information in this request. The same template and buggy source are supplied
to every selected AI model so their results can be compared fairly.

EXPERIMENT CONTEXT
Defects4J project: {{PROJECT_ID}}
Bug ID: {{BUG_ID}}
Bug report ID (identifier only): {{BUG_REPORT_ID}}
Target class: {{TARGET_CLASS}}
Target public method: {{TARGET_METHOD}}
Testing framework: JUnit 4.12
{{FRAMEWORK_NOTE}}
Testing objective: cover distinct branches and relevant boundaries of the
target method, and create independent tests that could reveal the reported
defect. The application, not the AI, will compile and run the unchanged suite
on buggy and fixed versions and measure coverage, generation time, and fault
detection. Do not invent those results.

INPUT RULES
- The source below is from the buggy version only. A bug report description,
  fixed implementation, and original Defects4J triggering test are absent
  unless explicitly supplied in this request.
- If the target class or method is NOT_SPECIFIED, say so. Identify candidate
  public methods visible in the supplied buggy source and label the resulting
  tests exploratory. Do not pretend to know the exact defect method.
- If a target method is supplied, test that method through its public API.
  Do not spread the suite across unrelated methods merely to raise coverage.
- Do not modify production code, add dependencies, use reflection, invent
  APIs, or reproduce an unknown original triggering test.

TEST DESIGN
- Analyze the target method's inputs, outputs, branches, exceptions, and
  boundary values before choosing tests. Use the supplied source and stated
  contract to justify every expected result.
- Select at most 8 independent @Test methods spanning distinct normal, edge,
  invalid, exception, and defect-oriented behaviors where applicable. Omit a
  category when the API makes it irrelevant. Finish the Java class before
  writing any explanation.
- Cover different paths rather than repeated values from the same path.
  Every input literal must have at most 24 characters and no more than 6
  identical characters in a row. Use scientific notation for very large or
  small numbers. Never expand a long sequence of zeros or other characters.
- Derive every expected value by tracing the supplied source, step by step,
  for that exact input. Write the result of the trace as the expected value.
  If you cannot derive a value with certainty from the supplied source,
  do not assert it: choose a different input instead.
- Do not assert the runtime class of a returned value (instanceof, getClass(),
  assertEquals(SomeType.class, ...)) unless the supplied source shows that
  exact type is returned for that input. When the declared return type is a
  supertype (for example Number or Object), compare values instead, with a
  tolerance for floating point. Do not assert exception-message wording unless
  the supplied contract does.
- Prefer fewer tests you are sure of to more tests you are unsure of. Avoid
  inputs whose handling (overflow, hex or other parsing edge cases) you cannot
  trace in the supplied source.
- Floating point: never compare a float or double result with exact equality.
  A float result widened to double is not equal to the decimal literal (for
  example 3.14f as a double is 3.1400001...). When the result may be a float,
  a double or a BigDecimal, compare doubleValue() with a tolerance suited to
  float precision and keep decimal literals short. Scale the tolerance with the
  expected value, for example delta = Math.max(1e-4, Math.abs(expected) * 1e-5):
  a float keeps only about 7 significant digits, so a fixed tiny delta fails for
  large magnitudes (1.5E10 may come back as 1.50000005E10).
- Conversion and parsing methods: only use an input if you can prove, from the
  supplied source, whether it returns a value or throws. Do not use values at
  or beyond the boundary of a numeric type (such as a hex literal with the top
  bit set, or digit strings near a type's limit) unless the source proves the
  outcome, including the exception type.
- The class must compile on its own: declare the package of the class under
  test (or import it) and import everything that you use.
- Verify that each assertion, package, import, constructor, and public method
  follows from the supplied source. If information is insufficient, state
  the limit instead of guessing an oracle.

OUTPUT CONTRACT
Start the response immediately with one fenced java block containing a
complete, directly usable JUnit 4.12 test class. Put all imports, package,
and @Test methods in that block. Do not place a table or explanation before
the code: the test file must remain complete even if a provider cuts off
later prose. Close the Java class and the code fence after at most 8 tests.

After the code block, provide only these concise sections. The application
will place the code block into section 3 of its saved report:

1. SOURCE CODE ANALYSIS - inputs, outputs, important branches, boundaries,
   exceptions, relevant paths, and plausible defect-related behavior.
2. TEST CASE DESIGN - table with ID, input, expected result, rationale,
   targeted branch/behavior, and whether defect-oriented. Match the @Test
   methods exactly; do not list tests that are absent from the code.
4. DEFECT DETECTION STRATEGY - for each defect-oriented test, explain why its
   input matters, what it checks, why buggy code may fail, and what correct
   behavior would be. These are hypotheses, not execution results.
5. SUMMARY - number of generated @Test methods and covered behaviors.
6. LIMITATIONS - missing inputs and unverified assumptions. Explicitly say
   that detection is unknown until the unchanged test runs on both versions.

Keep the analysis and table concise. Never claim BUGGY FAIL / FIXED PASS from
source inspection or model reasoning. A particular test detects the defect
only if that same test actually fails on buggy and passes on fixed.

BUGGY SOURCE CODE
{{BUGGY_SOURCE}}
