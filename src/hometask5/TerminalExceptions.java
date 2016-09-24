package hometask5;

class TerminalExceptions extends Exception {
    private final String message;

    TerminalExceptions() {
        this.message = "Неизвестная ошибка. Попробуйте еще раз повторить операцию";
    }

    TerminalExceptions(String message) {
        this.message = message;
    }

    void printMessage() {
        System.out.println(message);
    }
}
