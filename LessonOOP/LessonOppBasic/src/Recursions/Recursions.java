package Recursions;

import java.util.Arrays;
import java.util.OptionalInt;

public class Recursions {
  private static long factorial(long num){
        if(num==1) return 1;
        return num*factorial(num-1);
    }
    private  static  long power(long value,long hat ){
      if(hat==1) return 1;
      return value*power(value,--hat);
    }
    public static void main(String[] args){

        System.out.println(  factorial(5));
        System.out.println(power(2,3));
        int[] obj= new int[]{1, 2,3,4,5};
        OptionalInt currentValue=Arrays.stream(obj).reduce((cur, acc)->cur+acc);
        System.out.println(currentValue.stream().max());


    }
}
