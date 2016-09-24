package hometask5;

public class LimitedException extends TerminalExceptions {
    private static final String message = "У Вас на счете недостачно средств для совершения данной операции";

    public LimitedException() {
        super(message);
    }

    @Override
    void printMessage() {
        super.printMessage();
    }
}
