package BaiTap;

import java.util.Scanner;

public class LMS_bai2 {
    public static void main(String[] args) {
        /*
         * 1. Thêm vô đầu
         * 2. Thêm vô cuối
         * 3. Thêm vô bất kì cỗ nào (Vị trí index)
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử của mảng: ");
        int length = Integer.parseInt(scanner.nextLine());
        int[] oldArray = new int[length];

        for (int i = 0; i < oldArray.length; i++) {
            System.out.println("Nhập vào giá trị của mảng : ");
            oldArray[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.print("OldArray : ");
        for (int i = 0; i < oldArray.length; i++) {
            System.out.print(oldArray[i] + " ");
        }
        do {
            System.out.println("\n*******Menu********\n 1. Thêm 1 vào tử vào cuối mảng\n 2. Thêm 1 phần tử vào đầu mảng\n 3. Thêm phần tử vị trí index");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Nhập giá trị muốn thêm vào cuối mảng: ");
                    int lastNumber = scanner.nextInt();
                    int[] newArray1 = new int[length + 1];
                    for (int i = 0; i<length;i++){
                        newArray1[i] = oldArray[i];
                    }
                    newArray1[length] = lastNumber;
                    System.out.println("Đã thêm phần vào mảng:");
                    for (int element : newArray1) {
                        System.out.printf("%d\t",element);
                    }
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Nhập giá trị muốn thêm vào đầu mảng: ");
                    int fistNumber = scanner.nextInt();
                    int[] newArray2 = new int[length + 1];
                    for (int i = 0; i<length;i++){
                        newArray2[i+1] = oldArray[i];
                    }
                    newArray2[0] = fistNumber;
                    System.out.println("Đã thêm phần vào mảng:");
                    for (int element : newArray2) {
                        System.out.printf("%d\t",element);
                    }
                    System.out.println();
                    break;
                case 3:
                    break;
                default:
            }
        } while (true);
    }
}
