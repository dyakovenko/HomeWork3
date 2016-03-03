/**
 * массив 8 линий по 5 столюцов.
 */
public class Array8in5 {


    public static void main(String[] args) {
        int[][] arr1 = new int[8][5];
        for (int i = 0;i<arr1.length;i++){
            for (int j = 0;j<arr1[i].length;j++) {
                arr1[i][j] = (int) (Math.random() * 90) + 10;
                System.out.print(arr1[i][j]+":");
            }
            System.out.println("");



        }
    }

}
