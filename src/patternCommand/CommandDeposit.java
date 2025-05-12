package patternCommand;

public class CommandDeposit implements ICommand {

    private User user;
    private int amount;

    public CommandDeposit(User user, int amount) {
        this.user = user;
        this.amount = amount;
    }

    @Override
    public void execute() {
        System.out.println("User " + user.getName() + " is depositing");
        System.out.println("Depositing " + amount + " to " + user.getName());
        user.setAmount(user.getAmount() + amount);
        System.out.println("New balance: " + user.getAmount());
    }
}