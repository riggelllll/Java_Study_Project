package Java_help_ru;
/*
Сила тяжести на Луне примерно равна 17%, напишите программу, которая вычисляет ваш вес на Луне.
 */

import java.util.Scanner;

class Task2 {
    private Scanner scanner;
    private int weight;
    private static int GRAVITY_MOON = 17;//%
    private static int GRAVITY_EARTH = 100;//%
    Task2(){
        scanner = new Scanner(System.in);
    }

    void enterAge(){
        System.out.println("Enter your weight");
        weight = scanner.nextInt();
    }

    int calculate(){
        double t = GRAVITY_EARTH / GRAVITY_MOON;
        return (int)(weight / t);
    }
}
