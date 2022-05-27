import java.util.Scanner;

public class Menu {
    private int movieAmount;
    private boolean allMovies;
    public Menu() {
        Scanner scr = new Scanner(System.in);
        allMovies = false;
        mainMenu(scr);


    }
    public void mainMenu(Scanner scr){
        int choice = 0;
        System.out.println("----------MENU----------");
        System.out.println("Choose amount of movies:");
        System.out.println("1. 10 000");
        System.out.println("2. 100 000");
        System.out.println("3. 300 000");
        System.out.println("4. All");

        while(choice!=1&&choice!=2&&choice!=3&&choice!=4){
            choice = scr.nextInt();
            switch (choice){
                case 1:
                    movieAmount = 10000;
                    break;
                case 2:
                    movieAmount = 100000;
                    break;
                case 3:
                    movieAmount = 300000;
                    break;
                case 4:
                    allMovies = true;
                    break;
                default:
                    System.out.println("Wrong option");
                    break;
            }

        }

    }
}
