import java.awt.*;
import java.awt.geom.Point2D;
import java.util.Scanner;

public class HasanAndTrip {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int f = 0;
        float totalD = 0;
        int[][] ponts = new int[n][2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++)
                ponts[i][j] = in.nextInt();
            f += in.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < 2; j++) {
                totalD = (float) Point.Float.distance(ponts[i][0], ponts[i][1], ponts[i + 1][0], ponts[i + 1][1]);
            }
            System.out.println(f- totalD );
        }
    }
}
