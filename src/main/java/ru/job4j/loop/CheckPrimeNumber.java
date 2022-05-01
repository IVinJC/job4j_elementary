package ru.job4j.loop;

public class CheckPrimeNumber {

    public static boolean check(int number) {
        if (number < 2) {
            return false;
        }
        boolean prime = true;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }

    public static void main(String[] args) {
        for (int i = 1; i < 200; i++) {
            System.out.println(i + " " + check(i));
        }
    }
}