import java.util.Scanner;



public class Practise {
    //age problem
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String y = in.next();
        String l = in.next();
        int base=largestBase(y,l);
       String m =convert(Integer.parseInt(y),base);
        while(containsChar(m) || m.compareTo(l)<0){
            base--;
            m=convert(Integer.parseInt(y),base);
        }
        System.out.println(base);
    }


public static String convert(int m,int base){
    char digits[] = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
            'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'
            ,'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    String reminder="";
    while (m>0){
        reminder=digits[(m%base)%digits.length]+reminder;
        m=m/base;
    }
    return reminder;
}

    public static int largestBase(String y,String x){
        double m=Double.parseDouble(y)/Double.parseDouble(x.substring(0,1));

        double p= (1.0/(x.length()-1.0));
        int base = (int)(Math.pow(m,p));


        return base ;


    }

    public static boolean containsChar(String y){
       for(int i=0;i<y.length();i++){
           if(!Character.isDigit(y.charAt(i)))
               return true;

       }
       return false;

    }

}