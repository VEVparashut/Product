import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductRepositoryTest {

    Product product5 = new Book(5, "книга", 300, "Черное и белое", "Стендаль");
    Product product6 = new Smartphone(6, "смартфон", 75000, "iphone", "Apple");

    @Test
    public void saveTest() {
        ProductRepository repository = new ProductRepository();

        repository.save(product5);
        repository.save(product6);

        Product[] expected = {product5, product6};
        Product[] actual = repository.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }
}
