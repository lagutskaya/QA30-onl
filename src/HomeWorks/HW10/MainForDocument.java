package HomeWorks.HW10;

import java.util.Scanner;


public class MainForDocument {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String documentNumber = "1234-abcd-1234-test-12ab";


        printFirstBlocks(documentNumber);
        printMaskedDocumentNumber(documentNumber);
        printLowercaseLetters(documentNumber);
        printUppercaseLetters(documentNumber);

        DocumentValidator.validateDocument(documentNumber);
        scanner.close();
    }

    public static void printFirstBlocks(String documentNumber) {
        String[] blocks = documentNumber.split("-");
        System.out.println(blocks[0] + "-" + blocks[1]);
    }

    public static void printMaskedDocumentNumber(String documentNumber) {
        String maskedNumber = documentNumber.replaceAll("[a-zA-Z]", "*");
        System.out.println(maskedNumber);
    }

    public static void printLowercaseLetters(String documentNumber) {
        String[] blocks = documentNumber.split("-");
        StringBuilder lowercaseLetters = new StringBuilder();
        lowercaseLetters.append(blocks[1].toLowerCase()).append("/")
                .append(blocks[3].toLowerCase()).append("/")
                .append(blocks[4].toLowerCase().charAt(0)).append("/")
                .append(blocks[4].toLowerCase().charAt(1));
        System.out.println(lowercaseLetters);
    }

    public static void printUppercaseLetters(String documentNumber) {
        String[] blocks = documentNumber.split("-");
        StringBuilder uppercaseLetters = new StringBuilder();
        uppercaseLetters.append("Letters: ")
                .append(blocks[1].toUpperCase()).append("/")
                .append(blocks[3].toUpperCase()).append("/")
                .append(blocks[4].toUpperCase().charAt(0)).append("/")
                .append(blocks[4].toUpperCase().charAt(1));
        System.out.println(uppercaseLetters);
    }
}