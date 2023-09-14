package SS23_baitap;

import java.util.Scanner;

public class hinhVuong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        int height = Integer.parseInt(sc.nextLine());
        System.out.print("Enter width: ");
        int width = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
