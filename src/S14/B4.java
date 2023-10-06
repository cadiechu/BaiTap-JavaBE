package S14;

import java.util.Scanner;

public class B4 {
    public static void main(String[] args) {
        int[] arr = {10, 5, 8, 3, 2, 7, 1, 6, 4, 9};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập giá trị cần tìm: ");
        int target = scanner.nextInt();
        linearSearch(arr, target);
    }

    private static void linearSearch(int[] arr, int target) {
        boolean found = false;
        System.out.print("Vị trí của giá trị " + target + " trong mảng là: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.print(i + " ");
                found = true;
            }
        }

        if (!found) {
            System.out.println("Không tìm thấy giá trị " + target + " trong mảng.");
        }
    }
}
