package RectangleClassTests.rectangleclassrun;
import java.util.Scanner;
import RectangleClassTests.shapes.Rectangle;

public class RectangleClassRun {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Rectangle rect = new Rectangle();
        System.out.print("Enter Rectangle Length : ");
        rect.setLength(input.nextInt());
        System.out.print("Enter Rectangle Width : ");
        rect.setWidth(input.nextInt());
        System.out.printf("Area : %d; Perimeter : %d\n", rect.area(),rect.perimeter());
    }
}
