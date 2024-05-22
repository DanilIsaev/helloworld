public class Book {
    private String nameBook;
    private Author authorBook;
    private int bookPublicationDate;

    public Book(String nameBook, Author authorBook, int bookPublicationDate) {
        this.nameBook = nameBook;
        this.authorBook = authorBook;
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


}
