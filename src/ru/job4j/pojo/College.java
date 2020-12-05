package ru.job4j.pojo;

import java.util.Date;

public class College {

    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Пупкин Василий Сергеевич");
        student.setGroup("Матмех");
        student.setAdmissionDate(new Date());
        System.out.println(student.getFullName() + " поступил на " + student.getGroup() + " " + student.getAdmissionDate());
    }

}
