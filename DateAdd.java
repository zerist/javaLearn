import java.util.Scanner;

public class DateAdd {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        int year=0, month=0, day=0, num=0;
        int[] days_per_month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for(int i=0; i<m; i++){
            year = input.nextInt();
            month = input.nextInt();
            day = input.nextInt();
            num = input.nextInt();

            while(num > 0){
                if((((year % 4) == 0 && (year % 100) != 0) || (year % 400) == 0) && month == 2){
                    if(day == 29){
                        day = 1;
                        month++;
                    }else{
                        day++;
                    }
                } else if(day == days_per_month[month - 1]){
                    day = 1;
                    if(month == 12){
                        year++;
                        month = 1;
                    }else{
                        month++;
                    }

                }else{
                    day++;
                }

                num--;
            }

            String tm = (month < 10) ? ("0"+month) : (""+month);
            String td = (day < 10) ? ("0"+day) : (""+day);
            System.out.printf("%s-%s-%s\n", year, tm, td);
        }

    }
}
