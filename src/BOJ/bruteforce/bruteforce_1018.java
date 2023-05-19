package BOJ.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bruteforce_1018 {
    public static boolean[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int m= Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            String s=br.readLine();
            for(int j = 0; j < m; j++){
                if(s.charAt(j)=='W') arr[i][j]=true;
                else arr[i][j]=false;
            }
        }



    }
}
