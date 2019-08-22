public class Calc {

    public static int calc(String ss) {
          int sum = 0;
          for (int i = 0; i < ss.length(); i++) {
              sum+=(int)ss.charAt(i)-64;
           }
            return sum;
    }
}
