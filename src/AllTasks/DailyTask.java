package AllTasks;
import Enum.Frequency;
import Enum.Type;
import java.time.LocalDateTime;
import java.time.LocalDate;
public class DailyTask extends Task {

    public DailyTask(String title, String description, LocalDateTime dateTime, Type type, Frequency frequency) {
        super(title, description, dateTime, type, frequency);
    }

    @Override
    public int compareTo(Task otherTask) {
        return super.compareTo(otherTask);
    }

    @Override
    public boolean appearsln(LocalDate localDate) {
        LocalDate date = this.getDateTime().toLocalDate();
        return localDate.equals(date) || localDate.isAfter(date);
    }

    @Override
    public String toString() {
        return super.toString() + " - ежедневная задача";
    }
}