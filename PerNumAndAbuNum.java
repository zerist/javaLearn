//题目描述
//        设a、b、c 均是0 到9 之间的数字，abc、bcc 是两个三位数，且有：abc+bcc=532。求满足条件的所有a、b、c 的值。
//        输入描述:
//        无。
//        输出描述:
//        每行输出3个数，分别表示abc的值，用一个空格隔开。
//        示例1
//        输入
//        复制
//        无
//        输出
//        复制
//        无
//        说明

public class PerNumAndAbuNum {
    public static void main(String[] args){
        int sum = 0;
        int[] perNum = new int[70];
        int[] abuNum = new int[70];
        for(int n=2; n<=60; n++){
            sum = 0;
            for(int i=1; i<n; i++){
                if(n / i * i == n){
                    sum += i;
                }
            }

            if(sum == n){
                perNum[n] = n;
            }
            if(sum > n){
                abuNum[n] = n;
            }
        }

        System.out.print("E: ");
        for(int e: perNum){
            if(e != 0) {
                System.out.print(e);
                System.out.print(" ");
            }
        }

        System.out.print("G: ");
        for(int e: abuNum){
            if(e != 0) {
                System.out.print(e);
                System.out.print(" ");
            }
        }
    }
}
