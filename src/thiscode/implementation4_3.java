package thiscode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class implementation4_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine(); //a1입력
        int x = s.charAt(0) - 'a';
        int y = s.charAt(1) - '1';
        int[] dx = {-2, -2, -1, -1, 1, 1, 2, 2};
        int[] dy = {-1, 1, -2, 2, -2, 2, -1, 1};
        int cnt = 0;

        for (int i = 0; i < 8; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx < 0 || ny < 0 || nx >= 8 || ny >= 8) continue;
            cnt++;
        }
        System.out.println(cnt); //2출력
    }
}
