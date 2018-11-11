package book;

import java.util.Scanner;

public class LibraryManager {

    Library library = new Library();
    Scanner sc = new Scanner(System.in);

    public LibraryManager(Library library, Scanner sc) {
        this.library = library;
        this.sc = sc;
    }

    public LibraryManager(Library library) {
        this.library = library;
    }

    public LibraryManager() {
    }

    public Library getLibrary() {
        return library;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }

//    methods_________________________________________________________________________________________________

    //    add department to library
    public void addDepartToLibrary() {
        System.out.println("Enter title of department");
        String title = sc.next();
        library.addDepartment(title);
    }

    //    add book to library
    public void addBookToDepart() {
        System.out.println("Enter title of department");
        String titleDepart = sc.next();
        System.out.println("Enter title of book");
        String titleBook = sc.next();
        System.out.println("Enter name of author");
        String nameAuthor = sc.next();
        System.out.println("Enter year of publication");
        int yearPubl = sc.nextInt();
        library
                .getDepartByTitle(titleDepart)
                .addBook(titleBook, nameAuthor, yearPubl);
    }

    //    print departments from library
    public void printDeparts() {
        library.printDepartments();

    }

    //    print all information about books from library
    public void allInfBooksLibrary() {
        library.printAllInfLibrary();
    }

    //    print books by author
    public void printAuthors() {
        System.out.println("Enter title of department");
        String departTitle = sc.next();
        library
                .getDepartByTitle(departTitle)
                .printAuthor();
    }


    //    print books by year published
    public void printYearPubl() {
        System.out.println("Enter title of department");
        String departTitle = sc.next();
        library
                .getDepartByTitle(departTitle)
                .printYearPubl();
    }

    //    print books by title
    public void printTitle() {
        System.out.println("Enter title of department");
        String departTitle = sc.next();
        library
                .getDepartByTitle(departTitle)
                .printTitle();
    }

    //    add book to basket
    public void addBookToBasket() {
        System.out.println("Enter title of department");
        String departTitle = sc.next();
        System.out.println("Enter title of book");
        String titleBook = sc.next();
        System.out.println("Enter name of author");
        String nameAuthor = sc.next();
        library.addBookToBasket(departTitle, titleBook, nameAuthor);
    }

    //    print books from baskets
    public void printBooksBasket() {
        library.printBooksBasket();
    }


}
