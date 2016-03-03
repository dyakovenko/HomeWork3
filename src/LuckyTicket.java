/**
 * счастливый билетик
 */
public class LuckyTicket {

    public static void main(String[] args) {
        int lucky=0;
        for (int i =1000;i<1000000;i++) {
            int a = i / 100000 % 10;
            int b = i/10000%10;
            int c = i/1000%10;
            int x =i/100%10;
            int y = i/10%10;
            int w = i%10;
            if((a+b+c)==(x+y+w))lucky++;

        }
        System.out.println(lucky);





    }

}









