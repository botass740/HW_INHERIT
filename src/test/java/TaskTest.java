import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.javaqamvn.Epic;
import ru.netology.javaqamvn.Meeting;
import ru.netology.javaqamvn.SimpleTask;

public class TaskTest {

    @Test
    public void simpleTaskTextSearchFound() {
        SimpleTask simpleTask = new SimpleTask(55, "Хлеб");
        boolean actual = simpleTask.matches("Хлеб");
        boolean expected = true;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void simpleTaskTextSearchNotFound() {
        SimpleTask simpleTask = new SimpleTask(55, "Хлеб");
        boolean actual = simpleTask.matches("Шоколад");
        boolean expected = false;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void epicTextSearchFound() {
        Epic epic = new Epic(35, new String[]{"Встреча"});
        boolean actual = epic.matches("Встреча");
        boolean expected = true;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void epicTextSearchNotFound() {
        Epic epic = new Epic(35, new String[]{"Встреча"});
        boolean actual = epic.matches("встреча");
        boolean expected = false;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void meetingTextSearchFound() {
        Meeting meeting = new Meeting(555,"Выкатка 3й версии приложения", "Приложение НетоБанка", "Во вторник после обеда");
        boolean actual = meeting.matches("версии");
        boolean expected = true;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void meetingTextSearchNotFound() {
        Meeting meeting = new Meeting(555,"Выкатка 3й версии приложения", "Приложение НетоБанка", "Во вторник после обеда");
        boolean actual = meeting.matches("версий");
        boolean expected = false;

        Assertions.assertEquals(expected, actual);
    }
}
