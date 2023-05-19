package BOJ.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class string_10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int[] arr= new int[26];
        for(int i = 0; i < 26; i++){
            arr[i]=-1;
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(arr[ch - 'a'] == -1) {
                arr[ch - 'a'] = i;
            }
        }

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
