package ru.job4j.oop;

public class Programmer extends Engineer {

    private int bugs;

    public Programmer(String name, String surname, String education, String birthday, int bugs) {
        super(name, surname, education, birthday);
        this.bugs = bugs;
    }

    public void work(Programm programm) {

    }
}
