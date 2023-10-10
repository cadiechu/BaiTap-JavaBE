package ThucHanhSs15;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class chuyenDoiChuoiSoNguyen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String inputString = sc.nextLine();
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < inputString.length(); i++) {
            char c = inputString.charAt(i);
            try {
                int num = Integer.parseInt(String.valueOf(c));
                integerList.add(num);
            } catch (NumberFormatException e) {
                integerList.add(0);
                System.out.println("Lỗi: Ký tự '" + c + "' không phải là số nguyên.");
            }
        }
        for (int i = 0; i < inputString.length(); i++) {
            char c = inputString.charAt(i);
            try {
                int num = Integer.parseInt(String.valueOf(c));
                integerList.add(num);
            } catch (NumberFormatException e) {
                integerList.add(0);
                System.out.println("Lỗi: Ký tự '" + c + "' không phải là số nguyên.");
            }
        }
        System.out.println(integerList);
    }
}
