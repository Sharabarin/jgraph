import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) throws IOException {

        List<String> arr = new ArrayList<>();
        String NameFile = "d://p022.txt";
        Reader.ReadFile(arr, NameFile, ",");

        System.out.println("первый -/ " + arr.get(0));
        System.out.println("последний -/ " + arr.get(arr.size()-1));
        System.out.println("Контроль COLIN - "+ Calc.calc("COLIN"));
        int total = 0;
        for (int i = 0; i < arr.size(); i++) {
            total +=(i + 1) * Calc.calc(arr.get(i));
        }
        System.out.println("total=" + total);
    }

}



