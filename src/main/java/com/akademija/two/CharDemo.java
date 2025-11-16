package com.akademija.two;

public class CharDemo {
    public static void main(String[] args) {
        char charVar = 'K';
        System.out.println(charVar);
        char anotherCharVar = '?';
        System.out.println(anotherCharVar);
        //Step1: 65 je int 32 bit
        //Step2: 65 to char - automatic conversion po ASCII A
        //Step3: A ubaci u thirdChar
        char thirdChar = 65;
        System.out.println(thirdChar);

        //Step1: thirdChar 'A';
        //Step2: 'A' u int -> automatic 65
        //Step3: 65
        int number = thirdChar;
        System.out.println(number);
    }
}
