import java.util.Scanner;
import java.util.Stack;
public class MaxMinStack{
    public int max1;
    public int max2;
    public int min1;
    public int min2;
    public Stack<Integer> stack = new Stack<>();

    public void push(int data){
        this.stack.push(data);
        if(this.max1 < data){
            int x = this.max1;
            this.max1 = data;

            if(this.max2 < x){
                this.max2 = x;
            }
        }else {
            if (this.max2 < data){
                this.max2 = data;
            }
        }

        if(this.min1 > data){
            int x = this.min1;
            this.min1 = data;
            if(this.min2 > x){
                this.min2 = x;
            }
        }else{
            if(this.min2 > data){
                this.min2 = data;
            }
        }
    }

    public int pop(){

        int x = this.stack.pop();
        if(x == this.max1){
            this.max1 = this.max2;
        }
        if(x == this.min1){
            this.min1 = this.min2;
        }
        return x;
    }

    public int min(){
        return this.min1;
    }

    public int max(){
        return this.max1;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        MaxMinStack st = new MaxMinStack();
        for(int i=0; i<n; i++){
            st.push(input.nextInt());
        }
        st.pop();
        System.out.print(st.min() + " " + st.max());
    }
}
