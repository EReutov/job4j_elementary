package ru.job4j.pojo;

public class Library {

    public static void main(String[] args) {
        Book book1 = new Book("Война и Мир", 1200);
        Book book2 = new Book("Тихий дон", 1600);
        Book book3 = new Book("Преступление и наказание", 330);
        Book book4 = new Book("Clean code", 400);
        Book[] books = new Book[4];
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;
        for (int index = 0; index < books.length; index++) {
            System.out.println(books[index].getName() + " - " + books[index].getPages());
        }
        Book reserved = books[0];
        books[0] = books[3];
        books[3] = reserved; //или можно было просто напрямую созданные ранее объяекты присвоить?
        for (int index = 0; index < books.length; index++) {
            if (books[index].getName().equals("Clean code")) {
                System.out.println(books[index].getName() + " - " + books[index].getPages());
            }
        }
    }

}
