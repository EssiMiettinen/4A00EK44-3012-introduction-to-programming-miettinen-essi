import java.io.Console;

class MyApp {
    public static void main(String [] args) {
        String[] taulukko = {"Ville", "Jukka", "Esteri", "Aada", "Leo", "Olivia", "Mikko", "Tuomas"};

        for(int i = 0; i < taulukko.length; i = i + 2) {
            System.out.println(taulukko[i]);
        }
        System.out.println();
    }
}