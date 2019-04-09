import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double x = input.nextDouble();
        double y = input.nextDouble();

        String[] strLsit = input.next().split(",");
        List<Double> xList = new ArrayList<>();
        List<Double> yList = new ArrayList<>();

        for(int i=0; i<strLsit.length; i++){
            xList.add(Double.parseDouble(strLsit[i]));
            yList.add(Double.parseDouble(strLsit[i+1]));
            i++;
        }
    }

    public static boolean isInTri(double x, double y, double x1, double y1, double x2, double y2, double x3, double y3){
        double k1 = (x1 - x2) / (y1 - y2);
        double k2 = (x2-x3)/(y2-y3);
        double k3 = (x3-x1)/(y3-y1);

        if(!isPara(x,y,k1,x1,y1,x2,y2))

        return false;
    }

    public static boolean isPara(double x, double y, double k, double x1, double y1, double x2, double y2){

        return false;
    }
}
