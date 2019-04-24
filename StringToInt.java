import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StringToInt {


    static int string2int(String str) {
        char flag = '+';
        String text = str;
        if(str.charAt(0) == '-'){
            flag = '-';
            str = str.substring(1);
        }else if(str.charAt(0) == '+'){
            str = str.substring(1);
        }else{
            str = text;
        }
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == '.'){
                break;
            }else if(str.charAt(i) < '0' || str.charAt(i) > '9'){
                return 0;
            }else{
                stack.add(str.charAt(i));
            }
        }

        int k=0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == '.'){
                k++;
            }
        }
        if(k >= 2){
            return 0;
        }
        if(k == 1 && str.charAt(str.length() - 1) == '.'){
            return 0;
        }
        int num = 0;
        for(int i=0; i<stack.size(); i++){
            num += Math.pow(10, stack.size() - i - 1) * (stack.get(i) - '0');
        }
        if(flag == '-'){
            num = num - 2*num;
        }
        return num;

    }



    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int res;

        String _str;
        try {
            _str = in.nextLine();
        } catch (Exception e) {
            _str = null;
        }

        res = string2int(_str);
        System.out.println(String.valueOf(res));

    }
}
