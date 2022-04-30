package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = true;
        for (int i = 2; i > -2; i--) {
            if (number % 2 == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }
}