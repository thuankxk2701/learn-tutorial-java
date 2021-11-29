import java.util.*;
public class OnePlusTowEqualsTwelve {
    public static void main(String[] args){
        // 1 + 2 equals 12? Whaaaaaaaaaaaaat??!?!?!?
        Scanner input= new Scanner(System.in);
        String x="1";
        String y="2";
        System.out.println(x+y);


        String first ="Michael ";
        String last="Fudge";
        System.out.println(first+last);

        // so, how does one to convert string to int?
        int i=Integer.parseInt(x);
        int j=Integer.parseInt(y);
        System.out.println(i+j);
        //  about booleans
            String areYouHappy="true";
            boolean isHappy=Boolean.parseBoolean(areYouHappy);
        System.out.println(isHappy);

        // Or String to double?
        String gpa="3.69";
        Double realgpa=Double.parseDouble(gpa);
        System.out.println(realgpa);

    }
}
