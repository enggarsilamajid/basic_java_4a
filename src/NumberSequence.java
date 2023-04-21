import java.util.Scanner;

public class NumberSequence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        int smallest = Integer.MAX_VALUE;
        int biggest = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int newNum = Integer.parseInt(input.nextLine());
            if (newNum < smallest) {
                smallest = newNum;
            }
            if (newNum > biggest) {
                biggest = newNum;
            }
        }
        System.out.printf("Max number: %d%n", biggest);
        System.out.printf("Min number: %d", smallest);
    }
}
