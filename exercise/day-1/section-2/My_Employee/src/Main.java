public class Main {
    public static void main(String[] args) {
        Employee karyawan1 = new Employee();
        karyawan1.nama = "I Dewa Gede Ngurah Bramasta Darmawan";
        karyawan1.npk = "68767";
        karyawan1.age = 23;
        karyawan1.address = "Jalan Raya Lebak Bulus";
        karyawan1.salary = 7150000;
        Employee karyawan2 = new Employee();
        karyawan2.nama = "Bryan";
        karyawan2.npk = "68768";
        karyawan2.age = 23;
        karyawan2.address = "Jalan Raya Lebak Bulus";
        karyawan2.salary = 7150000;

        karyawan1.showInfo();
        karyawan2.showInfo();

    }
}