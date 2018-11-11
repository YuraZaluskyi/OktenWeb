package book;

import java.util.Arrays;

public class Department {

    private String title;
    private Book[] books = new Book[0];
    private int countBooks = 0;

    public Department() {
    }

    public Department(String title) {
        this.title = title;
    }

    public Department(String title, Book[] books) {
        this.title = title;
        this.books = books;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    //    methods__________________________________________________________________________________________
//    add book to department

    public void addBook(String title, String author, int yearPubl) {
        if (countBooks == books.length) {
            expandArr();
        }
        int id = Library.getId();
        books[countBooks] = new Book(id, title, author, yearPubl);
        isExistsBook(books[countBooks]);
        id++;
        Library.setId(id);
        countBooks++;
    }

    //  expands array to one element if array is filled
    private void expandArr() {
        Book[] newArr = new Book[books.length + 1];
        System.arraycopy(books, 0, newArr, 0, books.length);
        books = newArr;
    }

    //    if book already exists
    public void isExistsBook(Book book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].equals(book)) {
                System.out.println("Book already exists!");
                return;
            }
        }
    }

    //    find book by title and author
    public Book findBook(String title, String author) {
        for (int i = 0; i < books.length; i++) {
            if ((books[i].getTitle().equals(title)) && (books[i].getAuthor().equals(author))) {
                return books[i];
            }
        }
        return null;
    }

    //    print books by author
    public void printAuthor() {
        for (Book book : books) {
            System.out.println(book.getAuthor());
        }
    }

    //    print books by year
    public void printYearPubl() {
        for (Book book : books) {
            System.out.println(book.getYearPubl());
        }
    }

    //    print books by title
    public void printTitle() {
        for (Book book : books) {
            System.out.println(book.getTitle());
        }
    }

    //    print all information of books from department
    public void printAllInfDepart() {
        for (Book book : books) {
            System.out.println("Title - "
                    + book.getTitle() + "  Author - "
                    + book.getAuthor() + " Year published - "
                    + book.getYearPubl());
        }
    }

    @Override
    public String toString() {
        return "Department{" +
                "title='" + title + '\'' +
                ", books=" + Arrays.toString(books) +
                '}';
    }
}
