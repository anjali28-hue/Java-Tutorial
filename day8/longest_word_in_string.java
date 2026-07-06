package day8;
import java.util.Scanner;
public class longest_word_in_string {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(longest(str));
    }
    public static String longest(String str){
        String longest="";
        String[] str1=str.split(" ");
        for(String word:str1){
            if(word.length()>longest.length()){
                longest=word;
            }
        }
        return longest;
    }
}