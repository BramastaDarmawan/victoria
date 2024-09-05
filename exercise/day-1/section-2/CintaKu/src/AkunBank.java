public class AkunBank {
    private double balance;
    public String nomorAkun;
    private String akunHolder;

    public String getAkunHolder() {
        return akunHolder;
    }

    public double getBalance() {
        return balance;
    }

    public AkunBank(String nomorAkun) {
        this.nomorAkun = nomorAkun;
    }

    public void setAkunHolder(String akunHolder) {
        this.akunHolder = akunHolder;
    }

    public void deposit(double deposit){
        if(deposit > 0){
            balance += deposit;
        }
    }

    public void withdraw(double deposit){
        if (deposit > 0 && balance >= deposit){
            balance -= deposit;
        }
    }
}
