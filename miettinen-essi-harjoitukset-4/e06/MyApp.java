import java.io.Console;

class MyApp {
    public static void main(String [] args) {
        int[] number = {12, 99, 32};
        for (int i = 2; i > -number.length; i--) {
            System.out.println(number[i]);
        }
    }
}