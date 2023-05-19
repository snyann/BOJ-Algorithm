package thiscode;

public class greedy3_1 {
    public static void main(String[] args) {
        int n=1260;
        int count=0;
        int[] cointypes={500, 100, 50, 10};
        for(int i=0; i<cointypes.length; i++){
            int coin=cointypes[i];
            count+=n/coin;
            n%=coin;
        }
        System.out.println(count);

    }
}
