import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class QuickSort extends Sort {

    public QuickSort(ArrayList<Double> list) {
        super(list);
    }

    public void sort(int left, int right){
        int tempLeft = left;
        int tempRight = right;

        Double pivot = list.get(right);
        do{
            while(list.get(tempLeft) < pivot)tempLeft++;
            while(list.get(tempRight) > pivot)tempRight--;
            if (tempLeft<=tempRight){
                Collections.swap(list, tempLeft,tempRight);
                tempLeft++;
                tempRight--;
            }
        }while(tempLeft<=tempRight);
        if(tempRight > left) sort(left,tempRight);
        if(tempLeft<right) sort(tempLeft,right);
    }

}
