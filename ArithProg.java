import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class ArithProg {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<n; i++){
            list.add(input.nextInt());
        }
        Collections.sort(list);
        int d = list.get(1) - list.get(0);
        String rst = "Possible";
        for(int i=0; i<list.size() - 1; i++){
            if((list.get(i+1) - list.get(i)) != d){
                rst = "Impossible";
            }
        }
        System.out.println(rst);
    }
}
