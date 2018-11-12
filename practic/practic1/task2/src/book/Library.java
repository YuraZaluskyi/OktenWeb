package book;

import java.util.Arrays;

public class Library {

    private Department[] departments = new Department[0];
    private int countDepart = 0;
    private static int id = 0;
    private Basket basket = new Basket();


    public Library() {
    }

    public Library(Department[] departments) {
        this.departments = departments;
    }


    public Department[] getDepartments() {
        return departments;
    }

    public void setDepartments(Department[] departments) {
        this.departments = departments;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Library.id = id;
    }

    public Basket getBasket() {
        return basket;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }

    //    methods______________________________________________________________________________________________
//  add department to library

    public void addDepartment(String title) {
        if (countDepart == departments.length) {
            expendArr();
        }
        departments[countDepart] = new Department(title);
        countDepart++;
    }

    //    expands array to one element if array is filled
    private void expendArr() {
        Department[] newArr = new Department[departments.length + 1];
        System.arraycopy(departments, 0, newArr, 0, departments.length);
        departments = newArr;
    }

    //    get department from library by title
    public Department getDepartByTitle(String title) {
        for (int i = 0; i < departments.length; i++) {
            if (departments[i].getTitle().equals(title)) {
                return departments[i];
            }
        }
        return null;
    }

    //    print departments
    public void printDepartments() {
        for (Department department : departments) {
            System.out.println(department.getTitle());
        }
    }

    //    print all information about books from library
    public void printAllInfLibrary() {
        for (Department department : departments) {
            department.printAllInfDepart();
        }
    }

    //    find department by title
    public Department findDepart(String title) {
        for (int i = 0; i < departments.length; i++) {
            if (departments[i].getTitle().equals(title)) {
                return departments[i];
            }
        }
        return null;
    }


    public void addBookToBasket(String titleDepart, String titleBook, String author) {
        Book borrowedBook = findDepart(titleDepart).findBook(titleBook, author);
        if (basket.getCountBooks() == 3) {
            System.out.println("You can not take more than three books!!!");
            return;
        } else if (borrowedBook.isStatus()) {
            getBasket().addBookBasket(borrowedBook);
            borrowedBook.setStatus(false);
        } else if (borrowedBook.isStatus() == false) {
            System.out.println("This book was borrowed");
        }
    }


    //    print books from basket
    public void printBooksBasket() {
        getBasket().prinBooks();
    }


    @Override
    public String toString() {
        return "Library{" +
                "departments=" + Arrays.toString(departments) +
                '}';
    }
}
