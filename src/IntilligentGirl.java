import java.math.BigInteger;
import java.util.Scanner;

public class IntilligentGirl {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        char[] arr = s.toCharArray();
        int [] a= new int[arr.length+1];
        int c=0;
        for(int j=0;j<arr.length;j++) {
            for (int i =j; i < arr.length; i++) {
                if (Character.valueOf(arr[i]) % 2 == 0)
                    c++;
            }
            a[j]=c;
            c=0;

        }
        for(int x:a)
            System.out.print(x+" ");
    }

}
