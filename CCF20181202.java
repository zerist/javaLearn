import java.util.Scanner;

public class CCF20181202 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Long r,y,g, n;
        r = input.nextLong();
        y = input.nextLong();
        g = input.nextLong();
        n = input.nextLong();

        Long sum = 0l;
        for(int i=0; i<n; i++){
            Long k, t;
            Long tmp = sum;
            Long left = 0l;
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
