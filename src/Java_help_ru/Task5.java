package Java_help_ru;

public class Task5 {
    private static int AIR_SPEED = 1100;
    private double inerval;

    Task5(int interval){
        this.inerval = interval;
    }

    void getS(){
        double s = AIR_SPEED * inerval;
        System.out.println("S = " + s);
    }

}
