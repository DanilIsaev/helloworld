public class Author {
    private String nameAuthor;
    private String surnameAuthor;

    public Author(String nameAuthor, String surnameAuthor) {
        this.nameAuthor = nameAuthor;
        this.surnameAuthor = surnameAuthor;
    }

    public String getNameAuthor() {
        return this.nameAuthor;
    }

    public String getSurnameAuthor() {
        return this.surnameAuthor;
    }

    public String toString() {
        return surnameAuthor + " " + nameAuthor;
    }

    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author otherAuthor = (Author) other;
        if (surnameAuthor.equals(otherAuthor.surnameAuthor) && nameAuthor.equals(otherAuthor.nameAuthor)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        if (nameAuthor != null && surnameAuthor != null) {
            return java.util.Objects.hash(nameAuthor + surnameAuthor);
        } else {
            return 0;
        }
    }
}
