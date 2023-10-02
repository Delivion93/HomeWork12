package Task2;

public class Demo {
    public static void main(String[] args) throws InterruptedException {
        FizzBuzz fizzBuzz = new FizzBuzz();

        Thread a = new Thread(()-> {
            try {
                fizzBuzz.fizz();;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        Thread b = new Thread(()-> {
            try {
                fizzBuzz.buzz();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        Thread c = new Thread(()-> {
            try {
                fizzBuzz.fizzbuzz();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        Thread d = new Thread(()-> {
            try {
                fizzBuzz.number();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        a.start();
        b.start();
        c.start();
        d.start();
        a.join();
        b.join();
        c.join();
        d.join();
        fizzBuzz.printString();

    }
}
