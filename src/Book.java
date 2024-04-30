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

    @Override
    public String toString() {
        return nameBook + " " + authorBook.toString() + " " + bookPublicationDate;
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book otherBook = (Book) other;
        return nameBook.equals(otherBook.nameBook) && authorBook.equals(otherBook.authorBook) && bookPublicationDate == otherBook.bookPublicationDate;
    }

    @Override
    public int hashCode() {
        if (nameBook != null && authorBook != null && bookPublicationDate > 0) {
            return java.util.Objects.hash(nameBook + authorBook + bookPublicationDate);
        } else {
            return 0;
        }
    }

}
