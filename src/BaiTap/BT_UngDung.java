package BaiTap;

import java.util.Scanner;

public class BT_UngDung {
    public static void main(String[] args) {
        /*
         * 1. Nhập dòng v c của mảng số nguyên 2 chiều (row, col)
         * 2. Khai báo và khởi tạo mảng số nguyên 2 chiều hàng và cột
         * 3. Hiển thị Menu thực hiện các chức năng:
         * ******************MENU******************
         * 1. Nhập giá trị các phần tử mảng
         * 2. In theo ma trận
         * 3. In các phần tử chia hết cho 3 và 5
         * 4. In tổng các phần tử trong maangr
         * 5. nhập chỉ số dòng, tính tôn dòng theo chỉ số dòng
         * 6. In ra âsc số nguyên tố và tính tổng
         * 7.  In ra SX giảm dần
         * 8. Thoát
         * */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số dòng : ");
        int row = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số cột: ");
        int col = Integer.parseInt(scanner.nextLine());
        int[][] arrMang = new int[row][col];
//        System.out.println("******************MENU****************** \n 1. Nhập giá trị các phần tử mảng\n 2. In theo ma trận\n 3. In các phần tử chia hết cho 3 và 5\n 4. In tổng các phần tử trong mảng\n 5. nhập chỉ số dòng, tính tôn dòng theo chỉ số dòng\n 6. In ra các số nguyên tố và tính tổng\n 7. In ra SX giảm dần\n 8. Thoát");

        do {
            System.out.println("\n******************MENU****************** \n 1. Nhập giá trị các phần tử mảng\n 2. In theo ma trận\n 3. In các phần tử chia hết cho 3 và 5\n 4. In tổng các phần tử trong mảng\n 5. nhập chỉ số dòng, tính tôn dòng theo chỉ số dòng\n 6. In ra các số nguyên tố và tính tổng\n 7. In ra SX giảm dần\n 8. Thoát");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < col; j++) {
                            System.out.print("Nhập phần tử dòng " + (i + 1) + ", cột " + (j + 1) + ": ");
                            arrMang[i][j] = Integer.parseInt(scanner.nextLine());
                        }
                    }
                    break;
                case 2:
                    System.out.println("Các phần tử mảng theo ma trận : ");
                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < col; j++) {
                            System.out.print(arrMang[i][j] + " ");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Các phần tử chia hết cho 3 và 5 :");
                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < col; j++) {
                            if (arrMang[i][j] % 3 == 0 && arrMang[i][j] % 5 == 0) {
                                System.out.print(arrMang[i][j] + " ");
                            }
                        }
                    }
                    break;
                case 4:
                    System.out.println("Tổng các phần tử trong mảng:");
                    int sum = 0;
                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < col; j++) {
                            sum += arrMang[i][j];
                        }
                    }
                    System.out.println(sum);
                    break;
                case 5:
                    System.out.println("Nhập số dòng muốn tính tổng: ");
                    int soDong = Integer.parseInt(scanner.nextLine());
                    int sum1 = 0;
                    for (int i = 0; i < col; i++) {
                        sum1 += arrMang[soDong - 1][i];
                    }
                    System.out.println(sum1);
                    break;
                case 6:
                    System.out.println("Các số nguyên tố có trong mảng: ");
                    int sum3 = 0;
                    boolean isNguyento = false;

                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < col; j++) {
                            if (arrMang[i][j]>1){
                                if (isPrime(arrMang[i][j])) {
                                    System.out.print(arrMang[i][j] + " ");
                                    sum3 += arrMang[i][j];
                                }
                            }
                        }
                    }
                    System.out.println();
                    System.out.println("Tổng các ố nguyên tố : " + sum3);
                    break;
                case 7:
                    System.out.println("Sắp xếp giảm dần: ");
                    for (int column = 0; column < arrMang.length; column++) {
                        for (int i = 0; i < row - 1; i++) {
                            for (int j = i + 1; j < row; j++) {
                                if (arrMang[i][column] < arrMang[j][column]) {
                                    int temp = arrMang[i][column];
                                    arrMang[i][column] = arrMang[j][column];
                                    arrMang[j][column] = temp;
                                }
                            }
                        }
                    }
                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < col; j++) {
                            System.out.printf("%d\t", arrMang[i][j]);
                        }
                        System.out.printf("\n");
                    }
                    break;
                case 8:
                    System.exit(0);
                default:
            }
        } while (true);

    }
    public static boolean isPrime ( int number){
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
