package phonebook;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Phonebook {
    private TreeMap<User, ListContact> phoneBook = new TreeMap<>();
    private Iterator<Map.Entry<User, ListContact>> iterator;
    private Set<Map.Entry<User, ListContact>> entrySet;
    private Map.Entry<User, ListContact> next;


    public Phonebook() {
    }

    public Phonebook(TreeMap<User, ListContact> phoneBook) {
        this.phoneBook = phoneBook;
    }

//    _____________________________________________________________________________________________________________


    public TreeMap<User, ListContact> getPhoneBook() {
        return phoneBook;
    }

    public void setPhoneBook(TreeMap<User, ListContact> phoneBook) {
        this.phoneBook = phoneBook;
    }

    public Iterator<Map.Entry<User, ListContact>> getIterator() {
        return iterator;
    }

    public void setIterator(Iterator<Map.Entry<User, ListContact>> iterator) {
        this.iterator = iterator;
    }

    public Set<Map.Entry<User, ListContact>> getEntrySet() {
        return entrySet;
    }

    public void setEntrySet(Set<Map.Entry<User, ListContact>> entrySet) {
        this.entrySet = entrySet;
    }

    public Map.Entry<User, ListContact> getNext() {
        return next;
    }

    public void setNext(Map.Entry<User, ListContact> next) {
        this.next = next;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Phonebook)) return false;

        Phonebook phonebook = (Phonebook) o;

        return getPhoneBook() != null ? getPhoneBook().equals(phonebook.getPhoneBook()) : phonebook.getPhoneBook() == null;
    }

    @Override
    public int hashCode() {
        return getPhoneBook() != null ? getPhoneBook().hashCode() : 0;
    }

    //    methods_____________________________________________________________________________________________________
//    1. add user to phone book
    public void addUser(User user, ListContact listContact) {
        phoneBook.put(user, listContact);
    }

    //   2. add user to phone book
    public void addUser(User user) {
        phoneBook.put(user, new ListContact());
    }

    //    3. remove user from phone book
    public void removeUser(User user) {
        phoneBook.remove(user);
    }

    //    4. print list users
    public void printUsers() {
        entrySet = phoneBook.entrySet();
        iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().getKey());
        }
    }

    //   5. print all phone book
    public void printPhonebook() {
        System.out.println(phoneBook);
    }

    //  6. add contact to user's contact
    public void findUser(String firstName, String surname, String numberPhone, String type) {
        entrySet = phoneBook.entrySet();
        iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            next = iterator.next();
            if ((next.getKey().getSurname().equals(surname)) && (next.getKey().getFirstName().equals(firstName))) {
                next.getValue().addContact(numberPhone, type);
            }
        }
    }


    //  7. get user's list contacts
    private ListContact getListContact(String firstName, String surname) {
        entrySet = phoneBook.entrySet();
        iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            next = iterator.next();
            if ((next.getKey().getSurname().equals(surname)) && (next.getKey().getFirstName().equals(firstName))) {
                return next.getValue();
            }
        }
        return null;
    }

    // 8. add contact to user's list contact
    public void addContactToList(String firstName, String surname, String numberPhone, String type) {
        getListContact(firstName, surname).addContact(numberPhone, type);
    }

    //  9. remove contact from user's list contact
    public void removeContactFromList(String firstName, String surname, String numberPhone) {
        getListContact(firstName, surname).removeContact(numberPhone);
    }

    //  10. print list user's contacts
    public void printListContacts(String firstName, String surname) {
        getListContact(firstName, surname).printContacts();
    }


    //  11. remove user from from phone book by first name and surname
    public void removeUser(String firstName, String surname) {
        entrySet = phoneBook.entrySet();
        iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            next = iterator.next();
            if ((next.getKey().getFirstName().equals(firstName)) && (next.getKey().getSurname().equals(surname))) {
                iterator.remove();

            }
        }
    }


    @Override
    public String toString() {
        return "phonebook{" +
                "phoneBook=" + phoneBook +
                '}';
    }

}
