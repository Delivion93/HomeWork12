package Task2;

import java.util.concurrent.atomic.AtomicInteger;

public class FizzBuzz {
    private static final int DEFAULT_N_VALUE = 15;
    private StringBuilder sb = new StringBuilder();
    private AtomicInteger counter = new AtomicInteger(1);

    public int getCounter(){
        return counter.intValue();
    }
    public int getDefaultNValue(){
        return DEFAULT_N_VALUE;
    }
    public void printString(){
        System.out.println(sb.toString());
    }
    public synchronized void fizz() throws InterruptedException {
        while(counter.intValue()<=DEFAULT_N_VALUE) {
            if (counter.get() % 3 == 0 && counter.get() % 5 != 0) {
                if (counter.get() == DEFAULT_N_VALUE) {
                    sb.append("fizz.");
                } else {
                    sb.append("fizz ,");
                }
                incrementCounter();
                notifyAll();
            } else {
                wait();
            }
        }
    }
    public synchronized void buzz() throws InterruptedException {
        while(counter.intValue()<=DEFAULT_N_VALUE){
            if (counter.get() % 3 != 0 && counter.get() % 5 == 0) {
                if(counter.get()==DEFAULT_N_VALUE){
                    sb.append("buzz.");
                }
                else{
                    sb.append("buzz ,");
                }
                incrementCounter();
                notifyAll();
            }
            else{
                wait();
            }
        }

    }
    public synchronized void fizzbuzz() throws InterruptedException{
        while(counter.intValue()<=DEFAULT_N_VALUE){
            if (counter.get() % 3 == 0 && counter.get() % 5 == 0) {
                if(counter.get()==DEFAULT_N_VALUE){
                    sb.append("fizzbuzz.");
                }
                else{
                    sb.append("fizzbuzz ,");
                }
                incrementCounter();
                notifyAll();
            }
            else{
                wait();
            }
        }

    }
    public synchronized void number() throws InterruptedException {
        while(counter.intValue()<=DEFAULT_N_VALUE){
            if (counter.get() % 3 != 0 && counter.get() % 5 != 0) {
                if(counter.get()==DEFAULT_N_VALUE){
                    sb.append(counter.intValue()).append(".");
                }
                else{
                    sb.append(counter.intValue()).append(" ,");
                }
                incrementCounter();
                notifyAll();
            }
            else{
                wait();
            }
        }

    }
    public synchronized void incrementCounter(){
        counter.incrementAndGet();
    }

}
