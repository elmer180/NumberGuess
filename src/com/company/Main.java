package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    Random random = new Random();
    int attempt =(1);
    int guess = (0);
    int ran = (random.nextInt(100)+1);
    while(guess =! ran){
        System.out.println("Pick a number between 1-100");
        int guess = input.nextInt();
        if (guess == ran){
            System.out.println("Spot on you took"+attempt+"attempts");
            }
        else
            attempt =(attempt+1);
            //if
        }}}
