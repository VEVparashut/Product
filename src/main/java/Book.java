public class Book extends Product {
    private String nameBook;
    private String author;

    public Book(int ID, String name, int price, String nameBook, String author) {
        super(ID, name, price);
        this.nameBook = nameBook;
        this.author = author;
    }

    public String getNameBook() {
        return nameBook;
    }

    public String getAuthor() {
        return author;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
