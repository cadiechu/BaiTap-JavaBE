package ra.model;

import util.InputMethod;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Student {
    private int studentId;
    private String studentName;
    private Date birthDay;
    private String address;
    private boolean gender;
    private String phone;
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/YYYY");

    public Student() {
    }

    public Student(int studentId, String studentName, Date birthDay, String address, boolean gender, String phone) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.birthDay = birthDay;
        this.address = address;
        this.gender = gender;
        this.phone = phone;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void inputData() {
        Scanner sc = new Scanner(System.in);
        int maxId =0;

        //studentName
        System.out.println("\u001B[35mPurple Nhập Tên Học Sinh :");
        do {
            this.studentName = InputMethod.getString();
            if (this.studentName.length() == 0) {
                System.out.println("Không được để trống\nHãy nhập lại:");
            } else {
                break;
            }
        } while (true);
        //birthDay
        System.out.println("\u001B[35mPurple Nhập Ngày/Tháng/Năm Sinh :");
        String inputDate = sc.nextLine();
        try {
            this.birthDay = dateFormat.parse(inputDate);
        } catch (ParseException e) {
            System.out.println("\u001B[31mRed Vui lòng nhập lại cho đúng định dạng");
        }
        //address
        System.out.println("\u001B[35mPurple Nhập địa chỉ :");
        do {
            this.address = InputMethod.getString();
            if (this.address.length() == 0) {
                System.out.println("Không được để trống\nHãy nhập lại:");
            } else {
                break;
            }
        } while (true);
        //gender
        System.out.println("Nhập (true) nêu bạn là Trai : ");
        this.gender = InputMethod.getBoolean();
        //phone
        System.out.print("\u001B[37mWhite Nhập số điện thoại: ❤\uFE0F");
        String inputPhone = sc.nextLine();
        if (Pattern.matches("^0 + [0-9] * [0-9]{9}$", inputPhone)) {
            this.phone = inputPhone;
        } else {
            System.out.println("SĐT không đúng định dạng. Hãy nhập lại!");
        }
    }
    public void displayData(){
        System.out.println("\u001B[36m Danh sách tất cả học sinh đã lưu trữ :");
        System.out.printf("\u001B[36m Mã HS: %d | Tên HS: %s | DOB: %s |\nĐ/c: %s | Giới tính: %b | SĐT: %s ",studentId,studentName,birthDay,address,gender,phone);
    }
}
