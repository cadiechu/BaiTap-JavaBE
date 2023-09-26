package run;

import java.util.Scanner;

public class StoreManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("\n*********************STORE MANAGEMENT*****************\n" +
                    "1. Quản lý sản phẩm\n" +
                    "2. Quản lý nhân viên\n" +
                    "3. Quản lý phiếu nhập\n" +
                    "4. Quản lý phiếu xuất\n" +
                    "5. Báo cáo thống kê\n" +
                    "6. Thoát");
            System.out.println("Nhập lựa chọn: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("\n********************PRODUCT MANAGEMENT***************\n" +
                            "1. Nhập thông tin các sản phẩm\n" +
                            "2. Hiển thị thông tin các sản phẩm\n" +
                            "3. Cập nhật thông tin sản phẩm\n" +
                            "4. Tìm kiếm sản phẩm theo tên\n" +
                            "5. Cập nhật trạng thái sản phẩm\n" +
                            "6. Thoát");
                    break;
                case 2:
                    System.out.println("\n*******************EMPLOYEE MANAGEMENT*************\n" +
                            "1. Nhập thông tin nhân viên\n" +
                            "2. Hiển thị thông tin nhân viên\n" +
                            "3. Cập nhật thông tin nhân viên\n" +
                            "4. Tìm nhân viên theo tên nhân viên\n" +
                            "5. Cập nhật trạng thái của nhân viên\n" +
                            "6. Thoát");
                    break;
                case 3:
                    System.out.println("\n +*******************RECEIPT MANAGEMENT***************" +
                            "1. Nhập thông tin phiếu nhập\n" +
                            "2. Hiển thị thông tin phiếu nhập\n" +
                            "3. Cập nhật thông tin phiếu nhập\n" +
                            "4. Tìm phiếu nhập từ ngày đến ngày\n" +
                            "5. Tìm phiếu nhập theo người tạo\n" +
                            "6. Tìm phiếu nhập theo người cập nhật\n" +
                            "7. Thoát");
                    break;
                case 4:
                    System.out.println("\n ********************BILL MANAGEMENT*****************\n" +
                            "1. Nhập thông tin phiếu xuất\n" +
                            "2. Hiển thị thông tin phiếu xuất\n" +
                            "3. Cập nhật thông tin phiếu xuất\n" +
                            "4. Tìm phiếu xuất từ ngày đến ngày\n" +
                            "5. Tìm phiếu xuất theo người tạo\n" +
                            "6. Tìm phiếu xuất theo người cập nhật\n" +
                            "7. Thoát ");
                    break;
                case 5:
                    System.out.println("\n *******************REPORT MANAGEMENT****************\n" +
                            "1. Thống kê các sản phẩm nhập từ ngày đến ngày\n" +
                            "2. Thống kê các sản phẩm xuất từ ngày đến ngày\n" +
                            "3. Thống kê doanh thu từ ngày đến ngày (theo các phiếu xuất)\n" +
                            "4. Thống kê chi phí từ ngày đến ngày (theo các phiếu nhập)\n" +
                            "5. Thống kê phiếu thu theo các tháng\n" +
                            "6. Thống kê chi phí theo các tháng\n" +
                            "7. Thoát");
                    break;
                case 6:
                    System.out.println("Chương trình kết thúc!");
                    System.exit(0);
                default:
            }
        } while (true);
    }
}
