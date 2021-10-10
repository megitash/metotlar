package com.kodluyoruz;

import java.util.Scanner;

public class AsalSayi {
    static int asal(int a, int b) {
        int result = 1;
        for (int i = 1; i <= a; i++)
            result = a % b;
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("bir sayi giriniz : ");
            int a = input.nextInt();
            if (a == 2) {
                System.out.println(a + " sayisi ASALDIR!");
            }else {
                if (a % 2 == 0) {
                    System.out.println(a + " sayisi ASAL degildir");
                } else if (a % 3 == 0) {
                    System.out.println(a + " sayisi ASAL degildir");
                } else {
                    System.out.println(a + " sayisi ASALDIR!");
                }
            }

        }
    }
}