package SS23_baitap;

import java.util.Scanner;

public class TamGiacVuong{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter height: ");
        int height = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
}
