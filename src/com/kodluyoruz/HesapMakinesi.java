package com.kodluyoruz;

import java.util.Scanner;

public class HesapMakinesi {

    static int sum(int a, int b) {
        int result = a + b;
        System.out.println("Toplam : " + result);
        return result;
    }

    static int minus(int a, int b) {
        int result = a - b;
        System.out.println("Cikarim : " + result);
        return result;
    }

    static int times(int a, int b) {
        int result = a * b;
        System.out.println("Carpim : " + result);
        return result;
    }

    static int divided(int a, int b) {
        int result = a / b;
        System.out.println("bolme : " + result);
        return result;
    }

    static int power(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++)
            result *= a;
        return result;
    }

    static int fac(int a, int b) {
        int result = 1;
        for (int i = 1; i <= a; i++)
            result *= i;
        return result;
    }

    static int mod(int a, int b) {
        return a % b;
    }

    static void rect(int a, int b) {
        System.out.println("alan : " + a * b);
        System.out.println("cevresi : " + 2 * (a + b));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int select = 0;
        String menu = "\"1- Toplama İşlemi\\n\"\n" +
                "\"2- Çıkarma İşlemi\\n\"\n" +
                "\"3- Çarpma İşlemi\\n\"\n" +
                "\"4- Bölme işlemi\\n\"\n" +
                "\"5- Üslü Sayı Hesaplama\\n\"\n" +
                "\"6- Faktoriyel Hesaplama\\n\"\n" +
                "\"7- Mod Alma\\n\"\n" +
                "\"8- Dikdörtgen Alan ve Çevre Hesabı\\n\"\n" +
                "\"0- Çıkış Yap\";";

        System.out.println(menu);
        while (true) {

            System.out.print("Seciminiz : ");
            select = input.nextInt();

            if (select == 0) {
                break;
            }
            System.out.print("ilk sayiyi giriniz : ");
            int a = input.nextInt();
            System.out.print("Ikinci giriniz : ");
            int b = input.nextInt();

            switch (select) {
                case 1:
                    sum(a, b);
                    break;
                case 2:
                    minus(a, b);
                    break;
                case 3:
                    times(a, b);
                    break;
                case 4:
                    if (b == 0) {
                        System.out.println("bolum sifir olamaz");
                    } else {
                        divided(a, b);
                    }
                    break;
                case 5:
                    System.out.println("Uslu : " + power(a, b));
                    break;
                case 6:
                    System.out.println("Faktoriyel : " + fac(a, b));
                    break;
                case 7:
                    System.out.println("Mod : " + mod(a, b));
                    break;
                case 8:
                    rect(a, b);
                    break;
                default:
                    System.out.println("Gecersiz islem");
            }
        }
        System.out.println("Gule gule");
    }
}

