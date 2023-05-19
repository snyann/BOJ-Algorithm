package BOJ.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bruteforce_2231 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int answer=0;

        for (int i = 1; i <= n; i++) {
            int temp=i;
            int sum=0;

            while(temp!=0){
                sum+=temp%10;
                temp/=10;
            }

            if(sum+i==n) {
                answer=i;
                break;
            }
        }


        System.out.println(answer);
    }
}
