package classes;

import java.util.Calendar;
import java.util.Date;

/**
 * Membuat Date dan Calendar Class
 */
public class DateCalendarApp {
    public static void main(String[] args) {
        
        Date date = new Date(1003939200000L);
        System.out.println(date);

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2023);
        calendar.set(Calendar.MONTH, Calendar.OCTOBER);
        calendar.set(Calendar.HOUR_OF_DAY, 19);

        Date result = calendar.getTime();
        System.out.println(result);
    }
}
