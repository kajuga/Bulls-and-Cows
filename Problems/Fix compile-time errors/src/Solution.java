import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum=0;
        while (true) {
            String exit = reader.readLine();
            if (exit.equals("сумма")) {
                break;
            }
            int a = Integer.parseInt(reader.readLine());
            sum = sum + a;}
        System.out.println(sum);
    }
}