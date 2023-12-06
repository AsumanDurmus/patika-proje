import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        //Değişkebleri oluşltur
        int mat, fizik, kimya, turkce, tarih, muzik;

        //Scanner sınıfını tanımladık
        Scanner inp = new Scanner(System.in);

        //kullanıcıdan değerleri al
        System.out.print("Matematik notu :");
        mat = inp.nextInt();
        System.out.print("Fizik notu :");
        fizik = inp.nextInt();
        System.out.print("Kimya notu :");
        kimya = inp.nextInt();
        System.out.print("Türkçe notu :");
        turkce = inp.nextInt();
        System.out.print("Tarih notu :");
        tarih = inp.nextInt();
        System.out.print("Müzik notu :");
        muzik = inp.nextInt();

        int toplam = ( mat + fizik + kimya + turkce + tarih + muzik) ;
        double sonuc = toplam / 6.0 ;
        System.out.println("Ortalamanız : " + sonuc);
        String ortalama = (sonuc >= 60) ? "Geçtiniz" : "Kaldınız";
        System.out.println(ortalama);
    }
}