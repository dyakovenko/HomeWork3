import java.util.Scanner;

/**
 * фибоначи
 */
public class fibonachi {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
    int num = s.nextInt();
        if (num==1) System.out.println("1");
        else if(num==2) System.out.println("1"+" "+"1");

        else {
            int a = 1;
            int b = 1;
            int fib = 0;
            num= num-2;
            for (int i = 0; i < num; i++) {
                fib = a + b;
                a = b;
                b = fib;

                if(i ==0)
                System.out.print("1"+" "+"1"+" "+fib + " ");
                else System.out.print(fib + " ");
            }
        }

    }
}