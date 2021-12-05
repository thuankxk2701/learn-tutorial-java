import java.util.*;
public class LinkedLists {
    public static void main(String[] args){

        // khai báo 1 danh sách liên kết đơn có tên là linkedList
        // có kiểu là Integer
        LinkedList<Integer> linkedList = new LinkedList<>();

        // thêm các phần tử sử dụng phương thức add()
        linkedList.add(1);
        linkedList.add(0);
        linkedList.add(3);
        linkedList.add(9);

        // sử dụng vòng lặp for
        // duyệt theo kích thước của linkedList
        // sử dụng phương thức linkedList.size()
        // và sau đó lấy phần tử tại vị trí thứ i thông qua hàm get()
        // sau đó hiển thị giá trị phần tử đó ra
        System.out.println("Các phần tử có trong linkedList là: ");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.print(linkedList.get(i) + "\t");
        }
        System.out.println("Next");
        System.out.println("Các phần tử có trong linkedList là: ");
        for (int value : linkedList) {
            System.out.print(value + "\t");
        }
        System.out.println("Next");
        // khai báo một Iterator có kiểu là String
        Iterator<Integer> iterator = linkedList.iterator();

        // hiển thị các phần tử có trong linkedList
        // bằng cách sử dụng Iterator
        System.out.println("Các phần tử có trong linkedList là: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + "\t");
        }
        System.out.println("Next use LinkedIterator");
        ListIterator<Integer> listIterator = linkedList.listIterator();
        // hiển thị các phần tử có trong linkedList
        // bằng cách sử dụng ListIterator
        System.out.println("Các phần tử có trong linkedList là: ");
        System.out.println("Duyệt xuôi (từ đầu đến cuối danh sách):");
        while (listIterator.hasNext()) {
            System.out.print(listIterator.next() + "\t");
        }

        System.out.println("\nDuyệt ngược (từ cuối trở về đầu danh sách):");
        while (listIterator.hasPrevious()) {
            System.out.print(listIterator.previous() + "\t");
        }
        /// add(int index); addFirst(index); addLast(); addAll(newLinkedList)
        /// get() getFirst() getLast() ;
        /// set(int index,E value);
        /// remove(placement) removeFirst() removeLast() ; removeAll();
        }
    }

