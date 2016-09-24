package hometask5;

class PinValidatorException extends TerminalExceptions {
    private static final String message = "Введенный пин-код - неправильный. Попробуйте еще раз";

    PinValidatorException() {
        super(message);
    }

    @Override
    void printMessage() {
        super.printMessage();
    }
}
