package bai15;

import java.util.Scanner;
import java.util.Stack;

public class BaiTap15 {
    public static void main(String[] args) {
        System.out.println("Nhập vào số thập phân");
        int number = new Scanner(System.in).nextInt();
        Stack<Integer> stack = new Stack<>();
        while (number!=0){
            int mod = number%2;
            stack.push(mod);
            number/=2;

        }
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
