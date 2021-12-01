package Task;
import java.util.*;
public class Dungeon {
    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);
  int n= sc.nextInt();
    for(int i=0; i<n; i++){
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
         int tempt=(a+b+c)/9;
        if ((a +
                b +
                c) %
                9 ==
                0 &&
                a >=
                        tempt &&
                b >=
                        tempt &&
                c >=
                        tempt) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
    }
}
