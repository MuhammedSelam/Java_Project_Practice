package day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P01 {

    // Girilen desimal değeri binary değere çeviren metodu oluşturunuz.
    // Örnek: 12 = 1 1 0 0

    public static void main(String[] args) {

        System.out.println("lutfen desimal deger giriniz");
        Scanner scanner = new Scanner(System.in);
        int sayi = scanner.nextInt();

        System.out.println(sayi + " Desimal sayinin binary degeri: " + binaryConver(sayi));

    }
    public static List<Integer> binaryConver (int sayi){

        List<Integer> binary = new ArrayList<>();

        while (sayi > 0){
            binary.add(sayi % 2);
            sayi /= 2;
        }

        List<Integer> tersBinary = new ArrayList<>();

        for (int i = binary.size()-1; i >= 0 ; i--) {
            tersBinary.add(binary.get(i));

        }
        return tersBinary;
    }
}
