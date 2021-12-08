package ExampleOverloading;

public class TestOverloading {
    public static void main(String[] args) {
         plusTowNumber test = new plusTowNumber();
        System.out.println("Tổng = " + test.add(11, 12));
        System.out.println("Tổng = " + test.add(11, 12, 13));
    }
}
