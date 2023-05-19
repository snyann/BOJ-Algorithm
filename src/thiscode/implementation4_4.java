package thiscode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class implementation4_4 {
    public static boolean[][] visit;
    public static int[] dx = {-1, 0, 1, 0};
    public static int[] dy = {0, 1, 0, -1};

    public static int nx, ny;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st2.nextToken());
        int y = Integer.parseInt(st2.nextToken());
        int dir = Integer.parseInt(st2.nextToken());
        visit = new boolean[n][m];
        visit[x][y] = true;
        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            StringTokenizer st3 = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(st3.nextToken());
            }
        }
        int cnt = 1;
        visit[x][y] = true;

        while (true) {
            boolean canMove = false;
            for (int i = 0; i < 4; i++) {
                dir = dir - 1;
                if (dir == -1) dir = 3;
                nx = x + dx[dir];
                ny = y + dy[dir];
                if (nx >= 0 && ny >= 0 && nx < n && ny < m) {
                    if (!visit[nx][ny] && arr[nx][ny] == 0) {
                        x = nx;
                        y = ny;
                        visit[nx][ny] = true;
                        cnt++;
                        canMove = true;
                        break;
                    }
                }
            }
            if (!canMove) {
                nx = x - dx[dir];
                ny = y - dy[dir];
                if (arr[nx][ny] == 1) break;
                else {
                    x = nx;
                    y = ny;
                }
            }
        }

        System.out.println(cnt);


    }

}
