//题目描述
//        某人有8 角的邮票5 张，1 元的邮票4 张，1 元8 角的邮票6 张，用这些邮票中的一张或若干张可以得到多少中不同的邮资？
//        输入描述:
//        无
//        输出描述:
//        输出一行，表示题目所求。
//        示例1
//        输入
//        复制
//        无
//        输出
//        复制
//        无
//        说明    不能使用set
import java.util.Arrays;
public class Stamp {
    public static void main(String[] args){
        int s1 = 8, n1 = 5;
        int s2 = 10, n2 = 4;
        int s3 = 18, n3 = 6;

        int[] collection = new int[210];
        int tmp = 0;
        for(int i=0; i<=n1; i++){
            for(int j=0; j<=n2; j++){
                for(int k=0; k<=n3; k++){
                    tmp = s1 * i + s2 * j + s3 * k;
                    collection[k + j * (n3+1) + i * (n3+1) * (n2+1)] = tmp;
                }
            }
        }

        int[] rst = new int[210];
        Arrays.fill(rst, 0);
        int flag = 0;
        for(int i=0; i<collection.length; i++){
            flag = 0;
            for(int j=0; j<rst.length; j++){
                if( collection[i] == rst[j]){
                    flag = 1;
                }
            }
            rst[i] = (flag == 1) ? 0 : collection[i];
        }

        int count = 0;
        for(int e : rst) {
           if(e != 0) {
               count ++;
               //System.out.println(e);
           }
        }
        System.out.println(count);
    }
}
