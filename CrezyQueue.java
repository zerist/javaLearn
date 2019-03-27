import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CrezyQueue {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        ArrayList<Integer> list1 = new ArrayList<>();

        for(int i=0; i<n; i++){
            list1.add(input.nextInt());
        }

        ArrayList<Integer> list2 = new ArrayList<>();
        Collections.sort(list1);
        list2.add(list1.get(0));

        int count = n - 1;
        int m = 1;
        int flag = 0;
        while (n > 1){
            if(flag == 0) {
                list2.add(list1.get(count));
                count--;
            }
            if(flag == 1){
                list2.add(0,list1.get(count));
                count--;
            }
            if(flag == 2){
                list2.add(list1.get(m));
                m++;
            }
            if(flag == 3){
                list2.add(0,list1.get(m));
                m++;
            }

            flag = (flag+1) % 4;
            n--;
        }

        int rst1 = 0;
        for(int i=0; i<list1.size()-1;i++){
            rst1 += Math.abs(list2.get(i) - list2.get(i+1));
        }


        count = list1.size()-2;
        flag = 0;
        m = 0;
        n = list1.size();
        list2.clear();
        list2.add(list1.get(count+1));
        while (n > 1){
            if(flag == 0) {
                list2.add(list1.get(m));
                m++;
            }
            if(flag == 1){
                list2.add(0,list1.get(m));
                m++;
            }
            if(flag == 2){
                list2.add(list1.get(count));
                count--;
            }
            if(flag == 3){
                list2.add(0,list1.get(count));
                count--;
            }

            flag = (flag+1) % 4;
            n--;
        }
        int rst2 = 0;
        for(int i=0; i<list1.size()-1;i++){
            rst2 += Math.abs(list2.get(i) - list2.get(i+1));
        }




        System.out.println((rst1>rst2)?rst1:rst2);

    }
}


