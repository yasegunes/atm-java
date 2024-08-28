import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<musteri> musteriler = new ArrayList<musteri>();

        musteriler.add(new musteri(01,"yase",2589,234));
        musteriler.add(new musteri(02,"aley",8754,69087));
        musteriler.add(new musteri(03,"emre",7290,3490));
        musteriler.add(new musteri(04,"deno",5309,7098));

    System.out.println("Kullanıcı idsini giriniz");
    int id0=sc.nextInt();
    musteri m0 = new musteri();
        for (int i = 0; i < musteriler.size(); i++) {
            m0 = musteriler.get(i);
            if(m0.getId()==id0) {
             break;
            }
        }
    System.out.println("Hoşgeldin " + m0.getAd() + " Lütfen Şifrenizi Giriniz");
        int sifre1=sc.nextInt();

        if(sifre1==m0.getSifre()) {
            System.out.println("Bakiyeniz: " + m0.getBakiye());
            System.out.println("Yapmak istediğiniz işlem nedir? Para çekmek istiyorsanız 0'ı " +
                    "para yatırmak istiyorsanız 1'i tuşlayınız. ");
            int islem1=sc.nextInt();
            int bakiye0 = m0.getBakiye();
            if(islem1==0){
                System.out.println("Çekmek istediğiniz tutarı giriniz");
                int islem2=sc.nextInt();
                if(islem2<=m0.getBakiye()) {
                    m0.setBakiye(bakiye0-islem2);
                    System.out.println("Güncel Bakiyeniz: " + m0.getBakiye());
                }
                else{
                    System.out.println("Yetersiz Bakiye");
                }
            }
            else if(islem1==1){
                System.out.println("Yatırmak istediğiniz tutarı giriniz");
                int islem3=sc.nextInt();
                m0.setBakiye(bakiye0+islem3);
                System.out.println("Güncel Bakiyeniz: " + m0.getBakiye());
            }
            else{
                System.out.println("Hatalı tuşlama");
            }
        }
        else{
            System.out.println("Yanlış şifre girdiniz");
        }



    }
}