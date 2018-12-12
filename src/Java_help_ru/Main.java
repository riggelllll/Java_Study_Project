package Java_help_ru;

import java.io.IOException;

public class Main {

    public static void main(String[] args)throws IOException {

        Task2 task = new Task2();
        task.enterAge();
        System.out.println(task.calculate());
    }
}
