import java.util.Scanner;

/**
 * Created by Den Yakovenko on 18.01.2016.
 */
public class sum {

    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        int z = scaner.nextInt();


        int c = 0;
        for (int i = 10; i <= z; z /= 10) {
            c = c + (z % i);
        }
        c=c+z;

        System.out.println( c );
    }









    }





