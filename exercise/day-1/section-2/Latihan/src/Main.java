public class Main {
    public static void main(String[] args) {
        Sepeda bmx = new Sepeda();
        Sepeda road = new Sepeda();
        System.out.println("Model : " + bmx.model + "\n" + "Year : " + bmx.year);
        System.out.println("Model : " + road.model + "\n" + "Year : " +road.year + "\n");

        Motor honda = new Motor("Beat", 2019);
        Motor yamaha = new Motor("Fazzio", 2019);
        System.out.println("Model : " + honda.model + "\n" + "Year : " + honda.year);
        System.out.println("Model : " + yamaha.model + "\n" + "Year : " + yamaha.year);

    }
}

