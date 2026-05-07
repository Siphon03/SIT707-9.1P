package sit707_week9;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TaskStatusServiceTest {

    @Test
    public void testSubmittedTaskStatus() {

        TaskStatusService service = new TaskStatusService();

        assertEquals("Submitted",
                service.checkStatus("S123", "9.1P"));
    }

    @Test
    public void testTaskNotFound() {

        TaskStatusService service = new TaskStatusService();

        assertEquals("Task Not Found",
                service.checkStatus("S999", "1.1P"));
    }
    @Test
    public void testInvalidStudentId() {

        TaskStatusService service = new TaskStatusService();

        assertEquals("Task Not Found",
                service.checkStatus("", "9.1P"));
    }
}