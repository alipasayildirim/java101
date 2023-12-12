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

        /* Taksimetre Programla

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

*/

        /*Dairenin Alanını ve Çevresini Hesaplayan Program

        double yariCap;
        double pi = 3.14;

        System.out.println("Lütfen dairenib yarı çapını giriniz :");
        yariCap = input.nextDouble();
        double daireCevre = 2 * pi * yariCap;
        double daireAlan =  pi * (yariCap * yariCap);

        System.out.println("Dairenin Çevresi : " + daireCevre);
        System.out.println("Dairenin Alanı  : " + daireAlan);

*/

        /* Vücut Kitle İndeksi Hesaplama

        double kg,boy,vucutKitleIndeksi;

        System.out.print("Lütfen kilonuzu giriniz : ");
        kg = input.nextDouble();
        System.out.print("Lütfen boyunuzu giriniz : ");
        boy = input.nextDouble();

        vucutKitleIndeksi = kg / (boy * boy);

        System.out.println( "Vücut Kitle İndeksi :" + vucutKitleIndeksi);


         */

        double armut = 2.14;
        double elma = 3.67;
        double domates = 1.11;
        double muz =  0.95;
        double patlican = 5.00;
        double armutKg,elmaKg,domatesKg,muzKg,patlicanKg , totalPrice;

        System.out.print("Kaç kilo armut aldınız? : ");
        armutKg  = input.nextDouble();
        System.out.print("Kaç kilo elma aldınız? : ");
        elmaKg  = input.nextDouble();
        System.out.print("Kaç kilo domates aldınız? : ");
        domatesKg  = input.nextDouble();
        System.out.print("Kaç kilo muz aldınız? : ");
        muzKg  = input.nextDouble();
        System.out.print("Kaç kilo patlıcan aldınız? : ");
        patlicanKg  = input.nextDouble();

        armutKg *= armut;
        elmaKg *= elma;
        domatesKg *= domates;
        muzKg *= muz;
        patlicanKg *= patlican;

        totalPrice = armutKg + elmaKg + domatesKg + muzKg + patlicanKg;
        System.out.println("Toplam fiyat : " + totalPrice);


    }
}