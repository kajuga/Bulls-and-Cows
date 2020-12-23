import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int squirrels = Integer.parseInt(scanner.nextLine());
        int nuts = Integer.parseInt(scanner.nextLine());

        System.out.println(nuts % squirrels);
        // put your code here
    }
}