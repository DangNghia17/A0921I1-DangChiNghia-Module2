package ss17_io_binary_file_serialization.bai_tap.ProductToBinary;

public class Product {
    private String idProduct = "";
    private String nameProduct = "";
    private String brandProduct = "";
    private long price = 0L;
    private String other = "";

    public Product() {
    }

    public Product(String idProduct, String nameProduct, String brandProduct, long price, String other) {
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
        this.brandProduct = brandProduct;
        this.price = price;
        this.other = other;
    }

    public String getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(String idProduct) {
        this.idProduct = idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getBrandProduct() {
        return brandProduct;
    }

    public void setBrandProduct(String brandProduct) {
        this.brandProduct = brandProduct;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    @Override
    public String toString() {
        return "Product{" +
                "idProduct='" + idProduct + '\'' +
                ", nameProduct='" + nameProduct + '\'' +
                ", brandProduct='" + brandProduct + '\'' +
                ", price=" + price +
                ", other='" + other + '\'' +
                '}';
    }
}
