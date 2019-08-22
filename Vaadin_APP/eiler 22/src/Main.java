import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        List<String> arr = new ArrayList<>();

        Files.lines(Paths.get("d://p022.txt"))
                .map(line -> line.split(",")) // Stream<String[]>
                .flatMap(Arrays::stream) // Stream<String>
                .distinct() // Stream<String>
                .map(String -> String.replace("\"",""))
                .sorted()
                .forEach(arr::add);

        System.out.println("первый -/ " + arr.get(0));
        System.out.println("последний -/ " + arr.get(5162));
        System.out.println("Контроль COLIN - "+ calc("COLIN"));

        int total = 0;
        for (int i = 0; i < arr.size(); i++) {
            total +=(i + 1) * calc(arr.get(i));
        }
//

        System.out.println("total=" + total);
    }

    private static int calc(String ss) {
            int sum = 0;

          for (int i = 0; i < ss.length(); i++) {
              sum+=(int)ss.charAt(i)-64;
           }
            return sum;
    }
}



