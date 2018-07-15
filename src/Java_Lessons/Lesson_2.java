package Java_Lessons;

/**
 * Типы данных , переменные и массивы
 */
public class Lesson_2 {

    //Типы данных
    private static byte aByte = 5;
    private static short aShort = 32000;
    private static int aInt = 4567743;
    private static int aD = 0b0100;
    private static int aX = 0x8abc;
    private static double aE = 23e+100;
    private static float aFloat = (float) 45.5;
    private static double aDouble = 67.6757567;
    private static char aChar = 'q';
    private static boolean aBoolean = true;


    public static void main(String[] args) {

        //Преобразование long в int
        int a = 20;
        long b = 30000;
        a = (int)b;
        //

        int arr[]; //Обьявили массив
        arr = new int[10]; // выделили память под 10 членов массива

        //Инициализация массива при обьявлении
        int arr1[] = {20,40,50};
        //


        System.out.println(a);
    }
}
