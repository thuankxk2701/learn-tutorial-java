package ExampleEncapsulation;

public class TestPerson {
    public  static  void main(String[] args){
        Person person = new Person();
        person.setCccd("037203002571");
        person.setName("KeyXK");
        System.out.println("Tên: " + person.getName() + ", số cmnd: " + person.getCccd());
    }
}
