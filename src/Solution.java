import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.*;
public class Solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            t--;
            int a = sc.nextInt();
            int b = sc.nextInt();
            int d;

            if (a == b) {
                System.out.println("Yes");

            }
            if (a > b) {
                d = (a - b) / 2;
                if ((a - b) == (b + d)) {

                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            }
            if (a < b) {
                d = (b - a) / 2;
                if ((b - d) == (a + d)) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }

            }
        }
    }
}



