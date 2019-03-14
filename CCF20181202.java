import java.util.Scanner;

public class CCF20181202 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        long r,y,g, n;
        r = input.nextLong();
        y = input.nextLong();
        g = input.nextLong();
        n = input.nextLong();

        long sum = 0L;
        long k, t;
        long tmp;
        long left = 0L;
        for(int i=0; i<n; i++){
            tmp = sum;
            k = input.nextLong();
            t = input.nextLong();
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
                if (left <= (r + y + g) && left >= (r + y) || left == 0) {
                    sum += 0;
                } else {
                    sum += r + y - left;
                }
            }
        }
        System.out.print(sum);
    }
}
