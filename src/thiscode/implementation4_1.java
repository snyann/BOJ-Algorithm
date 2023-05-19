package thiscode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class implementation4_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");
        int[] dx = {0, 0, -1, 1};
        int[] dy = {-1, 1, 0, 0};
        char[] c = {'L', 'R', 'U', 'D'};
        int x = 1;
        int y = 1;

        for (int i = 0; i < s.length; i++) {
            char a = s[i].charAt(0);
            int nx = -1;
            int ny = -1;
            for (int j = 0; j < 4; j++) {
                if (a == c[j]) {
                    nx = x + dx[j];
                    ny = y + dy[j];
                }
                if (nx < 1 || ny < 1 || nx > n || ny > n) continue;
                x = nx;
                y = ny;
            }
        }
        System.out.println(x + " " + y);
    }
}
