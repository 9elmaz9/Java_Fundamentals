package be.intecbrussel.Les4;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateExample {
    public static void main(String[] args) {
        //De localDate, LocalTime en LocalDateTime zijn een reeks klassen die niet gebonden zijn
        //aan tijdzones en zomertijd. Dit zijn onveranderlijke objecten dat de datum en tijd
        //representeert

        LocalDate justTheDate=LocalDate.now();
        LocalTime justTheTime =LocalTime.now();
        LocalDateTime dateAndTheTimeNow=LocalDateTime.now();

        System.out.println(justTheDate);
        System.out.println(justTheTime);
        System.out.println(dateAndTheTimeNow);

    }

}
