package book;

import java.util.Arrays;

public class Library {

    private Department[] departments = new Department[0];
    private int countDepart = 0;
    private static int id = 0;

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

//    //  expands array to one element if array is filled
//    private void expandArr() {
//        Book[] newArr = new Book[books.length + 1];
//        System.arraycopy(books, 0, newArr, 0, books.length);
//        books = newArr;
//    }


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


    @Override
    public String toString() {
        return "Library{" +
                "departments=" + Arrays.toString(departments) +
                '}';
    }
}
