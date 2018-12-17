package Java_help_ru;

import java.util.Scanner;

public class Task21 {
    private int num;
    private int[]arr;
    private Scanner scanner;

    Task21(){
        scanner = new Scanner(System.in);
    }
    private void enterNum(){
        System.out.println("Введите число");
        num = scanner.nextInt();
        arr = new int[Integer.toString(num).length()];
    }
    private void convertToArr(){
       for (int i = arr.length-1; i >= 0; i--){
            arr[i] = num % 10;
            num = num/10;
       }
    }
    private void showArr(){
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    void run(){
        enterNum();
        convertToArr();
        showArr();
    }
}
