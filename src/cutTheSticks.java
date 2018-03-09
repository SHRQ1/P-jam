/**
 * Created by shosho on 2/27/2018.
 */
import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class cutTheSticks {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }

        Arrays.sort(arr);
        int min=0;

        for(int i=0;i<arr.length;i++){

            if(arr[i]!=0){
                min=arr[i];
                for(int j=0;j<arr.length;j++)
                    arr[j]=arr[j]-min;

                System.out.println(arr.length-i);}

        }
    }}