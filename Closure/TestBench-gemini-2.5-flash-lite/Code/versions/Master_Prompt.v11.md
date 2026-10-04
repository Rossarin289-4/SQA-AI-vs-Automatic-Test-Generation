You are generating Java unit tests for one Defects4J bug. Use only the
information in this request. The same template and buggy source are supplied
to every selected AI model so their results can be compared fairly.

EXPERIMENT CONTEXT
The project, bug, target class and target method of this request are given in
the section THIS REQUEST at the end, just before the source.
Testing framework: JUnit 4.12 (unless THIS REQUEST names another framework)
Testing objective: cover distinct branches and relevant boundaries of the
target method, and create independent tests that could reveal the reported
defect. The application, not the AI, will compile and run the unchanged suite
on buggy and fixed versions and measure coverage, generation time, and fault
detection. Do not invent those results.

INPUT RULES
- The source below is from the buggy version only. A bug report description,
  fixed implementation, and original Defects4J triggering test are absent
  unless explicitly supplied in this request.
- After the source there may be an API OUTLINE: the declarations (constructors,
  methods, fields) and one-line summaries of other project classes that the
  source uses, also from the buggy version. Use it to create and configure
  those objects correctly (for example which constructor to call, what a method
  is documented to do or to throw). It has no method bodies: do not assume any
  behaviour it does not state, and do not call a method whose documented
  behaviour you do not understand.
- If the class under test is abstract or an interface, the source may be
  followed by a list of CONCRETE SUBCLASSES from the project. Test it through
  one of them (import it and call its constructor as listed). Do not declare
  your own subclass: you cannot see every abstract method it would have to
  implement, so it would not compile.
- If the target class or method is NOT_SPECIFIED, say so. Identify candidate
  public methods visible in the supplied buggy source and label the resulting
  tests exploratory. Do not pretend to know the exact defect method.
- If a target method is supplied, test that method through the class's API.
  Do not spread the suite across unrelated methods merely to raise coverage.
- Your test class is declared in the same package as the class under test, so
  it may use package-private and protected constructors, factory methods and
  members that the supplied source shows. When the class has no public
  constructor, use such a constructor or a static factory shown in the source
  to create the object. Never return a test class without test methods: if you
  are unsure how to build an object, test a different method that you can
  reach.
- Do not modify production code, add dependencies, use reflection, invent
  APIs, or reproduce an unknown original triggering test.

TEST DESIGN
- The supplied source is the BUGGY version: it contains a real defect. A test
  whose expected value is copied from what this code does will pass on the
  buggy version and can never reveal the defect.
- Analyze the target method's inputs, outputs, branches, exceptions, and
  boundary values before choosing tests. Look for places where the code does
  not do what its Javadoc, its name, its parameters or the usual contract of
  such a method say it should (off-by-one, missing case, wrong null or
  boundary handling, wrong exception). Those are the likely defect.
- Select at most 8 independent @Test methods spanning distinct normal, edge,
  invalid, exception, and defect-oriented behaviors where applicable. Omit a
  category when the API makes it irrelevant. Finish the Java class before
  writing any explanation.
- Cover different paths rather than repeated values from the same path.
  Every input literal must have at most 24 characters and no more than 6
  identical characters in a row. Use scientific notation for very large or
  small numbers. Never expand a long sequence of zeros or other characters.
- Expected values must be the INTENDED (correct) behaviour: take them from the
  Javadoc and comments, the method and parameter names, the documented
  contract, and the obvious meaning of the operation. Use the code to
  understand how to call it and what it is meant to do, not as the source of
  truth. Where the code and the documented intent disagree, assert the
  documented intent: that test is defect-oriented.
- If neither the documentation nor the obvious meaning of the operation fixes
  the expected value for an input, do not assert it: choose another input.
- Do not assert the runtime class of a returned value (instanceof, getClass(),
  assertEquals(SomeType.class, ...)) unless the supplied source shows that
  exact type is returned for that input. When the declared return type is a
  supertype (for example Number or Object), compare values instead, with a
  tolerance for floating point. Do not assert exception-message wording unless
  the supplied contract does.
- Prefer fewer tests you are sure of to more tests you are unsure of. Avoid
  inputs whose intended handling (overflow, hex or other parsing edge cases)
  is not clear from the documentation or the obvious meaning of the method.
- Floating point: never compare a float or double result with exact equality.
  A float result widened to double is not equal to the decimal literal (for
  example 3.14f as a double is 3.1400001...). When the result may be a float,
  a double or a BigDecimal, compare doubleValue() with a tolerance suited to
  float precision and keep decimal literals short. Scale the tolerance with the
  expected value, for example delta = Math.max(1e-4, Math.abs(expected) * 1e-5):
  a float keeps only about 7 significant digits, so a fixed tiny delta fails for
  large magnitudes (1.5E10 may come back as 1.50000005E10).
- Conversion and parsing methods: only use an input if the documented contract
  (or the obvious meaning of the method) says whether it returns a value or
  throws. Use values at or beyond the boundary of a numeric type (such as a hex
  literal with the top bit set, or digit strings near a type's limit) only when
  the documentation says what must happen, including the exception type.
- The class must compile on its own. Its first line must be the package
  declaration of the class under test: the same `package ...;` line that is at
  the top of the supplied source. Then import every other class you use,
  including every project class and every JDK class (java.util.List,
  java.util.ArrayList, ...). Do not use a class that is neither in the supplied
  source, nor imported, nor in java.lang.
- Before finishing the code block, list every class name your test uses and
  check that each one is imported, in the same package, or in java.lang. A
  missing import makes the whole suite unusable.
- Verify that each assertion, package, import, constructor, and public method
  follows from the supplied source or the API outline. If information is insufficient, state
  the limit instead of guessing an oracle.

OUTPUT CONTRACT
Start the response immediately with one fenced java block containing a
complete, directly usable JUnit 4.12 test class. Put the package line, all
imports, and the @Test methods in that block. Do not place a table or explanation before
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

THIS REQUEST
Defects4J project: {{PROJECT_ID}}
Bug ID: {{BUG_ID}}
Bug report ID (identifier only): {{BUG_REPORT_ID}}
Target class: {{TARGET_CLASS}}
Target public method: {{TARGET_METHOD}}
{{FRAMEWORK_NOTE}}

BUGGY SOURCE CODE
{{BUGGY_SOURCE}}

END OF INPUT. Reply now, following the OUTPUT CONTRACT above: start with one
fenced java block that holds the complete test class (package line first, then
all imports, at most 8 tests), close it, then give sections 1, 2, 4, 5 and 6.
No text before the code block.
