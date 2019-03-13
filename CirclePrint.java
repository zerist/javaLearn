import java.util.ArrayList;
import java.util.Scanner;

public class CirclePrint {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int m = input.nextInt();
        ArrayList<ArrayList<Integer>> t = new ArrayList<>();
        for(int i=0; i<m; i++){
            int n = input.nextInt();
            ArrayList<Integer> rst = new ArrayList<>();
            ArrayList<Integer> list = new ArrayList<>();
            for(int j=0; j<n; j++){
                list.add(j);
            }
            int count = 0;
            int p = 0;
            while(n > 0){
                count++;
                p++;
                if(p > n){
                    p = 1;
                }
                if(count == 3){
                    count = 0;
                    rst.add(list.get(p-1));
                    list.remove(p-1);
                    n--;
                    p--;
                }

            }
            t.add(rst);
        }
        for(int i=0; i<m; i++){
            for(int j=0; j<t.get(i).size(); j++){
                System.out.print(t.get(i).get(j) + 1 + " ");
            }
            System.out.println();
        }

    }
}
