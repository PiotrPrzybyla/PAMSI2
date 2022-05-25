import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class ReadFromFile {
    ArrayList<Movie> movieList;
    public ReadFromFile() {
        movieList = new ArrayList<Movie>();
    }
    public void read(String filePath) throws IOException {
        Path sciezkaDoPliku = Paths.get(filePath);
        ArrayList<String> stringList = new ArrayList<>();
        try {
            stringList = (ArrayList) Files.readAllLines(sciezkaDoPliku);
        } catch (IOException e) {
            System.out.println("Brak pliku!");
        }
        stringList.remove(0);
        toMovieArray(stringList);
    }
    public void toMovieArray(ArrayList<String> stringList) {
            for (String line : stringList) {
                if (line.charAt(line.length() - 1) != ',') {
                    String[] l = line.split(",");
                    if (l.length > 3) {
                        for (int i = 2; i < l.length - 1; i++) {
                            l[1] += ( ","+l[i]);
                        }
                        l[2] = l[l.length - 1];
                    }
                    if(l.length >=3){
                        movieList.add(new Movie(l[1], Double.parseDouble(l[2])));
                    }

                }
            }
    }
}
