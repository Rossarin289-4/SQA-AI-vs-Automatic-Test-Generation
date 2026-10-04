# Prompt versions

The AI prompt is two files: `Master_Prompt.md` (task template, placeholders filled per bug) and
`TestGeneration_Skill.md` (system instruction sent with every request). `prompt-version.txt` names the current
version; every run records `promptVersion` and `promptSha256` (hash of the exact template + system text sent) in
`metadata.json`. Earlier versions are kept in `versions/` so a run can be reproduced.

## v1 (2026-09-30)
Original design: fixed template, six-section report, rules against inventing oracles. Observed with the local Qwen
model on Lang-3: suites sometimes assert the concrete class of the result (`instanceof Double`) that the source does not
guarantee, so they fail on both buggy and fixed.

## v2 (2026-10-01) - exploratory
Developed after seeing the v1 Lang-3 results, so results obtained with v2 on Lang-3 are **not** a blind evaluation.
Added general oracle rules (no bug-specific hints, no fixed-version information):
1. derive every expected value by tracing the supplied source for that exact input, otherwise choose another input;
2. do not assert the runtime class of a returned value unless the source shows that exact type;
3. prefer fewer, certain tests; avoid inputs whose handling cannot be traced from the source.

### v2 measured (Lang-3, local Qwen, 5 runs each, same seed-free settings)
v1: 3/5 suites unusable (missing package/import), 2/5 ran but failed on both versions, 0 detections.
v2: 0/5 unusable, but 5/5 failed on both versions; repeated wrong oracles: float result compared with a double literal
(`3.14` vs `3.1400001...`), hex literal at the int boundary, exponent results compared exactly. 0 detections.

## v3 (2026-10-01) - exploratory
Developed after seeing the v2 Lang-3 results (not a blind evaluation). General rules, no bug-specific hints, no
fixed-version information:
1. floating point: tolerance that fits the narrowest possible result type; never exact equality or a widened float vs a
   decimal literal;
2. conversion/parsing methods: only inputs whose value or exception type can be proved from the supplied source; avoid
   numeric-boundary inputs otherwise;
3. the class must compile on its own (package or import of the class under test, every used import).

### v3 measured (Lang-3, local Qwen, 5 runs)
4/5 suites ran but failed on both versions, each with exactly one failing test (`testExponentDouble`: float result
`1.50000005E10` vs expected `1.5E10`, tolerance too small for a large magnitude); 1/5 suites passed on both; 0 detections.

## v4 (2026-10-01) - exploratory
Developed after seeing the v3 Lang-3 results (not a blind evaluation). One general change: the floating-point tolerance
must scale with the expected value (`max(1e-4, |expected| * 1e-5)`), because a float keeps about 7 significant digits.


## v5 (2026-10-01) - project-specific framework note (not a tuning change)
Adds the placeholder `{{FRAMEWORK_NOTE}}` after the "Testing framework" line. It is empty for normal projects, so their
prompt text is unchanged (blank line only). For projects listed in `bench.junit3-projects` (default: Cli) the application
fills it with a rule to write a JUnit 3 `junit.framework.TestCase` class instead: Defects4J gives Cli a `junit-4.12.jar`
without hamcrest, so every JUnit 4 class fails to start there. The search algorithms use the same JUnit 3 style on these
projects, so AI and algorithm suites stay comparable. The skill file only says that a framework named by the task prompt
takes precedence. The previous files are kept as `versions/*.v4.md`. Results of other projects made with v4 and v5 differ
only by this empty placeholder.

## v6 (2026-10-01) - exploratory
Developed after a Cli-1 run in which Gemini (gemini-2.5-flash-lite) wrote a JUnit 3 class that did not compile because it
never imported the class under test (`CommandLine`); the suite could not run on either version (NOT_DETERMINED). So v6 is not
a blind evaluation. One general change, no bug-specific hint and no fixed-version information: the "compile on its own"
rule is now explicit. The first line must be the package declaration of the supplied source, every other class must be
imported, and the model must check its list of used class names before closing the code block. The previous files are kept
as `versions/*.v5.md`.

