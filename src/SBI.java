public class SBI extends Bank {
    public SBI(String acNumber, String acHolderName, String currPassword, long initialAmount) {
        super(acNumber, acHolderName, currPassword, initialAmount);
    }

    public SBI(long amount) {
        super(amount);
    }
}
