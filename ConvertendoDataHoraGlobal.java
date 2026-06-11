import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class ConvertendoDataHoraGlobal {
    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2022-08-29");
        LocalDateTime d05 = LocalDateTime.parse("2022-09-22T01:33:26");
        Instant d06 = Instant.parse("2022-08-22T01:33:08Z");

        LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
        LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Europe/Lisbon"));

        LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
        LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Europe/Lisbon"));

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);
        System.out.println("r4 = " + r4);

        System.out.println("d04 dia = " + d04.getDayOfMonth());
        System.out.println("d04 mês = " + d04.getMonthValue());

        for (String s : ZoneId.getAvailableZoneIds()) {
            System.out.println(s);
        }
    }
}