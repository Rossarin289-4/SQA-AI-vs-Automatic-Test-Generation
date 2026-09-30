import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public final class CandidateCsv {

    private CandidateCsv() {}

    public static List<CandidateTest> read(Path path) throws IOException {
        List<CandidateTest> out = new ArrayList<CandidateTest>();

        try (BufferedReader reader = Files.newBufferedReader(path, StandardCharsets.UTF_8)) {
            String line;
            boolean first = true;

            while ((line = reader.readLine()) != null) {
                line = line.trim();
                if (line.length() == 0) continue;

                if (first && line.startsWith("TestID,")) {
                    first = false;
                    continue;
                }
                first = false;
                out.add(CandidateTest.fromCsv(line));
            }
        }
        return out;
    }
}
