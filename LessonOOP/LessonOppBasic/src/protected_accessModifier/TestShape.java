package protected_accessModifier;

public class TestShape {
    public static void main(String[] args) {
        // khởi tạo 1 đối tượng Shape
        Shape shape = new Shape();

        // gọi phương thức hienThi() của lớp Shape
        // vì hienThi() được khai báo protected
        // nên lớp nằm trong cùng package với lớp Shape có thể sử dụng được
        shape.hienThi();
    }
}
