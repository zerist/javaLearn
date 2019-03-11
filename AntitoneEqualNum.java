//题目描述
//        设N是一个四位数，它的9倍恰好是其反序数（例如：1234 的反序数是4321），求N的值。
//        输入描述:
//        无
//        输出描述:
//        每行一个数，表示满足题目要求的数。
//        示例1
//        输入
//        复制
//        无
//        输出
//        复制
//        无
//        说明


public class AntitoneEqualNum {
    public static void main(String[] args){
        int N;
        int a0,a1,a2,a3;
        int b0,b1,b2,b3;

        int num;
        for(N = 1000; N < 10000 / 9; N++){
            b3 = N / 1000;
            b2 = N / 100 - b3 * 10;
            b1 = N / 10 - b3 * 100 - b2 * 10;
            b0 = N % 10;
            num = N * 9;
            a3 = num / 1000;
            a2 = num / 100 - a3 * 10;
            a1 = num / 10 - a3 * 100 - a2 * 10;
            a0 = num % 10;

            if((a3 == b0) && (a2 == b1) && (a1 == b2) && (a0 == b3)){
                System.out.println(N);
            }
        }
    }
}
