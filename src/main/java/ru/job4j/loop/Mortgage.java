package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year = 1;
        double loanbalance = (amount + amount * percent * 0.01) - salary;
        while (loanbalance > 0) {
            year++;
            loanbalance -= salary;
        }
        return year;
    }
}
