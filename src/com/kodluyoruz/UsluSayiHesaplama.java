package com.kodluyoruz;

import java.util.Scanner;

public class UsluSayiHesaplama {
    static int power(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++)
            result *= a;
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
        System.out.print("Taban degeri giriniz : ");
        int a = input.nextInt();
        System.out.print("Us degeri giriniz : ");
        int b = input.nextInt();

            if (b == 0) {
                System.out.println("Sonuc : " + 1);
            } else {
                System.out.println("Sonuc " + power(a, b));
            }

        }

    }

}

