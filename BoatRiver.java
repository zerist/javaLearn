import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BoatRiver {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        ArrayList<Integer> rst = new ArrayList<>();
        for(int i=0; i<n; i++){
            ArrayList<Integer> list = new ArrayList<>();
            int m = input.nextInt();
            for(int k=0; k<m; k++){
                list.add(input.nextInt());
            }
            int count = 0;
            int base = Collections.min(list);
            Collections.sort(list);
            while(list.size() != 1){
                int x = list.get(list.size() - 1);
                count += x;
                list.remove(list.size() - 1);
                if(list.size() != 1){
                    x = list.get(list.size() - 1);
                    list.remove(list.size() - 1);
                }
                count += x;
                base = x;
            }
            count -= base;
            rst.add(count);
        }
        for(int i=0; i<rst.size(); i++){
            System.out.println(rst.get(i));
        }
    }
}
