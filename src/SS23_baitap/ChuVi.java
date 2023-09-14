package SS23_baitap;

import java.util.Scanner;

public class ChuVi {

          public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int choice = 0;

            while (choice != 4) {
                System.out.println("----- MENU -----");
                System.out.println("1. Tính chu vi và diện tích hình chữ nhật");
                System.out.println("2. Tính chu vi và diện tích hình tam giác");
                System.out.println("3. Tính chu vi và diện tích hình tròn");
                System.out.println("4. Thoát");
                System.out.print("Nhập lựa chọn của bạn: ");
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        calculateRectangle();
                        break;
                    case 2:
                        calculateTriangle();
                        break;
                    case 3:
                        calculateCircle();
                        break;
                    case 4:
                        System.out.println("Kết thúc chương trình.");
                        break;
                    default:
                        System.out.println("Lựa chọn không hợp lệ. Vui lòng nhập lại.");
                        break;
                }
            }
        }

        public static void calculateRectangle() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhập chiều dài của hình chữ nhật: ");
            double length = scanner.nextDouble();
            System.out.print("Nhập chiều rộng của hình chữ nhật: ");
            double width = scanner.nextDouble();

            double perimeter = 2 * (length + width);
            double area = length * width;

            System.out.println("Chu vi của hình chữ nhật là: " + perimeter);
            System.out.println("Diện tích của hình chữ nhật là: " + area);
        }

        public static void calculateTriangle() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhập độ dài cạnh thứ nhất của tam giác: ");
            double side1 = scanner.nextDouble();
            System.out.print("Nhập độ dài cạnh thứ hai của tam giác: ");
            double side2 = scanner.nextDouble();
            System.out.print("Nhập độ dài cạnh thứ ba của tam giác: ");
            double side3 = scanner.nextDouble();

            double perimeter = side1 + side2 + side3;
            double s = perimeter / 2;
            double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

            System.out.println("Chu vi của tam giác là: " + perimeter);
            System.out.println("Diện tích của tam giác là: " + area);
        }

        public static void calculateCircle() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhập bán kính của hình tròn: ");
            double radius = scanner.nextDouble();

            double perimeter = 2 * Math.PI * radius;
            double area = Math.PI * radius * radius;

            System.out.println("Chu vi của hình tròn là: " + perimeter);
            System.out.println("Diện tích của hình tròn là: " + area);
        }
    }


