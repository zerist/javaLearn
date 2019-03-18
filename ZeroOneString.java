import java.util.Scanner;

public class ZeroOneString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();

        String[] list = new String[50];
        int[] num = new int[50];
        for(int i=0; i<text.length()-1; i++){
            int begin = 0;
            int end = 0;
            int count = 1;
            String tmp = "01";
            while(text.substring(i, i+2 * count).equals(tmp)){
                begin = i;
                end = i + 2 * count;
                tmp = tmp + "01";
                count++;
                if(i + 2 * count > text.length()){
                    break;
                }
            }
            count = count * 2 - 2;

            if(begin != 0){
                if(text.charAt(begin-1) == '1'){
                    count++;
                }
            }

            if(end != text.length() && end != 0){
                if(text.charAt(end) == '0'){
                    count++;
                }
            }

            if(end != 0){
                list[i] = tmp;
                num[i] = count;
            }else{
                list[i] = "";
                num[i] = 0;
            }
        }

        int len = 0;
        int rst = 0;
        for(int i=0; i<text.length()-1; i++){
            if(len < list[i].length()){
                len = list[i].length();
            }
            if(rst < num[i]){
                rst = num[i];
            }
        }
        if(rst == 0) rst = 1;
        System.out.println(rst);
    }
}
