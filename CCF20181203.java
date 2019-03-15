import java.util.Scanner;

public class CCF20181203 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();

        int[] list = new int[5];
        CCF20181203.getStdIp(list, text);
        System.out.printf("%d.%d.%d.%d/%d", list[0], list[1], list[2], list[3], list[4]);
    }

    public static void getStdIp(int[] array, String text){
        int type = 0;
        if(!text.contains("/")){
            type = 2;
        } else {
            int count = 0;
            for (int i = 0; i < text.length(); i++) {
                if (text.charAt(i) == '.') {
                    count++;
                }
            }
            if (count != 3) {
                type = 1;
            }
        }
        String[] tmp = new String[5];
        if(type == 0){
            tmp = text.split("\\.|\\/");
            for(int i=0; i<tmp.length; i++){
                array[i] = Integer.parseInt(tmp[i]);
            }
        }
        if(type == 1){
            String[] pre = text.split("\\/")[0].split("\\.");
            for(int i=0; i<pre.length; i++){
                array[i] = Integer.parseInt(pre[i]);
            }
            for(int i=pre.length; i<array.length; i++){
                array[i] = 0;
            }
            array[array.length - 1] = Integer.parseInt(text.split("\\/")[1]);
        }
        if(type == 2){
            String[] pre = text.split("\\.");
            for(int i=0; i<pre.length; i++){
                array[i] = Integer.parseInt(pre[i]);
            }
            for(int i=pre.length; i<array.length; i++){
                array[i] = 0;
            }
            array[array.length - 1] = pre.length * 8;
        }
    }
}
