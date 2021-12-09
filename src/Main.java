import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args){
        Birth chicken = new Birth("Chicken");
        Birth egg = new Birth("Egg");

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(chicken);
        executorService.submit(egg);
    }
}
