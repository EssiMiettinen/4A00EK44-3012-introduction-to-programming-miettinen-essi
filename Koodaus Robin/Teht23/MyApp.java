import java.io.Console;

public class MyApp {
    public static void main(String[] args) {
        Console c = System.console();

        char[][] pelilauta = {{'-', '-', '-', '-', '-', '-'},
                              {'-', '-', '-', '-', '-', '-'},
                              {'-', '-', '-', '-', '-', '-'},
                              {'-', '-', '-', '-', '-', '-'}};

        System.out.println("Anna xPos");
        int x = Integer.parseInt(c.nextLine());
        System.out.println("Anna yPos");
        int y = Integer.parseInt(c.nextLine());
        pelilauta[x][y] = 'X';

        for(int i=0; i<pelilauta.length; i++) {
            for(int j=0; j<pelilauta[i].length; j++) {
                System.out.print(pelilauta[i][j]);
            }
            System.out.println();
        } 
        
    }
}