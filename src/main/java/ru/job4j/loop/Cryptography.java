package ru.job4j.loop;

public class Cryptography {
    public static String code(String s) {
        StringBuilder stringBuilder = new StringBuilder(s);
        if (stringBuilder.length() > 4) {
            for (int i = 0; i < stringBuilder.length() - 4; i++) {
                stringBuilder.setCharAt(i, '#');
            }
        }
        if (s.isEmpty()) {
            return "empty";
        }
        return String.valueOf(stringBuilder);
    }
}
