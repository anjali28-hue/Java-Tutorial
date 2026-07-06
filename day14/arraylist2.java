package day14;
import java.util.*;
public class arraylist2 {
    public static void main(String[] args){
        List <String>list=new ArrayList<>();
        list.add("Apple");
        list.add("Orange");
        list.add("Banana");
        list.remove("Apple");
        list.addFirst("Banana");
        System.out.println(list);
    }
}
