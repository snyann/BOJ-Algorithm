package BOJ.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class greedy_1541 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] sub = br.readLine().split("-");
        int answer = 0;
        for (int i = 0; i < sub.length; i++) {
            String[] add = sub[i].split("\\+");
            int sum = 0;
            for (int j = 0; j < add.length; j++) {
                sum += Integer.parseInt(add[j]);
            }
            if (i == 0) {
                answer = sum;
            } else {
                answer -= sum;
            }
        }
        System.out.println(answer);
    }
}
