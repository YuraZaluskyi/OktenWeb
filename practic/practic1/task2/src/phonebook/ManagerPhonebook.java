package phonebook;

import java.util.Scanner;

public class ManagerPhonebook {

    private Phonebook phonebook = new Phonebook();
    private Scanner sc = new Scanner(System.in);

    public ManagerPhonebook() {
    }

//    methods_____________________________________________________________________________________________

    //    1. add new user to phone book
    public void addUser() {
        System.out.println("Add new user to phone book");
        System.out.println("");
        System.out.print("Enter your first name - ");
        String firstName = sc.next();
        System.out.println("");
        System.out.print("Enter your surname - ");
        String surname = sc.next();
        System.out.println("");
        phonebook.addUser(new User(firstName, surname), new ListContact());
        System.out.println("--new user was successfully created :-)");
        System.out.println("");
    }

    //    2. remove user by first name and surname
    public void removeUser() {
        System.out.println("Remove user from phone book");
        System.out.println("");
        System.out.print("Enter first name - ");
        String firstName = sc.next();
        System.out.println("");
        System.out.print("Enter surname - ");
        String surname = sc.next();
        System.out.println("");
        phonebook.removeUser(firstName, surname);
        System.out.println("--user was successfully removed :-)");
        System.out.println("");
    }

    //    3. print list users
    public void printUsers() {
        phonebook.printUsers();
    }


    //    4. add contact to list
    public void addContactToList() {
        System.out.print("Enter first name - ");
        String firstName = sc.next();
        System.out.println("");
        System.out.print("Enter surname - ");
        String surname = sc.next();
        System.out.println("");
        System.out.println("enter number phone - ");
        String numberPhone = sc.next();
        System.out.println("enter type of contact - ");
        String type = sc.next();
        phonebook.addContactToList(firstName, surname, numberPhone, type);
        System.out.println("Would you like to add one more contact ?");
        System.out.println("1 - YES, any key - NO");
        String ch = sc.next();
        while (ch.equals("1")){
            System.out.println("enter number phone - ");
            String numberPhoneOneMore = sc.next();
            System.out.println("enter type of contact - ");
            String typeOneMore = sc.next();
            phonebook.addContactToList(firstName, surname, numberPhoneOneMore, typeOneMore);
            System.out.println("Would you like to add one more contact ?");
            System.out.println("1 - YES, any key - NO");
            String chOneMore = sc.next();
            if(!chOneMore.equals("1")){
                break;
            }
        }
    }

//    5. remove contact from list
    public void removeContactFromList(){
        System.out.print("Enter first name - ");
        String firstName = sc.next();
        System.out.println("");
        System.out.print("Enter surname - ");
        String surname = sc.next();
        System.out.println("");
        System.out.println("enter number phone - ");
        String numberPhone = sc.next();
        phonebook.removeContactFromList(firstName, surname, numberPhone);
        System.out.println("Would you like to remove one more contact ?");
        System.out.println("1 - YES, any key - NO");
        String ch = sc.next();
        while (ch.equals("1")){
            System.out.println("enter number phone - ");
            String numberPhoneOneMore = sc.next();
            phonebook.removeContactFromList(firstName, surname, numberPhone);
            System.out.println("Would you like to remove one more contact ?");
            System.out.println("1 - YES, any key - NO");
            String chOneMore = sc.next();
            if(!chOneMore.equals("1")){
                break;
            }
        }
    }


//    5. print user's list contacts
    public void printListContacts(){
        System.out.print("Enter first name - ");
        String firstName = sc.next();
        System.out.println("");
        System.out.print("Enter surname - ");
        String surname = sc.next();
        System.out.println("");
        phonebook.printListContacts(firstName, surname);
    }

//    print all phone book
    public void printPhonebook(){
        phonebook.printPhonebook();
    }


}
