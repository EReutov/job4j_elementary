package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        int j = 0;
        for (int i = 0; i < post.length - 1; i++) {
            if (post[post.length - 1 - i] != word[word.length - 1 - j]) {
                result = false;
            }
            j++;
        }
        return result;
    }
}
