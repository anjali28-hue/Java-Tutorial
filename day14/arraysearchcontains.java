package day14;
import java.util.*;
public class arraysearchcontains {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("A", "B", "C", "D"));
        //String n = list.get(0);
        //System.out.println(n);
        //int n2=list.indexOf("A");
        //System.out.println(n2);
        //int n1=list.lastIndexOf("A");
        //System.out.println(n1);
        boolean itasA = list.contains("S");
        System.out.println(itasA);
    }
}