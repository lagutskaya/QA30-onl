package HomeWorks.HW10;

public class DocumentValidator {
    public static void validateDocument(String documentNumber) {

        if (documentNumber.toLowerCase().contains("abc")) {
            System.out.println("Документ содержит последовательность abc");
        } else {
            System.out.println("Документ не содержит последовательность abc");
        }

        if (documentNumber.startsWith("666")) {
            System.out.println("Документ начинается с последовательности 666");
        } else {
            System.out.println("Документ не начинается с последовательности 666");
        }

        if (documentNumber.endsWith("1a2b")) {
            System.out.println("Документ заканчивается на последовательность 1a2b");
        } else {
            System.out.println("Документ не заканчивается на последовательность 1a2b");
        }
    }
}