package generators.common;

import java.util.LinkedHashSet;
import java.util.Set;

public class Candidate {

    private final String name;
    private final String testCode;
    private final Set<String> features;

    public Candidate(
            String name,
            String testCode,
            Set<String> features) {

        this.name = name;
        this.testCode = testCode;
        this.features =
                new LinkedHashSet<String>(features);
    }

    public String getName() {
        return name;
    }

    public String getTestCode() {
        return testCode;
    }

    public Set<String> getFeatures() {
        return new LinkedHashSet<String>(features);
    }
}
