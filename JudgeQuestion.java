import java.util.Scanner;

public class JudgeQuestion {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int t = input.nextInt();
        int a = input.nextInt();

        int m1 = Math.min(t,a);
        int m2 = Math.min(n-a, n-t);
        System.out.println(m1+m2);
    }
}
