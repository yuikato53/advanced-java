package sample;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class Ex08 {
    public static void main(String[] args) {
        
        LocalDate localDate = LocalDate.of(2020, 2, 1);

        LocalDate lastDayOfmonth= localDate.with(TemporalAdjusters.lastDayOfMonth());

        int dayOfMonth = localDate.getDayOfMonth();

        System.out.println(lastDayOfmonth);
    }

}
