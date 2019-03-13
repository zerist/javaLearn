import java.util.Scanner;

public class SubSection {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        double[] rst = new double[m];
        int count = 0;
        for(int i=0; i<m; i++){
            double x = (double) input.nextInt();
            double y = 0;
            if(x >= 0 && x < 2){
                y = 2.5 - x;
            }
            if(x >= 2 && x < 4){

                y = 2 - 1.5 * (x - 3) * (x - 3);
            }
            if(x >= 4 && x < 6){
                y = x / 2 - 1.5;
            }
            rst[count] = y;
            count++;
        }
        for(int i=0; i<m; i++){
            System.out.printf("y=%.1f\n", rst[i]);
        }
    }
}
