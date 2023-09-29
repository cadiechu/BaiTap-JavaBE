package ra.run;

import service.StudentService;

import java.util.Scanner;

public class SchoolManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("\u001B[36m  ❤\uFE0F❤\uFE0F❤\uFE0F❤\uFE0F❤\uFE0FSHOOL-MANAGEMENT❤\uFE0F❤\uFE0F❤\uFE0F❤\uFE0F❤\uFE0F\n" +
                    "\t\t\t1. Quản lý học sinh \n" +
                    "\t\t\t2. Quản lý môn học \n" +
                    "\t\t\t3. Quản lý điểm thi \n" +
                    "\t\t\t4. Thoát 🤞\n"+
                    "\t\t\tNhập số để chọn mục tương ứng: ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    StudentService.studentMenu();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    System.err.println("Chương trình kết thúc");
            }
        } while (true);
    }
}
