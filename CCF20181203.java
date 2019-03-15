import java.util.Scanner;

public class CCF20181203 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        input.nextLine();

        int[][] ip_list = new int[m][5];
        for (int i = 0; i < m; i++) {
            String text = input.nextLine();
            int[] list = new int[5];
            CCF20181203.getStdIp(list, text);
            ip_list[i] = list;
            //System.out.printf("%d.%d.%d.%d/%d", list[0], list[1], list[2], list[3], list[4]);
        }
        ipSort(ip_list);

        int[][] merged_list = new int[m][5];
        mergeList(ip_list, merged_list);

        for(int i=0; i<m; i++){
            int[] list = merged_list[i];
            System.out.printf("%d.%d.%d.%d/%d\n", list[0], list[1], list[2], list[3], list[4]);
        }
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

    public static void ipSort(int[][] array){
        int flag = 0;
        for(int i=0; i<array.length - 1; i++){
            for(int j=0; j<array.length - 1 - i; j++){
                if(ipCompare(array[j], array[j+1]) == 1){
                    int[] tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
        }
    }

    public static int ipCompare(int[] array1, int[] array2){
        int rst = 0;
        for(int i=0; i<array1.length; i++){
            if(array1[i] < array2[i]){
                rst = -1;
                break;
            }
            if(array1[i] == array2[i]){
                continue;
            }
            if(array1[i] > array2[i]){
                rst = 1;
                break;
            }
        }
        return rst;
    }

    public static void mergeList(int[][] array, int[][] rst){
        int[] flag = new int[array.length];
        for(int i=0; i<array.length - 1; i++){
            if(canMerged(array[i], array[i+1])){
                flag[i+1] = 1;
                array[i+1] = array[i];
            }
        }
        int count = 0;
        for(int i=0; i<array.length; i++){
            if(flag[i] == 0){
                rst[count] = array[i];
            }
        }
    }

    public static boolean canMerged(int[] array1, int[] array2){
        boolean rst = true;
        if(array1[4] > array2[4]){
            return false;
        }
        String tmp1 = "";
        String tmp2 = "";
        for(int i=0; i<4; i++){
            tmp1 += Integer.toBinaryString(array1[i]);
            tmp2 += Integer.toBinaryString(array2[i]);
        }
        for(int i=0; i<array1[4]; i++){
            if(tmp1.charAt(i) != tmp2.charAt(i)){
                return false;
            }
        }
        return rst;
    }
}
