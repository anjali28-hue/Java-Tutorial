package day14;


import java.util.*;
public class arraycollections_sort {
        public static void main(String[] args){
            List<String> list=new ArrayList<>(Arrays.asList("A","B","C","D"));
            list.set(2,"cc");
            list.add(3,"C");
            Collections.sort(list);
            System.out.println(list);
        }
}
