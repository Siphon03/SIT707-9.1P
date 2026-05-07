package sit707_week9;

public class TaskStatusService {

    public String checkStatus(String studentId, String taskId) {

        if(studentId.equals("S123") && taskId.equals("9.1P")) {
            return "Submitted";
        }

        return "Task Not Found";
    }
}