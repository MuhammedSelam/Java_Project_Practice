package day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class P02_binaryDegereCevirme_kolayUsulu {

    public static void main(String[] args) {

        // Girilen desimal değeri binary değere çeviren metodu oluşturunuz.
        // Ornek: 12 = 1 1 0 0

        Scanner scan=new Scanner(System.in);

        System.out.print("Lutfen desimal deger giriniz: ");
        int sayi=scan.nextInt();

        System.out.println(sayi + " desimal sayisinin binary karsiligi: "+ binaryDegereCevir(sayi));

    }

    public static List<Integer> binaryDegereCevir(int sayi) {

        List<Integer> binary = new ArrayList<>();

        while (sayi > 0) {
            binary.add(sayi % 2);
            sayi /= 2;
        }

        Collections.reverse(binary); // terse cevirme methodu
        return binary;

    }
}
