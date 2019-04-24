import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DispatchBall {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] list = new int[n];
        for(int i=0; i<n; i++){
            list[i] = scanner.nextInt();
        }
        HashMap<Integer, Integer> rst = new HashMap<>();
        for(int i=0; i<list.length; i++){
            if(rst.get(list[i]) == null){
                rst.put(list[i], 1);
            }else{
                int x = rst.get(list[i]) + 1;
                rst.put(list[i], x);
            }
        }

        int num = Integer.MAX_VALUE;
        for(Map.Entry<Integer, Integer> i : rst.entrySet()){
            if(num > i.getValue()){
                num = i.getValue();
            }
        }

        if( num <= 1){
            System.out.println(0);
            System.exit(0);
        }

        for(int i=num; i>=2; i--){
            int flag = 1;
            for(Map.Entry<Integer, Integer> j : rst.entrySet()){
                int k = j.getValue();
                if(k % i != 0){
                    flag = 0;
                }
            }
            if(flag == 1){
                System.out.println(list.length / i);
                System.exit(0);
            }
        }
        System.out.println(0);
    }
}
