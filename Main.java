import java.util.*;

public class Main {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = input.nextInt();
        }

        HashSet<ArrayList<Integer>> res = new HashSet<>();
        int tmp = -1;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                for(int k=j+1; k<n; k++){
                    tmp = nums[i] + nums[j] + nums[k];
                    if(tmp == 0){
                        ArrayList<Integer> t = new ArrayList<>();
                        t.add(nums[i]);
                        t.add(nums[j]);
                        t.add(nums[k]);
                        Collections.sort(t);
                        res.add(t);
                    }
                }
            }
        }



        for(ArrayList<Integer> p : res){
            System.out.println(p.get(0) + " " + p.get(1) + " " + p.get(2));
        }
    }
}

