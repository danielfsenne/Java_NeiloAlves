import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DataEHora {
    public static void main(String[]args){

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();

        LocalDate d04 = LocalDate.parse("2026-06-10");
        LocalDateTime d05 = LocalDateTime.parse("2026-06-10T11:59:50");
        Instant d06 = Instant.parse("2026-06-10T01:30:26Z");
        Instant d07 = Instant.parse("2026-06-10T01:30:26-03:00");

        LocalDate d08 = LocalDate.parse("20/09/2022", fmt1 );

        System.out.println("d01 = " + d01);
        System.out.println("d02 =" + d02);
        System.out.println("d03 = " + d03);
        System.out.println("d04 =" + d04);
        System.out.println("d05 =" + d05);
        System.out.println("d06 = " + d06);
        System.out.println("d07 = " + d07);
        System.out.println("d08 = " + d08);



    }
}
