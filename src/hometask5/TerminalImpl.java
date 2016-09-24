package hometask5;

public class TerminalImpl implements Terminal {
    private PinValidator pinValidator;
    private TerminalServer server;


    public TerminalImpl() {
        pinValidator = new PinValidator();
        server = new TerminalServer();
    }

    @Override
    public void getBalance(UserCard userCard) {
        try {
            if (pinValidator.valid(userCard)) {
                if (!server.isLocked(userCard))
                    server.getUserCardBalance(userCard);
            }
        } catch (TerminalExceptions ex) {
            ex.printMessage();
        }
    }

    @Override
    public void putMoney(UserCard userCard, Integer moneyToCard) {
        try {
            if (pinValidator.valid(userCard)) {
                if (!server.isLocked(userCard))
                    server.inMoney(userCard, moneyToCard);
            }
        } catch (TerminalExceptions ex) {
            ex.printMessage();
        }
    }

    @Override
    public void takeMoney(UserCard userCard, Integer moneyFromCard) {
        try {
            if (pinValidator.valid(userCard)) {
                if (!server.isLocked(userCard))
                    server.outMoney(userCard, moneyFromCard);
            }
        } catch (TerminalExceptions ex) {
            ex.printMessage();
        }
    }

    public UserCard createNewUserCard() {
        UserCard newUserCard = server.createNewUsercard();
        System.out.println("Поздравляем! Ваша карта создана! Запомните Ваш пин-код, пожалуйста: " + newUserCard.getUserPin());

        return newUserCard;
    }


}