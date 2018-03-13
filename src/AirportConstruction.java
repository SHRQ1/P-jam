import java.awt.*;
import java.util.Scanner;

public class AirportConstruction {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        float[][] ponits = new float[n][2];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < 2; j++)
                ponits[i][j] = in.nextInt();
        float max = 0;
        float temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++){
                temp = (float) Point.distance(ponits[i][0], ponits[i][1], ponits[j][0], ponits[j][1]);
            if (max < temp)
                max = temp;}
        }
        System.out.printf("%.9f", max);
        }
}