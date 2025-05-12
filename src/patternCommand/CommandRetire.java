package patternCommand;

public class CommandRetire implements ICommand {

    private User user;
    private int amount;

    public CommandRetire(User user, int amount) {
        this.user = user;
        this.amount = amount;
    }

    @Override
    public void execute() {
        if (user.getAmount() >= amount) {
            System.out.println("User " + user.getName() + " is retiring");
            System.out.println("Retiring " + amount + " from " + user.getName());
            user.setAmount(user.getAmount() - amount);
            System.out.println("New balance: " + user.getAmount());
        } else {
            System.out.println("Insufficient funds to retire " + amount);
        }
    }
}