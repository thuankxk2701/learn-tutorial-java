package ExampleInheritance;

public class MyCalculation extends Calculate {
     public void multiplication(int a,int b)
     {
         c=a*b;
         System.out.println("Multiplication two number : "+c);
     }
     public void divistion(int a,int b)
    {
        c= (int) Math.pow(a,b);
        System.out.println("Divistion two number : "+c);
    }
    public static void main(String[] args){
         int a=14,b=2;
         MyCalculation myCalculation= new MyCalculation();
         myCalculation.plusNumber(a,b);
         myCalculation.minusNumber(a,b);
         myCalculation.multiplication(a,b);
         myCalculation.divistion(a,b);

    }

}
