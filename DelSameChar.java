import java.nio.charset.CharacterCodingException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class DelSameChar {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String s = input.next();
        char[] cc = s.toCharArray();
        LinkedHashSet<Character> n = new LinkedHashSet<>();
        for(int i=0; i<cc.length; i++){
            n.add(cc[i]);
        }
        for(Character e: n){
            System.out.print(e);
        }
    }
}
