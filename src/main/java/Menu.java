import java.util.Scanner;

public class Menu {
    private int movieAmount;
    public Menu() {
        Scanner scr = new Scanner(System.in);
        boolean quit = false;
        RunSort runSort = new RunSort();
        while (!quit){
            mainMenu(scr);
            runSort.run(movieAmount);
            System.out.println("1. Main Menu");
            System.out.println("2. Quit");
            if(scr.nextInt() == 2) quit = true;
        }



    }
    public void mainMenu(Scanner scr){
        int choice = 0;
        System.out.println("----------MENU----------");
        System.out.println("Choose amount of movies:");
        System.out.println("1. 10 000");
        System.out.println("2. 100 000");
        System.out.println("3. 300 000");
        System.out.println("4. All");
        System.out.println("5. Analysis");

        while(choice!=1&&choice!=2&&choice!=3&&choice!=4 && choice!=5){
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
                    movieAmount = -1;
                    break;
                case 5:
                    RunSort runSort = new RunSort();
                    runSort.run(10);
                    runSort.run(100);
                    runSort.run(500);
                    runSort.run(1000);
                    runSort.run(5000);
                    runSort.run(10000);
                    runSort.run(50000);
                    movieAmount = 100000;

                    break;
                default:
                    System.out.println("Wrong option");
                    break;
            }

        }

    }
}
