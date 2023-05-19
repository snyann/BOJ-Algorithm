package thiscode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class greedy3_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int answer = Integer.MIN_VALUE; // answer 변수 초기값 설정
        int arr[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int min = Integer.MAX_VALUE; // 각 행의 최솟값을 저장할 변수
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(st2.nextToken());
                min = Math.min(min, arr[i][j]); // 각 행에서 가장 작은 수 찾기
            }
            answer = Math.max(answer, min); // 각 행에서 구한 최솟값 중에서 가장 큰 값 찾기
        }
        System.out.println(answer);
    }
}
