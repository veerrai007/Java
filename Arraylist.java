import java.util.ArrayList;
import java.util.Collections;

public class Arraylist{
    public static void main(String[] args) {
        
        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(21);
        list1.add(42);
        list1.add(74);
        System.out.println(list1);

        int element = list1.get(1);
        System.out.println(element);

        list1.add(2,44);
        System.out.println(list1);

        list1.set(1, 99);
        System.out.println(list1);

        list1.remove(0);
        System.out.println(list1);

        int size  = list1.size();
        System.out.println(size);

        Collections.sort(list1);
        System.out.println(list1);
    }    
}