You write JUnit tests for one Java class of the Defects4J dataset. Use only the
information in this message. Do not use anything you remember about this
project's bugs, patches or tests, even if you recognize the project.

TASK
The REFERENCE SOURCE CODE below is the correct version of the class under test.
Write one JUnit test class whose tests PASS on this version and check its
behavior precisely enough that a faulty version of the same class would make at
least one test fail. The experiment system compiles and runs your class
unchanged on the reference version and on a faulty version. You cannot see the
faulty version and you must not claim that a test detects a defect.

A class that does not compile scores zero, and a wrong expected value makes that
test useless. Simple, certain tests are better than ambitious, uncertain ones.

HARD RULES
1. Start the java block with the exact TEST CLASS HEADER given at the end of
   this message (package, imports, class line). You may add `import java...;`
   lines for JDK classes you use. Add no other import: every project class you
   may use is already imported there or is in the same package.
2. Write between 12 and 24 test methods, each exactly in the form shown in the comment
   inside the header. Always write `throws Exception`.
3. Call only constructors and methods whose declaration you can see in the
   REFERENCE SOURCE CODE, the CONCRETE SUBCLASSES list or the API OUTLINE, plus
   the JDK. Check the parameter types, the return type and the visibility of
   every call against that declaration. If you cannot see a declaration, do not
   use it.
4. Do not write helper classes, anonymous classes, mocks, or your own
   implementations or subclasses of project types. Do not use reflection. Do not
   access private members, or protected members of classes in other packages.
5. If the class under test is abstract or an interface, create one of the
   listed CONCRETE SUBCLASSES with a constructor shown there.
6. If an object is hard to build, test something simpler: static methods, the
   simplest constructor, a getter after a setter. Never answer that the task is
   impossible and never return a class without test methods.
7. Expected values: work each one out from the reference source for the exact
   input, step by step. If you are not certain of the exact value, assert
   something you are certain of (null or not null, true or false, a size, the
   equality of two calls, the exception type). Compare float and double values
   with a delta, for example assertEquals(1.5, x, 1e-9). Do not assert the
   runtime class of a result unless the source fixes it for that input.
8. Expect an exception only where the source clearly throws it for that input,
   and write it like this:
       try { call(); fail("expected IllegalArgumentException"); }
       catch (IllegalArgumentException expected) { }
9. Tests are independent of each other and of execution order. Do not use files,
   the network, threads, the current time, random numbers, or the default time
   zone or locale.
10. Keep every string and number literal short (at most 24 characters).

WHAT TO TEST, in this order
- The target method if one is given below. Otherwise rank the public methods
  of the class under test by how much branching logic they contain (parsing,
  conversion, formatting, searching, lookups with null/empty cases, arithmetic
  with several cases, anything that builds or filters a collection) and cover
  the top four to six of them: three or more tests on each of the two most
  complex, at least one on each of the others. A defect can sit in any of
  them, so do not spend the whole budget on one method, and do not spend it on
  trivial getters either.
- BOUNDARY VALUES. Defects hide at the edges, not in the middle of a range.
  Before writing tests, list for the chosen method every input FORM the code
  distinguishes (for example: null, empty, blank, a sign, a prefix such as
  "0x" or a leading "0", a suffix letter, a decimal point, an exponent, one
  element vs. several) and every numeric RANGE it checks or converts between
  types. Then test the exact edges: the largest and smallest value that still
  fits the narrower type and the first value that no longer fits (for example
  2147483647 and 2147483648, -2147483648 and -2147483649, the same in hex such
  as "0x7FFFFFFF" and "0x80000000", 9223372036854775807 and one above, written
  as string literals when the method parses text), length exactly at a limit
  and one over, index 0 and the last index, 0 / 1 / -1, the first and last
  element of a collection. Derive the expected result of each edge by tracing
  the reference code: it may return a wider type, a different value, or throw.
- Both sides of every condition, and special cases the code handles
  separately.
- State changes of mutable objects (set then get, add then size or contains).
- One test per edge or branch; do not spend tests on several ordinary values
  that follow the same path. At most three tests on trivial getters.

OUTPUT FORMAT
First, one fenced java block with the complete test class, and no text before
it. After the block, only these short sections with exactly these headings
(section 3 is the code block, placed by the application):
1. SOURCE CODE ANALYSIS - two or three lines: the methods and branches chosen.
2. TEST CASE DESIGN - one line per test: input, expected result, how the
   expected value was derived.
4. DEFECT DETECTION STRATEGY - one or two lines: which reference behavior the
   tests pin.
5. SUMMARY - the number of tests.
6. LIMITATIONS - one or two lines. End with: "Actual defect detection is unknown
   until the unchanged test suite is executed against the reference and the
   defective versions."
Then stop.

THIS REQUEST
Defects4J project: {{PROJECT_ID}}
Bug ID: {{BUG_ID}}
Target class: {{TARGET_CLASS}}
Target public method: {{TARGET_METHOD}}
{{FRAMEWORK_NOTE}}

===== REFERENCE SOURCE CODE =====
{{SOURCE_CODE}}
===== END REFERENCE SOURCE CODE =====

===== CONCRETE SUBCLASSES =====
{{CONCRETE_SUBCLASSES}}
===== END CONCRETE SUBCLASSES =====

===== API OUTLINE =====
{{API_OUTLINE}}
===== END API OUTLINE =====

===== TEST CLASS HEADER (start your java block with exactly these lines) =====
{{TEST_HEADER}}
===== END TEST CLASS HEADER =====

FINAL CHECK before you answer: the header is copied exactly; only `java.` imports
were added; every call matches a declaration you can see; every test method has
the form shown in the header comment; 12 to 24 tests covering four to six
different methods; at least four tests use a value exactly at an edge (the largest
value that fits a type and the first that does not, in every textual form the
method accepts, or the limit of a length/index); the code block comes first.
