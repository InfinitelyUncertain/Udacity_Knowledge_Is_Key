package com.hyperskill;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Three arguments are used: -mode, -key, and -data.  Each are followed by their respective data.

        String operation = "enc";
        int key = 0;
        String data = "";

        for(int i = 0; i < args.length; i++){
            if(args[i].equals("-mode")){
                operation = args[i + 1];
            } else if (args[i].equals("-key")){
                key = Integer.parseInt(args[i + 1]);
            } else if (args[i].equals("-data")){
                data = args[i + 1];
            }
        }

	    switch (operation){
            case "enc":
                encrypt(data, key);
                break;
            case "dec":
                decrypt(data, key);
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
