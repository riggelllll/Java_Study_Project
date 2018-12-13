package Java_help_ru;

import java.util.Random;

public class Task18 {
    private static int SIZE = 5;
    private int[][] vals;
    private int[] res;
    private Random random;

    Task18(){
        vals = new int[SIZE][SIZE];
        res = new int[SIZE*SIZE];
        random = new Random();
    }

    private void generateVals(){
        for (int r = 0; r < SIZE; r++){
            for (int c = 0; c < SIZE; c++){
                vals[r][c] = random.nextInt(100);
            }
        }
    }

    private void convertArr(){
        int i = 0;
        for (int r = 0; r < SIZE; r++){
            for (int c = 0; c < SIZE; c++){
                res[i] = vals[r][c];
                i++;
            }
        }
    }

    private void show1Arr(){
        for (int i = 0; i < res.length; i++){
            System.out.print(res[i] + " ");
        }
    }

    private void show2Arr(){
        for (int r = 0; r < SIZE; r++){
            for (int c = 0; c < SIZE; c++){
                if (c == SIZE-1){
                    System.out.print(vals[r][c] + "\n");
                }else System.out.print(vals[r][c] + "   ");
            }
        }
        System.out.print("\n");
        System.out.print("\n");
    }



    void run(){
        generateVals();
        show2Arr();
        convertArr();
        show1Arr();
    }
}
