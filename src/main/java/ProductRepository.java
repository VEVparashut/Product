import java.nio.file.FileAlreadyExistsException;
import java.rmi.AlreadyBoundException;

public class ProductRepository {
    private Product[] products = new Product[0];

    public void save(Product product) {
        Product[] tmp = new Product[products.length + 1];
        for (int i = 0; i < products.length; i++) {
            tmp[i] = products[i];
        }
        tmp[tmp.length - 1] = product;
        products = tmp;
    }

    public Product[] getProducts() {
        return products;
    }

    public void removeById(int ID) {
        if (findByID(ID) == null) {
            throw new NotFoundException(
                    "Element with id: " + ID + " not found"
            );
        }
        Product[] tmp = new Product[products.length - 1];
        int copyToIndex = 0;
        for (Product product : products) {
            if (product.getID() != ID) {
                tmp[copyToIndex] = product;
                copyToIndex++;
            }
        }
        products = tmp;
    }

    public Product findByID(int ID) {
        for (Product product : products) {
            if (product.getID() == ID) {
                return product;
            }
        }
        return null;
    }
}
