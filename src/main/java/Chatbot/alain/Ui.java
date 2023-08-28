package Chatbot.alain;

public class Ui {
    public void showlines() {
        System.out.print("____________________________________________________________\n");
    }
    public void showWelcome() {
        this.showlines();
        System.out.print("Hello! I'm Alain\nWhat can I do for you?\n");
        this.showlines();
    }

    public void showGoodbye() {
        this.showlines();
        System.out.print("Bye. Hope to see you again soon!\n");
        this.showlines();
    }

    public void showError(String errorMessage) {
        this.showlines();
        System.out.print(" OOPS!!! " + errorMessage + "\n");
        this.showlines();
    }

    public void showList(TaskList list) {
        String output = "";
        this.showlines();
        output +=  "Here are the tasks in your list:\n";
        for (int i = 0; i < list.size(); i++) {
            output += " " + (i + 1) + ". " + list.getTask(i) + "\n";
        }
        System.out.print(output);
        this.showlines();
    }

    public void showRemoveTask(Task removedTask, TaskList list) {
        this.showlines();
        String output = " Noted. I've removed this task:\n"
                + "   " + removedTask + "\n"
                + " Now you have " + list.size() + " tasks in the list.\n";
        System.out.print(output);
        this.showlines();
    }

    public void showAddTask(Task task, TaskList list) {
        this.showlines();
        String output = " Got it. I've added this task:\n"
                + "   " + task + "\n"
                + " Now you have " + list.size() + " tasks in the list.\n";
        System.out.print(output);
        this.showlines();
    }
    public void showMarkTask(String numericPart, TaskList list) {
        this.showlines();
        String output = " Nice! I've marked this task as done:\n"
                + "   " + list.getTask(Integer.parseInt(numericPart) - 1) + "\n";
        System.out.print(output);
        this.showlines();
    }

    public void showUnmarkTask(String numericPart, TaskList list) {
        this.showlines();
        String output = " Nice! I've marked this task as not done yet:\n"
                + "   " + list.getTask(Integer.parseInt(numericPart) - 1) + "\n";
        System.out.print(output);
        this.showlines();

    }
}
