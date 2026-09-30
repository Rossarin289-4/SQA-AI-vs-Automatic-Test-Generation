Lang-3 Ground Truth

Project:
Apache Commons Lang

Defects4J Bug:
Lang-3

Bug Report:
LANG-693

Buggy Workspace:
workspaces/Lang-3-buggy

Fixed Workspace:
workspaces/Lang-3-fixed

Modified Class:
org.apache.commons.lang3.math.NumberUtils

Method:
createNumber(String)

Trigger Test:
org.apache.commons.lang3.math.NumberUtilsTest::testStringCreateNumberEnsureNoPrecisionLoss

Buggy:
- Git Tag: D4J_Lang_3_BUGGY_VERSION
- Git Revision: feb3701163f8ff15d0348f031244613148c3c9c3
- Compilation: PASS
- Developer Tests: 1 failing test
- Trigger Test: FAIL

Fixed:
- Git Tag: D4J_Lang_3_FIXED_VERSION
- Git Revision: fe116d3e25805192f59eef744beb9fbf025c0442
- Compilation: PASS
- Developer Tests: 0 failing tests
- Trigger Test: PASS

Ground Truth Diff:
diff.txt

Important:
The original Defects4J trigger test is Ground Truth evidence.
It must not be counted as a generated test for ChatGPT, Gemini, SA, or BPSO.
