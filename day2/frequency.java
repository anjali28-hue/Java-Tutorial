package day2;


    import java.util.Scanner;

    public class frequency {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter number: ");
            int n = sc.nextInt();

            System.out.print("Enter digit to find: ");
            int digit = sc.nextInt();

            int count = 0;

            while (n > 0) {
                if (n % 10 == digit)
                    count++;
                n = n / 10;
            }

            System.out.println("Frequency = " + count);
        }

}
