package chatbot.alain.commands;

import chatbot.alain.AlainException;
import chatbot.alain.TaskList;
import chatbot.alain.uis.GuiUi;
import chatbot.alain.uis.Ui;

/**
 * Represents an abstract command that can be executed. This serves as the base class
 * for various specific command implementations in the system.
 *
 * <p>Each command is associated with a {@code TaskList} to keep track of tasks,
 * a textual representation or description of the command itself, and a {@code Storage}
 * instance for persistence concerns.</p>
 */
public class UnmarkCommand extends Command {
    public UnmarkCommand(TaskList list, String text) {
        super(list, text);
    }

    @Override
    public String processCommand() throws AlainException {
        String numericPart = text.substring(7);
        if (Integer.parseInt(numericPart) - 1 < 0 || Integer.parseInt(numericPart) > list.size()) {
            throw new AlainException("Task with such index does not exist.");
        }
        list.getTask(Integer.parseInt(numericPart) - 1).markAsUndone();
        Ui.showUnmarkTask(numericPart, list);
        return GuiUi.showUnmarkTask(numericPart, list);
    }
}
