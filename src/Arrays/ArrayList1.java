package Arrays;
import java.lang.*;
import java.util.*;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        for(int i=0; i< 5; i++) {
            a.add(i);
        }
        Object[] arr = a.toArray();
        for(Object o: arr) {
            System.out.println(o);
        }
        String str = a.toString();
        System.out.println(str);
        a.add(67);
//        System.out.println(arr);
        System.out.println("---------------------------");
        ArrayList<ArrayList<Integer>> mul = new ArrayList<>();
        mul.add(new ArrayList<>());
        mul.add(new ArrayList<>());
        mul.get(0).add(2);

        mul.get(0).add(4);
        mul.get(1).add(4);
        Vector<Vector<Integer>> vec = new Vector<>();
        System.out.println(vec.size());
         vec.add(new Vector<>());
         vec.get(0).add(1);
        vec.get(0).add(1,4);
        vec.get(0).add(1,5);
         System.out.println(vec);
    }
}