package thiscode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class greedy11_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int cnt0 = 0;
        int cnt1 = 0;

        if (s.charAt(0) - '0' == 0) cnt1++;
        else cnt0++;

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) - '0' == s.charAt(i + 1) - '0') continue;
            else {
                if (s.charAt(i)==0) cnt1++;
                else cnt0++;
            }
        }

        System.out.println(Math.min(cnt0, cnt1));
    }
}
