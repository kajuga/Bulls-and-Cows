import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int days = scanner.nextInt();
        int foodCost = scanner.nextInt();
        int fly = scanner.nextInt();
        int costOneNight = scanner.nextInt();
        System.out.println(vacationSummary(days, foodCost, fly, costOneNight));



    }

    static int vacationSummary(int days, int foodCost, int flyCost, int oneNightCost) {

        return ((days * foodCost) + (oneNightCost * (days - 1)) + 2 * flyCost);
    }
}