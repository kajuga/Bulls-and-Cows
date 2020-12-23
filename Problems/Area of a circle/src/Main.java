import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();
        double area = Math.PI * (radius * radius);
        System.out.println(area);
//        double circumference= Math.PI * 2 * radius;
//        System.out.println(circumference) ;
    }
}