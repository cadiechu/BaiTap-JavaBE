package BaiTap;

import java.util.Scanner;

public class LMS_bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi muốn đảo :");
        StringBuffer str1 = new StringBuffer(scanner.nextLine());
        System.out.println("Chuỗi vừa nhập là : "+str1);
        System.out.println("Chuỗi đảo ngược : "+str1.reverse());
    }
}

