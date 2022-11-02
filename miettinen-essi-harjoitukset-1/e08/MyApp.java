import java.io.Console;  

public class MyApp {
    public static void main(String [] args) {
        Console c = System.console(); 

        System.out.println("Kuinka vanha sinä olet?");
        int vanha = Integer.parseInt(c.readLine());
        
        if(vanha < 25) {
            System.out.println("oletpas nuori");
        } else if (vanha > 25) {
            System.out.println("oletpa vanha");
        }
    }
}