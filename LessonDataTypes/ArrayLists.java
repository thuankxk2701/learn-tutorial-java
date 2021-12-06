import java.util.*;
public class ArrayLists {
    public static void main(String[] args){
        ArrayList<String> arrListString = new ArrayList<>();
        ArrayList<Double> arrListDouble = new ArrayList<>(10);

        arrListDouble.add(8.329d);
        arrListDouble.add(1.02d);
        arrListDouble.add(2.9d);
        arrListDouble.add(20.17d);

        System.out.println("Các phần tử có trong arrListDouble là: ");
        System.out.println(arrListDouble);


        // thêm các phần tử sử dụng phương thức add()
        arrListString.add("JAVA");
        arrListString.add("PHP");
        arrListString.add("C#");
        arrListString.add("C++");

        // duyệt theo kích thước của arrListString
        // sử dụng vòng lặp for thông thường
        // phương thức arrListString.size() sẽ trả về số phần tử của arrListString
        // và sau đó lấy phần tử tại vị trí thứ i thông qua hàm get()
        // sau đó hiển thị giá trị phần tử đó ra
        System.out.println("Các phần tử có trong arrListString là: ");
        for (int i = 0; i < arrListString.size(); i++) {
            System.out.print(arrListString.get(i) + "\t");
        }
        ArrayList<Integer> arrListInteger = new ArrayList<>();

        // thêm các phần tử sử dụng phương thức add()
        arrListInteger.add(0);
        arrListInteger.add(7);
        arrListInteger.add(1);
        arrListInteger.add(9);

        // duyệt theo kích thước của arrListInteger
        // sử dụng vòng lặp for duyệt theo đối tượng
        // trong đó kiểu dữ liệu của biến number
        // phải trùng với kiểu dữ liệu của arrListInteger
        System.out.println("Các phần tử có trong arrListInteger là: ");
        for (int number : arrListInteger) {
            System.out.print(number + "\t");
        }
        ArrayList<Float> arrListFloat = new ArrayList<>();

        // thêm các phần tử sử dụng phương thức add()
        // chữ f cho biết các số thêm vào là số thực
        // nếu không có chữ này thì trình biên dịch sẽ hiểu đây là số double
        // và sẽ báo lỗi dữ liệu
        arrListFloat.add(0.7f);
        arrListFloat.add(7.26f);
        arrListFloat.add(1.02f);
        arrListFloat.add(9.3f);

        // khai báo một Iterator có kiểu là Float
        Iterator<Float> iterator = arrListFloat.iterator();

        System.out.println("Các phần tử có trong arrListFloat là: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + "\t");
        }
        // khai báo 1 ArrayList có tên là arrListChar
        // có kiểu là Character
        ArrayList<Character> arrListChar = new ArrayList<>();

        arrListChar.add('a');
        arrListChar.add('e');
        arrListChar.add('b');
        arrListChar.add('c');

        // khai báo một ListIterator có kiểu là Character
        ListIterator<Character> listIterator = arrListChar.listIterator();

        // hiển thị các phần tử có trong linkedList
        // bằng cách sử dụng ListIterator
        System.out.println("Các phần tử có trong arrListChar là: ");
        while (listIterator.hasNext()) {
            System.out.print(listIterator.next() + "\t");
        }


        // tạo bản sao của arrListString
        // sử dụng phương thức clone()
        ArrayList<String> arrListStringCopy = (ArrayList<String>) arrListString.clone();

        System.out.println("Các phần tử của arrListString ban đầu: ");
        System.out.println(arrListString);

        // chuyển đổi arrListInteger sang mảng
        // sử dụng phương thức toArray()
        // kết quả của phương thức này sẽ trả về mảng arr
        // có kiểu là Object (chi tiết về Object chúng ta sẽ gặp trong các bài sau)
        Object[] arr = arrListInteger.toArray();

        // sử dụng vòng lặp for để hiển thị các phần tử có trong mảng arr
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Phần tử tại vị trí " + i + " trong arr là " + arr[i]);
        }
    }
}
