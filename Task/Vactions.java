package Task;
import java.util.Scanner;
public class Vactions {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n,value;
        n=sc.nextInt();
        int[][] array=new int[105][5];
        for(int i=1; i<=n; i++)
            for (int j=0; j<=2;j++){
                array[i][j]=i;
            }
        for(int i=1; i<=n; i++){
            value=sc.nextInt();
            for(int j=0; j<=2; j++){
                array[i][0] = Math.min(array[i][0], array[i - 1][j]);
                if((value == 1 || value == 3) && j != 1)
                    array[i][1] = Math.min(array[i][1], array[i - 1][j] - 1);
                if((value == 2 || value == 3) && j != 2)
                    array[i][2] = Math.min(array[i][2], array[i - 1][j] - 1);
            }
        }
        array[n][0] = Math.min(array[n][0], array[n][1]);
        array[n][0] = Math.min(array[n][0], array[n][2]);
        System.out.println(n+array[n][0]);
    }
}
