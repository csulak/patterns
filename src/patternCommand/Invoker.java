package patternCommand;

import java.util.ArrayList;
import java.util.List;

public class Invoker {

    List<ICommand> commands = new ArrayList<>();

    public Invoker(List<ICommand> commands) {
        this.commands = commands;
    }

    public void executeCommand() {
        for (ICommand command : commands) {
            command.execute();
        }
    }


    public void addCommandOperation(ICommand command) {
        commands.add(command);
    }
}
