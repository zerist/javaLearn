
/*题目描述
打印所有不超过n（n<256）的，其平方具有对称性质的数。如11*11=121。
输入描述:
无
输出描述:
每行一个数，表示对称平方数。

示例1
        输入
        复制
        无
        输出
        复制
        无
        说明
*/
public class SymSquardNum {
    public static void main(String[] args){
        int a0,a1,a2,a3,a4;
        int tmp;

        for(int n = 1; n < 256; n++){
            tmp = n * n;
            a4 = tmp / 10000;
            a3 = tmp / 1000 - a4 * 10;
            a2 = tmp / 100 - a4 * 100 - a3 * 10;
            a1 = tmp / 10 - a4 * 1000 - a3 * 100 - a2 * 10;
            a0 = tmp % 10;

            if(tmp < 10){
                System.out.println(n);
            }else if(tmp <100){
                if(a0 == a1){
                    System.out.println(n);
                }
            }else if(tmp < 1000){
                if(a0 == a2){
                    System.out.println(n);
                }
            }else if(tmp < 10000){
                if((a0 == a3) && (a1 == a2)){
                    System.out.println(n);
                }
            }else{
                if((a0 == a4) && (a1 == a3)){
                    System.out.println(n);
                }
            }
        }
    }
}
