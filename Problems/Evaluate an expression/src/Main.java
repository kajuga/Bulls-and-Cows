import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        System.out.println(Double.parseDouble(scanner.nextLine()) * 10.5
                + Double.parseDouble(scanner.nextLine()) * 4.4
                + (Double.parseDouble(scanner.nextLine()) + Double.parseDouble(scanner.nextLine())) / 2.2);
    }
}