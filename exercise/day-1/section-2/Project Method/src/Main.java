public class Main {
    public static void main(String[] args) {
            int a, b;
            a = 5;
            b = 5;
            Calculator kalku = new Calculator(a,b);
        System.out.println(kalku.add());
        System.out.println(kalku.subtract());
        System.out.println(kalku.multiply());
        System.out.println(kalku.devide());
        }
    }