class MyApp {
    public static void main(String [] args) {

        int[][] taulukko = {{1,3,9}, {2,7,3}};
        
        for(int i=0; i<taulukko.length; i++) {
            int [] sisataulukko = taulukko [i];
            for(int j=0; j<sisataulukko.length; j++) {
                System.out.print(sisataulukko[j]);
            }
            System.out.println();
        }

    }
}