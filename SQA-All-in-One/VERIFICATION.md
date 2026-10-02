# Verification

The offline test suite covers Java response validation, HTTP protocol/error handling, generated-suite packaging, fixed/buggy classification, coverage parsing, resume, reporting denominators, inherited-path isolation, and the combined CLI.

The combined CLI test invokes `bash run.sh` with two model IDs and both algorithm adapters, checks the Chart-1 checkpoint, and verifies the four Closure rows in the combined CSV. The JVM adapter fixture checks that both SA/BPSO receive a 30-second search budget and a fixed-version classpath. The generated Java fixture is compiled and executed by the local JDK.

External Defects4J, EvoSuite search, and KKU model behavior are replaced by explicit offline fixtures. These checks validate integration and control flow; they do not prove benchmark coverage, live model access, or that the user's actual custom EvoSuite JAR works. The mandatory real Chart-1 checkpoint runs on the user's machine before algorithm work continues. API account setup and the Closure-1 pilot also run there.

Run `bash run.sh selftest` to reproduce the offline checks. It needs Python 3 and a JDK; it makes no calls to KKU and does not need API credentials.

Recorded local check: `bash run.sh selftest` completed with 17 passing tests and one intentional recursion-guard skip (18 discovered), exit code 0.
