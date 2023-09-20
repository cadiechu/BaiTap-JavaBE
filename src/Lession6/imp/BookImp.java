package Lession6.imp;

import Lession6.entity.Book;

import java.util.Scanner;

public class BookImp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Book book = new Book();

        while (true) {
            System.out.println("********************MENU********************");
            System.out.println("1. Nhập thông tin sách (inputData)");
            System.out.println("2. Hiển thị thông tin sách (displayData)");
            System.out.println("3. In thông tin giá sách (get)");
            System.out.println("4. Cập nhật trạng thái sách (set)");
            System.out.println("5. Thoát");
            System.out.print("Chọn một tùy chọn: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    book.inputData();
                    break;
                case 2:
                    book.displayData();
                    break;
                case 3:
                    float price = book.getPrice();
                    System.out.println("Giá sách: " + price);
                    break;
                case 4:
                    System.out.print("Nhập trạng thái mới (true hoặc false): ");
                    boolean status = scanner.nextBoolean();
                    book.setStatus(status);
                    System.out.println("Trạng thái sách đã được cập nhật.");
                    break;
                case 5:
                    System.out.println("Thoát chương trình.");
                    System.exit(0);
                default:
                    System.out.println("Tùy chọn không hợp lệ. Vui lòng chọn lại.");
            }
        }
    }
}
