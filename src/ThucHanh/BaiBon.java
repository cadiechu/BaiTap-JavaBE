package ThucHanh;

public class BaiBon {
    public static void main(String[] args) {
        String[] studentList = {"Tí", "Tèo", "Tủn", "Tủm", "Tỉm", "John", "Son", "baby"};
        int index = -1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên sinh viên cần tím: ");
        String studentName = scanner.nextLine();

        for (int i = 0; i < studentList.length; i++) {
            if (studentList[i].equalsIgnoreCase(studentName)) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            System.out.println("Đã tìm được vị trí của sinh viên tại vị trí: " + index);
        } else {
            System.out.println("Khum tìm thấy sinh viên.");
        }
    }
}
