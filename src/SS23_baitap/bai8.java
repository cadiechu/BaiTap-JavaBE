package SS23_baitap;

import java.util.Scanner;

public class bai8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double side1, side2, side3;

        while (true) {
            System.out.println("Nhập giá trị của 3 cạnh tam giác:");
            System.out.print("Cạnh 1: ");
            side1 = scanner.nextDouble();
            System.out.print("Cạnh 2: ");
            side2 = scanner.nextDouble();
            System.out.print("Cạnh 3: ");
            side3 = scanner.nextDouble();

            if (isValidTriangle(side1, side2, side3)) {
                double perimeter = calculatePerimeter(side1, side2, side3);
                double area = calculateArea(side1, side2, side3);
                System.out.println("Chu vi của tam giác là: " + perimeter);
                System.out.println("Diện tích của tam giác là: " + area);

                break;
            } else {
                System.out.println("Ba cạnh nhập vào không thoả mãn điều kiện của một tam giác. Vui lòng nhập lại.");
            }
        }
    }

    public static boolean isValidTriangle(double side1, double side2, double side3) {
        return side1 > 0 && side2 > 0 && side3 > 0 && (side1 + side2) > side3 && (side1 + side3) > side2 && (side2 + side3) > side1;
    }

    public static double calculatePerimeter(double side1, double side2, double side3) {
        return side1 + side2 + side3;
    }

    public static double calculateArea(double side1, double side2, double side3) {
        double semiPerimeter = calculatePerimeter(side1, side2, side3) / 2;
        return Math.sqrt(semiPerimeter * (semiPerimeter - side1) * (semiPerimeter - side2) * (semiPerimeter - side3));
    }
}
