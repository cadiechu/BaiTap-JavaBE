package S14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số cần tìm: ");
        int number = scanner.nextInt();
        int[][] arr = getArr();
        boolean found = searchNumber(arr, number);
        if (!found) {
            System.out.println("Số " + number + " không được tìm thấy trong mảng.");
        }
    }

    private static int[][] getArr() {
        int[][] arr = new int[20][20];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 100);
            }
        }
        return arr;
    }

    private static boolean searchNumber(int[][] arr, int number) {
        List<Integer> rowIndexes = new ArrayList<>();
        List<Integer> colIndexes = new ArrayList<>();
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == number) {
                    rowIndexes.add(i);
                    colIndexes.add(j);
                    found = true;
                }
            }
        }

        if (found) {
            System.out.println("Số " + number + " được tìm thấy tại các vị trí sau:");
            for (int k = 0; k < rowIndexes.size(); k++) {
                int rowIndex = rowIndexes.get(k);
                int colIndex = colIndexes.get(k);
                System.out.println("[" + rowIndex + ", " + colIndex + "]");
            }
        }

        return found;
    }
}
