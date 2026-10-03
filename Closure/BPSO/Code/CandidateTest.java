import java.util.Locale;

/**
 * One candidate test available to the search algorithm.
 *
 * IMPORTANT:
 * fault-detection/trigger information is intentionally NOT stored here.
 * That information belongs to the evaluator/ground truth.
 */
public final class CandidateTest {
    public final String id;
    public final String testClass;
    public final String testMethod;
    public final double coverageScore;
    public final double executionTimeMs;

    public CandidateTest(
            String id,
            String testClass,
            String testMethod,
            double coverageScore,
            double executionTimeMs) {
        this.id = id;
        this.testClass = testClass;
        this.testMethod = testMethod;
        this.coverageScore = coverageScore;
        this.executionTimeMs = executionTimeMs;
    }

    public String fullName() {
        return testClass + "::" + testMethod;
    }

    public static CandidateTest fromCsv(String line) {
        String[] p = line.split(",", -1);
        if (p.length < 5) {
            throw new IllegalArgumentException(
                    "Expected: TestID,TestClass,TestMethod,CoverageScore,ExecutionTimeMs");
        }
        return new CandidateTest(
                p[0].trim(),
                p[1].trim(),
                p[2].trim(),
                Double.parseDouble(p[3].trim()),
                Double.parseDouble(p[4].trim()));
    }

    public String toCsv() {
        return String.format(
                Locale.US,
                "%s,%s,%s,%.6f,%.6f",
                id, testClass, testMethod, coverageScore, executionTimeMs);
    }
}
