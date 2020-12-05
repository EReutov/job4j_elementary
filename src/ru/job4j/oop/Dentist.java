package ru.job4j.oop;

public class Dentist extends Doctor {

    private int tooth;

    public Dentist(String name, String surname, String education, String birthday, int tooth) {
        super(name, surname, education, birthday);
        this.tooth = tooth;
    }

    public void toothRemove() {
        //System.out.println("I remove " + tooth + " teeth today");
    }

}
