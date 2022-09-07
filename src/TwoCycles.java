import java.util.Scanner;

import static java.lang.Math.sqrt;

public class TwoCycles {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        int a1 = scan.nextInt();
        int b1 = scan.nextInt();
        int c1 = scan.nextInt();

        double r = sqrt((a1 - a)*(a1 - a) + (b1 - b) * (b1 - b));

        if (c + c1 >= r && r + c1 >= c && r + c >= c1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
