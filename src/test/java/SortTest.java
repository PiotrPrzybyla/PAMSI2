import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class SortTest {
    ArrayList<Movie> list = new ArrayList<>();
    void createLists(){
      ReadFromFile reader = new ReadFromFile();
        try {
            reader.read("C:\\Studia\\4sem\\PAMSI\\Projekt 2\\dane.csv");
        } catch (IOException e) {
            e.printStackTrace();
        }
        list = reader.movieList;
    }

    @Test
    public void quickSortAlgorithmTest(){
        createLists();
        QuickSort sort;
       sort = new QuickSort(list);
       assertTrue(list.equals(sort.getList()));
       sort.sortArray();
        assertTrue(sort.isSorted());

    }
    @Test
    public void mergeSortAlgorithmTest(){
       createLists();

        MergeSort sort = new MergeSort(list);
        sort.sortArray();
        assertTrue(sort.isSorted());
    }
    @Test
    public void bucketSortAlgorithmTest(){
        createLists();
        BucketSort sort = new BucketSort(list);
        sort.sortArray();
        assertTrue(sort.isSorted());
    }
}
