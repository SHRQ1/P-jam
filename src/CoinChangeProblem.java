import java.util.Arrays;
import java.util.Scanner;

public class CoinChangeProblem {
    static long numbers=0;
    static long getWays(long[] c,int n) {
        long [] ways=new long[n+1];
        ways[0]=1;
        for (int i=0;i<c.length;i++)
            for(long j=c[i];j<=n;j++)
                ways[(int)j]+= (long)ways[(int)(j-c[i])];
        return ways[n];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        long [] c = new long[m];
        for(int c_i=0; c_i < m; c_i++){
            c[c_i] = in.nextInt();
        }
        Arrays.sort(c);
        long ways = getWays(c,n);
        System.out.println(ways);
    }
}


