package thiscode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class implementation12_2 {
    public static void main(String[] args) throws IOException {
        ArrayList<Character> arr = new ArrayList<Character>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s= br.readLine();
        int sum=0;

        for(int i = 0; i <s.length(); i++){
            if(Character.isLetter(s.charAt(i))) arr.add(s.charAt(i));
            else sum+=s.charAt(i)-'0';
        }

        Collections.sort(arr);

        for(int i = 0; i < arr.size(); i++){
            System.out.print(arr.get(i));
        }
        System.out.print(sum);
    }
}
