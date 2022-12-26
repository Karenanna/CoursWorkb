package task;

import java.time.LocalDateTime;

public class SingleTime extends Task {
    public SingleTime(String name, String description, boolean workIs, LocalDateTime dateAndTime) {
        super(name, description,  workIs, dateAndTime);
    }
}
