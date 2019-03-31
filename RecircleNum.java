import java.util.Scanner;

public class RecircleNum {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String t1 = input.next();
        int k1 = input.nextInt();
        String t2 = input.next();
        int k2 = input.nextInt();

        String x1="", x2="";
        for(int i=0; i<k1; i++){
            x1 += t1;
        }
        for(int i=0; i<k2; i++){
            x2 += t2;
        }

        //System.out.println(x1+"  "+x2);

        if(x1.length() < x2.length()){
            System.out.println("Less");
        }else if(x1.length() > x2.length()){
            System.out.println("Greater");
        }else{
            for(int i=0; i<k1; i++){
                if(x1.charAt(i) > x2.charAt(i)){
                    System.out.println("Greater");
                    break;
                }else if(x1.charAt(i) < x2.charAt(i)){
                    System.out.println("Less");
                    break;
                }
                if(i == k1 - 1 && x1.charAt(i) == x2.charAt(i)){
                    System.out.println("Equal");
                }
            }
        }
    }

}
