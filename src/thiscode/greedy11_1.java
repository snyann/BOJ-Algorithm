package thiscode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class greedy11_1 {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> arr= new ArrayList<>();
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int n= Integer.parseInt(br.readLine());
        String[] s= br.readLine().split(" ");
        for(int i=0; i<n; i++){
            arr.add(Integer.parseInt(s[i]));
        }
        Collections.sort(arr);
        int answer=0;
        int group=0;
        for(int i = 0; i < n; i++){
            group++;
            if(arr.get(i)<=group) {
                answer++;
                group=0;
            }
        }
        System.out.println(answer);

    }
}
