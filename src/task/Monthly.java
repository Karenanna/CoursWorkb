package task;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDate;

public class Monthly extends Task implements Repeat {
    public Monthly(String name, String description, boolean workIs, LocalDateTime dateAndTime) {
        super(name, description, workIs, dateAndTime);
    }

    public boolean checkSuitable(LocalDate date) {
        return date.getDayOfMonth() == dateAndTime.getDayOfMonth();
        if (date.isAfter(dateAndTime)) {
            return true;
        }
    }
}
