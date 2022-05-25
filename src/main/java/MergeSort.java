import java.util.ArrayList;

public class MergeSort extends Sort{
    public MergeSort(ArrayList<Movie> list) {
        super(list);
    }
    public void sortArray(){
        divideArrayElements(0,getList().size()-1);
    }
    public void divideArrayElements(int left, int right) {
        if (left < right && (right - left) >= 1) {
            int middleElement = (right + left) / 2;

            divideArrayElements(left, middleElement);
            divideArrayElements(middleElement + 1, right);

            sort(left, middleElement, right);
        }
    }
    public void sort(int indexStart, int indexMiddle, int indexEnd){
        ArrayList<Movie> tempArray = new ArrayList<>();

        int getLeftIndex = indexStart;
        int getRightIndex = indexMiddle + 1;

        while (getLeftIndex <= indexMiddle && getRightIndex <= indexEnd) {

            if (getList().get(getLeftIndex).getRank() <= getList().get(getRightIndex).getRank()) {

                tempArray.add(getList().get(getLeftIndex));
                getLeftIndex++;

            } else {

                tempArray.add(getList().get(getRightIndex));
                getRightIndex++;

            }
        }

        while (getLeftIndex <= indexMiddle) {
            tempArray.add(getList().get(getLeftIndex));
            getLeftIndex++;
        }

        while (getRightIndex <= indexEnd) {
            tempArray.add(getList().get(getRightIndex));
            getRightIndex++;
        }


        for (int i = 0; i < tempArray.size(); indexStart++) {
            getList().set(indexStart, tempArray.get(i++));

        }
    }
}
