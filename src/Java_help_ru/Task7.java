package Java_help_ru;

import java.util.ArrayList;

class Task7 {
    private static int MIN = 2;
    private static int MAX = 100;
    private ArrayList<Integer> simpleNums;

    Task7(){
        simpleNums = new ArrayList<>();
    }

    void findSimpleNums(){
        for (int i = MIN; i < MAX; i++){
            if (isSimpleNum(i))simpleNums.add(i);
        }
    }

    //Метод реализован с помощью алгоритма ПЕРЕБОРА ДЕЛИТЕЛЕЙ.
    private boolean isSimpleNum(int num){
        if (num <= 1) return false;
        int i = 2;
        int j = 0;

        while ((i*i <= num) && (j != 1)){
            if (num % i == 0){
                j = 1;
                i = i + 1;
            }else i = i + 1;
        }
        return (j == 1) ? false : true;
    }

    private void showNums(){
        for (int e : simpleNums){
            System.out.println(e);
        }
    }

    void run(){
        findSimpleNums();
        showNums();
    }

}
