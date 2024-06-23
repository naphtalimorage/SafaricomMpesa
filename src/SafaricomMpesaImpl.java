import java.util.Scanner;

public class SafaricomMpesaImpl implements SafaricomMpesa {
    double balance = 10000;


    @Override
    public void sendMoney(int amount, String phoneNo) {
        if(amount > balance ){
            System.out.println("Sorry! You have insufficient money");
        } else if (amount < 1) {
            System.out.println("sorry! You can sent only sent above 1");
        } else {
            balance = balance - amount;
            System.out.println("Confirmed you have sent " + amount + " to " + phoneNo + ". Your account balance is " + checkBalance());
        }
    }

    @Override
    public void withdrawCash(int amount, int agentNo) {
        if(amount > balance) {
            System.out.println("Sorry!You have insufficient money");
        } else if(amount < 1){
            System.out.println("Sorry! you can withdraw above 1");
        } else {
            balance = balance - amount;
            System.out.println("Confirmed you have withdraw " + amount + ". New M-pesa balance is " + checkBalance());
        }
    }

    @Override
    public void buyAirtime(int amount, String phoneNo) {
        if(amount > balance) {
            System.out.println("Sorry!You have insufficient money");
        } else if(amount < 1){
            System.out.println("Sorry! you can buy airtime above 1");
        } else {
            balance = balance - amount;
            System.out.println("Confirmed you have bought " + amount + " airtime to this number " + phoneNo + ". New M-pesa balance is " + checkBalance());
        }
    }

    @Override
    public void deposit(int amount) {
        balance = balance + amount;
        System.out.println("Confirmed You have deposited " + amount + ". New M-pesa balance is " + checkBalance());
    }

    @Override
    public double checkBalance() {
        return balance;
    }
}
