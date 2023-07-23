package Intro;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        int n,sum = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int cpy = n;
        while(n != 0) {
            int d = n%10;
            sum += d*d*d;
            n = n/10;
        }
        if( cpy == sum) {
            System.out.println("Palindrome number");
        }
        else  {
            System.out.println("Not a Palindrome number");
        }
    }
}
