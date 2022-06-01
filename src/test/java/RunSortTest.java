import org.junit.Test;

public class RunSortTest {

    @Test
    public void runSortTest(){
        RunSort runner = new RunSort();


        runner.run(100);
        System.out.println("");
        runner.run(1000);
        System.out.println("");
        runner.run(10000);
        System.out.println("");
        runner.run(100000);
        System.out.println("");
        runner.run(-1);
    }
}
