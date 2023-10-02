package Task1;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class Demo extends Thread{
    static AtomicInteger mainThreadTime = new AtomicInteger(0);
    static boolean isActive = true;

    public static void main(String[] args) {
        Thread thread = new Thread(()-> {
            while (isActive){
                try {
                    sleep(5000);
                    System.out.println("Минуло 5 секунд");
                }
                catch (InterruptedException exception){
                    System.out.println(Arrays.toString(exception.getStackTrace()));
                }
            }
        });
        thread.start();
        while (isActive){
            try {
                Thread.sleep(1000);
                System.out.println(mainThreadTime.incrementAndGet()+" секунд минуло від запуску програми");
            }
            catch (InterruptedException e){
                System.out.println(Arrays.toString(e.getStackTrace()));
            }
        }
    }


}
