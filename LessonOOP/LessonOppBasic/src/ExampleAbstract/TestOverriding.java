package ExampleAbstract;

public class TestOverriding {
    public static void main(String[] args){
        SuperClass superClass=new SuperClass();
        // khai báo đối tượng có bản chất là Superclass
        // nhưng đóng vai trò là 1 Subclass
        // vì vậy sẽ chạy những hàm của Subclass
        //SubClass subClass = new SubClass();
          SuperClass subClass = new SubClass();

        // gọi phương thức hienThi() của lớp cha
        superClass.showing();

        // gọi phương thức hienThi() của lớp con
        subClass.showing();

    }
}
