import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class SomeRandNum {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        ArrayList<ArrayList<Integer>> tt = new ArrayList<>();
        while(input.hasNextInt()) {
            HashSet<Integer> set1 = new HashSet<>();
            for (int i = 0; i < n; i++) {
                set1.add(input.nextInt());
            }

            ArrayList<Integer> rst = new ArrayList<>();
            for (Integer i : set1) {
                rst.add(i);
            }
            Collections.sort(rst);
            tt.add(rst);
        }

        for(int i=0; i<tt.size(); i++){
            for(int j=0; j<tt.get(i).size(); j++){
                System.out.println(tt.get(i).get(j));
            }
        }
    }
}
