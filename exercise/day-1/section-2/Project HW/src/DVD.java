public class DVD extends LibraryItem{
    String direktur;
    int duration;

    public DVD(String title, String itemId, String direktur, int duration) {
        super(title, itemId);
        this.direktur = direktur;
        this.duration = duration;
    }
    @Override
    public void checkOut() {
        if(!isCheckOut){
            isCheckOut = true;
            System.out.println(title + " yang disutradarai oleh " + direktur + " telah di pinjam");
        }
        else{
            System.out.println(title + " masih dipinjam");
        }
    }

    @Override
    public void returnItem() {
        if (isCheckOut){
            isCheckOut = false;
            System.out.println("DVD dengan judul : " + title + " telah dikembalikan");
        }
        else {
            System.out.println("DVD " + title + " masih ada di perpustakaan");
        }
    }

    @Override
    public void printDetails() {
        System.out.println("DVD: " + title + "\n by " + direktur + "\n Duration: " + duration +
                "\n ID: " + itemId +
                "\n Checked out: " + isCheckOut);
    }
}
