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

public class AddEqual {
    public static void main(String[] args) {
        //int a = 0, b = 0, c = 0;
        int n1, n2;
        for (int a = 0; a <= 9; a++) {
            for(int b=0; b <= 9; b++){
                for(int c=0; c<=9; c++){
                    n1 = a * 100 + b * 10 + c;
                    n2 = b * 100 + c * 11;
                    if((n1 + n2) == 532){
                        System.out.printf("%d %d %d\n", a, b, c);
                    }
                }
            }
        }
    }
}
