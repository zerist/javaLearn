import java.util.Scanner;

public class ChocolateDispatch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = input.nextInt();
        }
        int m = input.nextInt();
        int[] w = new int[m];
        for(int i=0; i<m; i++){
            w[i] = input.nextInt();
        }

        int count = 0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(w[i] == h[j] && (w[i] != 0 && h[j] != 0)){
                    count++;
                    w[i] = 0;
                    h[j] = 0;
                    break;
                }
            }
            int num = 0;
            int pos1 = 0;
            int pos2 = 0;
            for(int j=0; j<n; j++){
                if(w[i] > h[j] && (w[i] != 0 && h[j] != 0)){
                    if(num < h[j]){
                        num = h[j];
                        pos1 = i;
                        pos2 = j;
                    }
                }
            }

            if(num != 0){
                count++;
                w[pos1] = 0;
                w[pos2] = 0;
                num = 0;
                pos1 = 0;
                pos2 = 0;
            }
        }
        if(count > n){
            count = n;
        }
        System.out.println(count);
    }
}
