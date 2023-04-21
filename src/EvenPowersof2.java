import java.util.Scanner;

public class EvenPowersof2 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int n = Integer.parseInt(input.nextLine());
        for (int i = 0; i <= n; i += 2) {
            double o = Math.pow(2, i);
            System.out.printf("%.0f%n", o);
        }
    }
}
