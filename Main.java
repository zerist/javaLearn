import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int r, g, y;
        int n;

        r = input.nextInt();
        g = input.nextInt();
        y = input.nextInt();
        n = input.nextInt();

        int[] rst = new int[n];
        for(int i=0; i<n; i++){
            int k, t;
            k = input.nextInt();
            t = input.nextInt();

            if(k == 0){
                rst[i] = t;
            }
            if(k == 1){
                rst[i] = t;
            }
            if(k == 2){
                rst[i] = t + r;
            }
            if(k == 3){
                rst[i] = 0;
            }
        }
        int sum = 0;
        for(int i=0; i<n; i++){
            sum += rst[i];
        }
        System.out.println(sum);
    }

}