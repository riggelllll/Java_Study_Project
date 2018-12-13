package Java_help_ru;

public class Task12 {
    private static int SIZE = 3;
    private int[][] vals = {{2,3,4}, {3,4,5}, {3,4,5}};
    private int num;

    Task12(int num){
        this.num = num;
    }

    private void zeros(){
        for (int r = 0; r < SIZE; r++){
            for (int c = 0; c < SIZE; c++){
                vals[r][num] = 0;
            }
        }




    }

    private void showArray(){
        for (int r = 0; r < SIZE; r++){
            for (int c = 0; c < SIZE; c++){
                if (c == 2){
                    System.out.print(vals[r][c] + "\n");
                }else System.out.print(vals[r][c] + "   ");

            }
        }
        System.out.print("\n");
        System.out.print("\n");
    }

    void run(){
        showArray();
        zeros();
        showArray();
    }
}
