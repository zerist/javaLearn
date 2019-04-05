import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CoinCalculate {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        int n = input.nextInt();
        ArrayList<Integer> coins = new ArrayList<>();

        int flag = 0;
        for(int i=0; i<n; i++){
            coins.add(input.nextInt());
            if(coins.get(i) == 1){
                flag = 1;
            }
        }

        if(flag == 0){
            System.out.println(-1);
            System.exit(0);
        }

        Collections.sort(coins);

        int rst = 0;
        for(int i=1; i<=m; i++) {
            int left = i;
            int count = 0;
            int p = 1;
            while (left != 0) {
                int max_coin = coins.get(coins.size() - p);
                count += left / max_coin;
                left = left % max_coin;
                p++;
            }
            if(rst < count){
                rst = count;
            }
        }
        System.out.println(rst);
    }
}
