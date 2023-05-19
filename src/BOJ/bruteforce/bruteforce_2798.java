package BOJ.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class bruteforce_2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int m= Integer.parseInt(st.nextToken());

        Integer[] arr= new Integer[n];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i < n; i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr, Collections.reverseOrder());

        int answer=0;
        int temp=0;

        for(int i = 0; i < n-2; i++){
            for (int j = i+1; j < n-1; j++) {
                for (int k=j+1; k < n; k++) {
                    temp=arr[i]+arr[j]+arr[k];
                    if(temp==m) answer=temp;
                    if(temp<m&&answer<temp) answer=temp;
                }
            }
        }
        System.out.println(answer);
    }
}
