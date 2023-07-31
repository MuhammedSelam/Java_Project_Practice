package day1;

import java.util.Scanner;

public class P03_metinSifreleme {

    public static void main(String[] args) {

        // Kullanici tarafindan girilen metni "Sezar Sifreleme Yontemi" ne gore sifreleyiniz

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen sifrelenecek metni giriniz:");
        String metin = scan.nextLine().toUpperCase();

        System.out.println("Lutfen kaydirma miktarini giriniz:");
        int kaydirma = scan.nextInt();

        metinSifrele(metin, kaydirma);

    }

    public static void metinSifrele(String metin, int kaydirma) {

        String sifrelenmisMetin = "";

        String alfabe = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        for (int i = 0; i < metin.length(); i++) {

            char karater = metin.charAt(i);

            int karakterIndex = alfabe.indexOf(karater);

            int yeniIndex = (karakterIndex + kaydirma) % alfabe.length();

            sifrelenmisMetin += alfabe.charAt(yeniIndex);

        }

        System.out.println("Şifrelenmiş metin: " + sifrelenmisMetin);

    }

}
