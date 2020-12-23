import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int diff = a -b;
        int rh = h - a;


        System.out.println(1 + rh / diff + (rh % diff + diff -1 )/ diff);
    }
}