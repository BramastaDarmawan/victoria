import java.util.*;
class LibraryManagement implements Library {
    private ArrayList<LibraryItem> items;

    public LibraryManagement() {
        items = new ArrayList<>();
    }

    @Override
    public void addItem(LibraryItem item) {
        items.add(item);
        System.out.println("Item telah ditambahkan :  " + item.getTitle());
    }

    @Override
    public void removeItem(String itemId) {
        LibraryItem itemToRemove = null;
        for (LibraryItem item : items) {
            if (item.getItemId().equals(itemId)) {
                itemToRemove = item;
                break;
            }
        }

        if (itemToRemove != null) {
            items.remove(itemToRemove);
            System.out.println("Item telah dihapus " + itemToRemove.getTitle());
        } else {
            System.out.println("Item dengan ID berikut :  " + itemId + ". Tidak dapat ditemukan");
        }
    }

    @Override
    public void listAllItems() {
        if (items.isEmpty()) {
            System.out.println("Belum ada item didalam perpustakaan");
        } else {
            for (LibraryItem item : items) {
                item.printDetails();
            }
        }
    }

    @Override
    public void checkOutItem(String itemId) {
        LibraryItem item = searchById(itemId);
        if (item != null) {
            item.checkOut();
        } else {
            System.out.println("Item dengan ID berikut :  " + itemId + ". Tidak dapat ditemukan");
        }
    }

    @Override
    public void returnItem(String itemId) {
        LibraryItem item = searchById(itemId);
        if (item != null) {
            item.returnItem();
        } else {
            System.out.println("Item dengan ID berikut :  " + itemId + ". Belum dikembalikan");
        }
    }

    @Override
    public LibraryItem searchByTitle(String title) {
        for (LibraryItem item : items) {
            if (item.getTitle().equalsIgnoreCase(title)) {
                return item;
            }
        }
        return null;
    }

    private LibraryItem searchById(String itemId) {
        for (LibraryItem item : items) {
            if (item.getItemId().equals(itemId)) {
                return item;
            }
        }
        return null;
    }
}