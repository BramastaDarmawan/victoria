abstract class LibraryItem {
    protected String title;
    protected String  itemId;
    boolean isCheckOut;
    public LibraryItem(String title, String itemId){
        this.title = title;
        this.itemId = itemId;
        this.isCheckOut = false;
    }
    public abstract void checkOut();
    public abstract void returnItem();
    public abstract void printDetails();

    public String getTitle() {
        return title;
    }

    public String getItemId() {
        return itemId;
    }

    public boolean isCheckOut() {
        return isCheckOut;
    }
}
