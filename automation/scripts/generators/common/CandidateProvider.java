package generators.common;

import java.util.List;

public interface CandidateProvider {

    List<Candidate> buildCandidates();

    double fitness(List<Candidate> candidates, boolean[] state);

    String generateTestSuite(
            List<Candidate> candidates,
            boolean[] state,
            String packageName,
            String className);
}
