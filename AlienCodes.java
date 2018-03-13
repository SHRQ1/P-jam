import java.util.HashSet;
import java.util.Scanner;

public class AlienCodes {
    public static void main(String args[]) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        permutation("","01",n);
        System.out.println(list.size());
    }


    public static void permutation(String perm, String word,int n) {
        if(perm.contains("11")|| perm.contains("000"))
            return;

        if (perm.length()==n) {
            list.add(perm);
            return;
        }

        else {
            for (int i = 0; i <word.length() ;i++){
                permutation(perm + word.charAt(i),"01",n);
            }
        }
    }
   static HashSet<String> list=new HashSet<String>();
}