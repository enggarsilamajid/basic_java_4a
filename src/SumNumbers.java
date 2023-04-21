import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        int sum = 0;
        for (int i = 1; i <= n; i++){
            int newNum = Integer.parseInt(input.nextLine());
            sum = sum+newNum;
        } System.out.println(sum);
    }
}
