import java.util.Scanner;
public class kullanıcıGirisi {

    public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
       String kulAdi="Patika";
       String sifre="java123";
        System.out.println("Kullanici adinizi giriniz: ");
        String kulAdi2=scn.next();
        System.out.println("Şifrenizi giriniz: ");
        String sifre2=scn.next();

        if(sifre.equals(sifre2)&&kulAdi.equals(kulAdi))
            System.out.println("Giriş Yaptınız!");
        else{
            System.out.println("Hatalı kullenıcı adı veya şifre!");
            System.out.println("Şifreyi değiştirmek için 2, bitirmek için 1.");
            int k=scn.nextInt();
            switch(k){
                case 1:
                    System.out.println("Çıkılıyor...");
                    break;
                case 2:
                    System.out.println("Yeni şifreyi giriniz:");
                    sifre2 =scn.next();
                    if(sifre.equals(sifre2))
                        System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                    else
                        System.out.println("Şifre oluşturuldu");
            }
    }
    }
}
