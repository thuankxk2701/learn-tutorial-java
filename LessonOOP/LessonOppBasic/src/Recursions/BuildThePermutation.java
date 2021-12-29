package Recursions;
import java.util.*;
public class BuildThePermutation {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int numberTest=sc.nextInt();
        for(int i=0; i<numberTest;i++ ){
            int n=sc.nextInt();
            int a=sc.nextInt();
            int b=sc.nextInt();
            if((n/(a+b)<2)){
                System.out.println(-1);
           continue;
            }
          
        }
    }
}
