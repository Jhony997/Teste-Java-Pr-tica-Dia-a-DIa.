package Javacore.Itempo.date;

import java.util.Calendar;
import java.util.Date;

public class DateTest01 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        Date date = c.getTime();

        System.out.println(date.getTime());
        System.out.println(date);
        System.out.println(Calendar.DAY_OF_YEAR);

        c.roll(Calendar.HOUR,25);
        Date date1 = c.getTime();
        System.out.println("roll : " + date1);
        c.add(Calendar.HOUR,25);
        Date date2 = c.getTime();
        System.out.println("add : "+ date2);


    }

//Calendar c = Calendar.getInstance();
// Date date = c.getTime(); "Não é DO MSQL"
}
