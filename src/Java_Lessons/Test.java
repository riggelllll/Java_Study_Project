package Java_Lessons;

import java.util.Observable;
import java.util.Observer;


class Watcher implements Observer{

    @Override
    public void update(Observable observable, Object o) {
        System.out.println("Update вызван. значение = " + ((Integer)o).intValue());

    }
}

class Watched extends Observable{
    void count(){
        for (int i = 0; i < 10; i++){
            setChanged();
            notifyObservers(i);
        }
    }
}

public class Test {
    public static void main(String[] args) {
        Watcher watcher = new Watcher();
        Watched watched = new Watched();

        watched.addObserver(watcher);
        watched.count();

    }



}
