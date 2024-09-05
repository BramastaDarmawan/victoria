import java.util.*;

public class Main {
    public static void main(String[] args) {
        LibraryManagement perpus = new LibraryManagement();

        LibraryItem buku1 = new Book("Naruto", "12345",
                "Masashi Kishimoto", 25);
        LibraryItem dvd1 = new DVD("One Piece Film Red", "221122",
                "Echirp Oda", 42);
        LibraryItem buku2 = new Book("Bleach", "12222333",
                "Tite Kubo", 27);
        LibraryItem dvd2 = new DVD("Kimi No Nawa", "223355",
                "Makoto Shinkai", 45);

        perpus.addItem(buku1);
        perpus.addItem(buku2);
        perpus.addItem(dvd1);
        perpus.addItem(dvd2);

        System.out.println();
        System.out.println();

        perpus.listAllItems();

        System.out.println();
        System.out.println();

        perpus.checkOutItem("12345");

        System.out.println();
        System.out.println();

        perpus.searchByTitle("Kimi No Nawa");

        LibraryItem item = perpus.searchByTitle("Doraemon");
        if (item != null) {
            item.printDetails();
        } else {
            System.out.println("Judul tidak ditemukan");
        }

        System.out.println();

        perpus.removeItem("12222333");

        System.out.println();
        System.out.println();

        perpus.listAllItems();
    }
}