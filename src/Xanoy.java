/**
 * Created by Admin on 23.01.2016.
 */
public class Xanoy {

public static long xod=0;

        static void rekurs(int n, int x, int z) {
            if (n + 1 > 1) {
                rekurs(n - 1, x, 6 - x - z);
                //System.out.println(x + " " + z);
                xod ++;
                rekurs(n - 1, 6 - x - z, z);

            }

        }

        public static void main(String[] args) {

            rekurs(30, 1, 3);
            System.out.println("Было "+xod+" ходов");
        }


    }

