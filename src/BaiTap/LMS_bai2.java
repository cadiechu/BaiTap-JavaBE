package BaiTap;

import java.util.Scanner;

public class LMS_bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi ngẫu nhiên: ");
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        if (str1.equals(str2)) {
            System.out.println("Chuỗi giống i chang!!");
        } else {
            System.out.println("Chuỗi khum giống i chang!!!");
        }
    }
}
