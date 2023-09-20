package Student.StudentsImp;

import Student.Students.Student;

import java.util.Scanner;

public class StudentImp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] arrStudent = new Student[100];
        int studentCount = 0;

        while (true) {
            System.out.println("**********************MENU*********************");
            System.out.println("1. Nhập vào thông tin n sinh viên (n nhập từ bàn phím)");
            System.out.println("2. Tính điểm trung bình tất cả sinh viên");
            System.out.println("3. Hiển thị thông tin tất cả sinh viên");
            System.out.println("4. Sắp xếp sinh viên theo điểm trung bình giảm dần");
            System.out.println("5. Tìm kiếm sinh viên theo tên sinh viên");
            System.out.println("6. Thoát");
            System.out.print("Chọn một tùy chọn: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Đọc ký tự newline sau khi đọc int

            switch (choice) {
                case 1:
                    System.out.print("Nhập số lượng sinh viên (n): ");
                    int n = Integer.parseInt(scanner.nextLine());
                 scanner.nextLine();
                    for (int i = 0; i < n; i++) {
                        if (studentCount >= 100) {
                            System.out.println("Danh sách sinh viên đã đầy. Không thể thêm nữa.");
                            break;
                        }

                        Student student = new Student();
                        System.out.println("Nhập thông tin cho sinh viên thứ " + (i + 1) + ":");
                        student.inputData();
                        student.calAvgScore();
                        arrStudent[studentCount] = student;
                        studentCount++;
                    }
                    break;
                case 2:
                    for (int i = 0; i < studentCount; i++) {
                        arrStudent[i].calAvgScore();
                    }
                    System.out.println("Đã tính điểm trung bình cho tất cả sinh viên.");
                    break;
                case 3:
                    System.out.println("Thông tin tất cả sinh viên:");
                    for (int i = 0; i < studentCount; i++) {
                        arrStudent[i].displayData();
                    }
                    break;
                case 4:
                    // Thêm mã code để sắp xếp sinh viên theo điểm trung bình giảm dần
                    break;
                case 5:
                    System.out.print("Nhập tên sinh viên cần tìm: ");
                    String searchName = scanner.nextLine();
                    boolean found = false;

                    for (int i = 0; i < studentCount; i++) {
                        if (arrStudent[i].getStudentName().equalsIgnoreCase(searchName)) {
                            arrStudent[i].displayData();
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Không tìm thấy sinh viên có tên: " + searchName);
                    }
                    break;
                case 6:
                    System.out.println("Thoát chương trình.");
                    System.exit(0);
                default:
                    System.out.println("Tùy chọn không hợp lệ. Vui lòng chọn lại.");
            }
        }
    }
}
