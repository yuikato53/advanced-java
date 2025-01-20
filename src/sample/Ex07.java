package sample;

import java.time.LocalDate;
import java.time.Month;

public class Ex07 {
    public static void main(String[] args) {
    

    LocalDate birthDate = LocalDate.of(2000, 5, 3);

    int year = birthDate.getYear();
    int month = birthDate.getMonthValue();
    int date = birthDate.getDayOfMonth();
    
    System.out.println("私の誕生日は"+year+"年"+month+"月"+date+"日です");
    }

}
