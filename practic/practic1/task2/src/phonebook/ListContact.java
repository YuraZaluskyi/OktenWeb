package phonebook;

import java.sql.Connection;
import java.util.HashSet;
import java.util.Iterator;

public class ListContact {
    private HashSet<Contact> listContact = new HashSet<>() ;
    private Iterator<Contact> iterator;

    public ListContact() {
    }

    public ListContact(HashSet listContact) {
        this.listContact = listContact;
    }

//    ________________________________________________________________________________________________________


    public HashSet<Contact> getListContact() {
        return listContact;
    }

    public void setListContact(HashSet<Contact> listContact) {
        this.listContact = listContact;
    }

    public Iterator<Contact> getIterator() {
        return iterator;
    }

    public void setIterator(Iterator<Contact> iterator) {
        this.iterator = iterator;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ListContact)) return false;

        ListContact that = (ListContact) o;

        return getListContact() != null ? getListContact().equals(that.getListContact()) : that.getListContact() == null;
    }

    @Override
    public int hashCode() {
        return getListContact() != null ? getListContact().hashCode() : 0;
    }

//    methods_______________________________________________________________________________________________
//    1. add contact to list contacts
    public void addContact(Contact contact){
        listContact.add(contact);
    }

//    add contact to list contacts
    public void addContact(String numberPhone, String type){
        listContact.add(new Contact(numberPhone, type));
    }

//    2. remove contact from listContact
    public void removeContact(Contact contact){
        listContact.remove(contact);
    }

//    3. remove contact from listContact by number phone
    public void removeContact(String numberPhone){
        iterator = listContact.iterator();
        while(iterator.hasNext()){
            Contact next = iterator.next();
            if(next.getNumberPhone().equals(numberPhone)){
                iterator.remove();
            }
        }
    }

//    4. print contacts
    public void printContacts(){
        iterator = listContact.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    @Override
    public String toString() {
        return "ListContact{" +
                "listContact=" + listContact +
                '}';
    }
}
