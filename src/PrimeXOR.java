import java.util.*;

public class PrimeXOR {

    static long primeXor1(int[] a) {
        HashSet<Integer> m=findP(a);
        Stack <Integer> s= new Stack<>();
        Integer t=0;
        long n=(long)Math.pow(10,9)+7;
        for(int i=1;i<m.size();i++) {
            t = s.pop();
            s.push(t);

        }
        if(isPrimeNumber(t))
            m.add(t);

        return (m.size()%n);

    }


    static HashSet<Integer> findP(int [] arr) {
        HashSet<Integer> m=new HashSet<>();
        for(int i=0;i<arr.length;i++) {
            if(isPrimeNumber(arr[i]))
                m.add(arr[i]);
        }
        return m;
    }
    public static boolean isPrimeNumber(int i) {
        int factors = 0;
        int j = 1;

        while(j <= i)
        {
            if(i % j == 0)
            {
                factors++;
            }
            j++;
        }
        return (factors == 2);
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int n = in.nextInt();
            int[] a = new int[n];
            for(int a_i = 0; a_i < n; a_i++){
                a[a_i] = in.nextInt();
            }
            long result = primeXor1(a);

            System.out.println(result);
        }
        in.close();
    }
}


