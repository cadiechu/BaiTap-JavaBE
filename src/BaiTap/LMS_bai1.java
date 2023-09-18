package BaiTap;

import java.util.Scanner;

public class LMS_bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi ngẫu nhiên: ");
        String strInput = scanner.nextLine();
        if (strInput.isEmpty()) {
            System.out.println("Chuỗi vừa nhập là chuỗi rỗng!!");
        } else {
            System.out.println("Chuỗi vừa nhập khum rỗng!!!");
        }
    }
}
