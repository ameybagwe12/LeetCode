package Intro;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = "";
        for(int i=a.length()-1 ;i>=0;i--){
            b +=  a.charAt(i);
        }
        if (a.equals(b)) {
            System.out.println("String is palindrome");
        }
        else {
            System.out.println("String is not a palindrome");
        }
        
    }
}
