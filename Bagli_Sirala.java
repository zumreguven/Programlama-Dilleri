package bagli_sirala;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Bagli_Sirala {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dosya adını girin: ");
        String dosyaAdi = scanner.nextLine();
        int sayino=0;
        int []sayilar;
        String satir;
        try (BufferedReader fileReader = new BufferedReader(new FileReader(dosyaAdi))) {
            while ((satir = fileReader.readLine()) != null) {
                sayino++;
            }
       }catch (IOException e) {
            System.out.println("Dosya okuma hatası: " + e.getMessage());
            return; // Hata durumunda programı sonlandır
        }
	try (BufferedReader fileReader = new BufferedReader(new FileReader(dosyaAdi))) {
            
            int index = 0; // Dizi indeksi
            sayilar=new int[sayino];
            while ((satir = fileReader.readLine()) != null) {
                int sayi = Integer.parseInt(satir); // Satırdan sayıyı al
                sayilar[index] = sayi; // Diziye sayıyı ekle
                index++; // İndeksi artır
            }
        } catch (IOException e) {
            System.out.println("Dosya okuma hatası: " + e.getMessage());
            return; // Hata durumunda programı sonlandır
        }

        // Her sayıyı indeksiyle birlikte yazdırma
        
        System.out.println("**************");
        //diziyi sıralama sıralanan dizinin adı artık dizi sıralanmamış dizinin adı ise sayılar
        int dizi[]=new int[sayilar.length];
        int j=0;
        for(int i=0;i<dizi.length;i++){
            dizi[j]=sayilar[i];
            j++;
        }

        int i;
        int gecici;
        for ( i = 0; i < dizi.length - 1; i++) {
            for ( j = 0; j < dizi.length - 1 - i; j++) {
                if (dizi[j] > dizi[j + 1]) {
                    int temp = dizi[j];
                    dizi[j] = dizi[j + 1];
                    dizi[j + 1] = temp;
                }
            }
        }
    
        for (i = 0; i < sayilar.length; i++) {
            // sayilar dizisindeki elemanı ve indeksini yazdırın
            System.out.print(sayilar[i] + "  ");
            System.out.print(i + "           ");
            System.out.print(sayilar[i] + "  ");
            int konum = -1;
            for (j = 0; j < dizi.length; j++) {
                if (dizi[j] == sayilar[i]) {
                    konum = j;
                }
            }
            if (konum != -1 && konum < dizi.length - 1) {
                int yeni = dizi[konum + 1];
                for (int k = 0; k < sayilar.length; k++) {
                    if (sayilar[k] == yeni) {
                        System.out.println(k);
                    }
                }
            }
            else{
                System.out.println("-1");
            }
        }
    }
}


				



