import java.lang.Math.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello World!");

//        int umur;
//        long panjang_kaki;
//        double jarak;
//        float tinggi;
//        char huruf_Depan;
//        boolean alasan;
//        umur = 23;
//        panjang_kaki = 23;
//        tinggi = 175.5f;
//        jarak = 10.5;
//        huruf_Depan = 'B';
//        alasan = true;
//        System.out.println(umur);
//        System.out.println(panjang_kaki);
//        System.out.println(tinggi);
//        System.out.println(jarak);
//        System.out.println(huruf_Depan);
//        System.out.println(alasan);

//        final double phi = 3.14;
//        double jari, luas;
//        jari = 10;
//        luas = phi * jari * jari;
//        System.out.println(luas);
//
//        jari = 15;
//        luas = phi * jari * jari;
//        System.out.println(luas);
//        double jari;
//        jari = 10;
//        System.out.println(Math.PI * Math.pow(10,2));

//        for (int i = 1; i <= 20; i++){
//            if (i%2 == 0){
//                System.out.println(i + " adalah genap");
//            }
//            else{
//                System.out.println(i + " adalah ganjil");
//            }
//        }

//

//        int[] number = {10, 75, 76, 47};
//        for (int i = 0; i <= 3; i++){
//            if(number[i]%2 == 0 && number[i] > 50){
//                System.out.println(number[i] + " adalah angka genap yang lebih besar dari 50");
//            }
//            else if (number[i]%2 == 0 && number[i] < 50){
//                    System.out.println(number[i] + " adalah angka genap yang lebih kecil dari 50");
//                }
//            else if (number[i]%2 == 1 && number[i] > 50){
//                    System.out.println(number[i] + " adalah angka ganjil yang lebih besar dari 50");
//                }
//            else{
//                    System.out.println(number[i] + " adalah angka ganjil yang lebih kecil dari 50");
//                }
//            }

//      int day = 1;
//      String dayName;
//      while (day <= 5){
//          switch (day){
//              case 1 : dayName = "Sunday"; break;
//              case 2 : dayName = "Monday"; break;
//              case 3 : dayName = "Tuesday"; break;
//              default: dayName = "Invalid Day"; break;
//          }
//          if( day <=3){
//              System.out.println("Today is " + dayName);
//          }
//          else{
//              System.out.println(dayName);
//          }
//          day++;
//      }

//        int[] number = {10, 75, 76, 47};
//        String keterangan;
//        for(int i : number){
//            int hasil_mod;
//            hasil_mod = i%2;
//            switch (hasil_mod){
//                case 0: keterangan = " adalah angka genap"; break;
//                default: keterangan = " adalah angka ganjil"; break;
//            }
//            System.out.println(i + keterangan);
//        }

//        int[] number = {10, 75, 76, 47};
//        String keterangan, ket;
//        for(int i : number){
//            int hasil_mod;
//            int kurang_lebih = (i>50) ? 1:0;
//            hasil_mod = i%2;
//            switch (hasil_mod){
//                case 0: keterangan = " adalah angka genap"; break;
//                default: keterangan = " adalah angka ganjil"; break;
//            }
//            switch (kurang_lebih){
//                case 0: ket = " dan angka kurang dari 50"; break;
//                default: ket = " dan angka lebih dari 50"; break;
//            }
//            System.out.println(i + keterangan + ket);
//        }

        for (int i = 1; i <= 50; i++){
            if (i%2 == 0){
                System.out.println("Genap");
            }
            else{
                System.out.println(i);
            }

        }
    }
}