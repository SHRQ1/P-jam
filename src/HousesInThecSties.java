import java.util.Scanner;

public class HousesInThecSties {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int[] result = new int[1];
        for (int i = 0; i < t; i++) {

            int n = in.nextInt();
            int arr[] = new int[n];
            for (int j = 0; j < n; j++)
                arr[j] = in.nextInt();


            int q = in.nextInt();
            result = new int[q];
            for (int j = 0; j < q; j++) {
                int l = in.nextInt();
                int r = in.nextInt();

                result[j] = numbers(arr, l-1 , r-1 );
            }


        }
        for (int i = 0; i < result.length; i++)
            System.out.println(result[i]);
    }

    public static int numbers(int[] arr, int l, int r) {
        int sum = arr[l];
        for (int i = l+1; i <= r; i++)
            sum += arr[i];

        return sum;
    }
}
