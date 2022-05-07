package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void drive() {
        System.out.println("I am driving");
    }

    @Override
    public void passangers(int number) {
        number++;
    }

    @Override
    public double refuel(int volume) {
        double price = volume * 51.13;
        return price;
    }
}
