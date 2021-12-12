package factorial;

public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        int result = factorial(n);
        System.out.printf("%d factorial is %d\n", n,result);
    }
    public static int factorial(int n){
        //recursion
        int temp=0;
        temp=n<=0?1:n*factorial(--n);
        return temp;
    }
}
