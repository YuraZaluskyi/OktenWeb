package phonebook;

import java.util.Scanner;

/*
* Пишемо програму для реїстрації юзерів і їх телефон. ном.
 (Тобто телефонну книгу)
 Данні які потрібно записувати:
    - ім'я
    - прізвище
    - тип контакту(напр. дом. ном. тел. або роб.)
    - ном. телефона(може бути декілька)
 Створити меню:
    - створити нового юзера
    - список юзерів
    - видалити юзера
    - змінити телефон
   - вивести всю тел. книгу
* */
public class Main {
    public static void main(String[] args) {

        ManagerPhonebook managerPhonebook = new ManagerPhonebook();
        Scanner sc = new Scanner(System.in);

        System.out.println("        *************************************");
        System.out.println("        *         -- H E L L O ! --         *");
        System.out.println("        *************************************");
        System.out.println("        -Choose what would you like to do :-)");
        System.out.println("");

        while (true) {
            menu();
            String chosen = sc.next();
            switch (chosen) {
                case "1":
                    managerPhonebook.addUser();
                    break;
                case "2":
                    managerPhonebook.printUsers();
                    break;
                case "3":
                    managerPhonebook.removeUser();
                    break;
                case "5":
                    managerPhonebook.printPhonebook();
                    break;
                case "6":
                    while (true) {
                        menuUser();
                        String chosenUser = sc.next();
                        switch (chosenUser) {
                            case "1":
                                managerPhonebook.addContactToList();
                                break;
                            case "2":
                                managerPhonebook.removeContactFromList();
                                break;
                            case "3":
                                managerPhonebook.printListContacts();
                                break;
                            case "5":
                                break;
                            default:
                                break;
                        }
                        break;
                    }
                    break;

                default:
                    return;
            }
        }

    }

    public static void menu() {
        System.out.println("        ***********************************");
        System.out.println("        *     -- Menu of Phone book --    *");
        System.out.println("        ***********************************");
        System.out.println("          1 - create new user");
        System.out.println("          2 - list users");
        System.out.println("          3 - remove user");
        System.out.println("          5 - print all phone book");
        System.out.println("          6 - user's menu");
        System.out.println("          EXIT - press any key");
    }

    public static void menuUser() {
        System.out.println("        ***********************************");
        System.out.println("        *     -- User's menu --         *");
        System.out.println("        ***********************************");
        System.out.println("           1 - add contact to user's list contacts");
        System.out.println("           2 - remove contact from user's list contacts");
        System.out.println("           3 - user's list contacts");
        System.out.println("           EXIT - press any key");

    }

}
