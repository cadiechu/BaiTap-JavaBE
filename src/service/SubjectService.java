package service;

import java.util.Scanner;

public class SubjectService {
    public void subjectMenu(){
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("\u001B[36m 💟💟💟💟💟SUBJECT-MANAGEMENT💟💟💟💟💟\n " +
                    "\t\t\t 1.Thêm mới môn học \n" +
                    "\t\t\t 2.Hiển thị danh sách tất cả môn học đã lưu trữ \n" +
                    "\t\t\t 3.Thay đổi thông tin học môn học theo mã id\n" +
                    "\t\t\t 4.Xóa môn học theo mã id (kiểm tra xem nếu môn học  có điểm thi thì không xóa được)\n" +
                    "\t\t\t 5.Thoát\n" +
            "\t\t\tNhập số để chọn mục tương ứng: ");
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
                    System.out.println("Quay lại Menu trước!!!");
                default:
            }
        }while (true);
    }
}
