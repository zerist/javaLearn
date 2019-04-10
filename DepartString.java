import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class DepartString {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String[] str = input.nextLine().split(" ");

        int n = Integer.parseInt(str[0]);

        ArrayList<String> rst = new ArrayList<>(Arrays.asList(str));
        ArrayList<String> pp = new ArrayList<>();
        rst.remove(0);
        for(int i=0; i<rst.size(); i++){
            if(rst.get(i).length() > 8){
                String tmp2 = rst.get(i);
                int x1 = 0, x2 = 8;
                while(x2 < tmp2.length() + 8){
                    if(x2 >= tmp2.length()){
                        x2 = tmp2.length();
                    }
                    String tmp3 = tmp2.substring(x1,x2);
                    for(int p=tmp3.length(); p<8; p++){
                        tmp3 += "0";
                    }
                    pp.add(tmp3);
                    x1 += 8;
                    x2 += 8;
                }
                //rst.set(i, rst.get(i).substring(0, 8));
            }else{
                String tmp = rst.get(i);
                for(int j=rst.get(i).length(); j<8; j++){
                    tmp += "0";
                }
                pp.add(tmp);
            }
        }

        Collections.sort(pp);

        for(String s : pp){
            System.out.print(s + " ");
        }
    }
}
