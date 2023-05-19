package step;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p2480 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        if (a != b && a != c && b != c) {
            int max = Math.max(a, Math.max(b, c));
            System.out.println(max * 100);
        } else if (a == b && a == c) {
            System.out.println(10000 + a * 1000);
        } else if (a == b || a == c) {
            System.out.println(1000 + a * 100);
        } else if (a == b || b == c) {
            System.out.println(1000 + b * 100);
        }
    }
}
