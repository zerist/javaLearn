import java.util.Scanner;

public class AirTravel {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int s = input.nextInt();
        int[] list = new int[n];
        for(int i=0; i<n; i++){
            list[i] = input.nextInt();
        }

        int count = 0;
        for(int i=0; i<n; i++){
            if(s >= list[i]){
                count++;
                s -= list[i];
            }else{
                break;
            }
        }

        System.out.println(count);
    }
}
