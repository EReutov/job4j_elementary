package ru.job4j.oop;

public class Surgeon extends Doctor {

    private int dead;
    private int cured;

    public Surgeon(String name, String surname, String education, String birthday, int dead, int cured) {
        super(name, surname, education, birthday);
        this.dead = dead;
        this.cured = cured;
    }

    public void introduce() {
       // System.out.println("Iam a Surgeon!");
    }

}
