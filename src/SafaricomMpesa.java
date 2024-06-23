interface SafaricomMpesa {
    public void sendMoney(int amount, String phoneNo);

    public void withdrawCash(int amount, int agentNo);

    public void buyAirtime(int amount, String phoneNo);

    public void deposit(int amount);

    public double checkBalance();
}
