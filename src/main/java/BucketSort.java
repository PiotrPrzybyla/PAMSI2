import java.util.ArrayList;

public class BucketSort extends Sort{
    private ArrayList<ArrayList<Movie>> buckets;
    private int bucketsAmount;
    private double max;
    public BucketSort(ArrayList<Movie> list) {
        super(list);
        bucketsAmount = (int) Math.sqrt(list.size());
        max = maxValue();
        buckets = new ArrayList<>(bucketsAmount);
        for(int i=0; i<bucketsAmount;i++){
            buckets.add(new ArrayList<>());
        }
    }
    private int hash (double i, double max, int bucketsAmount){
        return (int)((double) i/max * (bucketsAmount-1));
    }
    private double maxValue(){
        double max = Double.MIN_VALUE;
        for (Movie i: getList()) {
            max = Math.max(i.getRank(),max);
        }
        return max;
    }
    public void sortArray(){
        for (Movie i: getList()) {
            buckets.get(hash(i.getRank(), max, bucketsAmount)).add(i);
        }
        for(ArrayList<Movie> bucket: buckets){
            MergeSort sort = new MergeSort(bucket);
            sort.sortArray();
        }
        ArrayList<Movie> sortedList = new ArrayList<>();
        for(ArrayList<Movie> bucket: buckets){
            sortedList.addAll(bucket);
        }
        setList(sortedList);
    }

}
