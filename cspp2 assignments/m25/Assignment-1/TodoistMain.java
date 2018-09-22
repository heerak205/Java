import java.util.Scanner;
import java.util.Arrays;

/**
  * write your code below this comment
  */
/**
 * Class for task.
 */
class Task {
    String title;
    String assignedTo;
    int timeToComplete;
    boolean important;
    boolean urgent;
    String status;
    /**
     * Constructs the object.
     *
     * @param      title1           The title 1
     * @param      assignedTo1      The assigned to 1
     * @param      timeToComplete1  The time to complete 1
     * @param      important1       The important 1
     * @param      urgent1          The urgent 1
     * @param      status1          The status 1
     */
    Task(String title1, String assignedTo1, int timeToComplete1, boolean important1,
         boolean urgent1, String status1) throws Exception {
        this.title = title1;
        this.assignedTo = assignedTo1;
        this.timeToComplete = timeToComplete1;
        this.important = important1;
        this.urgent = urgent1;
        this.status = status1;
        if (title.equals("")) {
            throw new Exception("Title not provided");
        } 
        if (timeToComplete < 0) {
            throw new Exception("Invalid timeToComplete " + timeToComplete);
        } 
        if (!status.equals("todo") && !status.equals("done")) {
            throw new Exception("Invalid status " + status);
        } 
    }
    /**
     * Returns a string representation of the object.
     *
     * @return     String representation of the object.
     */
    public String toString() {
        String ni = "Not Important";
        String nu = "Not Urgent";
        if(important) {
            ni = "Important";
        } 
        if(urgent) {
            nu = "Urgent";
        }
        String objdisplay = title + ", " +
         assignedTo+", "+ timeToComplete+", "+
          ni+", "+ nu+", "+ status;
        return objdisplay;
    }
}
/**
 * Class for todoist.
 */
class Todoist {
    Task[] taskarray;
    int size;
    Todoist() {
        taskarray = new Task[10];
        size = 0;
    }
    public void addTask(Task task) {
        try{
            taskarray[size] = task;
            size++;
        } catch (Exception e) {
            resize();
            addTask(task);
        }
        
    }
    void resize() {
        taskarray = Arrays.copyOf(taskarray, 2 * size);
    }
    /**
     * Gets the next task.
     *
     * @param      name  The name
     *
     * @return     The next task.
     */
    public Task getNextTask(String name) {
        for(int i = 0; i < size; i++) {
            if(taskarray[i].assignedTo.equals(name) &&
             taskarray[i].status.equals("todo")) {
                if(taskarray[i].important && !taskarray[i].urgent) {
                    return taskarray[i];
                }
            }
        }
        return null;
    }
    /**
     * Returns a string representation of the object.
     *
     * @return     String representation of the object.
     */
    public String toString() {
        String objdisplay = "";
        for (int i = 0; i < size; i++) {
        String ni = "Not Important";
        String nu = "Not Urgent";
        if(taskarray[i].important) ni = "Important";
        if(taskarray[i].urgent) nu = "Urgent";
        objdisplay += taskarray[i].title + ", " +
         taskarray[i].assignedTo+", "+ taskarray[i].timeToComplete+", "+
          ni+", "+ nu+", "+ taskarray[i].status + "\n"; 
        }
        return objdisplay;
    }
}
/**
 * Class for todoist main.
 */
public class TodoistMain {
    /**
     * Starts a test.
     */
    public static void startTest() {
        Todoist todo = new Todoist();
        Scanner s = new Scanner(System.in);
        while (s.hasNext()) {
            String[] tokens = s.nextLine().split(",");
            switch (tokens[0]) {
            case "task":
                testTask(tokens);
                break;
            case "add-task":
                testAddTask(todo, tokens);
                break;
            case "print-todoist":
                System.out.println(todo);
                break;
            case "get-next":
                System.out.println(todo.getNextTask(tokens[1]));
                break;
            // case "get-next-n":
            //  int n = Integer.parseInt(tokens[2]);
            //  Task[] tasks = todo.getNextTask(tokens[1], n);
            //  System.out.println(Arrays.deepToString(tasks));
            //  break;
            // case "total-time":
            //  System.out.println(todo.totalTime4Completion());
            //  break;
            default:
                break;
            }
        }
    }
    /**
     * method to test add task.
     *
     * @param      todo    The todo
     * @param      tokens  The tokens
     */
    public static void testAddTask(final Todoist todo, final String[] tokens) {
        try {
            todo.addTask(createTask(tokens));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    /**
     * method to test the creation of task object.
     *
     * @param      tokens  The tokens
     */
    public static void testTask(final String[] tokens) {
        try {
            System.out.println(createTask(tokens));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    /**
     * Creates a task object.
     *
     * @param      tokens     The tokens
     *
     * @return     Task object
     *
     * @throws     Exception  if task inputs are invalid
     */
    public static Task createTask(final String[] tokens) throws Exception {
        final int one = 1;
        final int two = 2;
        final int three = 3;
        final int four = 4;
        final int five = 5;
        final int six = 6;
        String title = tokens[one];
        String assignedTo = tokens[two];
        int timeToComplete = Integer.parseInt(tokens[three]);
        boolean important = tokens[four].equals("y");
        boolean urgent = tokens[five].equals("y");
        String status = tokens[six];
        return new Task(
                   title, assignedTo, timeToComplete,
                    important, urgent, status);
    }
    /**
     * main method.
     *
     * @param      args  The command line arguments
     */
    public static void main(final String[] args) {
        startTest();
    }
}