package BOJ.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class greedy_13305 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());

        StringTokenizer st= new StringTokenizer(br.readLine());
        long[] len = new long[n - 1];
        for(int i=0; i < n-1; i++){
            len[i] = Long.parseLong(st.nextToken());
        }

        long[] price= new long[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            price[i]= Long.parseLong(st.nextToken());
        }

        long answer=0;
        long minprice=price[0];

        for(int i=0; i<len.length; i++) {
            if(price[i]<minprice) minprice=price[i];
            answer+=minprice*len[i];
        }

        System.out.println(answer);
        
    }
}
