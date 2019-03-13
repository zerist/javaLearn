import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int m = input.nextInt();
        long[] rst = new long[m];
        for(int i=0; i<m; i++){
            long n = input.nextLong();
            long k = 1;
            for(int j=1; j<=n; j++){
                k = k * j;
            }
            rst[i] = k;
        }
        for(int i=0; i<m; i++){
            System.out.println(rst[i]);
        }
    }
}
