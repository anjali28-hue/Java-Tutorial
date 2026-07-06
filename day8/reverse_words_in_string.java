package day8;
import java.util.Scanner;
public class reverse_words_in_string {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        char[] arr=name.toCharArray();
        int start=0,end=arr.length-1;
            while(start<end){
                char temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }
            String name1=new String(arr);
            System.out.println(name1);
        }
}
