package service;

import java.util.Scanner;

public class MarkService {
    public void markMenu() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("\n⁜⁜⁜⁜⁜MARK-MANAGEMENT⁜⁜⁜⁜⁜⁜\n " +
                    "\t\t\t1.Thêm mới điểm thi cho 1 sinh viên\n" +
                    "\t\t\t2.Hiển thị danh sách tất cả điểm thi theo thứ tự điểm tăng dần\n" +
                    "\t\t\t3.Thay đổi điểm theo mã id\n" +
                    "\t\t\t4.Xóa điểm theo mã id\n" +
                    "\t\t\t5.Hiển thị danh sách điểm thi theo mã môn học\n" +
                    "\t\t\tNhập lựa chọn theo mục tương ứng: ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Nhập sai, hãy nhập lại:");
            }
        } while (true);
    }
}
