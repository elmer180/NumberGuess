package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Random random = new Random();
        int attempt = (1);
        int guess = (0);
        int ran = (random.nextInt(100) + 1);
        int hotl = (ran - 10);
        int hoth = (ran + 10);
        int warml = (ran - 20);
        int warmh = (ran + 20);
        while (guess != ran) {
            System.out.println("Pick a number between 1-100");
            guess = input.nextInt();
            if (guess == ran) {
                System.out.println("Spot on you took " + attempt + " attempts");
            } else {
                attempt = (attempt + 1);
                if ((hoth > guess) && (hotl < guess)) {
                    System.out.println("hot");
                } else {
                    if ((warmh > guess) && (warml < guess)) {
                        System.out.println("warm");
                    }

                }
            }
        }
    }
}
