package Java_help_ru;

public class Task16 {
    private int num;
    private int[] table = {1,2,3,4,5,6,7,8,9};

    Task16(int num){
        this.num = num;
    }

    private void showTable(){
        for (int i = 0; i < table.length; i++){
            System.out.println(num + " x " + table[i] + " = " + (num*table[i]));
        }
    }

    void run(){
        showTable();
    }
}
