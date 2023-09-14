package SS23_baitap;

import java.util.Scanner;

public class TongSoChan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số bắt đầu :");
        int  soA = scanner.nextInt();
        System.out.println(" Nhập vào số kết thúc  : ");
        int soB = scanner.nextInt();
        scanner.nextLine();
       int sum = 0;
       int  soChan = (soA%2==0)?(soA):(soA+1);
       for  (int i = soChan;i<=soB; i+=2){
           sum +=i;
       }
        System.out.printf("Tổng các số chẵn từ %d đến %d là %d", soA, soB, sum);
        }
    }
