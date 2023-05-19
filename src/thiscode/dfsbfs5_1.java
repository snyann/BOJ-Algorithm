package thiscode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class dfsbfs5_1 {
    static int n, m;
    static int[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr= new int[n][m];
        for(int i = 0; i < n; i++){
            String s= br.readLine();
            for (int j = 0; j < m; j++) {
                arr[i][j]=s.charAt(j)-'0';
            }
        }

        int answer=0;
        for(int i = 0; i < n; i++){
            for (int j = 0; j < m; j++) {
                if(dfs(i,j)) answer++;
            }
        }
        System.out.println(answer);
    }
    public static boolean dfs (int x, int y) {
        if (x < 0 || y < 0 || x >= n || y >= m) return false;
        if (arr[x][y] == 0) {
            arr[x][y] = 1;
            dfs(x - 1, y);
            dfs(x + 1, y);
            dfs(x, y - 1);
            dfs(x, y + 1);
            return true;
        }
        return false;
    }
}