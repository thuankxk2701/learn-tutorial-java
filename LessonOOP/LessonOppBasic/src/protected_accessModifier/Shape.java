package protected_accessModifier;

public class Shape {  // khai báo 1 phương thức protected
    private int sides;

    // tạo hàm tạo mặc định và khởi tạo sides = 3
    public Shape() {
        sides = 3;
    }

    // tạo phương thức hienThi() được khai báo protected
    protected void hienThi() {
        System.out.println("Sides = " + sides);
    }
}
