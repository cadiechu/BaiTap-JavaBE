package BaiTapThucHanh140923;

import java.util.Scanner;

public class ThucHanh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào 1 số bất kỳ :");
        int number = scanner.nextInt();
        boolean isEnd = false;
        do {
            System.out.println("\n*****************MENU******************\n 1. Kiểm tra số chẵn/lẻ\n 2. Kiểm tra số nguyên tố\n 3. Kiểm tra số hoàn hảo\n 4. In ra các số chia hết cho 3 và 5 trong khoảng 1-number\n 5. Tính tổng các ước số của number\n 6. Tính tổng các số nguyên tố trong khoảng 1-number\n 7. Nhập 2 số nguyên (number1, number2), kiểm tra number có trong \n" + "khoảng (number1,number2)\n 8. Thoát ");
            System.out.print("*************************************** \n Nhập số để chọn option : ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Kiểm tra Chẳn/Lẻ số vừa nhập :" + number);
                    for (int i = 0; i <= number; i++) {
                        if (number % 2 == 0) {
                            System.out.println(number + " là số chẳn");
                        } else {
                            System.out.println(number + " là số lẻ");
                        }
                        break;
                    }
                    break;
                case 2:
                    System.out.println("Kiểm tra số nguyên tố vừa nhập:" + number);
                    boolean isNguyento = false;
                    for (int i = 2; i < number; i++) {
                        if (number % i == 0) {
                            isNguyento = true;
                            break;
                        }
                    }
                    if (isNguyento) {
                        System.out.println(number + " không phải là số nguyên tố!");
                    } else {
                        System.out.println(number + " là số nguyên tố!");
                    }
                    break;
                case 3:
                    int total = 0;
                    System.out.println("Kiểm tra số hoàn hảo số vừa nhập:" + number);
                    for (int i = 1; i <= number / 2; i++) {
                        if (number % i == 0) {
                            total += i;
                        }
                    }
                    if (total == number) {
                        System.out.println(number + " là số hoàn hảo!");
                    } else {
                        System.out.println(number + " không phải số hoàn hảo!");
                    }
                    break;
                case 4:
                    System.out.println("Kiểm tra số chia hết cho 3 và 5 trong khoảng 1 đến số " + number);
                    int result;
                    for (int i = 1; i <= number; i++) {
                        if (i % 3 == 0 && i % 5 == 0) {
                            result = i;
                            System.out.print(result + "\t");
                        }
                    }
                    break;
                case 5:
                    System.out.println("Kiểm tra tổng các ước số của :" + number);
                    int tongUoc = 0;
                    for (int i = 1; i <= number / 2; i++) {
                        if (number % i == 0) {
                            tongUoc += i;
                        }
                    }
                    System.out.println(tongUoc);
                    break;
                case 6:
                    System.out.println("Kiểm tra tổng các số nguyên tố trong khoảng 1 đến " + number);
                    int count = 2;
                    int sum3 = 0;
                    while (count <= number) {
                        if (isPrime(count)) {
                            sum3 += count;
                        }
                        count++;
                    }
                    System.out.print(sum3);
                    break;
                case 7:
                    System.out.println("Nhập 2 số a và b, kiểm tra số vừa nhập có trong khoảng a-b không?");
                    System.out.println("Nhập số a: ");
                    int a = scanner.nextInt();
                    System.out.println("Nhập vào số b: ");
                    int b = scanner.nextInt();
                    for (int i = a; i <= b; i++) {
                        if (number == i) {
                            System.out.println(i);
                        }
                    }
                    break;
                default:
                    isEnd = true;
                    break;
            }
        } while (!isEnd);
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}