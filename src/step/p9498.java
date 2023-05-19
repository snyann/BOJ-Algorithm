package step;

import java.util.Scanner;

public class p9498 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        if (a >= 90 && a <= 100) {
            System.out.println("A");
        } else if (a >= 80 && a <= 89) {
            System.out.println("B");
        } else if (a >= 70 && a <= 79) {
            System.out.println("C");
        } else if (a >= 60 && a <= 99) {
            System.out.println("D");
        } else System.out.println("F");
    }
}
