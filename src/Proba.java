import java.util.Scanner;
public class Proba {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int z = sc.nextInt();
        for (int i = 2;i<z;i++){
            boolean c = true;
            for (int n = 2;n<i;n++){
                if ((i%n)==0)c=false;
            }if (c==true) System.out.println(i);
        }
        }
    }





