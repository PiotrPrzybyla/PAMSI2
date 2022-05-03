import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.Assert.*;

public class SortTest {
    @Test
    public void quickSortAlgorithmTest(){
        ArrayList<Double> list = new ArrayList<>();
        ArrayList<Double> sortedList = new ArrayList<>();
        QuickSort sort;

        list.add(5.0);
        list.add(3.0);
        list.add(6.0);
        list.add(4.5);
        list.add(2.0);
        list.add(8.0);
        list.add(5.5);
        list.add(1.0);
        list.add(2.0);
        list.add(9.5);

        sortedList.addAll(list);
        Collections.sort(sortedList);



       sort = new QuickSort(list);
       assertTrue(list.equals(sort.getList()));
       assertEquals(5.0, sort.getList().get(0), 0);
       sort.sort(0,sort.list.size()-1);
       sort.showList();
       assertTrue(sortedList.equals(sort.getList()));


    }
}
