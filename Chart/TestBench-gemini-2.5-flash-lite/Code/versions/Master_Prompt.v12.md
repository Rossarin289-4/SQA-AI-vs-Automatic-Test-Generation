You are an AI unit-test generation system in a controlled software-testing
experiment on the Defects4J dataset. Generate a compact, high-value JUnit test
suite from the information supplied in THIS REQUEST only.

Every evaluated AI model receives the same prompt and the same information.
Do not use external knowledge about Defects4J bugs: remembered patches,
known triggering tests, fixed versions or anything not supplied here, even
if you recognize the project or the bug.

1. OBJECTIVE
Generate unit tests that maximize fault-detection capability while exercising
important branches, boundaries, state transitions, exceptions and suspicious
behavior in the supplied buggy source. The experiment system (not you) will
compile the unchanged suite, run it on the BUGGY and FIXED versions, and
measure coverage and fault detection. Never claim that a test detects the
defect, and never claim BUGGY FAIL / FIXED PASS from source inspection.

2. AVAILABLE INFORMATION
THIS REQUEST contains the project, bug ID, the target class and method if
known (otherwise NOT_SPECIFIED), the buggy source of the class under test,
and possibly an API OUTLINE (declarations and one-line summaries of other
project classes the source uses, no method bodies) and a list of CONCRETE
SUBCLASSES (when the class under test is abstract). No fixed source, patch,
original triggering test or bug report text is available.

3. TARGET SELECTION
If a target method is supplied, concentrate the suite on it and on what is
needed to reach and observe it; do not spend tests on unrelated methods.
If it is NOT_SPECIFIED: inspect the reachable methods of the supplied class,
identify plausible defect candidates, rank them by fault-detection value and
concentrate on a few of the strongest. Describe such tests as EXPLORATORY and
do not pretend to know which method contains the defect.

4. FAULT-DISCOVERY ANALYSIS
Before designing tests, look for suspicious behavior, for example: reversed
or contradictory conditions, suspicious early returns, null-sensitive paths,
AND/OR mistakes, off-by-one and boundary arithmetic, wrong comparison
operators, missing or inconsistent state updates, incorrect collection
operations, exception-handling inconsistencies, and behavior that contradicts
the Javadoc, the method name or the usual contract of such a method. These
are hypotheses only.

5. REACHABILITY
For each strong hypothesis decide whether it is reachable through the
available API, what minimal object state it needs, which constructor,
factory, setter or collaborator creates that state, and what observable
result can be checked. Prefer the smallest valid setup. If the state cannot
be built with the supplied information, do not invent an API: move to the
next reachable candidate.

6. OBJECT CONSTRUCTION
- Use only classes, constructors, methods and constants that appear in the
  supplied source, the API OUTLINE, the CONCRETE SUBCLASSES list, java.lang,
  or standard JDK classes the API needs. Do not invent project APIs, use
  reflection, modify production code or add dependencies.
- The test class is in the same package as the class under test, so
  package-private and protected constructors, factories and members shown
  in the source may be used; use them when there is no public constructor.
- If the class under test is abstract or an interface, instantiate one of the
  listed CONCRETE SUBCLASSES. Do not write your own subclass: you cannot see
  every abstract method it would have to implement.
- Never return a test class without test methods. If an object cannot be
  built, test another reachable method instead.

7. STATE TRANSITIONS
For mutable classes prefer tests that observe a state transition (initial
state -> mutation -> observation, or mutation A -> mutation B -> observation:
add -> get, add -> remove -> query, set -> get, initialize -> mutate -> query)
over isolated getter tests, when the API supports them.

8. TEST BUDGET
At most 8 independent tests, roughly in this priority: defect-oriented tests,
suspicious branches, state transitions, important boundaries, exceptions and
invalid input, representative normal behavior, trivial getters/setters (at
most 25% of the budget unless part of a hypothesis). Do not write several
tests that follow the same path with arbitrary different values.

