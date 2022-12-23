import task.Repeat;
import task.Task;

import java.time.LocalDate;
import java.util.*;

public class Servis {
    private Map<Integer, Task> mapOfTasks;

    public Servis() {
        mapOfTasks = new HashMap<>();
    }

    public void addTask(Task task) {
        mapOfTasks.put(task.getId(), task);
    }

    public void removeTask(int id) {
        mapOfTasks.remove(id);
    }

    public List<Task> getTasksForOneDay(LocalDate date) {
        List<Task> result = new ArrayList<>();
        for (Map.Entry<Integer, Task> entry : mapOfTasks.entrySet()) {
            if (entry.getValue() instanceof Repeat && ((Repeat) entry.getValue()).checkSuitable(date) || entry.getValue().getDateAndTime().toLocalDate().equals(date)) {
                result.add(entry.getValue());
            }
        }

        result.sort(Comparator.comparing(Task :: getDateAndTime));
        return result;
    }
}


