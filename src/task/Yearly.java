package task;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Yearly extends Task implements Repeat{
    public Yearly(String name, String description, boolean workIs, LocalDateTime dateAndTime) {
        super(name, description, workIs, id, dateAndTime);
    }

    public boolean checkSuitable(LocalDate date) {
        return date.getDayOfMonth() == dateAndTime.getDayOfMonth() && date.getMonth() == dateAndTime.getMonth();

    }
}
