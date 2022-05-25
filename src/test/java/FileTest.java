import org.junit.Test;

import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;

public class FileTest {
    @Test
    public void readFromFileTest(){
        ReadFromFile reader = new ReadFromFile();
        try {
            reader.read("C:\\Studia\\4sem\\PAMSI\\Projekt 2\\dane.csv");
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (Movie movie: reader.movieList) {
            System.out.print(movie.getName());
            System.out.print(movie.getRank());
            System.out.println("");
        }
    }
}
