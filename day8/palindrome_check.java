package day8;

public class palindrome_check {
    public static void main(String[] args) {
        String name = "aavvaa";
        System.out.println(Palindrome(name));
    }
        public static boolean Palindrome(String name){
            int start=0;
            int end=name.length()-1;
            while(start<end){
                if(name.charAt(start)!=name.charAt(end)){
                    return false;
                }
                start++;
                end--;
            }
            return true;
        }
}
