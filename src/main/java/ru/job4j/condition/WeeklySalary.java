package ru.job4j.condition;

public class WeeklySalary {
    public static int calculate(int[] hours) {
        int earn = 0;
        for (int i = 0; i < 5; i++) {
            if (hours[i] > 8 && hours[i] != 0) {
                earn += (hours[i] - 8) * 15 + 80;
            } else if (hours[i] <= 8 && hours[i] != 0) {
                earn += hours[i] * 10;
            }
        }
        for (int j = 5; j <= 6; j++) {
            if (hours[j] > 8 && hours[j] != 0) {
                earn += (hours[j] - 8) * 30 + 160;
            } else if (hours[j] <= 8 && hours[j] != 0) {
                earn += hours[j] * 20;
            }
        }

        return earn;
    }
}
