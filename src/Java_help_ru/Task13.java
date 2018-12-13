package Java_help_ru;

import java.util.Scanner;

public class Task13 {
    Scanner scanner;
    String name;

    Task13(){
        scanner = new Scanner(System.in);
    }

    private void enterName(){
        System.out.println("Enter your name");
        name = scanner.nextLine();
    }

    private void showName(){
        System.out.println("Your name is " + name);
    }

    void run(){
        enterName();
        showName();
    }
}
