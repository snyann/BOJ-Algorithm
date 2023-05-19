package step;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p11724 {
    static int[][] arr;
    static boolean[] check;
    static int node,count=0;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        node = Integer.parseInt(st.nextToken());
        int line = Integer.parseInt(st.nextToken());

        arr=new int[node+1][node+1];
        for (int i = 0; i < line; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[a][b] = arr[b][a] = 1;
        }

        check=new boolean[node+1];
        for(int i = 1; i < node + 1; i++) {
            if (!check[i]) {
                dfs(i);
                count++ ;
            }
        }
        System.out.println(count);
    }

    public static void dfs(int x) {
        check[x]=true;
        for (int i = 0; i <= node; i++) {
            if (arr[x][i] == 1 && !check[i]) {
                check[i]=true;
                dfs(i);
            }
        }
    }
}
