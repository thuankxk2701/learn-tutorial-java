import java.util.*;
import java.util.stream.Collectors;
public class Seted {
    public static void main(String[] args){

        /*
        // khai báo Set Interface tên hashsetInteger
        // và sử dụng Class là HashSet để triển khai
        // HashSet là 1 Class Collection
        // các phần tử trong hashsetInteger cũng có kiểu là Integer
        Set<Integer> hashsetInteger = new HashSet<>();
        hashsetInteger.add(41);
        hashsetInteger.add(1);
        hashsetInteger.add(0);
        hashsetInteger.add(8);
        hashsetInteger.add(1);
        hashsetInteger.add(2);
        hashsetInteger.add(10);

        // khai báo Set Interface tên treesetInteger
        // và sử dụng Class là TreeSet để triển khai
        // TreeSet là 1 Class Collection
        // các phần tử trong treesetInteger cũng có kiểu là Integer
        Set<Integer> treesetInteger = new TreeSet<>();
        treesetInteger.add(41);
        treesetInteger.add(1);
        treesetInteger.add(0);
        treesetInteger.add(8);
        treesetInteger.add(1);
        treesetInteger.add(2);
        treesetInteger.add(10);

        System.out.println("Các phần tử có trong hashsetInteger: ");
        System.out.println(hashsetInteger);
        System.out.println("Các phần tử có trong treesetInteger: ");
        System.out.println(treesetInteger);


        List<Integer> listInteger = new ArrayList<>();
        Set<Integer> setInteger = new TreeSet<>();

        // thêm các phần tử vào listInteger
        listInteger.add(0);
        listInteger.add(3);
        listInteger.add(1);
        listInteger.add(4);
        listInteger.add(2);
        listInteger.add(8);

        // lọc các phần tử là số chẵn trong listInteger
        // và thêm vào trong setInteger
        setInteger = listInteger.stream().filter(number -> number % 2 == 0)
                .collect(Collectors.toSet());

        // hiển thị các phần tử trong setInteger
        System.out.println("Các phần tử trong setInteger: ");
        for (int numbers : setInteger) {
            System.out.println(numbers);
        }


        Integer[] arraySet1 = {2, 10, 4, 8, 5};

         */
        String tenKhoa;
        Set<String> khoa = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        // thêm phần tử
        khoa.add("Khoa Công nghệ thông tin");
        khoa.add("Khoa Kinh tế");
        khoa.add("Khoa Sư phạm");

        // hiển thị phần tử sử dụng Iterator
        Iterator<String> iterator = khoa.iterator();

        System.out.println("Các phần tử có trong khoa là: ");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // thêm khoa mới
        // nếu tên khoa đó đã tồn tại thì thông báo tên khoa đó đã có
        // còn ngược lại thêm bình thường và thông báo "Thêm thành công!".
        System.out.println("Nhập tên khoa cần thêm: ");
        tenKhoa = scanner.nextLine();
        if (khoa.contains(tenKhoa)) {
            System.out.println("Khoa" + tenKhoa + " đã tồn tại!");
        } else {
            khoa.add(tenKhoa);
            iterator = khoa.iterator();
            System.out.println("Các phần tử có trong khoa sau khi thêm là: ");
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        }

        // xóa khoa
        // nếu khoa cần xóa có tồn tại trong Set thì mới xóa và thông báo "Xóa thành công!"
        // ngược lại thông báo "Xóa không thành công!".
        System.out.println("Nhập tên khoa cần xóa: ");
        tenKhoa = scanner.nextLine();
        if (khoa.contains(tenKhoa)) {
            khoa.remove(tenKhoa);
            System.out.println("Xóa thành công!");
            System.out.println("Các phần tử có trong khoa sau khi xóa là: ");
            iterator = khoa.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        } else {
            System.out.println("Xóa không thành công!");
        }
    }
}