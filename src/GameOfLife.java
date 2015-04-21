import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by Luke Lee on 4/20/2015.
 */
public class GameOfLife {

    File file;
    Scanner input;
    final char[][] MAP = new char[25][75];

    public GameOfLife(String fileName) throws FileNotFoundException {
        file = new File(fileName);
        input = new Scanner(file);

        String line;

        for (int row = 0; row < 25; row++) {
            line = input.nextLine();
            for (int j = 0; j < 75; j++) {
                MAP[row][j] = line.charAt(j);
            }
        }


    }

    public void printMap() {
        for (int row = 0; row < 25; row++) {
            for (int col = 0; col < 75; col++) {
                System.out.print(MAP[row][col] + " ");
            }
            System.out.println();
        }
    }

    public int checkNeighbor(int row, int col) {

        return 0;
    }

    public void nextStage() {

    }

    public static void main(String[] args) {

    }

}
