package task;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Task {
    public static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("dd.MM.yyyy  HH:mm:ss");
    public static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("dd.MM.yyyy");
    public static final DateTimeFormatter TIME_FORMATTER = DateTimeFormatter.ofPattern("HH:mm;ss");

   private String name;
    private String description;
    private boolean workIs;
    public int id;
    protected LocalDateTime dateAndTime;
    private static int counter;

    public Task(String name, String description, boolean workIs, int id, LocalDateTime dateAndTime) {
        this.name = name;
        this.description = description;
        this.workIs = workIs;
        this.id = ++counter;
        this.dateAndTime = dateAndTime;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public boolean isWorkIs() {
        return workIs;
    }

    public int getId() {
        return id;
    }

    public LocalDateTime getDateAndTime() {
        return dateAndTime;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", workIs=" + workIs +
                ", id=" + id +
                ", dateAndTime=" + dateAndTime +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return workIs == task.workIs && id == task.id && Objects.equals(name, task.name) && Objects.equals(description, task.description) && Objects.equals(dateAndTime, task.dateAndTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, workIs, id, dateAndTime);
    }
}
