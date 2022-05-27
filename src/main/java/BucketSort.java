import java.util.ArrayList;

public class BucketSort extends Sort implements Runnable{

    private ArrayList<ArrayList<Movie>> buckets;
    private int bucketsAmount;
    private double max;
    public BucketSort(ArrayList<Movie> list) {
        super(list);
//        bucketsAmount = (int) Math.sqrt(list.size());
        max = 10;
        bucketsAmount = 5;
        buckets = new ArrayList<>(bucketsAmount);
        for(int i=0; i<bucketsAmount;i++){
            buckets.add(new ArrayList<>());
        }
    }
    private int hash (double i, double max, int bucketsAmount){
        return (int)( i/max * (bucketsAmount-1));
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
            QuickSort sort = new QuickSort(bucket);
            sort.sortArray();
        }
        ArrayList<Movie> sortedList = new ArrayList<>();
        for(ArrayList<Movie> bucket: buckets){
            sortedList.addAll(bucket);
        }
        setList(sortedList);
    }

    @Override
    public void run() {
//        System.out.println(ANSI_BLUE+ isSorted());
        long start = System.nanoTime();
        sortArray();
        long end = System.nanoTime();
//        System.out.println(ANSI_BLUE+ isSorted());
        System.out.println(ANSI_BLUE+ "Time: " + (end-start) + ANSI_RESET);
    }
}
