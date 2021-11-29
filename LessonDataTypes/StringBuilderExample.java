public class StringBuilderExample {
    public static void main(String[] args){
        StringBuilder  sb= new StringBuilder();
        // demonstrates StringBuilder class
        sb.append("This is a test");
        System.out.println(sb);
        String forward = sb.toString();
        String reverse = sb.reverse().toString();

        System.out.println(forward);
        System.out.println(reverse);

    }
}
