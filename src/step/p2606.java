package step;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class p2606 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int node = Integer.parseInt(br.readLine());
        int line = Integer.parseInt(br.readLine());

        int[][] arr = new int[node + 1][node + 1];
        for (int i = 0; i < line; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[a][b] = arr[b][a] = 1;
        }

        boolean[] check = new boolean[node + 1];
        Queue<Integer> q= new LinkedList<>();

        q.add(1);
        check[1] = true;

        int count = 0;
        while (!q.isEmpty()) {
            int start = q.poll();
            for (int i = 1; i <= node; i++) {
                if (arr[start][i] == 1 && !check[i]) {
                    check[i] = true;
                    q.add(i);
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}

