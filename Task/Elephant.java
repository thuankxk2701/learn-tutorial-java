//package Task;
import java.util.*;
public class Elephant {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int   a=n/5;
        int b=n%5;
        if(b>1) b=1;
        if (n <
                5) {
            System.out.println(1);
        }else
        {
            System.out.println(a+b);
        }
    }
}
