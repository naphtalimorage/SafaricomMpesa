import java.util.Scanner;

public class SafaricomMpesaDriver {
    static void Mpesa() {
        SafaricomMpesaImpl mySafaricom = new SafaricomMpesaImpl();
        Scanner getMenu = new Scanner(System.in);
        System.out.println("1.Send Money");
        System.out.println("2.Withdraw Cash");
        System.out.println("3.Buy Airtime");
        System.out.println("4.Deposit");
        System.out.println("5.Lipa na M-PESA");
        System.out.println("6.My Account");
        int menuOptions = getMenu.nextInt();

        if(menuOptions == 1) {
            Scanner phoneno = new Scanner(System.in);
            System.out.println("Enter Phone Number");
            String getphoneno = phoneno.nextLine();
            System.out.println("Enter Amount");
            int getAmount = phoneno.nextInt();
            mySafaricom.sendMoney(getAmount,getphoneno);
        } else if (menuOptions == 2) {
            Scanner withdraw = new Scanner(System.in);
            System.out.println("Enter Agent Number");
            int agentNo = withdraw.nextInt();
            System.out.println("Enter Store Number");
            int storeNo = withdraw.nextInt();
            System.out.println("Enter Amount");
            int setAmount = withdraw.nextInt();;
            mySafaricom.withdrawCash(setAmount,agentNo);
        } else if(menuOptions == 3) {
            Scanner airTime = new Scanner(System.in);
            System.out.println("1.Buy Other Phone");
            int getChoice = airTime.nextInt();
            System.out.println("Enter Phone Number");
            String getMyNo = airTime.nextLine();
            System.out.println("Enter Amount");
            int getAmount = airTime.nextInt();
            mySafaricom.buyAirtime(getAmount,getMyNo);
        } else if (menuOptions == 4) {
            Scanner deposit = new Scanner(System.in);
            System.out.println("Enter amount to Deposit");
            int getamout = deposit.nextInt();
            mySafaricom.deposit(getamout);
        }
    };

    static void Safaricom() {
        System.out.println("1.My Account");
        System.out.println("2.M-Banking Service");
    };

    public static void main(String[] args) {
        Scanner startChoice = new Scanner(System.in);
        System.out.println("SAFARICOM");
        System.out.println("1.safaricom");
        System.out.println("2.M-PESA");
        int mpesachoice = startChoice.nextInt();

        if (mpesachoice == 1) {
            Safaricom();
        } else {
            Mpesa();
        }
    }
}
