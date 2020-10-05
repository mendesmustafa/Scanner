package scanner.find.number;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by mendesmustafa on 02.10.2020.
 */
public class Run {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı giriniz:");
        int sayi = scanner.nextInt();
        System.out.println("Girdiğiniz sayi: " + sayi);

        Random random = new Random();

        int rnd = random.nextInt(100);

        while (sayi != rnd) {

            if (sayi < 0 || sayi > 100) {
                System.out.println("0 ile 100 arasında bir sayı giriniz:");
                sayi = scanner.nextInt();
            } else if (sayi > rnd) {
                System.out.println("Daha küçük bir sayı giriniz:");
                sayi = scanner.nextInt();
            } else {
                System.out.println("Daha büyük bir sayi giriniz:");
                sayi = scanner.nextInt();
            }
        }
        System.out.println("Tebrikler doğru bildiniz...");
    }
}
