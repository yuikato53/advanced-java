package sample;

import java.time.LocalDate;
import java.time.LocalTime;

public class DateTimeSample1 {
    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();  //new がついていない（コンストラクタをパブリックにしていない　static）
        System.out.println(localDate);

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime); //自分のPCの日時情報が表示される

    }

}
