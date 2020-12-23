import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temp = scanner.nextInt();
        if (temp % 2 != 0) {
            System.out.println(++temp);
        } else {
            System.out.println(temp + 2);
        }
        // put your code here
    }
}