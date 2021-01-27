package service;

import bean.Book;

public class BookDemo {
    public static void main(String[] args) {
        Book book1 = new Book("Gogol", "Revizor", 500);
        System.out.println(book1);
        Book book2 = new Book("Gogol", "Vij", 400);
        System.out.println(book2);
    }
}