import java.util.ArrayList;
import java.util.Scanner;

public class CatWatcher {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i=0; i<n; i++){
            int m = input.nextInt();
            ArrayList<Vect> lastFrame = new ArrayList<>();
            ArrayList<Vect> frame = new ArrayList<>();
            int count = 0;
            for(int j=0; j<m; j++){
                lastFrame.clear();
                for(int tmp=0; tmp<frame.size(); tmp++){
                    lastFrame.add(frame.get(tmp));
                }
                frame.clear();
                int tnum = input.nextInt();
                for(int k=0; k<tnum; k++){
                    int x = input.nextInt();
                    int y = input.nextInt();
                    Vect vt = new Vect(x, y);
                    frame.add(vt);
                }
                for(int xx=0; xx<lastFrame.size(); xx++){
                    for(int yy=0; yy<frame.size(); yy++){
                        if(lastFrame.get(xx).equal(frame.get(yy))){
                            count++;
                        }
                    }
                }
            }
            System.out.println(count-1);
        }
    }

    static class Vect{
        int x;
        int y;
        public Vect(int x, int y){
            this.x = x;
            this.y = y;
        }
        public boolean equal(Vect t){
            if(this.x == t.x && this.y == t.y){
                return true;
            }
            return false;
        }
    }
}
