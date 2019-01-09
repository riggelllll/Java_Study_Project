package Exercises.prime_factorization;

import java.util.ArrayList;

public class Factor {
    public ArrayList<Integer> getFactors(int num){
        ArrayList<Integer> res = new ArrayList<>();
        int divider = 2;
        while (num != 1) {
            if (num % divider == 0) {
                res.add(divider);
                num /= divider;
            } else divider++;
        }
        return res;
    }
}