## v7 (2026-10-01) - exploratory
Developed after a Cli-1 run in which GPT (gpt-6-luna) returned a test class with no test methods because `CommandLine` has
no public constructor and the prompt said "public API"; the same run's other models used the package-private constructor
from the same package. Not a blind evaluation. One general change, no bug-specific hint and no fixed-version information:
the prompt now says the test class lives in the same package as the class under test, so package-private and protected
constructors/factories shown in the supplied source may be used, and an empty test class is not an acceptable answer. The
previous files are kept as `versions/*.v6.md`.

## v8 (2026-10-01) - exploratory: API outline of used classes
Developed after a Cli-1 run in which two models failed on both versions because they guessed how a class they could not see
(`Option`, needed to build a `CommandLine`) behaves (`Option.addValue` threw "Cannot add value, list full."). Not a blind
evaluation. The prompt rules said every constructor/method must follow from the supplied source, but only the modified class
was supplied, so the task could not be done without guessing. v8 supplies more information, the same for every model:
after the source the application appends an API OUTLINE of the project classes the modified source uses (same package and
imported project classes; up to 6 classes, 16,000 characters): declarations of their non-private members and a one-line
summary from their Javadoc, taken from the buggy checkout only, no method bodies, no fixed-version data. The prompt tells the
model how to use it. Cost effect: roughly 2,000-4,000 more input tokens per request. Previous files: `versions/*.v7.md`.

## v9 (2026-10-01) - layout only (prompt caching)
No rule was added, removed or reworded. The lines that change with every bug (project, bug ID, report ID, target class and
method, and the optional framework note) moved from the top of the template to a section THIS REQUEST just before the source,
so that the long constant part (all the rules, about 8,000 characters) forms an identical prefix for every request. Providers'
automatic prompt caching only reuses an identical prefix, and in v1-v8 the per-bug lines at the top broke it after about 300
characters. Expected effect: lower cost and latency (cached input is billed at the cached price); the answer quality may
differ slightly because the instruction order changed, so v9 should be compared with v8 before it is used for the real run. A short constant reminder of the output contract
was added after the source (the end of the prompt), because in a first v9 test the local model began with prose and then
looped; a constant suffix does not affect prefix caching.
Previous files: `versions/*.v8.md`.

## v10 (2026-10-02) - exploratory: concrete subclasses for abstract targets
Developed after a Chart-1 run (target `AbstractCategoryItemRenderer`, an abstract class) in which both cloud models wrote
their own subclass and failed to compile because they could not see the abstract method `drawItem(...)` it inherits from an
interface. Not a blind evaluation. When a modified class is abstract or an interface, the application now lists the concrete
project classes that extend/implement it (two levels, up to 8, constructors of the first 4), from the buggy checkout only, and
the prompt tells the model to test through one of them instead of writing its own subclass. Previous files: `versions/*.v9.md`.

## v11 (2026-10-02) - exploratory: intended behaviour as the oracle
Until v10 the prompt told the model to derive every expected value by tracing the supplied source. That source is the buggy
version, so a model that followed the rule encoded the defect in its assertions and its tests passed on the buggy version
(campaign results with v10: almost every AI suite NOT_DETECTED). v11 says the source contains a defect, and that expected values
must be the intended behaviour, from the Javadoc, comments, names and the usual contract of the operation; where code and
documented intent disagree, the test asserts the intent (defect-oriented). No fixed-version information and no bug-specific
hint is given. Two older rules that also tied inputs to "what you can trace in the source" (fewer-sure-tests and
parsing boundaries) now refer to the documentation/obvious meaning instead. Expected side effect: more suites that fail on both versions (wrong guesses). Previous files: `versions/*.v10.md`.

## Decision (2026-10-02)
v10 is the prompt used for the real run (frozen). v11 was tried on Chart-11..20 (dev set) and was not better (5 vs 6 detections, more compile errors); it stays in `versions/Master_Prompt.v11.md`. The cloud AIs run with thinking off (reasoning effort "none") because Gemini otherwise spent ~7,860 of the 8,192 output tokens on thinking.

