class MyApp {
    public static void main(String [] args) {

        int[][] taulukko;
        taulukko = new int [3][3];
        
        System.out.println("Anna minulle kolme lukua.");
        
        
        for(int i=0; i<taulukko.length; i++) {
            int [] sisataulukko = taulukko [i];
            for(int j=0; j<sisataulukko.length; j++) {
                System.out.print(sisataulukko[j]);
            }
            System.out.println();
        }

    }
}