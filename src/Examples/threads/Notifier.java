package Examples.threads;

public class Notifier implements Runnable{
    private Message msg;

    public Notifier(Message msg){
        this.msg = msg;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name + " стартовал");
        try {
            Thread.sleep(1000);
            synchronized (msg){
                msg.msg = name + " поток Notifier отработал";
                msg.notifyAll();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