## v12 (2026-10-02) - candidate, not active: user-designed structure
Based on a master prompt written by the user (fault-discovery analysis, reachability, state transitions, test-budget
priority, contract/invariant oracles), adapted to the application: placeholders renamed to the supported ones, the API outline
and concrete-subclass list moved to their own sections (`{{API_OUTLINE}}`, `{{CONCRETE_SUBCLASSES}}`), `{{FRAMEWORK_NOTE}}` kept
for Cli, report headings aligned with the report parser (1, 2, 4, 5, 6), and earlier lessons added back (package-private
constructors allowed, no empty test class, no runtime-class assertions). About the same length as v10. To be compared with v10
on the dev set (Chart-11..20) with the same AIs and settings before any decision. Stored as `versions/Master_Prompt.v12.md`;
the active prompt stays v10.

## Sampling change (2026-10-02) - not a prompt change
Runs before this date sent `temperature: 0.2` to every model. From now on no temperature is sent, so each
model runs at its provider's recommended sampling (cloud default, or the local llama.cpp preset, e.g. Gemma 4:
temp 1.0 / top-p 0.95 / top-k 64; Qwen 3.8: temp 0.9 / top-p 0.95 / top-k 20). Reason: at 0.2 Gemma 4 12B
repeated the same class until the 8192-token limit on Chart-1, while the same prompt at the preset values
finished normally. Each new run records this in `metadata.json` (`sampling`); a run without that field used 0.2.

## v13 (2026-10-02) - experiment design change: fixed version as the reference for AI and algorithms
The AI now receives the source of the FIXED version (placeholder `{{SOURCE_CODE}}`, heading "REFERENCE SOURCE CODE")
instead of the buggy one, and the algorithms use the fixed oracle. Both sides therefore generate tests from the same
reference version; the unchanged suites are run on buggy and fixed and a defect is detected when the same test fails on
buggy and passes on fixed (regression-testing setting used by Defects4J test-generation studies). Reason: with the buggy
version as reference the algorithms' expected values come from buggy behaviour, so they can never detect a defect, and
giving only the algorithms the fixed oracle would be unfair to the AI.
- Sections 1-4 and 10 rewritten: the supplied source is correct; pin its behaviour exactly at regression-sensitive points
  (conditions, boundaries, special cases, state updates); expected values are traced from the reference code; a test that
  fails on the reference is worthless.
- The AI never sees the buggy version or a diff, so it cannot locate the defect by comparison.
- System skill v11: the source-version wording is neutral (the Master Prompt says which version is supplied).
- The application refuses a run whose template and oracle disagree ({{SOURCE_CODE}} needs oracle fixed,
  {{BUGGY_SOURCE}} needs oracle buggy). `metadata.json` records `aiSourceVersion`.

## Target hint removed (2026-10-02) - not a prompt change
`prompts/bug-targets.json` held one entry (Lang-3: class NumberUtils, method createNumber, report LANG-693) from the first
tuning rounds. It told the AI the method that contains the defect (and cut the source down to that method), which no other
bug and no algorithm received. The file is now empty: every bug gets `Target class/method: NOT_SPECIFIED` and the full
source of the modified classes. Earlier Lang-3 AI results were produced with the hint and are not comparable.

## v18 (2026-10-04) - active: configured-state rule
Chart-1 with DeepSeek V4.1 Flash (v17): the model called getLegendItems - the right method, from the public-method list -
but on a bare renderer without plot or dataset, asserting the empty result that both versions return. v18 adds rule 12:
the unconfigured (null/empty/default) case is worth at most one test; the main tests must build the full state the method
works on and assert the computed result. Everything else as v17.

## Prompt caching for the follow-up rounds (2026-10-03, application change)
Measured on OpenRouter: a request identical to a previous one is served from cache (GPT-6 Luna 12x cheaper, Gemini 2.5
Flash-Lite 7x), but a request that merely *starts* with the previous prompt is not (OpenAI: full write again at 1.25x the
input price; Gemini: no cache at all when a reasoning effort is sent). With the prompt split into two content blocks and a
`cache_control: {type: ephemeral}` breakpoint on the first, both providers read the cached prefix on every later round.
The application now sends the composed prompt as the first block and the round's addition (previous answer, compiler
errors, failing tests, untested methods) as the second; files and other providers get the same text joined. Expected
effect: the 3-5 requests of one bug pay the source once at full price and at ~25% afterwards.

