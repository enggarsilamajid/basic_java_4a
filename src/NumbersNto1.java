import java.util.Scanner;

public class NumbersNto1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = Integer.parseInt(input.nextLine());
        for (int i = num; i >= 1; i--) {
            System.out.println(i);
        }
    }
}
