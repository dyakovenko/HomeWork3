import java.util.Scanner;

/**
 * сколько раз вызываем 4 для фибоначи 15
 */
public class fierstRecursia {
    public static int four=0;

    static int fib(int i) {

        System.out.print("i = "+i+" ");
        if (i == 1) return 1;

        if (i == 2) return 1;
        if (i ==4){
            four++;
        }
        return fib(i - 1) + fib(i - 2);
    }
    public static void main(String[] args) {

        int z = fib(5);
        System.out.println(" число 4 встречаетса  "+four+" раз ");

    }
}








