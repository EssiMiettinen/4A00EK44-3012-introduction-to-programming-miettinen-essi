public static String[] annaMerkkijonoTaulukko() {
    String[] aakkoset = new String[4];

    aakkoset[0] = "a";
    aakkoset[1] = "b";
    aakkoset[2] = "c";
    aakkoset[3] = "d";

    return aakkoset;
}



public class MyApp {
    public static void main(String[] args) {
        String[] taulukko = annaMerkkijonoTaulukko();

        for (String kirjaimet : taulukko){
            System.out.println(kirjaimet);
        }
    }
}