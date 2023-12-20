import java.util.Scanner;

public class Main {
    /*
    static boolean isPalindrom(int number) // True or False
    {
        //numberın basamak sayı kullanarak tersini elde etmek
        int temp = number, reversedNumber = 0, lastNumber;

        while (temp != 0)
        {
            //son rakam
            lastNumber = temp % 10;
            reversedNumber = (reversedNumber * 10) + lastNumber; //ilk rakam yaptık
            temp /= 10;
        }
        if (number == reversedNumber)
        {
            System.out.println("Palindrom Sayıdır.");
        }
        else
        {
            System.out.println("Palindorm sayı değil.");
        }
        return true;
    }


     */

    /* Recursive Method


    static int f(int n){
        if (n ==1 || n== 2){
            return 1;
        }
        return f(n-1) + f(n-2);
    }
  */
    static int sum(int a,int b){
        int result = a + b;
        System.out.println("Toplam : " + result);
        return result;
    }

    static int sub(int a,int b){
        int result = a - b;
        System.out.println("Çıkarma : " + result);
        return result;
    }

    static int multi(int a,int b){
        int result = a * b;
        System.out.println("Çarpma : " + result);
        return result;
    }

    static int div(int a,int b){
        int result = a / b;
        if (b == 0){
            return 0;
        }
        System.out.println("Bölme : " + result);
        return result;
    }
    static void pow(int a,int b){
        int result = 1;
        for (int i = 1; i <= b; i++){
            result *= a;
        }
        System.out.println("Sonuç : " + result);
    }

    static int mod(int a,int b){
        int result = a % b;
        System.out.println("Kalan : " + result);
        return result;
    }

