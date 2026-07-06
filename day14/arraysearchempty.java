package day14;
import java.util.*;
public class arraysearchempty {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>(Arrays.asList("A", "B", "C", "D"));
        boolean empty=list.isEmpty();
        System.out.println(empty);
        int size=list.size();
        System.out.println(size);
    }
}
