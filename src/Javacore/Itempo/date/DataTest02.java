package Javacore.Itempo.date;

import java.util.Calendar;
import java.util.Date;

public class DataTest02 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        Date date = c.getTime();
        Date habbo = new Date(1103464435000L);

        System.out.println(habbo);


    }

    //https://www.epochconverter.com/ - Conversor
}
