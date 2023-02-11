import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductTest {

    @Test
    public void shouldSetBook() {
        Book book = new Book(77, "книга 77", 300, "Идиот", "Достоевский");

        book.setNameBook("Идиот");

        String expected = "Идиот";
        String actual = book.getNameBook();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSet2Book() {
        Book book = new Book(77, "книга", 300, "Идиот", "Достоевский");

        book.setAuthor("Достоевский");

        String expected = "Достоевский";
        String actual = book.getAuthor();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetSmartphone() {
        Smartphone smartphone = new Smartphone(66, "смартфон", 30000, "Samsung A8", "Samsung");

        smartphone.setManufacturer("Samsung");

        String expected = "Samsung";
        String actual = smartphone.getManufacturer();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSet2Smartphone() {
        Smartphone smartphone = new Smartphone(66, "смартфон", 30000, "Samsung A8", "Samsung");

        smartphone.setNamePhone("Samsung A8");

        String expected = "Samsung A8";
        String actual = smartphone.getNamePhone();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetIDProduct() {
        Product product = new Product(66, "смартфон", 30000);

        product.setID (66);

        int expected = 66;
        int actual = product.getID();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNameProduct() {
        Product product = new Product(66, "смартфон", 30000);

        product.setName ("смартфон");

        String expected = "смартфон";
        String actual = product.getName();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPriceProduct() {
        Product product = new Product(66, "смартфон", 30000);

        product.setPrice (30000);

        int expected = 30000;
        int actual = product.getPrice();

        Assertions.assertEquals(expected, actual);
    }
}
