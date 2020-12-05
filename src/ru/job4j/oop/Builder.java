package ru.job4j.oop;

public class Builder extends Engineer {

    private String specialty;

    public Builder(String name, String surname, String education, String birthday, String specialty) {
        super(name, surname, education, birthday);
        this.specialty = specialty;
    }

    public String typeOfBuilding(String specialty) {
        return specialty; //как заглушка пока
        }

}
