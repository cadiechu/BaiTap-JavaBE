package service;

import ra.model.Student;

import java.util.Scanner;

public class StudentService {
    public void studentMenu() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("\u001B[36m \n 🌼🌼🌼🌼🌼STUDENT-MANAGEMENT🌼🌼🌼🌼🌼\n " +
                    "\t\t\t1.Thêm mới học sinh\t\t\t\t\t\t\t\t  \n" +
                    "\t\t\t2.Hiển thị danh sách tất cả học sinh đã lưu trữ\n" +
                    "\t\t\t3.Thay đổi thông tin học sinh theo mã id\n" +
                    "\t\t\t4.Xóa học sinh theo mã id (kiểm tra xem nếu sinh viên có điểm thi thì không xóa được)\n" +
                    "\t\t\t5.Thoát\n" +
                    "\t\t\tNhập số để chọn mục tương ứng: ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Thêm mới Học sinh: ");
                    break;
                case 2:

                    break;
                case 3:
                    System.out.println("Thay đổi thông tin học sinh theo mã id");
                    break;
                case 4:
                    System.out.println("Xóa học sinh theo mã id");
                    break;
                case 5:
                    System.out.println("Quay lại Menu!!");
                    break;
                default:
                                }
        } while (true);
    }
}
