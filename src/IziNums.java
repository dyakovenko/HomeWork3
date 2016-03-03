/**
 * поиск простого числа 4ерез рекурсию
 */
public class IziNums {
    public static boolean iziNum(int z, int i )
    {
        if (z % i == 0) return false;
        if(i <= z/2)
            return iziNum(z, i + 1);
        else return true;
    }
    public static void main(String[] args) {
        int c = 2;
        int z = 100;
        System.out.print(2 + ",");
        for (int i = 2; i <= z; i++) {
            if (iziNum(i, 2) == true) System.out.print(i + ",");
        }
    }
}