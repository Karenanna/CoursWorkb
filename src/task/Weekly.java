package task;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Weekly extends Task implements Repeat {
    public Weekly(String name, String description, boolean workIs, LocalDateTime dateAndTime) {
        super(name, description, workIs, id, dateAndTime);
    }


    public boolean checkSuitable (LocalDate date) {
        return date.getDayOfWeek() ==  dateAndTime.getDayOfWeek();
    }
}
