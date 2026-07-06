package day2;

    import java.util.Scanner;

    public class countodd{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter a number: ");
            int n = sc.nextInt();

            int even = 0, odd = 0;

            while (n > 0) {
                int d = n % 10;
                if (d % 2 == 0)
                    even++;
                else
                    odd++;
                n = n / 10;
            }

            System.out.println("Even digits = " + even);
            System.out.println("Odd digits = " + odd);
        }
}
