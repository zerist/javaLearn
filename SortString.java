import java.util.Scanner;

public class SortString {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int m = input.nextInt();
        input.nextLine();
        String[] text = new String[m];
        for(int i=0; i<m; i++){
            text[i] = input.nextLine();
        }

        int head = 0, tail = 0;
        int count = 0;
        String str = "";
        for(int i=0; i<m; i++){
            str = "";
            tail++;
            head = (tail > 4) ? (tail - 4) : 0;
            count = 0;
            for(int j=tail-1; j>head-1;j--){
                count++;
                str = str + count + "=" + text[j] + " ";
            }
            System.out.println(str);
        }
    }
}
