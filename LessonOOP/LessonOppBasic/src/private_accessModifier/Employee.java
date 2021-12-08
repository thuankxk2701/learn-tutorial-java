package private_accessModifier;

public class Employee {
    private long salary;

    public Employee() {
        salary = 9223344556677889999L;
    }

    private void showSalary() {
        System.out.println("Tiền lương = " + salary);
    }

    public static void main(String[] args) {
        // gọi phương thức showSalary()
        Employee emp = new Employee();
        emp.showSalary();
    }
}
