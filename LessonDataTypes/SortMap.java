import java.util.*;
public class SortMap {
    public static void main(String[] args){
        // khai báo SortedMap Interface tên sortedMapDomain
        // và sử dụng Class là TreeMap để triển khai
        // TreeMap là 1 Class Collection
        SortedMap<String, String> sortedMapDomain = new TreeMap<>();

        // thêm các entry vào trong sortedMapDomain
        sortedMapDomain.put(".com", "International");
        sortedMapDomain.put(".us", "United States");
        sortedMapDomain.put(".uk", "United Kingdom");
        sortedMapDomain.put(".jp", "Japan");
        sortedMapDomain.put(".au", "Australia");
        sortedMapDomain.put(".vn", "Việt Nam");

        System.out.println("Các entry có trong sortedMapDomain là: ");
        sortedMapDomain.forEach((keyChar, valueInt) -> System.out.println(
                "Key = " + keyChar + ", value = " + valueInt));

        System.out.println("Next");
        // khai báo SortedMap Interface tên sortedMapDomain
        // và sử dụng Class là TreeMap để triển khai
        // TreeMap là 1 Class Collection
        SortedMap<Integer, String> sortedMap = new TreeMap<>();

        // thêm các entry vào trong sortedMap
        sortedMap.put(4, "Wednesday");
        sortedMap.put(2, "Monday");
        sortedMap.put(3, "Tuesday");
        sortedMap.put(8, "Sunday");
        sortedMap.put(6, "Friday");
        sortedMap.put(5, "Thursday");
        sortedMap.put(7, "Saturday");

        // khai báo 1 SortedMap có tên là submap
        // có key nằm trong đoạn [3, 7) của sortedMap
        Map<Integer, String> submap = sortedMap.subMap(3, 8);
        System.out.println("Các entry có trong submap là: ");
        submap.forEach((keyChar, valueInt) -> System.out.println(
                "Key = " + keyChar + ", value = " + valueInt));
        System.out.println("Next");
        // khai báo 1 SortedMap có tên là headmap
        // có giá trị của key nhỏ hơn 5 trong sortedMap
        Map<Integer, String> headmap = sortedMap.headMap(5);
        System.out.println("Các entry có trong headmap là: ");
        headmap.forEach((keyChar, valueInt) -> System.out.println(
                "Key = " + keyChar + ", value = " + valueInt));
        System.out.println("Next");
        // khai báo 1 SortedMap có tên là tailmap
        // có giá trị của key lớn hơn hoặc bằng 6 trong sortedMap
        Map<Integer, String> tailmap = sortedMap.tailMap(6);
        System.out.println("Các entry có trong tailmap là: ");
        tailmap.forEach((keyChar, valueInt) -> System.out.println(
                "Key = " + keyChar + ", value = " + valueInt));

        System.out.println("Next");
        SortedMap<Double, Float> sortedMapDoubel = new TreeMap<>();

        // thêm các entry vào trong sortedMap
        sortedMapDoubel .put(0.2d, 0.1f);
        sortedMapDoubel .put(6.06d, 10.22f);
        sortedMapDoubel .put(1.2d, 9.8f);
        sortedMapDoubel .put(1d, 2f);
        // tìm giá trị khóa (key) nhỏ nhất và lớn nhất
        // trong sortedMap
        // vì key trong SortedMap có kiểu dữ liệu là Double
        // nên 2 biến first và last cũng phải có kiểu là Double

        Double first = sortedMapDoubel .firstKey();
        Double last = sortedMapDoubel .lastKey();

        System.out.println("Key có giá trị nhỏ nhất và lớn nhất"
                + " trong sortedMap là " + first + " và " + last);
    }
}
