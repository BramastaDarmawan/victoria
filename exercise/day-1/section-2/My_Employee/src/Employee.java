public class Employee {
    String nama, npk, address;
    long salary, age;

    void sayHello(){
        System.out.println("Hello World!");
    }
    void showInfo(){
        System.out.println("Nama : " + nama + "\n"+
                "NPK : " + npk + "\n" +
                "Umur : " + age + "\n" +
                "Alamat : " + address + "\n" +
                "Gaji : " + salary + "\n");
    }
}
