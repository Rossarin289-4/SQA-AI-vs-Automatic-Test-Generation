===== YOUR PREVIOUS ANSWER (test class) =====
```java
{{PREVIOUS_ANSWER}}
```
===== END PREVIOUS ANSWER =====

===== PUBLIC METHODS OF THE CLASS UNDER TEST THAT NO TEST CALLS =====
{{UNTESTED_METHODS}}
===== END PUBLIC METHODS THAT NO TEST CALLS =====

A defect can sit in any public method, and the methods listed above are not
exercised by your class at all. Extend your class: keep every existing test
unchanged and ADD 8 to 16 new test methods that call as many of the listed
methods as you can build inputs for, preferring the ones with the most branching
logic. For each one, set the object up exactly as the reference source requires
(objects registered in a container must be the instance the container holds),
use edge values, and derive every expected value by tracing the reference
source. Skip a listed method only when its arguments cannot be built from what
this message shows. All rules of this message still apply (header copied
exactly, visible declarations only, no helper classes, `throws Exception`).
Reply with the complete extended test class in one fenced java block and
nothing else.
