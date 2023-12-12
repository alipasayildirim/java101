import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        /* Not Ortalamsı Hesaplama

        int mat,fizik,kimya,turkce;

        System.out.println("Matematik notunuzu giriniz.");
         mat = input.nextInt();

        System.out.println("Fİzik notunuzu giriniz.");
        fizik = input.nextInt();

        System.out.println("Kimya notunuzu giriniz.");
        kimya = input.nextInt();

        System.out.println("Türkçe notunuzu giriniz.");
        turkce = input.nextInt();

        int toplam  = mat + fizik + kimya + turkce;
        double sonuc = toplam / 4;
        System.out.println(sonuc);

    */

/* KDV Hesaplama


        double price;
        double kdv = 1.18;
        double kdv2 = 1.08;
        double toplam;
        System.out.println("Ürünün Fiyatını giriniz");
        price = input.nextDouble();

        if (price == 0 || price <= 1000 ) {
            toplam = price * kdv;
            System.out.println("Toplam Fiyat : " + toplam);
        } else if (price > 1000) {
            toplam = price * kdv2;
            System.out.println("Toplam Fiyat : " + toplam);
        }else {
            System.out.println("Lütfen girdiğiniz değeri kontrol ediniz.");
        }


*/
        double start = 10;
        double perKm = 2.20;
        double minPrice = 20;
        double km;
        double totalPrice;

        System.out.println("Kaç kilometre yol aldınız?");
        km = input.nextDouble();

        totalPrice = km * perKm;
        totalPrice += start;
        totalPrice = totalPrice >= minPrice ?  start + (km * perKm) :  minPrice;

        System.out.println("Taksimetre : " + totalPrice);








    }
}