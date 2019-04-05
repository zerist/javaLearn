import java.util.Scanner;

public class MonsterValley {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] monster = new int[n];
        for(int i=0; i<n; i++){
            monster[i] = input.nextInt();
        }
        int[] money = new int[n];
        for(int i=0; i<n; i++){
            money[i] = input.nextInt();
        }

        int tmp = 0;
        int count = 0;
        int[] paid = new int[n];
        int sum = 0;
        for(int i=0; i<n; i++){
            if(sum < monster[i]){
                count += money[i];
                sum += monster[i];

            }
        }

        System.out.println(count);
    }
}
