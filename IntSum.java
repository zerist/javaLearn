import java.util.Scanner;

public class IntSum {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int m = input.nextInt();
        int[] rst = new int[m];
        for(int i=0; i<m; i++){
            int n = input.nextInt();

            if(n >= 0){
                rst[i] = (n + 1) * 3 * n / 2;
            }else{
                rst[i] = 0 - (3 * n * n - 3 * n) / 2;
            }
        }

        for(int i=0; i<m; i++){
            System.out.println(rst[i]);
        }
    }
}
