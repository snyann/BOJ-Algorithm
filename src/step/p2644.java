package step;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p2644 {

    static int N, from, to, answer = -1;
    static int[][] arr;
    static boolean[] check;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        from = Integer.parseInt(st.nextToken());
        to = Integer.parseInt(st.nextToken());

        arr = new int[N + 1][N + 1];
        int M = Integer.parseInt(br.readLine());
        for (int i = 0; i < M; i++) {
            StringTokenizer str = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(str.nextToken());
            int b = Integer.parseInt(str.nextToken());
            arr[a][b] = arr[b][a] = 1;
        }

        check = new boolean[N + 1];
        dfs(from, 0);
        System.out.println(answer);

    }

    public static void dfs(int x, int y) {
        check[x] = true;
        if (x == to) {
            answer = y;
        }
        for (int i = 0; i <= N; i++) {
            if (arr[x][i] == 1 && !check[i]) {
                dfs(i, y + 1);
            }
        }
    }
}
