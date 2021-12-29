package BasicSortingSearchDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class BasicSortingSearchingDemo {
    public static void main(String[] args){
        Random generator= new Random(3);
        int found=-1;
        ArrayList<Integer> numbers=new ArrayList<>();
        for(int i=0;i<20; i++){
            numbers.add(generator.nextInt(100)+1);

        }
        System.out.println("UNSORTERD");
        printNumbers(numbers);
        found = find(numbers,50);
        System.out.printf("The number %d was %s found\n", 50, found<0 ? "not" : "");
        Collections.sort(numbers, new InterComparator());
        System.out.println("SORTED");
        printNumbers(numbers);
        //int found =find(numbers, 50);
        found = Collections.binarySearch(numbers,50, new InterComparator());


        System.out.printf("The number %d was %s found\n", 50, found<0 ? "not" : "");

    }
    public static void printNumbers(ArrayList<Integer> nums){
        for(int i=0 ; i<nums.size();i++){
            System.out.printf("%d ",nums.get(i));
        }
        System.out.println();
    }
    public static int find(ArrayList<Integer> a,Integer target){

        for(int i=0; i<a.size(); i++){
            if(a.get(i)==target){
                return  i;
            }
        }
        return -1;
    }
    public static ArrayList<Integer> sort(ArrayList<Integer> a){
        boolean swapped=false;
        int tmp=0;
        for(int i=0;i<a.size();i++) {
            swapped = false;
            for(int j=a.size()-1;j>i;j--) {
                if (a.get(j)< a.get(j-1)) {
                    tmp = a.get(j);
                    a.set(j, a.get(j-1));
                    a.set(j-1, tmp);
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
        return a;
    }
}
