package day14;
import java.util.*;

public class arrayretain {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.remove(0);
        //list.remove("B");
        //List<String> name = Arrays.asList("A", "B");
       // list.removeAll(name);
        List<String> name2 = Arrays.asList("A", "B");
        list.retainAll(name2);
        System.out.println(list);
    }
}