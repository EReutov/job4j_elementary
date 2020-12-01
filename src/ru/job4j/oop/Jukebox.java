package ru.job4j.oop;

public class Jukebox {
    private String[] catalog = {
                                "Пусть бегут неуклюже, пешеходы по лужам...",
                                "Спят усталые игрушки, книжки спят..."
                                };

    public void music(int position) {
        if (position == 1) {
            System.out.println(catalog[0]);
        } else if (position == 2) {
            System.out.println(catalog[1]);
        } else {
            System.out.println("Песня не найдена");
        }
    }

    public static void main(String[] args) {
        Jukebox jukebox = new Jukebox();
        jukebox.music(1);
        jukebox.music(2);
        jukebox.music(3);
    }
}
