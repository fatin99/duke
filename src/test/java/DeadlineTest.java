import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DeadlineTest{
    @Test
    public void toStringTest() {
        Deadline deadline = new Deadline("test", "28-1-2020 1200", Task.parser);
        assertEquals("[D][N] test (by: Jan 28 2020 12PM)", deadline.toString());
    }

    @Test
    public void fileStringTest() {
        Deadline deadline = new Deadline("test", "28-1-2020 1200", Task.parser);
        assertEquals("D | N | test | Jan 28 2020 12PM", deadline.fileString());
    }
}