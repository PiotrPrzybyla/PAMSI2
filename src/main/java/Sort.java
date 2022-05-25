import java.util.ArrayList;

public class Sort {
    private ArrayList<Movie> list;

    public void setList(ArrayList<Movie> list) {
        this.list = list;
    }

    public ArrayList<Movie> getList() {
        return list;
    }

    public Sort(ArrayList<Movie> list) {
        this.list = list;
    }
    public void showList(){
        for (Movie movieList: list) {
            System.out.println("Rank: " + movieList.getRank());
        }
    }
    public boolean isSorted(){
        for (int i = 0; i < list.size() -1; i++) {
            if(list.get(i).getRank() > list.get(i+1).getRank()){
                return false;
            }
        }
        return true;
    }
    public void sortArray(){}





 
}
