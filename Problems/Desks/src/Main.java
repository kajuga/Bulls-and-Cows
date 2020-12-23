import javax.crypto.spec.PSource;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int amount = 0;
        int summ = 0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            int temp = scanner.nextInt();
            amount = (temp / 2) + (temp % 2);
            summ += amount;
        }
        scanner.close();
        System.out.println(summ);
    }
}
