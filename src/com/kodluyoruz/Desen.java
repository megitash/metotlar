package com.kodluyoruz;

import java.util.Scanner;

public class Desen {

    static void printNum(int num, int originalNum, boolean isReduce) {
        System.out.print(num + " ");

        if (num > 0 && isReduce == true) {
            printNum(num - 5, originalNum, true);
        } else if (num < originalNum) {
            printNum(num + 5, originalNum, false);
        }
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("sayi giriniz : ");
        int a = input.nextInt();

        printNum(a, a, true);
    }
}

