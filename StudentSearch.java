import java.util.Scanner;

public class StudentSearch {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int m = input.nextInt();
        String[][] rst = new String[m][4];
        for(int i=0; i<m; i++){
            int n = input.nextInt();
            String[][] data = new String[n][4];
            for(int j=0; j<n; j++){
                for(int k=0; k<4; k++){
                    data[j][k] = input.next();
                }

            }

            int id = input.nextInt();
            for(int j=0; j<n; j++){
                if(data[j][0].equals("" + id)){
                    rst[i] = data[j];
                }
            }
        }
        for(int i=0; i<m; i++){
            System.out.printf("%s %s %s %s\n", rst[i][0], rst[i][1], rst[i][2], rst[i][3]);
        }
    }
}

