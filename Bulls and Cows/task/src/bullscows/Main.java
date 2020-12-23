package bullscows;


import java.security.SecureRandom;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    static int turnCounter = 0;
    static SecureRandom rnd = new SecureRandom();
    static final String AB = "0123456789abcdefghijklmnopqrstuvwxyz";
    static int sizeOfPossibleSymbols = 0;

    public static void main(String[] args) {
        System.out.println("Input the length of the secret code:");
        Scanner scan = new Scanner(System.in);
        int amount = 0;
        String line = scan.nextLine();

        if (isNumber(line)) {
            amount = Integer.parseInt(line);
        } else {
            System.out.println("\"" + line + "\"" + " isn't a valid number.");
        }
        if (amount == 0) {
            System.out.println("Error: minimum number of possible symbols in the code is 1 (0-9, a-z).");
            return;
        }
        if (amount > 36) {
            System.out.println("Error: maximum number of possible symbols in the code is 36 (0-9, a-z).");
            return;
        }

        System.out.println("Input the number of possible symbols in the code:");
        line = scan.nextLine();
        if (isNumber(line)) {
            sizeOfPossibleSymbols = Integer.parseInt(line);
        } else {
            System.out.println("\"" + line + "\"" + " isn't a valid number.");
        }

        if (sizeOfPossibleSymbols > 36) {
            System.out.println("Error: maximum number of possible symbols in the code is 36 (0-9, a-z).");
            return;
        }
        if (sizeOfPossibleSymbols < amount) {
            System.out.println("Error: it's not possible to generate a code with a length of 6 with 5 unique symbols.");
            return;
        }
        String secretCode = secretCodeCreator(amount, sizeOfPossibleSymbols);


        System.out.println("The secret is prepared: " + starsGenerator(amount) + ".");
        System.out.println("Okay, let's start a game!");
        boolean bingoAnswerChecker = true;

        while (bingoAnswerChecker) {
            System.out.printf("Turn %d:\n", ++turnCounter);

            int bullsCounter = 0;
            int cowCounter = 0;
            String answer = scan.nextLine();

            for (int i = 0; i < amount; i++) {
                if (answer.charAt(i) == secretCode.charAt(i)) {
                    bullsCounter++;
                }
                    int tempCowCounter = 0;
                for (int j = 0; j < amount; j++) {
                    if (secretCode.charAt(i) == answer.charAt(j)) {
                        tempCowCounter++;
                    }
                    if (tempCowCounter > 1) tempCowCounter = 1;
                }
                cowCounter += tempCowCounter;
            }

            cowCounter = cowCounter - bullsCounter;
            if (cowCounter < 0) {
                cowCounter *= -1;
            }

            if (bullsCounter == answer.length()) {
                bingoAnswerChecker = false;
                System.out.printf("Grade: %d bull(s).\n", bullsCounter);
                System.out.println("Congratulations! You guessed the secret code.");
            } else {
                if (bullsCounter == 0 && cowCounter == 0) {
                    System.out.printf("Grade: None.\n");
                    continue;
                }
                if (bullsCounter != 0 && cowCounter != 0) {
                    System.out.printf("Grade: %d bull(s) and %d cow(s).\n", bullsCounter, cowCounter);
                    continue;
                }
                if (bullsCounter != 0) {
                    System.out.printf("Grade: %d bull(s).\n", bullsCounter);
                    continue;
                }
                if (cowCounter != 0) {
                    System.out.printf("Grade: %d cow(s).\n", cowCounter);
                }
            }
        }
    }

    public static boolean isNumber(String str) {
        if (str == null || str.isEmpty()) return false;
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) return false;
        }
        return true;
    }



    public static String[] inputValidator (String str) {

        return null;
    }

    public static String integerValidator (int digit) {
        //TODO
        return null;
    }

    private static String starsGenerator(int amount) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < amount; i++) {
            stringBuilder.append("*");
        }
        stringBuilder.append(" (");
        if (sizeOfPossibleSymbols <= 10) {
            stringBuilder.append(AB.charAt(0)).append("-")
                    .append(AB.charAt(sizeOfPossibleSymbols -1)).append(")");
        }
        else {
            stringBuilder.append(AB.charAt(0)).append("-")
                    .append(AB.charAt(9)).append(", ")
                    .append(AB.charAt(10)).append("-")
                    .append(AB.charAt(sizeOfPossibleSymbols - 1)).append(").");
        }
        System.out.println(stringBuilder.toString());
        return stringBuilder.toString();
    }

    private static String secretCodeCreator(int amount, int sizeOfPossibleSymbols) {
        StringBuilder sb = new StringBuilder();
        Set<Character> passChar = new HashSet<>(sizeOfPossibleSymbols);
        for (int i = 0; i < amount; i++) {
            while (passChar.size() != sizeOfPossibleSymbols) {
                passChar.add(AB.charAt(rnd.nextInt(AB.length())));
//                passChar.add(AB.charAt(rnd.nextInt(AB.length() - 1)));
            }
        }
        for (Character cha: passChar) {
            sb.append(cha);
        }
        return sb.toString().substring(0, amount);
    }
}


