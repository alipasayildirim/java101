import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

<<<<<<< HEAD
        int mat,fizik,kimya,turkce;

        Scanner input = new Scanner(System.in);

=======
        Scanner input = new Scanner(System.in);

        /* Not Ortalamsı Hesaplama

        int mat,fizik,kimya,turkce;

>>>>>>> 4395972 (Update)
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
<<<<<<< HEAD
=======

    */


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



>>>>>>> 4395972 (Update)
    }
}