package Temp;

import java.util.Scanner;

public class Conversion {
    public static void main(String[] args) {
        OcatalToDecial();
    }

    public static void binaryToDecial() {
        long result = 0;
        int conversion = 1;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter binary no : " );
            String binary = sc.next();
            for (int i = binary.length()-1; i >= 0; i--) {
                if (binary.charAt(i) == '1') {
                    result += conversion;
                }
                conversion *= 2;
            }
            System.out.println("The Decimal value of " + binary +" this binary is " + result);
        }
    }

    public static void OcatalToDecial() {
        long result = 0;
        int conversion = 1;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter ocatal no : " );
            String binary = sc.next();
            for (int i = binary.length()-1; i >= 0; i--) {
                if (binary.charAt(i) >= '1' && binary.charAt(i) <= '9') {
                    result += conversion * (binary.charAt(i)-'0');
                }
                conversion *= 8;
            }
            System.out.println("The Decimal value of " + binary +" this ocatal is " + result);
        }
    }
}
