import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Reader {
    public static void ReadFile(List<String> arr, String nameFile, String regex) throws IOException {
        Files.lines(Paths.get(nameFile))
                .map(line -> line.split(regex))
                .flatMap(Arrays::stream)
                .distinct()
                .map(String -> String.replace("\"", ""))
                .sorted()
                .forEach(arr::add);
    }
}
