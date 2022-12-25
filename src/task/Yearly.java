package task;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDate;

public class Yearly extends Task implements Repeat{
    public Yearly(String name, String description, boolean workIs, LocalDateTime dateAndTime) {
        super(name, description, workIs, dateAndTime);
    }

    public boolean checkSuitable(LocalDate date) {
        return date.getDayOfYear() == dateAndTime.getDayOfYear() && dateAndTime.getYear() == dateAndTime.getYear();
        if (date.isAfter(dateAndTime)) {
            return true;
        }
    }
}
