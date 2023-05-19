package thiscode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class robot {
    static int[][] arr;
    static boolean[][] visit;
    static int n,m;
    static int[] dx = {-1, 1, 0};
    static int[] dy = {0, 0, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        n=Integer.parseInt(st.nextToken());
        m=Integer.parseInt(st.nextToken());

        arr=new int[n][m];
        for (int i = 0; i < n; i++) {
            String s= br.readLine();
            for(int j=0; j < m; j++){
                arr[i][j]=s.charAt(i)-'0';
            }
        }

        visit=new boolean[n][m];
        visit[0][0]=true;
        bfs(0,0);
        System.out.println(arr[n-1][m-1]);

    }
    public static void bfs(int x, int y){
        Queue<Integer> q= new LinkedList<>();
        q.offer(x);
        q.offer(y);
        while(!q.isEmpty()){
            int nowX=q.poll();
            int nowY=q.poll();
            for(int i = 0; i < 3; i++){
                int nextX=nowX+dx[i];
                int nextY=nowY+dy[i];
                if(nextX<0||nextY<0||nextX>=n||nextY>=m) continue;
                int max=Math.max(arr[nextX][nextY],-101);
                if(arr[nextX][nextY]==max||!visit[nextX][nextY]){
                    visit[nextX][nextY]=true;
                    arr[nextX][nextY]+=arr[nowX][nowY];
                    q.offer(nextX);
                    q.offer(nextY);
                }
            }
        }
    }
}
