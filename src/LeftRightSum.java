import java.util.Scanner;

public class LeftRightSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        int leftsum = 0;
        int rightsum = 0;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            leftsum += Integer.parseInt(input.nextLine());
        }
        for (int i =1; i <= n; i++) {
            rightsum += Integer.parseInt(input.nextLine());
        }
        if (leftsum==rightsum) {
            System.out.println("Yes, sum = "+ leftsum);
        } else {
            int diff = Math.abs(rightsum-leftsum);
            System.out.println("No, diff = "+ diff);
        }
    }
}
