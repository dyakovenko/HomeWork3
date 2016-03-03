/**
 * индекс строки с наиболшой суммой елементов по модулю
 */
public class Array5or5 {
    public static void main(String[] args) {
        int[][] arr74 = new int[7][4];
        int indexMaxSummi = 0;
        for (int i = 0; i < arr74.length; i++) {
            for (int j = 0; j < arr74[i].length; j++) {
                arr74[i][j] = (int) (Math.random() * 11) - 5;
            }
        }
        int[] max = new int[7];
        for (int c = 0, t=8; (c < arr74.length && t==0); c++) {
            int sum = 0;
            for (int x = 0; x < arr74[c].length; x++) {
                sum = (sum + Math.abs(arr74[c][x]));
            }
            max[c] = sum;
        }
        int index = 0;
        for (int i = 0; i < max.length; i++) {
            if (max[index] >= max[i]) {
                indexMaxSummi = index +1;
            } else {
                index++;
                i=0;
                continue;
            }
        }

        System.out.println("Индекс строки с наибольшим произведением елементов масива = " + indexMaxSummi);
    }
        }





