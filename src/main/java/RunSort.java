import java.io.IOException;
import java.util.ArrayList;

public class RunSort {

    public void run(int amount){
        ArrayList listArray[] = {new ArrayList(), new ArrayList(), new ArrayList()};
        ReadFromFile readerArray[] = {new ReadFromFile(), new ReadFromFile(), new ReadFromFile()};

;
        Thread[] threads = new Thread[3];
        for (int i=0;i<3;i++) {
            try {
                readerArray[i].read("C:\\Studia\\4sem\\PAMSI\\Projekt 2\\dane.csv");
            } catch (IOException e) {
                e.printStackTrace();
            }
            if(amount ==-1){
                listArray[i] = readerArray[i].movieList;
            }else{
                for (int j = 0; j < amount; j++) {
                    listArray[i].add(readerArray[i].movieList.get(j));
                }
            }

        }

        Runnable[] runners = {new QuickSort(listArray[0]), new MergeSort(listArray[1]), new BucketSort(listArray[2])};

        for (int i = 0; i < 3; i++) {
            threads[i] = new Thread(runners[i]);
        }
        for (Thread thread: threads) {
                thread.start();

        }
        for (Thread thread: threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        System.out.println("Red - MergeSort, Yellow - QuickSort, Blue - BucketSort");
    }
}
