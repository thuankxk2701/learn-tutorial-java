package ExampleOverloading;

public class TestAdvancedOverloadingMethod {
    public static void main(String[] args) {
        AdvancedOverloadMethod demo = new AdvancedOverloadMethod();
        System.out.println(demo.fn4(1,2,4,5));
        System.out.println(demo.fn4(1, 2, 3, 4));
    }
}