## v17 (2026-10-03) - active: public-method list in the first request, exact assertions, fewer rounds
- New placeholder `{{PUBLIC_METHODS}}`: the application lists every public method of the reference source (name and
  signature, at most 60) so the first answer already covers them; the untested-methods round now runs only when more than
  three listed methods are still uncalled (one AI request and ~1 minute saved on most bugs).
- Rule: every test asserts at least one exact value traced from the source (assertNotNull alone passes on both versions;
  Chart-5 with gpt-oss-20b reached the changed lines without detecting them).
- Budget 12-30 tests. The source sent to the AI drops a leading license comment and runs of blank lines (10-20% fewer
  input tokens, same information). Follow-up rounds carry a stable prompt cache key so the repeated prefix is charged at
  the cached price where the provider supports it (GPT-6 Luna reported cached_tokens = 0 on every round before this).

## v16 (2026-10-03) - active: registered-instance rule
Chart-1 with gpt-oss-20b (v15): the model wrote the right test for getLegendItems (dataset with two series, a CategoryPlot,
expected two legend items) but called getLegendItems() on a second `new LineAndShapeRenderer()` instead of the renderer it
had put into the plot; the renderer looks itself up with plot.getIndexOf(this), found nothing, and the test failed on the
reference version, so fix_test_suite removed it - one line away from a detection. v16 adds rule 11: an object that is
registered in a container and queries it must be the instance the container holds (take it back with the getter), and the
final check repeats it. Everything else as v15.

## v15 (2026-10-03) - active: wider test budget over several methods
Chart-1 with gpt-oss-20b (v14): the class compiled first time, but all 8 tests went to drawDomainLine/setPlot and the
defect in getLegendItems was never reached (patch lines 0/1) - with one method and 8 tests on a ~60-method class the odds
of touching the faulty method are low, while the search algorithms spread ~300 tests over every public method. v15 keeps
the v14 rules (header, visible declarations only, edge values) and changes the budget: 12-24 tests over the four to six
most branching public methods (three or more on each of the two most complex), at least four edge-value tests. The
header comment no longer states a count and the example method name is testWhatItChecks (gpt-oss copied "testShortName"
literally). Costs about 2-3x the output tokens of v14 (still cents per bug).

## v14 (2026-10-03) - active: compile-first prompt (draft of 2026-10-02) + boundary-value rules
Activated 2026-10-03 after the first full pipeline run with v13 on Lang-1 (Qwen3.6 and GLM-4.7-Flash, local): both classes
compiled (GLM after 2 repair rounds), both reached 6 of the 7 changed lines, neither detected the defect. The tests used
ordinary values of each input form ("0x10", "0xFF", "077") and never the edge of the numeric range where the defect
sits ("0x80000000"). v14 therefore adds an explicit BOUNDARY VALUES rule: enumerate the input forms and numeric ranges the
method distinguishes and test the exact edges (largest value that fits a type and the first that does not, in every
textual form the method parses), one test per edge. Everything else is the 2026-10-02 draft below.
Same day, second revision after Qwen3.6 (v14, Lang-1) ignored the edge rule and spread its 8 tests over toInt/min/
createNumber("0xFF"): the prompt now says to choose ONE method (the most branching one) and spend at least 6 tests on it,
and the FINAL CHECK requires at least three edge-value tests. Result on Lang-1 with this revision: gpt-oss-20b (local, Q4)
compiled first try and detected the defect with createNumber("0x80000000") / ("0x8000000000000000") - the first AI
detection of the project.
Original draft note (2026-10-02): compile-first prompt built from the v13 dev-set failures
Evidence: 34 answers (17 first bugs x Qwen3.6 and GLM-4.7-Flash, v13). 20 did not compile, 3 had no usable class,
7 had one or more tests failing on the reference version, 4 passed, 0 detected. Causes of the 23 unusable answers:
missing JUnit/JDK imports or an undeclared checked exception (10), a project API that does not exist or is not visible
(9: wrong package, wrong signature, protected member, own helper/anonymous implementation), runaway output with no
token limit (2: 69 and 1406 tests), refusal (1), and an application defect (2: `@org.junit.Test` written with its full
name was not recognized as a test - fixed in the application).
- New placeholder `{{TEST_HEADER}}`: the application writes the first lines of the test class (package, JUnit imports,
  an import for every class of the API outline / concrete subclasses and for the imports of the class under test, the
  class line, and the required method form). The model copies it and may add only `java.` imports.
