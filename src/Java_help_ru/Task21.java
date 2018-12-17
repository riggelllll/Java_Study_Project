package Java_help_ru;

import java.util.Scanner;

public class Task21 {
    protected int num;
    protected int[]arr;
    protected Scanner scanner;

    Task21(){
        scanner = new Scanner(System.in);
    }
    protected void enterNum(){
        System.out.println("Введите число");
        num = scanner.nextInt();
        arr = new int[Integer.toString(num).length()];
    }
    protected void convertToArr(){
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
