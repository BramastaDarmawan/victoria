import java.util.*;

public class Main {
    public static void main(String[] args) {
        AkunBank akunku = new AkunBank("10101010101010");
        akunku.setAkunHolder("Bramasta Darmawan");
        akunku.deposit(1000000);
        akunku.withdraw(450000);
        System.out.println("Pemilik akun : " + akunku.getAkunHolder() + "\n" +
                "Nomor akun : " + akunku.nomorAkun + "\n" +
                "Sisa saldo sekarang : " + akunku.getBalance());
    }
}