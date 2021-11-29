import java.util.Random;

public class RandomExample {
    public static void main(String[] args){
        // Demonstrates use of an existing class
        Random generator=new Random();  // 0 is the "seed" the same seed will

        int i=generator.nextInt(10);
        System.out.println(i);
    }
}
