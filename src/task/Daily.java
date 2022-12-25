package task;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Daily extends Task implements Repeat {

    public Daily(String name, String description, boolean workIs, LocalDateTime dateAndTime) {
        super(name, description, workIs, dateAndTime);

    }


    public boolean checkSuitable(LocalDate date) {
        return true;
    }
}
