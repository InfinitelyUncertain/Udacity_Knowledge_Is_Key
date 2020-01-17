package com.hyperskill;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

	    String alphabet = "abcdefghijklmnopqrstuvwxyz";

	    String operation = scanner.nextLine(); //"enc" for encrypt or "dec" for decrypt"
	    String text = scanner.nextLine();
	    int key = scanner.nextInt();

	    switch (operation){
            case "enc":
                encrypt(text, key, alphabet);
                break;
        }

    }
    public static void encrypt(String text, int key, String alphabet){
        String encryptedString = "";

        for(char ch : text.toCharArray()){
            int charIndex = alphabet.indexOf(ch);
            if(!alphabet.contains(ch + "")){
                encryptedString += ch;
                continue;
            }
            if(charIndex + key >= 26){
                encryptedString = encryptedString + String.valueOf(alphabet.charAt(charIndex + key - 26));
            } else {
                encryptedString = encryptedString + String.valueOf(alphabet.charAt(charIndex + key));
            }
        }

        System.out.println(encryptedString);
    }
}
