package run;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.MonthDay;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BaiTap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("\n" +
                    "Bài tập 1: Tính tổng của các số chẵn từ một danh sách số nguyên.\n" +
                    "Bài tập 2: Lọc danh sách chuỗi để chỉ chứa những từ có độ dài lớn hơn 5.\n" +
                    "Bài tập 3: Chuyển đổi một danh sách người thành danh sách tên (đối tượng Person có thuộc tính name).\n" +
                    "Bài tập 4: Sắp xếp danh sách số nguyên theo thứ tự giảm dần và lấy 3 phần tử đầu tiên.\n" +
                    "Bài tập 5: In ra ngày và giờ hiện tại theo định dạng yyyy-MM-dd HH:mm:ss.\n" +
                    "Bài tập 6: Tính tuổi của một người từ năm sinh.\n" +
                    "Bài tập 7: Chuyển đổi một chuỗi ngày tháng thành đối tượng LocalDate và in ra ngày tháng.\n" +
                    "Bài tập 8: Tính khoảng cách giữa hai ngày và in ra số ngày đó.\n" +
                    "Bài tập 9: Cho một danh sách các số nguyên, hãy sử dụng Stream để đếm số lượng phần tử  lớn hơn 10.\n");
            System.out.println("Xem bài mấy? ");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice){
                case 1:
                    List<Integer> list = Arrays.asList(1,4,2,5,7,3,8,3,9,50,84,33);
                    List<Integer> oddList = list.stream().filter(i -> i%2 == 0).collect(Collectors.toList());
                    int result = oddList.stream().reduce(0, (a, b) -> a + b);
                    System.out.println(list);
                    System.out.println(oddList);
                    System.out.println(result);
                    break;
                case 2:
                    Scanner sc2 = new Scanner(System.in);
                    System.out.println("Nhập vào 1 đoạn:");
                    String inputText = sc2.nextLine();
                    String[] words = inputText.split(" ");
                    List<String> result2 = Arrays.stream(words).filter(s->s.length() > 5).collect(Collectors.toList());
                    if (result2.isEmpty()) {
                        System.out.println("Không có chữ nào hơn 5 kí tự");
                    } else {
                        System.out.println(result2);
                    }
                    break;
                case 3:
                    break;
                case 4:
                    List<Integer> numbers = Arrays.asList(3,2,4,7,5,86,32,45);
                    List<Integer> result4 = numbers.stream().sorted(Comparator.reverseOrder()).limit(3).toList();
                    System.out.println(result4);
                    break;
                case 5:
                    LocalDateTime localDateTime = LocalDateTime.now();
                    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                    System.out.println(localDateTime.format(dateTimeFormatter));
                    break;
                case 6:
                    Scanner sc6 = new Scanner(System.in);
                    System.out.print("Nhập vào năm sinh để tính tuổi: ");
                    Year inputYear = Year.parse(sc6.nextLine());

                    long age = ChronoUnit.YEARS.between(inputYear, LocalDate.now());
                    System.out.println(age);
                    break;
                case 7:
                    Scanner sc7 = new Scanner(System.in);
                    System.out.print("Nhập chuỗi ngày tháng có định dạng dd-MM: ");
                    String inputDate = sc7.nextLine();
                    DateTimeFormatter dateTimeFormatter7 = DateTimeFormatter.ofPattern("dd-MM");
                    MonthDay date = MonthDay.parse(inputDate, dateTimeFormatter7);
                    System.out.println(dateTimeFormatter7.format(date));
                    break;
                case 8:
                    Scanner sc8 = new Scanner(System.in);
                    System.out.print("Nhập vào thời điểm thứ nhất: ");
                    String inputFirstDate = sc8.nextLine();
                    System.out.print("Nhập vào thời điểm thứ hai: ");
                    String inputSecondDate = sc.nextLine();
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    LocalDate firstDate = LocalDate.parse(inputFirstDate, formatter);
                    LocalDate secondDate = LocalDate.parse(inputSecondDate, formatter);
                    long days = ChronoUnit.DAYS.between(firstDate, secondDate);
                    System.out.println("Khoảng cách giữa 2 ngày là: " + Math.abs(days));
                    break;
                case 9:
                    List<Integer> list9 = Arrays.asList(1,3,2,43,2,5,54,32,1,9,10);
                    long count = list9.stream().filter(number -> number > 10).count();
                    System.out.println(count);
                break;
                case 10:
                    System.exit(0);
                default:
            }
        }while (true);
    }
}
