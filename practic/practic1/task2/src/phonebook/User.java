package phonebook;

public class User implements Comparable<User> {
    private String firstName;
    private String surname;

    public User() {
    }

    public User(String firstName, String surname) {
        this.firstName = firstName;
        this.surname = surname;
    }

//    _____________________________________________________________________________________________________

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firsrName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;

        User user = (User) o;

        if (getFirstName() != null ? !getFirstName().equals(user.getFirstName()) : user.getFirstName() != null)
            return false;
        return getSurname() != null ? getSurname().equals(user.getSurname()) : user.getSurname() == null;
    }

    @Override
    public int hashCode() {
        int result = getFirstName() != null ? getFirstName().hashCode() : 0;
        result = 31 * result + (getSurname() != null ? getSurname().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    @Override
    public int compareTo(User o) {
        return this.getSurname().compareTo(o.getSurname());
    }
}
