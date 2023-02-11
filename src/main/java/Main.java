public class Main {

    public static void main(String[] args) {
        Product product1 = new Book(
                1,
                "книга",
                400,
                "Преступление и наказание",
                "Достоевский"
        );
        Product product2 = new Book(
                2,
                "книга",
                1000,
                "Война и мир",
                "Толстой"
        );
        Product product3 = new Smartphone(
                3,
                "смартфон",
                8000,
                "LG200",
                "LG"
        );
        Product product4 = new Smartphone(
                4,
                "смартфон",
                55000,
                "SamsungX6",
                "samsung"
        );
    }
}
