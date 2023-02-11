import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductManagerTest {
    ProductRepository repository = new ProductRepository();
    ProductManager manager = new ProductManager(repository);
    Product product1 = new Book(1, "книга 2", 3000, "Война и мир", "Толстой");
    Product product2 = new Smartphone(2, "смартфон 2", 75000, "iPhone 5", "Apple");

    @Test
    public void addTest() {
        manager.add(product1);
        manager.add(product2);

        Product[] expected = {product1, product2};
        Product[] actual = repository.getProducts();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void searchTest() {
        manager.add(product1);
        manager.add(product2);
        String name = "книга";

        Product[] expected = {product1};
        Product[] actual = manager.searchBy(name);

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void searchNoneTest() {
        manager.add(product1);
        manager.add(product2);
        String name = "стол";

        Product[] expected = {};
        Product[] actual = manager.searchBy(name);

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void searchIDTest() {
        manager.add(product1);
        manager.add(product2);
        String name = "2";

        Product[] expected = {product1, product2};
        Product[] actual = manager.searchBy(name);

        Assertions.assertArrayEquals(expected, actual);
    }
}
