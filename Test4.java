import java.util.*;

public class Test4
{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String text = input.next();
        TreeMap<Integer, String> rst = new TreeMap<>();
        Set<String> set = new HashSet<>();

        if(text.contains("直播")){
            rst.put(text.indexOf("直播"),"直播");
        }
        if(text.contains("游戏")){
            rst.put(text.indexOf("游戏"),"游戏");
        }

        for(Map.Entry<Integer, String> s: rst.entrySet()){
            System.out.println(s.getValue());
        }
    }
}
