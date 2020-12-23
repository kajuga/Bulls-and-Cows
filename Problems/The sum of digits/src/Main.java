import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int temp = 0;

        for (int i = 0; i < line.length(); i++) {
            temp += (line.charAt(i) - '0');
        }
        System.out.println(temp);
        // put your code here
        int z = 'z';
        char mystery = z - 10;
        System.out.println(mystery);
    }
}