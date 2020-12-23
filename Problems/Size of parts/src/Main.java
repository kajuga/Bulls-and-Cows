import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here


            Scanner scanner = new Scanner(System.in);
            int numerOfParts = scanner.nextInt();
            int readyToShip = 0;
            int needToBeFixed = 0;
            int rejected = 0;

            for (int i = 1; i <= numerOfParts; i++) {
                int detectorResponse = scanner.nextInt();

                if (detectorResponse == 1) {
                    needToBeFixed++;
                } else if (detectorResponse == -1) {
                    rejected++;
                } else {
                    readyToShip++;
                }
            }
            System.out.println(readyToShip + " " + needToBeFixed + " " + rejected);
        }
    }