    static int enviorenment(int a,int b){
        int result = (a + b) * 2;
        System.out.println("Çevre : " + result);
        return result;
    }
     static int area(int a,int b){
        int result = a * b;
        System.out.println("Alan : " + result);
        return result;
    }
    public static void main(String[] args) {

        String menu = " 1-Toplama İşlemi\n" +
                " 2-Çıkarma İşlemi\n" +
                " 3-Çarpma İşlemi\n" +
                " 4-Bölme İşlemi\n" +
                " 5-Üs Alma İşlemi\n" +
                " 6-Mod Alma İşlemi\n" +
                " 7-Çevre Hesaplama İşlemi\n" +
                " 8-Alan Hesaplama İşlemi\n" +
                " 0-Çıkış Yap";

        Scanner input = new Scanner(System.in);

        System.out.println(menu);
        int select;

        while (true){
            System.out.println("İşlem seçiniz : ");
            select = input.nextInt();
            if (select == 0){
                break;
            }
            System.out.print("Birinici sayıyı giriniz : ");
            int a = input.nextInt();
            System.out.print("İkinci sayıyı giriniz : ");
            int b = input.nextInt();
            switch (select){
                case 1:
                    sum(a,b);
                    break;
                case 2:
                    sub(a,b);
                    break;
                case 3:
                    multi(a,b);
                    break;
                case 4:
                    div(a,b);
                    break;
                case 5:
                    pow(a,b);
                    break;
                case 6:
                    mod(a,b);
                    break;
                case 7:
                    enviorenment(a,b);
                    break;
                case 8:
                    area(a,b);
                    break;
                default:
                    System.out.println("Hatalı işlem yaptınız");
            }

        }


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

        /* Manav Kasa


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

        */

        /* Hesap Makinesi
        System.out.println("Bir sayı giriniz");
        double x = input.nextDouble();
        System.out.println("Bir sayı giriniz");
        double y = input.nextDouble();
        System.out.println("İşlem seçiniz");
        char operator = input.next().charAt(0);
        double sonuc;
        switch (operator) {
            case '+':
              sonuc = x + y;
              break;

            case '-':
                sonuc = x - y;
                break;

            case '*':
                sonuc = x * y;
                break;

            case '/':
                sonuc = x / y;
                break;

            default:
                System.out.println("hatalı islem");
                return;
        }
        System.out.println(sonuc);
        */
        /*
        String username,password,newPassword;

        username = input.nextLine();
        password = input.nextLine();

        if (username.equals("alipasa") && password.equals("yildirim")){
            System.out.println("Giriş Başarılı");
        }else {
            System.out.println("Yanlış parola veya şifre girdiniz. Şifrenizi veya parolanızı değiştirmek ister misiniz ? ");

            newPassword = input.nextLine();
            if (newPassword.equals(newPassword)) {
                System.out.println("eski şifreniz yenisi ile aynı olamaz");
            }else {
                System.out.println("Şifreniz başarı ile oluşturuldu");
                newPassword = password;
            }
        }
        */

        /* Ortalama Hesaplama
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
        double ortalama = toplam / 4;

        System.out.println(ortalama);

        if (ortalama >= 55 ) {
            System.out.println("Tebrikler sınıfı geçtiniz");
        }else {
            System.out.println("Seneye görüşmek üzere");
        }

         */

        /* Etkinlik Önerisi
        int heat;

        System.out.print("Sıcaklığı giriniz : ");
        heat = input.nextInt();
            if (heat < 5) {
                System.out.println("Kayak yapmaya gidebilirsiniz.");
            } else if (heat >= 5 && heat < 25) {
                if (heat <= 15) {
                    System.out.println("Sinemaya gidebilirsiniz.");
                }
                if (heat >= 10 ) {
                    System.out.println("Pikniğe gidebilirsinizç");
                }
            }else {
                System.out.println("Yüzmeye gidebilirsiniz.");
            }

         */

        /* Sıralama


        int a,b,c;
        System.out.print("a sayısını giriniz : ");
        a = input.nextInt();
        System.out.print("b sayısını giriniz : ");
        b = input.nextInt();
        System.out.print("c sayısını giriniz : ");
        c = input.nextInt();

        if ((a > b) && (a > c)) {
            if (b > c ){
                System.out.println("a>b>c");
            }else {
                System.out.println("a > c > b ");
            }
        } else if ((b > a) && (b > c)) {
            if (a>c) {
                System.out.println("b>a>c");
            }else {
                System.out.println("b>c>a");
            }
        } else if ((c > a) && (c > b)) {
            if (b>a) {
                System.out.println("c>b>a");
            }else {
                System.out.println("c>a>b");
            }
        }

         */
        /* Burç Bulma Programı
        String month;
        int day;

        System.out.println("Ay giriniz");
        month = input.nextLine();
        System.out.println("Gün Giriniz");
        day = input.nextInt();

        if (month.length()> 0 ) {
            month = month.substring(0,1).toUpperCase() + month.substring(1);
        }else {
            System.out.println("lütfen bir ay giriniz");
        }

        if ((month.equals("Mart") && day >=21) || (month.equals("Nisan") && day <=20) ) {
            System.out.println("Koç burcu");
        }
       else if ((month.equals("Nisan") && day >=21) || (month.equals("Mayıs") && day <=21) ) {
            System.out.println("Boğa burcu");
        }
        else if ((month.equals("Mayıs") && day >=22) || (month.equals("Haziran") && day <=22) ) {
            System.out.println("İkizler burcu");
        }
        else if ((month.equals("Haziran") && day >=23) || (month.equals("Temmuz") && day <=22) ) {
            System.out.println("Yengeç burcu");
        }
        else if ((month.equals("Temmuz") && day >=23) || (month.equals("Ağustos") && day <=22) ) {
            System.out.println("Aslan burcu");
        }
        else if ((month.equals("Ağustos") && day >=23) || (month.equals("Eylül") && day <=22) ) {
            System.out.println("Başak burcu");
        }
        else if ((month.equals("Eylül") && day >=23) || (month.equals("Ekim") && day <=22) ) {
            System.out.println("Terazi burcu");
        }
        else if ((month.equals("Ekim") && day >=23) || (month.equals("Kasım") && day <=21) ) {
            System.out.println("Akrep burcu");
        }
        else if ((month.equals("Kasım") && day >=22) || (month.equals("Aralık") && day <=21) ) {
            System.out.println("Yay burcu");
        }
        else if ((month.equals("Aralık") && day >=21) || (month.equals("Ocak") && day <=21) ) {
            System.out.println("Oğlak burcu");
        }
        else if ((month.equals("Ocak") && day >=22) || (month.equals("Şubat") && day <=19) ) {
            System.out.println("Kova burcu");
        }
        else if ((month.equals("Şubat") && day >=20) || (month.equals("Mart") && day <=20) ) {
            System.out.println("Balık burcu");
        } else {
            System.out.println("Lütfen formu dikkatli doldurunuz!");
        }

         */

        /* Tek Çift
        int n;
        System.out.print("Lütfen bir sayı giriniz : ");
        n = input.nextInt();

        if ( n % 2 != 0) {
            System.out.println("Weird");
        } else if (n % 2 == 0 && (n >= 2 && n <= 5) ) {
            System.out.println("Not Weird");
        } else if (n % 2 == 0 && (n >= 6 && n <= 20)) {
            System.out.println("Weird");
        }else if (n % 2 == 0 && (n > 20)){
            System.out.println("Not Weird");
        }

         */

         /* Uçak Bileti Fiyatı Hesaplama
        int km,age;
        boolean roundTripTicket;
        double perKmPrice = 0.10;
        System.out.println("Kaç yaşındasınız ? ");
        age = input.nextInt();
        System.out.println("Kaç kilometre yol gideceksiniz?");
        km = input.nextInt();
        System.out.println("Gidiş Dönüş mü ? ");
        roundTripTicket = input.nextBoolean();

        double price = km * perKmPrice;
        double newPrice,discount;
        if (age < 12) {
          discount  = price * 0.50;
          newPrice = price - discount;
            System.out.println("Ödenecek Tutar : " + newPrice);
            if (roundTripTicket) {
                discount = (price * 0.20) + discount;
                newPrice = discount;
                System.out.println("Ödenecek Tutar : " + newPrice * 2);
            }
        } else if (age > 12 && age < 24) {
            discount = price * 0.10;
            newPrice = price - discount;
            System.out.println("Ödenecek Tutar : " + newPrice);
            if (roundTripTicket) {
                discount = (price * 0.20) + discount;
                newPrice = discount;
                System.out.println("Ödenecek Tutar : " + newPrice *2);
            }
        } else if (age > 65) {
            discount = price * 0.30;
            newPrice = price - discount;
            System.out.println("Ödenecek Tutar : " + newPrice);
            if (roundTripTicket) {
                discount = (price * 0.20) + discount;
                newPrice = discount;
                System.out.println("Ödenecek Tutar : " + newPrice *2);
            }
        }

          */

        /* Çin Zodyağı Burcu Hesaplama
            int year;
        System.out.println("Doğum yılınızı giriniz : ");
            year = input.nextInt();
            int burcOrani = year % 12;

             switch (burcOrani) {
                 case 0 :
                     System.out.println("Çin Zodyağı Burcunuz : Maymun");
                     break;
                 case 1 :
                     System.out.println("Çin Zodyağı Burcunuz : Horoz");
                     break;
                 case 2 :
                     System.out.println("Çin Zodyağı Burcunuz : Köpek");
                     break;
                 case 3 :
                     System.out.println("Çin Zodyağı Burcunuz : Domuz");
                     break;
                 case 4 :
                     System.out.println("Çin Zodyağı Burcunuz : Fare");
                     break;
                 case 5 :
                     System.out.println("Çin Zodyağı Burcunuz : Öküz");
                     break;
                 case 6 :
                     System.out.println("Çin Zodyağı Burcunuz : Kaplan");
                     break;
                 case 7 :
                     System.out.println("Çin Zodyağı Burcunuz : Tavşan");
                     break;
                 case 8 :
                     System.out.println("Çin Zodyağı Burcunuz : Ejderha");
                     break;
                 case 9 :
                     System.out.println("Çin Zodyağı Burcunuz : Yılan");
                     break;
                 case 10 :
                     System.out.println("Çin Zodyağı Burcunuz : At");
                     break;
                 case 11 :
                     System.out.println("Çin Zodyağı Burcunuz : Koyun");
                     break;

                 default:
                     System.out.println("Hatalı yaş girdiniz");
                     return;
             }
         */
         /* Artık Yıl Hesaplama
            int year;

            System.out.println("Yıl Giriniz");
            year = input.nextInt();

            if (year % 4 == 0) {
                System.out.println(year + " bir artık yıldır !");
            }else {
                System.out.println(year + " bir artık yıl değildir !");
            }
          */
            /*
            int sayi,i;
            int count = 0;
            int total = 0;
            double average;
            System.out.print("Sayı giriniz : ");
            sayi = input.nextInt();
            for( i = 0; i < sayi; i++){
                if ((i % 3 == 0 && i % 4 == 0) && i !=0){
                    total += i;
                    count++;

                }
            }
            average = total / count;
        System.out.println("Ortalama : " + average);

             */
 /*
        int n;
        int total = 0;

        do {
            System.out.print("Bir sayı giriniz : ");
            n = input.nextInt();
            if (n % 2 == 0 && n % 4 == 0){
                total += n;
            }
        }while (n % 2 == 0);
        System.out.println("Toplam : " + total);

  */

        /*
        int n;

        System.out.print("Bir sayı giriniz : ");
        n = input.nextInt();
            for (int i = 1, j = 1; i <=n && j <= n; i*=4,j*=5 ){
                System.out.println(i +" , "+ j);
            }


         */

        // C(n,r) = n! / (r! * (n-r)!)
            /*
            int n,r;
            int nTotal = 1;
            int rTotal = 1;
            int processTotal = 1;
        System.out.println("Kaç elemanlı küme : ");
            n = input.nextInt();
        System.out.println("Kaç farklı grup : ");
            r = input.nextInt();
            for (int i =1; i<=n;i++){
                nTotal = nTotal * i;
            }
            for (int j = 1; j <= r; j++){
                rTotal = rTotal * j;
            }

            for (int k = 1; k <= n-r;k++){
                processTotal = k * processTotal;
            }

        System.out.println("C(" + n + "," + r +") = " + nTotal / (rTotal * processTotal) );

             */
            /*
        int n,k;
        int total = 1;
        System.out.print("Üssü alıncak sayı : ");
        n = input.nextInt();
        System.out.print("Üs olacak sayı : ");
        k = input.nextInt();
            for (int i = 1; i <=k; i++){
                total *=n;

            }

        System.out.println(total);

             */

        /*
        System.out.print("Sayı Giriniz :");
        int number = input.nextInt();
        int basNumber = 0;
        int tempNumber = number;
        int basValue;
        int result = 0;
        int basPow;

        while (tempNumber != 0) {
            tempNumber /= 10;
            basNumber++;
        }

        tempNumber = number;
        while (tempNumber != 0) {
            basValue = tempNumber % 10;

            basPow = 1;
            for (int i = 1; i <= basNumber; i++) {
                basPow *= basValue;
            }
            result += basPow;
            tempNumber /= 10;
        }

            if (number == result){
                System.out.println("Armstrong Sayı");
            }else {
                System.out.println("Armstrong Sayı Değil");
            }

         */

        /*
            System.out.print("Bir sayı girininiz : ");
            int n = input.nextInt();
            double result = 0;
            for (double i = 1; i <= n; i++){
                result += 1/i;
            }
        System.out.println(result);

        */
        /*
        System.out.print("Basamak sayısı giriniz :");
        int n = input.nextInt();

        for (int i = 1; i<= n; i++){
            for (int k = 1; k<= n-i; k++){
                System.out.print(" ");
            }

            for (int j = 1; j <= i*2-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

         */
        /*
        System.out.println("Elmasın yarı basamak sayısı");
            int n = input.nextInt();

            for (int i = 1; i<= n; i++){
                for (int k = 1; k<= n-i; k++){
                    System.out.print(" ");
                }

                for (int j = 1; j <= i*2-1; j++){
                    System.out.print("*");
                }
                System.out.println();
             }

        for (int i = n-1; i>= 0; i--){
            for (int k = 1; k<= n-i; k++){
                System.out.print(" ");
            }

            for (int j = 1; j <= i*2-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

         */

        /*
            String userName,password;
            int right = 3;
            int balance = 1500;
            int select;

            while(right > 0){
                System.out.print("Kullanıcı Adını Giriniz : ");
                userName = input.nextLine();
                System.out.print("Şifrenizi Giriniz : ");
                password = input.nextLine();

                if (userName.equals("alipasa") && password. equals("1")){
                    System.out.println("Hoş geldiniz");
                    System.out.println("1-Para Yatır\n" + "2-Para Çek\n" + "3-Bakiye Sorgula\n" + "4-Çıkış Yap");
                    System.out.print("Yapmak İstediğiniz İşlemi Seçiniz : ");
                    select = input.nextInt();

                    if (select == 1){
                        System.out.println("Yatırmak İstediğiniz Tutarı giriniz");
                        int price = input.nextInt();
                        balance += price;
                        break;
                    } else if (select == 2 ) {
                        System.out.println("Çekmek İstediğiniz Tutarı giriniz");
                        int price = input.nextInt();
                        balance-= price;
                        break;
                    } else if (select == 3) {
                        System.out.println("Toplam Paranız : " + balance);
                        break;
                    } else if (select == 4) {
                        break;
                    }else {
                        System.out.println("Lütfen geçerli bir rakam giriniz!");
                    }
                }else {
                    System.out.println("Yanlış kullanıcı adı veya şifre.");
                    right--;
                    if (right == 0){
                        System.out.println("3 kere yanlış şifre girdiniz.");
                        System.out.println("Hesabanız bloke oldu. Lütfen bankanız ile iletişime geçiniz.");
                    }
                }
            }

         */

        /*
        System.out.print("Küçük sayıyı giriniz : ");
        int n1 = input.nextInt();
        System.out.print("Büyük Sayıyı Giriniz : ");
        int n2 = input.nextInt();
        int ebob = 1;

        for (int i = 1; i<=n1; i++){
            if (n1 % i == 0 && n2 % i == 0){
                ebob = i;
            }
        }
        //EKOK = (n1*n2) / EBOB
        int ekok = (n1*n2) / ebob;
        System.out.println("EBOB : " + ebob);
        System.out.println( "EKOK :" + ekok);

         */
        /*
        System.out.print("Kaç tane sayı gireceksiniz : ");
        int n = input.nextInt();
        int result = 0;
        System.out.print("1. Sayıyı giriniz : ");
        int n1 = input.nextInt();
        int max = n1;
        int min = n1;

        for (int i = 2; i <= n; i++){
            System.out.print( i + ". Sayıyı giriniz : ");
             n1 = input.nextInt();

             if (n1 >max){
                 max = n1;
             }
             if (n1<min){
                 min = n1;
             }

        }

        System.out.println(max);
        System.out.println(min);,

         */

            /*
        int n;
        int total = 0;
        System.out.print("Bir sayı giriniz : ");
        n = input.nextInt();

        for (int i = 1; i < n; i++){
            if (n % i == 0 ){
                total += i;
            }

        }

        if (total == n){
            System.out.println(total + " Mükemmel sayıdır");

        }else {
            System.out.println(total + " Mükemmel sayı değildir");

        }

             */
        /*
        System.out.println("Basamak sayısı giriniz : ");
        int n = input.nextInt();

        for (int i = n-1; i>= 0; i--){
            for (int k = 1; k<= n-i; k++){
                System.out.print(" ");
            }

            for (int j = 1; j <= i*2-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

         */

        /*
        int counter = 0;
        for(int i=2;i<=100;i++) {
            int control = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    control = 1;
                    break;
                }
            }

            if (control == 0) {
                System.out.print(i + " ");
                counter++;
            }
        }

         */

        /*
            int n;
            System.out.print("Sayı giriniz : ");
            n = input.nextInt();;

            for (int i = 1; i <=10; i++){
                System.out.println(n + " * " + i + " = " + n * i);
            }

         */
        /*

        System.out.println("Bir Sayı Giriniz :");
        int n = input.nextInt();
        int s1=0,s2=1,sum=0;
        System.out.print(s1+" "+s2);
        for(int i=1;i<=n;i++)
        {
            sum=s1+s2;
            System.out.print(" "+sum);
            s1=s2;
            s2=sum;
        }

         */

        /*
        System.out.print("Bir sayı giriniz: ");
        int num = input.nextInt();
        System.out.println("-------------------");
        isPalindrom(num);


         */

        /*Recursive Method
        System.out.println(f(6));
         */
    }
}
