import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductRepositoryTest {

    ProductRepository repository = new ProductRepository();
    Product product1 = new Book(1, "книга", 300, "Война и мир", "Толстой");
    Product product2 = new Smartphone(2, "смартфон", 75000, "iPhone 5", "Apple");

    @Test
    public void saveTest() {

        repository.save(product1);
        repository.save(product2);

        Product[] expected = {product1, product2};
        Product[] actual = repository.getProducts();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void removeTest() {

        repository.save(product1);
        repository.save(product2);
        repository.removeById(1);

        Product[] expected = {product2};
        Product[] actual = repository.getProducts();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void removeNotFoundExceptionTest() {

        repository.save(product1);
        repository.save(product2);

        Assertions.assertThrows(NotFoundException.class, () -> {
            repository.removeById(-20);
        });
    }
}
