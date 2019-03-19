import java.util.Scanner;

public class IndependentStu {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        long x = input.nextLong();
        long f = input.nextLong();
        long d = input.nextLong();
        long p = input.nextLong();

        long n = (d - f * x) / (x + p) + f;
        System.out.println(n);
    }
}
