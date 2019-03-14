import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ColorfulCube {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String s = input.next();
        Set<Character> r = new TreeSet<>();
        for(int i=0; i<s.length(); i++){
            r.add(s.charAt(i));
        }

        if(r.size() > 2){
            System.out.println(0);
        }
        if(r.size() == 2){
            System.out.println(2);
        }
        if(r.size() == 1){
            System.out.println(1);
        }
    }
}
