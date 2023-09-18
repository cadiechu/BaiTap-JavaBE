package BaiTap;

import java.util.Scanner;

public class LMS_bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arrMang = new int[5];
        for (int i = 0; i < arrMang.length; i++) {
            System.out.println("Nhập giá trị phần tử của mảng : " + (i + 1));
            arrMang[i] = Integer.parseInt(scanner.nextLine());

        }
        System.out.println("Các giá trị phần tử của Mảng:  ");
        for (int i = 0; i < 5; i++) {
            System.out.print(arrMang[i] + " ");
        }
        System.out.println("Nhập giá trị phần tử cần xoá : ");
        int soMuonXoa = Integer.parseInt(scanner.nextLine());
        for (int i=0; i<arrMang.length;i++){
            if(soMuonXoa==arrMang[i]){

            }
        }
    }
}
