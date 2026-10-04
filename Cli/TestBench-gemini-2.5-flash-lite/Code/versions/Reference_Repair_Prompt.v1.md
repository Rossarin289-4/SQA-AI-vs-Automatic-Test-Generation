===== YOUR PREVIOUS ANSWER (test class) =====
```java
{{PREVIOUS_ANSWER}}
```
===== END PREVIOUS ANSWER =====

===== TESTS THAT FAIL ON THE REFERENCE VERSION =====
{{TEST_FAILURES}}
===== END TESTS THAT FAIL ON THE REFERENCE VERSION =====

Your class compiles, but the tests listed above FAIL when run on the REFERENCE
SOURCE CODE of this message - the version whose behavior is correct by
definition. A test that fails there is wrong, not the code. Correct only those
tests and reply with the complete corrected test class in one fenced java block
and nothing else.
- Re-read the reference source for each failing test and trace the exact input
  again. Usual causes: the object under test is not the instance registered in
  its container (take it back with the container's getter), a wrong expected
  value, a precondition the setup did not establish, an exception the code does
  not throw for that input.
- Fix the setup or the expected value so that the test passes on the reference
  version while still checking a precise, meaningful behavior. If you cannot be
  certain, assert a weaker property you are certain of, or delete that test.
- Do not add new tests and do not change tests that pass. All rules of this
  message still apply.
