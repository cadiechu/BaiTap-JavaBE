package Lession6.entity;

import java.util.Scanner;

public class Book {
    private int bookId;
    private String bookName;
    private float price;
    private String title;
    private String content;
    private boolean status;

    public Book() {
    }

    public Book(int bookId, String bookName, float price, String title, String content, boolean status) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.price = price;
        this.title = title;
        this.content = content;
        this.status = status;
    }

    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã sách: ");
        this.bookId = scanner.nextInt();
        scanner.nextLine();
        this.bookName = scanner.nextLine();
        System.out.print("Nhập giá sách: ");
        this.price = scanner.nextFloat();
        scanner.nextLine();
        System.out.print("Nhập tiêu đề sách: ");
        this.title = scanner.nextLine();
        System.out.print("Nhập nội dung sách: ");
        this.content = scanner.nextLine();
        System.out.print("Nhập trạng thái sách (true hoặc false): ");
        this.status = scanner.nextBoolean();
    }

    public void displayData() {
        System.out.println("Thông tin sách:");
        System.out.println("Mã sách: " + this.bookId);
        System.out.println("Tên sách: " + this.bookName);
        System.out.println("Giá sách: " + this.price);
        System.out.println("Tiêu đề sách: " + this.title);
        System.out.println("Nội dung sách: " + this.content);
        System.out.println("Trạng thái sách: " + this.status);
    }

    public float getPrice() {
        return price;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
