import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        int even = 0;
        int odd = 0;
        for (int i = 1; i<=n; i++) {
            int element = Integer.parseInt(input.nextLine());
            if (i%2==0) {
                even += element;
            } else {
                odd += element;
            }
        }
        if (even==odd) {
            System.out.println("Yes");
            System.out.println("Sum = "+ even);
        } else {
            int diff = Math.abs(even-odd);
            System.out.println("No");
            System.out.println("Diff = "+ diff);
        }
    }
}
