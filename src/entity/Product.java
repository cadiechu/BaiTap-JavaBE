package entity;

import java.util.Scanner;

public class Product {
    private String productId;
    private String productName;
    private String manufacturer;
    private boolean productStatus;

    public Product() {
    }
    public Product(String productId, String productName, String manufacturer, boolean productStatus) {
        this.productId = productId;
        this.productName = productName;
        this.manufacturer = manufacturer;
        this.productStatus = productStatus;
    }

    public String getProductId() {
        return productId;
    }
    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public boolean isProductStatus() {
        return productStatus;
    }

    public void setProductStatus(boolean productStatus) {
        this.productStatus = productStatus;
    }
    public void inputData(Scanner scanner,Product[] arrProduct){
        boolean isExít = true;
        System.out.println("Nhập thông tin nhân sản phẩm: ");

    }
}
