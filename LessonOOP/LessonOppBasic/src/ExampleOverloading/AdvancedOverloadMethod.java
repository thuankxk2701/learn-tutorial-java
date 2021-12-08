package ExampleOverloading;

public class AdvancedOverloadMethod {
    // Dấu ... là quy tắc tạo Parameter List
    // ...x lúc này là một mảng một chiều linh động
    // tức là nó tự động co giãn được đối với các đối số truyền vào.
    public int fn4(int... x) {
        int sum = 0;

        // duyệt qua từng phần tử trong mảng một chiều x
        for (int i : x) {
            sum += i;
        }
        return sum;
    }
}
