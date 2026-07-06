package day14;


import java.util.*;
public class arraymodifycollection_reverse {
        public static void main(String[] args){
            List<String> list=new ArrayList<>(Arrays.asList("A","B","C","D"));
            list.set(2,"cc");
            list.add(3,"C");
            Collections.reverse(list);
            System.out.println(list);
        }

    }
