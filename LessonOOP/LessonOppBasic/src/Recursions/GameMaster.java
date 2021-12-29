package Recursions;
import java.util.*;
public class GameMaster {
    public static void main(String[] args){
   Scanner sc= new Scanner(System.in);
   int numberTest=sc.nextInt();
   while(numberTest>0){
       --numberTest;
       int n= sc.nextInt();
     int a[]= new int[n+5];
     int b[]= new int[n+5];
     int max1 = 0,max2=0;
     for(int i=0; i<n; i++){
         a[i]=sc.nextInt();
         max1=Math.max(max1,a[i]);
     }
     for(int i=0; i<n; i++){
           b[i]=sc.nextInt();
         max2=Math.max(max2,b[i]);
       }
     int bonus=1;
     String result="";
     for(int i=0; i<n; i++){
         if(b[i]>a[i] || b[i]<a[i]){
             result+="1";
             continue;
         }
         if(b[i]==a[i]&&bonus==1){
             result+="1";
             --bonus;
         }else{
             result+="0";
         }
     }
       System.out.println(result);

   }
    }
}
