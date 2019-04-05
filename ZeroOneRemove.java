import java.util.Scanner;

public class ZeroOneRemove {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        String text = input.next();

        int len = text.length();
        int tmp = 0;
        while(len != tmp){
            len = text.length();
            text = handle(text);
            tmp = text.length();
        }

        System.out.println(tmp);
    }

    public static String handle(String text){
        int len = text.length();
        char t1,t2;
        char[] list = text.toCharArray();
        for(int i=0; i<list.length-1; i++){
            t1 = list[i];
            t2 = list[i+1];
            if((t1 == '0' && t2 == '1') || (t1 == '1' && t2 == '0')){
                list[i] = 'x';
                list[i+1] = 'x';
            }
        }

        String rst = "";
        for(int i=0; i<list.length; i++){
            if(list[i] != 'x'){
                rst = rst + list[i];
            }
        }

        if(rst.length() != len){
            return rst;
        }

        return text;
    }
}
