package nguyenxuannghia_20001954.lab11.command.exercise1;

public class RestartCommand implements Command {

    private Computer computer;

    public RestartCommand(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void execute() {
        computer.restart();
    }
}
