import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String numberElements = scanner.nextLine();
        int result = 0;

        for (int i = 0; i < Integer.parseInt(numberElements); i++) {
            int temp = Integer.parseInt(scanner.nextLine());
            if (temp < result && temp % 4 == 0) {
                result = temp;
            }
        }
        scanner.close();
        System.out.println(result);


    }

}