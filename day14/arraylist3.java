package day14;

import java.util.*;
public class arraylist3 {
    public static void main(String[] args){
        List <String>list=new ArrayList<>();
        list.add("Dog");
        list.add("Cat");
        list.add("Goat");
        list.remove("Dog");
        list.addFirst("Goat");
        list.remove("cat");
        list.addFirst("Cow");
        List<String>name=Arrays.asList("abc","def");
        list.addAll(2,name);
        System.out.println(list);
    }
}
