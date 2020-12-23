import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> strings = new ArrayList<>();
        String sentence = null;

        while (sc.hasNextLine()) {
            sentence = sc.nextLine();
            if (sentence.equals("")) break;
            Scanner words = new Scanner(sentence);
            while (words.hasNext()) {
                strings.add(words.next());
            }
        }
        for (String str : strings) {
            System.out.println(str);
        }
    }
}