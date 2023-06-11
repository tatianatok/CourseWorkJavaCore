package AllTasks;
import Enum.Frequency;
import Enum.Type;
import java.time.LocalDate;
import java.time.LocalDateTime;
public class OneTimeTask extends Task {
    public OneTimeTask(String title, String description, LocalDateTime dateTime, Type type, Frequency frequency) {
        super(title, description, dateTime, type, frequency);
    }

    @Override
    public boolean appearsln(LocalDate localDate) {
        return localDate.equals(this.getDateTime().toLocalDate());
    }

    @Override
    public String toString() {
        return super.toString() + " - однократное задание";
    }
}