package day14;
import java.util.*;
public class arraymodifyreplace {
    public static void main(String[] args){
        List<String>list=new ArrayList<>(Arrays.asList("A","B","C","D"));
        list.set(2,"cc");
        list.add(3,"C");
       // System.out.println(list);
        list.replaceAll(s->s.toUpperCase());
        list.replaceAll(s->s.toLowerCase());
        System.out.println(list);
    }
}
