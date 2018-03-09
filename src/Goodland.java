import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Goodland {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int i=0;
        int j=0;
        int loc=0;
        int trans=0;
        int flag=0;

        while(i<n) {
            trans++;
            j = i + k - 1;
            if (j > n)
                j = n - 1;
            while (loc <= j && arr[j] == 0)
                j -= 1;
            if (j <loc){
                System.out.println("-1");
                break;}
            else{
                loc = j + 1;
                j += k;
                i = j;
            }
        }
        System.out.println(trans);

    }
}

