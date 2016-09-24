package hometask5;

import java.util.Random;

class UserCard {
    private final String userName;
    private final Integer userPin;
    private Integer cardBalance;
    private boolean locked;

    UserCard(String userName) {
        this.userName = userName;
        this.userPin = new Random().nextInt(10_000);
        this.cardBalance = 0;
        this.locked = false;
    }

    Integer getUserPin() {
        return userPin;
    }

    Integer getCardBalance() {
        return cardBalance;
    }

    boolean getStatusLocked() {
        return locked;
    }

    void setCardBalance(Integer newBalance) {
        this.cardBalance = newBalance;
    }

    void lock() {
        locked = true;
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            System.out.println(ex.getMessage());
        } finally {
            unlock();
        }
    }

    private void unlock() {
        locked = false;
    }
}
