package Day4;

public class zigzag_number_pattern {
    public static void main(String[]args){
        int n=5;
        int num=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(i==j||i+j==num+1) {
                    System.out.print(num + " ");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