- Rules shortened to ten, each tied to an observed failure (visible declarations only, no helper/anonymous classes, no
  refusal, `throws Exception` always, exceptions via try/fail/catch, certain expected values or weaker assertions).
- Report sections kept but limited to a few lines each; a final check and the header come after the source, where
  small models attend best.
- Same information as v13 (reference source, API outline, concrete subclasses); nothing from the faulty version.
Not measured yet: no AI run was made for v14.

## Untested-methods prompt v1 (2026-10-03) - a second request for the public methods no test calls
New file `prompts/Untested_Methods_Prompt.md`. Right after the first answer, the application lists the public methods
declared in the REFERENCE SOURCE CODE whose name never appears as a call in the test class (static view, at most 40) and
sends the class plus that list back to the same AI once, asking for 8-16 additional tests; the extended class is used when
it has at least as many tests as before, and then goes through compile repair, salvage, the reference-version repair and
the evaluation as usual. Motivation: in three of four Chart-1 runs the AI never called getLegendItems, where the defect
is; the first answer picks methods that look complex, not the ones left untested. Rows record `untestedMethods` and
`extendedTests`; the call's tokens join the repair totals.

## Reference-repair prompt v1 (2026-10-03) - tests that fail on the reference version
New file `prompts/Reference_Repair_Prompt.md`. After the compile-repair rounds (and the salvage step), the compiled class
is run once on the reference version in the compile-check workspace; the tests that fail there (name + first line of the
assertion/exception) are sent back to the same AI with this template, once. The corrected class replaces the previous one
only if it still compiles; tests that still fail on the reference version are then removed by fix_test_suite as before.
Motivation: Chart-1, gpt-oss-20b, v15 - the only test that targeted the defect failed on the reference version because of
a second renderer instance and was silently removed. Nothing from the faulty version is run or shown in this round. Tokens
of this call are added to the repair totals; the run records `referenceFailures` and `referenceRepair` (1 = corrected class
used, 0 = correction did not compile).

## Repair prompt v2 (2026-10-03) - own subclasses of abstract project types
Chart-1 with Gemini 2.5 Flash-Lite (v14, 2 repair rounds): the class under test is abstract; the model wrote its own
subclass, javac reported "is not abstract and does not override abstract method drawItem(...)", and both repair rounds kept
the subclass. v2 adds two rules: an error inside a self-written class/anonymous class/lambda means delete that helper and use
a CONCRETE SUBCLASS or visible factory (or drop the tests), and header errors mean copy the TEST CLASS HEADER exactly.

## Repair prompt v1 (2026-10-02) - follow-up request of a compile-repair round
New file `prompts/Repair_Prompt.md` (version in `repair-prompt-version.txt`, copies in `versions/Repair_Prompt.vN.md`).
When a generated test class does not compile against the version the AI was given, the application sends the same AI:
the original composed prompt, then this template with `{{PREVIOUS_ANSWER}}` (its class) and `{{COMPILER_ERRORS}}`
(javac output for that class on that version). Nothing else is added: no test results, nothing from the other version.
The number of rounds is a run setting (`aiRepairRounds`, 0 = single request); results count separately per value, and
each run records `aiRepairRounds`, `repairPromptVersion`, and every round's prompt, errors and answer
(`generated/repair-N/`).
