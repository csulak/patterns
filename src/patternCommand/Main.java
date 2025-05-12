package patternCommand;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Lucas: The user who know how to retire and deposit money
        User user = new User("John Doe", 1000);

        // Lucas: The commands(actions) to retire and deposit money
        CommandRetire commandRetire = new CommandRetire(user, 200);
        CommandDeposit commandDeposit = new CommandDeposit(user, 500);
        List<ICommand> commands = new ArrayList<>();
        commands.add(commandRetire);
        commands.add(commandDeposit);

        // Lucas: The invoker that will execute the commands
        Invoker invoker = new Invoker(commands);

        // Lucas: Each command knows which is the object to be modified (the user)
        // On this example each command also receives the amount to be modified
        // Each command is a different action (retire or deposit)
        invoker.executeCommand();
    }
}
