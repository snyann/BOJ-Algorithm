package thiscode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class greedy11_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int[] arr = new int[s.length()];
        int answer = 0;
        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i) - '0';
        }
        for (int i = 0; i < arr.length; i++) {
            if (answer == 0) answer += arr[i];
            else {
                if (arr[i] == 0 || arr[i] == 1) answer += arr[i];
                else answer *= arr[i];
            }
        }

        System.out.println(answer);

    }
}
