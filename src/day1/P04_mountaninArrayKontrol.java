package day1;

import java.util.Arrays;
import java.util.Scanner;

public class P04_mountaninArrayKontrol {

    public static void main(String[] args) {

        // MOUNTAIN ARRAY: Verilen herhangi bir arrayin Mountanin Array olup olmadığını kontrol ediniz.
        // Mountain array ==> [0,2,5,3,1]


            Scanner scanner = new Scanner(System.in);

            System.out.println("Lutfen mountain array kontrolu yapilacak degerlerin arasina virgul koyarak giriniz");
            String degerler = scanner.next();
            String[] degerlerArr = degerler.split(",");

            mountainArrControl(degerlerArr);

    }

        private static void mountainArrControl(String[] degerlerArr) {

            int enBuyukDeger = 0;
            int enBuyukDegerIndex = 0;

            boolean control = false;

            for (int i = 0; i < degerlerArr.length; i++) {
                if (enBuyukDeger < Integer.parseInt(degerlerArr[i])) {
                    enBuyukDeger = Integer.parseInt(degerlerArr[i]);
                    enBuyukDegerIndex = i;
                }
            }

            for (int i = 0; i < enBuyukDegerIndex; i++) {
                if (i != enBuyukDegerIndex) {
                    if (Integer.parseInt(degerlerArr[i]) < Integer.parseInt(degerlerArr[i + 1])) {
                        control = true;
                    } else {
                        control = false;
                        break;
                    }
                }
            }

            for (int i = enBuyukDegerIndex; i < degerlerArr.length; i++) {
                if (i != degerlerArr.length - 1) {
                    if (Integer.parseInt(degerlerArr[i]) > Integer.parseInt(degerlerArr[i + 1])) {
                        control = true;
                    } else {
                        control = false;
                        break;
                    }
                }
            }

            if (control) {
                System.out.println(Arrays.toString(degerlerArr) + " arrayi mountain arraydir.");
            } else {
                System.out.println(Arrays.toString(degerlerArr) + " arrayi mountain array değildir.");

            }
        }
}
