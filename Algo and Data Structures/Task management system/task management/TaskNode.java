package task_management;

public class TaskNode {
	Task task;
    TaskNode next;

    public TaskNode(Task task) {
        this.task = task;
        this.next = null;
    }


}
