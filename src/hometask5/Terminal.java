package hometask5;

interface Terminal {
    public void getBalance(UserCard userCard);

    public void putMoney(UserCard userCard, Integer moneyToCard);

    public void takeMoney(UserCard userCard, Integer moneyFromCard);
}