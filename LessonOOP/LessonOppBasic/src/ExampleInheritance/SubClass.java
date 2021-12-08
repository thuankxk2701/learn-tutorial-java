package ExampleInheritance;

public class SubClass extends SuperClass {
    /*int number=20;
    public void showing(){
        System.out.println("Showing to showing() own children !");
    }
    public void subClassMethod(){
        SubClass subClass= new SubClass();
        // khai bao

        // gọi phương thức hienThi() của lớp cha
        // sử dụng từ khóa super()
        super.showing();

        subClass.showing();
        // gọi phương thức hienThi() của lớp con
        // hiển thị giá trị biến number của lớp cha

        System.out.println("Giá trị biến number của lớp cha = " + super.number);

        // hiển thị giá trị biến number của lớp con
        System.out.println("Giá trị biến number của lớp con = " + subClass.number);

    }

     */
    int number;
    public SubClass(int number){
        super(number);
        this.number=number;

        System.out.println("Đây là hàm tạo của lớp Subclass, giá trị biến number = " + number);

    }
    public static void main(String[] args){
   /*     SubClass objSubClass= new SubClass();
        objSubClass.subClassMethod();

    */
        SubClass subclass = new SubClass(10);
        System.out.println(subclass.number);
    }


}
