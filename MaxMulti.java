import java.util.*;

public class MaxMulti {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String[] str = input.nextLine().split(" ");
        ArrayList<Long> list = new ArrayList<>();
        long[] nums = new long[str.length];
        for(int i=0;i<nums.length;i++){
            nums[i] = Integer.parseInt(str[i]);

        }
        for(int i=0;i<str.length;i++){
            list.add(Long.parseLong(str[i]));

        }

        long tmp1 = Collections.min(list);
        list.remove(list.indexOf(tmp1));
        long tmp2 = Collections.min(list);
        list.add(tmp1);
        long m1 = Collections.max(list);
        list.remove(list.indexOf(m1));
        long m2 = Collections.max(list);
        list.remove(list.indexOf(m2));
        long  m3 = Collections.max(list);

        System.out.println(Math.max(tmp1 * tmp2 * m1, m1 * m2 * m3));

    }
}
