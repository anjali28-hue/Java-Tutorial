package day8;

public class count_vowels_and_consonants {
    public static void main(String[] args){
        String name="helloOLO";
        String lower=name.toLowerCase();
        int vowels=0;
        int consonants=0;
        for(char ch:lower.toCharArray()){
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                vowels++;
            }
            else{
                consonants++;
            }
        }
        System.out.println("count of vowels"+vowels);
        System.out.println("count of consonants"+consonants);
    }
}
