package ru.job4j.pojo;

import java.time.LocalDateTime;
import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFio("Gavrilov Andrey Aleksandrovich");
        student.setGroup("Group A");
        student.setIncoming(new Date());
        System.out.println(student.getFio());
        System.out.println(student.getGroup());
        System.out.println(student.getIncoming());
    }
}
