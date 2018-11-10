package book;

/////////////////////////////////////////////////////////////////////////////////////////////////////
/*
* 1)сворити клас для реєстрації книжки.
  поля:
    id
    назва книжки
    автор
    рік видання
 2)створити три масива довжиною 3 елементи:
    для дітей
    романи
    поезія
 3)створити масив "бібліотека" яка буде містити цих три масиви.
 4)створити метод який буде збільшувати масив на 3 елемента
  і перезаписувати значення з старого в новий автоматично
 5)створити меню для для реєстрації нової книги.
 В меню:
    зареєструвати книгу
    переглянути всі
    перегляд по жанрах
         перегляд по авторах -> так/ні
    перегляд по авторах
    перегляд по роках
    обрані книги (до трьох шт)
 при реєстрації перевіряти чи існує така книга, якщо так
 то повідомляти що вже така існує.
* */
/////////////////////////////////////////////////////////////////////////////////////////////////////////////


import java.util.Scanner;

public class Main {

    public static void main(String[] args){

//        Department department = new Department("science fiction");
//
//        Department department1 = new Department("poem");
//
//        department.addBook("qqq", "www", 2010);
//        department.addBook("aaa", "sss", 2011);
//        department.addBook("zzz", "xxx", 2012);
//        department.addBook("uuu", "lll", 2013);
//        department.addBook("qqq", "www", 2014);
//        department.addBook("aaa", "sss", 2015);
//        department.addBook("zzz", "xxx", 2016);
//        department.addBook("uuu", "lll", 2017);
//        department.addBook("qqq", "www", 2018);
//        department.addBook("aaa", "sss", 2019);
//        department.addBook("zzz", "xxx", 2020);
//        department.addBook("uuu", "lll", 2021);
//        department.addBook("qqq", "www", 2022);
//        department.addBook("aaa", "sss", 2023);
//        department.addBook("zzz", "xxx", 2024);
//        department.addBook("uuu", "lll", 2025);
//
//        department1.addBook("p1", "a1", 2000);
//        department1.addBook("p2", "a2", 2001);
//        department1.addBook("p3", "a3", 2002);
//        department1.addBook("p3", "a3", 2002);
//        department1.addBook("p3", "a3", 2002);
//        department1.addBook("p1", "a1", 2000);
//        department1.addBook("p2", "a2", 2001);
//        department1.addBook("p3", "a3", 2002);
//        department1.addBook("p3", "a3", 2002);
//        department1.addBook("p3", "a3", 2002);
//
//
//        System.out.println(department);
//        System.out.println(department.getCountBooks());
//        System.out.println(department.getBooks().length);
//        System.out.println("-------------------------------------------------------------------------");
//        System.out.println(department1);
//        System.out.println(department1.getCountBooks());
//        System.out.println(department1.getBooks().length);


//
        System.out.println("Hello!");

        LibraryManager libraryManager = new LibraryManager();
        Scanner sc = new Scanner(System.in);

//        libraryManager.addDepartToLibrary();
//        libraryManager.addDepatToLibrary();
//        libraryManager.addDepatToLibrary();

//        System.out.println(Library.getId());
//        System.out.println("--------------------------------------------------------------");
//        libraryManager.addBookToDepart();
//        System.out.println(libraryManager.library);
//        System.out.println("--------------------------------------------------------------");
//        System.out.println(Library.getId());
//        libraryManager.addBookToDepart();
//        System.out.println(libraryManager.library);
//        libraryManager.addBookToDepart();
//        libraryManager.addBookToDepart();
//        System.out.println(libraryManager.library);

        while (true){
            menu();
            String chosen = sc.next();
            switch (chosen){
                case "1":
                    libraryManager.printDeparts();
                    break;
                case "2":
                    libraryManager.allInfBooksLibrary();
                    break;
                case "3":
                    libraryManager.addBookToDepart();
                    break;
                case "4":
                    libraryManager.addDepartToLibrary();
                    break;
                case "5":
                    libraryManager.printAuthors();
                    break;
                case "6":
                    libraryManager.printYearPubl();
                    break;
                case "7":
                    libraryManager.printTitle();
                    break;
                default:
                    return;
            }

        }

    }

    public static void menu(){
        System.out.println("*****************************************************************");
        System.out.println("          1 - print departments of library");
        System.out.println("          2 - print all books from library");
        System.out.println("          3 - add book to library");
        System.out.println("          4 - add department to library");
        System.out.println("          5 - print books by author");
        System.out.println("          6 - print books by year published");
        System.out.println("          7 - print books by title");
        System.out.println("          8 - EXIT");
        System.out.println("*****************************************************************");

    }

}