package day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P01_binaryDegereCevirme {

    // Girilen desimal değeri binary değere çeviren metodu oluşturunuz.
    // Örnek: 12 = 1 1 0 0

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("lutfen desimal deger giriniz:");
        int desimal = scanner.nextInt();

        System.out.println(desimal + " Desimal sayinin binary degeri: \n" + binaryDegereCevir(desimal));

    }
    public static List<Integer> binaryDegereCevir (int desimal){

        List<Integer> binary = new ArrayList<>();

        while (desimal > 0){
            binary.add(desimal % 2);
            desimal /= 2;
        }

        List<Integer> tersBinary = new ArrayList<>();

        for (int i = binary.size()-1; i >= 0 ; i--) {
            tersBinary.add(binary.get(i));

        }
        return tersBinary;
    }
}
