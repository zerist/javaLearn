import java.util.ArrayList;
import java.util.Scanner;

public class TransformCode {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList<String[]> data = new ArrayList<>();
        while(input.hasNextLine()){
            String[] row = input.nextLine().split(" ");
            if(row.length == 1){
                break;
            }
            data.add(row);
        }

        for(int i=0; i<10; i++){
            if(data.equals(transform(data))){
                for(int j=0; j<data.size(); j++){
                    for(int k=0; k<data.get(j).length; k++){
                        if(data.get(j)[k].equals("1")){
                            System.out.println(-1);
                            System.exit(0);
                        }
                    }
                }
                System.out.println(i+1);
                break;
            }

        }
    }
    public static void printData(ArrayList<String[]> data){
        for(int i=0; i<data.size(); i++){
            for(int k=0; k<data.get(i).length; k++){
                System.out.print(data.get(i)[k] + " ");
            }
            System.out.println();
        }
    }

    public static ArrayList<String[]> transform(ArrayList<String[]> data){
        for(int i=0; i<data.size(); i++){
            for(int k=0; k<data.get(i).length; k++){
                if(data.get(i)[k].equals("2")){
                    if(i==0 && k==0){
                        if(data.get(i+1)[k].equals("1")){
                            data.get(i+1)[k] = "2";
                        }
                        if(data.get(i)[k+1].equals("1")){
                            data.get(i)[k+1] = "2";
                        }
                    }
                    if(i==0 && k==(data.get(i).length-1)){
                        if(data.get(i+1)[k].equals("1")){
                            data.get(i+1)[k] = "2";
                        }
                        if(data.get(i)[k-1].equals("1")){
                            data.get(i)[k-1] = "2";
                        }
                    }
                    if(i==(data.size()-1) && k==0){
                        if(data.get(i-1)[k].equals("1")){
                            data.get(i-1)[k] = "2";
                        }
                        if(data.get(i)[k+1].equals("1")){
                            data.get(i)[k+1] = "2";
                        }
                    }
                    if(i==(data.size()-1) && k==data.get(i).length-1){
                        if(data.get(i-1)[k].equals("1")){
                            data.get(i-1)[k] = "2";
                        }
                        if(data.get(i)[k-1].equals("1")){
                            data.get(i)[k-1] = "2";
                        }
                    }
                    if(i==0 && k!= 0 && k!=(data.get(i).length-1)){
                        if(data.get(i+1)[k].equals("1")){
                            data.get(i+1)[k] = "2";
                        }
                        if(data.get(i)[k-1].equals("1")){
                            data.get(i)[k-1] = "2";
                        }
                        if(data.get(i)[k+1].equals("1")){
                            data.get(i)[k+1] = "2";
                        }
                    }
                    if(i==(data.size()-1) && k!=(data.get(i).length-1)){
                        if(data.get(i-1)[k].equals("1")){
                            data.get(i-1)[k] = "2";
                        }
                        if(data.get(i)[k-1].equals("1")){
                            data.get(i)[k-1] = "2";
                        }
                        //you
                        if(data.get(i)[k+1].equals("1")){
                            data.get(i)[k+1] = "2";
                        }
                    }
                    if(k==0 && i!=0 && i!=(data.size()-1)){
                        if(data.get(i-1)[k].equals("1")){
                            data.get(i-1)[k] = "2";
                        }
                        //xia
                        if(data.get(i+1)[k].equals("1")){
                            data.get(i+1)[k] = "2";
                        }
                        if(data.get(i)[k+1].equals("1")){
                            data.get(i)[k+1] = "2";
                        }
                    }
                    if(k==(data.get(i).length-1) && i!=0 && i!=(data.size()-1)){
                        if(data.get(i-1)[k].equals("1")){
                            data.get(i-1)[k] = "2";
                        }
                        //xia
                        if(data.get(i+1)[k].equals("1")){
                            data.get(i+1)[k] = "2";
                        }
                        //zuo
                        if(data.get(i)[k-1].equals("1")){
                            data.get(i)[k-1] = "2";
                        }
                    }

                }
            }
        }
        return data;
    }
}
