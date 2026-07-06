package day13;

import java.util.*;

public class array_list2 {
    public static void main(String[]args){
        List<String> list=new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.remove(0);
        list.remove("B");
        List<String>name=Arrays.asList("A","B");
        list.removeAll(name);
        System.out.println(list);
    }
}