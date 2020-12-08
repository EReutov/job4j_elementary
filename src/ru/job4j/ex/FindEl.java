package ru.job4j.ex;

public class FindEl {

    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        int i = 0;
        for (String s :value) {
            if (s.equals(key)) {
                rsl = i;
                break;
            }
            i++;
        }
        if (rsl == -1) {
            throw new ElementNotFoundException("Element '" + key + "' not found");
        }
        return rsl;
    }

    public static void main(String[] args) {
        try {
            System.out.println(indexOf(new String[]{"1", "2", "3", "4"}, "33"));
        } catch (ElementNotFoundException ex) {
            ex.printStackTrace();
        }
    }

}
