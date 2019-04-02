import java.util.Scanner;

public class PalindromeNm {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int L = input.nextInt();
        int R = input.nextInt();

        int count = 0;
        for(int i=L; i<=R; i++){
            if(isSuShu(i) && isHuiWengShu(i)){
                count++;
            }
        }
        System.out.println(count);
    }

    public static boolean isSuShu(int n){
        if( n == 2){
            return true;
        }
        if(n == 1){
            return false;
        }
        for(int i=2; i<n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static boolean isHuiWengShu(int n){
        String s = String.valueOf(n);
        String t = "";
        for(int i=s.length(); i>0; i--){
            t = t + s.charAt(i - 1);
        }
        return s.equals(t);
    }
}
