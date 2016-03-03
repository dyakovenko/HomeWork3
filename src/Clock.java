/**
 * одинаково на табло часов
 */
public class Clock {
    public static void main(String[] args) {
        int simetr=0;
        for (int hour = 0;hour<24;hour++ ){
            int aHour=0;
            int bHour=0;
            if (hour<10)aHour=0;
            else aHour=hour/10;
            bHour=hour%10;
        for (int min =0;min<=59;min++){
            int aMin=0;
            int bMin=0;
            if (min<10)
                aMin = 0;
            else aMin=min/10;
            bMin= min%10;
            if((aHour==bMin)&&(bHour==aMin)){
                simetr++;
            }
            }
        }System.out.println(simetr);


    }

}
