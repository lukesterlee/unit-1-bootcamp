import java.io.FileNotFoundException;

/**
 * Created by Luke Lee on 4/20/2015.
 */
public class GameTest {

    public static void main(String[] args) throws FileNotFoundException {

        String file1 = "C:\\Users\\Luke\\Desktop\\unit-1-bootcamp\\resources\\life1.dat";
        String file2 = "C:\\Users\\Luke\\Desktop\\unit-1-bootcamp\\resources\\life2.dat";
        String file3 = "C:\\Users\\Luke\\Desktop\\unit-1-bootcamp\\resources\\life3.dat";
        String file4 = "C:\\Users\\Luke\\Desktop\\unit-1-bootcamp\\resources\\life4.dat";
        String file5 = "C:\\Users\\Luke\\Desktop\\unit-1-bootcamp\\resources\\life5.dat";

        GameOfLife game1 = new GameOfLife(file1);
        GameOfLife game2 = new GameOfLife(file2);
        GameOfLife game3 = new GameOfLife(file3);
        GameOfLife game4 = new GameOfLife(file4);
        GameOfLife game5 = new GameOfLife(file5);

        game1.printMap();
    }
}
