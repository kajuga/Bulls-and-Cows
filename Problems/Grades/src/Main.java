import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner=  new Scanner(System.in);
        int countStudents = Integer.parseInt(scanner.nextLine());
        int[] grades = new int[6];
        for (int i = 0; i < countStudents; i++) {
            grades[Integer.parseInt(scanner.nextLine())]++;
        }

        System.out.printf("%d %d %d %d", grades[2], grades[3], grades[4], grades[5]);
    }


}