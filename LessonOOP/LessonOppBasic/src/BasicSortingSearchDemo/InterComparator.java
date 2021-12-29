package BasicSortingSearchDemo;

import java.util.Comparator;
public class InterComparator implements  Comparator<Integer>{
    @Override
    public int compare(Integer t1,Integer t2){
        return t1-t2;
    }

}
