package S14;

public class B2 {
    public static void main(String[] args) {
        int[] arr = getArr();
        System.out.println("Mảng số nguyên: ");
        printArray(arr);
        int min = linearSearchMin(arr);
        System.out.println("Số nhỏ nhất trong mảng: " + min);
    }

    private static int[] getArr() {
        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
    }

    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    private static int linearSearchMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
