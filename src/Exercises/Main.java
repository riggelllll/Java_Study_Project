package Exercises;

import Exercises.prime_factorization.Factor;

public class Main {
    public static void main(String[] args) {
        Factor factor = new Factor();
        System.out.println(factor.getFactors(27).toString());
    }
}
