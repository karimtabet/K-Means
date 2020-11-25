import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class KMeansClusteringTest {
    @Test
    public void testMain() throws IOException {
        KMeansClustering kmeans = new KMeansClustering(8);
        kmeans.run();

        assertEquals(new String(Files.readAllBytes(Paths.get("expected_output.txt")), StandardCharsets.UTF_8),
                     new String(Files.readAllBytes(Paths.get("output.txt")), StandardCharsets.UTF_8));
    }
}