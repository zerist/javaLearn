import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class RobotJump {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        ArrayList<Integer> data = new ArrayList<>();
        for(int i=0; i<n; i++){
            data.add(input.nextInt());
        }

        int count = 0;
        for(int i=0; i<n; i++){

            int en = 0;
            for(int k=0; k<i; k++){
                en += getP(k) * data.get(i-k);
            }
            if(count == 0){
                count = en / 2;
            }else{
                if(count > en){
                    count = en;
                }
            }
        }
        System.out.println(count);
    }

    public static int getP(int i){
        int pp = 1;
        for(int k=0; k<i; k++){
            pp = pp * 2;
        }
        return pp;
    }
}
