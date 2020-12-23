import java.util.HashSet;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
//        ((а + b)*n/2) - а - б
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        scanner.close();
        HashSet <Integer> digits = new HashSet<>();
        int min = Math.min(a,b);
        int max = Math.max(a,b);

        for (int i = min; i <=max ; i++) {
            if (i % 3 == 0) {
                digits.add(i);
            }
        }
        double summ = 0;
        for (int digit : digits) {
            summ +=digit;
        }

        System.out.println(summ / digits.size());

    }
}