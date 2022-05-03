import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class QuickSort extends Sort {

    public QuickSort(ArrayList<Double> list) {
        super(list);
    }



    public Double choosePivot(){
        return list.get(list.size()/2 );
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
    public void setPivotInRightPlace(){
        if(list.size()>1) {
            Double pivot = choosePivot();
            list.remove(pivot);
            list.add(list.size(), pivot);
            Double itemFromLeft, itemFromRight;

            int rightItemPosition = list.size() - 2;
            int leftItemPosition = 0;
            itemFromLeft = list.get(leftItemPosition);
            itemFromRight = list.get(rightItemPosition);
            boolean isReady = false;
            while (!isReady) {
                rightItemPosition = list.size() - 2;
                leftItemPosition = 0;
                itemFromLeft = list.get(leftItemPosition);
                itemFromRight = list.get(rightItemPosition);
                for (; itemFromLeft < pivot; ++leftItemPosition) {
                    itemFromLeft = list.get(leftItemPosition);
                }
                for (; itemFromRight > pivot || rightItemPosition > -1; --rightItemPosition) {
                    itemFromRight = list.get(rightItemPosition);
                }

                if(list.indexOf(itemFromLeft) > list.indexOf(itemFromRight)){
                    Collections.swap(list, list.indexOf(itemFromLeft), list.indexOf(pivot));
                    isReady = true;
                }else {
                    Collections.swap(list, list.indexOf(itemFromLeft), list.indexOf(itemFromRight));
                }



            }

//        list.remove(itemFromLeft);
//        list.remove(itemFromRight);
//        list.remove(pivot);
//        list.add(rightItemPosition, pivot);
//        list.add(leftItemPosition,itemFromRight);
//        list.add(list.size(),itemFromLeft );
            int division = list.indexOf(pivot);
            ArrayList<Double> leftList = new ArrayList<>();
            ArrayList<Double> rightList = new ArrayList<>();
            for (int i = 0; i < list.indexOf(pivot); i++) {
                leftList.add(list.get(i));
            }
            for (int i = list.indexOf(pivot) +1; i < list.size(); i++) {
                rightList.add(list.get(i));
            }
            QuickSort leftSort = new QuickSort(leftList);
            QuickSort rightSort = new QuickSort(rightList);
           leftSort.setPivotInRightPlace();
           rightSort.setPivotInRightPlace();
            list = new ArrayList<>();
            list.addAll(leftList);
            list.add(pivot);
            list.addAll(rightList);
        }
    }


}
