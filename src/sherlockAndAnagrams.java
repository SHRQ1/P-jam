import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class sherlockAndAnagrams {
    static int sherlockAndAnagrams(String s){
        int number=0;
        String sub="";
        String sub2="";
        HashSet<Integer> words=new HashSet<>();
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            for(int h=i;h<=s.length();h++){
                sub=s.substring(i,h);
                arr.add(Value(sub));

                for(int r=0, j=r+sub.length();j<=s.length();r++,j++){
                    if(r!=i&&j!=h){
                        sub2=s.substring(r,j);
                        if(Value(sub)==Value(sub2)){
                            words.add(Value(sub));
                        }}
                }
            }
        }
        return words.size()-1;
    }
    public static int Value(String s){
        int sum=0;
        char [] letter=s.toCharArray();
        for(char x:letter)
            sum+=x;
        return sum;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        int[] result = new int[q];
        for (int a0 = 0; a0 < q; a0++) {
            String s = in.next();
            result[a0] = sherlockAndAnagrams(s);

        }
    }



}
