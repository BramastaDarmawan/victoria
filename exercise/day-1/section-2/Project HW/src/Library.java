interface Library {
    void addItem(LibraryItem item);

    void removeItem(String itemId);

    void listAllItems();

    void checkOutItem(String itemId);

    void returnItem(String itemId);

    LibraryItem searchByTitle(String title);
}