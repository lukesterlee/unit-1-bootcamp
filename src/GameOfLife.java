import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by Luke Lee on 4/20/2015.
 */
public class GameOfLife {

    File file;
    Scanner input;
    String[][] map;

    public GameOfLife(String fileName) throws FileNotFoundException {
        map = new String[25][75];
        file = new File(fileName);
        input = new Scanner(file);

        String row;

        for (int i = 0; i < 25; i++) {
            row = input.nextLine();
            for (int j = 0; j < 75; j++) {
                map[i][j] = row.charAt(j) + "";
            }
        }


    }

    public void printMap() {
        for (int i = 0; i < 25; i++) {
            for (int j = 0; j < 75; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

    }

}
