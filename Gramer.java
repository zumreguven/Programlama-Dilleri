/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gramer;

import java.util.Scanner;

/**
 *
 * @author zumre
 */
public class Gramer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("cumle giriniz");
        String cumle=scan.nextLine();
        cumle=cumle.trim();
        cumle=cumle.toLowerCase();
        String [] kelimeler=cumle.split("\\s+");
        if(ozneKontrol(cumle,kelimeler)&&nesneKontrol(cumle,kelimeler)&&yuklemKontrol(cumle,kelimeler)&&kelimeler.length==3){
            System.out.println("EVET");
        }
        else{
            System.out.println("HAYIR");
        }
    }
    
    public static boolean ozneKontrol(String cumle,String [] kelimeler){
         String[] ozne = {"ben", "sen", "hasan", "nurşah", "elif", "abdulrezzak", "şehribanu", "zeynelabidin", "naki"};
         for(int i=0;i<ozne.length;i++){
             if(kelimeler[0].equals(ozne[i])){
                 return true;
            }
        }
        return false;
    }
    
    public static boolean nesneKontrol(String cumle,String [] kelimeler){
          String[] nesne = {"bahçe", "okul", "park", "sınıf", "yarın", "pazartesi", "salı", "çarşamba", "perşembe", "cuma", "cumartesi", "pazar", "merkez", "ev", "kitap", "defter", "güneş", "beydağı"};
         for(int i=0;i<nesne.length;i++){
             if(kelimeler[1].equals(nesne[i])){
                 return true;
            }
        }
        return false;
    }
    
    public static boolean yuklemKontrol(String cumle,String [] kelimeler){
         String[] yuklem = {"gitmek", "gelmek", "okumak", "yazmak", "yürümek", "görmek"};
         for(int i=0;i<yuklem.length;i++){
             if(kelimeler[2].equals(yuklem[i])){
                 return true;
            }
        }
        return false;
    }
}

