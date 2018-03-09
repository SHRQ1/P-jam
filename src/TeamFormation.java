import java.lang.reflect.Array;
import java.util.*;

public class TeamFormation {

    public static int resultElemnts(int[] numbers) {
        if(numbers.length==1)
            return 1;
        else if(numbers.length==0){
            return 0;
        }
        Arrays.sort(numbers);
        int temp = 0;
        int m = 0;
        ArrayList<Integer> size = new ArrayList<>();

        for (int i = 1; i < numbers.length; i++) {
            temp = numbers[i - 1];
            if (numbers[i] == temp + 1) {
                m++;
            } else {
                size.add(m);
                m = 1;
            }

        }
        size.add(m);
        return Collections.min(size);


    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int temp = 0;
        int[] result = new int[t];
        int m = 1;

        for (int a0 = 0; a0 < t; a0++) {
            int n = in.nextInt();

            int[] numbers = new int[n];
            for (int i = 0; i < numbers.length; i++)
                numbers[i] = in.nextInt();


            result[a0] = (int) resultElemnts(numbers);


        }

        for (int x : result)
            System.out.println(x);
    }
}

