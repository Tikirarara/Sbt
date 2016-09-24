package hometask5;

class AccountIsLockedException extends TerminalExceptions {
    private static final String message = "Ваш аккаунт заблокирован! Через 5 секунд блокировка будет снята, и Вы сможете попробовать повторить операцию";

    AccountIsLockedException() {
        super(message);
    }

    @Override
    void printMessage() {
        super.printMessage();
    }
}
