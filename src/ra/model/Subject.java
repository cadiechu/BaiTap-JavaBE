package ra.model;

import java.awt.im.spi.InputMethod;
import java.util.Scanner;

public class Subject {
    private String subjectId;
    private String subjectName;

    public Subject() {
    }

    public Subject(String subjectId, String subjectName) {
        this.subjectId = subjectId;
        this.subjectName = subjectName;
    }

    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public void inputData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\u001B[32m Nhập mã môn học : ");
        this.subjectId = sc.nextLine();

        System.out.println("\u001B[32m Nhập tên môn học : ");
        do {
            this.subjectName = sc.nextLine();
            if (this.subjectName.length() == 0) {
                System.out.println("Không được để trống\nHãy nhập lại:");
            } else {
                break;
            }
        } while (true);
    }
    public void displayData(){
        System.out.println("\u001B[36m Danh sách tất cả môn học đã lưu trữ :");
        System.out.printf("Mã môn học: %s | Tên môn học: %s", subjectId,subjectName);
    }
}
