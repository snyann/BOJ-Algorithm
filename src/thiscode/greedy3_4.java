package thiscode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class greedy3_4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        int n= Integer.parseInt(st.nextToken());
        int k= Integer.parseInt(st.nextToken());
        int answer=0;

        while(true){
            if(n==1) break;
            else if(n%k==0){
                answer++;
                n/=k;
            }
            else{
                answer++;
                n-=1;
            }
        }
        System.out.println(answer);


    }
}
