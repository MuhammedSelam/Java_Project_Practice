package day1;

import java.util.Arrays;
import java.util.Scanner;

public class P05_mountaninArrayKontrol {

    public static void main(String[] args) {

        // MOUNTAIN ARRAY: Verilen herhangi bir arrayin Mountanin Array olup olmadigini kontrol ediniz.
        // Mountain array ==> [0,2,5,3,1]

            Scanner scanner = new Scanner(System.in);

            System.out.print("Mountain array kontrolu yapilacak degerlerin arasina virgul koyarak giriniz: ");
            String degerler = scanner.next();
            String[] degerlerArr = degerler.split(",");

            int[] degerlerSayiArr = new int[degerlerArr.length];

            for (int i = 0; i < degerlerArr.length; i++) {
                degerlerSayiArr[i] = Integer.parseInt(degerlerArr[i]);
            }

            control (degerlerSayiArr);

    }

        private static void control(int[] degerlerSayiArr) {

            int enBuyuk = 0, enBuyukIndex = 0;

            boolean flag = false;

            for (int i = 0; i < degerlerSayiArr.length; i++) {
                if (enBuyuk < degerlerSayiArr[i]) {
                    enBuyuk = degerlerSayiArr[i];
                    enBuyukIndex = i;
                }
            }

            for (int i = 0; i < enBuyukIndex; i++) {
                if (degerlerSayiArr[i] < degerlerSayiArr[i + 1]){
                    flag = true;
                } else {
                    flag = false;
                    break;
                }
            }

            for (int i = enBuyukIndex; i < degerlerSayiArr.length; i++) {
                if (i != degerlerSayiArr.length - 1){
                    if (degerlerSayiArr[i] > degerlerSayiArr[i + 1]){
                        flag = true;
                    } else {
                        flag = false;
                        break;
                    }
                }
            }

            if (flag){
                System.out.println(Arrays.toString(degerlerSayiArr) + " arrayi mountain arraydir");
            } else {
                System.out.println(Arrays.toString(degerlerSayiArr) + " arrayi mountain array degildir");
            }

        }
}

