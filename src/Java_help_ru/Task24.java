package Java_help_ru;

import java.util.Scanner;

public class Task24 {
    private int time, distance, speed;
    private Scanner scanner;
    Task24(){
        scanner = new Scanner(System.in);
    }
    private void enterValues(){
        System.out.println("Enter time");
        time = scanner.nextInt();
        System.out.println("Enter distance");
        distance = scanner.nextInt();
    }
    private void calculate(){
        speed = distance / time;
    }
    private void showSpeed(){
        System.out.println(speed);
    }
    void run(){
        enterValues();
        calculate();
        showSpeed();
    }
}
