import java.util.Scanner;

public class PerferArray {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int k = input.nextInt();

        int[] list = new int[n];
        list[0] = k;
        for(int i=1; i<n; i++){
            int count = 0;
            for(int m=1; m<k; m++){
                if(list[0] % m != 0){

                }
            }
            list[i] = (k-list[i-1]+1);
        }
    }
}
