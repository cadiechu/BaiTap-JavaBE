package SS23_baitap;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập 1 số nguyên: ");
        int number = Integer.parseInt(sc.nextLine());
        int choise;
        boolean flag = true;
        boolean isContinue = true;

        do {
            System.out.println(" Tạo menu chức năng");
            System.out.println("1. Kiểm tra tính chẵn lẻ của 1 số");
            System.out.println("2. Kiểm tra số nguyên tố");
            System.out.println("3. Kiểm tra một số có chia hết cho 3");
            System.out.println("4. Thoát");
            System.out.print("Nhập số mà bạn muốn lựa chọn: ");
            choise = Integer.parseInt(sc.nextLine());

            switch (choise) {
                case 1:
                    if (number % 2 == 0) {
                        System.out.printf("%d là số chẵn",number);
                        System.out.println();
                    } else {
                        System.out.printf("%d là số lẻ",number);
                        System.out.println();
                    }
                    break;
                case 2:
                    if (number > 1) {
                        for (int i = 2; i < number; i++) {
                            if (number % i == 0) {
                                flag = false;
                                break;
                            }
                        }
                        if (!flag) {
                            System.out.printf("%d không là số nguyên tố", number);
                            System.out.println();
                        }
                        else {
                            System.out.printf("%d là số nguyên tố", number);
                            System.out.println();
                        }
                    } else {
                        System.out.println("Vui lòng nhập số nguyên dương lớn hơn 1 và thử lại!!!");
                    }
                    break;
                case 3:
                    if (number % 3 == 0) {
                        System.out.printf("%d có chia hết cho 3",number);
                        System.out.println();
                    } else {
                        System.out.printf("%d không chia hết cho ",number);
                        System.out.println();
                    }
                    break;
                default:
                    isContinue = false;
            }
        }
        while (isContinue);

    }
}
