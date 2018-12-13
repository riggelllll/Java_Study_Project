package Java_help_ru;

public class Task19 {
    private int[][]in = {{1,2,3},{4,5,6}, {7,8,9}};
    private int[][]out;
    Task19(){
        out = new int[3][3];
    }
    private void convert(){
        for (int r = 0; r < in.length; r++){
            for (int c = 0; c < in.length; c++){
                out[c][r] = in[r][c];
            }
        }
    }

    private void showArray(int arr[][]){
        for (int r = 0; r < arr.length; r++){
            for (int c = 0; c < arr.length; c++){
                if (c == arr.length-1){
                    System.out.print(arr[r][c] + "\n");
                }else System.out.print(arr[r][c] + "   ");

            }
        }
        System.out.print("\n");
        System.out.print("\n");
    }

    void run(){
        showArray(in);
        convert();
        showArray(out);
    }
}
