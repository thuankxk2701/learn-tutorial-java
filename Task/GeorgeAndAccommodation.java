package Task;
import java.util.*;
public class GeorgeAndAccommodation {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        int arr1[]=new int[n];
        int arr2[] = new int[n];
        for(int i=0;i<n;i++) {
            arr1[i]=sc.nextInt();
            arr2[i]=sc.nextInt();
        }
     for(int i=0;i<n;i++){
         if(arr2[i]-arr1[i]>=2){++c;};
     }
        System.out.println(c);
    }
}