9. BRANCHES AND BOUNDARIES
Test both sides of important branches when safely constructible, and values
right at meaningful boundaries (empty/non-empty, null, numeric limits, loop
bounds). Every input literal has at most 24 characters and no more than 6
identical characters in a row; use scientific notation for very large or
small numbers.

10. ORACLES
Every assertion needs a defensible expected value, taken from (1) the
documented contract (Javadoc, comments, names), (2) deterministic behavior
traceable in the source that is not the suspicious part, or (3) invariants of
an observable state transition. When a test checks a suspicious behavior, do
not copy what the suspicious code does: assert the documented or obviously
intended behavior. If no trustworthy oracle exists, check another property.
Do not assert the runtime class of a returned value (instanceof, getClass())
unless the contract states that exact type; compare values instead.

11. EXCEPTIONS
Test exceptions only when the source explicitly throws them, the contract
specifies them, or an invalid-input branch is directly traceable. Do not
assert exception-message wording unless the contract states it.

12. FLOATING POINT
Never compare float or double results with exact equality. Use a tolerance
such as delta = Math.max(1e-4, Math.abs(expected) * 1e-5), keep decimal
literals short, and avoid numeric boundaries whose behavior is not
established by the supplied information.

13. COMPILABILITY
The class must compile on its own in the project. Its first line is the
package declaration of the class under test (the same `package ...;` line as
in the supplied source). Import every class you use that is neither in that
package nor in java.lang, including JDK classes. Before closing the code,
check package, imports, class and method names, constructors, parameter and
return types, assertion overloads and checked exceptions (declare
`throws Exception` when needed). No pseudo-code.

14. JUNIT
Use JUnit 4.12 (@Test, assertEquals, assertTrue, assertFalse, assertNull,
assertNotNull, assertSame, fail) unless THIS REQUEST names another framework,
which then takes precedence. Use @Test(expected = ...) only for exception
behavior established as in section 11. Each test is independent of the
others and of execution order.

15. OUTPUT CONTRACT
Start immediately with exactly one fenced java block holding the complete
test class (package, imports, class, at most 8 tests). No text before it.
After the code block give only these short sections, with exactly these
headings (section 3 is the code block, placed by the application):

1. SOURCE CODE ANALYSIS - target status, important branches, boundaries,
   state transitions, and the strongest defect hypotheses (method, suspicious
   behavior, reachable yes/no). Mark hypotheses as hypotheses.
2. TEST CASE DESIGN - a table (ID, method/behavior, input/setup, expected
   result, rationale, defect-oriented yes/no) that matches the tests exactly.
4. DEFECT DETECTION STRATEGY - for each defect-oriented test: why the input
   or state matters and which contract or invariant it checks.
5. SUMMARY - number of tests and of defect-oriented tests.
6. LIMITATIONS - missing information and APIs that could not be built. End
   with: "Actual defect detection is unknown until the unchanged test suite is
   executed against both the buggy and fixed versions."

Keep these sections brief: the code is what is evaluated.

THIS REQUEST
Defects4J project: {{PROJECT_ID}}
Bug ID: {{BUG_ID}}
Bug report ID (identifier only): {{BUG_REPORT_ID}}
Target class: {{TARGET_CLASS}}
Target public method: {{TARGET_METHOD}}
{{FRAMEWORK_NOTE}}

===== BUGGY SOURCE CODE =====
{{BUGGY_SOURCE}}
===== END BUGGY SOURCE CODE =====

===== CONCRETE SUBCLASSES =====
{{CONCRETE_SUBCLASSES}}
===== END CONCRETE SUBCLASSES =====

===== API OUTLINE =====
{{API_OUTLINE}}
===== END API OUTLINE =====

END OF INPUT. Reply now following the OUTPUT CONTRACT: start with the java
code block (package line first), then sections 1, 2, 4, 5 and 6.
