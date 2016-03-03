import java.util.Scanner;

/**
 * сумма чисел до N.
 */
public class SummN {

    public static int tryyy(int i){
        int sum;
        if (i==1)return 1;
        else   sum=(tryyy(i-1)+(i));
        return  sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int z = sc.nextInt();

        System.out.println("result: " + tryyy(z));
    }
}


