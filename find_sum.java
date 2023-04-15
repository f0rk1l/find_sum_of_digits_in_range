import java.util.Scanner;

public class find_sum {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter start of range: ");
        int start = scanner.nextInt();

        System.out.print("Enter end of range: ");
        int end = scanner.nextInt();

        int sum = 0;

        for (int i = start; i <= end; i++)
        {
            sum += i;
        }

        System.out.println(sum);
    }
}