package phonebook;

public class Contact {
    private String numberPhone;
    private String type;

    public Contact() {
    }

    public Contact(String numberPhone, String type) {
        this.numberPhone = numberPhone;
        this.type = type;
    }

//    __________________________________________________________________________________________________________

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contact)) return false;

        Contact contact = (Contact) o;

        if (getNumberPhone() != null ? !getNumberPhone().equals(contact.getNumberPhone()) : contact.getNumberPhone() != null)
            return false;
        return getType() != null ? getType().equals(contact.getType()) : contact.getType() == null;
    }

    @Override
    public int hashCode() {
        int result = getNumberPhone() != null ? getNumberPhone().hashCode() : 0;
        result = 31 * result + (getType() != null ? getType().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "numberPhone='" + numberPhone + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
