package sample;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeSample5 {
    public static void main(String[] args) {
        System.out.println("LocalDateTimeからフォーマットされた文字列へ変換");

        LocalDateTime localDateTime= LocalDateTime.now();
        System.out.println("デフォルトの出力形式" + localDateTime); 

        // 「yyyy⽉MM⽇dd HH時mm分ss秒」という形式で出⼒する
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH時mm分ss秒");

        String format = localDateTime.format(formatter);
        System.out.println(format);

        System.out.println("=======================");
        System.out.println("文字列からLocalDateTimeへ変換");

        String strLocalDateTime =  "2018/12/31 23:59:59"; 

        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime localDateTime2 = LocalDateTime.parse(strLocalDateTime, formatter2); 

        System.out.println("文字列から変換されたLocalDateTime:" + localDateTime2);
         
        
    }

}
