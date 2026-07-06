package day2;

    import java.util.Scanner;

    public class countzero {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter a number: ");
            int n = sc.nextInt();

            int count = 0;

            while (n > 0) {
                if (n % 10 == 0)
                    count++;
                n = n / 10;
            }

            System.out.println("Number of zeros = " + count);
        }

}
