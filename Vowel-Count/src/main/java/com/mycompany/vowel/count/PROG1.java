/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vowel.count;

/**
 *
 * @author Admin
 */
import java.util.Scanner;

public class VowelCount {
    public static int countVowels(String sentence) {
        int vowelCount = 0;
        sentence = sentence.toLowerCase();

        for (int i = 0; i < sentence.length(); i++) {
            char currentChar = sentence.charAt(i);
            if (isVowel(currentChar)) {
                vowelCount++;
            }
        }

        return vowelCount;
    }

    private static boolean isVowel(char ch) {
        return "aeiou".indexOf(ch) != -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        int vowelCount = countVowels(sentence);
        System.out.println("Number of vowels: " + vowelCount);
    }
}
