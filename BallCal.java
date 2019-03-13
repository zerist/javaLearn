import java.util.Scanner;

public class BallCal {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int m = input.nextInt();
        double[] rst = new double[m*2];
        for(int i=0; i<m; i++){
            int x1, y1, z1, x2, y2, z2;
            x1 = input.nextInt();
            y1 = input.nextInt();
            z1 = input.nextInt();
            x2 = input.nextInt();
            y2 = input.nextInt();
            z2 = input.nextInt();

            double radius = Math.sqrt(Math.pow(x1-x2,2) + Math.pow(y1-y2,2) + Math.pow(z1-z2,2));
            double bulk = 4.0d / 3.0d * Math.PI * Math.pow(radius, 3);
            rst[2*i] = radius;
            rst[2*i+1] = bulk;
        }

        for(int i=0; i<m; i++){
            System.out.printf("%.2f %.2f\n", rst[2*i], rst[2*i+1]);
        }
    }
}
