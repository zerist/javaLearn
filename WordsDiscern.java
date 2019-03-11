//题目描述
//        输入一个英文句子，把句子中的单词(不区分大小写)按出现次数按从多到少把单词和次数在屏幕上输出来，要求能识别英文句号和逗号，即是说单词由空格、句号和逗号隔开。
//        输入描述:
//        输入有若干行，总计不超过1000个字符。
//        输出描述:
//        输出格式参见样例。
//        示例1
//        输入
//        复制
//        A blockhouse is a small castle that has four openings through which to shoot.
//        输出
//        复制
//        a:2
//        blockhouse:1
//        castle:1
//        four:1
//        has:1
//        is:1
//        openings:1
//        shoot:1
//        small:1
//        that:1
//        through:1
//        to:1
//        which:1
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
public class WordsDiscern {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        String[] textArray = new String[1000];
        textArray = text.toLowerCase().trim().split("[,.\\s]");

        int[] numArray = new int[1000];
        String[] tmpArray = new String[1000];
        int flag = 0;
        int count = 0;
        for(int i=0; i<textArray.length; i++){
            flag = 0;
            for(int j=0; j<1000; j++){
                if(textArray[i].equals(tmpArray[j])){
                    flag = 1;
                    numArray[j]++;
                }
            }
            if(flag == 0){
                tmpArray[i] = textArray[i];
                numArray[i] = 1;
            }
        }

        TreeMap<String, Integer> map = new TreeMap<String, Integer>();
        for(int i=0; i<1000; i++){
            if(numArray[i] != 0){
                if(tmpArray[i].length() != 0){  //清除空字符串
                    map.put(tmpArray[i], numArray[i]);
                }
                //System.out.printf("%s:%d\n", tmpArray[i], numArray[i]);
            }
        }
        for(Map.Entry<String, Integer> e : map.entrySet()){
            System.out.printf("%s:%d\n", e.getKey(), e.getValue());
        }
    }
}


