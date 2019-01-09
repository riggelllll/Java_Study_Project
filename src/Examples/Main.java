package Examples;


import Examples.threads.Message;
import Examples.threads.Notifier;
import Examples.threads.Waiter;

public class Main {
    public static void main(String[] args) {

       Message message = new Message("обработать");
       Waiter waiter = new Waiter(message);
       Thread thread1 = new Thread(waiter,"waiter");
       thread1.start();
       System.out.println(thread1.getState());


       Waiter waiter11 = new Waiter(message);
        Thread thread2 = new Thread(waiter11,"waiter1");
        thread2.start();
        System.out.println(thread2.getState());

        Notifier notifier = new Notifier(message);
        Thread thread3 = new Thread(notifier,"notifier");
        thread3.start();
        System.out.println(thread3.getState());
        System.out.println("Стартовали все потоки");



    }


}
