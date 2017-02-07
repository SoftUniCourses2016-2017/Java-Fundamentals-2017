package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        String firstWord = scanner.next();
        String secondWord = scanner.next();

        int numInt1 = scanner.nextInt();
        int numInt2 = scanner.nextInt();
        int numInt3 = scanner.nextInt();

        String thirdWord = scanner.next();

        int sum = numInt1 + numInt2 + numInt3;

        System.out.println(firstWord + " " + secondWord + " " + thirdWord + " " + sum);

    }
}
