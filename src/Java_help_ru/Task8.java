package Java_help_ru;

public class Task8 {
    private double[] values = {20,30,23,10,5,8,9,45,67,94};
    private double average = 0;

    void findAverage(){
        double sum = 0;
        for (int i = 0; i < values.length; i++){
            sum+= values[i];
        }
        average = sum / values.length;
    }

    void show(){
        findAverage();
        System.out.println("Среднее = " + average);
    }
}
