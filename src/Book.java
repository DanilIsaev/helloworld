public class Book {
    private String nameBook;
    private Author authorBook;
    private int bookPublicationDate;

    public Book(String nameBook, String nameAuthor, String surnameAuthor, int bookPublicationDate) {
        this.nameBook = nameBook;
        authorBook = new Author(nameAuthor, surnameAuthor);
        this.bookPublicationDate = bookPublicationDate;
    }

    public String getNameBook() {
        return this.nameBook;
    }

    public String getAuthorBookName() {
        return authorBook.getNameAuthor();
    }

    public String getAuthorBookSurname() {
        return authorBook.getSurnameAuthor();
    }

    public int getBookPublicationDate() {
        return bookPublicationDate;
    }

    public void setBookPublicationDate(int newBookPublicationDate) {
        this.bookPublicationDate = newBookPublicationDate;
    }

    public String toString() {
        return nameBook + " " + authorBook.toString() + " " + bookPublicationDate;
    }
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book otherBook = (Book) other;
        return nameBook.equals(otherBook.nameBook);
    }
    @Override
    public int hashCode() {
        if (nameBook != null) {
            return java.util.Objects.hash(nameBook);
        } else {
            return 0;
        }
    }

}
