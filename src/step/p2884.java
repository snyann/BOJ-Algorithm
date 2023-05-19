package step;

import java.util.Scanner;

public class p2884 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

        if (b >= 45) {
            b = b - 45;
        } else if (a == 0 && b < 45) {
            a = 23;
            b = b + 15;
        } else if (b < 45) {
            a = a - 1;
            b = b + 15;
        }
        System.out.printf("%d %d", a, b);
    }
}
