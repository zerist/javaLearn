import java.util.ArrayList;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        ArrayList<String> rst = new ArrayList<>();
        while(input.hasNextLine()){
            String pp = input.nextLine().trim();
            if (pp.length() == 0) {
                break;
            }
            String[] text = pp.split(" ");
            String tmp = "";
            for(int i=0; i<text.length; i++){
                tmp += text[i];
            }

            String tt = "";
            if(tmp.length() <= 6){
                tt = tmp;
            }
            if(tmp.length() > 6 && tmp.length() <= 14){
                tt = tmp.substring(0, 6) + " " + tmp.substring(6);
            }

            if(tmp.length() >= 14){
                tt = tmp.substring(0, 6) + " " + tmp.substring(6,14) + " " + tmp.substring(14);
            }
            rst.add(tt);
        }

        for(String i: rst){
            System.out.println(i);
        }
    }


}
