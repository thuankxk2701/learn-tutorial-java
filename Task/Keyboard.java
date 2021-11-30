package Task;
import java.util.Scanner;

public class Keyboard {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String n=sc.next();
        String str=sc.next();
        String result="";
        String row1="qwertyuiop";
        String row2="asdfghjkl;";
        String row3="zxcvbnm,./";
        for(int i=0; i<str.length(); i++){
            int temp1=row1.indexOf(str.charAt(i));
            int temp2=row2.indexOf(str.charAt(i));
            int temp3=row3.indexOf(str.charAt(i));

            if(n.charAt(n.length()-1) == 'R'){
            if(temp1!=-1){
                result+=row1.charAt(temp1-1)  ;
            }
            if(temp2!=-1){
                    result+=row2.charAt(temp2-1)  ;
                }
            if(temp3!=-1){
                    result+=row3.charAt(temp3-1)  ;
                }

            } else{
                if(temp1!=-1){
                    result+=row1.charAt(temp1+1)  ;
                }
                if(temp2!=-1){
                    result+=row2.charAt(temp2+1)  ;
                }
                if(temp3!=-1){
                    result+=row3.charAt(temp3+1)  ;
                }


            }
        }
        System.out.println(result);
    }
}
