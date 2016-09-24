package hometask5;

public class Main {
    public static void main(String[] args) {
        TerminalImpl terminal = new TerminalImpl();

        UserCard card1 = terminal.createNewUserCard();
        UserCard card2 = terminal.createNewUserCard();
        UserCard card3 = terminal.createNewUserCard();

        terminal.getBalance(card1);
        terminal.getBalance(card1);
        terminal.getBalance(card1);
        terminal.getBalance(card1);
        terminal.getBalance(card1);

        terminal.putMoney(card2, 5000);
        terminal.putMoney(card3, 5861);

        terminal.takeMoney(card1, 1);
        terminal.takeMoney(card2, 500);
        terminal.getBalance(card2);
    }
}
