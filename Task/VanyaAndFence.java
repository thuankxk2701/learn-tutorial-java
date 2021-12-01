package Task;
import java.util.*;
public class VanyaAndFence {
    public static void main(String[] args){
   Scanner sc=new Scanner(System.in);
      int n = sc.nextInt();
      int m=sc.nextInt();
      int arr[]=new int[n];
      for(int i=0; i<n; i++){
          arr[i]=sc.nextInt();
      }
      int result=0;
      for(int  i : arr){

        if(i>m) result+=2;else result++;
        }
        System.out.println(result);
    }
}
