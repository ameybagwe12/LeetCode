package Recursion;

public class Recur2 {
    public static void main(String[] args) {
        reverse(1824);
    }
    static int sum = 0;
    static void reverse(int num) {
        if (num < 10) {
            System.out.println(num);
            return;
        }

        else {

            // print the unit digit of the given number
            System.out.print(num % 10);

            // calling function for remaining number other
            // than unit digit
            reverse(num / 10);
        }
    }
}
