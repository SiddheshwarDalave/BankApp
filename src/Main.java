public class Main {
    public static void main(String[] args) {
//        account 1
        SBI b=new SBI("1234","Siddheshwar","password",1000);
        b.addMoney(1000);//now amount will be 2000;
        b.WithdrawMoney(1000);//now amount will 1000;
        b.fdIntrest(10);//will check interest for 10 year with rate of 7
        // now check rem balance which should 1000
        //now withdrawing amount larger than present
        b.WithdrawMoney(2000);
        long remBalance=b.checkBalance();
        System.out.println("Hello "+b.acHolderName+",\nYou have "+remBalance+" in your account\nThank you...!");

    }
}