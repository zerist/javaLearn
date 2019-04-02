import javax.swing.text.MutableAttributeSet;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double xx = input.nextDouble();
        double xy = input.nextDouble();
        double yx = input.nextDouble();
        double yy = input.nextDouble();
        double zx = input.nextDouble();
        double zy = input.nextDouble();
        double wx = input.nextDouble();
        double wy = input.nextDouble();

        if(f(xx,xy,yx,yy,wx,wy) && f(yx,yy,wx,wy,zx,zy) && f(wx,wy,zx,zy,xx,xy)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }

    public static boolean edgeEqual(double x1, double y1, double x2, double y2, double x3, double y3){
        double e1Len = Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
        double e2Len = Math.sqrt((x2-x3)*(x2-x3) + (y2-y3)*(y2-y3));
        return e1Len==e2Len;
    }

    public static boolean edgeAngel(double x1, double y1, double x2, double y2, double x3, double y3){
        if(x1 == x2 && y2 == y3){
            return true;
        }
        if(x2 == x3 && y1 == y2){
            return true;
        }

        double k1 = (y1-y2) / (x1 - x2);
        double k2 = (y2-y3) / (x2 - x3);



        if(k1 * k2 == -1){
            return true;
        }
        return false;
    }

    public static boolean f(double x1, double y1, double x2, double y2, double x3, double y3){
        if(edgeEqual(x1,y1,x2,y2,x3,y3)){
            if(edgeAngel(x1,y1,x2,y2,x3,y3)){
                return true;
            }
        }
        return false;
    }
}
