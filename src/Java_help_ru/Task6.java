package Java_help_ru;

import java.util.Random;
import java.util.Scanner;

public class Task6 {
    private Scanner reader;
    private Random random;
    private char randomSymbol, inputSymbol;
    private String alphabet = "abcdefghijklmnopqrstuvwxyz";
    private boolean isWork = true;

    Task6(){
        reader = new Scanner(System.in);
        random = new Random();
    }

    private void enterSymbol(){
        System.out.println("Введите букву");
        inputSymbol = reader.next().charAt(0);
    }

    private void generateSymbol(){
        int t = random.nextInt(alphabet.length());
        randomSymbol = alphabet.charAt(t);
    }

    void run(){
        intro();
        generateSymbol();
        enterSymbol();
        while (isWork){
            if (inputSymbol == randomSymbol){
                System.out.println("Вы угадали");
                isWork = false;
            }else {
                System.out.println("Вы не угадали, попробуйте еще.");
                System.out.println(getHint());
                enterSymbol();
            }
        }
    }

    private String getHint(){
        int posRandomChar = alphabet.indexOf(randomSymbol);
        int posInputSymbol = alphabet.indexOf(inputSymbol);
        return (posInputSymbol > posRandomChar) ? "Ваша буква больше" : "Ваша буква меньше";
    }

    private void intro(){
        System.out.println("Ты готов сыграть в игру?");
    }
}
