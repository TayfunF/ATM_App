package atm_app;

import java.util.Scanner;

public class ATM_App {

    public static void main(String[] args) throws InterruptedException {
        Scanner klavye = new Scanner(System.in);
        int bakiye = 1000;
        String islemler = "1.İşlem  : Bakiye Sorgulama\n"
                        + "2.İşlem  : Para yatırma\n"
                        + "3.İşlem  : Para Çekme\n"
                        + "4.İşlem  : Çıkış yapma";
        System.out.println("*******************************");
        System.out.println(islemler);
        System.out.println("*******************************");
           
        while(true){
            String girilen = klavye.nextLine(); 
            if(girilen.equals("q")){
                System.out.println("Çıkış yapılıyor lütfen bekleyin ! ...");
                Thread.sleep(2000);
                System.out.println("Çıkış yapıldı ... ");
                break;
            }
            else if(girilen.equals("1")){
                System.out.println("Mevcut bakiyeniz : "+bakiye);
            }
            else if(girilen.equals("2")){
                System.out.print("Yatırmak istediğiniz tutarı giriniz : ");
                int tutar=klavye.nextInt();
                klavye.nextLine();
                bakiye=bakiye+tutar;
                System.out.println("Yeni bakiye : "+bakiye);
            }
            else if(girilen.equals("3")){
                System.out.println("Çekmek istediğiniz tutarı giriniz : ");
                int tutar=klavye.nextInt();
                klavye.nextLine();
                if(bakiye-tutar<0){
                    System.out.println("Yetersiz Bakiye ! ...");
                }
                else{
                    bakiye=bakiye-tutar;
                    System.out.println("Kalan bakiye : "+bakiye);
                }
            }
            else{
                System.out.println("Geçersiz işlem");
            }
        }
    }

}
