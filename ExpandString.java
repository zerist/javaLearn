import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ExpandString {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        ArrayList<String> t1 = new ArrayList<>();
        ArrayList<String> num = new ArrayList<>();


        int beg = 0, end = 0;
        for(int i=0; i<text.length(); i++){
            char ch = text.charAt(i);
            if(ch == '{' || ch == '[' || ch == '('){
                beg = i;
                for(int j=beg; j<text.length(); j++){
                    char ch2 = text.charAt(j);
                    if(ch2 == '}' || ch2 == ']' || ch2 == ')'){
                        end = j;
                        break;
                    }
                }
                t1.add(text.substring(beg+1, end));

                for(int j=i-1; j>=0; j--){
                    char ch3 = text.charAt(j);
                    if(ch3 < '0' || ch3 > '9'){
                        num.add(text.substring(j+1, i));
                        break;
                    }
                }
            }

        }

        for(int i=0; i<t1.size(); i++){
            int x = Integer.parseInt(num.get(i));
            String tmp = t1.get(i);
            String pp = "";
            for(int j=0; j<x; j++){
                pp += tmp;
            }
            String po="";
            for(int k=pp.length()-1; k>=0;k--){
                po+=pp.charAt(k);
            }
            t1.set(i, po);
            //System.out.println(t1.get(i) + " " +num.get(i));
        }

        ArrayList<String> rst = new ArrayList<>(Arrays.asList(text.split("[\\(\\[\\{]")));

        ArrayList<String> tt = new ArrayList<>();
        tt.add(rst.get(0));
        for(int i=1; i<rst.size(); i++){
            String ss[] = rst.get(i).split("[\\)\\}\\]]");

            if(ss.length > 1) {
                String tmp = ss[1];

                tt.add(tmp);
            }
        }



        for(int i=0; i<tt.size(); i++){
            String pp2 = "";
            String tmp = tt.get(i);
            for(int k=0; k<tmp.length(); k++){
                if(tmp.charAt(k) < '0' || tmp.charAt(k) > '9'){
                    pp2 += tmp.charAt(k);
                }
            }
            tt.set(i, pp2);
        }



        for(int i=0; i<t1.size(); i++){
            tt.set(i, tt.get(i)+t1.get(i));
        }



        for(int i=tt.size()-1; i>=0; i--){
            for(int k=tt.get(i).length()-1; k>=0; k--){
                System.out.print(tt.get(i).charAt(k));
            }
        }
    }
}
