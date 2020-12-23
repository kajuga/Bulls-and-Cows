import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int numberInputs = Integer.parseInt(scanner.nextLine());
        int summ = 0;
        for (int i = 0; i < numberInputs; i++) {
            int temp = Integer.parseInt(scanner.nextLine());
            if (temp % 6 == 0) {
                summ += temp;
            }
        }
        System.out.println(summ);
    }
}