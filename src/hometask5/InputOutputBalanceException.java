package hometask5;

public class InputOutputBalanceException extends TerminalExceptions {
    private static final String message = "Вносимая/снимаемая сумма должна быть кратна 100";

    public InputOutputBalanceException() {
        super(message);
    }

    @Override
    void printMessage() {
        super.printMessage();
    }
}
