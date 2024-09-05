public class Book extends LibraryItem{
    String author;
    int pages;

    public Book(String title, String itemId, String author, int pages) {
        super(title, itemId);
        this.pages = pages;
        this.author = author;
    }
    @Override
    public void checkOut() {
        if(!isCheckOut){
            isCheckOut = true;
            System.out.println(title + " yang ditulis oleh " + author + " telah di pinjam");
        }
        else{
            System.out.println(title + " masih dipinjam");
        }
    }

    @Override
    public void returnItem() {
        if (isCheckOut){
            isCheckOut = false;
            System.out.println("Buku dengan judul : " + title + " telah dikembalikan");
        }
        else {
            System.out.println("Buku " + title + " masih ada di perpustakaan");
        }
    }

    @Override
    public void printDetails() {
        System.out.println("Book: " + title + "\n by " + author + "\n Pages: " + pages +
                "\n ID: " + itemId +
                "\n Checked out: " + isCheckOut);
    }
}
