package thiscode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.StringTokenizer;

public class hashexample {public static void main(String[] args) throws IOException {
    LinkedHashMap<String, Integer> hm = new LinkedHashMap<String, Integer>();
    BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st= new StringTokenizer(br.readLine());
    int max=0;
    for(int i=0; i <2; i++){
        String a;
        int b=0;
        hm.put(a=st.nextToken(),b+=Integer.parseInt(st.nextToken()));
        max=Math.max(hm.get(a),max);
    }
    for (String key : hm.keySet()) {
        max = hm.get(key);
        System.out.print(key);
    }

}

}
