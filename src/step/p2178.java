package step;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class p2178 {

    static boolean[][] check;
    static int[][] arr;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static int n, m;


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            for (int j = 0; j < m; j++) {
                arr[i][j] = s.charAt(j) - '0';
            }
        }

        check = new boolean[n][m];
        check[0][0] = true;
        bfs(0, 0);
        System.out.println(arr[n - 1][m - 1]);
    }

    public static void bfs(int x, int y) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[] {x, y});

        while (!q.isEmpty()) {
            int[] now = q.poll();
            int nowX = now[0];
            int nowY = now[1];

            for (int i = 0; i < 4; i++) {
                int nextX = nowX + dx[i];
                int nextY = nowY + dy[i];

                if (nextX < 0 || nextY < 0 || nextX >= n || nextY >= m)
                    continue;
                if (check[nextX][nextY] || arr[nextX][nextY] == 0)
                    continue;

                q.add(new int[]{nextX, nextY});
                arr[nextX][nextY] = arr[nowX][nowY] + 1;
                check[nextX][nextY] = true;
            }
        }

    }

}
        /*1. 처음에는 당연히 dfs인 줄 알고 dfs로 풀었다가 시간초과가 나서 bfs로 바꾸었다. 시간만 널널하면 dfs로 충분히 가능!

        2. 미로 입력에 공백이 들어가지 않으므로, string으로 받고, 한 글자씩 map에 삽입한다.

        3. 방문 체크를 위한 visited 배열을 준비하고, 첫 시작인 0,0 인덱스를 true로 설정한다.

        4. 시작 인덱스 0,0을 넘기며 bfs 함수를 시작한다.

        4-1. 이동 가능한 칸들의 인덱스를 저장할 Queue를 선언한다. (x,y)쌍의 int형 배열을 저장.

        4-2. 넘겨받은 x,y를 int형 배열로 만들어 큐에 삽입.

        5. 큐가 비어있지 않다면 반복

        5-1. 큐에서 원소 하나를 꺼내 각각 인덱스를 nowX, nowY에 저장한다.

        5-2. (nowX, nowY)를 기준으로 상하좌우를 확인해서 이동 가능한 인덱스가 있다면 그 인덱스를 큐에 저장한다.

        5-3. 그 인덱스의 값을 현재 인덱스(nowX, nowY)값보다 1 큰 값으로 설정한다.

        5-4. 그 인덱스의 방문체크를 한다*/