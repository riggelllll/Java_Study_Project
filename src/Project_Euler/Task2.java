package Project_Euler;

/**
 * Каждый следующий элемент ряда Фибоначчи получается при сложении двух предыдущих. Начиная с 1 и 2, первые 10 элементов будут:
 * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 * Найдите сумму всех четных элементов ряда Фибоначчи, которые не превышают четыре миллиона.
 */
public class Task2 {

    public static void main(String[] args) {

        int fiboSize = 4_000_000;
        long[] fibonacci =  new long[fiboSize];
        fibonacci[0] = 1;
        fibonacci[1] = 2;





        for (int i = 2; i < 300; i++){
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            System.out.println(fibonacci[i]);
        }

    }
}


