package step;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p8393 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n= Integer.parseInt(br.readLine());
        int a=0;

        for (int i = 1; i < n+1; i++) {
            a+=i;
        }
        System.out.println(a);
    }
}
