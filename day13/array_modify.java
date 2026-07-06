package day13;

    import java.util.*;
    public class array_modify {
        public static void main(String[] args) {
            List<String> list = new ArrayList<>(Arrays.asList("A", "B", "C", "D"));
            list.set(2, "cc");
            list.add(3, "C");
            System.out.println(list);
        }

}
