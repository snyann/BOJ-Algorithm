package BOJ.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class greedy_2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int answer = 0;

        while(true){
            if(n%5==0){
                answer+=n/5;
                break;
            }
            if(n<=2){
                answer=-1;
                break;
            }
            n-=3;
            answer++;
        }
        System.out.println(answer);
    }
}
