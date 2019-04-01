import java.util.*;

public class Main {

    Date date = new Date(1234567);
    public static void main(String[] args) {
        Main m = new Main();
        m1(m.date, m);
        System.out.println(m.date.hashCode());
    }

    public static void m1(Date date1, Main m){
        System.out.println(date1 == m.date);
        //date = new Date(7654321);
        //System.out.println(date.hashCode());
    }
}

