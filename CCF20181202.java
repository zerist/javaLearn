import java.util.Scanner;

public class CCF20181202 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int r,y,g, n;
        r = input.nextInt();
        y = input.nextInt();
        g = input.nextInt();
        n = input.nextInt();

        int sum = 0;
        for(int i=0; i<n; i++){
            int k, t;
            int tmp = sum;
            int left = 0;
            k = input.nextInt();
            t = input.nextInt();
            if(k == 0){
                sum += t;
            }else {
                if (k == 1) {
                    left = (r - t + tmp) % (r + y + g);
                }
                if (k == 2) {
                    left = (r + y - t + tmp) % (r + y + g);
                }
                if (k == 3) {
                    left = (r + y + g - t + tmp) % (r + y + g);
                }
                if (left <= (r + y + g) && left >= (r + y)) {
                    sum += 0;
                } else {
                    sum += r + y - left;
                }
            }
        }
        System.out.print(sum);
    }
}
