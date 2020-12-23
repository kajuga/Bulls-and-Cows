import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        Random random = new Random(a + b);
        int result = 0;



        for (int i = 0; i < n; i++) {
            int z = random.nextInt(b - a + 1) + a;
//            System.out.print(z + " ");
            result += z;


        }
        // write your code here
        System.out.println(result);
    }
}