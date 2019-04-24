import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FindSubString {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int m = input.nextInt();
        String[] strArray = new String[m];
        for(int i=0; i<m; i++){
            strArray[i] = input.next();
        }
        String text = input.next();


        ArrayList<Integer[]> data = new ArrayList<>();
        for(int i=0; i<m; i++){
            int beg = 0, end = 0;
            int offset = 0;
            String tmp = text;
            while(tmp.contains(strArray[i])){
                beg = tmp.indexOf(strArray[i]);
                end = beg + strArray[i].length() - 1;
                data.add(new Integer[]{beg+offset, end+offset});
                offset = end - beg + 1;
                tmp = tmp.substring(end+1);
            }
        }

        int begin = 0;
        int count = 0;

        while(begin < text.length()){
            int end = begin;
            for(int i=0; i<data.size(); i++){
                int x = data.get(i)[0];
                int y = data.get(i)[1];
                int len = 0;
                if(x == begin){
                    if(len < y-x+1 || len == 0) {
                        len = y - x + 1;
                        end = begin + len;
                    }
                }
            }
            if(begin != end) {
                begin = end;
                count++;
            }else{
                begin++;
            }
        }
        System.out.println(count);
    }
}
