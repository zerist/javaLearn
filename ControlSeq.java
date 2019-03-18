import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class ControlSeq {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<n; i++){
            int m = input.nextInt();
            if(i % 2 == 0) {
                list.add(m);
            }else{
                list.add(0, m);
            }
        }
        if(n % 2 == 0) {
            for (int i = 0; i < list.size(); i++) {
                System.out.print(list.get(i) + " ");
            }
        }else{
            for(int i = list.size(); i>0; i--){
                System.out.print(list.get(i- 1) + " ");
            }
        }
//        ArrayList<Integer> seq = new ArrayList<>();
//        ArrayList<Integer> tmp = new ArrayList<>();
//        for(int i=0; i<n; i++){
//            seq.add(list.get(i));
//
//            for(int j=seq.size(); j>0; j--){
//                tmp.add(seq.get(j-1));
//            }
//            Collections.copy(seq, tmp);
//            tmp.clear();
//        }
//
//        for(Integer e: seq){
//            System.out.print(e+ " ");
//        }
    }
}
