package hometask5;

import java.util.Scanner;

class PinValidator {
    private int counter = 0;

    boolean valid(UserCard userCard) throws PinValidatorException {
        if ((inputPin().equals(userCard.getUserPin())) && (counter != 3)) {
            return true;
        } else {
            if (counter < 3) {
                counter += 1;
                throw new PinValidatorException();
            }
            if (counter == 3) {
                try {
                    throw new AccountIsLockedException();
                } catch (AccountIsLockedException ex) {
                    ex.printMessage();
                    userCard.lock();
                    counter = 0;
                }
            }
            return false;
        }
    }

    private Integer inputPin() {
        System.out.println("Введите Ваш пин-код, пожалуйста");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
}
