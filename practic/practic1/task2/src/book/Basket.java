package book;

import java.util.Arrays;

public class Basket {

    private Book[] books = new Book[2];
    private int countBooks = 0;

    public Basket() {
    }

    public Basket(Book[] books) {
        this.books = books;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public int getCountBooks() {
        return countBooks;
    }

    //    add book to basket
    public void addBookBasket(Book book) {
        books[countBooks] = book;
        countBooks++;
    }

    //    print books from basket
    public void prinBooks() {
        for (int i = 0; i < countBooks; i++) {
            System.out.println("TITLE - " + getBooks()[i].getTitle() + " AUTHOR - " + getBooks()[i].getAuthor());
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Basket)) return false;

        Basket basket = (Basket) o;

        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(getBooks(), basket.getBooks());
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(getBooks());
    }

    @Override
    public String toString() {
        return "Basket{" +
                "books=" + Arrays.toString(books) +
                '}';
    }
}
