package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year = 0;
        double ostatok = 1;
        while (ostatok > 0) {
   ostatok = (amount * percent * 0.01 + amount) - salary;
   amount = ostatok;
   year++;
        }
        return year;
    }
}
