import java.util.HashMap;
import java.util.Scanner;

public class pipeCutting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int t=in.nextInt();
        HashMap<Integer, Integer> m = new HashMap<>();
        int[] c = new int[n];
        int[] v = new int[n];

        for (int i = 0; i < n; i++) {
            c[i]=in.nextInt();
            v[i]=in.nextInt();

        }
        int result =maxV(n-1,t,c,v);
        System.out.println(result);

    }




    static int maxV(int i,int t,int [] c,int []v ){
        if(i<0|| t==0)
            return 0;
        else if (c[i]>t)
            return maxV(i-1,t,c,v);
        else{
            int temp=maxV(i-1,t,c,v);
            int temp2=v[i]+maxV(i,t-c[i],c,v);
            return Math.max(temp,temp2);

        }

    }

}