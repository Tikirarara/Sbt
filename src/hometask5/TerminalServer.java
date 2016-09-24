package hometask5;

import java.util.Scanner;

public class TerminalServer {
    public void getUserCardBalance(UserCard userCard) {
        System.out.println("Ваш баланс составляет: " + userCard.getCardBalance());
    }

    public boolean isLocked(UserCard userCard) {
        return userCard.getStatusLocked();
    }

    public void outMoney(UserCard userCard, Integer money) throws LimitedException, InputOutputBalanceException {
        if (money % 100 == 0) {
            Integer currentBalance = userCard.getCardBalance();
            if (currentBalance > money)
                userCard.setCardBalance(currentBalance - money);
            else throw new LimitedException();
        } else throw new InputOutputBalanceException();
    }

    void inMoney(UserCard userCard, Integer money) throws InputOutputBalanceException {
        if (money % 100 == 0) {
            Integer currentBalance = userCard.getCardBalance();
            userCard.setCardBalance(currentBalance + money);
        } else throw new InputOutputBalanceException();
    }

    UserCard createNewUsercard() {
        System.out.println("Введите Ваше имя пользователя, пожалуйста");
        String username = nameInput();

        return new UserCard(username);
    }

    private String nameInput() {
        Scanner sc = new Scanner(System.in);
        return sc.next();
    }
}
