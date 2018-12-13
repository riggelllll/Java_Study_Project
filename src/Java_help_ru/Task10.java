package Java_help_ru;

import java.util.Arrays;

public class Task10 {
    private static int AMOUNT_WINNERS = 3;
    private String[] names = { "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex", "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate" };

    private int[] times = { 341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299, 343, 317, 265 };

    private int[] temp;

    private int[] winners;

    Task10(){
        winners = new int[3];
        temp = times.clone();
    }

    private void findWinners(){
        Arrays.sort(temp);
        winners[0] = getIndexByElement(temp[0]);
        winners[1] = getIndexByElement(temp[1]);
        winners[2] = getIndexByElement(temp[2]);
    }

    private void showWinners(){
        for (int i = 0; i < AMOUNT_WINNERS; i++){
            System.out.println(names[winners[i]]);
        }
    }

    private int getIndexByElement(int e){
        int index = 0;
        for (int i = 0; i < times.length; i++){
            if (e == times[i]) index = i;
        }
        return index;
    }

    void run(){
        findWinners();
        showWinners();
    }
}
