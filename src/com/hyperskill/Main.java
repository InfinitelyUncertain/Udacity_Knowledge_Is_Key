package com.hyperskill;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

	    String operation = scanner.nextLine(); //"enc" for encrypt or "dec" for decrypt"
	    String text = scanner.nextLine();
	    int key = scanner.nextInt();

	    switch (operation){
            case "enc":
                encrypt(text, key);
                break;
            case "dec":
                decrypt(text, key);
                break;
        }

    }
    public static void encrypt(String text, int key){
        String encryptedString = "";

        char[] textCharArray = text.toCharArray();

        for(char ch : textCharArray){
            encryptedString += (char) (ch + key);
        }

        System.out.println(encryptedString);
    }

    public static void decrypt(String text, int key){
        String decryptedString = "";

        char[] textCharArray = text.toCharArray();

        for(char ch : textCharArray){
            decryptedString += (char) (ch - key);
        }

        System.out.println(decryptedString);
    }
}
