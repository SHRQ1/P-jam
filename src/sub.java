
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class sub {


    public static void main (String[]args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int q = in.nextInt();
        String s = in.next();
        int left=0;
        int right=0;
        for (int a0 = 0; a0 < q; a0++) {
            left = in.nextInt();
            right = in.nextInt();
        }
        int [] arr=new int[q];
        String m=s.substring(left, right);
        String f=" ";
        HashSet<String> list=new HashSet<>();
        for(int i=0;i<m.length();i++){
            for(int j=i;j<m.length();j++){
                f=m.substring(j, j+1);
                list.add(m);
            }
            arr[i]=list.size();
            list.clear();
        }
        for(int x:arr)
            System.out.println(arr[x]);


    }
}



