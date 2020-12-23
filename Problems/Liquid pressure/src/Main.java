import java.util.Random;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

//    Scanner scanner = new Scanner(System.in);
//    // put your code here
//    double density = scanner.nextDouble();
//    double height = scanner.nextDouble();
//
//    double result = density*9.8*height;
//        System.out.println(result);
        Random random = new Random();

//        int x = random.nextInt(10, 100 + 1);

        int a = random.nextInt(100 - 10 + 1) + 10;

        int b= random.nextInt(10) + 100;

        int c = random.nextInt(100 - 10) + 10 + 1;

        int d = random.nextInt(100 - 10) + 10;

        System.out.println(a + " " + b + " " + c + " " + d);

}
}