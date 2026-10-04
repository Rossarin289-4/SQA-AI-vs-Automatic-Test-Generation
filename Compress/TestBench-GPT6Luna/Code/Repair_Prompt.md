===== YOUR PREVIOUS ANSWER (test class) =====
```java
{{PREVIOUS_ANSWER}}
```
===== END PREVIOUS ANSWER =====

===== COMPILER ERRORS (javac) =====
{{COMPILER_ERRORS}}
===== END COMPILER ERRORS =====

Your test class above does not compile. Correct it and reply with the complete
corrected test class in one fenced java block and nothing else.
- Fix every reported error. All rules of this message still apply.
- "cannot find symbol" for a class: take its import from the imports listed in
  this message, or add the missing java.* import. Do not guess package names.
- A method, constructor or field that does not exist or is not accessible: use
  one whose declaration you can see in this message; if there is none, delete
  that test method.
- Unreported exception: declare `throws Exception` on the test method.
- "is not abstract and does not override abstract method", "method does not
  override or implement a method from a supertype", or any error inside a
  class, anonymous class or lambda you wrote yourself: delete that helper
  entirely. Build the object with one of the CONCRETE SUBCLASSES listed in
  this message or a factory you can see; if neither exists, delete the tests
  that need it. Never implement a project type yourself.
- An error about the package line or the class header: copy the TEST CLASS
  HEADER from this message exactly.
- Do not add new test methods and do not change tests that no error refers to.
