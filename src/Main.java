import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        
        ZonedDateTime data = ZonedDateTime.parse("2023-03-01T13:00:00Z");

        data = data.plusYears(1).minusMonths(1).plusDays(7);

        DateTimeFormatter formatter = DateTimeFormatter
                .ofPattern("dd MMMM yyyy HH:mm z")
                .withLocale(Locale.ITALY);

        System.out.println(data.format(formatter));
    }
}
