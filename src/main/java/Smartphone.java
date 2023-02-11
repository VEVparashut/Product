public class Smartphone extends Product {
    private String namePhone;
    private String manufacturer;

    public Smartphone(int ID, String name, int price, String namePhone, String manufacturer) {
        super(ID, name, price);
        this.namePhone = namePhone;
        this.manufacturer = manufacturer;
    }

    public String getNamePhone() {
        return namePhone;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setNamePhone(String namePhone) {
        this.namePhone = namePhone;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
