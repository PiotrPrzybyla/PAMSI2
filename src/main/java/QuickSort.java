import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class QuickSort extends Sort {

    public QuickSort(ArrayList<Movie> list) {
        super(list);
    }

    public void sortArray() {
        sort(0, getList().size()-1);
    }

    public void sort(int left, int right){
        int tempLeft = left;
        int tempRight = right;

        Double pivot = getList().get(right).getRank();
        do{
            while(getList().get(tempLeft).getRank() < pivot)tempLeft++;
            while(getList().get(tempRight).getRank() > pivot)tempRight--;
            if (tempLeft<=tempRight){
                Collections.swap(getList(), tempLeft,tempRight);
                tempLeft++;
                tempRight--;
            }
        }while(tempLeft<=tempRight);
        if(tempRight > left) sort(left,tempRight);
        if(tempLeft<right) sort(tempLeft,right);
    }

}
