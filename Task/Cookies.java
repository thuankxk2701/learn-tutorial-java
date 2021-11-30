package Task;
import java.util.*;
public class Cookies {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        int tempt=0;
        n = input.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++) {
            arr[i]=input.nextInt();

        }
        for(int i=0; i<n; i++){
            if(arr[i]%2==0)++tempt;
        }
        System.out.println(tempt);
    }
}
