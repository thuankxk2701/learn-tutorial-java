package Recursions;
import java.util.*;

public class FindArray {
    public static void main(String[] args){
        int N = 7000005;
        boolean[] check = new boolean[N + 1];

        for (int i = 2; i <= N; i++) {
            check[i] = true;
        }
        for (int i = 2; i <= N; i++) {
            if (check[i] == true) {
                for (int j = 2 * i; j <= N; j += i) {
                    check[j] = false;
                }
            }
        }

        int arr[]=new int[N+1];
        int currentValue=0;
        for (int i = 2; i <= N; i++) {
            if (check[i] == true) {
                arr[currentValue] = i;
                currentValue++;
            }
        }

  Scanner sc= new Scanner(System.in);
     int  numberTest= sc.nextInt();

     for(int i=0;i<numberTest; i++){
        int test= sc.nextInt();
         for(int j=0; j<test; j++) {
             System.out.printf("%d ",arr[j]);
         }
         System.out.printf("\n");

     }


    }

}