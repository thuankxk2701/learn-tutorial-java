package Task;
import java.util.Scanner;
public class WayTooLongWords {
    public static void main(String[] args){
   Scanner sc= new Scanner(System.in);
     int n= sc.nextInt();

     String[] arrStr=new String[n];
     for(int i=0; i<n; i++)
     {
         arrStr[i]=sc.next();
     }
     for (int i=0; i<n; i++){
         if(arrStr[i].length()>10) {
             int tempt = arrStr[i].length()-2;
             char head = arrStr[i].charAt(0);
             char tail = arrStr[i].charAt(arrStr[i].length()-1);
             String result = "";
             result = result +
                     head +
                     tempt +
                     tail;
             arrStr[i] = result;
         }
     }
        for(int i=0; i<n; i++)
        {
            System.out.println(arrStr[i]);
        }

    }
}
