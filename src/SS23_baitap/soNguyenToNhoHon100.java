package SS23_baitap;

// 3+4
public class soNguyenToNhoHon100 {
                   public static void main(String[] args) {
                int count = 0;
                int number = 2;
                System.out.println("20 sô nguyên tố đầu tiên: ");
                while (count < 20) {
                    if (isPrime(number)) {
                        System.out.print(" " + number);
                        count++;
                    }
                    number++;
                }
                System.out.println();
                System.out.println("Sô nguyên tố nhỏ hơn 100: ");
                for (int i = 2; i <= 100; i++) {
                    if (isPrime(i)) {
                        System.out.print(" " + i);
                    }
                }
            }
            public static boolean isPrime(int number) {
                for (int i = 2; i <= Math.sqrt(number); i++) {
                    if (number % i == 0) {
                        return false;
                    }
                }
                return true;
            }
    }
