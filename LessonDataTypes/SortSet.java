import java.util.*;

public class SortSet {
    public static void main(String[] args){
        List<Integer> listInteger = new ArrayList<>();

        // thêm các phần tử vào trong listInteger
        listInteger.add(2);
        listInteger.add(1);
        listInteger.add(4);
        listInteger.add(3);
        listInteger.add(6);
        listInteger.add(5);
        listInteger.add(8);
        listInteger.add(7);
        listInteger.add(0);
        listInteger.add(9);

        SortedSet<Integer> sortedsetInteger = new TreeSet<>(listInteger);

        System.out.println("Các phần tử có trong sortedsetInteger: ");
        System.out.println(sortedsetInteger);
        // SubSet
        SortedSet<Integer> subset = sortedsetInteger.subSet(3, 7);
        System.out.println("Các phần tử có trong subset: ");
        System.out.println(subset);
        //headSet
        SortedSet<Integer> headset = sortedsetInteger.headSet(5);
        System.out.println("Các phần tử có trong headset: ");
        System.out.println(headset);
        //TailSet
        SortedSet<Integer> tailset = sortedsetInteger.tailSet(5);
        System.out.println("Các phần tử có trong tailset: ");
        System.out.println(tailset);
        int phanTuLonNhat = sortedsetInteger.last();
        int phanTuNhoNhat = sortedsetInteger.first();
        System.out.println("Phần tử lớn nhất và nhỏ nhất trong"
                + " sortedsetInteger là " + phanTuLonNhat + " và " + phanTuNhoNhat);
    }
}
