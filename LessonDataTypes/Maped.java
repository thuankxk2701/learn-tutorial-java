import java.util.*;
import java.util.LinkedHashMap;
public class Maped {
    public static void main(String[] args){
        // khai báo Map Interface tên hashMap
        // và sử dụng Class là HashMap để triển khai
        // HashMap là 1 Class Collection
        // mỗi phần tử trong hashMap bao gồm 2 phần
        // key (Integer) và value (String)
        Map<Integer, String> hashMap = new HashMap<>();

        // Thêm value vào trong hashMap với key tương ứng
        // sử dụng phương thức put()
        // đối số thứ nhất trong put là key có kiểu là Integer
        // và đối số thứ hai là value có kiểu là String
        hashMap.put(1, "One");
        hashMap.put(0, "Zero");
        hashMap.put(2, "Two");
        hashMap.put(4, "Four");
        hashMap.put(21, "Twenty first");
        hashMap.put(5, "Five");

        // khai báo Map Interface tên linkedHashMap
        // và sử dụng Class là LinkedHashMap để triển khai
        // LinkedHashMap là 1 Class Collection
        // mỗi phần tử trong linkedHashMap bao gồm 2 phần
        // key (Integer) và value (String)
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();

        // Thêm value vào trong linkedHashMap với key tương ứng
        linkedHashMap.put(1, "One");
        linkedHashMap.put(0, "Zero");
        linkedHashMap.put(2, "Two");
        linkedHashMap.put(4, "Four");
        linkedHashMap.put(5, "Five");
        linkedHashMap.put(21, "Twenty first");

        // khai báo Map Interface tên treeMap
        // và sử dụng Class là TreeMap để triển khai
        // TreeMap là 1 Class Collection
        // mỗi phần tử trong treeMap bao gồm 2 phần
        // key (Integer) và value (String)
        Map<Integer, String> treeMap = new TreeMap<>();

        // Thêm value vào trong treeMap với key tương ứng
        treeMap.put(1, "One");
        treeMap.put(0, "Zero");
        treeMap.put(2, "Two");
        treeMap.put(4, "Four");
        treeMap.put(21, "Twenty first");
        treeMap.put(5, "Five");

        System.out.println("Các phần tử có trong hashMap: ");
        System.out.println(hashMap);
        System.out.println("Các phần tử có trong linkedHashMap: ");
        System.out.println(linkedHashMap);
        System.out.println("Các phần tử có trong treeMap: ");
        System.out.println(treeMap);

        ///Entry
        Map<String, String> mapLanguages = new TreeMap<>();
        mapLanguages.put("CSLT", "Cơ sở lập trình");
        mapLanguages.put("C++", "C++");
        mapLanguages.put("C#", "C Sharp");
        mapLanguages.put("PHP", "PHP");
        mapLanguages.put("Java", "Java");

        // tạo 1 Set có tên là setLanguages
        // chứa toàn bộ các entry (vừa key vừa value)
        // của mapLanguages
        Set<Map.Entry<String, String>> setLanguages = mapLanguages.entrySet();

        System.out.println("Các entry có trong setLanguages:");
        System.out.println(setLanguages);

        //ForEach
        Map<Character, Integer> mapChar = new TreeMap<>();
        mapChar.put('A', 1);
        mapChar.put('B', 2);
        mapChar.put('C', 3);
        mapChar.put('D', 4);
        mapChar.put('E', 5);
        mapChar.put('F', 6);

        // Cách duyệt Map với forEach() trong Java 8
        // đối số thứ nhất bên trong forEach là key
        // đối số thứ hai bên trong forEach là value
        mapChar.forEach((keyChar, valueInt) -> System.out.println(
                "Key = " + keyChar + ", value = " + valueInt));
       /// get Key in the Map
        Map<String, String> mapLanguage= new LinkedHashMap<>();
        mapLanguage.put("CSLT", "Cơ sở lập trình");
        mapLanguage.put("C++", "C++");
        mapLanguage.put("C#", "C Sharp");
        mapLanguage.put("PHP", "PHP");
        mapLanguage.put("Java", "Java");
        for (String key : mapLanguage.keySet()) {
            System.out.println("Key = " + key);
        }

        /// Use Iterator in the Map get key and values
        Iterator<Map.Entry<String, String>> iteratorAll = mapLanguage.entrySet().iterator();

        System.out.println("Các entry có trong mapLanguage là: ");
        while (iteratorAll.hasNext()) {
            System.out.println(iteratorAll.next());
        }

        /// use iterator get key in the map
        Iterator<String> iteratorKey = mapLanguage.keySet().iterator();

        System.out.println("Key có trong mapLanguage là: ");
        while (iteratorKey.hasNext()) {
            System.out.println(iteratorKey.next());
        }
     /// Use iterator  get values in the Map
        Iterator<String> iteratorValue = mapLanguage.values().iterator();

        System.out.println("Value có trong mapLanguage là: ");
        while (iteratorValue.hasNext()) {
            System.out.println(iteratorValue.next());
        }

    /// Get value equals  Keywords -> convert entry
        Map<String, String> mapCity = new TreeMap<>();
        mapCity.put("QNg", "Quảng Ngãi");
        mapCity.put("QN", "Quảng Nam");
        // trong trường hợp này ta thấy
        // key của Quảng Nam và Quảng Ninh
        // đều là QN nên chương trình sẽ thêm
        // vào trong Map value đứng sau (tức là Quảng Ninh)
        mapCity.put("QN", "Quảng Ninh");
        mapCity.put("HCM", "Thành phố Hồ Chí Minh");

        System.out.println("Danh sách các thành phố trong mapCity: ");
        Set<Map.Entry<String, String>> setCity = mapCity.entrySet();
        System.out.println(setCity);

        // lấy thành phố có mã là HCM
        // và hiển thị tên thành phố
        System.out.println("HCM: " + mapCity.get("HCM"));

        // lấy thành phố có mã là HN
        // vì trong mapCity không có thành phố nào có mã là HN
        // nên sẽ hiển thị giá trị null
        System.out.println("HN: " + mapCity.get("HN"));

        // Để kiểm tra xem 1 value có trong Map hay không
        // chúng ta sẽ dùng phương thức containsValue()
        if (mapCity.containsValue("Thành phố Hồ Chí Minh")) {
            System.out.println("Có Thành phố Hồ Chí Minh trong mapCity");
        }

        // Remove entry in the map -> convert entry


        // xóa entry có khóa là QN ra khỏi mapCity
        // sử dụng phương thức remove()
        mapCity.remove("QN");

        /// Replace in the map -> convert entry

        mapCity.replace("QN", "Quảng Ninh");

        // ngoài ra chúng ta có thế thay thế như sau
        // câu lệnh bên dưới sẽ thay thế entry
        // có key là BD, value là Bình Định thành Bình Dương

        mapCity.replace("BD", "Bình Định", "Bình Dương");
        System.out.println("Danh sách các thành phố trong mapCity sau khi thay thế: ");
        System.out.println(setCity);

        /// Convert String to Character
        Map<Integer, Character> mapString = new TreeMap<>();
        Scanner scanner = new Scanner(System.in);
        String str;
        Set<Character> setChar;   // lưu trữ các ký tự có trong chuỗi str

        System.out.println("Nhập vào chuỗi bất kỳ:");
        str = scanner.nextLine();

        // chuyển đổi chuỗi str thành 1 mảng các ký tự
        char[] charStr = str.toCharArray();

        setChar = new TreeSet<Character>();
        for (char ch : charStr) {
            // thêm các ký tự có trong mảng charStr
            // vào trong setChar
            // lúc này những ký tự nào giống nhau
            // thì chỉ được thêm vào 1 lần
            setChar.add(ch);
        }

        // Hiển thị các ký tự duy nhất trong chuỗi
        // và độ dài của chuỗi đó
        System.out.println("Độ dài của chuỗi và các ký tự có trong chuỗi là: ");
        for (Character ch : setChar) {
            mapString.put(str.length(), ch);
            System.out.print(mapString.keySet() + "=>" + mapString.values() + "\n");
        }

    }


}
