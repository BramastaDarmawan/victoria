public class Main {
    public static void main(String[] args) {
        BackAccount account = new BackAccount();
        account.deposit(500);
        account.withdraw(100);
        System.out.println("Currnent balance : " + account.getBalance());

    }
}