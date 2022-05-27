import java.util.ArrayList;

public class Sort {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    private ArrayList<Movie> list;

    public void setList(ArrayList<Movie> list) {
//        this.list.addAll(list);
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
