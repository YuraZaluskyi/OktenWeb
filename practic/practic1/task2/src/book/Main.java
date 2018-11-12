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

    public static void main(String[] args) {

        LibraryManager libraryManager = new LibraryManager();
        Scanner sc = new Scanner(System.in);

        System.out.println("Hello!");
        while (true) {
            menu();
            String chosen = sc.next();
            switch (chosen) {
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
                case "8":
                    libraryManager.addBookToBasket();
                    break;
                case "9":
                    libraryManager.printBooksBasket();
                    break;
                default:
                    return;
            }

        }

    }

    public static void menu() {
        System.out.println("*****************************************************************");
        System.out.println("          1 - print departments of library");
        System.out.println("          2 - print all books from library");
        System.out.println("          3 - add book to library");
        System.out.println("          4 - add department to library");
        System.out.println("          5 - print books by author");
        System.out.println("          6 - print books by year published");
        System.out.println("          7 - print books by title");
        System.out.println("          8 - add book to basket");
        System.out.println("          9 - print books from basket");
        System.out.println("          EXIT - pres any key! ;-)");
        System.out.println("*****************************************************************");

    }

}