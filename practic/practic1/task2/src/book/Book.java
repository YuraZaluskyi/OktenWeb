package book;

public class Book {
    private int id;
    private String title;
    private String author;
    private int yearPubl;
    private boolean status = true;

    public Book() {
    }

    public Book(int id, String title, String author, int yearPubl) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.yearPubl = yearPubl;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearPubl() {
        return yearPubl;
    }

    public void setYearPubl(int yearPubl) {
        this.yearPubl = yearPubl;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;

        Book book = (Book) o;

        if (getYearPubl() != book.getYearPubl()) return false;
        if (getTitle() != null ? !getTitle().equals(book.getTitle()) : book.getTitle() != null) return false;
        return getAuthor() != null ? getAuthor().equals(book.getAuthor()) : book.getAuthor() == null;
    }

    @Override
    public int hashCode() {
        int result = getTitle() != null ? getTitle().hashCode() : 0;
        result = 31 * result + (getAuthor() != null ? getAuthor().hashCode() : 0);
        result = 31 * result + getYearPubl();
        return result;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", yearPubl=" + yearPubl +
                '}';
    }


}
