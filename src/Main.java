import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
//    private static final int DEFAULT_N_VALUE = 16;
//    private StringBuilder sb = new StringBuilder();
//    private AtomicInteger counter = new AtomicInteger(1);
//    SynchronousQueue<String> data = new SynchronousQueue<>();
//
//
//    public void printFizzBuzz() throws InterruptedException {
//        Thread a = new Thread(()-> {
//            try {
//                fizz();
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        });
//        Thread b = new Thread(()-> {
//            try {
//                buzz();
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        });
//        Thread c = new Thread(()-> {
//            try {
//                this.fizzbuzz();
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        });
//        Thread d = new Thread(()-> {
//            try {
//                number();
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        });
//        d.start();
//        a.start();
//        b.start();
//        c.start();
//        sb.append(data.take());
//    }
//
//    public void fizz() throws InterruptedException {
//        while(counter.intValue()<DEFAULT_N_VALUE){
//            if (counter.get() % 3 == 0 && counter.get() % 5 != 0) {
//                if(counter.get()==DEFAULT_N_VALUE){
//                    data.put("fizz.");
//                    incrementCounter();
//                    notifyAll();
//                }
//                else{
//                    data.put("fizz ,");
//                }
//            }
//            else{
//                wait();
//            }
//        }
//    }
//    public void buzz() throws InterruptedException {
//        while(counter.intValue()<DEFAULT_N_VALUE){
//            if (counter.get() % 3 != 0 && counter.get() % 5 == 0) {
//                if(counter.get()==DEFAULT_N_VALUE){
//                    data.put("buzz.");
//                    incrementCounter();
//                    notifyAll();
//                }
//                else{
//                    data.put("buzz ,");
//                }
//            }
//            else{
//                wait();
//            }
//        }
//
//    }
//    public void fizzbuzz() throws InterruptedException{
//        while(counter.intValue()<DEFAULT_N_VALUE){
//            if (counter.get() % 3 == 0 && counter.get() % 5 == 0) {
//                if(counter.get()==DEFAULT_N_VALUE){
//                    data.put("fizzbuzz.");
//                    incrementCounter();
//                    notifyAll();
//                }
//                else{
//                    data.put("fizzbuzz ,");
//                }
//            }
//            else{
//                wait();
//            }
//        }
//
//    }
//    public void number() throws InterruptedException {
//        while(counter.intValue()<DEFAULT_N_VALUE){
//            if (counter.get() % 3 != 0 && counter.get() % 5 != 0) {
//                if(counter.get()==DEFAULT_N_VALUE){
//                    data.put(counter.intValue()+".");
//                    incrementCounter();
//                    notifyAll();
//                }
//                else{
//                    data.put(counter.intValue()+" ,");
//                }
//            }
//            else{
//                wait();
//            }
//        }
//
//    }
//    public synchronized void incrementCounter(){
//        counter.incrementAndGet();
//    }

}