public class Kotak extends Bank{
    public Kotak(String acNumber, String acHolderName, String currPassword, long initialAmount) {
        super(acNumber, acHolderName, currPassword, initialAmount);
    }

    public Kotak(long amount) {
        super(amount);
    }
}
