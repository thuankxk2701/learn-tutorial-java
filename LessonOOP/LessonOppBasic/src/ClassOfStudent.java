
import java.util.Scanner;
public class ClassOfStudent {
    private String name;
    private int numberOfPupils;

    public void inputYourClass() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên lớp: ");
        name = scanner.nextLine();
        System.out.println("Nhập số sinh viên của lớp: ");
        numberOfPupils = scanner.nextInt();
    }

    public void showInformation() {
        System.out.println("Tên lớp là " + name + ", số sinh viên =  " + numberOfPupils + ".");
    }
}
