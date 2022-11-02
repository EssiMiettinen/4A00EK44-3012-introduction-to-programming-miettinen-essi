public class MyApp {
    public static void main(String[] args) {

        int[][] taulukko = {{1, 2, 3, 4},{5, 6, 7, 8}};

        for(int i=0; i<taulukko.length; i++) {
            int [] sisataulukko = taulukko[i];
            for(int j=0; j<sisataulukko.length; j++) {
                System.out.print(sisataulukko[j]);
            }
            System.out.println();
        }

    }
}