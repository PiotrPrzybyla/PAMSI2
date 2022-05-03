import java.util.ArrayList;

public class Sort {
     ArrayList<Double> list;

    public ArrayList<Double> getList() {
        return list;
    }

    public Sort(ArrayList<Double> list) {
        this.list = list;
    }
    public void showList(){
        for (Double movieList: list) {
            System.out.println("Rank: " + movieList);
        }
    }
    public void sort(){}





 
}
