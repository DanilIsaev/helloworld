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


}
