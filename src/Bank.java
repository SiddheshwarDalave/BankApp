public class Bank {
    //Bank class-base class
    String acNumber;
    String acHolderName;
    String oldPassword;
    String currPassword;
    long initialAmount;
    long balance;
    long amount; // for reference- to addmoney and to withdraw

    public Bank(String acNumber, String acHolderName, String currPassword, long initialAmount) {
        // initillize this constructor to create account;
        this.acNumber = acNumber;
        this.acHolderName = acHolderName;
        this.currPassword = currPassword;
        this.initialAmount = initialAmount;
    }
    public Bank(long amount) {
        this.amount = amount;
    }
    // Methods

    void WithdrawMoney(long withdrawAmount){
        if(withdrawAmount<initialAmount){
            balance=initialAmount-withdrawAmount;
            initialAmount=balance;
            System.out.println("Hello"+acHolderName+",");
            System.out.println("You withdraw "+ withdrawAmount+"$");
            System.out.println("Your remaining balance "+balance+"$");
            System.out.println("Thank you..!");
        }else{
            System.out.println("Insufficient Amount!!!\n Please enter the lower amount or check balamce");
        }
        return;
    }

    void addMoney(long addedAmount){
        initialAmount=initialAmount+addedAmount;
        System.out.println("Hello"+acHolderName+",");
        System.out.println("You added "+ addedAmount+"$");
        System.out.println("Your current balance is "+initialAmount+"$");
        System.out.println("Thank you..!");
        return;
    }
    long checkBalance(){
        return initialAmount;

    }
    void fdIntrest(int years){
        double interest=(initialAmount*7*years)/100;
        System.out.println("Hello"+acHolderName+",");
        System.out.println("You will get interest- "+interest+"$"+" for "+years+"year");
        return;

    }


}
