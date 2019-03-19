import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CheseHeap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        ArrayList<Integer> x = new ArrayList<>();
        ArrayList<Integer> y = new ArrayList<>();

        for(int i=0; i<n; i++){
            x.add(input.nextInt());
        }
        for(int i=0; i<n;i++){
            y.add(input.nextInt());
        }

        ArrayList<Integer> x1 = new ArrayList<>();
        ArrayList<Integer> y1 = new ArrayList<>();
        int[] rst = new int[n];
        for(int i=0; i<n; i++){
            int count = 0;
            int m = i / 2;


            x1.add(x.get(i));
            Collections.sort(x1);


            y1.add(y.get(i));
            Collections.sort(y1);

            for(int j=0; j<=i; j++) {
                count = count + Math.abs(x1.get(j) - x1.get(m));
                count = count + Math.abs(y1.get(j) - y1.get(m));
            }
            rst[i] = count;
        }
        for(int i=0; i<n; i++){
            System.out.printf("%d ", rst[i]);
        }
    }
}
