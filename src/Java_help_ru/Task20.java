package Java_help_ru;

class Task20 {
    private static final int HOURS_IN_DAY = 24;
    private static final int MINUTES_IN_HOUR = 60;
    private static final int SECONDS_IN_MINUTE = 60;
    private int hours,minutes,seconds,days;

    Task20(int days){
        this.days = days;
    }
    private void calculate(){
        hours = HOURS_IN_DAY * days;
        minutes = MINUTES_IN_HOUR * hours;
        seconds = SECONDS_IN_MINUTE * minutes;
    }
    private void show(){
        System.out.println("Input = " + days + " days");
        System.out.println("Hours = " + hours);
        System.out.println("Minutes = " + minutes);
        System.out.println("Seconds = " + seconds);
    }
    void run(){
        calculate();
        show();
    }
}
